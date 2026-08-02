package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes9.dex */
public class XDHUPrivateParameters implements CipherParameters {
    private AsymmetricKeyParameter ephemeralPrivateKey;
    private AsymmetricKeyParameter ephemeralPublicKey;
    private AsymmetricKeyParameter staticPrivateKey;

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2, AsymmetricKeyParameter asymmetricKeyParameter3) {
        if (asymmetricKeyParameter == null) {
            a$$ExternalSyntheticBUOutline0.m$2("staticPrivateKey cannot be null");
            throw null;
        }
        boolean z = asymmetricKeyParameter instanceof X448PrivateKeyParameters;
        if (!z && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
            a$$ExternalSyntheticBUOutline0.m$3("only X25519 and X448 paramaters can be used");
            throw null;
        }
        if (asymmetricKeyParameter2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ephemeralPrivateKey cannot be null");
            throw null;
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            a$$ExternalSyntheticBUOutline0.m$3("static and ephemeral private keys have different domain parameters");
            throw null;
        }
        if (asymmetricKeyParameter3 == null) {
            asymmetricKeyParameter3 = asymmetricKeyParameter2 instanceof X448PrivateKeyParameters ? ((X448PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey() : ((X25519PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey();
        } else {
            if ((asymmetricKeyParameter3 instanceof X448PublicKeyParameters) && !z) {
                a$$ExternalSyntheticBUOutline0.m$3("ephemeral public key has different domain parameters");
                throw null;
            }
            if ((asymmetricKeyParameter3 instanceof X25519PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
                a$$ExternalSyntheticBUOutline0.m$3("ephemeral public key has different domain parameters");
                throw null;
            }
        }
        this.staticPrivateKey = asymmetricKeyParameter;
        this.ephemeralPrivateKey = asymmetricKeyParameter2;
        this.ephemeralPublicKey = asymmetricKeyParameter3;
    }

    public AsymmetricKeyParameter getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.ephemeralPublicKey;
    }

    public AsymmetricKeyParameter getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this(asymmetricKeyParameter, asymmetricKeyParameter2, null);
    }
}
