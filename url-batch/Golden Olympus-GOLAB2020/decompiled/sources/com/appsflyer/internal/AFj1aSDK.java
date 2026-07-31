package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFj1aSDK {
    public static final String getMonetizationNetwork(String str, String str2) {
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

    public static final int getMonetizationNetwork(String str) {
        String a4;
        Integer intOrNull;
        String a5;
        Integer intOrNull2;
        String a6;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult c4 = new Regex("(\\d+).(\\d+).(\\d+).*").c(str);
        if (c4 == null) {
            return -1;
        }
        MatchGroup matchGroup = c4.a().get(1);
        int i4 = 0;
        int intValue = ((matchGroup == null || (a6 = matchGroup.a()) == null || (intOrNull3 = StringsKt.toIntOrNull(a6)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = c4.a().get(2);
        int intValue2 = intValue + (((matchGroup2 == null || (a5 = matchGroup2.a()) == null || (intOrNull2 = StringsKt.toIntOrNull(a5)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = c4.a().get(3);
        if (matchGroup3 != null && (a4 = matchGroup3.a()) != null && (intOrNull = StringsKt.toIntOrNull(a4)) != null) {
            i4 = intOrNull.intValue();
        }
        return intValue2 + i4;
    }
}
