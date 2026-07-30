package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class e {
    private int degree;
    private int polynomial;

    public e(int i8) {
        this.degree = 0;
        if (i8 >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i8 < 1) {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.degree = i8;
        this.polynomial = n.getIrreduciblePolynomial(i8);
    }

    private static String polyToString(int i8) {
        if (i8 == 0) {
            return "0";
        }
        String str = ((byte) (i8 & 1)) == 1 ? "1" : "";
        int i9 = i8 >>> 1;
        int i10 = 1;
        while (i9 != 0) {
            if (((byte) (i9 & 1)) == 1) {
                str = str + "+x^" + i10;
            }
            i9 >>>= 1;
            i10++;
        }
        return str;
    }

    public int add(int i8, int i9) {
        return i8 ^ i9;
    }

    public String elementToStr(int i8) {
        StringBuilder sb;
        String str;
        String str2 = "";
        for (int i9 = 0; i9 < this.degree; i9++) {
            if ((((byte) i8) & 1) == 0) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = "1";
            }
            sb.append(str);
            sb.append(str2);
            str2 = sb.toString();
            i8 >>>= 1;
        }
        return str2;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            if (this.degree == eVar.degree && this.polynomial == eVar.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i8, int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i8 == 0) {
            return 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i9 < 0) {
            i8 = inverse(i8);
            i9 = -i9;
        }
        int i10 = 1;
        while (i9 != 0) {
            if ((i9 & 1) == 1) {
                i10 = mult(i10, i8);
            }
            i8 = mult(i8, i8);
            i9 >>>= 1;
        }
        return i10;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return j.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return p.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(org.bouncycastle.crypto.d.getSecureRandom());
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i8) {
        return exp(i8, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i8) {
        int i9 = this.degree;
        return i9 == 31 ? i8 >= 0 : i8 >= 0 && i8 < (1 << i9);
    }

    public int mult(int i8, int i9) {
        return n.modMultiply(i8, i9, this.polynomial);
    }

    public int sqRoot(int i8) {
        for (int i9 = 1; i9 < this.degree; i9++) {
            i8 = mult(i8, i8);
        }
        return i8;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.degree + ") = GF(2)[X]/<" + polyToString(this.polynomial) + "> ";
    }

    public e(int i8, int i9) {
        this.degree = 0;
        if (i8 != n.degree(i9)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!n.isIrreducible(i9)) {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.degree = i8;
        this.polynomial = i9;
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int nextInt = p.nextInt(secureRandom, 1 << this.degree);
        int i8 = 0;
        while (nextInt == 0 && i8 < 1048576) {
            nextInt = p.nextInt(secureRandom, 1 << this.degree);
            i8++;
        }
        if (i8 == 1048576) {
            return 1;
        }
        return nextInt;
    }

    public e(e eVar) {
        this.degree = 0;
        this.degree = eVar.degree;
        this.polynomial = eVar.polynomial;
    }

    public e(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int OS2IP = j.OS2IP(bArr);
        this.polynomial = OS2IP;
        if (!n.isIrreducible(OS2IP)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.degree = n.degree(this.polynomial);
    }
}
