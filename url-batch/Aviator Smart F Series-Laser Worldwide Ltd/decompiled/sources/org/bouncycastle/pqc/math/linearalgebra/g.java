package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class g {

    public static class a {

        /* renamed from: h, reason: collision with root package name */
        private c f17214h;

        /* renamed from: p, reason: collision with root package name */
        private l f17215p;

        /* renamed from: s, reason: collision with root package name */
        private c f17216s;

        public a(c cVar, c cVar2, l lVar) {
            this.f17216s = cVar;
            this.f17214h = cVar2;
            this.f17215p = lVar;
        }

        public c getFirstMatrix() {
            return this.f17216s;
        }

        public l getPermutation() {
            return this.f17215p;
        }

        public c getSecondMatrix() {
            return this.f17214h;
        }
    }

    private g() {
    }

    public static a computeSystematicForm(c cVar, SecureRandom secureRandom) {
        c cVar2;
        boolean z7;
        int numColumns = cVar.getNumColumns();
        c cVar3 = null;
        while (true) {
            l lVar = new l(numColumns, secureRandom);
            c cVar4 = (c) cVar.rightMultiply(lVar);
            c leftSubMatrix = cVar4.getLeftSubMatrix();
            try {
                cVar2 = (c) leftSubMatrix.computeInverse();
                z7 = true;
            } catch (ArithmeticException unused) {
                cVar2 = cVar3;
                z7 = false;
            }
            if (z7) {
                return new a(leftSubMatrix, ((c) cVar2.rightMultiply(cVar4)).getRightSubMatrix(), lVar);
            }
            cVar3 = cVar2;
        }
    }

    public static c createCanonicalCheckMatrix(e eVar, m mVar) {
        int degree = eVar.getDegree();
        int i8 = 1 << degree;
        int degree2 = mVar.getDegree();
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, degree2, i8);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, degree2, i8);
        for (int i9 = 0; i9 < i8; i9++) {
            iArr2[0][i9] = eVar.inverse(mVar.evaluateAt(i9));
        }
        for (int i10 = 1; i10 < degree2; i10++) {
            for (int i11 = 0; i11 < i8; i11++) {
                iArr2[i10][i11] = eVar.mult(iArr2[i10 - 1][i11], i11);
            }
        }
        for (int i12 = 0; i12 < degree2; i12++) {
            for (int i13 = 0; i13 < i8; i13++) {
                for (int i14 = 0; i14 <= i12; i14++) {
                    int[] iArr3 = iArr[i12];
                    iArr3[i13] = eVar.add(iArr3[i13], eVar.mult(iArr2[i14][i13], mVar.getCoefficient((degree2 + i14) - i12)));
                }
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, degree2 * degree, (i8 + 31) >>> 5);
        for (int i15 = 0; i15 < i8; i15++) {
            int i16 = i15 >>> 5;
            int i17 = 1 << (i15 & 31);
            for (int i18 = 0; i18 < degree2; i18++) {
                int i19 = iArr[i18][i15];
                for (int i20 = 0; i20 < degree; i20++) {
                    if (((i19 >>> i20) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i18 + 1) * degree) - i20) - 1];
                        iArr5[i16] = iArr5[i16] ^ i17;
                    }
                }
            }
        }
        return new c(i8, iArr4);
    }

    public static d syndromeDecode(d dVar, e eVar, m mVar, m[] mVarArr) {
        int degree = 1 << eVar.getDegree();
        d dVar2 = new d(degree);
        if (!dVar.isZero()) {
            m[] modPolynomialToFracton = new m(dVar.toExtensionFieldVector(eVar)).modInverse(mVar).addMonomial(1).modSquareRootMatrix(mVarArr).modPolynomialToFracton(mVar);
            m mVar2 = modPolynomialToFracton[0];
            m multiply = mVar2.multiply(mVar2);
            m mVar3 = modPolynomialToFracton[1];
            m add = multiply.add(mVar3.multiply(mVar3).multWithMonomial(1));
            m multWithElement = add.multWithElement(eVar.inverse(add.getHeadCoefficient()));
            for (int i8 = 0; i8 < degree; i8++) {
                if (multWithElement.evaluateAt(i8) == 0) {
                    dVar2.setBit(i8);
                }
            }
        }
        return dVar2;
    }
}
