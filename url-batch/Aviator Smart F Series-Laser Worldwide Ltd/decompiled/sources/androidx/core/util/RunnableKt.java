package androidx.core.util;

/* loaded from: classes.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(kotlin.coroutines.c cVar) {
        return new ContinuationRunnable(cVar);
    }
}
