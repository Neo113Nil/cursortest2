package com.withpersona.sdk2.inquiry.featureflag;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.SavedStateHandle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class FeatureFlagManager {
    public volatile Map cache;
    public final LinkedHashMap defaultFeatureFlagMap;
    public final SharedPreferences featureFlagPrefs;
    public final SavedStateHandle savedStateHandle;

    public FeatureFlagManager(Set set, Context context, SavedStateHandle savedStateHandle) {
        set.getClass();
        context.getClass();
        savedStateHandle.getClass();
        this.savedStateHandle = savedStateHandle;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.cache = emptyMap;
        this.featureFlagPrefs = context.getSharedPreferences("com.withpersona.sdk2.feature_flag_prefs", 0);
        Set set2 = set;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Object obj : set2) {
            linkedHashMap.put(((TipsFeatureFlag) obj).getKey(), obj);
        }
        this.defaultFeatureFlagMap = linkedHashMap;
        Object obj2 = this.savedStateHandle.get("FeatureFlagManager.cache");
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (map != null) {
            this.cache = map;
        }
    }

    public final boolean getValue(TipsFeatureFlag tipsFeatureFlag) {
        tipsFeatureFlag.getClass();
        String string2 = this.featureFlagPrefs.getString(tipsFeatureFlag.getKey(), "nil");
        if (!StringsKt__StringsJVMKt.contentEquals(string2, "nil")) {
            return Intrinsics.areEqual(string2, "true");
        }
        Boolean bool = (Boolean) this.cache.get(tipsFeatureFlag.getKey());
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = ((TipsFeatureFlag) this.defaultFeatureFlagMap.get(tipsFeatureFlag.getKey())) != null ? Boolean.FALSE : null;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }
}
