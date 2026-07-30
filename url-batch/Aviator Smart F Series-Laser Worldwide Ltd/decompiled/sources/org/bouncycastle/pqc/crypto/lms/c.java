package org.bouncycastle.pqc.crypto.lms;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;

/* loaded from: classes5.dex */
class c {

    static class a extends q {
        public a(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i8, byte[] bArr, int i9, byte[] bArr2) {
            super(lMSigParameters, lMOtsParameters, i8, bArr, i9, bArr2);
        }

        @Override // org.bouncycastle.pqc.crypto.lms.q
        h getNextOtsPrivateKey() {
            throw new RuntimeException("placeholder only");
        }

        @Override // org.bouncycastle.pqc.crypto.lms.q
        public r getPublicKey() {
            throw new RuntimeException("placeholder only");
        }
    }

    c() {
    }

    public static e generateHSSKeyPair(d dVar) {
        int i8;
        byte[] bArr;
        int depth = dVar.getDepth();
        q[] qVarArr = new q[depth];
        s[] sVarArr = new s[dVar.getDepth() - 1];
        byte[] bArr2 = new byte[32];
        dVar.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        dVar.getRandom().nextBytes(bArr3);
        byte[] bArr4 = new byte[0];
        long j8 = 1;
        int i9 = 0;
        while (i9 < depth) {
            if (i9 == 0) {
                qVarArr[i9] = new q(dVar.getLmsParameters()[i9].getLMSigParam(), dVar.getLmsParameters()[i9].getLMOTSParam(), 0, bArr3, 1 << dVar.getLmsParameters()[i9].getLMSigParam().getH(), bArr2);
                i8 = i9;
                bArr = bArr4;
            } else {
                i8 = i9;
                bArr = bArr4;
                qVarArr[i8] = new a(dVar.getLmsParameters()[i9].getLMSigParam(), dVar.getLmsParameters()[i9].getLMOTSParam(), -1, bArr, 1 << dVar.getLmsParameters()[i9].getLMSigParam().getH(), bArr);
            }
            j8 *= 1 << dVar.getLmsParameters()[i8].getLMSigParam().getH();
            i9 = i8 + 1;
            bArr4 = bArr;
        }
        if (j8 == 0) {
            j8 = Long.MAX_VALUE;
        }
        return new e(dVar.getDepth(), Arrays.asList(qVarArr), Arrays.asList(sVarArr), 0L, j8);
    }

    public static g generateSignature(int i8, l lVar) {
        return new g(i8 - 1, lVar.getSignedPubKeys(), k.generateSign(lVar));
    }

    public static void incrementIndex(e eVar) {
        synchronized (eVar) {
            rangeTestKeys(eVar);
            eVar.incIndex();
            eVar.getKeys().get(eVar.getL() - 1).incIndex();
        }
    }

    static void rangeTestKeys(e eVar) {
        synchronized (eVar) {
            try {
                if (eVar.getIndex() >= eVar.getIndexLimit()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("hss private key");
                    sb.append(eVar.isShard() ? " shard" : "");
                    sb.append(" is exhausted");
                    throw new ExhaustedPrivateKeyException(sb.toString());
                }
                int l8 = eVar.getL();
                List<q> keys = eVar.getKeys();
                int i8 = l8;
                while (true) {
                    int i9 = i8 - 1;
                    if (keys.get(i9).getIndex() != (1 << keys.get(i9).getSigParameters().getH())) {
                        while (i8 < l8) {
                            eVar.replaceConsumedKey(i8);
                            i8++;
                        }
                    } else {
                        if (i9 == 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("hss private key");
                            sb2.append(eVar.isShard() ? " shard" : "");
                            sb2.append(" is exhausted the maximum limit for this HSS private key");
                            throw new ExhaustedPrivateKeyException(sb2.toString());
                        }
                        i8 = i9;
                    }
                }
            } finally {
            }
        }
    }

    public static boolean verifySignature(f fVar, g gVar, byte[] bArr) {
        int i8 = gVar.getlMinus1();
        int i9 = i8 + 1;
        if (i9 != fVar.getL()) {
            return false;
        }
        s[] sVarArr = new s[i9];
        r[] rVarArr = new r[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            sVarArr[i10] = gVar.getSignedPubKey()[i10].getSignature();
            rVarArr[i10] = gVar.getSignedPubKey()[i10].getPublicKey();
        }
        sVarArr[i8] = gVar.getSignature();
        r lMSPublicKey = fVar.getLMSPublicKey();
        for (int i11 = 0; i11 < i8; i11++) {
            if (!k.verifySignature(lMSPublicKey, sVarArr[i11], rVarArr[i11].toByteArray())) {
                return false;
            }
            try {
                lMSPublicKey = rVarArr[i11];
            } catch (Exception e8) {
                throw new IllegalStateException(e8.getMessage(), e8);
            }
        }
        return k.verifySignature(lMSPublicKey, sVarArr[i8], bArr);
    }

    public static g generateSignature(e eVar, byte[] bArr) {
        q qVar;
        t[] tVarArr;
        int l8 = eVar.getL();
        synchronized (eVar) {
            try {
                rangeTestKeys(eVar);
                List<q> keys = eVar.getKeys();
                List<s> sig = eVar.getSig();
                int i8 = l8 - 1;
                qVar = eVar.getKeys().get(i8);
                tVarArr = new t[i8];
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = i9 + 1;
                    tVarArr[i9] = new t(sig.get(i9), keys.get(i10).getPublicKey());
                    i9 = i10;
                }
                eVar.incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        l withSignedPublicKeys = qVar.generateLMSContext().withSignedPublicKeys(tVarArr);
        withSignedPublicKeys.update(bArr, 0, bArr.length);
        return generateSignature(l8, withSignedPublicKeys);
    }
}
