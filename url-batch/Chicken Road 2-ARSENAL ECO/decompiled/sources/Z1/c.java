package Z1;

import E5.h;
import U5.x;
import com.onesignal.common.modeling.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.AbstractC0500d;
import l5.AbstractC0506j;
import l5.AbstractC0508l;
import l5.q;
import l5.r;
import l5.t;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c implements e, g {
    public static final a Companion = new a(null);
    private static final Set<String> localFeatureOverrides = r.f5305f;
    private final com.onesignal.core.internal.config.c configModelStore;
    private volatile Map<Z1.b, Boolean> featureStates;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends j implements InterfaceC0743l {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final Boolean invoke(Map.Entry<? extends Z1.b, Boolean> it) {
            i.e(it, "it");
            return it.getValue();
        }
    }

    /* renamed from: Z1.c$c, reason: collision with other inner class name */
    public static final class C0003c extends j implements InterfaceC0743l {
        public static final C0003c INSTANCE = new C0003c();

        public C0003c() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public final String invoke(Map.Entry<? extends Z1.b, Boolean> it) {
            i.e(it, "it");
            return it.getKey().getKey();
        }
    }

    public c(com.onesignal.core.internal.config.c configModelStore) {
        i.e(configModelStore, "configModelStore");
        this.configModelStore = configModelStore;
        this.featureStates = q.f5304f;
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager initializing from cached config features", null, 2, null);
        try {
            refreshEnabledFeatures((com.onesignal.core.internal.config.b) configModelStore.getModel(), true);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to initialize feature states from cached config", th);
        }
        this.configModelStore.subscribe((g) this);
    }

    private final void applySideEffects(Z1.b bVar, boolean z5) {
        int i7 = d.$EnumSwitchMapping$1[bVar.ordinal()];
    }

    private final String canonicalizeFeatureKey(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            sb.append(Character.toLowerCase(str.charAt(i7)));
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    private final void refreshEnabledFeatures(com.onesignal.core.internal.config.b bVar, boolean z5) {
        List<String> sdkRemoteFeatureFlags = bVar.getSdkRemoteFeatureFlags();
        ArrayList arrayList = new ArrayList(AbstractC0508l.C(sdkRemoteFeatureFlags, 10));
        Iterator<T> it = sdkRemoteFeatureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(canonicalizeFeatureKey((String) it.next()));
        }
        Set<String> set = localFeatureOverrides;
        ArrayList arrayList2 = new ArrayList(AbstractC0508l.C(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(canonicalizeFeatureKey((String) it2.next()));
        }
        Set<String> T6 = AbstractC0506j.T(AbstractC0506j.K(arrayList, arrayList2));
        Set<String> set2 = localFeatureOverrides;
        if (!set2.isEmpty()) {
            com.onesignal.debug.internal.logging.b.warn$default("OneSignal: Local feature override enabled for testing only: " + set2, null, 2, null);
        }
        LinkedHashMap v02 = t.v0(this.featureStates);
        AbstractC0500d abstractC0500d = (AbstractC0500d) Z1.b.getEntries();
        abstractC0500d.getClass();
        R5.g gVar = new R5.g(6, abstractC0500d);
        while (gVar.hasNext()) {
            Z1.b bVar2 = (Z1.b) gVar.next();
            boolean isEnabledIn = bVar2.isEnabledIn(T6);
            int i7 = d.$EnumSwitchMapping$0[bVar2.getActivationMode().ordinal()];
            if (i7 == 1) {
                v02.put(bVar2, Boolean.valueOf(isEnabledIn));
                applySideEffects(bVar2, isEnabledIn);
            } else if (i7 == 2) {
                boolean containsKey = v02.containsKey(bVar2);
                if (z5 || !containsKey) {
                    v02.put(bVar2, Boolean.valueOf(isEnabledIn));
                    applySideEffects(bVar2, isEnabledIn);
                } else {
                    Boolean bool = (Boolean) v02.get(bVar2);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (booleanValue != isEnabledIn) {
                        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Feature " + bVar2.getKey() + " changed remotely to " + isEnabledIn + " but is NEXT_RUN, keeping current run value=" + booleanValue, null, 2, null);
                    }
                }
            }
        }
        this.featureStates = v02;
    }

    @Override // Z1.e
    public List<String> enabledFeatureKeys() {
        Set<Map.Entry<Z1.b, Boolean>> entrySet = this.featureStates.entrySet();
        i.e(entrySet, "<this>");
        h hVar = new h(1, entrySet);
        b predicate = b.INSTANCE;
        i.e(predicate, "predicate");
        E5.e eVar = new E5.e(hVar, predicate);
        C0003c transform = C0003c.INSTANCE;
        i.e(transform, "transform");
        return E5.g.C(new E5.e(eVar, transform));
    }

    @Override // Z1.e
    public boolean isEnabled(Z1.b feature) {
        i.e(feature, "feature");
        Boolean bool = this.featureStates.get(feature);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        if (i.a(args.getProperty(), "sdkRemoteFeatureFlags") || i.a(args.getProperty(), "sdkRemoteFeatureFlagMetadata")) {
            com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager.onModelUpdated(property=" + args.getProperty() + ", tag=" + tag + ')', null, 2, null);
            try {
                refreshEnabledFeatures((com.onesignal.core.internal.config.b) this.configModelStore.getModel(), false);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to refresh features on model update", th);
            }
        }
    }

    @Override // Z1.e
    public Map<String, x> remoteFeatureFlagMetadata() {
        String sdkRemoteFeatureFlagMetadata = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getSdkRemoteFeatureFlagMetadata();
        if (sdkRemoteFeatureFlagMetadata == null || F5.j.T(sdkRemoteFeatureFlagMetadata)) {
            return null;
        }
        return com.onesignal.core.internal.backend.impl.b.INSTANCE.parseStoredMetadataMap(sdkRemoteFeatureFlagMetadata);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager.onModelReplaced(tag=" + tag + ')', null, 2, null);
        if (tag.equals("HYDRATE") || tag.equals("NORMAL")) {
            try {
                refreshEnabledFeatures(model, false);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to refresh features on model replace", th);
            }
        }
    }
}
