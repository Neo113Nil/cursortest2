package f1;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    public final c0 f6564d;

    /* renamed from: e, reason: collision with root package name */
    public final N f6565e;

    public c0(c0 c0Var, N instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f6564d = c0Var;
        this.f6565e = instance;
    }

    public final void c(N candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f6565e == candidate) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        c0 c0Var = this.f6564d;
        if (c0Var != null) {
            c0Var.c(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.g getKey() {
        return b0.f6563d;
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
