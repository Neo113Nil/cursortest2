package h0;

import g0.a2;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends r4.a {

    /* renamed from: h, reason: collision with root package name */
    public int f4608h;

    /* renamed from: j, reason: collision with root package name */
    public int f4610j;

    /* renamed from: l, reason: collision with root package name */
    public int f4612l;

    /* renamed from: m, reason: collision with root package name */
    public int f4613m;

    /* renamed from: n, reason: collision with root package name */
    public int f4614n;

    /* renamed from: g, reason: collision with root package name */
    public c0[] f4607g = new c0[16];

    /* renamed from: i, reason: collision with root package name */
    public int[] f4609i = new int[16];

    /* renamed from: k, reason: collision with root package name */
    public Object[] f4611k = new Object[16];

    public static final int T(d0 d0Var, int i7) {
        d0Var.getClass();
        if (i7 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i7);
    }

    public final void U() {
        this.f4608h = 0;
        this.f4610j = 0;
        e6.k.c0(0, this.f4612l, null, this.f4611k);
        this.f4612l = 0;
    }

    public final void V(b1.b bVar, a2 a2Var, g0.t tVar) {
        int i7;
        if (X()) {
            a0.p pVar = new a0.p(this);
            d0 d0Var = (d0) pVar.f121e;
            do {
                c0 c0Var = d0Var.f4607g[pVar.f118b];
                r6.k.c(c0Var);
                c0Var.a(pVar, bVar, a2Var, tVar);
                int i8 = pVar.f118b;
                if (i8 >= d0Var.f4608h) {
                    break;
                }
                c0 c0Var2 = d0Var.f4607g[i8];
                r6.k.c(c0Var2);
                pVar.f119c += c0Var2.f4604a;
                pVar.f120d += c0Var2.f4605b;
                i7 = pVar.f118b + 1;
                pVar.f118b = i7;
            } while (i7 < d0Var.f4608h);
        }
        U();
    }

    public final boolean W() {
        return this.f4608h == 0;
    }

    public final boolean X() {
        return this.f4608h != 0;
    }

    public final c0 Y() {
        c0 c0Var = this.f4607g[this.f4608h - 1];
        r6.k.c(c0Var);
        return c0Var;
    }

    public final void Z(c0 c0Var) {
        int i7 = c0Var.f4604a;
        int i8 = c0Var.f4605b;
        if (i7 == 0 && i8 == 0) {
            a0(c0Var);
            return;
        }
        g0.d.R("Cannot push " + c0Var + " without arguments because it expects " + i7 + " ints and " + i8 + " objects.");
        throw null;
    }

    public final void a0(c0 c0Var) {
        this.f4613m = 0;
        this.f4614n = 0;
        int i7 = this.f4608h;
        c0[] c0VarArr = this.f4607g;
        if (i7 == c0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(c0VarArr, i7 + (i7 > 1024 ? 1024 : i7));
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4607g = (c0[]) copyOf;
        }
        int i8 = this.f4610j;
        int i9 = c0Var.f4604a;
        int i10 = c0Var.f4605b;
        int i11 = i8 + i9;
        int[] iArr = this.f4609i;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length + (length > 1024 ? 1024 : length);
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i11);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f4609i = copyOf2;
        }
        int i13 = this.f4612l + i10;
        Object[] objArr = this.f4611k;
        int length2 = objArr.length;
        if (i13 > length2) {
            int i14 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i14 >= i13) {
                i13 = i14;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i13);
            r6.k.e(copyOf3, "copyOf(this, newSize)");
            this.f4611k = copyOf3;
        }
        c0[] c0VarArr2 = this.f4607g;
        int i15 = this.f4608h;
        this.f4608h = i15 + 1;
        c0VarArr2[i15] = c0Var;
        this.f4610j += c0Var.f4604a;
        this.f4612l += i10;
    }
}
