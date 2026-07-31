package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFd1rSDK {
    public static final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    public static final String getCurrencyIso4217Code(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String str3 = "";
        for (byte b4 : digest) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b4)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            str3 = str3 + format;
        }
        return str3;
    }

    public static final Pair<Integer, Integer> getMediationNetwork(String str) {
        String a4;
        String a5;
        String a6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult c4 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").c(str);
        if (c4 != null) {
            MatchGroup matchGroup = c4.a().get(1);
            Integer intOrNull = (matchGroup == null || (a6 = matchGroup.a()) == null) ? null : StringsKt.toIntOrNull(a6);
            MatchGroup matchGroup2 = c4.a().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (a5 = matchGroup2.a()) == null) ? null : StringsKt.toIntOrNull(a5);
            MatchGroup matchGroup3 = c4.a().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (a4 = matchGroup3.a()) == null) ? null : StringsKt.toIntOrNull(a4);
            if (intOrNull != null) {
                return TuplesKt.to(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return TuplesKt.to(Integer.valueOf((intOrNull2.intValue() * 1000000) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * 1000000) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> getRevenue(String str) {
        String a4;
        String a5;
        String a6;
        String a7;
        String a8;
        String a9;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult c4 = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").c(str);
        if (c4 != null) {
            MatchGroup matchGroup = c4.a().get(1);
            Integer intOrNull = (matchGroup == null || (a9 = matchGroup.a()) == null) ? null : StringsKt.toIntOrNull(a9);
            MatchGroup matchGroup2 = c4.a().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (a8 = matchGroup2.a()) == null) ? null : StringsKt.toIntOrNull(a8);
            MatchGroup matchGroup3 = c4.a().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (a7 = matchGroup3.a()) == null) ? null : StringsKt.toIntOrNull(a7);
            MatchGroup matchGroup4 = c4.a().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (a6 = matchGroup4.a()) == null) ? null : StringsKt.toIntOrNull(a6);
            MatchGroup matchGroup5 = c4.a().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (a5 = matchGroup5.a()) == null) ? null : StringsKt.toIntOrNull(a5);
            MatchGroup matchGroup6 = c4.a().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (a4 = matchGroup6.a()) == null) ? null : StringsKt.toIntOrNull(a4);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.checkNotNull(intOrNull);
                int intValue = intOrNull.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull2);
                int intValue2 = intValue + (intOrNull2.intValue() * 1000);
                Intrinsics.checkNotNull(intOrNull3);
                Integer valueOf = Integer.valueOf(intValue2 + intOrNull3.intValue());
                Intrinsics.checkNotNull(intOrNull4);
                int intValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.checkNotNull(intOrNull5);
                int intValue4 = intValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.checkNotNull(num);
                return TuplesKt.to(valueOf, Integer.valueOf(intValue4 + num.intValue()));
            }
        }
        return null;
    }

    private static boolean getRevenue(Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !AbstractC3219i.A(objArr, null);
    }
}
