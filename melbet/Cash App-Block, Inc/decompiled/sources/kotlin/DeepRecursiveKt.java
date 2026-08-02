package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public abstract class DeepRecursiveKt {
    public static final CoroutineSingletons UNDEFINED_RESULT;

    static {
        Result.Companion companion = Result.Companion;
        UNDEFINED_RESULT = CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
