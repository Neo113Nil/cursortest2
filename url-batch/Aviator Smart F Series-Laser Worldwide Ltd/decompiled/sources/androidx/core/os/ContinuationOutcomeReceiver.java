package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

@RequiresApi(31)
/* loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final kotlin.coroutines.c continuation;

    public ContinuationOutcomeReceiver(kotlin.coroutines.c cVar) {
        super(false);
        this.continuation = cVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e8) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c cVar = this.continuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(e8)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r8) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.m348constructorimpl(r8));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
