package org.bouncycastle.pqc.crypto.crystals.dilithium;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes10.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i = 0; i < this.dilithiumK; i++) {
            this.mat[i] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        String str = "[";
        int i = 0;
        while (i < this.dilithiumK) {
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str + "Outer Matrix " + i + " [");
            m.append(this.mat[i].toString());
            String sb = m.toString();
            str = i == this.dilithiumK + (-1) ? sb.concat("]\n") : sb.concat("],\n");
            i++;
        }
        return str.concat("]\n");
    }

    public void expandMatrix(byte[] bArr) {
        for (int i = 0; i < this.dilithiumK; i++) {
            for (int i2 = 0; i2 < this.dilithiumL; i2++) {
                this.mat[i].getVectorIndex(i2).uniformBlocks(bArr, (short) ((i << 8) + i2));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumK; i++) {
            polyVecK.getVectorIndex(i).pointwiseAccountMontgomery(this.mat[i], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
