package B2;

import A6.y;
import c6.n;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.collections.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.StringsKt;
import l6.f;
import l6.l;

/* loaded from: classes.dex */
public final class c implements e, g {
    public static final a Companion = new a(null);
    private static final Set<String> localFeatureOverrides = C.f6117d;
    private final com.onesignal.core.internal.config.c configModelStore;
    private volatile Map<B2.b, Boolean> featureStates;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends p implements Function1 {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Map.Entry<? extends B2.b, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }
    }

    /* renamed from: B2.c$c, reason: collision with other inner class name */
    public static final class C0000c extends p implements Function1 {
        public static final C0000c INSTANCE = new C0000c();

        public C0000c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Map.Entry<? extends B2.b, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getKey().getKey();
        }
    }

    public c(com.onesignal.core.internal.config.c configModelStore) {
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        this.configModelStore = configModelStore;
        this.featureStates = I.c();
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager initializing from cached config features", null, 2, null);
        try {
            refreshEnabledFeatures((com.onesignal.core.internal.config.b) configModelStore.getModel(), true);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to initialize feature states from cached config", th);
        }
        this.configModelStore.subscribe((g) this);
    }

    private final void applySideEffects(B2.b bVar, boolean z7) {
        if (d.$EnumSwitchMapping$1[bVar.ordinal()] != 1) {
            return;
        }
        com.onesignal.common.threading.c.INSTANCE.updateUseBackgroundThreading(z7, "FeatureManager:" + bVar.getActivationMode());
    }

    private final String canonicalizeFeatureKey(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(Character.toLowerCase(str.charAt(i2)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final void refreshEnabledFeatures(com.onesignal.core.internal.config.b bVar, boolean z7) {
        List<String> sdkRemoteFeatureFlags = bVar.getSdkRemoteFeatureFlags();
        ArrayList arrayList = new ArrayList(s.g(sdkRemoteFeatureFlags, 10));
        Iterator<T> it = sdkRemoteFeatureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(canonicalizeFeatureKey((String) it.next()));
        }
        Set<String> set = localFeatureOverrides;
        ArrayList arrayList2 = new ArrayList(s.g(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(canonicalizeFeatureKey((String) it2.next()));
        }
        Set<String> C7 = CollectionsKt.C(CollectionsKt.u(arrayList, arrayList2));
        Set<String> set2 = localFeatureOverrides;
        if (!set2.isEmpty()) {
            com.onesignal.debug.internal.logging.b.warn$default("OneSignal: Local feature override enabled for testing only: " + set2, null, 2, null);
        }
        LinkedHashMap j = I.j(this.featureStates);
        for (B2.b bVar2 : B2.b.getEntries()) {
            boolean isEnabledIn = bVar2.isEnabledIn(C7);
            int i2 = d.$EnumSwitchMapping$0[bVar2.getActivationMode().ordinal()];
            if (i2 == 1) {
                j.put(bVar2, Boolean.valueOf(isEnabledIn));
                applySideEffects(bVar2, isEnabledIn);
            } else if (i2 == 2) {
                boolean containsKey = j.containsKey(bVar2);
                if (z7 || !containsKey) {
                    j.put(bVar2, Boolean.valueOf(isEnabledIn));
                    applySideEffects(bVar2, isEnabledIn);
                } else {
                    Boolean bool = (Boolean) j.get(bVar2);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (booleanValue != isEnabledIn) {
                        com.onesignal.debug.internal.logging.b.info$default("OneSignal: Feature " + bVar2.getKey() + " changed remotely to " + isEnabledIn + " but is NEXT_RUN, keeping current run value=" + booleanValue, null, 2, null);
                    }
                }
            }
        }
        this.featureStates = j;
    }

    @Override // B2.e
    public List<String> enabledFeatureKeys() {
        Set<Map.Entry<B2.b, Boolean>> entrySet = this.featureStates.entrySet();
        Intrinsics.checkNotNullParameter(entrySet, "<this>");
        n nVar = new n(2, entrySet);
        b predicate = b.INSTANCE;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        f fVar = new f(nVar, true, predicate);
        C0000c transform = C0000c.INSTANCE;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return l.b(new l6.n(fVar, transform));
    }

    @Override // B2.e
    public boolean isEnabled(B2.b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Boolean bool = this.featureStates.get(feature);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "sdkRemoteFeatureFlags") || Intrinsics.a(args.getProperty(), "sdkRemoteFeatureFlagMetadata")) {
            com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager.onModelUpdated(property=" + args.getProperty() + ", tag=" + tag + ')', null, 2, null);
            try {
                refreshEnabledFeatures((com.onesignal.core.internal.config.b) this.configModelStore.getModel(), false);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to refresh features on model update", th);
            }
        }
    }

    @Override // B2.e
    public Map<String, y> remoteFeatureFlagMetadata() {
        String sdkRemoteFeatureFlagMetadata = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getSdkRemoteFeatureFlagMetadata();
        if (sdkRemoteFeatureFlagMetadata == null || StringsKt.z(sdkRemoteFeatureFlagMetadata)) {
            return null;
        }
        return com.onesignal.core.internal.backend.impl.b.INSTANCE.parseStoredMetadataMap(sdkRemoteFeatureFlagMetadata);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: FeatureManager.onModelReplaced(tag=" + tag + ')', null, 2, null);
        if (Intrinsics.a(tag, "HYDRATE") || Intrinsics.a(tag, "NORMAL")) {
            try {
                refreshEnabledFeatures(model, false);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("OneSignal: Failed to refresh features on model replace", th);
            }
        }
    }
}
