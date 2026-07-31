package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class td3 implements Comparable<td3> {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f12182f;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(td3 td3Var) {
        td3 td3Var2 = td3Var;
        int length = this.f12182f.length;
        int length2 = td3Var2.f12182f.length;
        if (length != length2) {
            return length - length2;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f12182f;
            if (i7 >= bArr.length) {
                return 0;
            }
            byte b7 = bArr[i7];
            byte b8 = td3Var2.f12182f[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td3) {
            return Arrays.equals(this.f12182f, ((td3) obj).f12182f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12182f);
    }

    public final String toString() {
        byte[] bArr = this.f12182f;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b7 : bArr) {
            int i7 = b7 & 255;
            sb.append("0123456789abcdef".charAt(i7 >> 4));
            sb.append("0123456789abcdef".charAt(i7 & 15));
        }
        return sb.toString();
    }
}
