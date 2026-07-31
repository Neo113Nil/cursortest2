package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f4907a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4909c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4911e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4912f;

    /* renamed from: g, reason: collision with root package name */
    public int f4913g;

    /* renamed from: h, reason: collision with root package name */
    public int f4914h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f4915j;

    /* renamed from: k, reason: collision with root package name */
    public int f4916k;

    /* renamed from: l, reason: collision with root package name */
    public int f4917l;

    /* renamed from: m, reason: collision with root package name */
    public int f4918m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4919n;

    public e2(f2 f2Var) {
        this.f4907a = f2Var;
        this.f4908b = f2Var.f4928d;
        int i = f2Var.f4929e;
        this.f4909c = i;
        this.f4910d = f2Var.f4930f;
        this.f4911e = f2Var.f4931g;
        this.f4914h = i;
        this.i = -1;
        this.f4915j = new n0();
    }

    public final a a(int i) {
        ArrayList arrayList = this.f4907a.f4935l;
        int e8 = h2.e(arrayList, i, this.f4909c);
        if (e8 >= 0) {
            return (a) arrayList.get(e8);
        }
        a aVar = new a(i);
        arrayList.add(-(e8 + 1), aVar);
        return aVar;
    }

    public final Object b(int[] iArr, int i) {
        int i8 = i * 5;
        int i9 = iArr[i8 + 1];
        if ((268435456 & i9) != 0) {
            return this.f4910d[i8 >= iArr.length ? iArr.length : iArr[i8 + 4] + Integer.bitCount(i9 >> 29)];
        }
        return n.f5019a;
    }

    public final void c() {
        this.f4912f = true;
        f2 f2Var = this.f4907a;
        f2Var.getClass();
        if (this.f4907a != f2Var || f2Var.f4932h <= 0) {
            t.c("Unexpected reader close()");
        }
        f2Var.f4932h--;
        this.f4910d = new Object[0];
    }

    public final boolean d(int i) {
        return (this.f4908b[(i * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f4916k == 0) {
            if (!(this.f4913g == this.f4914h)) {
                t.c("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.f4908b;
            int i8 = iArr[i];
            this.i = i8;
            int i9 = this.f4909c;
            this.f4914h = i8 < 0 ? i9 : h2.a(iArr, i8) + i8;
            int b8 = this.f4915j.b();
            if (b8 < 0) {
                this.f4917l = 0;
                this.f4918m = 0;
            } else {
                this.f4917l = b8;
                this.f4918m = i8 >= i9 - 1 ? this.f4911e : iArr[((i8 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i = this.f4913g;
        if (i < this.f4914h) {
            return b(this.f4908b, i);
        }
        return 0;
    }

    public final int g() {
        int i = this.f4913g;
        if (i >= this.f4914h) {
            return 0;
        }
        return this.f4908b[i * 5];
    }

    public final Object h(int i, int i8) {
        int[] iArr = this.f4908b;
        int c8 = h2.c(iArr, i);
        int i9 = i + 1;
        int i10 = c8 + i8;
        return i10 < (i9 < this.f4909c ? iArr[(i9 * 5) + 4] : this.f4911e) ? this.f4910d[i10] : n.f5019a;
    }

    public final int i(int i) {
        return this.f4908b[i * 5];
    }

    public final boolean j(int i) {
        return (this.f4908b[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i) {
        return (this.f4908b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i) {
        return (this.f4908b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i;
        if (this.f4916k > 0 || (i = this.f4917l) >= this.f4918m) {
            this.f4919n = false;
            return n.f5019a;
        }
        this.f4919n = true;
        Object[] objArr = this.f4910d;
        this.f4917l = i + 1;
        return objArr[i];
    }

    public final Object n(int i) {
        int i8 = i * 5;
        int[] iArr = this.f4908b;
        int i9 = iArr[i8 + 1] & 1073741824;
        if (i9 != 0) {
            return i9 != 0 ? this.f4910d[iArr[i8 + 4]] : n.f5019a;
        }
        return null;
    }

    public final int o(int i) {
        return this.f4908b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i) {
        int i8 = i * 5;
        int i9 = iArr[i8 + 1];
        if ((536870912 & i9) == 0) {
            return null;
        }
        return this.f4910d[Integer.bitCount(i9 >> 30) + iArr[i8 + 4]];
    }

    public final int q(int i) {
        return this.f4908b[(i * 5) + 2];
    }

    public final void r(int i) {
        if (!(this.f4916k == 0)) {
            t.c("Cannot reposition while in an empty region");
        }
        this.f4913g = i;
        int[] iArr = this.f4908b;
        int i8 = this.f4909c;
        int i9 = i < i8 ? iArr[(i * 5) + 2] : -1;
        if (i9 != this.i) {
            this.i = i9;
            if (i9 < 0) {
                this.f4914h = i8;
            } else {
                this.f4914h = h2.a(iArr, i9) + i9;
            }
            this.f4917l = 0;
            this.f4918m = 0;
        }
    }

    public final int s() {
        if (!(this.f4916k == 0)) {
            t.c("Cannot skip while in an empty region");
        }
        int i = this.f4913g;
        int[] iArr = this.f4908b;
        int i8 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.f4913g = h2.a(iArr, i) + i;
        return i8;
    }

    public final void t() {
        if (!(this.f4916k == 0)) {
            t.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f4913g = this.f4914h;
        this.f4917l = 0;
        this.f4918m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f4913g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return a0.q.k(sb, this.f4914h, ')');
    }

    public final void u() {
        if (this.f4916k <= 0) {
            int i = this.i;
            int i8 = this.f4913g;
            int[] iArr = this.f4908b;
            if (!(iArr[(i8 * 5) + 2] == i)) {
                p1.a("Invalid slot table detected");
            }
            int i9 = this.f4917l;
            int i10 = this.f4918m;
            n0 n0Var = this.f4915j;
            if (i9 == 0 && i10 == 0) {
                n0Var.c(-1);
            } else {
                n0Var.c(i9);
            }
            this.i = i8;
            this.f4914h = h2.a(iArr, i8) + i8;
            int i11 = i8 + 1;
            this.f4913g = i11;
            this.f4917l = h2.c(iArr, i8);
            this.f4918m = i8 >= this.f4909c - 1 ? this.f4911e : iArr[(i11 * 5) + 4];
        }
    }
}
