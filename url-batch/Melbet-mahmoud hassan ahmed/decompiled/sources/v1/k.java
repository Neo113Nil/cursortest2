package v1;

import n2.o0;
import r0.s1;
import v1.g;

/* loaded from: classes.dex */
public class k extends a {

    /* renamed from: o, reason: collision with root package name */
    private final int f22784o;

    /* renamed from: p, reason: collision with root package name */
    private final long f22785p;

    /* renamed from: q, reason: collision with root package name */
    private final g f22786q;

    /* renamed from: r, reason: collision with root package name */
    private long f22787r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f22788s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22789t;

    public k(n2.l lVar, n2.p pVar, s1 s1Var, int i7, Object obj, long j7, long j8, long j9, long j10, long j11, int i8, long j12, g gVar) {
        super(lVar, pVar, s1Var, i7, obj, j7, j8, j9, j10, j11);
        this.f22784o = i8;
        this.f22785p = j12;
        this.f22786q = gVar;
    }

    @Override // n2.h0.e
    public final void a() {
        if (this.f22787r == 0) {
            c j7 = j();
            j7.b(this.f22785p);
            g gVar = this.f22786q;
            g.b l7 = l(j7);
            long j8 = this.f22719k;
            long j9 = j8 == -9223372036854775807L ? -9223372036854775807L : j8 - this.f22785p;
            long j10 = this.f22720l;
            gVar.c(l7, j9, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f22785p);
        }
        try {
            n2.p e7 = this.f22748b.e(this.f22787r);
            o0 o0Var = this.f22755i;
            w0.f fVar = new w0.f(o0Var, e7.f19502g, o0Var.b(e7));
            do {
                try {
                    if (this.f22788s) {
                        break;
                    }
                } finally {
                    this.f22787r = fVar.p() - this.f22748b.f19502g;
                }
            } while (this.f22786q.b(fVar));
            n2.o.a(this.f22755i);
            this.f22789t = !this.f22788s;
        } catch (Throwable th) {
            n2.o.a(this.f22755i);
            throw th;
        }
    }

    @Override // n2.h0.e
    public final void c() {
        this.f22788s = true;
    }

    @Override // v1.n
    public long g() {
        return this.f22796j + this.f22784o;
    }

    @Override // v1.n
    public boolean h() {
        return this.f22789t;
    }

    protected g.b l(c cVar) {
        return cVar;
    }
}
