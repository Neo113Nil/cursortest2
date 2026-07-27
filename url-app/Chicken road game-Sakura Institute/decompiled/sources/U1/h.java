package U1;

import G1.n;
import java.util.concurrent.Executor;
import y.t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4118a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4119b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f4120c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4121d;

    public h(i iVar, g gVar) {
        this.f4120c = iVar;
        this.f4121d = gVar;
    }

    private final void b(d dVar) {
        synchronized (this.f4119b) {
        }
        this.f4120c.execute(new n(this, 1, dVar));
    }

    private final void c(d dVar) {
        if (dVar.f() || dVar.e()) {
            return;
        }
        synchronized (this.f4119b) {
        }
        this.f4120c.execute(new n(this, 2, dVar));
    }

    public final void a(d dVar) {
        switch (this.f4118a) {
            case 0:
                if (dVar.e()) {
                    synchronized (this.f4119b) {
                    }
                    ((i) this.f4120c).getClass();
                    synchronized (this.f4119b) {
                        g gVar = (g) this.f4121d;
                        synchronized (gVar.f4110a) {
                            gVar.f4115f++;
                            gVar.f4117h = true;
                            gVar.c();
                        }
                    }
                    return;
                }
                return;
            case 1:
                b(dVar);
                return;
            case 2:
                c(dVar);
                return;
            default:
                if (dVar.f()) {
                    synchronized (this.f4119b) {
                    }
                    this.f4120c.execute(new n(this, 3, dVar));
                    return;
                }
                return;
        }
    }

    public h(Executor executor, b bVar) {
        this.f4120c = executor;
        this.f4121d = bVar;
    }

    public h(Executor executor, c cVar) {
        this.f4120c = executor;
        this.f4121d = cVar;
    }

    public h(Executor executor, t tVar) {
        this.f4120c = executor;
        this.f4121d = tVar;
    }
}
