package C0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f645b;

    /* renamed from: c, reason: collision with root package name */
    public final long f646c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.o f647d;

    /* renamed from: e, reason: collision with root package name */
    public final w f648e;

    /* renamed from: f, reason: collision with root package name */
    public final N0.g f649f;

    /* renamed from: g, reason: collision with root package name */
    public final int f650g;

    /* renamed from: h, reason: collision with root package name */
    public final int f651h;

    /* renamed from: i, reason: collision with root package name */
    public final N0.p f652i;

    public u(int i3, int i4, long j3, N0.o oVar, w wVar, N0.g gVar, int i5, int i6, N0.p pVar) {
        this.f644a = i3;
        this.f645b = i4;
        this.f646c = j3;
        this.f647d = oVar;
        this.f648e = wVar;
        this.f649f = gVar;
        this.f650g = i5;
        this.f651h = i6;
        this.f652i = pVar;
        if (O0.m.a(j3, O0.m.f3746c) || O0.m.c(j3) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + O0.m.c(j3) + ')').toString());
    }

    public final u a(u uVar) {
        if (uVar == null) {
            return this;
        }
        return v.a(this, uVar.f644a, uVar.f645b, uVar.f646c, uVar.f647d, uVar.f648e, uVar.f649f, uVar.f650g, uVar.f651h, uVar.f652i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return N0.i.a(this.f644a, uVar.f644a) && N0.k.a(this.f645b, uVar.f645b) && O0.m.a(this.f646c, uVar.f646c) && f2.j.a(this.f647d, uVar.f647d) && f2.j.a(this.f648e, uVar.f648e) && f2.j.a(this.f649f, uVar.f649f) && this.f650g == uVar.f650g && N0.d.a(this.f651h, uVar.f651h) && f2.j.a(this.f652i, uVar.f652i);
    }

    public final int hashCode() {
        int a3 = AbstractC0625j.a(this.f645b, Integer.hashCode(this.f644a) * 31, 31);
        O0.n[] nVarArr = O0.m.f3745b;
        int c2 = A.k.c(a3, 31, this.f646c);
        N0.o oVar = this.f647d;
        int hashCode = (c2 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        w wVar = this.f648e;
        int hashCode2 = (hashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        N0.g gVar = this.f649f;
        int a4 = AbstractC0625j.a(this.f651h, AbstractC0625j.a(this.f650g, (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        N0.p pVar = this.f652i;
        return a4 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) N0.i.b(this.f644a)) + ", textDirection=" + ((Object) N0.k.b(this.f645b)) + ", lineHeight=" + ((Object) O0.m.d(this.f646c)) + ", textIndent=" + this.f647d + ", platformStyle=" + this.f648e + ", lineHeightStyle=" + this.f649f + ", lineBreak=" + ((Object) N0.e.a(this.f650g)) + ", hyphens=" + ((Object) N0.d.b(this.f651h)) + ", textMotion=" + this.f652i + ')';
    }
}
