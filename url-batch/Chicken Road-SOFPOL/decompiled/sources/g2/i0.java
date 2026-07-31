package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f2963d;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f2964a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2965b;

    /* renamed from: c, reason: collision with root package name */
    public final u f2966c;

    static {
        long j7 = f1.s.f2704h;
        long j8 = r2.n.f6534c;
        f2963d = new i0(new b0(j7, j8, null, null, null, null, null, j8, null, null, null, j7, null, null), new r(Integer.MIN_VALUE, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public i0(b0 b0Var, r rVar, u uVar) {
        this.f2964a = b0Var;
        this.f2965b = rVar;
        this.f2966c = uVar;
    }

    public static i0 a(i0 i0Var, long j7, j2.k kVar, j2.p pVar, long j8, long j9, q2.i iVar, int i) {
        long b8 = i0Var.f2964a.f2903a.b();
        long j10 = (i & 2) != 0 ? i0Var.f2964a.f2904b : j7;
        j2.k kVar2 = (i & 4) != 0 ? i0Var.f2964a.f2905c : kVar;
        b0 b0Var = i0Var.f2964a;
        j2.i iVar2 = b0Var.f2906d;
        j2.j jVar = b0Var.f2907e;
        j2.p pVar2 = (i & 32) != 0 ? b0Var.f2908f : pVar;
        String str = b0Var.f2909g;
        long j11 = (i & 128) != 0 ? b0Var.f2910h : j8;
        q2.a aVar = b0Var.i;
        q2.p pVar3 = b0Var.f2911j;
        m2.b bVar = b0Var.f2912k;
        long j12 = b0Var.f2913l;
        q2.l lVar = b0Var.f2914m;
        f1.h0 h0Var = b0Var.f2915n;
        h1.c cVar = b0Var.f2916o;
        r rVar = i0Var.f2965b;
        int i8 = rVar.f2993a;
        int i9 = rVar.f2994b;
        long j13 = (i & 131072) != 0 ? rVar.f2995c : j9;
        q2.q qVar = rVar.f2996d;
        u uVar = (i & 524288) != 0 ? i0Var.f2966c : k0.d.f4153a;
        return new i0(new b0(f1.s.c(b8, b0Var.f2903a.b()) ? b0Var.f2903a : b8 != 16 ? new q2.c(b8) : q2.n.f6060a, j10, kVar2, iVar2, jVar, pVar2, str, j11, aVar, pVar3, bVar, j12, lVar, h0Var, cVar), new r(i8, i9, j13, qVar, uVar != null ? uVar.f3004a : null, (i & 1048576) != 0 ? rVar.f2998f : iVar, rVar.f2999g, rVar.f3000h, rVar.i), uVar);
    }

    public static i0 d(i0 i0Var, long j7, long j8, j2.k kVar, j2.i iVar, long j9, int i, long j10, int i8) {
        long j11 = (i8 & 2) != 0 ? r2.n.f6534c : j8;
        j2.k kVar2 = (i8 & 4) != 0 ? null : kVar;
        j2.i iVar2 = (i8 & 8) != 0 ? null : iVar;
        long j12 = (i8 & 128) != 0 ? r2.n.f6534c : j9;
        long j13 = f1.s.f2704h;
        int i9 = (32768 & i8) != 0 ? Integer.MIN_VALUE : i;
        long j14 = (i8 & 131072) != 0 ? r2.n.f6534c : j10;
        b0 a8 = c0.a(i0Var.f2964a, j7, null, Float.NaN, j11, kVar2, iVar2, null, null, null, j12, null, null, null, j13, null, null, null);
        r a9 = s.a(i0Var.f2965b, i9, Integer.MIN_VALUE, j14, null, null, null, 0, Integer.MIN_VALUE, null);
        return (i0Var.f2964a == a8 && i0Var.f2965b == a9) ? i0Var : new i0(a8, a9);
    }

    public final long b() {
        return this.f2964a.f2903a.b();
    }

    public final i0 c(i0 i0Var) {
        return (i0Var == null || i0Var.equals(f2963d)) ? this : new i0(this.f2964a.c(i0Var.f2964a), this.f2965b.a(i0Var.f2965b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return q6.i.a(this.f2964a, i0Var.f2964a) && q6.i.a(this.f2965b, i0Var.f2965b) && q6.i.a(this.f2966c, i0Var.f2966c);
    }

    public final int hashCode() {
        int hashCode = (this.f2965b.hashCode() + (this.f2964a.hashCode() * 31)) * 31;
        u uVar = this.f2966c;
        return hashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) f1.s.i(b()));
        sb.append(", brush=");
        b0 b0Var = this.f2964a;
        sb.append(b0Var.f2903a.c());
        sb.append(", alpha=");
        sb.append(b0Var.f2903a.a());
        sb.append(", fontSize=");
        sb.append((Object) r2.n.d(b0Var.f2904b));
        sb.append(", fontWeight=");
        sb.append(b0Var.f2905c);
        sb.append(", fontStyle=");
        sb.append(b0Var.f2906d);
        sb.append(", fontSynthesis=");
        sb.append(b0Var.f2907e);
        sb.append(", fontFamily=");
        sb.append(b0Var.f2908f);
        sb.append(", fontFeatureSettings=");
        sb.append(b0Var.f2909g);
        sb.append(", letterSpacing=");
        sb.append((Object) r2.n.d(b0Var.f2910h));
        sb.append(", baselineShift=");
        sb.append(b0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(b0Var.f2911j);
        sb.append(", localeList=");
        sb.append(b0Var.f2912k);
        sb.append(", background=");
        a0.q.o(b0Var.f2913l, sb, ", textDecoration=");
        sb.append(b0Var.f2914m);
        sb.append(", shadow=");
        sb.append(b0Var.f2915n);
        sb.append(", drawStyle=");
        sb.append(b0Var.f2916o);
        sb.append(", textAlign=");
        r rVar = this.f2965b;
        sb.append((Object) q2.k.a(rVar.f2993a));
        sb.append(", textDirection=");
        sb.append((Object) q2.m.a(rVar.f2994b));
        sb.append(", lineHeight=");
        sb.append((Object) r2.n.d(rVar.f2995c));
        sb.append(", textIndent=");
        sb.append(rVar.f2996d);
        sb.append(", platformStyle=");
        sb.append(this.f2966c);
        sb.append(", lineHeightStyle=");
        sb.append(rVar.f2998f);
        sb.append(", lineBreak=");
        sb.append((Object) q2.e.a(rVar.f2999g));
        sb.append(", hyphens=");
        sb.append((Object) q2.d.a(rVar.f3000h));
        sb.append(", textMotion=");
        sb.append(rVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(b0 b0Var, r rVar) {
        this(b0Var, rVar, r0 == null ? null : new u(r0));
        b0Var.getClass();
        t tVar = rVar.f2997e;
    }
}
