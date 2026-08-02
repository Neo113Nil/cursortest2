package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes9.dex */
public class SM2KeyExchangePublicParameters implements CipherParameters {
    private final ECPublicKeyParameters ephemeralPublicKey;
    private final ECPublicKeyParameters staticPublicKey;

    public SM2KeyExchangePublicParameters(ECPublicKeyParameters eCPublicKeyParameters, ECPublicKeyParameters eCPublicKeyParameters2) {
        if (eCPublicKeyParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("staticPublicKey cannot be null");
            throw null;
        }
        if (eCPublicKeyParameters2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ephemeralPublicKey cannot be null");
            throw null;
        }
        if (!eCPublicKeyParameters.getParameters().equals(eCPublicKeyParameters2.getParameters())) {
            a$$ExternalSyntheticBUOutline0.m$3("Static and ephemeral public keys have different domain parameters");
            throw null;
        }
        this.staticPublicKey = eCPublicKeyParameters;
        this.ephemeralPublicKey = eCPublicKeyParameters2;
    }

    public ECPublicKeyParameters getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public ECPublicKeyParameters getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
