package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.w;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static final Pair<Integer, Integer> AFAdRevenueData(String str) {
        String str2;
        String str3;
        String str4;
        str.getClass();
        a1.n b10 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").b(str);
        if (b10 != null) {
            kotlin.collections.i iVar = (kotlin.collections.i) b10.f42r;
            MatchGroup c10 = iVar.c(1);
            Integer intOrNull = (c10 == null || (str4 = c10.f5604a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup c11 = iVar.c(3);
            Integer intOrNull2 = (c11 == null || (str3 = c11.f5604a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup c12 = iVar.c(4);
            Integer intOrNull3 = (c12 == null || (str2 = c12.f5604a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final String getCurrencyIso4217Code(String str) {
        str.getClass();
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getMonetizationNetwork(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        str.getClass();
        a1.n b10 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").b(str);
        if (b10 != null) {
            kotlin.collections.i iVar = (kotlin.collections.i) b10.f42r;
            MatchGroup c10 = iVar.c(1);
            Integer intOrNull = (c10 == null || (str7 = c10.f5604a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup c11 = iVar.c(2);
            Integer intOrNull2 = (c11 == null || (str6 = c11.f5604a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup c12 = iVar.c(3);
            Integer intOrNull3 = (c12 == null || (str5 = c12.f5604a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup c13 = iVar.c(4);
            Integer intOrNull4 = (c13 == null || (str4 = c13.f5604a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup c14 = iVar.c(5);
            Integer intOrNull5 = (c14 == null || (str3 = c14.f5604a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup c15 = iVar.c(6);
            Integer intOrNull6 = (c15 == null || (str2 = c15.f5604a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (AFAdRevenueData(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
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

    public static final String AFAdRevenueData(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        String str3 = "";
        for (byte b10 : digest) {
            str3 = str3.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        return str3;
    }

    private static boolean AFAdRevenueData(Object... objArr) {
        objArr.getClass();
        return !w.l(objArr, null);
    }
}
