package com.appsflyer.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFk1xSDK {
    public static final int getMediationNetwork(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        a1.n b10 = new Regex("(\\d+).(\\d+).(\\d+).*").b(str);
        if (b10 == null) {
            return -1;
        }
        kotlin.collections.i iVar = (kotlin.collections.i) b10.f42r;
        MatchGroup c10 = iVar.c(1);
        int i3 = 0;
        int intValue = ((c10 == null || (str4 = c10.f5604a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup c11 = iVar.c(2);
        int intValue2 = (((c11 == null || (str3 = c11.f5604a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + intValue;
        MatchGroup c12 = iVar.c(3);
        if (c12 != null && (str2 = c12.f5604a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            i3 = intOrNull.intValue();
        }
        return intValue2 + i3;
    }

    public static final String getMediationNetwork(String str, String str2) {
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
}
