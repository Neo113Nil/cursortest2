package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.math.BigInteger;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes9.dex */
public class ECDomainParameters implements ECConstants {
    private final ECPoint G;
    private final ECCurve curve;
    private final BigInteger h;
    private BigInteger hInv;
    private final BigInteger n;
    private final byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            a$$ExternalSyntheticBUOutline0.m$2("curve");
            throw null;
        }
        if (bigInteger == null) {
            a$$ExternalSyntheticBUOutline0.m$2("n");
            throw null;
        }
        this.curve = eCCurve;
        this.G = validatePublicPoint(eCCurve, eCPoint);
        this.n = bigInteger;
        this.h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Point cannot be null");
            return null;
        }
        ECPoint normalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (normalize.isInfinity()) {
            a$$ExternalSyntheticBUOutline0.m$3("Point at infinity");
            return null;
        }
        if (normalize.isValid()) {
            return normalize;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Point not on curve");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.G.equals(eCDomainParameters.G) && this.n.equals(eCDomainParameters.n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.n, this.h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return this.n.hashCode() ^ ((((this.curve.hashCode() ^ IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA) * EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ this.G.hashCode()) * EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Scalar cannot be null");
            return null;
        }
        if (bigInteger.compareTo(ECConstants.ONE) >= 0 && bigInteger.compareTo(getN()) < 0) {
            return bigInteger;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Scalar is not in the interval [1, n - 1]");
        return null;
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }
}
