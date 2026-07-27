package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    public final g f7490d;

    public a(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f7490d = key;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final g getKey() {
        return this.f7490d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.h(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element k(g gVar) {
        return f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext coroutineContext) {
        return f.c(coroutineContext, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext w(g gVar) {
        return f.b(this, gVar);
    }
}
