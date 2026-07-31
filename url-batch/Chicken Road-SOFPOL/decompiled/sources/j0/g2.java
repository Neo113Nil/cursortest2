package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final d0.d f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.d f3668b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.d f3669c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.d f3670d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.d f3671e;

    /* renamed from: f, reason: collision with root package name */
    public final d0.d f3672f;

    /* renamed from: g, reason: collision with root package name */
    public final d0.d f3673g;

    /* renamed from: h, reason: collision with root package name */
    public final d0.d f3674h;

    public g2() {
        d0.d dVar = f2.f3644a;
        d0.d dVar2 = f2.f3645b;
        d0.d dVar3 = f2.f3646c;
        d0.d dVar4 = f2.f3647d;
        d0.d dVar5 = f2.f3649f;
        d0.d dVar6 = f2.f3648e;
        d0.d dVar7 = f2.f3650g;
        d0.d dVar8 = f2.f3651h;
        this.f3667a = dVar;
        this.f3668b = dVar2;
        this.f3669c = dVar3;
        this.f3670d = dVar4;
        this.f3671e = dVar5;
        this.f3672f = dVar6;
        this.f3673g = dVar7;
        this.f3674h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return q6.i.a(this.f3667a, g2Var.f3667a) && q6.i.a(this.f3668b, g2Var.f3668b) && q6.i.a(this.f3669c, g2Var.f3669c) && q6.i.a(this.f3670d, g2Var.f3670d) && q6.i.a(this.f3671e, g2Var.f3671e) && q6.i.a(this.f3672f, g2Var.f3672f) && q6.i.a(this.f3673g, g2Var.f3673g) && q6.i.a(this.f3674h, g2Var.f3674h);
    }

    public final int hashCode() {
        return this.f3674h.hashCode() + ((this.f3673g.hashCode() + ((this.f3672f.hashCode() + ((this.f3671e.hashCode() + ((this.f3670d.hashCode() + ((this.f3669c.hashCode() + ((this.f3668b.hashCode() + (this.f3667a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3667a + ", small=" + this.f3668b + ", medium=" + this.f3669c + ", large=" + this.f3670d + ", largeIncreased=" + this.f3672f + ", extraLarge=" + this.f3671e + ", extralargeIncreased=" + this.f3673g + ", extraExtraLarge=" + this.f3674h + ')';
    }
}
