package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sy2 implements CoroutineContext.Element {
    public static final dq2 o = new dq2(6);
    public final e m;
    public final AtomicInteger n = new AtomicInteger(0);

    public sy2(e eVar) {
        this.m = eVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final g getKey() {
        return o;
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
