package c1;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import n0.i0;
import r0.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements e, j0, CoroutineContext.Element {

    /* renamed from: e, reason: collision with root package name */
    public static final u8.d f1481e = new u8.d(13);

    /* renamed from: d, reason: collision with root package name */
    public final i0 f1482d;

    public f(i0 i0Var) {
        this.f1482d = i0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // r0.j0
    public final List b(Integer num) {
        return this.f1482d.E();
    }

    @Override // r0.j0
    public final boolean c() {
        return this.f1482d.C;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return f1481e;
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
