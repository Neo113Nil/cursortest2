package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes3.dex */
public interface CancellableContinuation extends Continuation {
    boolean cancel(Throwable th);

    void completeResume(Object obj);

    boolean isCompleted();

    void resume(Object obj, Function3 function3);

    Symbol tryResume(Object obj, Function3 function3);
}
