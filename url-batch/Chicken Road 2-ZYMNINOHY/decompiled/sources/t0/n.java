package t0;

import T.C0097o;
import T.U;
import a0.AbstractC0135a;
import v2.AbstractC1478z;
import v2.I;
import v2.Y;
import v2.Z;

/* loaded from: classes.dex */
public final class n extends p implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f15336e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15337f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15338g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15339h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15340i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15341j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15342k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15343l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15344m;
    public final boolean n;

    public n(int i4, U u4, int i5, l lVar, int i6, String str, String str2) {
        super(i4, u4, i5);
        int i7;
        int i8 = 0;
        this.f15337f = AbstractC0135a.n(i6, false);
        int i9 = this.f15348d.f2860e;
        lVar.getClass();
        I i10 = lVar.f2747r;
        this.f15338g = (i9 & 1) != 0;
        this.f15339h = (i9 & 2) != 0;
        I o = str2 != null ? I.o(str2) : i10.isEmpty() ? I.o("") : i10;
        int i11 = 0;
        while (true) {
            if (i11 >= o.size()) {
                i7 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i7 = r.d(this.f15348d, (String) o.get(i11), false);
                if (i7 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.f15340i = i11;
        this.f15341j = i7;
        int i12 = str2 != null ? 1088 : 0;
        int i13 = this.f15348d.f2861f;
        Z z = r.f15365k;
        int bitCount = (i13 == 0 || i13 != i12) ? Integer.bitCount(i12 & i13) : Integer.MAX_VALUE;
        this.f15342k = bitCount;
        C0097o c0097o = this.f15348d;
        this.n = (1088 & c0097o.f2861f) != 0;
        int b4 = r.b(c0097o, lVar.f2748s);
        this.f15343l = b4;
        int d4 = r.d(this.f15348d, str, r.f(str) == null);
        this.f15344m = d4;
        boolean z4 = i7 > 0 || (i10.isEmpty() && bitCount > 0) || ((i10.isEmpty() && b4 != Integer.MAX_VALUE) || this.f15338g || (this.f15339h && d4 > 0));
        if (AbstractC0135a.n(i6, lVar.f15328B) && z4) {
            i8 = 1;
        }
        this.f15336e = i8;
    }

    @Override // t0.p
    public final int a() {
        return this.f15336e;
    }

    @Override // t0.p
    public final /* bridge */ /* synthetic */ boolean b(p pVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n nVar) {
        AbstractC1478z c4 = AbstractC1478z.f15691a.c(this.f15337f, nVar.f15337f);
        Integer valueOf = Integer.valueOf(this.f15340i);
        Integer valueOf2 = Integer.valueOf(nVar.f15340i);
        Y y4 = Y.f15597b;
        Y y5 = Y.f15598c;
        AbstractC1478z b4 = c4.b(valueOf, valueOf2, y5);
        int i4 = nVar.f15341j;
        int i5 = this.f15341j;
        AbstractC1478z a3 = b4.a(i5, i4);
        int i6 = nVar.f15342k;
        int i7 = this.f15342k;
        AbstractC1478z c5 = a3.a(i7, i6).b(Integer.valueOf(this.f15343l), Integer.valueOf(nVar.f15343l), y5).c(this.f15338g, nVar.f15338g);
        Boolean valueOf3 = Boolean.valueOf(this.f15339h);
        Boolean valueOf4 = Boolean.valueOf(nVar.f15339h);
        if (i5 != 0) {
            y4 = y5;
        }
        AbstractC1478z a4 = c5.b(valueOf3, valueOf4, y4).a(this.f15344m, nVar.f15344m);
        if (i7 == 0) {
            a4 = a4.d(this.n, nVar.n);
        }
        return a4.e();
    }
}
