package org.bouncycastle.pqc.crypto.slhdsa;

import java.math.BigInteger;
import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
class Fors {
    SLHDSAEngine engine;

    public Fors(SLHDSAEngine sLHDSAEngine) {
        this.engine = sLHDSAEngine;
    }

    public static int[] base2B(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        BigInteger bigInteger = BigInteger.ZERO;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            while (i4 < i) {
                bigInteger = bigInteger.shiftLeft(8).add(BigInteger.valueOf(bArr[i3] & 255));
                i3++;
                i4 += 8;
            }
            i4 -= i;
            iArr[i5] = bigInteger.shiftRight(i4).mod(BigInteger.valueOf(2L).pow(i)).intValue();
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i;
        int i2 = 2;
        byte[][] bArr3 = new byte[2][];
        SLHDSAEngine sLHDSAEngine = this.engine;
        int i3 = sLHDSAEngine.K;
        byte[][] bArr4 = new byte[i3][];
        int i4 = sLHDSAEngine.T;
        int[] base2B = base2B(bArr, sLHDSAEngine.A, i3);
        int i5 = 0;
        while (i5 < this.engine.K) {
            int i6 = base2B[i5];
            byte[] sk = sig_forsArr[i5].getSK();
            adrs.setTreeHeight(0);
            int i7 = (i5 * i4) + i6;
            adrs.setTreeIndex(i7);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i5].getAuthPath();
            adrs.setTreeIndex(i7);
            int i8 = 0;
            while (i8 < this.engine.A) {
                int i9 = i8 + 1;
                adrs.setTreeHeight(i9);
                if ((i6 / (1 << i8)) % i2 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i2);
                    i = i2;
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i8]);
                } else {
                    i = i2;
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i8], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i8 = i9;
                i2 = i;
            }
            bArr4[i5] = bArr3[0];
            i5++;
            i2 = i2;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SLHDSAEngine sLHDSAEngine = fors.engine;
        int[] base2B = base2B(bArr, sLHDSAEngine.A, sLHDSAEngine.K);
        SLHDSAEngine sLHDSAEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sLHDSAEngine2.K];
        int i = sLHDSAEngine2.T;
        int i2 = 0;
        while (i2 < fors.engine.K) {
            int i3 = base2B[i2];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i4 = i2 * i;
            adrs2.setTreeIndex(i4 + i3);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] PRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i5 = 0;
            while (i5 < fors.engine.A) {
                int i6 = 1 << i5;
                bArr6[i5] = fors.treehash(bArr4, (((i3 / i6) ^ 1) * i6) + i4, i5, bArr5, adrs2);
                i5++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i2] = new SIG_FORS(PRF, bArr6);
            i2++;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        if (((i >>> i2) << i2) != i) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i3 = 0; i3 < (1 << i2); i3++) {
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i4 = i + i3;
            adrs2.setTreeIndex(i4);
            byte[] PRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] F = this.engine.F(bArr2, adrs2, PRF);
            adrs2.setTreeHeight(1);
            int i5 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i5) {
                i4 = (i4 - 1) / 2;
                adrs2.setTreeIndex(i4);
                F = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, F);
                i5++;
                adrs2.setTreeHeight(i5);
            }
            linkedList.add(0, new NodeEntry(F, i5));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
