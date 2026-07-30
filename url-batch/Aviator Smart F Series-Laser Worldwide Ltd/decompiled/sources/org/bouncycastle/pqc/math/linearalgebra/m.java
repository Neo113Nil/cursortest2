package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class m {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';
    private int[] coefficients;
    private int degree;
    private e field;

    public m(e eVar) {
        this.field = eVar;
        this.degree = -1;
        this.coefficients = new int[1];
    }

    private static int computeDegree(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private int[] createRandomIrreduciblePolynomial(int i8, SecureRandom secureRandom) {
        int[] iArr = new int[i8 + 1];
        iArr[i8] = 1;
        iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
        for (int i9 = 1; i9 < i8; i9++) {
            iArr[i9] = this.field.getRandomElement(secureRandom);
        }
        while (!isIrreducible(iArr)) {
            int nextInt = p.nextInt(secureRandom, i8);
            if (nextInt == 0) {
                iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
            } else {
                iArr[nextInt] = this.field.getRandomElement(secureRandom);
            }
        }
        return iArr;
    }

    private static int headCoefficient(int[] iArr) {
        int computeDegree = computeDegree(iArr);
        if (computeDegree == -1) {
            return 0;
        }
        return iArr[computeDegree];
    }

    private static boolean isEqual(int[] iArr, int[] iArr2) {
        int computeDegree = computeDegree(iArr);
        if (computeDegree != computeDegree(iArr2)) {
            return false;
        }
        for (int i8 = 0; i8 <= computeDegree; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private boolean isIrreducible(int[] iArr) {
        if (iArr[0] == 0) {
            return false;
        }
        int computeDegree = computeDegree(iArr) >> 1;
        int[] iArr2 = {0, 1};
        int[] iArr3 = {0, 1};
        int degree = this.field.getDegree();
        for (int i8 = 0; i8 < computeDegree; i8++) {
            for (int i9 = degree - 1; i9 >= 0; i9--) {
                iArr2 = modMultiply(iArr2, iArr2, iArr);
            }
            iArr2 = normalForm(iArr2);
            if (computeDegree(gcd(add(iArr2, iArr3), iArr)) != 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] normalForm(int[] iArr) {
        int computeDegree = computeDegree(iArr);
        if (computeDegree == -1) {
            return new int[1];
        }
        int i8 = computeDegree + 1;
        if (iArr.length == i8) {
            return h.clone(iArr);
        }
        int[] iArr2 = new int[i8];
        System.arraycopy(iArr, 0, iArr2, 0, i8);
        return iArr2;
    }

    public m add(m mVar) {
        return new m(this.field, add(this.coefficients, mVar.coefficients));
    }

    public m addMonomial(int i8) {
        int[] iArr = new int[i8 + 1];
        iArr[i8] = 1;
        return new m(this.field, add(this.coefficients, iArr));
    }

    public void addToThis(m mVar) {
        this.coefficients = add(this.coefficients, mVar.coefficients);
        computeDegree();
    }

    public m[] div(m mVar) {
        int[][] div = div(this.coefficients, mVar.coefficients);
        return new m[]{new m(this.field, div[0]), new m(this.field, div[1])};
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (this.field.equals(mVar.field) && this.degree == mVar.degree && isEqual(this.coefficients, mVar.coefficients)) {
                return true;
            }
        }
        return false;
    }

    public int evaluateAt(int i8) {
        int[] iArr = this.coefficients;
        int i9 = this.degree;
        int i10 = iArr[i9];
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            i10 = this.field.mult(i10, i8) ^ this.coefficients[i11];
        }
        return i10;
    }

    public m gcd(m mVar) {
        return new m(this.field, gcd(this.coefficients, mVar.coefficients));
    }

    public int getCoefficient(int i8) {
        if (i8 < 0 || i8 > this.degree) {
            return 0;
        }
        return this.coefficients[i8];
    }

    public int getDegree() {
        int[] iArr = this.coefficients;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] getEncoded() {
        int i8 = 8;
        int i9 = 1;
        while (this.field.getDegree() > i8) {
            i9++;
            i8 += 8;
        }
        byte[] bArr = new byte[this.coefficients.length * i9];
        int i10 = 0;
        for (int i11 = 0; i11 < this.coefficients.length; i11++) {
            int i12 = 0;
            while (i12 < i8) {
                bArr[i10] = (byte) (this.coefficients[i11] >>> i12);
                i12 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public int getHeadCoefficient() {
        int i8 = this.degree;
        if (i8 == -1) {
            return 0;
        }
        return this.coefficients[i8];
    }

    public int hashCode() {
        int hashCode = this.field.hashCode();
        int i8 = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i8 >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i8];
            i8++;
        }
    }

    public m mod(m mVar) {
        return new m(this.field, mod(this.coefficients, mVar.coefficients));
    }

    public m modDiv(m mVar, m mVar2) {
        return new m(this.field, modDiv(this.coefficients, mVar.coefficients, mVar2.coefficients));
    }

    public m modInverse(m mVar) {
        return new m(this.field, modDiv(new int[]{1}, this.coefficients, mVar.coefficients));
    }

    public m modMultiply(m mVar, m mVar2) {
        return new m(this.field, modMultiply(this.coefficients, mVar.coefficients, mVar2.coefficients));
    }

    public m[] modPolynomialToFracton(m mVar) {
        int i8 = mVar.degree >> 1;
        int[] normalForm = normalForm(mVar.coefficients);
        int[] mod = mod(this.coefficients, mVar.coefficients);
        int[] iArr = {0};
        int[] iArr2 = {1};
        while (computeDegree(mod) > i8) {
            int[][] div = div(normalForm, mod);
            int[] iArr3 = div[1];
            int[] add = add(iArr, modMultiply(div[0], iArr2, mVar.coefficients));
            iArr = iArr2;
            iArr2 = add;
            normalForm = mod;
            mod = iArr3;
        }
        return new m[]{new m(this.field, mod), new m(this.field, iArr2)};
    }

    public m modSquareMatrix(m[] mVarArr) {
        int length = mVarArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i8 = 0;
        while (true) {
            int[] iArr3 = this.coefficients;
            if (i8 >= iArr3.length) {
                break;
            }
            e eVar = this.field;
            int i9 = iArr3[i8];
            iArr2[i8] = eVar.mult(i9, i9);
            i8++;
        }
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr4 = mVarArr[i11].coefficients;
                if (i10 < iArr4.length) {
                    iArr[i10] = this.field.add(iArr[i10], this.field.mult(iArr4[i10], iArr2[i11]));
                }
            }
        }
        return new m(this.field, iArr);
    }

    public m modSquareRoot(m mVar) {
        int[] clone = h.clone(this.coefficients);
        int[] modMultiply = modMultiply(clone, clone, mVar.coefficients);
        while (!isEqual(modMultiply, this.coefficients)) {
            clone = normalForm(modMultiply);
            modMultiply = modMultiply(clone, clone, mVar.coefficients);
        }
        return new m(this.field, clone);
    }

    public m modSquareRootMatrix(m[] mVarArr) {
        int length = mVarArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            for (int i9 = 0; i9 < length; i9++) {
                int[] iArr2 = mVarArr[i9].coefficients;
                if (i8 < iArr2.length) {
                    int[] iArr3 = this.coefficients;
                    if (i9 < iArr3.length) {
                        iArr[i8] = this.field.add(iArr[i8], this.field.mult(iArr2[i8], iArr3[i9]));
                    }
                }
            }
        }
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.field.sqRoot(iArr[i10]);
        }
        return new m(this.field, iArr);
    }

    public void multThisWithElement(int i8) {
        if (!this.field.isElementOfThisField(i8)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.coefficients = multWithElement(this.coefficients, i8);
        computeDegree();
    }

    public m multWithElement(int i8) {
        if (!this.field.isElementOfThisField(i8)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new m(this.field, multWithElement(this.coefficients, i8));
    }

    public m multWithMonomial(int i8) {
        return new m(this.field, multWithMonomial(this.coefficients, i8));
    }

    public m multiply(m mVar) {
        return new m(this.field, multiply(this.coefficients, mVar.coefficients));
    }

    public String toString() {
        String str = " Polynomial over " + this.field.toString() + ": \n";
        for (int i8 = 0; i8 < this.coefficients.length; i8++) {
            str = str + this.field.elementToStr(this.coefficients[i8]) + "Y^" + i8 + "+";
        }
        return str + ";";
    }

    public m(e eVar, int i8) {
        this.field = eVar;
        this.degree = i8;
        int[] iArr = new int[i8 + 1];
        this.coefficients = iArr;
        iArr[i8] = 1;
    }

    private int[] add(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.field.add(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private void computeDegree() {
        int length = this.coefficients.length;
        do {
            this.degree = length - 1;
            length = this.degree;
            if (length < 0) {
                return;
            }
        } while (this.coefficients[length] == 0);
    }

    private int[][] div(int[] iArr, int[] iArr2) {
        int computeDegree = computeDegree(iArr2);
        int computeDegree2 = computeDegree(iArr) + 1;
        if (computeDegree == -1) {
            throw new ArithmeticException("Division by zero.");
        }
        int[][] iArr3 = {new int[1], new int[computeDegree2]};
        int inverse = this.field.inverse(headCoefficient(iArr2));
        iArr3[0][0] = 0;
        int[] iArr4 = iArr3[1];
        System.arraycopy(iArr, 0, iArr4, 0, iArr4.length);
        while (computeDegree <= computeDegree(iArr3[1])) {
            int[] iArr5 = {this.field.mult(headCoefficient(iArr3[1]), inverse)};
            int[] multWithElement = multWithElement(iArr2, iArr5[0]);
            int computeDegree3 = computeDegree(iArr3[1]) - computeDegree;
            int[] multWithMonomial = multWithMonomial(multWithElement, computeDegree3);
            iArr3[0] = add(multWithMonomial(iArr5, computeDegree3), iArr3[0]);
            iArr3[1] = add(multWithMonomial, iArr3[1]);
        }
        return iArr3;
    }

    private int[] gcd(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) == -1) {
            return iArr2;
        }
        while (computeDegree(iArr2) != -1) {
            int[] mod = mod(iArr, iArr2);
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            int length2 = mod.length;
            int[] iArr4 = new int[length2];
            System.arraycopy(mod, 0, iArr4, 0, length2);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        return multWithElement(iArr, this.field.inverse(headCoefficient(iArr)));
    }

    private int[] mod(int[] iArr, int[] iArr2) {
        int computeDegree = computeDegree(iArr2);
        if (computeDegree == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int length = iArr.length;
        int[] iArr3 = new int[length];
        int inverse = this.field.inverse(headCoefficient(iArr2));
        System.arraycopy(iArr, 0, iArr3, 0, length);
        while (computeDegree <= computeDegree(iArr3)) {
            iArr3 = add(multWithElement(multWithMonomial(iArr2, computeDegree(iArr3) - computeDegree), this.field.mult(headCoefficient(iArr3), inverse)), iArr3);
        }
        return iArr3;
    }

    private int[] modDiv(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] normalForm = normalForm(iArr3);
        int[] mod = mod(iArr2, iArr3);
        int[] iArr4 = {0};
        int[] mod2 = mod(iArr, iArr3);
        while (computeDegree(mod) != -1) {
            int[][] div = div(normalForm, mod);
            int[] normalForm2 = normalForm(mod);
            int[] normalForm3 = normalForm(div[1]);
            int[] add = add(iArr4, modMultiply(div[0], mod2, iArr3));
            iArr4 = normalForm(mod2);
            mod2 = normalForm(add);
            normalForm = normalForm2;
            mod = normalForm3;
        }
        return multWithElement(iArr4, this.field.inverse(headCoefficient(normalForm)));
    }

    private int[] modMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        return mod(multiply(iArr, iArr2), iArr3);
    }

    private int[] multWithElement(int[] iArr, int i8) {
        int computeDegree = computeDegree(iArr);
        if (computeDegree == -1 || i8 == 0) {
            return new int[1];
        }
        if (i8 == 1) {
            return h.clone(iArr);
        }
        int[] iArr2 = new int[computeDegree + 1];
        while (computeDegree >= 0) {
            iArr2[computeDegree] = this.field.mult(iArr[computeDegree], i8);
            computeDegree--;
        }
        return iArr2;
    }

    private static int[] multWithMonomial(int[] iArr, int i8) {
        int computeDegree = computeDegree(iArr);
        if (computeDegree == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[computeDegree + i8 + 1];
        System.arraycopy(iArr, 0, iArr2, i8, computeDegree + 1);
        return iArr2;
    }

    private int[] multiply(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) < computeDegree(iArr2)) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] normalForm = normalForm(iArr);
        int[] normalForm2 = normalForm(iArr2);
        if (normalForm2.length == 1) {
            return multWithElement(normalForm, normalForm2[0]);
        }
        int length = normalForm.length;
        int length2 = normalForm2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        if (length2 != length) {
            int[] iArr4 = new int[length2];
            int i8 = length - length2;
            int[] iArr5 = new int[i8];
            System.arraycopy(normalForm, 0, iArr4, 0, length2);
            System.arraycopy(normalForm, length2, iArr5, 0, i8);
            return add(multiply(iArr4, normalForm2), multWithMonomial(multiply(iArr5, normalForm2), length2));
        }
        int i9 = (length + 1) >>> 1;
        int i10 = length - i9;
        int[] iArr6 = new int[i9];
        int[] iArr7 = new int[i9];
        int[] iArr8 = new int[i10];
        int[] iArr9 = new int[i10];
        System.arraycopy(normalForm, 0, iArr6, 0, i9);
        System.arraycopy(normalForm, i9, iArr8, 0, i10);
        System.arraycopy(normalForm2, 0, iArr7, 0, i9);
        System.arraycopy(normalForm2, i9, iArr9, 0, i10);
        int[] add = add(iArr6, iArr8);
        int[] add2 = add(iArr7, iArr9);
        int[] multiply = multiply(iArr6, iArr7);
        int[] multiply2 = multiply(add, add2);
        int[] multiply3 = multiply(iArr8, iArr9);
        return add(multWithMonomial(add(add(add(multiply2, multiply), multiply3), multWithMonomial(multiply3, i9)), i9), multiply);
    }

    public m(e eVar, int i8, char c8, SecureRandom secureRandom) {
        this.field = eVar;
        if (c8 == 'I') {
            this.coefficients = createRandomIrreduciblePolynomial(i8, secureRandom);
            computeDegree();
        } else {
            throw new IllegalArgumentException(" Error: type " + c8 + " is not defined for GF2smallmPolynomial");
        }
    }

    public m(e eVar, byte[] bArr) {
        this.field = eVar;
        int i8 = 8;
        int i9 = 1;
        while (eVar.getDegree() > i8) {
            i9++;
            i8 += 8;
        }
        if (bArr.length % i9 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.coefficients = new int[bArr.length / i9];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i10 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                computeDegree();
                return;
            }
            int i12 = 0;
            while (i12 < i8) {
                int[] iArr2 = this.coefficients;
                iArr2[i10] = ((bArr[i11] & 255) << i12) ^ iArr2[i10];
                i12 += 8;
                i11++;
            }
            if (!this.field.isElementOfThisField(this.coefficients[i10])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i10++;
        }
    }

    public m(e eVar, int[] iArr) {
        this.field = eVar;
        this.coefficients = normalForm(iArr);
        computeDegree();
    }

    public m(f fVar) {
        this(fVar.getField(), fVar.getIntArrayForm());
    }

    public m(m mVar) {
        this.field = mVar.field;
        this.degree = mVar.degree;
        this.coefficients = h.clone(mVar.coefficients);
    }
}
