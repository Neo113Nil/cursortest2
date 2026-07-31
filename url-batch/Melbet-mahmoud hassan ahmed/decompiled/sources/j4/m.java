package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class m<TResult, TContinuationResult> implements x<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18170a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, TContinuationResult> f18171b;

    /* renamed from: c, reason: collision with root package name */
    private final b0<TContinuationResult> f18172c;

    public m(Executor executor, a<TResult, TContinuationResult> aVar, b0<TContinuationResult> b0Var) {
        this.f18170a = executor;
        this.f18171b = aVar;
        this.f18172c = b0Var;
    }

    @Override // j4.x
    public final void a(h<TResult> hVar) {
        this.f18170a.execute(new l(this, hVar));
    }
}
