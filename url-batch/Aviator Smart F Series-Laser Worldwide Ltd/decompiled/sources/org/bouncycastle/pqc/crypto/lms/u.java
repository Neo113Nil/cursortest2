package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
class u {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_LEN = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    u() {
    }

    public static int cksm(byte[] bArr, int i8, LMOtsParameters lMOtsParameters) {
        int w7 = (1 << lMOtsParameters.getW()) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < (i8 * 8) / lMOtsParameters.getW(); i10++) {
            i9 = (i9 + w7) - coef(bArr, i10, lMOtsParameters.getW());
        }
        return i9 << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i8, int i9) {
        int i10 = (i8 * i9) / 8;
        return (bArr[i10] >>> (((~i8) & ((8 / i9) - 1)) * i9)) & ((1 << i9) - 1);
    }

    public static j lm_ots_generate_signature(h hVar, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = hVar.getParameter();
        int n8 = parameter.getN();
        int p8 = parameter.getP();
        int w7 = parameter.getW();
        byte[] bArr3 = new byte[p8 * n8];
        org.bouncycastle.crypto.e digest = b.getDigest(parameter.getDigestOID());
        w derivationFunction = hVar.getDerivationFunction();
        int cksm = cksm(bArr, n8, parameter);
        bArr[n8] = (byte) ((cksm >>> 8) & 255);
        bArr[n8 + 1] = (byte) cksm;
        int i8 = n8 + 23;
        byte[] build = a.compose().bytes(hVar.getI()).u32str(hVar.getQ()).padUntil(0, i8).build();
        derivationFunction.setJ(0);
        int i9 = 0;
        while (i9 < p8) {
            org.bouncycastle.util.i.shortToBigEndian((short) i9, build, 20);
            int i10 = 23;
            derivationFunction.deriveSeed(build, i9 < p8 + (-1), 23);
            int coef = coef(bArr, i9, w7);
            for (int i11 = 0; i11 < coef; i11++) {
                build[22] = (byte) i11;
                digest.update(build, 0, i8);
                i10 = 23;
                digest.doFinal(build, 23);
            }
            System.arraycopy(build, i10, bArr3, n8 * i9, n8);
            i9++;
        }
        return new j(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(i iVar, j jVar, byte[] bArr, boolean z7) {
        if (jVar.getType().equals(iVar.getParameter())) {
            return org.bouncycastle.util.a.areEqual(lm_ots_validate_signature_calculate(iVar, jVar, bArr), iVar.getK());
        }
        throw new LMSException("public key and signature ots types do not match");
    }

    public static byte[] lm_ots_validate_signature_calculate(i iVar, j jVar, byte[] bArr) {
        l createOtsContext = iVar.createOtsContext(jVar);
        v.byteArray(bArr, createOtsContext);
        return lm_ots_validate_signature_calculate(createOtsContext);
    }

    public static i lms_ots_generatePublicKey(h hVar) {
        return new i(hVar.getParameter(), hVar.getI(), hVar.getQ(), lms_ots_generatePublicKey(hVar.getParameter(), hVar.getI(), hVar.getQ(), hVar.getMasterSecret()));
    }

    public static j lm_ots_generate_signature(LMSigParameters lMSigParameters, h hVar, byte[][] bArr, byte[] bArr2, boolean z7) {
        byte[] bArr3;
        byte[] bArr4 = new byte[34];
        if (z7) {
            bArr3 = new byte[32];
            System.arraycopy(bArr2, 0, bArr4, 0, hVar.getParameter().getN());
        } else {
            l signatureContext = hVar.getSignatureContext(lMSigParameters, bArr);
            v.byteArray(bArr2, 0, bArr2.length, signatureContext);
            bArr3 = signatureContext.getC();
            bArr4 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(hVar, bArr4, bArr3);
    }

    public static byte[] lm_ots_validate_signature_calculate(l lVar) {
        i publicKey = lVar.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lVar.getSignature();
        j otsSignature = signature instanceof s ? ((s) signature).getOtsSignature() : (j) signature;
        int n8 = parameter.getN();
        int w7 = parameter.getW();
        int p8 = parameter.getP();
        byte[] q8 = lVar.getQ();
        int cksm = cksm(q8, n8, parameter);
        q8[n8] = (byte) ((cksm >>> 8) & 255);
        q8[n8 + 1] = (byte) cksm;
        byte[] i8 = publicKey.getI();
        int q9 = publicKey.getQ();
        org.bouncycastle.crypto.e digest = b.getDigest(parameter.getDigestOID());
        v.byteArray(i8, digest);
        v.u32str(q9, digest);
        v.u16str(D_PBLC, digest);
        a u32str = a.compose().bytes(i8).u32str(q9);
        int i9 = n8 + 23;
        byte[] build = u32str.padUntil(0, i9).build();
        int i10 = (1 << w7) - 1;
        byte[] y7 = otsSignature.getY();
        org.bouncycastle.crypto.e digest2 = b.getDigest(parameter.getDigestOID());
        for (int i11 = 0; i11 < p8; i11++) {
            org.bouncycastle.util.i.shortToBigEndian((short) i11, build, 20);
            System.arraycopy(y7, i11 * n8, build, 23, n8);
            for (int coef = coef(q8, i11, w7); coef < i10; coef++) {
                build[22] = (byte) coef;
                digest2.update(build, 0, i9);
                digest2.doFinal(build, 23);
            }
            digest.update(build, 23, n8);
        }
        byte[] bArr = new byte[n8];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i8, byte[] bArr2) {
        org.bouncycastle.crypto.e digest = b.getDigest(lMOtsParameters.getDigestOID());
        byte[] build = a.compose().bytes(bArr).u32str(i8).u16str(-32640).padUntil(0, 22).build();
        digest.update(build, 0, build.length);
        org.bouncycastle.crypto.e digest2 = b.getDigest(lMOtsParameters.getDigestOID());
        byte[] build2 = a.compose().bytes(bArr).u32str(i8).padUntil(0, digest2.getDigestSize() + 23).build();
        w wVar = new w(bArr, bArr2, b.getDigest(lMOtsParameters.getDigestOID()));
        wVar.setQ(i8);
        wVar.setJ(0);
        int p8 = lMOtsParameters.getP();
        int n8 = lMOtsParameters.getN();
        int w7 = (1 << lMOtsParameters.getW()) - 1;
        int i9 = 0;
        while (i9 < p8) {
            wVar.deriveSeed(build2, i9 < p8 + (-1), 23);
            org.bouncycastle.util.i.shortToBigEndian((short) i9, build2, 20);
            for (int i10 = 0; i10 < w7; i10++) {
                build2[22] = (byte) i10;
                digest2.update(build2, 0, build2.length);
                digest2.doFinal(build2, 23);
            }
            digest.update(build2, 23, n8);
            i9++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
