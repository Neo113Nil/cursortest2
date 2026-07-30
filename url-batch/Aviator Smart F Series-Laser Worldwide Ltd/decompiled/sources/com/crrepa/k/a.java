package com.crrepa.k;

import java.util.Date;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13120a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13121b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13122c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13123d = 3;

    public abstract int[] a(byte[] bArr);

    public Date b(byte[] bArr) {
        if (bArr.length < 5) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 1, bArr2, 0, 4);
        long f8 = com.crrepa.g1.c.f(bArr2) * 1000;
        if (f8 <= 0) {
            return null;
        }
        return new Date(f8);
    }

    public int c(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return -1;
        }
        return bArr[0];
    }
}
