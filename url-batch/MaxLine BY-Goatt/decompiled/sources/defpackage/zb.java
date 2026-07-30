package defpackage;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zb implements em1 {
    public final Choreographer m;
    public final xb n;

    public zb(Choreographer choreographer, xb xbVar) {
        this.m = choreographer;
        this.n = xbVar;
    }

    @Override // defpackage.em1
    public final Object B(Function1 function1, o30 o30Var) {
        xb xbVar = this.n;
        fs fsVar = new fs(1, q41.b(o30Var));
        fsVar.u();
        yb ybVar = new yb(fsVar, this, function1);
        if (Intrinsics.b(xbVar.o, this.m)) {
            synchronized (xbVar.q) {
                try {
                    xbVar.s.add(ybVar);
                    if (!xbVar.v) {
                        xbVar.v = true;
                        xbVar.o.postFrameCallback(xbVar.w);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            fsVar.w(new p8(5, xbVar, ybVar));
        } else {
            this.m.postFrameCallback(ybVar);
            fsVar.w(new p8(6, this, ybVar));
        }
        Object s = fsVar.s();
        b50 b50Var = b50.m;
        return s;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        return f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return f.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
