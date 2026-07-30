package P;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    public final q0 f2149d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f2150e;

    public q0(q0 q0Var, Q instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f2149d = q0Var;
        this.f2150e = instance;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public final void b(Q candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f2150e == candidate) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        q0 q0Var = this.f2149d;
        if (q0Var != null) {
            q0Var.b(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return p0.f2146d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext j(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object t(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }
}
