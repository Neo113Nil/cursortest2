package s0;

import W2.C0286h;
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W implements G.X {

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f10151d;

    /* renamed from: e, reason: collision with root package name */
    public final V f10152e;

    public W(Choreographer choreographer, V v4) {
        this.f10151d = choreographer;
        this.f10152e = v4;
    }

    @Override // G.X
    public final Object f(Function1 function1, C2.a frame) {
        V v4 = this.f10152e;
        if (v4 == null) {
            CoroutineContext.Element k4 = frame.p().k(kotlin.coroutines.e.f7496f);
            v4 = k4 instanceof V ? (V) k4 : null;
        }
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        G.C c4 = new G.C(c0286h, this, function1);
        if (v4 == null || !Intrinsics.a(v4.f10141i, this.f10151d)) {
            this.f10151d.postFrameCallback(c4);
            c0286h.v(new q.n0(this, 7, c4));
        } else {
            synchronized (v4.f10143k) {
                try {
                    v4.f10145m.add(c4);
                    if (!v4.f10148p) {
                        v4.f10148p = true;
                        v4.f10141i.postFrameCallback(v4.f10149q);
                    }
                    Unit unit = Unit.f7487a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0286h.v(new q.n0(v4, 6, c4));
        }
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
