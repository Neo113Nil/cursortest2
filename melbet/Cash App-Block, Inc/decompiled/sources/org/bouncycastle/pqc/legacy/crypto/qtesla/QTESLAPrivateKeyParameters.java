package org.bouncycastle.pqc.legacy.crypto.qtesla;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public final class QTESLAPrivateKeyParameters extends AsymmetricKeyParameter {
    private byte[] privateKey;
    private int securityCategory;

    public QTESLAPrivateKeyParameters(int i, byte[] bArr) {
        super(true);
        if (bArr.length != QTESLASecurityCategory.getPrivateSize(i)) {
            a$$ExternalSyntheticBUOutline0.m$3("invalid key size for security category");
            throw null;
        }
        this.securityCategory = i;
        this.privateKey = Arrays.clone(bArr);
    }

    public byte[] getSecret() {
        return Arrays.clone(this.privateKey);
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
