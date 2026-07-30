package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFj1aSDK {
    public static final String AFAdRevenueData(String str, String str2) {
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

    public static final int AFAdRevenueData(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        D0.j b7 = new Regex("(\\d+).(\\d+).(\\d+).*").b(str);
        if (b7 == null) {
            return -1;
        }
        kotlin.text.g gVar = (kotlin.text.g) b7.f331i;
        MatchGroup b8 = gVar.b(1);
        int i2 = 0;
        int intValue = ((b8 == null || (str4 = b8.f6178a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup b9 = gVar.b(2);
        int intValue2 = (((b9 == null || (str3 = b9.f6178a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
        MatchGroup b10 = gVar.b(3);
        if (b10 != null && (str2 = b10.f6178a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            i2 = intOrNull.intValue();
        }
        return intValue2 + i2;
    }
}
