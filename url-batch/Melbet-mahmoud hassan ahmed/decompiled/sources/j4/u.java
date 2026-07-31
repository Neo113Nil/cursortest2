package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u<TResult> implements x<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18189a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18190b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e f18191c;

    public u(Executor executor, e eVar) {
        this.f18189a = executor;
        this.f18191c = eVar;
    }

    @Override // j4.x
    public final void a(h<TResult> hVar) {
        if (hVar.m() || hVar.k()) {
            return;
        }
        synchronized (this.f18190b) {
            if (this.f18191c == null) {
                return;
            }
            this.f18189a.execute(new t(this, hVar));
        }
    }
}
