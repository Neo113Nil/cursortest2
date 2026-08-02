package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

/* loaded from: classes9.dex */
public interface BlockCipherPadding {
    int addPadding(byte[] bArr, int i);

    String getPaddingName();

    void init(SecureRandom secureRandom);

    int padCount(byte[] bArr);
}
