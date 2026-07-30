package com.appsflyer.internal;

import defpackage.a0;
import defpackage.kk0;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1aSDK {
    public static final int AFAdRevenueData(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        kk0 b = new Regex("(\\d+).(\\d+).(\\d+).*").b(str);
        if (b == null) {
            return -1;
        }
        a0 a0Var = b.c;
        MatchGroup b2 = a0Var.b(1);
        int i = 0;
        int intValue = ((b2 == null || (str4 = b2.a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup b3 = a0Var.b(2);
        int intValue2 = (((b3 == null || (str3 = b3.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
        MatchGroup b4 = a0Var.b(3);
        if (b4 != null && (str2 = b4.a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            i = intOrNull.intValue();
        }
        return intValue2 + i;
    }

    public static final String AFAdRevenueData(String str, String str2) {
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
