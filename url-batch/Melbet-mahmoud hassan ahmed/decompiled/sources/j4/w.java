package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class w<TResult> implements x<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18194a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18195b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private f<? super TResult> f18196c;

    public w(Executor executor, f<? super TResult> fVar) {
        this.f18194a = executor;
        this.f18196c = fVar;
    }

    @Override // j4.x
    public final void a(h<TResult> hVar) {
        if (hVar.m()) {
            synchronized (this.f18195b) {
                if (this.f18196c == null) {
                    return;
                }
                this.f18194a.execute(new v(this, hVar));
            }
        }
    }
}
