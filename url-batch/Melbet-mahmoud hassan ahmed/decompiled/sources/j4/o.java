package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class o<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, x {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18175a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f18176b;

    /* renamed from: c, reason: collision with root package name */
    private final b0<TContinuationResult> f18177c;

    public o(Executor executor, a<TResult, h<TContinuationResult>> aVar, b0<TContinuationResult> b0Var) {
        this.f18175a = executor;
        this.f18176b = aVar;
        this.f18177c = b0Var;
    }

    @Override // j4.x
    public final void a(h<TResult> hVar) {
        this.f18175a.execute(new n(this, hVar));
    }

    @Override // j4.c
    public final void b() {
        this.f18177c.r();
    }

    @Override // j4.f
    public final void c(TContinuationResult tcontinuationresult) {
        this.f18177c.n(tcontinuationresult);
    }

    @Override // j4.e
    public final void d(Exception exc) {
        this.f18177c.p(exc);
    }
}
