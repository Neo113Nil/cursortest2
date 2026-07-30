package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
class k {
    static final short D_INTR = -31869;
    static final short D_LEAF = -32126;

    k() {
    }

    public static q generateKeys(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i8, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length >= lMSigParameters.getM()) {
            return new q(lMSigParameters, lMOtsParameters, i8, bArr, 1 << lMSigParameters.getH(), bArr2);
        }
        throw new IllegalArgumentException("root seed is less than " + lMSigParameters.getM());
    }

    public static s generateSign(l lVar) {
        return new s(lVar.getPrivateKey().getQ(), u.lm_ots_generate_signature(lVar.getPrivateKey(), lVar.getQ(), lVar.getC()), lVar.getSigParams(), lVar.getPath());
    }

    public static boolean verifySignature(r rVar, l lVar) {
        s sVar = (s) lVar.getSignature();
        LMSigParameters parameter = sVar.getParameter();
        int h8 = parameter.getH();
        byte[][] y7 = sVar.getY();
        byte[] lm_ots_validate_signature_calculate = u.lm_ots_validate_signature_calculate(lVar);
        int q8 = (1 << h8) + sVar.getQ();
        byte[] i8 = rVar.getI();
        org.bouncycastle.crypto.e digest = b.getDigest(parameter.getDigestOID());
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        digest.update(i8, 0, i8.length);
        v.u32str(q8, digest);
        v.u16str(D_LEAF, digest);
        digest.update(lm_ots_validate_signature_calculate, 0, lm_ots_validate_signature_calculate.length);
        digest.doFinal(bArr, 0);
        int i9 = 0;
        while (q8 > 1) {
            if ((q8 & 1) == 1) {
                digest.update(i8, 0, i8.length);
                v.u32str(q8 / 2, digest);
                v.u16str(D_INTR, digest);
                byte[] bArr2 = y7[i9];
                digest.update(bArr2, 0, bArr2.length);
                digest.update(bArr, 0, digestSize);
            } else {
                digest.update(i8, 0, i8.length);
                v.u32str(q8 / 2, digest);
                v.u16str(D_INTR, digest);
                digest.update(bArr, 0, digestSize);
                byte[] bArr3 = y7[i9];
                digest.update(bArr3, 0, bArr3.length);
            }
            digest.doFinal(bArr, 0);
            q8 /= 2;
            i9++;
        }
        return rVar.matchesT1(bArr);
    }

    public static s generateSign(q qVar, byte[] bArr) {
        l generateLMSContext = qVar.generateLMSContext();
        generateLMSContext.update(bArr, 0, bArr.length);
        return generateSign(generateLMSContext);
    }

    public static boolean verifySignature(r rVar, s sVar, byte[] bArr) {
        l generateOtsContext = rVar.generateOtsContext(sVar);
        v.byteArray(bArr, generateOtsContext);
        return verifySignature(rVar, generateOtsContext);
    }

    public static boolean verifySignature(r rVar, byte[] bArr, byte[] bArr2) {
        l generateLMSContext = rVar.generateLMSContext(bArr);
        v.byteArray(bArr2, generateLMSContext);
        return verifySignature(rVar, generateLMSContext);
    }
}
