package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class ParametersWithContext implements CipherParameters {
    private byte[] context;
    private CipherParameters parameters;

    public ParametersWithContext(CipherParameters cipherParameters, byte[] bArr) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'context' cannot be null");
            throw null;
        }
        this.parameters = cipherParameters;
        this.context = Arrays.clone(bArr);
    }

    public void copyContextTo(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.context;
        if (bArr2.length == i2) {
            System.arraycopy(bArr2, 0, bArr, i, i2);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("len");
        }
    }

    public byte[] getContext() {
        return Arrays.clone(this.context);
    }

    public int getContextLength() {
        return this.context.length;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
