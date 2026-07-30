package e7;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class a {
    private short[][][] coeff_alpha;
    private short[][][] coeff_beta;
    private short[] coeff_eta;
    private short[][] coeff_gamma;
    private int oi;
    private int vi;
    private int viNext;

    public a(byte b8, byte b9, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i8 = b8 & 255;
        this.vi = i8;
        int i9 = b9 & 255;
        this.viNext = i9;
        this.oi = i9 - i8;
        this.coeff_alpha = sArr;
        this.coeff_beta = sArr2;
        this.coeff_gamma = sArr3;
        this.coeff_eta = sArr4;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.vi == aVar.getVi() && this.viNext == aVar.getViNext() && this.oi == aVar.getOi() && org.bouncycastle.pqc.crypto.rainbow.util.b.equals(this.coeff_alpha, aVar.getCoeffAlpha()) && org.bouncycastle.pqc.crypto.rainbow.util.b.equals(this.coeff_beta, aVar.getCoeffBeta()) && org.bouncycastle.pqc.crypto.rainbow.util.b.equals(this.coeff_gamma, aVar.getCoeffGamma()) && org.bouncycastle.pqc.crypto.rainbow.util.b.equals(this.coeff_eta, aVar.getCoeffEta());
    }

    public short[][][] getCoeffAlpha() {
        return this.coeff_alpha;
    }

    public short[][][] getCoeffBeta() {
        return this.coeff_beta;
    }

    public short[] getCoeffEta() {
        return this.coeff_eta;
    }

    public short[][] getCoeffGamma() {
        return this.coeff_gamma;
    }

    public int getOi() {
        return this.oi;
    }

    public int getVi() {
        return this.vi;
    }

    public int getViNext() {
        return this.viNext;
    }

    public int hashCode() {
        return (((((((((((this.vi * 37) + this.viNext) * 37) + this.oi) * 37) + org.bouncycastle.util.a.hashCode(this.coeff_alpha)) * 37) + org.bouncycastle.util.a.hashCode(this.coeff_beta)) * 37) + org.bouncycastle.util.a.hashCode(this.coeff_gamma)) * 37) + org.bouncycastle.util.a.hashCode(this.coeff_eta);
    }

    public short[][] plugInVinegars(short[] sArr) {
        int i8 = this.oi;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i8, i8 + 1);
        short[] sArr3 = new short[this.oi];
        int i9 = 0;
        for (int i10 = 0; i10 < this.oi; i10++) {
            for (int i11 = 0; i11 < this.vi; i11++) {
                for (int i12 = 0; i12 < this.vi; i12++) {
                    sArr3[i10] = org.bouncycastle.pqc.crypto.rainbow.util.a.addElem(sArr3[i10], org.bouncycastle.pqc.crypto.rainbow.util.a.multElem(org.bouncycastle.pqc.crypto.rainbow.util.a.multElem(this.coeff_beta[i10][i11][i12], sArr[i11]), sArr[i12]));
                }
            }
        }
        for (int i13 = 0; i13 < this.oi; i13++) {
            for (int i14 = 0; i14 < this.oi; i14++) {
                for (int i15 = 0; i15 < this.vi; i15++) {
                    short multElem = org.bouncycastle.pqc.crypto.rainbow.util.a.multElem(this.coeff_alpha[i13][i14][i15], sArr[i15]);
                    short[] sArr4 = sArr2[i13];
                    sArr4[i14] = org.bouncycastle.pqc.crypto.rainbow.util.a.addElem(sArr4[i14], multElem);
                }
            }
        }
        for (int i16 = 0; i16 < this.oi; i16++) {
            for (int i17 = 0; i17 < this.vi; i17++) {
                sArr3[i16] = org.bouncycastle.pqc.crypto.rainbow.util.a.addElem(sArr3[i16], org.bouncycastle.pqc.crypto.rainbow.util.a.multElem(this.coeff_gamma[i16][i17], sArr[i17]));
            }
        }
        for (int i18 = 0; i18 < this.oi; i18++) {
            for (int i19 = this.vi; i19 < this.viNext; i19++) {
                short[] sArr5 = sArr2[i18];
                int i20 = this.vi;
                sArr5[i19 - i20] = org.bouncycastle.pqc.crypto.rainbow.util.a.addElem(this.coeff_gamma[i18][i19], sArr5[i19 - i20]);
            }
        }
        for (int i21 = 0; i21 < this.oi; i21++) {
            sArr3[i21] = org.bouncycastle.pqc.crypto.rainbow.util.a.addElem(sArr3[i21], this.coeff_eta[i21]);
        }
        while (true) {
            int i22 = this.oi;
            if (i9 >= i22) {
                return sArr2;
            }
            sArr2[i9][i22] = sArr3[i9];
            i9++;
        }
    }

    public a(int i8, int i9, SecureRandom secureRandom) {
        this.vi = i8;
        this.viNext = i9;
        int i10 = i9 - i8;
        this.oi = i10;
        int[] iArr = {i10, i10, i8};
        Class cls = Short.TYPE;
        this.coeff_alpha = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        int i11 = this.oi;
        int i12 = this.vi;
        this.coeff_beta = (short[][][]) Array.newInstance((Class<?>) cls, i11, i12, i12);
        this.coeff_gamma = (short[][]) Array.newInstance((Class<?>) cls, this.oi, this.viNext);
        int i13 = this.oi;
        this.coeff_eta = new short[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < this.oi; i15++) {
                for (int i16 = 0; i16 < this.vi; i16++) {
                    this.coeff_alpha[i14][i15][i16] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i17 = 0; i17 < i13; i17++) {
            for (int i18 = 0; i18 < this.vi; i18++) {
                for (int i19 = 0; i19 < this.vi; i19++) {
                    this.coeff_beta[i17][i18][i19] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i20 = 0; i20 < i13; i20++) {
            for (int i21 = 0; i21 < this.viNext; i21++) {
                this.coeff_gamma[i20][i21] = (short) (secureRandom.nextInt() & 255);
            }
        }
        for (int i22 = 0; i22 < i13; i22++) {
            this.coeff_eta[i22] = (short) (secureRandom.nextInt() & 255);
        }
    }
}
