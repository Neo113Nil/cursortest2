package com.crrepa.f;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12463a = 120;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12464b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12465c = 1;

    private b1() {
    }

    public static String a(String str) {
        int i8 = 120;
        int i9 = 0;
        int i10 = 0;
        while (i9 < str.length()) {
            int i11 = i9 + 1;
            i8 -= str.substring(i9, i11).getBytes(StandardCharsets.UTF_8).length;
            if (i8 <= 0) {
                return (String) TextUtils.concat(str.substring(0, i10), String.valueOf((char) 8230));
            }
            i10++;
            i9 = i11;
        }
        return str;
    }

    public static byte[] a() {
        return g.a(68, new byte[]{-1});
    }

    public static byte[] a(byte b8, String str) {
        byte[] bytes = a(str).getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = b8;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return g.a(68, bArr);
    }
}
