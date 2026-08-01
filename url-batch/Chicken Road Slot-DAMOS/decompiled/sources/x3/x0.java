package x3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x0 implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    public final x0 f10486d;

    /* renamed from: e, reason: collision with root package name */
    public final z f10487e;

    public x0(x0 x0Var, z zVar) {
        this.f10486d = x0Var;
        this.f10487e = zVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public final void b(z zVar) {
        if (this.f10487e == zVar) {
            kotlin.collections.i0.l("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        x0 x0Var = this.f10486d;
        if (x0Var != null) {
            x0Var.b(zVar);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return w0.f10481d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
