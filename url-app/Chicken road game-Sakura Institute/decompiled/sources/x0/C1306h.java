package x0;

import S.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306h implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final C1306h f11433d = new C1306h();

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

    @Override // S.p
    public final float v() {
        return 0.0f;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.b(this, gVar);
    }
}
