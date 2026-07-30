package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFe1zSDK {
    public static boolean AFInAppEventType(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int valueOf = AFc1rSDK.valueOf(str);
        int valueOf2 = AFc1rSDK.valueOf(str2);
        Pair<Integer, Integer> values = AFe1vSDK.values(str2);
        Pair<Integer, Integer> valueOf3 = AFe1vSDK.valueOf(str2);
        return (valueOf2 == -1 || values != null) ? valueOf3 != null ? valueOf3.getFirst().intValue() <= valueOf && valueOf <= valueOf3.getSecond().intValue() : values != null && values.getFirst().intValue() <= valueOf && valueOf <= values.getSecond().intValue() : valueOf2 == valueOf;
    }
}
