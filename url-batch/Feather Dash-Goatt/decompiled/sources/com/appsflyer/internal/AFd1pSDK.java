package com.appsflyer.internal;

import defpackage.a0;
import defpackage.kk0;
import defpackage.y9;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static final String AFAdRevenueData(String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(String str) {
        String str2;
        String str3;
        String str4;
        str.getClass();
        kk0 b = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").b(str);
        if (b != null) {
            a0 a0Var = b.c;
            MatchGroup b2 = a0Var.b(1);
            Integer intOrNull = (b2 == null || (str4 = b2.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup b3 = a0Var.b(3);
            Integer intOrNull2 = (b3 == null || (str3 = b3.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup b4 = a0Var.b(4);
            Integer intOrNull3 = (b4 == null || (str2 = b4.a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getMediationNetwork(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        kk0 b = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").b(str);
        if (b != null) {
            a0 a0Var = b.c;
            MatchGroup b2 = a0Var.b(1);
            Integer intOrNull = (b2 == null || (str7 = b2.a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup b3 = a0Var.b(2);
            Integer intOrNull2 = (b3 == null || (str6 = b3.a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup b4 = a0Var.b(3);
            Integer intOrNull3 = (b4 == null || (str5 = b4.a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup b5 = a0Var.b(4);
            Integer intOrNull4 = (b5 == null || (str4 = b5.a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup b6 = a0Var.b(5);
            Integer intOrNull5 = (b6 == null || (str3 = b6.a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup b7 = a0Var.b(6);
            Integer intOrNull6 = (b7 == null || (str2 = b7.a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                intOrNull.getClass();
                int intValue = intOrNull.intValue() * 1000000;
                intOrNull2.getClass();
                int intValue2 = (intOrNull2.intValue() * 1000) + intValue;
                intOrNull3.getClass();
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                intOrNull4.getClass();
                int intValue3 = intOrNull4.intValue() * 1000000;
                intOrNull5.getClass();
                int intValue4 = (intOrNull5.intValue() * 1000) + intValue3;
                num.getClass();
                return new Pair<>(valueOf, Integer.valueOf(num.intValue() + intValue4));
            }
        }
        return null;
    }

    private static boolean getRevenue(Object... objArr) {
        objArr.getClass();
        return !y9.i(objArr, null);
    }

    public static final String getMediationNetwork(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String str3 = "";
        for (byte b : digest) {
            str3 = str3.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return str3;
    }
}
