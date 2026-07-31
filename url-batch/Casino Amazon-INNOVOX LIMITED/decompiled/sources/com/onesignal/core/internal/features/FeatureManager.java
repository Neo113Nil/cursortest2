package com.onesignal.core.internal.features;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.backend.impl.FeatureFlagsJsonParser;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.debug.internal.logging.Logging;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonObject;

/* compiled from: FeatureManager.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0016\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/onesignal/core/internal/features/FeatureManager;", "Lcom/onesignal/core/internal/features/IFeatureManager;", "Lcom/onesignal/common/modeling/ISingletonModelStoreChangeHandler;", "Lcom/onesignal/core/internal/config/ConfigModel;", "configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "(Lcom/onesignal/core/internal/config/ConfigModelStore;)V", "featureStates", "", "Lcom/onesignal/core/internal/features/FeatureFlag;", "", "applySideEffects", "", "feature", ViewProps.ENABLED, "canonicalizeFeatureKey", "", "key", "enabledFeatureKeys", "", "isEnabled", "onModelReplaced", CommonUrlParts.MODEL, "tag", "onModelUpdated", "args", "Lcom/onesignal/common/modeling/ModelChangedArgs;", "refreshEnabledFeatures", "applyNextRunOnlyFeatures", "remoteFeatureFlagMetadata", "Lkotlinx/serialization/json/JsonObject;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureManager implements IFeatureManager, ISingletonModelStoreChangeHandler<ConfigModel> {
    private static final Set<String> localFeatureOverrides = SetsKt.emptySet();
    private final ConfigModelStore configModelStore;
    private volatile Map<FeatureFlag, Boolean> featureStates;

    /* compiled from: FeatureManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FeatureActivationMode.values().length];
            try {
                iArr[FeatureActivationMode.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureActivationMode.APP_STARTUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FeatureFlag.values().length];
            try {
                iArr2[FeatureFlag.SDK_IDENTITY_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FeatureManager(ConfigModelStore configModelStore) {
        Intrinsics.checkNotNullParameter(configModelStore, "configModelStore");
        this.configModelStore = configModelStore;
        this.featureStates = MapsKt.emptyMap();
        Logging.debug$default("OneSignal: FeatureManager initializing from cached config features", null, 2, null);
        try {
            refreshEnabledFeatures(configModelStore.getModel(), true);
        } catch (Throwable th) {
            Logging.error("OneSignal: Failed to initialize feature states from cached config", th);
        }
        this.configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
    }

    @Override // com.onesignal.core.internal.features.IFeatureManager
    public boolean isEnabled(FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Boolean bool = this.featureStates.get(feature);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.onesignal.core.internal.features.IFeatureManager
    public List<String> enabledFeatureKeys() {
        return SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.featureStates.entrySet()), new Function1<Map.Entry<? extends FeatureFlag, ? extends Boolean>, Boolean>() { // from class: com.onesignal.core.internal.features.FeatureManager$enabledFeatureKeys$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Map.Entry<? extends FeatureFlag, Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends FeatureFlag, ? extends Boolean> entry) {
                return invoke2((Map.Entry<? extends FeatureFlag, Boolean>) entry);
            }
        }), new Function1<Map.Entry<? extends FeatureFlag, ? extends Boolean>, String>() { // from class: com.onesignal.core.internal.features.FeatureManager$enabledFeatureKeys$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Map.Entry<? extends FeatureFlag, ? extends Boolean> entry) {
                return invoke2((Map.Entry<? extends FeatureFlag, Boolean>) entry);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String invoke2(Map.Entry<? extends FeatureFlag, Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getKey().getKey();
            }
        }));
    }

    @Override // com.onesignal.core.internal.features.IFeatureManager
    public Map<String, JsonObject> remoteFeatureFlagMetadata() {
        String sdkRemoteFeatureFlagMetadata = this.configModelStore.getModel().getSdkRemoteFeatureFlagMetadata();
        String str = sdkRemoteFeatureFlagMetadata;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return FeatureFlagsJsonParser.INSTANCE.parseStoredMetadataMap(sdkRemoteFeatureFlagMetadata);
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logging.debug$default("OneSignal: FeatureManager.onModelReplaced(tag=" + tag + ')', null, 2, null);
        if (Intrinsics.areEqual(tag, ModelChangeTags.HYDRATE) || Intrinsics.areEqual(tag, ModelChangeTags.NORMAL)) {
            try {
                refreshEnabledFeatures(model, false);
            } catch (Throwable th) {
                Logging.error("OneSignal: Failed to refresh features on model replace", th);
            }
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(args.getProperty(), "sdkRemoteFeatureFlags") || Intrinsics.areEqual(args.getProperty(), "sdkRemoteFeatureFlagMetadata")) {
            Logging.debug$default("OneSignal: FeatureManager.onModelUpdated(property=" + args.getProperty() + ", tag=" + tag + ')', null, 2, null);
            try {
                refreshEnabledFeatures(this.configModelStore.getModel(), false);
            } catch (Throwable th) {
                Logging.error("OneSignal: Failed to refresh features on model update", th);
            }
        }
    }

    private final void refreshEnabledFeatures(ConfigModel model, boolean applyNextRunOnlyFeatures) {
        List<String> sdkRemoteFeatureFlags = model.getSdkRemoteFeatureFlags();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sdkRemoteFeatureFlags, 10));
        Iterator<T> it = sdkRemoteFeatureFlags.iterator();
        while (it.hasNext()) {
            arrayList.add(canonicalizeFeatureKey((String) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        Set<String> set = localFeatureOverrides;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(canonicalizeFeatureKey((String) it2.next()));
        }
        Set<String> set2 = CollectionsKt.toSet(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3));
        Set<String> set3 = localFeatureOverrides;
        if (!set3.isEmpty()) {
            Logging.warn$default("OneSignal: Local feature override enabled for testing only: " + set3, null, 2, null);
        }
        Map<FeatureFlag, Boolean> mutableMap = MapsKt.toMutableMap(this.featureStates);
        for (FeatureFlag featureFlag : FeatureFlag.getEntries()) {
            boolean isEnabledIn = featureFlag.isEnabledIn(set2);
            int i = WhenMappings.$EnumSwitchMapping$0[featureFlag.getActivationMode().ordinal()];
            if (i == 1) {
                mutableMap.put(featureFlag, Boolean.valueOf(isEnabledIn));
                applySideEffects(featureFlag, isEnabledIn);
            } else if (i == 2) {
                boolean containsKey = mutableMap.containsKey(featureFlag);
                if (applyNextRunOnlyFeatures || !containsKey) {
                    mutableMap.put(featureFlag, Boolean.valueOf(isEnabledIn));
                    applySideEffects(featureFlag, isEnabledIn);
                } else {
                    Boolean bool = mutableMap.get(featureFlag);
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (booleanValue != isEnabledIn) {
                        Logging.info$default("OneSignal: Feature " + featureFlag.getKey() + " changed remotely to " + isEnabledIn + " but is NEXT_RUN, keeping current run value=" + booleanValue, null, 2, null);
                    }
                }
            }
        }
        this.featureStates = mutableMap;
    }

    private final String canonicalizeFeatureKey(String key) {
        StringBuilder sb = new StringBuilder(key.length());
        int length = key.length();
        for (int i = 0; i < length; i++) {
            sb.append(Character.toLowerCase(key.charAt(i)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final void applySideEffects(FeatureFlag feature, boolean enabled) {
        int i = WhenMappings.$EnumSwitchMapping$1[feature.ordinal()];
    }
}
