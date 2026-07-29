package com.mopub.common.util;

import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class Utils {
    private static final AtomicLong sNextGeneratedId = new AtomicLong(1);

    public static boolean bitMaskContainsFlag(int i, int i2) {
        return (i & i2) != 0;
    }

    public static String sha1(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            for (byte b2 : messageDigest.digest()) {
                sb.append(String.format("%02X", Byte.valueOf(b2)));
            }
            return sb.toString().toLowerCase(Locale.US);
        } catch (Exception unused) {
            return "";
        }
    }

    public static long generateUniqueId() {
        long j;
        long j2;
        do {
            j = sNextGeneratedId.get();
            j2 = j + 1;
        } while (!sNextGeneratedId.compareAndSet(j, j2 <= 9223372036854775806L ? j2 : 1L));
        return j;
    }
}
