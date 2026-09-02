package k1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements l, e, d, b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5160f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f5161g;

    /* renamed from: h, reason: collision with root package name */
    public final a f5162h;

    /* renamed from: i, reason: collision with root package name */
    public final n f5163i;

    public /* synthetic */ j(Executor executor, a aVar, n nVar, int i7) {
        this.f5160f = i7;
        this.f5161g = executor;
        this.f5162h = aVar;
        this.f5163i = nVar;
    }

    @Override // k1.b
    public void a() {
        this.f5163i.l();
    }

    @Override // k1.e
    public void b(Object obj) {
        this.f5163i.k(obj);
    }

    @Override // k1.l
    public final void c(n nVar) {
        switch (this.f5160f) {
            case 0:
                this.f5161g.execute(new A.a(this, nVar, 10, false));
                break;
            default:
                this.f5161g.execute(new A.a(this, nVar, 11, false));
                break;
        }
    }

    @Override // k1.d
    public void d(Exception exc) {
        this.f5163i.j(exc);
    }
}
