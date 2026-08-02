package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpl extends hov implements Serializable {
    public static final hpb a = new hpl();
    private static final long serialVersionUID = 0;
    private final int b = 0;
    private final boolean c = true;

    static {
        int i = hpe.a;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8);
    }

    public static long f(char c) {
        int i = ((c >>> 6) & 63) | 128;
        return (i << 8) | (c >>> '\f') | 224 | (((c & '?') | 128) << 16);
    }

    public static long g(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long h(int i) {
        return (((i & 63) | 128) << 24) | ((((i >>> 12) & 63) | 128) << 8) | (i >>> 18) | 240 | ((((i >>> 6) & 63) | 128) << 16);
    }

    public static hpa i(int i, int i2) {
        int i3 = hpa.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new hoz(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.hov, defpackage.hpb
    public final hpa b(CharSequence charSequence, Charset charset) {
        char c;
        int i;
        int i2;
        int i3;
        if (!charset.equals(StandardCharsets.UTF_8)) {
            return a(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i4 + 4;
            c = 128;
            if (i7 > length) {
                i = -430675100;
                i2 = 461845907;
                i3 = -862048943;
                break;
            }
            char charAt = charSequence.charAt(i4);
            i = -430675100;
            char charAt2 = charSequence.charAt(i4 + 1);
            i2 = 461845907;
            char charAt3 = charSequence.charAt(i4 + 2);
            i3 = -862048943;
            char charAt4 = charSequence.charAt(i4 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i5 = (Integer.rotateLeft((Integer.rotateLeft((((charAt | (charAt2 << '\b')) | (charAt3 << 16)) | (charAt4 << 24)) * (-862048943), 15) * 461845907) ^ i5, 13) * 5) - 430675100;
            i6 += 4;
            i4 = i7;
        }
        long j = 0;
        int i8 = 0;
        while (i4 < length) {
            char charAt5 = charSequence.charAt(i4);
            if (charAt5 < c) {
                j |= charAt5 << i8;
                i6++;
                i8 += 8;
            } else if (charAt5 < 2048) {
                j |= g(charAt5) << i8;
                i6 += 2;
                i8 += 16;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j |= f(charAt5) << i8;
                i6 += 3;
                i8 += 24;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (codePointAt == charAt5) {
                    return a(charSequence.toString().getBytes(charset));
                }
                j |= h(codePointAt) << i8;
                i6 += 4;
                i8 += 32;
                i4++;
            }
            if (i8 >= 32) {
                int rotateLeft = Integer.rotateLeft(i5 ^ (Integer.rotateLeft(((int) j) * i3, 15) * i2), 13) * 5;
                j >>>= 32;
                i5 = rotateLeft + i;
                i8 -= 32;
            }
            i4++;
            c = 128;
        }
        return i((Integer.rotateLeft(((int) j) * i3, 15) * i2) ^ i5, i6);
    }

    @Override // defpackage.hov
    public final hpa c(byte[] bArr, int i) {
        int i2 = 0;
        hoq.G(0, i, bArr.length);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > i) {
                break;
            }
            i4 = (-430675100) + (Integer.rotateLeft((Integer.rotateLeft(e(bArr, i3) * (-862048943), 15) * 461845907) ^ i4, 13) * 5);
            i3 = i5;
        }
        int i6 = 0;
        while (i3 < i) {
            i2 ^= (bArr[i3] & 255) << i6;
            i3++;
            i6 += 8;
        }
        return i((Integer.rotateLeft(i2 * (-862048943), 15) * 461845907) ^ i4, i);
    }

    @Override // defpackage.hpb
    public final hpc d() {
        return new hpk();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hpl)) {
            return false;
        }
        hpl hplVar = (hpl) obj;
        int i = hplVar.b;
        boolean z = hplVar.c;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
