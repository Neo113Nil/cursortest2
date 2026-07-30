package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import f6.p;
import kotlinx.coroutines.t0;

/* loaded from: classes.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, p pVar, kotlin.coroutines.c cVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, p pVar, kotlin.coroutines.c cVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, p pVar, kotlin.coroutines.c cVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), pVar, cVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, p pVar, kotlin.coroutines.c cVar) {
        return kotlinx.coroutines.g.withContext(t0.getMain().getImmediate(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, null), cVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, p pVar, kotlin.coroutines.c cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, p pVar, kotlin.coroutines.c cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, p pVar, kotlin.coroutines.c cVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }
}
