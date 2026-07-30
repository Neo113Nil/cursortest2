package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes5.dex */
final class j implements kotlin.coroutines.c {
    public static final j INSTANCE = new j();
    private static final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

    private j() {
    }

    @Override // kotlin.coroutines.c
    public CoroutineContext getContext() {
        return context;
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(Object obj) {
    }
}
