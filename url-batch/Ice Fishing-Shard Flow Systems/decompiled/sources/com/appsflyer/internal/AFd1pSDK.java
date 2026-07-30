package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFd1pSDK {
    public static final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final Pair<Integer, Integer> getCurrencyIso4217Code(String str) {
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(str, "");
        D0.j b7 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").b(str);
        if (b7 != null) {
            kotlin.text.g gVar = (kotlin.text.g) b7.f331i;
            MatchGroup b8 = gVar.b(1);
            Integer intOrNull = (b8 == null || (str4 = b8.f6178a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup b9 = gVar.b(3);
            Integer intOrNull2 = (b9 == null || (str3 = b9.f6178a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup b10 = gVar.b(4);
            Integer intOrNull3 = (b10 == null || (str2 = b10.f6178a) == null) ? null : StringsKt.toIntOrNull(str2);
            if (intOrNull != null) {
                return new Pair<>(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return new Pair<>(Integer.valueOf((intOrNull3.intValue() * 1000) + (intOrNull2.intValue() * 1000000)), Integer.valueOf((((intOrNull3.intValue() + 1) * 1000) + (intOrNull2.intValue() * 1000000)) - 1));
            }
        }
        return null;
    }

    public static final String getMediationNetwork(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b7 : digest) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            str3 = r4.f.c(str3, format);
        }
        return str3;
    }

    private static boolean getRevenue(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !kotlin.collections.p.k(objArr, null);
    }

    public static final Pair<Integer, Integer> getMediationNetwork(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(str, "");
        D0.j b7 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").b(str);
        if (b7 != null) {
            kotlin.text.g gVar = (kotlin.text.g) b7.f331i;
            MatchGroup b8 = gVar.b(1);
            Integer intOrNull = (b8 == null || (str7 = b8.f6178a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup b9 = gVar.b(2);
            Integer intOrNull2 = (b9 == null || (str6 = b9.f6178a) == null) ? null : StringsKt.toIntOrNull(str6);
            MatchGroup b10 = gVar.b(3);
            Integer intOrNull3 = (b10 == null || (str5 = b10.f6178a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup b11 = gVar.b(4);
            Integer intOrNull4 = (b11 == null || (str4 = b11.f6178a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup b12 = gVar.b(5);
            Integer intOrNull5 = (b12 == null || (str3 = b12.f6178a) == null) ? null : StringsKt.toIntOrNull(str3);
            MatchGroup b13 = gVar.b(6);
            Integer intOrNull6 = (b13 == null || (str2 = b13.f6178a) == null) ? null : StringsKt.toIntOrNull(str2);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.b(intOrNull);
                int intValue = intOrNull.intValue() * 1000000;
                Intrinsics.b(intOrNull2);
                int intValue2 = (intOrNull2.intValue() * 1000) + intValue;
                Intrinsics.b(intOrNull3);
                Integer valueOf = Integer.valueOf(intOrNull3.intValue() + intValue2);
                Intrinsics.b(intOrNull4);
                int intValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.b(intOrNull5);
                int intValue4 = (intOrNull5.intValue() * 1000) + intValue3;
                Intrinsics.b(num);
                return new Pair<>(valueOf, Integer.valueOf(num.intValue() + intValue4));
            }
        }
        return null;
    }
}
