package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes10.dex */
public class SLHDSAKeyParameters extends AsymmetricKeyParameter {
    private final SLHDSAParameters parameters;

    public SLHDSAKeyParameters(boolean z, SLHDSAParameters sLHDSAParameters) {
        super(z);
        this.parameters = sLHDSAParameters;
    }

    public SLHDSAParameters getParameters() {
        return this.parameters;
    }
}
