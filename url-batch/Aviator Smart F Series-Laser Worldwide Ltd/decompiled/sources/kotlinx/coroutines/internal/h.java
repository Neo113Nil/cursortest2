package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes5.dex */
public abstract class h {
    private static final Collection<kotlinx.coroutines.g0> platformExceptionHandlers;

    static {
        kotlin.sequences.m asSequence;
        asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(kotlinx.coroutines.g0.class, kotlinx.coroutines.g0.class.getClassLoader()).iterator());
        platformExceptionHandlers = SequencesKt___SequencesKt.toList(asSequence);
    }

    public static final void ensurePlatformExceptionHandlerLoaded(kotlinx.coroutines.g0 g0Var) {
        if (!platformExceptionHandlers.contains(g0Var)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader".toString());
        }
    }

    public static final Collection<kotlinx.coroutines.g0> getPlatformExceptionHandlers() {
        return platformExceptionHandlers;
    }

    public static final void propagateExceptionFinalResort(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
