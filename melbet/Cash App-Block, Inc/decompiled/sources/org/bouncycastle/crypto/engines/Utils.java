package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes9.dex */
class Utils {
    public static CryptoServicePurpose getPurpose(boolean z) {
        return z ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
