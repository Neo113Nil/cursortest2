package v3;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class k {
    public static int a(@RecentlyNonNull byte[] bArr, int i7, int i8, int i9) {
        int i10 = (i8 & (-4)) + i7;
        while (i7 < i10) {
            int i11 = ((bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | (bArr[i7 + 3] << 24)) * (-862048943);
            int i12 = i9 ^ (((i11 << 15) | (i11 >>> 17)) * 461845907);
            i9 = (((i12 >>> 19) | (i12 << 13)) * 5) - 430675100;
            i7 += 4;
        }
        int i13 = i8 & 3;
        if (i13 != 1) {
            if (i13 != 2) {
                r3 = i13 == 3 ? (bArr[i10 + 2] & 255) << 16 : 0;
                int i14 = i9 ^ i8;
                int i15 = (i14 ^ (i14 >>> 16)) * (-2048144789);
                int i16 = (i15 ^ (i15 >>> 13)) * (-1028477387);
                return i16 ^ (i16 >>> 16);
            }
            r3 |= (bArr[i10 + 1] & 255) << 8;
        }
        int i17 = ((bArr[i10] & 255) | r3) * (-862048943);
        i9 ^= ((i17 >>> 17) | (i17 << 15)) * 461845907;
        int i142 = i9 ^ i8;
        int i152 = (i142 ^ (i142 >>> 16)) * (-2048144789);
        int i162 = (i152 ^ (i152 >>> 13)) * (-1028477387);
        return i162 ^ (i162 >>> 16);
    }
}
