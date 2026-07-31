package S2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class a {
    public static boolean a(c cVar) {
        return b(cVar.o());
    }

    public static boolean b(X2.a aVar) {
        return aVar.b() > 1 && aVar.c().equals(b.f9241c) && (aVar instanceof X2.f);
    }

    public static boolean c(c cVar) {
        return d(cVar.o());
    }

    public static boolean d(X2.a aVar) {
        return aVar.b() == 1;
    }

    public static void e(d[] dVarArr, int i4, int i5, d dVar) {
        d[] dVarArr2 = new d[i5];
        int i6 = 0;
        dVarArr2[0] = dVarArr[i4];
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= i5) {
                break;
            }
            dVarArr2[i7] = dVarArr2[i6].i(dVarArr[i4 + i7]);
            i6 = i7;
        }
        if (dVar != null) {
            dVarArr2[i6] = dVarArr2[i6].i(dVar);
        }
        d f4 = dVarArr2[i6].f();
        while (i6 > 0) {
            int i8 = i6 - 1;
            int i9 = i6 + i4;
            d dVar2 = dVarArr[i9];
            dVarArr[i9] = dVarArr2[i8].i(f4);
            f4 = f4.i(dVar2);
            i6 = i8;
        }
        dVarArr[i4] = f4;
    }

    public static f f(f fVar, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        f q4 = fVar.g().q();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                q4 = fVar;
            }
            for (int i4 = 1; i4 < bitLength; i4++) {
                fVar = fVar.w();
                if (abs.testBit(i4)) {
                    q4 = q4.a(fVar);
                }
            }
        }
        return bigInteger.signum() < 0 ? q4.r() : q4;
    }
}
