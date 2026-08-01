package d2;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 implements n0.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f3485d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f3486e;

    public n0(Choreographer choreographer, l0 l0Var) {
        this.f3485d = choreographer;
        this.f3486e = l0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // n0.s0
    public final Object s(Function1 function1, nd.c cVar) {
        l0 l0Var = this.f3486e;
        ge.h hVar = new ge.h(1, md.f.b(cVar));
        hVar.s();
        m0 m0Var = new m0(hVar, this, function1);
        if (Intrinsics.a(l0Var.f3456i, this.f3485d)) {
            synchronized (l0Var.f3458s) {
                l0Var.f3460u.add(m0Var);
                if (!l0Var.f3463x) {
                    l0Var.f3463x = true;
                    l0Var.f3456i.postFrameCallback(l0Var.f3464y);
                }
            }
            hVar.u(new a3.d(2, l0Var, m0Var));
        } else {
            this.f3485d.postFrameCallback(m0Var);
            hVar.u(new a3.d(3, this, m0Var));
        }
        Object r9 = hVar.r();
        md.a aVar = md.a.f6622d;
        return r9;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
