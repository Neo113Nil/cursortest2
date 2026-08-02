package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes3.dex */
public final class HandlerContext extends CoroutineDispatcher implements Delay {
    public final Handler handler;
    public final HandlerContext immediate;
    public final boolean invokeImmediately;
    public final String name;

    public HandlerContext(Handler handler, String str, boolean z) {
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z;
        this.immediate = z ? this : new HandlerContext(handler, str, true);
    }

    public final void cancelOnRejection(CoroutineContext coroutineContext, Runnable runnable) {
        JobKt.cancel(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler.INSTANCE.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        cancelOnRejection(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately;
    }

    public final int hashCode() {
        return (this.invokeImmediately ? 1231 : 1237) ^ System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.handler.postDelayed(runnable, j)) {
            return new DisposableHandle() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda0
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    HandlerContext.this.handler.removeCallbacks(runnable);
                }
            };
        }
        cancelOnRejection(coroutineContext, runnable);
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.invokeImmediately && Intrinsics.areEqual(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i) {
        InlineList.checkParallelism(i);
        return this;
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        int i = 13;
        MainActivity$$ExternalSyntheticLambda8 mainActivity$$ExternalSyntheticLambda8 = new MainActivity$$ExternalSyntheticLambda8(i, cancellableContinuationImpl, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.handler.postDelayed(mainActivity$$ExternalSyntheticLambda8, j)) {
            cancellableContinuationImpl.invokeOnCancellation(new ViewTreeObservers$$ExternalSyntheticLambda3(i, this, mainActivity$$ExternalSyntheticLambda8));
        } else {
            cancelOnRejection(cancellableContinuationImpl.context, mainActivity$$ExternalSyntheticLambda8);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        HandlerContext handlerContext;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
        if (this == handlerContext2) {
            str = "Dispatchers.Main";
        } else {
            try {
                handlerContext = handlerContext2.immediate;
            } catch (UnsupportedOperationException unused) {
                handlerContext = null;
            }
            str = this == handlerContext ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.name;
        if (str2 == null) {
            str2 = this.handler.toString();
        }
        return this.invokeImmediately ? Recorder$$ExternalSyntheticOutline2.m$1(str2, ".immediate") : str2;
    }

    public HandlerContext(Handler handler) {
        this(handler, null, false);
    }
}
