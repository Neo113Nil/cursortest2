package G;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class T implements A0 {

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f2757d;

    /* renamed from: e, reason: collision with root package name */
    public final b3.c f2758e;

    /* renamed from: i, reason: collision with root package name */
    public W2.r0 f2759i;

    public T(CoroutineContext coroutineContext, Function2 function2) {
        this.f2757d = function2;
        this.f2758e = W2.B.a(coroutineContext);
    }

    @Override // G.A0
    public final void a() {
        W2.r0 r0Var = this.f2759i;
        if (r0Var != null) {
            r0Var.D(new V());
        }
        this.f2759i = null;
    }

    @Override // G.A0
    public final void b() {
        W2.r0 r0Var = this.f2759i;
        if (r0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            r0Var.a(cancellationException);
        }
        this.f2759i = W2.B.m(this.f2758e, null, null, this.f2757d, 3);
    }

    @Override // G.A0
    public final void d() {
        W2.r0 r0Var = this.f2759i;
        if (r0Var != null) {
            r0Var.D(new V());
        }
        this.f2759i = null;
    }
}
