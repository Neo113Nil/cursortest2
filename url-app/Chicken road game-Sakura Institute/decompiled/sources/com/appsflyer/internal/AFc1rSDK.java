package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.t;

/* loaded from: classes.dex */
public final class AFc1rSDK {
    public static final int valueOf(String str) {
        String str2;
        Integer f4;
        String str3;
        Integer f5;
        String str4;
        Integer f6;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.j a4 = new Regex("(\\d+).(\\d+).(\\d+).*").a(str);
        if (a4 == null) {
            return -1;
        }
        kotlin.text.i iVar = a4.f7539c;
        MatchGroup h4 = iVar.h(1);
        int i2 = 0;
        int intValue = ((h4 == null || (str4 = h4.f7512a) == null || (f6 = t.f(str4)) == null) ? 0 : f6.intValue()) * 1000000;
        MatchGroup h5 = iVar.h(2);
        int intValue2 = (((h5 == null || (str3 = h5.f7512a) == null || (f5 = t.f(str3)) == null) ? 0 : f5.intValue()) * 1000) + intValue;
        MatchGroup h6 = iVar.h(3);
        if (h6 != null && (str2 = h6.f7512a) != null && (f4 = t.f(str2)) != null) {
            i2 = f4.intValue();
        }
        return intValue2 + i2;
    }
}
