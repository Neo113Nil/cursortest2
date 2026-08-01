package q0;

import c2.r;
import java.util.ArrayList;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f7734a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7735b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7736c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f7737d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7738e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7739f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f7740h;

    /* renamed from: i, reason: collision with root package name */
    public int f7741i;
    public final r j;

    /* renamed from: k, reason: collision with root package name */
    public int f7742k;

    /* renamed from: l, reason: collision with root package name */
    public int f7743l;

    /* renamed from: m, reason: collision with root package name */
    public int f7744m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7745n;

    public g(h hVar) {
        this.f7734a = hVar;
        this.f7735b = hVar.f7746d;
        int i3 = hVar.f7747e;
        this.f7736c = i3;
        this.f7737d = hVar.f7748i;
        this.f7738e = hVar.f7749r;
        this.f7740h = i3;
        this.f7741i = -1;
        this.j = new r();
    }

    public final b a(int i3) {
        ArrayList arrayList = this.f7734a.f7754w;
        int e2 = j.e(arrayList, i3, this.f7736c);
        if (e2 >= 0) {
            return (b) arrayList.get(e2);
        }
        b bVar = new b(i3);
        arrayList.add(-(e2 + 1), bVar);
        return bVar;
    }

    public final Object b(int[] iArr, int i3) {
        int i10 = i3 * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            return this.f7737d[i10 >= iArr.length ? iArr.length : iArr[i10 + 4] + Integer.bitCount(i11 >> 29)];
        }
        return n0.k.f6729a;
    }

    public final void c() {
        this.f7739f = true;
        if (this.f7734a.f7750s <= 0) {
            n0.m.a("Unexpected reader close()");
        }
        r0.f7750s--;
        this.f7737d = new Object[0];
    }

    public final boolean d(int i3) {
        return (this.f7735b[(i3 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f7742k == 0) {
            if (this.g != this.f7740h) {
                n0.m.a("endGroup() not called at the end of a group");
            }
            int i3 = (this.f7741i * 5) + 2;
            int[] iArr = this.f7735b;
            int i10 = iArr[i3];
            this.f7741i = i10;
            int i11 = this.f7736c;
            this.f7740h = i10 < 0 ? i11 : iArr[(i10 * 5) + 3] + i10;
            int b10 = this.j.b();
            if (b10 < 0) {
                this.f7743l = 0;
                this.f7744m = 0;
            } else {
                this.f7743l = b10;
                this.f7744m = i10 >= i11 + (-1) ? this.f7738e : iArr[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i3 = this.g;
        if (i3 < this.f7740h) {
            return b(this.f7735b, i3);
        }
        return 0;
    }

    public final int g() {
        int i3 = this.g;
        if (i3 >= this.f7740h) {
            return 0;
        }
        return this.f7735b[i3 * 5];
    }

    public final Object h(int i3, int i10) {
        int[] iArr = this.f7735b;
        int b10 = j.b(iArr, i3);
        int i11 = i3 + 1;
        int i12 = b10 + i10;
        return i12 < (i11 < this.f7736c ? iArr[(i11 * 5) + 4] : this.f7738e) ? this.f7737d[i12] : n0.k.f6729a;
    }

    public final int i(int i3) {
        return this.f7735b[i3 * 5];
    }

    public final boolean j(int i3) {
        return (this.f7735b[(i3 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i3) {
        return (this.f7735b[(i3 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i3) {
        return (this.f7735b[(i3 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i3;
        if (this.f7742k > 0 || (i3 = this.f7743l) >= this.f7744m) {
            this.f7745n = false;
            return n0.k.f6729a;
        }
        this.f7745n = true;
        Object[] objArr = this.f7737d;
        this.f7743l = i3 + 1;
        return objArr[i3];
    }

    public final Object n(int i3) {
        int i10 = i3 * 5;
        int[] iArr = this.f7735b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 != 0) {
            return i11 != 0 ? this.f7737d[iArr[i10 + 4]] : n0.k.f6729a;
        }
        return null;
    }

    public final int o(int i3) {
        return this.f7735b[(i3 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i3) {
        int i10 = i3 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f7737d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int q(int i3) {
        return this.f7735b[(i3 * 5) + 2];
    }

    public final void r(int i3) {
        if (this.f7742k != 0) {
            n0.m.a("Cannot reposition while in an empty region");
        }
        this.g = i3;
        int[] iArr = this.f7735b;
        int i10 = this.f7736c;
        int i11 = i3 < i10 ? iArr[(i3 * 5) + 2] : -1;
        if (i11 != this.f7741i) {
            this.f7741i = i11;
            if (i11 < 0) {
                this.f7740h = i10;
            } else {
                this.f7740h = iArr[(i11 * 5) + 3] + i11;
            }
            this.f7743l = 0;
            this.f7744m = 0;
        }
    }

    public final int s() {
        if (this.f7742k != 0) {
            n0.m.a("Cannot skip while in an empty region");
        }
        int i3 = this.g;
        int i10 = i3 * 5;
        int[] iArr = this.f7735b;
        int i11 = iArr[i10 + 1];
        int i12 = (1073741824 & i11) != 0 ? 1 : i11 & 67108863;
        this.g = iArr[i10 + 3] + i3;
        return i12;
    }

    public final void t() {
        if (!(this.f7742k == 0)) {
            n0.m.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.f7740h;
        this.f7743l = 0;
        this.f7744m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f7741i);
        sb2.append(", end=");
        return v4.a.m(sb2, this.f7740h, ')');
    }

    public final void u() {
        if (this.f7742k <= 0) {
            int i3 = this.f7741i;
            int i10 = this.g;
            int i11 = i10 * 5;
            int[] iArr = this.f7735b;
            if (iArr[i11 + 2] != i3) {
                n1.a("Invalid slot table detected");
            }
            int i12 = this.f7743l;
            int i13 = this.f7744m;
            r rVar = this.j;
            if (i12 == 0 && i13 == 0) {
                rVar.c(-1);
            } else {
                rVar.c(i12);
            }
            this.f7741i = i10;
            this.f7740h = iArr[i11 + 3] + i10;
            int i14 = i10 + 1;
            this.g = i14;
            this.f7743l = j.b(iArr, i10);
            this.f7744m = i10 >= this.f7736c + (-1) ? this.f7738e : iArr[(i14 * 5) + 4];
        }
    }
}
