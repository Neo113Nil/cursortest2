package v1;

import n2.o0;
import r0.s1;
import v1.g;

/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: j, reason: collision with root package name */
    private final g f22792j;

    /* renamed from: k, reason: collision with root package name */
    private g.b f22793k;

    /* renamed from: l, reason: collision with root package name */
    private long f22794l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f22795m;

    public m(n2.l lVar, n2.p pVar, s1 s1Var, int i7, Object obj, g gVar) {
        super(lVar, pVar, 2, s1Var, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f22792j = gVar;
    }

    @Override // n2.h0.e
    public void a() {
        if (this.f22794l == 0) {
            this.f22792j.c(this.f22793k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            n2.p e7 = this.f22748b.e(this.f22794l);
            o0 o0Var = this.f22755i;
            w0.f fVar = new w0.f(o0Var, e7.f19502g, o0Var.b(e7));
            while (!this.f22795m && this.f22792j.b(fVar)) {
                try {
                } finally {
                    this.f22794l = fVar.p() - this.f22748b.f19502g;
                }
            }
        } finally {
            n2.o.a(this.f22755i);
        }
    }

    @Override // n2.h0.e
    public void c() {
        this.f22795m = true;
    }

    public void g(g.b bVar) {
        this.f22793k = bVar;
    }
}
