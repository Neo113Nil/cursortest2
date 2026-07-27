package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.t;
import z2.C1439w;

/* loaded from: classes.dex */
public final class AFe1vSDK {
    public static final String AFKeystoreWrapper(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b4 : digest) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b4)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            sb.append(format);
            str3 = sb.toString();
        }
        return str3;
    }

    public static final Pair<Integer, Integer> valueOf(String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.j a4 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").a(str);
        if (a4 != null) {
            kotlin.text.i iVar = a4.f7539c;
            MatchGroup h4 = iVar.h(1);
            Integer f4 = (h4 == null || (str4 = h4.f7512a) == null) ? null : t.f(str4);
            MatchGroup h5 = iVar.h(3);
            Integer f5 = (h5 == null || (str3 = h5.f7512a) == null) ? null : t.f(str3);
            MatchGroup h6 = iVar.h(4);
            Integer f6 = (h6 == null || (str2 = h6.f7512a) == null) ? null : t.f(str2);
            if (f4 != null) {
                return new Pair<>(Integer.valueOf(f4.intValue() * 1000000), Integer.valueOf(((f4.intValue() + 1) * 1000000) - 1));
            }
            if (f5 != null && f6 != null) {
                return new Pair<>(Integer.valueOf((f6.intValue() * 1000) + (f5.intValue() * 1000000)), Integer.valueOf((((f6.intValue() + 1) * 1000) + (f5.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> values(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.j a4 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").a(str);
        if (a4 != null) {
            kotlin.text.i iVar = a4.f7539c;
            MatchGroup h4 = iVar.h(1);
            Integer f4 = (h4 == null || (str7 = h4.f7512a) == null) ? null : t.f(str7);
            MatchGroup h5 = iVar.h(2);
            Integer f5 = (h5 == null || (str6 = h5.f7512a) == null) ? null : t.f(str6);
            MatchGroup h6 = iVar.h(3);
            Integer f6 = (h6 == null || (str5 = h6.f7512a) == null) ? null : t.f(str5);
            MatchGroup h7 = iVar.h(4);
            Integer f7 = (h7 == null || (str4 = h7.f7512a) == null) ? null : t.f(str4);
            MatchGroup h8 = iVar.h(5);
            Integer f8 = (h8 == null || (str3 = h8.f7512a) == null) ? null : t.f(str3);
            MatchGroup h9 = iVar.h(6);
            Integer f9 = (h9 == null || (str2 = h9.f7512a) == null) ? null : t.f(str2);
            if (values(f4, f5, f6, f7, f8, f9)) {
                Intrinsics.c(f4);
                int intValue = f4.intValue() * 1000000;
                Intrinsics.c(f5);
                int intValue2 = (f5.intValue() * 1000) + intValue;
                Intrinsics.c(f6);
                Integer valueOf = Integer.valueOf(f6.intValue() + intValue2);
                Intrinsics.c(f7);
                int intValue3 = f7.intValue() * 1000000;
                Intrinsics.c(f8);
                int intValue4 = (f8.intValue() * 1000) + intValue3;
                Intrinsics.c(f9);
                return new Pair<>(valueOf, Integer.valueOf(f9.intValue() + intValue4));
            }
        }
        return null;
    }

    private static boolean values(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !C1439w.r(objArr, null);
    }
}
