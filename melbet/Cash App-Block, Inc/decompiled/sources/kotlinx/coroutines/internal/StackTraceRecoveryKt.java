package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* loaded from: classes3.dex */
public abstract class StackTraceRecoveryKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Object failure;
        Object failure2;
        ArtificialStackFrames.coroutineBoundary();
        try {
            Result.Companion companion = Result.Companion;
            failure = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
            failure = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            failure2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        if (Result.m4120exceptionOrNullimpl(failure2) != null) {
            failure2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
