package s2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class x implements kotlin.coroutines.d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.coroutines.d f46032b;

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineContext f46033c;

    public x(kotlin.coroutines.d dVar, CoroutineContext coroutineContext) {
        this.f46032b = dVar;
        this.f46033c = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f46032b;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f46033c;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        this.f46032b.resumeWith(obj);
    }
}
