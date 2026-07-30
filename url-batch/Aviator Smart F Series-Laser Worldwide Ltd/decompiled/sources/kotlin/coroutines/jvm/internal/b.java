package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class b implements kotlin.coroutines.c {
    public static final b INSTANCE = new b();

    private b() {
    }

    @Override // kotlin.coroutines.c
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
