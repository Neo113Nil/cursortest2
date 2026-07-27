package G;

import W2.C0286h;
import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements X {

    /* renamed from: d, reason: collision with root package name */
    public static final D f2644d = new D();

    /* renamed from: e, reason: collision with root package name */
    public static final Choreographer f2645e;

    static {
        d3.e eVar = W2.J.f4225a;
        f2645e = (Choreographer) W2.B.n(b3.m.f5679a.f4364l, new B(2, null));
    }

    @Override // G.X
    public final Object f(Function1 function1, C2.a frame) {
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        C c4 = new C(c0286h, function1);
        f2645e.postFrameCallback(c4);
        c0286h.v(new A.g0(3, c4));
        Object r2 = c0286h.r();
        if (r2 == D2.a.f2163d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.h(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext coroutineContext) {
        return kotlin.coroutines.f.c(coroutineContext, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.b(this, gVar);
    }
}
