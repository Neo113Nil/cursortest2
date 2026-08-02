package org.bouncycastle.pqc.legacy.crypto.qtesla;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public final class QTESLAPublicKeyParameters extends AsymmetricKeyParameter {
    private byte[] publicKey;
    private int securityCategory;

    public QTESLAPublicKeyParameters(int i, byte[] bArr) {
        super(false);
        if (bArr.length != QTESLASecurityCategory.getPublicSize(i)) {
            a$$ExternalSyntheticBUOutline0.m$3("invalid key size for security category");
            throw null;
        }
        this.securityCategory = i;
        this.publicKey = Arrays.clone(bArr);
    }

    public byte[] getPublicData() {
        return Arrays.clone(this.publicKey);
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
