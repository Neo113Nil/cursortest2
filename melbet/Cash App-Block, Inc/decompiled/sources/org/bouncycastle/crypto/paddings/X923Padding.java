package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public class X923Padding implements BlockCipherPadding {
    SecureRandom random = null;

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int addPadding(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            SecureRandom secureRandom = this.random;
            if (secureRandom == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) secureRandom.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public String getPaddingName() {
        return "X9.23";
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.crypto.paddings.BlockCipherPadding
    public int padCount(byte[] bArr) {
        int i = bArr[bArr.length - 1] & 255;
        if ((((bArr.length - i) | (i - 1)) >> 31) == 0) {
            return i;
        }
        f$$ExternalSyntheticLambda0.m$2("pad block corrupted");
        return 0;
    }
}
