package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public class ISO7816d4Padding implements BlockCipherPadding {
    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "ISO7816-4";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int length = bArr.length;
        int i = -1;
        int i2 = -1;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            i ^= ((((r3 ^ 128) - 1) >> 31) & i2) & (length ^ i);
            i2 &= ((bArr[length] & 255) - 1) >> 31;
        }
        if (i >= 0) {
            return bArr.length - i;
        }
        f$$ExternalSyntheticLambda0.m$2("pad block corrupted");
        return 0;
    }
}
