package B0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f289b;

    /* renamed from: c, reason: collision with root package name */
    public final long f290c;

    /* renamed from: d, reason: collision with root package name */
    public final L0.l f291d;

    /* renamed from: e, reason: collision with root package name */
    public final q f292e;

    /* renamed from: f, reason: collision with root package name */
    public final L0.e f293f;

    /* renamed from: g, reason: collision with root package name */
    public final int f294g;

    /* renamed from: h, reason: collision with root package name */
    public final int f295h;

    /* renamed from: i, reason: collision with root package name */
    public final L0.m f296i;

    public o(int i3, int i4, long j3, L0.l lVar, q qVar, L0.e eVar, int i5, int i6, L0.m mVar) {
        this.f288a = i3;
        this.f289b = i4;
        this.f290c = j3;
        this.f291d = lVar;
        this.f292e = qVar;
        this.f293f = eVar;
        this.f294g = i5;
        this.f295h = i6;
        this.f296i = mVar;
        if (M0.l.a(j3, M0.l.f2780c) || M0.l.c(j3) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + M0.l.c(j3) + ')').toString());
    }

    public final o a(o oVar) {
        if (oVar == null) {
            return this;
        }
        return p.a(this, oVar.f288a, oVar.f289b, oVar.f290c, oVar.f291d, oVar.f292e, oVar.f293f, oVar.f294g, oVar.f295h, oVar.f296i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L0.f.a(this.f288a, oVar.f288a) && L0.h.a(this.f289b, oVar.f289b) && M0.l.a(this.f290c, oVar.f290c) && Z1.i.a(this.f291d, oVar.f291d) && Z1.i.a(this.f292e, oVar.f292e) && Z1.i.a(this.f293f, oVar.f293f) && this.f294g == oVar.f294g && I2.l.w(this.f295h, oVar.f295h) && Z1.i.a(this.f296i, oVar.f296i);
    }

    public final int hashCode() {
        int b2 = AbstractC0080b.b(this.f289b, Integer.hashCode(this.f288a) * 31, 31);
        M0.m[] mVarArr = M0.l.f2779b;
        int d3 = AbstractC0080b.d(b2, 31, this.f290c);
        L0.l lVar = this.f291d;
        int hashCode = (d3 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        q qVar = this.f292e;
        int hashCode2 = (hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31;
        L0.e eVar = this.f293f;
        int b3 = AbstractC0080b.b(this.f295h, AbstractC0080b.b(this.f294g, (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31, 31), 31);
        L0.m mVar = this.f296i;
        return b3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) L0.f.b(this.f288a)) + ", textDirection=" + ((Object) L0.h.b(this.f289b)) + ", lineHeight=" + ((Object) M0.l.d(this.f290c)) + ", textIndent=" + this.f291d + ", platformStyle=" + this.f292e + ", lineHeightStyle=" + this.f293f + ", lineBreak=" + ((Object) I2.d.M(this.f294g)) + ", hyphens=" + ((Object) I2.l.S(this.f295h)) + ", textMotion=" + this.f296i + ')';
    }
}
