package le;

import ge.t1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements t1 {

    /* renamed from: d, reason: collision with root package name */
    public final Object f6006d;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f6007e;

    /* renamed from: i, reason: collision with root package name */
    public final x f6008i;

    public w(Object obj, ThreadLocal threadLocal) {
        this.f6006d = obj;
        this.f6007e = threadLocal;
        this.f6008i = new x(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return this.f6008i.equals(fVar) ? kotlin.coroutines.g.f5592d : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.f6008i;
    }

    @Override // ge.t1
    public final Object j() {
        ThreadLocal threadLocal = this.f6007e;
        Object obj = threadLocal.get();
        threadLocal.set(this.f6006d);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        if (this.f6008i.equals(fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f6006d + ", threadLocal = " + this.f6007e + ')';
    }

    @Override // ge.t1
    public final void v(Object obj) {
        this.f6007e.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
