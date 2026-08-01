package c8;

import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f2007d = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof b) {
            byte[] bArr = ((a) this).f2006e;
            int length = bArr.length * 8;
            byte[] bArr2 = ((a) ((b) obj)).f2006e;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z10 = false;
                } else {
                    z10 = true;
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        z10 &= bArr[i3] == bArr2[i3];
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((a) this).f2006e;
        if (bArr.length * 8 < 32) {
            int i3 = bArr[0] & 255;
            for (int i10 = 1; i10 < bArr.length; i10++) {
                i3 |= (bArr[i10] & 255) << (i10 * 8);
            }
            return i3;
        }
        boolean z10 = bArr.length >= 4;
        int length = bArr.length;
        if (z10) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        i0.l(k7.e.y("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    public final String toString() {
        byte[] bArr = ((a) this).f2006e;
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = f2007d;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
