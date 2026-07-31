package j4;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class c0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b0 f18163f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Callable f18164g;

    c0(b0 b0Var, Callable callable) {
        this.f18163f = b0Var;
        this.f18164g = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18163f.n(this.f18164g.call());
        } catch (Exception e7) {
            this.f18163f.p(e7);
        } catch (Throwable th) {
            this.f18163f.p(new RuntimeException(th));
        }
    }
}
