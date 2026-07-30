package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import y5.w;

/* loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final kotlin.coroutines.c continuation;

    public ContinuationRunnable(kotlin.coroutines.c cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m348constructorimpl(w.INSTANCE));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
