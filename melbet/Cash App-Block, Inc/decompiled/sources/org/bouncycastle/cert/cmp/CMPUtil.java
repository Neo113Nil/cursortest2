package org.bouncycastle.cert.cmp;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes9.dex */
class CMPUtil {
    public static byte[] calculateCertHash(ASN1Object aSN1Object, AlgorithmIdentifier algorithmIdentifier, DigestCalculatorProvider digestCalculatorProvider, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        AlgorithmIdentifier find = digestAlgorithmIdentifierFinder.find(algorithmIdentifier);
        if (find != null) {
            return calculateDigest(aSN1Object, find, digestCalculatorProvider);
        }
        throw new CMPException("cannot find digest algorithm from signature algorithm");
    }

    public static byte[] calculateDigest(ASN1Object aSN1Object, AlgorithmIdentifier algorithmIdentifier, DigestCalculatorProvider digestCalculatorProvider) {
        DigestCalculator digestCalculator = getDigestCalculator(algorithmIdentifier, digestCalculatorProvider);
        derEncodeToStream(aSN1Object, digestCalculator.getOutputStream());
        return digestCalculator.getDigest();
    }

    public static void derEncodeToStream(ASN1Object aSN1Object, OutputStream outputStream) {
        try {
            aSN1Object.encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
        } catch (IOException e) {
            throw new CMPRuntimeException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to DER encode object: ")), e);
        }
    }

    public static DigestCalculator getDigestCalculator(AlgorithmIdentifier algorithmIdentifier, DigestCalculatorProvider digestCalculatorProvider) {
        try {
            return digestCalculatorProvider.get(algorithmIdentifier);
        } catch (OperatorCreationException e) {
            throw new CMPException("unable to create digester: " + e.getMessage(), e);
        }
    }
}
