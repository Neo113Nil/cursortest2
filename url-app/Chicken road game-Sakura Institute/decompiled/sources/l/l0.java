package l;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final i f5568a;

    public l0(i iVar) {
        this.f5568a = iVar;
    }

    @Override // l.x, l.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final d2 a(w1 w1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i7;
        i iVar = this.f5568a;
        i.p pVar = (i.p) iVar.f5526c;
        i.o oVar = new i.o(pVar.f4774e + 2);
        i.p pVar2 = new i.p(pVar.f4774e);
        int[] iArr3 = pVar.f4771b;
        Object[] objArr3 = pVar.f4772c;
        long[] jArr = pVar.f4770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j8 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr3[i12];
                            i7 = i9;
                            k0 k0Var = (k0) objArr3[i12];
                            oVar.a(i13);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            pVar2.i(i13, new c2((q) w1Var.f5702a.f(k0Var.f5557a), k0Var.f5558b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i7 = i9;
                        }
                        j8 >>= i7;
                        i11++;
                        iArr3 = iArr2;
                        i9 = i7;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i10 != i9) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!pVar.b(0)) {
            int i14 = oVar.f4769b;
            if (i14 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + oVar.f4769b);
            }
            oVar.b(i14 + 1);
            int[] iArr4 = oVar.f4768a;
            int i15 = oVar.f4769b;
            if (i15 != 0) {
                e6.k.W(iArr4, iArr4, 1, 0, i15);
            }
            iArr4[0] = 0;
            oVar.f4769b++;
        }
        if (!pVar.b(iVar.f5525b)) {
            oVar.a(iVar.f5525b);
        }
        int i16 = oVar.f4769b;
        if (i16 != 0) {
            int[] iArr5 = oVar.f4768a;
            r6.k.f(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i16);
        }
        return new d2(oVar, pVar2, iVar.f5525b, z.f5734c);
    }
}
