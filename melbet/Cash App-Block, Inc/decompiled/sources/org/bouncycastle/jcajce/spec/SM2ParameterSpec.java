package org.bouncycastle.jcajce.spec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class SM2ParameterSpec implements AlgorithmParameterSpec {
    private byte[] id;

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr != null) {
            this.id = Arrays.clone(bArr);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("id string cannot be null");
            throw null;
        }
    }

    public byte[] getID() {
        return Arrays.clone(this.id);
    }
}
