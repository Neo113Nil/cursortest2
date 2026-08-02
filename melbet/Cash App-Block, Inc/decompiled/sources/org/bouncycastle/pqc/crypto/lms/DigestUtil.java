package org.bouncycastle.pqc.crypto.lms;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes10.dex */
class DigestUtil {
    private static Digest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len)) {
            return new SHAKEDigest(256);
        }
        a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m("unrecognized digest OID: ", aSN1ObjectIdentifier));
        return null;
    }

    public static Digest getDigest(LMOtsParameters lMOtsParameters) {
        return createDigest(lMOtsParameters.getDigestOID(), lMOtsParameters.getN());
    }

    public static class WrapperDigest implements Digest {
        private final Digest digest;
        private final int length;

        public WrapperDigest(Digest digest, int i) {
            this.digest = digest;
            this.length = i;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i) {
            byte[] bArr2 = new byte[this.digest.getDigestSize()];
            this.digest.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i, this.length);
            return this.length;
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return this.digest.getAlgorithmName() + "/" + (this.length * 8);
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.length;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.digest.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b) {
            this.digest.update(b);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i, int i2) {
            this.digest.update(bArr, i, i2);
        }
    }

    public static Digest getDigest(LMSigParameters lMSigParameters) {
        return createDigest(lMSigParameters.getDigestOID(), lMSigParameters.getM());
    }

    private static Digest createDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        Digest createDigest = createDigest(aSN1ObjectIdentifier);
        return (NISTObjectIdentifiers.id_shake256_len.equals((ASN1Primitive) aSN1ObjectIdentifier) || createDigest.getDigestSize() != i) ? new WrapperDigest(createDigest, i) : createDigest;
    }
}
