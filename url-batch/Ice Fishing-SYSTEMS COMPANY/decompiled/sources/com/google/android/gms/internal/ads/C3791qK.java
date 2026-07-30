package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3791qK {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33687a;

    public C3791qK(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f33687a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C3791qK a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new C3791qK(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f33687a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3791qK) {
            return Arrays.equals(((C3791qK) obj).f33687a, this.f33687a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33687a);
    }

    public final String toString() {
        byte[] bArr = this.f33687a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b9 : bArr) {
            sb.append("0123456789abcdef".charAt((b9 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b9 & 15));
        }
        String sb2 = sb.toString();
        return D.y.o(new StringBuilder(sb2.length() + 7), "Bytes(", sb2, ")");
    }
}
