package I;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2657c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f2658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2659e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2660f;

    /* renamed from: g, reason: collision with root package name */
    public int f2661g;

    /* renamed from: h, reason: collision with root package name */
    public int f2662h;

    /* renamed from: i, reason: collision with root package name */
    public int f2663i;

    /* renamed from: j, reason: collision with root package name */
    public final N f2664j;

    /* renamed from: k, reason: collision with root package name */
    public int f2665k;

    /* renamed from: l, reason: collision with root package name */
    public int f2666l;

    /* renamed from: m, reason: collision with root package name */
    public int f2667m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2668n;

    public E0(F0 f02) {
        this.f2655a = f02;
        this.f2656b = f02.f2672d;
        int i3 = f02.f2673e;
        this.f2657c = i3;
        this.f2658d = f02.f2674f;
        this.f2659e = f02.f2675g;
        this.f2662h = i3;
        this.f2663i = -1;
        this.f2664j = new N();
    }

    public final C0141c a(int i3) {
        ArrayList arrayList = this.f2655a.f2679k;
        int Q3 = C0143d.Q(arrayList, i3, this.f2657c);
        if (Q3 >= 0) {
            return (C0141c) arrayList.get(Q3);
        }
        C0141c c0141c = new C0141c(i3);
        arrayList.add(-(Q3 + 1), c0141c);
        return c0141c;
    }

    public final Object b(int[] iArr, int i3) {
        int y3;
        if (!C0143d.k(iArr, i3)) {
            return C0159l.f2829a;
        }
        int i4 = i3 * 5;
        if (i4 >= iArr.length) {
            y3 = iArr.length;
        } else {
            y3 = C0143d.y(iArr[i4 + 1] >> 29) + iArr[i4 + 4];
        }
        return this.f2658d[y3];
    }

    public final void c() {
        int i3;
        this.f2660f = true;
        F0 f02 = this.f2655a;
        f02.getClass();
        if (this.f2655a != f02 || (i3 = f02.f2676h) <= 0) {
            C0143d.w("Unexpected reader close()");
            throw null;
        }
        f02.f2676h = i3 - 1;
    }

    public final void d() {
        if (this.f2665k == 0) {
            if (!(this.f2661g == this.f2662h)) {
                C0143d.w("endGroup() not called at the end of a group");
                throw null;
            }
            int i3 = this.f2663i;
            int[] iArr = this.f2656b;
            int p3 = C0143d.p(iArr, i3);
            this.f2663i = p3;
            int i4 = this.f2657c;
            this.f2662h = p3 < 0 ? i4 : C0143d.j(iArr, p3) + p3;
            int a3 = this.f2664j.a();
            if (a3 < 0) {
                this.f2666l = 0;
                this.f2667m = 0;
            } else {
                this.f2666l = a3;
                this.f2667m = p3 >= i4 - 1 ? this.f2659e : C0143d.i(iArr, p3 + 1);
            }
        }
    }

    public final Object e() {
        int i3 = this.f2661g;
        if (i3 < this.f2662h) {
            return b(this.f2656b, i3);
        }
        return 0;
    }

    public final int f() {
        int i3 = this.f2661g;
        if (i3 >= this.f2662h) {
            return 0;
        }
        return this.f2656b[i3 * 5];
    }

    public final Object g(int i3, int i4) {
        int[] iArr = this.f2656b;
        int r3 = C0143d.r(iArr, i3);
        int i5 = i3 + 1;
        int i6 = r3 + i4;
        return i6 < (i5 < this.f2657c ? iArr[(i5 * 5) + 4] : this.f2659e) ? this.f2658d[i6] : C0159l.f2829a;
    }

    public final Object h() {
        int i3;
        if (this.f2665k > 0 || (i3 = this.f2666l) >= this.f2667m) {
            this.f2668n = false;
            return C0159l.f2829a;
        }
        this.f2668n = true;
        this.f2666l = i3 + 1;
        return this.f2658d[i3];
    }

    public final Object i(int i3) {
        int[] iArr = this.f2656b;
        if (!C0143d.m(iArr, i3)) {
            return null;
        }
        if (!C0143d.m(iArr, i3)) {
            return C0159l.f2829a;
        }
        return this.f2658d[iArr[(i3 * 5) + 4]];
    }

    public final Object j(int[] iArr, int i3) {
        if (!C0143d.l(iArr, i3)) {
            return null;
        }
        int i4 = i3 * 5;
        return this.f2658d[C0143d.y(iArr[i4 + 1] >> 30) + iArr[i4 + 4]];
    }

    public final void k(int i3) {
        if (!(this.f2665k == 0)) {
            C0143d.w("Cannot reposition while in an empty region");
            throw null;
        }
        this.f2661g = i3;
        int[] iArr = this.f2656b;
        int i4 = this.f2657c;
        int p3 = i3 < i4 ? C0143d.p(iArr, i3) : -1;
        this.f2663i = p3;
        if (p3 < 0) {
            this.f2662h = i4;
        } else {
            this.f2662h = C0143d.j(iArr, p3) + p3;
        }
        this.f2666l = 0;
        this.f2667m = 0;
    }

    public final int l() {
        if (!(this.f2665k == 0)) {
            C0143d.w("Cannot skip while in an empty region");
            throw null;
        }
        int i3 = this.f2661g;
        int[] iArr = this.f2656b;
        int o3 = C0143d.m(iArr, i3) ? 1 : C0143d.o(iArr, this.f2661g);
        int i4 = this.f2661g;
        this.f2661g = C0143d.j(iArr, i4) + i4;
        return o3;
    }

    public final void m() {
        if (!(this.f2665k == 0)) {
            C0143d.w("Cannot skip the enclosing group while in an empty region");
            throw null;
        }
        this.f2661g = this.f2662h;
        this.f2666l = 0;
        this.f2667m = 0;
    }

    public final void n() {
        if (this.f2665k <= 0) {
            int i3 = this.f2663i;
            int i4 = this.f2661g;
            int[] iArr = this.f2656b;
            if (!(C0143d.p(iArr, i4) == i3)) {
                C0143d.S("Invalid slot table detected");
                throw null;
            }
            int i5 = this.f2666l;
            int i6 = this.f2667m;
            N n3 = this.f2664j;
            if (i5 == 0 && i6 == 0) {
                n3.b(-1);
            } else {
                n3.b(i5);
            }
            this.f2663i = i4;
            this.f2662h = C0143d.j(iArr, i4) + i4;
            int i7 = i4 + 1;
            this.f2661g = i7;
            this.f2666l = C0143d.r(iArr, i4);
            this.f2667m = i4 >= this.f2657c - 1 ? this.f2659e : C0143d.i(iArr, i7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f2661g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f2663i);
        sb.append(", end=");
        return A.k.j(sb, this.f2662h, ')');
    }
}
