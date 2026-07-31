package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFd1dSDK {
    public static boolean AFInAppEventType(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int AFInAppEventParameterName = AFc1tSDK.AFInAppEventParameterName(str);
        int AFInAppEventParameterName2 = AFc1tSDK.AFInAppEventParameterName(str2);
        Pair<Integer, Integer> AFKeystoreWrapper = AFe1zSDK.AFKeystoreWrapper(str2);
        Pair<Integer, Integer> AFInAppEventType = AFe1zSDK.AFInAppEventType(str2);
        return (AFInAppEventParameterName2 == -1 || AFKeystoreWrapper != null) ? AFInAppEventType != null ? AFInAppEventType.getFirst().intValue() <= AFInAppEventParameterName && AFInAppEventParameterName <= AFInAppEventType.getSecond().intValue() : AFKeystoreWrapper != null && AFKeystoreWrapper.getFirst().intValue() <= AFInAppEventParameterName && AFInAppEventParameterName <= AFKeystoreWrapper.getSecond().intValue() : AFInAppEventParameterName2 == AFInAppEventParameterName;
    }
}
