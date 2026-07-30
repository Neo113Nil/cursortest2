package h3;

import B2.RunnableC0272f;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements m, e, d, b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38213n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f38214u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f38215v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f38216w;

    public k(N1.f fVar, b bVar) {
        this.f38213n = 0;
        this.f38214u = new Object();
        this.f38215v = fVar;
        this.f38216w = bVar;
    }

    private final void b(n nVar) {
        if (nVar.i()) {
            synchronized (this.f38214u) {
                try {
                    if (((e) this.f38216w) == null) {
                        return;
                    }
                    this.f38215v.execute(new RunnableC0272f(this, nVar, 29, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // h3.d
    public void B(Exception exc) {
        ((n) this.f38216w).k(exc);
    }

    @Override // h3.m
    public final void a(n nVar) {
        switch (this.f38213n) {
            case 0:
                if (nVar.f38223d) {
                    synchronized (this.f38214u) {
                        try {
                            if (((b) this.f38216w) != null) {
                                ((N1.f) this.f38215v).getClass();
                                synchronized (this.f38214u) {
                                    try {
                                        b bVar = (b) this.f38216w;
                                        if (bVar != null) {
                                            bVar.q();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f38214u) {
                }
                this.f38215v.execute(new RunnableC0272f(this, nVar, 27, false));
                return;
            case 2:
                if (nVar.i() || nVar.f38223d) {
                    return;
                }
                synchronized (this.f38214u) {
                    try {
                        if (((d) this.f38216w) != null) {
                            this.f38215v.execute(new RunnableC0272f(this, nVar, 28, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                b(nVar);
                return;
            default:
                this.f38215v.execute(new l(0, this, nVar));
                return;
        }
    }

    @Override // h3.e
    public void l(Object obj) {
        ((n) this.f38216w).l(obj);
    }

    @Override // h3.b
    public void q() {
        ((n) this.f38216w).m();
    }

    public k(Executor executor, c cVar) {
        this.f38213n = 1;
        this.f38214u = new Object();
        this.f38215v = executor;
        this.f38216w = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f38213n = 2;
        this.f38214u = new Object();
        this.f38215v = executor;
        this.f38216w = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f38213n = 3;
        this.f38214u = new Object();
        this.f38215v = executor;
        this.f38216w = eVar;
    }

    public k(Executor executor, g gVar, n nVar) {
        this.f38213n = 4;
        this.f38215v = executor;
        this.f38214u = gVar;
        this.f38216w = nVar;
    }
}
