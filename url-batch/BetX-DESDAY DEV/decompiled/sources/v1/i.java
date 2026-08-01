package v1;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public final class i {
    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f3743e;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != 10) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z3 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z3) {
                    i3 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    byte[] bArr4 = j1.b.f2971a;
                    int i14 = b2 & 255;
                    z2 = z3;
                    i3 = i14;
                }
                byte b3 = bArr[i8 + i13];
                byte[] bArr5 = j1.b.f2971a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z3 = z2;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z3 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            Charset charset = StandardCharsets.UTF_8;
                            X0.f.d(charset, "UTF_8");
                            return new String(bArr, i8, i10, charset);
                        }
                    }
                }
                i6 = i2 + 1;
                i5 = -1;
            }
            length = i7;
            i5 = -1;
        }
        return null;
    }

    public static j b(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (w1.b.a(str.charAt(i2 + 1)) + (w1.b.a(str.charAt(i2)) << 4));
        }
        return new j(bArr);
    }

    public static j c(String str) {
        X0.f.e(str, "<this>");
        byte[] bytes = str.getBytes(e1.a.f2375a);
        X0.f.d(bytes, "this as java.lang.String).getBytes(charset)");
        j jVar = new j(bytes);
        jVar.f4492c = str;
        return jVar;
    }
}
