package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451b;

    /* renamed from: c, reason: collision with root package name */
    public final long f452c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.o f453d;

    /* renamed from: e, reason: collision with root package name */
    public final w f454e;

    /* renamed from: f, reason: collision with root package name */
    public final l2.g f455f;

    /* renamed from: g, reason: collision with root package name */
    public final int f456g;

    /* renamed from: h, reason: collision with root package name */
    public final int f457h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.p f458i;

    public u(int i7, int i8, long j8, l2.o oVar, w wVar, l2.g gVar, int i9, int i10, l2.p pVar) {
        this.f450a = i7;
        this.f451b = i8;
        this.f452c = j8;
        this.f453d = oVar;
        this.f454e = wVar;
        this.f455f = gVar;
        this.f456g = i9;
        this.f457h = i10;
        this.f458i = pVar;
        if (m2.m.a(j8, m2.m.f6327c) || m2.m.c(j8) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + m2.m.c(j8) + ')').toString());
    }

    public final u a(u uVar) {
        return uVar == null ? this : v.a(this, uVar.f450a, uVar.f451b, uVar.f452c, uVar.f453d, uVar.f454e, uVar.f455f, uVar.f456g, uVar.f457h, uVar.f458i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f450a == uVar.f450a && this.f451b == uVar.f451b && m2.m.a(this.f452c, uVar.f452c) && r6.k.a(this.f453d, uVar.f453d) && r6.k.a(this.f454e, uVar.f454e) && r6.k.a(this.f455f, uVar.f455f) && this.f456g == uVar.f456g && this.f457h == uVar.f457h && r6.k.a(this.f458i, uVar.f458i);
    }

    public final int hashCode() {
        int c4 = l.h.c(this.f451b, Integer.hashCode(this.f450a) * 31, 31);
        m2.n[] nVarArr = m2.m.f6326b;
        int d8 = a0.m.d(c4, 31, this.f452c);
        l2.o oVar = this.f453d;
        int hashCode = (d8 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        w wVar = this.f454e;
        int hashCode2 = (hashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        l2.g gVar = this.f455f;
        int c6 = l.h.c(this.f457h, l.h.c(this.f456g, (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        l2.p pVar = this.f458i;
        return c6 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) l2.i.a(this.f450a)) + ", textDirection=" + ((Object) l2.k.a(this.f451b)) + ", lineHeight=" + ((Object) m2.m.d(this.f452c)) + ", textIndent=" + this.f453d + ", platformStyle=" + this.f454e + ", lineHeightStyle=" + this.f455f + ", lineBreak=" + ((Object) l2.e.a(this.f456g)) + ", hyphens=" + ((Object) l2.d.a(this.f457h)) + ", textMotion=" + this.f458i + ')';
    }
}
