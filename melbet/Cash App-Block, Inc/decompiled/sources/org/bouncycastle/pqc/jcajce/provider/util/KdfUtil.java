package org.bouncycastle.pqc.jcajce.provider.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.jcajce.spec.KEMKDFSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class KdfUtil {
    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m("unrecognized digest OID: ", aSN1ObjectIdentifier));
        return null;
    }

    public static byte[] makeKeyBytes(KEMKDFSpec kEMKDFSpec, byte[] bArr) {
        DerivationFunction concatenationKDFGenerator;
        KDFParameters kDFParameters;
        if (kEMKDFSpec == null) {
            try {
                int length = bArr.length;
                System.arraycopy(bArr, 0, new byte[length], 0, length);
            } catch (Throwable th) {
                Arrays.clear(bArr);
                throw th;
            }
        }
        AlgorithmIdentifier kdfAlgorithm = kEMKDFSpec.getKdfAlgorithm();
        byte[] otherInfo = kEMKDFSpec.getOtherInfo();
        int keySize = (kEMKDFSpec.getKeySize() + 7) / 8;
        byte[] bArr2 = new byte[keySize];
        if (kdfAlgorithm == null) {
            System.arraycopy(bArr, 0, bArr2, 0, (kEMKDFSpec.getKeySize() + 7) / 8);
        } else {
            if (X9ObjectIdentifiers.id_kdf_kdf2.equals((ASN1Primitive) kdfAlgorithm.getAlgorithm())) {
                concatenationKDFGenerator = new KDF2BytesGenerator(getDigest(AlgorithmIdentifier.getInstance(kdfAlgorithm.getParameters()).getAlgorithm()));
                kDFParameters = new KDFParameters(bArr, otherInfo);
            } else if (X9ObjectIdentifiers.id_kdf_kdf3.equals((ASN1Primitive) kdfAlgorithm.getAlgorithm())) {
                concatenationKDFGenerator = new ConcatenationKDFGenerator(getDigest(AlgorithmIdentifier.getInstance(kdfAlgorithm.getParameters()).getAlgorithm()));
                kDFParameters = new KDFParameters(bArr, otherInfo);
            } else {
                if (!NISTObjectIdentifiers.id_shake256.equals((ASN1Primitive) kdfAlgorithm.getAlgorithm())) {
                    throw new IllegalStateException("Unrecognized KDF: " + kdfAlgorithm.getAlgorithm());
                }
                SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
                sHAKEDigest.update(bArr, 0, bArr.length);
                sHAKEDigest.update(otherInfo, 0, otherInfo.length);
                sHAKEDigest.doFinal(bArr2, 0, keySize);
            }
            concatenationKDFGenerator.init(kDFParameters);
            concatenationKDFGenerator.generateBytes(bArr2, 0, keySize);
        }
        Arrays.clear(bArr);
        return bArr2;
    }
}
