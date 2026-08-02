package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* loaded from: classes9.dex */
public class SM2KeyExchangePrivateParameters implements CipherParameters {
    private final ECPrivateKeyParameters ephemeralPrivateKey;
    private final ECPoint ephemeralPublicPoint;
    private final boolean initiator;
    private final ECPrivateKeyParameters staticPrivateKey;
    private final ECPoint staticPublicPoint;

    public SM2KeyExchangePrivateParameters(boolean z, ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
        if (eCPrivateKeyParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("staticPrivateKey cannot be null");
            throw null;
        }
        if (eCPrivateKeyParameters2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ephemeralPrivateKey cannot be null");
            throw null;
        }
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            a$$ExternalSyntheticBUOutline0.m$3("Static and ephemeral private keys have different domain parameters");
            throw null;
        }
        FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
        this.initiator = z;
        this.staticPrivateKey = eCPrivateKeyParameters;
        this.staticPublicPoint = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters.getD()).normalize();
        this.ephemeralPrivateKey = eCPrivateKeyParameters2;
        this.ephemeralPublicPoint = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters2.getD()).normalize();
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public ECPoint getEphemeralPublicPoint() {
        return this.ephemeralPublicPoint;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.staticPrivateKey;
    }

    public ECPoint getStaticPublicPoint() {
        return this.staticPublicPoint;
    }

    public boolean isInitiator() {
        return this.initiator;
    }
}
