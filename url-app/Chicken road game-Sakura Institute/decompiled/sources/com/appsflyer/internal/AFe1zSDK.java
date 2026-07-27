package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFe1zSDK {
    public static boolean AFInAppEventType(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int valueOf = AFc1rSDK.valueOf(str);
        int valueOf2 = AFc1rSDK.valueOf(str2);
        Pair<Integer, Integer> values = AFe1vSDK.values(str2);
        Pair<Integer, Integer> valueOf3 = AFe1vSDK.valueOf(str2);
        return (valueOf2 == -1 || values != null) ? valueOf3 != null ? ((Number) valueOf3.f7485d).intValue() <= valueOf && valueOf <= ((Number) valueOf3.f7486e).intValue() : values != null && ((Number) values.f7485d).intValue() <= valueOf && valueOf <= ((Number) values.f7486e).intValue() : valueOf2 == valueOf;
    }
}
