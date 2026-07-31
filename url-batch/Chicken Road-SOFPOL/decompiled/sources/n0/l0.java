package n0;

import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 extends h0.a {

    /* renamed from: c, reason: collision with root package name */
    public int f5280c;

    /* renamed from: e, reason: collision with root package name */
    public int f5282e;

    /* renamed from: g, reason: collision with root package name */
    public int f5284g;

    /* renamed from: b, reason: collision with root package name */
    public j0[] f5279b = new j0[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f5281d = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5283f = new Object[16];

    public final void X() {
        this.f5280c = 0;
        this.f5282e = 0;
        d6.l.L(this.f5283f, 0, this.f5284g);
        this.f5284g = 0;
    }

    public final void Y(m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        if (a0()) {
            androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(this);
            l0 l0Var = (l0) kVar.f714d;
            while (true) {
                j0 j0Var = l0Var.f5279b[kVar.f711a];
                m0.a b8 = j0Var.b(kVar);
                m0.c cVar2 = cVar;
                i2 i2Var2 = i2Var;
                u0.i iVar2 = iVar;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.a(kVar, cVar2, i2Var2, iVar2, k0Var2);
                    int i = kVar.f711a;
                    int i8 = l0Var.f5280c;
                    if (i < i8) {
                        j0 j0Var2 = l0Var.f5279b[i];
                        kVar.f712b += j0Var2.f5275a;
                        kVar.f713c += j0Var2.f5276b;
                        int i9 = i + 1;
                        kVar.f711a = i9;
                        if (i9 >= i8) {
                            break;
                        }
                        cVar = cVar2;
                        i2Var = i2Var2;
                        iVar = iVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        X();
    }

    public final boolean Z() {
        return this.f5280c == 0;
    }

    public final boolean a0() {
        return this.f5280c != 0;
    }

    public final void b0(j0 j0Var) {
        int i = this.f5280c;
        j0[] j0VarArr = this.f5279b;
        if (i == j0VarArr.length) {
            j0[] j0VarArr2 = new j0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i);
            this.f5279b = j0VarArr2;
        }
        int i8 = this.f5282e;
        int i9 = j0Var.f5275a;
        int i10 = j0Var.f5276b;
        int i11 = i8 + i9;
        int[] iArr = this.f5281d;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = (length > 1024 ? 1024 : length) + length;
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] iArr2 = new int[i11];
            d6.l.F(0, 0, length, iArr, iArr2);
            this.f5281d = iArr2;
        }
        int i13 = this.f5284g + i10;
        Object[] objArr = this.f5283f;
        int length2 = objArr.length;
        if (i13 > length2) {
            int i14 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i14 >= i13) {
                i13 = i14;
            }
            Object[] objArr2 = new Object[i13];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f5283f = objArr2;
        }
        j0[] j0VarArr3 = this.f5279b;
        int i15 = this.f5280c;
        this.f5280c = i15 + 1;
        j0VarArr3[i15] = j0Var;
        this.f5282e += j0Var.f5275a;
        this.f5284g += i10;
    }
}
