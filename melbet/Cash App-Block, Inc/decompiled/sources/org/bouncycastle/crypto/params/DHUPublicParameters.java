package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes9.dex */
public class DHUPublicParameters implements CipherParameters {
    private DHPublicKeyParameters ephemeralPublicKey;
    private DHPublicKeyParameters staticPublicKey;

    public DHUPublicParameters(DHPublicKeyParameters dHPublicKeyParameters, DHPublicKeyParameters dHPublicKeyParameters2) {
        if (dHPublicKeyParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("staticPublicKey cannot be null");
            throw null;
        }
        if (dHPublicKeyParameters2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ephemeralPublicKey cannot be null");
            throw null;
        }
        if (!dHPublicKeyParameters.getParameters().equals(dHPublicKeyParameters2.getParameters())) {
            a$$ExternalSyntheticBUOutline0.m$3("Static and ephemeral public keys have different domain parameters");
            throw null;
        }
        this.staticPublicKey = dHPublicKeyParameters;
        this.ephemeralPublicKey = dHPublicKeyParameters2;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public DHPublicKeyParameters getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
