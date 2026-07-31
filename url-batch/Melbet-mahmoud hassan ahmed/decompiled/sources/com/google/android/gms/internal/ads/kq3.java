package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kq3 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f7585a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f7586b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f7587c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f7588d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f7589e;

    /* renamed from: f, reason: collision with root package name */
    public static final cp3 f7590f;

    static {
        byte[] bArr = new byte[0];
        f7588d = bArr;
        f7589e = ByteBuffer.wrap(bArr);
        int i7 = cp3.f3912e;
        f7590f = cp3.g(bArr, 0, 0, false);
    }

    public static int a(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d7 = d(length, bArr, 0, length);
        if (d7 == 0) {
            return 1;
        }
        return d7;
    }

    public static int c(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    static int d(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static <T> T e(T t6) {
        Objects.requireNonNull(t6);
        return t6;
    }

    static <T> T f(T t6, String str) {
        Objects.requireNonNull(t6, str);
        return t6;
    }

    static Object g(Object obj, Object obj2) {
        return ((kr3) obj).i().c((kr3) obj2).b();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f7586b);
    }

    public static boolean i(byte[] bArr) {
        return lt3.i(bArr);
    }
}
