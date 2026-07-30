package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public abstract class f {
    public static final <T> kotlin.coroutines.c probeCoroutineCreated(kotlin.coroutines.c completion) {
        s.checkNotNullParameter(completion, "completion");
        return completion;
    }

    public static final void probeCoroutineResumed(kotlin.coroutines.c frame) {
        s.checkNotNullParameter(frame, "frame");
    }

    public static final void probeCoroutineSuspended(kotlin.coroutines.c frame) {
        s.checkNotNullParameter(frame, "frame");
    }
}
