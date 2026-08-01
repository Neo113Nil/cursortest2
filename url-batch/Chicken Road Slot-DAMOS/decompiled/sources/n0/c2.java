package n0;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c2 implements ge.x, a2 {

    /* renamed from: s, reason: collision with root package name */
    public static final g f6650s = new g();

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f6651d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f6652e;

    /* renamed from: i, reason: collision with root package name */
    public final c2 f6653i = this;

    /* renamed from: r, reason: collision with root package name */
    public volatile CoroutineContext f6654r;

    public c2(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.f6651d = coroutineContext;
        this.f6652e = coroutineContext2;
    }

    public final void a() {
        synchronized (this.f6653i) {
            try {
                CoroutineContext coroutineContext = this.f6654r;
                if (coroutineContext == null) {
                    this.f6654r = f6650s;
                } else {
                    ge.a0.g(coroutineContext, new d0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.a2
    public final void c() {
        a();
    }

    @Override // n0.a2
    public final void e() {
        a();
    }

    @Override // ge.x
    public final CoroutineContext h() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this.f6654r;
        if (coroutineContext2 == null || coroutineContext2 == f6650s) {
            c1.f fVar = (c1.f) this.f6651d.m(c1.f.f1481e);
            CoroutineContext b2Var = fVar != null ? new b2(fVar, this) : kotlin.coroutines.g.f5592d;
            synchronized (this.f6653i) {
                try {
                    CoroutineContext coroutineContext3 = this.f6654r;
                    if (coroutineContext3 == null) {
                        CoroutineContext coroutineContext4 = this.f6651d;
                        coroutineContext = coroutineContext4.p(new ge.e1((ge.c1) coroutineContext4.m(ge.u.f4403e))).p(this.f6652e).p(b2Var);
                    } else if (coroutineContext3 == f6650s) {
                        CoroutineContext coroutineContext5 = this.f6651d;
                        ge.e1 e1Var = new ge.e1((ge.c1) coroutineContext5.m(ge.u.f4403e));
                        e1Var.n(new d0(0));
                        coroutineContext = coroutineContext5.p(e1Var).p(this.f6652e).p(b2Var);
                    } else {
                        coroutineContext = coroutineContext3;
                    }
                    this.f6654r = coroutineContext;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        coroutineContext2.getClass();
        return coroutineContext2;
    }

    @Override // n0.a2
    public final void b() {
    }
}
