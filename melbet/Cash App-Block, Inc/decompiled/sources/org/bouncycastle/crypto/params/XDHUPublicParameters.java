package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes9.dex */
public class XDHUPublicParameters implements CipherParameters {
    private AsymmetricKeyParameter ephemeralPublicKey;
    private AsymmetricKeyParameter staticPublicKey;

    public XDHUPublicParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        if (asymmetricKeyParameter == null) {
            a$$ExternalSyntheticBUOutline0.m$2("staticPublicKey cannot be null");
            throw null;
        }
        if (!(asymmetricKeyParameter instanceof X448PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PublicKeyParameters)) {
            a$$ExternalSyntheticBUOutline0.m$3("only X25519 and X448 paramaters can be used");
            throw null;
        }
        if (asymmetricKeyParameter2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ephemeralPublicKey cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            a$$ExternalSyntheticBUOutline0.m$3("static and ephemeral public keys have different domain parameters");
            throw null;
        }
        this.staticPublicKey = asymmetricKeyParameter;
        this.ephemeralPublicKey = asymmetricKeyParameter2;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public AsymmetricKeyParameter getStaticPublicKey() {
        return this.staticPublicKey;
    }
}
