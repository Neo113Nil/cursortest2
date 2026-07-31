package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class q<TResult> implements x<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18179a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18180b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c f18181c;

    public q(Executor executor, c cVar) {
        this.f18179a = executor;
        this.f18181c = cVar;
    }

    @Override // j4.x
    public final void a(h<TResult> hVar) {
        if (hVar.k()) {
            synchronized (this.f18180b) {
                if (this.f18181c == null) {
                    return;
                }
                this.f18179a.execute(new p(this));
            }
        }
    }
}
