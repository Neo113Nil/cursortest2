package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f18173f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ o f18174g;

    n(o oVar, h hVar) {
        this.f18174g = oVar;
        this.f18173f = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        a aVar;
        try {
            aVar = this.f18174g.f18176b;
            h hVar = (h) aVar.a(this.f18173f);
            if (hVar == null) {
                this.f18174g.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f18167b;
            hVar.e(executor, this.f18174g);
            hVar.d(executor, this.f18174g);
            hVar.a(executor, this.f18174g);
        } catch (g e7) {
            if (e7.getCause() instanceof Exception) {
                b0Var3 = this.f18174g.f18177c;
                b0Var3.p((Exception) e7.getCause());
            } else {
                b0Var2 = this.f18174g.f18177c;
                b0Var2.p(e7);
            }
        } catch (Exception e8) {
            b0Var = this.f18174g.f18177c;
            b0Var.p(e8);
        }
    }
}
