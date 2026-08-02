package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    private final ECDomainParameters parameters;

    public ECKeyParameters(boolean z, ECDomainParameters eCDomainParameters) {
        super(z);
        if (eCDomainParameters != null) {
            this.parameters = eCDomainParameters;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("'parameters' cannot be null");
            throw null;
        }
    }

    public ECDomainParameters getParameters() {
        return this.parameters;
    }
}
