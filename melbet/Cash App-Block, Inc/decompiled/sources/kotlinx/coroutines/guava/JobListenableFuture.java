package kotlinx.coroutines.guava;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;

/* loaded from: classes4.dex */
public final class JobListenableFuture implements ListenableFuture {
    public final SettableFuture auxFuture = new SettableFuture();
    public boolean auxFutureIsFailed;
    public final ListenableFutureCoroutine jobToCancel;

    public JobListenableFuture(ListenableFutureCoroutine listenableFutureCoroutine) {
        this.jobToCancel = listenableFutureCoroutine;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.auxFuture.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.auxFuture.cancel(z)) {
            return false;
        }
        this.jobToCancel.cancel(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        SettableFuture settableFuture = this.auxFuture;
        settableFuture.getClass();
        Object obj = ByteStreamsKt.get(settableFuture);
        if (obj instanceof Cancelled) {
            throw new CancellationException().initCause(((Cancelled) obj).exception);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z;
        if (this.auxFuture.valueField instanceof AbstractFuture.Cancellation) {
            return true;
        }
        if (this.auxFuture.isDone() && !this.auxFutureIsFailed) {
            try {
                z = KotlinGenericDeclarationKt.getUninterruptibly(this.auxFuture) instanceof Cancelled;
            } catch (CancellationException unused) {
                z = true;
            } catch (ExecutionException unused2) {
                this.auxFutureIsFailed = true;
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.auxFuture.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        SettableFuture settableFuture = this.auxFuture;
        if (settableFuture.isDone()) {
            try {
                Object uninterruptibly = KotlinGenericDeclarationKt.getUninterruptibly(settableFuture);
                if (uninterruptibly instanceof Cancelled) {
                    sb.append("CANCELLED, cause=[" + ((Cancelled) uninterruptibly).exception + ']');
                } else {
                    sb.append("SUCCESS, result=[" + uninterruptibly + ']');
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + ']');
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + settableFuture + ']');
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        SettableFuture settableFuture = this.auxFuture;
        settableFuture.getClass();
        Object obj = ByteStreamsKt.get(settableFuture, j, timeUnit);
        if (obj instanceof Cancelled) {
            throw new CancellationException().initCause(((Cancelled) obj).exception);
        }
        return obj;
    }
}
