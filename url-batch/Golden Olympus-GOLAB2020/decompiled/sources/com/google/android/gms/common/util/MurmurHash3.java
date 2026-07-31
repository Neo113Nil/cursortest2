package com.google.android.gms.common.util;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    public static int murmurhash3_x86_32(byte[] bArr, int i4, int i5, int i6) {
        int i7;
        int i8 = i4;
        while (true) {
            i7 = (i5 & (-4)) + i4;
            if (i8 >= i7) {
                break;
            }
            int i9 = ((bArr[i8] & KotlinVersion.MAX_COMPONENT_VALUE) | ((bArr[i8 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((bArr[i8 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (bArr[i8 + 3] << 24)) * (-862048943);
            int i10 = i6 ^ (((i9 >>> 17) | (i9 << 15)) * 461845907);
            i6 = (((i10 >>> 19) | (i10 << 13)) * 5) - 430675100;
            i8 += 4;
        }
        int i11 = i5 & 3;
        if (i11 != 1) {
            if (i11 != 2) {
                r0 = i11 == 3 ? (bArr[i7 + 2] & KotlinVersion.MAX_COMPONENT_VALUE) << 16 : 0;
                int i12 = i6 ^ i5;
                int i13 = (i12 ^ (i12 >>> 16)) * (-2048144789);
                int i14 = (i13 ^ (i13 >>> 13)) * (-1028477387);
                return i14 ^ (i14 >>> 16);
            }
            r0 |= (bArr[i7 + 1] & KotlinVersion.MAX_COMPONENT_VALUE) << 8;
        }
        int i15 = ((bArr[i7] & KotlinVersion.MAX_COMPONENT_VALUE) | r0) * (-862048943);
        i6 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        int i122 = i6 ^ i5;
        int i132 = (i122 ^ (i122 >>> 16)) * (-2048144789);
        int i142 = (i132 ^ (i132 >>> 13)) * (-1028477387);
        return i142 ^ (i142 >>> 16);
    }
}
