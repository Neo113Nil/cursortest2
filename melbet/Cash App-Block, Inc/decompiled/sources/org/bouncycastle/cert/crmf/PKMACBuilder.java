package org.bouncycastle.cert.crmf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.PBEMacCalculatorProvider;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class PKMACBuilder implements PBEMacCalculatorProvider {
    private PKMACValuesCalculator calculator;
    private int iterationCount;
    private AlgorithmIdentifier mac;
    private int maxIterations;
    private AlgorithmIdentifier owf;
    private PBMParameter parameters;
    private SecureRandom random;
    private int saltLength;

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator) {
        this(new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, new AlgorithmIdentifier(IANAObjectIdentifiers.hmacSHA1, DERNull.INSTANCE), pKMACValuesCalculator);
    }

    private void checkIterationCountCeiling(int i) {
        int i2 = this.maxIterations;
        if (i2 <= 0 || i <= i2) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxIterations, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "iteration count exceeds limit (", " > ")));
    }

    private MacCalculator genCalculator(final PBMParameter pBMParameter, char[] cArr) {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
        byte[] octets = pBMParameter.getSalt().getOctets();
        final byte[] bArr = new byte[uTF8ByteArray.length + octets.length];
        System.arraycopy(uTF8ByteArray, 0, bArr, 0, uTF8ByteArray.length);
        System.arraycopy(octets, 0, bArr, uTF8ByteArray.length, octets.length);
        this.calculator.setup(pBMParameter.getOwf(), pBMParameter.getMac());
        int intValueExact = pBMParameter.getIterationCount().intValueExact();
        do {
            bArr = this.calculator.calculateDigest(bArr);
            intValueExact--;
        } while (intValueExact > 0);
        return new MacCalculator() { // from class: org.bouncycastle.cert.crmf.PKMACBuilder.1
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();

            @Override // org.bouncycastle.operator.MacCalculator
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, pBMParameter);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public GenericKey getKey() {
                return new GenericKey(getAlgorithmIdentifier(), bArr);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public byte[] getMac() {
                try {
                    return PKMACBuilder.this.calculator.calculateMac(bArr, this.bOut.toByteArray());
                } catch (CRMFException e) {
                    f$$ExternalSyntheticLambda0.m("exception calculating mac: ", (Object) e.getMessage(), (Throwable) e);
                    return null;
                }
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public OutputStream getOutputStream() {
                return this.bOut;
            }
        };
    }

    private PBMParameter genParameters() {
        byte[] bArr = new byte[this.saltLength];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr);
        return new PBMParameter(bArr, this.owf, this.iterationCount, this.mac);
    }

    public MacCalculator build(char[] cArr) {
        PBMParameter pBMParameter = this.parameters;
        if (pBMParameter == null) {
            pBMParameter = genParameters();
        }
        return genCalculator(pBMParameter, cArr);
    }

    @Override // org.bouncycastle.operator.PBEMacCalculatorProvider
    public MacCalculator get(AlgorithmIdentifier algorithmIdentifier, char[] cArr) {
        if (!CMPObjectIdentifiers.passwordBasedMac.equals((ASN1Primitive) algorithmIdentifier.getAlgorithm())) {
            throw new OperatorCreationException("protection algorithm not mac based");
        }
        setParameters(PBMParameter.getInstance(algorithmIdentifier.getParameters()));
        try {
            return build(cArr);
        } catch (CRMFException e) {
            throw new OperatorCreationException(e.getMessage(), e.getCause());
        }
    }

    public PKMACBuilder setIterationCount(int i) {
        if (i < 100) {
            a$$ExternalSyntheticBUOutline0.m$3("iteration count must be at least 100");
            return null;
        }
        checkIterationCountCeiling(i);
        this.iterationCount = i;
        return this;
    }

    public PKMACBuilder setParameters(PBMParameter pBMParameter) {
        checkIterationCountCeiling(pBMParameter.getIterationCount().intValueExact());
        this.parameters = pBMParameter;
        return this;
    }

    public PKMACBuilder setSaltLength(int i) {
        if (i >= 8) {
            this.saltLength = i;
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$3("salt length must be at least 8 bytes");
        return null;
    }

    public PKMACBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    private PKMACBuilder(AlgorithmIdentifier algorithmIdentifier, int i, AlgorithmIdentifier algorithmIdentifier2, PKMACValuesCalculator pKMACValuesCalculator) {
        this.saltLength = 20;
        this.owf = algorithmIdentifier;
        this.iterationCount = i;
        this.mac = algorithmIdentifier2;
        this.calculator = pKMACValuesCalculator;
    }

    public PKMACBuilder(PKMACValuesCalculator pKMACValuesCalculator, int i) {
        this.saltLength = 20;
        this.maxIterations = i;
        this.calculator = pKMACValuesCalculator;
    }
}
