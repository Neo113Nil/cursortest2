package g0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f3664a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3665b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3666c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3667d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f3668e;

    /* renamed from: f, reason: collision with root package name */
    public i.p f3669f;

    /* renamed from: g, reason: collision with root package name */
    public int f3670g;

    /* renamed from: h, reason: collision with root package name */
    public int f3671h;

    /* renamed from: i, reason: collision with root package name */
    public int f3672i;

    /* renamed from: j, reason: collision with root package name */
    public int f3673j;

    /* renamed from: k, reason: collision with root package name */
    public int f3674k;

    /* renamed from: l, reason: collision with root package name */
    public int f3675l;

    /* renamed from: m, reason: collision with root package name */
    public int f3676m;

    /* renamed from: n, reason: collision with root package name */
    public int f3677n;

    /* renamed from: o, reason: collision with root package name */
    public int f3678o;

    /* renamed from: p, reason: collision with root package name */
    public final m0 f3679p;

    /* renamed from: q, reason: collision with root package name */
    public final m0 f3680q;

    /* renamed from: r, reason: collision with root package name */
    public final m0 f3681r;

    /* renamed from: s, reason: collision with root package name */
    public i.p f3682s;

    /* renamed from: t, reason: collision with root package name */
    public int f3683t;

    /* renamed from: u, reason: collision with root package name */
    public int f3684u;

    /* renamed from: v, reason: collision with root package name */
    public int f3685v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3686w;

    /* renamed from: x, reason: collision with root package name */
    public f1.g f3687x;

    public a2(y1 y1Var) {
        this.f3664a = y1Var;
        int[] iArr = y1Var.f3974f;
        this.f3665b = iArr;
        Object[] objArr = y1Var.f3976h;
        this.f3666c = objArr;
        this.f3667d = y1Var.f3981m;
        this.f3668e = y1Var.f3982n;
        this.f3669f = y1Var.f3983o;
        int i7 = y1Var.f3975g;
        this.f3670g = i7;
        this.f3671h = (iArr.length / 5) - i7;
        int i8 = y1Var.f3977i;
        this.f3674k = i8;
        this.f3675l = objArr.length - i8;
        this.f3676m = i7;
        this.f3679p = new m0();
        this.f3680q = new m0();
        this.f3681r = new m0();
        this.f3684u = i7;
        this.f3685v = -1;
    }

    public static int h(int i7, int i8, int i9, int i10) {
        return i7 > i8 ? -(((i10 - i9) - i7) + 1) : i7;
    }

    public final boolean A() {
        c I;
        if (this.f3677n != 0) {
            d.w("Cannot remove group while inserting");
            throw null;
        }
        int i7 = this.f3683t;
        int i8 = this.f3672i;
        int f9 = f(this.f3665b, p(i7));
        int p6 = p(this.f3683t);
        int j8 = d.j(this.f3665b, p6) + this.f3683t;
        this.f3683t = j8;
        this.f3672i = f(this.f3665b, p(j8));
        int o2 = d.m(this.f3665b, p6) ? 1 : d.o(this.f3665b, p6);
        int i9 = this.f3685v;
        HashMap hashMap = this.f3668e;
        if (hashMap != null && (I = I(i9)) != null) {
        }
        f1.g gVar = this.f3687x;
        if (gVar != null) {
            ArrayList arrayList = gVar.f3153f;
            while (!arrayList.isEmpty() && ((Number) e6.l.h0(arrayList)).intValue() >= i7) {
                gVar.q();
            }
        }
        boolean B = B(i7, this.f3683t - i7);
        C(f9, this.f3672i - f9, i7 - 1);
        this.f3683t = i7;
        this.f3672i = i8;
        this.f3678o -= o2;
        return B;
    }

    public final boolean B(int i7, int i8) {
        if (i8 > 0) {
            ArrayList arrayList = this.f3667d;
            u(i7);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f3668e;
                int i9 = i7 + i8;
                int n8 = d.n(this.f3667d, i9, m() - this.f3671h);
                if (n8 >= this.f3667d.size()) {
                    n8--;
                }
                int i10 = n8 + 1;
                int i11 = 0;
                while (n8 >= 0) {
                    c cVar = (c) this.f3667d.get(n8);
                    int c4 = c(cVar);
                    if (c4 < i7) {
                        break;
                    }
                    if (c4 < i9) {
                        cVar.f3695a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i11 == 0) {
                            i11 = n8 + 1;
                        }
                        i10 = n8;
                    }
                    n8--;
                }
                r0 = i10 < i11;
                if (r0) {
                    this.f3667d.subList(i10, i11).clear();
                }
            }
            this.f3670g = i7;
            this.f3671h += i8;
            int i12 = this.f3676m;
            if (i12 > i7) {
                this.f3676m = Math.max(i7, i12 - i8);
            }
            int i13 = this.f3684u;
            if (i13 >= this.f3670g) {
                this.f3684u = i13 - i8;
            }
            int i14 = this.f3685v;
            if (i14 >= 0 && d.h(this.f3665b, p(i14))) {
                K(i14);
            }
        }
        return r0;
    }

    public final void C(int i7, int i8, int i9) {
        if (i8 > 0) {
            int i10 = this.f3675l;
            int i11 = i7 + i8;
            v(i11, i9);
            this.f3674k = i7;
            this.f3675l = i10 + i8;
            e6.k.c0(i7, i11, null, this.f3666c);
            int i12 = this.f3673j;
            if (i12 >= i7) {
                this.f3673j = i12 - i8;
            }
        }
    }

    public final void D() {
        int i7 = this.f3684u;
        this.f3683t = i7;
        this.f3672i = f(this.f3665b, p(i7));
    }

    public final int E(int[] iArr, int i7) {
        if (i7 >= m()) {
            return this.f3666c.length - this.f3675l;
        }
        int r8 = d.r(iArr, i7);
        return r8 < 0 ? (this.f3666c.length - this.f3675l) + r8 + 1 : r8;
    }

    public final int F(int i7, int i8) {
        int E = E(this.f3665b, p(i7));
        int i9 = E + i8;
        if (i9 >= E && i9 < f(this.f3665b, p(i7 + 1))) {
            return i9;
        }
        d.w("Write to an invalid slot index " + i8 + " for group " + i7);
        throw null;
    }

    public final void G() {
        if (this.f3677n != 0) {
            d.w("Key must be supplied when inserting");
            throw null;
        }
        t0 t0Var = l.f3784a;
        H(0, t0Var, t0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(int i7, Object obj, Object obj2, boolean z8) {
        int i8;
        HashMap hashMap;
        c I;
        int i9 = this.f3685v;
        Object[] objArr = this.f3677n > 0;
        this.f3681r.b(this.f3678o);
        t0 t0Var = l.f3784a;
        if (objArr == true) {
            int i10 = this.f3683t;
            int f9 = f(this.f3665b, p(i10));
            r(1);
            this.f3672i = f9;
            this.f3673j = f9;
            int p6 = p(i10);
            int i11 = obj != t0Var ? 1 : 0;
            int i12 = (z8 || obj2 == t0Var) ? 0 : 1;
            int h3 = h(f9, this.f3674k, this.f3675l, this.f3666c.length);
            if (h3 >= 0 && this.f3676m < i10) {
                h3 = -(((this.f3666c.length - this.f3675l) - h3) + 1);
            }
            int[] iArr = this.f3665b;
            int i13 = this.f3685v;
            int i14 = z8 ? 1073741824 : 0;
            int i15 = i11 != 0 ? 536870912 : 0;
            int i16 = i12 != 0 ? 268435456 : 0;
            int i17 = p6 * 5;
            iArr[i17] = i7;
            iArr[i17 + 1] = i14 | i15 | i16;
            iArr[i17 + 2] = i13;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = h3;
            int i18 = (z8 ? 1 : 0) + i11 + i12;
            if (i18 > 0) {
                s(i18, i10);
                Object[] objArr2 = this.f3666c;
                int i19 = this.f3672i;
                if (z8) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i11 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i12 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f3672i = i19;
            }
            this.f3678o = 0;
            i8 = i10 + 1;
            this.f3685v = i10;
            this.f3683t = i8;
            if (i9 >= 0 && (hashMap = this.f3668e) != null && (I = I(i9)) != null) {
            }
        } else {
            this.f3679p.b(i9);
            this.f3680q.b((m() - this.f3671h) - this.f3684u);
            int i20 = this.f3683t;
            int p8 = p(i20);
            if (!r6.k.a(obj2, t0Var)) {
                if (z8) {
                    L(this.f3683t, obj2);
                } else {
                    J(obj2);
                }
            }
            this.f3672i = E(this.f3665b, p8);
            this.f3673j = f(this.f3665b, p(this.f3683t + 1));
            this.f3678o = d.o(this.f3665b, p8);
            this.f3685v = i20;
            this.f3683t = i20 + 1;
            i8 = i20 + this.f3665b[(p8 * 5) + 3];
        }
        this.f3684u = i8;
    }

    public final c I(int i7) {
        ArrayList arrayList;
        int P;
        if (i7 < 0 || i7 >= n() || (P = d.P((arrayList = this.f3667d), i7, n())) < 0) {
            return null;
        }
        return (c) arrayList.get(P);
    }

    public final void J(Object obj) {
        int p6 = p(this.f3683t);
        if (!d.k(this.f3665b, p6)) {
            d.w("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f3666c;
        int[] iArr = this.f3665b;
        int f9 = f(iArr, p6);
        int i7 = 1;
        switch (iArr[(p6 * 5) + 1] >> 29) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i7 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        objArr[g(i7 + f9)] = obj;
    }

    public final void K(int i7) {
        if (i7 >= 0) {
            f1.g gVar = this.f3687x;
            if (gVar == null) {
                gVar = new f1.g(1);
                this.f3687x = gVar;
            }
            gVar.b(i7);
        }
    }

    public final void L(int i7, Object obj) {
        int p6 = p(i7);
        int[] iArr = this.f3665b;
        if (p6 < iArr.length && d.m(iArr, p6)) {
            this.f3666c[g(f(this.f3665b, p6))] = obj;
            return;
        }
        d.w("Updating the node of a group at " + i7 + " that was not created with as a node group");
        throw null;
    }

    public final void a(int i7) {
        boolean z8 = false;
        if (!(i7 >= 0)) {
            d.w("Cannot seek backwards");
            throw null;
        }
        if (!(this.f3677n <= 0)) {
            d.S("Cannot call seek() while inserting");
            throw null;
        }
        if (i7 == 0) {
            return;
        }
        int i8 = this.f3683t + i7;
        if (i8 >= this.f3685v && i8 <= this.f3684u) {
            z8 = true;
        }
        if (z8) {
            this.f3683t = i8;
            int f9 = f(this.f3665b, p(i8));
            this.f3672i = f9;
            this.f3673j = f9;
            return;
        }
        d.w("Cannot seek outside the current group (" + this.f3685v + '-' + this.f3684u + ')');
        throw null;
    }

    public final c b(int i7) {
        ArrayList arrayList = this.f3667d;
        int P = d.P(arrayList, i7, n());
        if (P >= 0) {
            return (c) arrayList.get(P);
        }
        if (i7 > this.f3670g) {
            i7 = -(n() - i7);
        }
        c cVar = new c(i7);
        arrayList.add(-(P + 1), cVar);
        return cVar;
    }

    public final int c(c cVar) {
        int i7 = cVar.f3695a;
        return i7 < 0 ? n() + i7 : i7;
    }

    public final void d() {
        int i7 = this.f3677n;
        this.f3677n = i7 + 1;
        if (i7 == 0) {
            this.f3680q.b((m() - this.f3671h) - this.f3684u);
        }
    }

    public final void e(boolean z8) {
        this.f3686w = true;
        if (z8 && this.f3679p.f3793b == 0) {
            u(n());
            v(this.f3666c.length - this.f3675l, this.f3670g);
            int i7 = this.f3674k;
            Arrays.fill(this.f3666c, i7, this.f3675l + i7, (Object) null);
            z();
        }
        int[] iArr = this.f3665b;
        int i8 = this.f3670g;
        Object[] objArr = this.f3666c;
        int i9 = this.f3674k;
        ArrayList arrayList = this.f3667d;
        HashMap hashMap = this.f3668e;
        i.p pVar = this.f3669f;
        y1 y1Var = this.f3664a;
        if (!y1Var.f3979k) {
            d.R("Unexpected writer close()");
            throw null;
        }
        y1Var.f3979k = false;
        y1Var.f3974f = iArr;
        y1Var.f3975g = i8;
        y1Var.f3976h = objArr;
        y1Var.f3977i = i9;
        y1Var.f3981m = arrayList;
        y1Var.f3982n = hashMap;
        y1Var.f3983o = pVar;
    }

    public final int f(int[] iArr, int i7) {
        if (i7 >= m()) {
            return this.f3666c.length - this.f3675l;
        }
        int i8 = d.i(iArr, i7);
        return i8 < 0 ? (this.f3666c.length - this.f3675l) + i8 + 1 : i8;
    }

    public final int g(int i7) {
        return i7 < this.f3674k ? i7 : i7 + this.f3675l;
    }

    public final void i() {
        i.v vVar;
        boolean z8 = this.f3677n > 0;
        int i7 = this.f3683t;
        int i8 = this.f3684u;
        int i9 = this.f3685v;
        int p6 = p(i9);
        int i10 = this.f3678o;
        int i11 = i7 - i9;
        boolean m8 = d.m(this.f3665b, p6);
        m0 m0Var = this.f3681r;
        if (z8) {
            i.p pVar = this.f3682s;
            if (pVar != null && (vVar = (i.v) pVar.f(i9)) != null) {
                Object[] objArr = vVar.f4804a;
                int i12 = vVar.f4805b;
                for (int i13 = 0; i13 < i12; i13++) {
                    y(objArr[i13]);
                }
            }
            d.s(this.f3665b, p6, i11);
            d.t(this.f3665b, p6, i10);
            int a3 = m0Var.a();
            if (m8) {
                i10 = 1;
            }
            this.f3678o = a3 + i10;
            int x8 = x(this.f3665b, i9);
            this.f3685v = x8;
            int n8 = x8 < 0 ? n() : p(x8 + 1);
            int f9 = n8 >= 0 ? f(this.f3665b, n8) : 0;
            this.f3672i = f9;
            this.f3673j = f9;
            return;
        }
        if (i7 != i8) {
            d.w("Expected to be at the end of a group");
            throw null;
        }
        int[] iArr = this.f3665b;
        int i14 = iArr[(p6 * 5) + 3];
        int o2 = d.o(iArr, p6);
        d.s(this.f3665b, p6, i11);
        d.t(this.f3665b, p6, i10);
        int a9 = this.f3679p.a();
        this.f3684u = (m() - this.f3671h) - this.f3680q.a();
        this.f3685v = a9;
        int x9 = x(this.f3665b, i9);
        int a10 = m0Var.a();
        this.f3678o = a10;
        if (x9 == a9) {
            this.f3678o = a10 + (m8 ? 0 : i10 - o2);
            return;
        }
        int i15 = i11 - i14;
        int i16 = m8 ? 0 : i10 - o2;
        if (i15 != 0 || i16 != 0) {
            while (x9 != 0 && x9 != a9 && (i16 != 0 || i15 != 0)) {
                int p8 = p(x9);
                if (i15 != 0) {
                    int[] iArr2 = this.f3665b;
                    d.s(iArr2, p8, iArr2[(p8 * 5) + 3] + i15);
                }
                if (i16 != 0) {
                    int[] iArr3 = this.f3665b;
                    d.t(iArr3, p8, d.o(iArr3, p8) + i16);
                }
                if (d.m(this.f3665b, p8)) {
                    i16 = 0;
                }
                x9 = x(this.f3665b, x9);
            }
        }
        this.f3678o += i16;
    }

    public final void j() {
        int i7 = this.f3677n;
        if (i7 <= 0) {
            d.S("Unbalanced begin/end insert");
            throw null;
        }
        int i8 = i7 - 1;
        this.f3677n = i8;
        if (i8 == 0) {
            if (this.f3681r.f3793b == this.f3679p.f3793b) {
                this.f3684u = (m() - this.f3671h) - this.f3680q.a();
            } else {
                d.w("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void k(int i7) {
        boolean z8 = false;
        if (!(this.f3677n <= 0)) {
            d.w("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i8 = this.f3685v;
        if (i8 != i7) {
            if (i7 >= i8 && i7 < this.f3684u) {
                z8 = true;
            }
            if (!z8) {
                d.w("Started group at " + i7 + " must be a subgroup of the group at " + i8);
                throw null;
            }
            int i9 = this.f3683t;
            int i10 = this.f3672i;
            int i11 = this.f3673j;
            this.f3683t = i7;
            G();
            this.f3683t = i9;
            this.f3672i = i10;
            this.f3673j = i11;
        }
    }

    public final void l(int i7, int i8, int i9) {
        if (i7 >= this.f3670g) {
            i7 = -((n() - i7) + 2);
        }
        while (i9 < i8) {
            this.f3665b[(p(i9) * 5) + 2] = i7;
            int i10 = this.f3665b[(p(i9) * 5) + 3] + i9;
            l(i9, i10, i9 + 1);
            i9 = i10;
        }
    }

    public final int m() {
        return this.f3665b.length / 5;
    }

    public final int n() {
        return m() - this.f3671h;
    }

    public final int o() {
        return this.f3666c.length - this.f3675l;
    }

    public final int p(int i7) {
        return i7 < this.f3670g ? i7 : i7 + this.f3671h;
    }

    public final int q(int i7) {
        return d.j(this.f3665b, p(i7));
    }

    public final void r(int i7) {
        if (i7 > 0) {
            int i8 = this.f3683t;
            u(i8);
            int i9 = this.f3670g;
            int i10 = this.f3671h;
            int[] iArr = this.f3665b;
            int length = iArr.length / 5;
            int i11 = length - i10;
            if (i10 < i7) {
                int max = Math.max(Math.max(length * 2, i11 + i7), 32);
                int[] iArr2 = new int[max * 5];
                int i12 = max - i11;
                e6.k.W(iArr, iArr2, 0, 0, i9 * 5);
                e6.k.W(iArr, iArr2, (i9 + i12) * 5, (i10 + i9) * 5, length * 5);
                this.f3665b = iArr2;
                i10 = i12;
            }
            int i13 = this.f3684u;
            if (i13 >= i9) {
                this.f3684u = i13 + i7;
            }
            int i14 = i9 + i7;
            this.f3670g = i14;
            this.f3671h = i10 - i7;
            int h3 = h(i11 > 0 ? f(this.f3665b, p(i8 + i7)) : 0, this.f3676m >= i9 ? this.f3674k : 0, this.f3675l, this.f3666c.length);
            for (int i15 = i9; i15 < i14; i15++) {
                this.f3665b[(i15 * 5) + 4] = h3;
            }
            int i16 = this.f3676m;
            if (i16 >= i9) {
                this.f3676m = i16 + i7;
            }
        }
    }

    public final void s(int i7, int i8) {
        if (i7 > 0) {
            v(this.f3672i, i8);
            int i9 = this.f3674k;
            int i10 = this.f3675l;
            if (i10 < i7) {
                Object[] objArr = this.f3666c;
                int length = objArr.length;
                int i11 = length - i10;
                int max = Math.max(Math.max(length * 2, i11 + i7), 32);
                Object[] objArr2 = new Object[max];
                for (int i12 = 0; i12 < max; i12++) {
                    objArr2[i12] = null;
                }
                int i13 = max - i11;
                e6.k.X(objArr, objArr2, 0, 0, i9);
                e6.k.X(objArr, objArr2, i9 + i13, i10 + i9, length);
                this.f3666c = objArr2;
                i10 = i13;
            }
            int i14 = this.f3673j;
            if (i14 >= i9) {
                this.f3673j = i14 + i7;
            }
            this.f3674k = i9 + i7;
            this.f3675l = i10 - i7;
        }
    }

    public final void t(y1 y1Var, int i7) {
        d.O(this.f3677n > 0);
        if (i7 == 0 && this.f3683t == 0 && this.f3664a.f3975g == 0) {
            int[] iArr = y1Var.f3974f;
            int i8 = iArr[(i7 * 5) + 3];
            int i9 = y1Var.f3975g;
            if (i8 == i9) {
                int[] iArr2 = this.f3665b;
                Object[] objArr = this.f3666c;
                ArrayList arrayList = this.f3667d;
                HashMap hashMap = this.f3668e;
                i.p pVar = this.f3669f;
                Object[] objArr2 = y1Var.f3976h;
                int i10 = y1Var.f3977i;
                HashMap hashMap2 = y1Var.f3982n;
                i.p pVar2 = y1Var.f3983o;
                this.f3665b = iArr;
                this.f3666c = objArr2;
                this.f3667d = y1Var.f3981m;
                this.f3670g = i9;
                this.f3671h = (iArr.length / 5) - i9;
                this.f3674k = i10;
                this.f3675l = objArr2.length - i10;
                this.f3676m = i9;
                this.f3668e = hashMap2;
                this.f3669f = pVar2;
                y1Var.f3974f = iArr2;
                y1Var.f3975g = 0;
                y1Var.f3976h = objArr;
                y1Var.f3977i = 0;
                y1Var.f3981m = arrayList;
                y1Var.f3982n = hashMap;
                y1Var.f3983o = pVar;
                return;
            }
        }
        a2 w4 = y1Var.w();
        try {
            d.G(w4, i7, this, true, true, false);
            w4.e(true);
        } catch (Throwable th) {
            w4.e(false);
            throw th;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f3683t + " end=" + this.f3684u + " size = " + n() + " gap=" + this.f3670g + '-' + (this.f3670g + this.f3671h) + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f3665b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        e6.k.W(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        e6.k.W(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i7) {
        c cVar;
        int i8;
        c cVar2;
        int i9;
        int i10;
        int i11 = this.f3671h;
        int i12 = this.f3670g;
        if (i12 != i7) {
            if (!this.f3667d.isEmpty()) {
                int m8 = m() - this.f3671h;
                if (i12 < i7) {
                    for (int n8 = d.n(this.f3667d, i12, m8); n8 < this.f3667d.size() && (i9 = (cVar2 = (c) this.f3667d.get(n8)).f3695a) < 0 && (i10 = i9 + m8) < i7; n8++) {
                        cVar2.f3695a = i10;
                    }
                } else {
                    for (int n9 = d.n(this.f3667d, i7, m8); n9 < this.f3667d.size() && (i8 = (cVar = (c) this.f3667d.get(n9)).f3695a) >= 0; n9++) {
                        cVar.f3695a = -(m8 - i8);
                    }
                }
            }
            if (i7 < i12) {
                i12 = i7 + i11;
            }
            int m9 = m();
            d.O(i12 < m9);
            while (i12 < m9) {
                int i13 = (i12 * 5) + 2;
                int i14 = this.f3665b[i13];
                int n10 = i14 > -2 ? i14 : (n() + i14) - (-2);
                if (n10 >= i7) {
                    n10 = -((n() - n10) - (-2));
                }
                if (n10 != i14) {
                    this.f3665b[i13] = n10;
                }
                i12++;
                if (i12 == i7) {
                    i12 += i11;
                }
            }
        }
        this.f3670g = i7;
    }

    public final void v(int i7, int i8) {
        int i9 = this.f3675l;
        int i10 = this.f3674k;
        int i11 = this.f3676m;
        if (i10 != i7) {
            Object[] objArr = this.f3666c;
            if (i7 < i10) {
                e6.k.X(objArr, objArr, i7 + i9, i7, i10);
            } else {
                e6.k.X(objArr, objArr, i10, i10 + i9, i7 + i9);
            }
        }
        int min = Math.min(i8 + 1, n());
        if (i11 != min) {
            int length = this.f3666c.length - i9;
            if (min < i11) {
                int p6 = p(min);
                int p8 = p(i11);
                int i12 = this.f3670g;
                while (p6 < p8) {
                    int[] iArr = this.f3665b;
                    int i13 = (p6 * 5) + 4;
                    int i14 = iArr[i13];
                    if (i14 < 0) {
                        d.w("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    iArr[i13] = -((length - i14) + 1);
                    p6++;
                    if (p6 == i12) {
                        p6 += this.f3671h;
                    }
                }
            } else {
                int p9 = p(i11);
                int p10 = p(min);
                while (p9 < p10) {
                    int[] iArr2 = this.f3665b;
                    int i15 = (p9 * 5) + 4;
                    int i16 = iArr2[i15];
                    if (i16 >= 0) {
                        d.w("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    iArr2[i15] = i16 + length + 1;
                    p9++;
                    if (p9 == this.f3670g) {
                        p9 += this.f3671h;
                    }
                }
            }
            this.f3676m = min;
        }
        this.f3674k = i7;
    }

    public final Object w(int i7) {
        int p6 = p(i7);
        if (d.m(this.f3665b, p6)) {
            return this.f3666c[g(f(this.f3665b, p6))];
        }
        return null;
    }

    public final int x(int[] iArr, int i7) {
        int p6 = d.p(iArr, p(i7));
        return p6 > -2 ? p6 : (n() + p6) - (-2);
    }

    public final Object y(Object obj) {
        if (this.f3677n > 0) {
            s(1, this.f3685v);
        }
        Object[] objArr = this.f3666c;
        int i7 = this.f3672i;
        this.f3672i = i7 + 1;
        Object obj2 = objArr[g(i7)];
        int i8 = this.f3672i;
        if (i8 <= this.f3673j) {
            this.f3666c[g(i8 - 1)] = obj;
            return obj2;
        }
        d.w("Writing to an invalid slot");
        throw null;
    }

    public final void z() {
        boolean z8;
        f1.g gVar = this.f3687x;
        if (gVar != null) {
            while (!gVar.f3153f.isEmpty()) {
                int q8 = gVar.q();
                int p6 = p(q8);
                int i7 = q8 + 1;
                int q9 = q(q8) + q8;
                while (true) {
                    if (i7 >= q9) {
                        z8 = false;
                        break;
                    } else {
                        if ((this.f3665b[(p(i7) * 5) + 1] & 201326592) != 0) {
                            z8 = true;
                            break;
                        }
                        i7 += q(i7);
                    }
                }
                if (d.h(this.f3665b, p6) != z8) {
                    int[] iArr = this.f3665b;
                    int i8 = (p6 * 5) + 1;
                    if (z8) {
                        iArr[i8] = iArr[i8] | 67108864;
                    } else {
                        iArr[i8] = iArr[i8] & (-67108865);
                    }
                    int x8 = x(iArr, q8);
                    if (x8 >= 0) {
                        gVar.b(x8);
                    }
                }
            }
        }
    }
}
