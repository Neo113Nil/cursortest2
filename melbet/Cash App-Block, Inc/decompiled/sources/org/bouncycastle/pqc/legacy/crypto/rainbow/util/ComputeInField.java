package org.bouncycastle.pqc.legacy.crypto.rainbow.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.Array;

/* loaded from: classes10.dex */
public class ComputeInField {
    private short[][] A;
    short[] x;

    private void computeZerosAbove() {
        for (int length = this.A.length - 1; length > 0; length--) {
            for (int i = length - 1; i >= 0; i--) {
                short[][] sArr = this.A;
                short s = sArr[i][length];
                short invElem = GF2Field.invElem(sArr[length][length]);
                if (invElem == 0) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("The matrix is not invertible");
                    return;
                }
                int i2 = length;
                while (true) {
                    short[][] sArr2 = this.A;
                    if (i2 < sArr2.length * 2) {
                        short multElem = GF2Field.multElem(s, GF2Field.multElem(sArr2[length][i2], invElem));
                        short[] sArr3 = this.A[i];
                        sArr3[i2] = GF2Field.addElem(sArr3[i2], multElem);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void computeZerosUnder(boolean z) {
        short[][] sArr = this.A;
        int length = z ? sArr.length * 2 : sArr.length + 1;
        int i = 0;
        while (i < this.A.length - 1) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                short[][] sArr2 = this.A;
                if (i3 < sArr2.length) {
                    short s = sArr2[i3][i];
                    short invElem = GF2Field.invElem(sArr2[i][i]);
                    if (invElem == 0) {
                        a$$ExternalSyntheticBUOutline0.m$1("Matrix not invertible! We have to choose another one!");
                        return;
                    }
                    for (int i4 = i; i4 < length; i4++) {
                        short multElem = GF2Field.multElem(s, GF2Field.multElem(this.A[i][i4], invElem));
                        short[] sArr3 = this.A[i3];
                        sArr3[i4] = GF2Field.addElem(sArr3[i4], multElem);
                    }
                    i3++;
                }
            }
        }
    }

    private void substitute() {
        String str;
        short[][] sArr;
        short invElem = GF2Field.invElem(this.A[r0.length - 1][r0.length - 1]);
        if (invElem != 0) {
            short[] sArr2 = this.x;
            short[][] sArr3 = this.A;
            sArr2[sArr3.length - 1] = GF2Field.multElem(sArr3[sArr3.length - 1][sArr3.length], invElem);
            for (int length = this.A.length - 2; length >= 0; length--) {
                short[][] sArr4 = this.A;
                short s = sArr4[length][sArr4.length];
                int length2 = sArr4.length;
                while (true) {
                    length2--;
                    sArr = this.A;
                    if (length2 <= length) {
                        break;
                    } else {
                        s = GF2Field.addElem(s, GF2Field.multElem(sArr[length][length2], this.x[length2]));
                    }
                }
                short invElem2 = GF2Field.invElem(sArr[length][length]);
                if (invElem2 != 0) {
                    this.x[length] = GF2Field.multElem(s, invElem2);
                } else {
                    str = "Not solvable equation system";
                }
            }
            return;
        }
        str = "The equation system is not solvable";
        a$$ExternalSyntheticBUOutline0.m$1(str);
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Addition is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = GF2Field.addElem(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Multiplication is not possible!");
            return null;
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr3[i] = GF2Field.addElem(sArr[i], sArr2[i]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        short[][] sArr2;
        Class cls = Short.TYPE;
        try {
            int i = 0;
            this.A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i2 = 0; i2 < sArr.length; i2++) {
                for (int i3 = 0; i3 < sArr.length; i3++) {
                    this.A[i2][i3] = sArr[i2][i3];
                }
                int length = sArr.length;
                while (true) {
                    int length2 = sArr.length * 2;
                    sArr2 = this.A;
                    if (length < length2) {
                        sArr2[i2][length] = 0;
                        length++;
                    }
                }
                sArr2[i2][sArr2.length + i2] = 1;
            }
            computeZerosUnder(true);
            int i4 = 0;
            while (true) {
                short[][] sArr3 = this.A;
                if (i4 >= sArr3.length) {
                    break;
                }
                short invElem = GF2Field.invElem(sArr3[i4][i4]);
                int i5 = i4;
                while (true) {
                    short[][] sArr4 = this.A;
                    if (i5 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i4];
                        sArr5[i5] = GF2Field.multElem(sArr5[i5], invElem);
                        i5++;
                    }
                }
                i4++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.A;
                if (i >= sArr8.length) {
                    return sArr7;
                }
                int length3 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.A;
                    if (length3 < sArr9.length * 2) {
                        sArr7[i][length3 - sArr9.length] = sArr9[i][length3];
                        length3++;
                    }
                }
                i++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = GF2Field.multElem(s, sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr2[i] = GF2Field.multElem(s, sArr[i]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Multiplication is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = GF2Field.multElem(sArr[i], sArr2[i2]);
            }
        }
        return sArr3;
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Multiplication is not possible!");
            return null;
        }
        this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short multElem = GF2Field.multElem(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr3 = this.A[i];
                    sArr3[i3] = GF2Field.addElem(sArr3[i3], multElem);
                }
            }
        }
        return this.A;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.x = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr[0].length; i2++) {
                    this.A[i][i2] = sArr[i][i2];
                }
            }
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                short[] sArr3 = this.A[i3];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i3], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length != sArr2.length) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Multiplication is not possible!");
            return null;
        }
        short[] sArr3 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i] = GF2Field.addElem(sArr3[i], GF2Field.multElem(sArr[i][i2], sArr2[i2]));
            }
        }
        return sArr3;
    }
}
