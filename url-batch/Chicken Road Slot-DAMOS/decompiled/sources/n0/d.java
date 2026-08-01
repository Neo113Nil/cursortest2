package n0;

import com.google.android.gms.internal.measurement.se;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements s0 {

    /* renamed from: d, reason: collision with root package name */
    public final t1 f6655d;

    /* renamed from: e, reason: collision with root package name */
    public final se f6656e = new se(9);

    public d(t1 t1Var) {
        this.f6655d = t1Var;
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
        ge.h hVar = new ge.h(1, md.f.b(cVar));
        hVar.s();
        c cVar2 = new c();
        cVar2.f6644a = hVar;
        cVar2.f6645b = function1;
        hVar.u(new b1.b(1, this.f6656e.i(cVar2, this.f6655d)));
        Object r9 = hVar.r();
        md.a aVar = md.a.f6622d;
        return r9;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
