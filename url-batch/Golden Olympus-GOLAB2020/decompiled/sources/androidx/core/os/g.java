package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes.dex */
final class g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.coroutines.d f11827b;

    public g(kotlin.coroutines.d dVar) {
        super(false);
        this.f11827b = dVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d dVar = this.f11827b;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f11827b.resumeWith(Result.m243constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
