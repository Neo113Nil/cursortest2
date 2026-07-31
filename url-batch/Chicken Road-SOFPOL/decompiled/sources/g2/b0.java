package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final q2.o f2903a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2904b;

    /* renamed from: c, reason: collision with root package name */
    public final j2.k f2905c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.i f2906d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.j f2907e;

    /* renamed from: f, reason: collision with root package name */
    public final j2.p f2908f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2909g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2910h;
    public final q2.a i;

    /* renamed from: j, reason: collision with root package name */
    public final q2.p f2911j;

    /* renamed from: k, reason: collision with root package name */
    public final m2.b f2912k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2913l;

    /* renamed from: m, reason: collision with root package name */
    public final q2.l f2914m;

    /* renamed from: n, reason: collision with root package name */
    public final f1.h0 f2915n;

    /* renamed from: o, reason: collision with root package name */
    public final h1.c f2916o;

    public b0(long j7, long j8, j2.k kVar, j2.i iVar, j2.j jVar, j2.p pVar, String str, long j9, q2.a aVar, q2.p pVar2, m2.b bVar, long j10, q2.l lVar, f1.h0 h0Var) {
        this(j7 != 16 ? new q2.c(j7) : q2.n.f6060a, j8, kVar, iVar, jVar, pVar, str, j9, aVar, pVar2, bVar, j10, lVar, h0Var, (h1.c) null);
    }

    public final boolean a(b0 b0Var) {
        if (this == b0Var) {
            return true;
        }
        return r2.n.a(this.f2904b, b0Var.f2904b) && q6.i.a(this.f2905c, b0Var.f2905c) && q6.i.a(this.f2906d, b0Var.f2906d) && q6.i.a(this.f2907e, b0Var.f2907e) && q6.i.a(this.f2908f, b0Var.f2908f) && q6.i.a(this.f2909g, b0Var.f2909g) && r2.n.a(this.f2910h, b0Var.f2910h) && q6.i.a(this.i, b0Var.i) && q6.i.a(this.f2911j, b0Var.f2911j) && q6.i.a(this.f2912k, b0Var.f2912k) && f1.s.c(this.f2913l, b0Var.f2913l);
    }

    public final boolean b(b0 b0Var) {
        return q6.i.a(this.f2903a, b0Var.f2903a) && q6.i.a(this.f2914m, b0Var.f2914m) && q6.i.a(this.f2915n, b0Var.f2915n) && q6.i.a(this.f2916o, b0Var.f2916o);
    }

    public final b0 c(b0 b0Var) {
        if (b0Var == null) {
            return this;
        }
        q2.o oVar = b0Var.f2903a;
        return c0.a(this, oVar.b(), oVar.c(), oVar.a(), b0Var.f2904b, b0Var.f2905c, b0Var.f2906d, b0Var.f2907e, b0Var.f2908f, b0Var.f2909g, b0Var.f2910h, b0Var.i, b0Var.f2911j, b0Var.f2912k, b0Var.f2913l, b0Var.f2914m, b0Var.f2915n, b0Var.f2916o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return a(b0Var) && b(b0Var);
    }

    public final int hashCode() {
        q2.o oVar = this.f2903a;
        long b8 = oVar.b();
        int i = f1.s.i;
        int hashCode = Long.hashCode(b8) * 31;
        f1.p c8 = oVar.c();
        int hashCode2 = (Float.hashCode(oVar.a()) + ((hashCode + (c8 != null ? c8.hashCode() : 0)) * 31)) * 31;
        r2.p[] pVarArr = r2.n.f6533b;
        int c9 = a0.q.c(hashCode2, 31, this.f2904b);
        j2.k kVar = this.f2905c;
        int i8 = (c9 + (kVar != null ? kVar.f3998d : 0)) * 31;
        j2.i iVar = this.f2906d;
        int hashCode3 = (i8 + (iVar != null ? Integer.hashCode(iVar.f3992a) : 0)) * 31;
        j2.j jVar = this.f2907e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.f3993a) : 0)) * 31;
        j2.p pVar = this.f2908f;
        int hashCode5 = (hashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.f2909g;
        int c10 = a0.q.c((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f2910h);
        q2.a aVar = this.i;
        int hashCode6 = (c10 + (aVar != null ? Float.hashCode(aVar.f6037a) : 0)) * 31;
        q2.p pVar2 = this.f2911j;
        int hashCode7 = (hashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        m2.b bVar = this.f2912k;
        int c11 = a0.q.c((hashCode7 + (bVar != null ? bVar.f5218d.hashCode() : 0)) * 31, 31, this.f2913l);
        q2.l lVar = this.f2914m;
        int i9 = (c11 + (lVar != null ? lVar.f6058a : 0)) * 31;
        f1.h0 h0Var = this.f2915n;
        int hashCode8 = (i9 + (h0Var != null ? h0Var.hashCode() : 0)) * 961;
        h1.c cVar = this.f2916o;
        return hashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        q2.o oVar = this.f2903a;
        sb.append((Object) f1.s.i(oVar.b()));
        sb.append(", brush=");
        sb.append(oVar.c());
        sb.append(", alpha=");
        sb.append(oVar.a());
        sb.append(", fontSize=");
        sb.append((Object) r2.n.d(this.f2904b));
        sb.append(", fontWeight=");
        sb.append(this.f2905c);
        sb.append(", fontStyle=");
        sb.append(this.f2906d);
        sb.append(", fontSynthesis=");
        sb.append(this.f2907e);
        sb.append(", fontFamily=");
        sb.append(this.f2908f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f2909g);
        sb.append(", letterSpacing=");
        sb.append((Object) r2.n.d(this.f2910h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f2911j);
        sb.append(", localeList=");
        sb.append(this.f2912k);
        sb.append(", background=");
        a0.q.o(this.f2913l, sb, ", textDecoration=");
        sb.append(this.f2914m);
        sb.append(", shadow=");
        sb.append(this.f2915n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f2916o);
        sb.append(')');
        return sb.toString();
    }

    public b0(q2.o oVar, long j7, j2.k kVar, j2.i iVar, j2.j jVar, j2.p pVar, String str, long j8, q2.a aVar, q2.p pVar2, m2.b bVar, long j9, q2.l lVar, f1.h0 h0Var, h1.c cVar) {
        this.f2903a = oVar;
        this.f2904b = j7;
        this.f2905c = kVar;
        this.f2906d = iVar;
        this.f2907e = jVar;
        this.f2908f = pVar;
        this.f2909g = str;
        this.f2910h = j8;
        this.i = aVar;
        this.f2911j = pVar2;
        this.f2912k = bVar;
        this.f2913l = j9;
        this.f2914m = lVar;
        this.f2915n = h0Var;
        this.f2916o = cVar;
    }

    public b0(long j7, long j8, j2.k kVar, j2.i iVar, j2.j jVar, j2.p pVar, String str, long j9, q2.a aVar, q2.p pVar2, m2.b bVar, long j10, q2.l lVar, f1.h0 h0Var, int i) {
        this((i & 1) != 0 ? f1.s.f2704h : j7, (i & 2) != 0 ? r2.n.f6534c : j8, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : iVar, (i & 16) != 0 ? null : jVar, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? r2.n.f6534c : j9, (i & 256) != 0 ? null : aVar, (i & 512) != 0 ? null : pVar2, (i & 1024) != 0 ? null : bVar, (i & 2048) != 0 ? f1.s.f2704h : j10, (i & 4096) != 0 ? null : lVar, (i & 8192) != 0 ? null : h0Var);
    }
}
