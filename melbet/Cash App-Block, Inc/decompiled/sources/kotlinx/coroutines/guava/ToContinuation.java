package kotlinx.coroutines.guava;

import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class ToContinuation implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final CancellableContinuationImpl continuation;
    public final ListenableFuture futureToObserve;

    public /* synthetic */ ToContinuation(ListenableFuture listenableFuture, CancellableContinuationImpl cancellableContinuationImpl, int i) {
        this.$r8$classId = i;
        this.futureToObserve = listenableFuture;
        this.continuation = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
        ListenableFuture listenableFuture = this.futureToObserve;
        switch (i) {
            case 0:
                if (listenableFuture.isCancelled()) {
                    cancellableContinuationImpl.cancel(null);
                    break;
                } else {
                    try {
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(KotlinGenericDeclarationKt.getUninterruptibly(listenableFuture));
                        break;
                    } catch (ExecutionException e) {
                        Result.Companion companion2 = Result.Companion;
                        Throwable cause = e.getCause();
                        cause.getClass();
                        cancellableContinuationImpl.resumeWith(new Result.Failure(cause));
                        return;
                    }
                }
            default:
                if (listenableFuture.isCancelled()) {
                    cancellableContinuationImpl.cancel(null);
                    break;
                } else {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        cancellableContinuationImpl.resumeWith(AbstractResolvableFuture.getUninterruptibly(listenableFuture));
                        break;
                    } catch (ExecutionException e2) {
                        Result.Companion companion4 = Result.Companion;
                        Throwable cause2 = e2.getCause();
                        cause2.getClass();
                        cancellableContinuationImpl.resumeWith(new Result.Failure(cause2));
                    }
                }
        }
    }
}
