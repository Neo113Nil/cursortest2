package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ax2 implements yw2 {
    public final Object m;
    public final ThreadLocal n;
    public final cx2 o;

    public ax2(Object obj, ThreadLocal threadLocal) {
        this.m = obj;
        this.n = threadLocal;
        this.o = new cx2(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return this.o.equals(gVar) ? h.m : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final g getKey() {
        return this.o;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        if (this.o.equals(gVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return f.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.m + ", threadLocal = " + this.n + ')';
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
