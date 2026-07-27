package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFc1oSDK {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    public final Map<String, Object> AFInAppEventParameterName;
    public final AFc1kSDK values;

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AFc1oSDK valueOf(AFa1qSDK aFa1qSDK) {
            Intrinsics.checkNotNullParameter(aFa1qSDK, "");
            Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            return new AFc1oSDK(AFInAppEventParameterName, null, 2, 0 == true ? 1 : 0);
        }

        public static AFc1oSDK values(AFc1kSDK aFc1kSDK) {
            Intrinsics.checkNotNullParameter(aFc1kSDK, "");
            return new AFc1oSDK(new LinkedHashMap(), aFc1kSDK, null);
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1kSDK aFc1kSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1kSDK);
    }

    public static final AFc1oSDK AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        return AFa1uSDK.valueOf(aFa1qSDK);
    }

    public static final AFc1oSDK AFKeystoreWrapper(AFc1kSDK aFc1kSDK) {
        return AFa1uSDK.values(aFc1kSDK);
    }

    private AFc1oSDK(Map<String, Object> map, AFc1kSDK aFc1kSDK) {
        this.AFInAppEventParameterName = map;
        this.values = aFc1kSDK;
    }

    public final void AFKeystoreWrapper(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventParameterName.put(str, obj);
        AFc1kSDK aFc1kSDK = this.values;
        if (aFc1kSDK != null) {
            aFc1kSDK.values(this.AFInAppEventParameterName);
        }
    }

    public final boolean AFKeystoreWrapper(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AFInAppEventParameterName.containsKey(str);
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1kSDK aFc1kSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i2 & 2) != 0 ? null : aFc1kSDK);
    }
}
