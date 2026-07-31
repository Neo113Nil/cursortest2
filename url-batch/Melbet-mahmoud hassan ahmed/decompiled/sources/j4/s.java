package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s<TResult> implements x<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18184a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18185b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private d<TResult> f18186c;

    public s(Executor executor, d<TResult> dVar) {
        this.f18184a = executor;
        this.f18186c = dVar;
    }

    @Override // j4.x
    public final void a(h<TResult> hVar) {
        synchronized (this.f18185b) {
            if (this.f18186c == null) {
                return;
            }
            this.f18184a.execute(new r(this, hVar));
        }
    }
}
