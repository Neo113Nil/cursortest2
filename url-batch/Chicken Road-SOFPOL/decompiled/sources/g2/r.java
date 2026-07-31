package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2994b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2995c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.q f2996d;

    /* renamed from: e, reason: collision with root package name */
    public final t f2997e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.i f2998f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2999g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3000h;
    public final q2.s i;

    public r(int i, int i8, long j7, q2.q qVar, t tVar, q2.i iVar, int i9, int i10, q2.s sVar) {
        this.f2993a = i;
        this.f2994b = i8;
        this.f2995c = j7;
        this.f2996d = qVar;
        this.f2997e = tVar;
        this.f2998f = iVar;
        this.f2999g = i9;
        this.f3000h = i10;
        this.i = sVar;
        if (r2.n.a(j7, r2.n.f6534c) || r2.n.c(j7) >= 0.0f) {
            return;
        }
        l2.a.b("lineHeight can't be negative (" + r2.n.c(j7) + ')');
    }

    public final r a(r rVar) {
        return rVar == null ? this : s.a(this, rVar.f2993a, rVar.f2994b, rVar.f2995c, rVar.f2996d, rVar.f2997e, rVar.f2998f, rVar.f2999g, rVar.f3000h, rVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2993a == rVar.f2993a && this.f2994b == rVar.f2994b && r2.n.a(this.f2995c, rVar.f2995c) && q6.i.a(this.f2996d, rVar.f2996d) && q6.i.a(this.f2997e, rVar.f2997e) && q6.i.a(this.f2998f, rVar.f2998f) && this.f2999g == rVar.f2999g && this.f3000h == rVar.f3000h && q6.i.a(this.i, rVar.i);
    }

    public final int hashCode() {
        int b8 = a0.q.b(this.f2994b, Integer.hashCode(this.f2993a) * 31, 31);
        r2.p[] pVarArr = r2.n.f6533b;
        int c8 = a0.q.c(b8, 31, this.f2995c);
        q2.q qVar = this.f2996d;
        int hashCode = (c8 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        t tVar = this.f2997e;
        int hashCode2 = (hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31;
        q2.i iVar = this.f2998f;
        int b9 = a0.q.b(this.f3000h, a0.q.b(this.f2999g, (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        q2.s sVar = this.i;
        return b9 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) q2.k.a(this.f2993a)) + ", textDirection=" + ((Object) q2.m.a(this.f2994b)) + ", lineHeight=" + ((Object) r2.n.d(this.f2995c)) + ", textIndent=" + this.f2996d + ", platformStyle=" + this.f2997e + ", lineHeightStyle=" + this.f2998f + ", lineBreak=" + ((Object) q2.e.a(this.f2999g)) + ", hyphens=" + ((Object) q2.d.a(this.f3000h)) + ", textMotion=" + this.i + ')';
    }
}
