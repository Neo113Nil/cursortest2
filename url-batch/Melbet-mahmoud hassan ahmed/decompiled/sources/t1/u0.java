package t1;

import android.net.Uri;
import r0.a2;
import r0.r3;

/* loaded from: classes.dex */
public final class u0 extends r3 {

    /* renamed from: u, reason: collision with root package name */
    private static final Object f22234u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private static final a2 f22235v = new a2.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* renamed from: h, reason: collision with root package name */
    private final long f22236h;

    /* renamed from: i, reason: collision with root package name */
    private final long f22237i;

    /* renamed from: j, reason: collision with root package name */
    private final long f22238j;

    /* renamed from: k, reason: collision with root package name */
    private final long f22239k;

    /* renamed from: l, reason: collision with root package name */
    private final long f22240l;

    /* renamed from: m, reason: collision with root package name */
    private final long f22241m;

    /* renamed from: n, reason: collision with root package name */
    private final long f22242n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f22243o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f22244p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f22245q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f22246r;

    /* renamed from: s, reason: collision with root package name */
    private final a2 f22247s;

    /* renamed from: t, reason: collision with root package name */
    private final a2.g f22248t;

    public u0(long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z6, boolean z7, boolean z8, Object obj, a2 a2Var, a2.g gVar) {
        this.f22236h = j7;
        this.f22237i = j8;
        this.f22238j = j9;
        this.f22239k = j10;
        this.f22240l = j11;
        this.f22241m = j12;
        this.f22242n = j13;
        this.f22243o = z6;
        this.f22244p = z7;
        this.f22245q = z8;
        this.f22246r = obj;
        this.f22247s = (a2) o2.a.e(a2Var);
        this.f22248t = gVar;
    }

    public u0(long j7, long j8, long j9, long j10, boolean z6, boolean z7, boolean z8, Object obj, a2 a2Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j7, j8, j9, j10, z6, z7, false, obj, a2Var, z8 ? a2Var.f20395i : null);
    }

    public u0(long j7, boolean z6, boolean z7, boolean z8, Object obj, a2 a2Var) {
        this(j7, j7, 0L, 0L, z6, z7, z8, obj, a2Var);
    }

    @Override // r0.r3
    public int f(Object obj) {
        return f22234u.equals(obj) ? 0 : -1;
    }

    @Override // r0.r3
    public r3.b k(int i7, r3.b bVar, boolean z6) {
        o2.a.c(i7, 0, 1);
        return bVar.v(null, z6 ? f22234u : null, 0, this.f22239k, -this.f22241m);
    }

    @Override // r0.r3
    public int m() {
        return 1;
    }

    @Override // r0.r3
    public Object q(int i7) {
        o2.a.c(i7, 0, 1);
        return f22234u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // r0.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r3.d s(int i7, r3.d dVar, long j7) {
        long j8;
        o2.a.c(i7, 0, 1);
        long j9 = this.f22242n;
        boolean z6 = this.f22244p;
        if (z6 && !this.f22245q && j7 != 0) {
            long j10 = this.f22240l;
            if (j10 != -9223372036854775807L) {
                j9 += j7;
            }
            j8 = -9223372036854775807L;
            return dVar.j(r3.d.f20923w, this.f22247s, this.f22246r, this.f22236h, this.f22237i, this.f22238j, this.f22243o, z6, this.f22248t, j8, this.f22240l, 0, 0, this.f22241m);
        }
        j8 = j9;
        return dVar.j(r3.d.f20923w, this.f22247s, this.f22246r, this.f22236h, this.f22237i, this.f22238j, this.f22243o, z6, this.f22248t, j8, this.f22240l, 0, 0, this.f22241m);
    }

    @Override // r0.r3
    public int t() {
        return 1;
    }
}
