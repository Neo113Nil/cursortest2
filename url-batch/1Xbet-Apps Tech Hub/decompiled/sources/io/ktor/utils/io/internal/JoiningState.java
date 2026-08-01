package io.ktor.utils.io.internal;

import io.ktor.utils.io.ByteBufferChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/internal/JoiningState;", "", "", "awaitClose", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "()V", "Lkotlinx/coroutines/Job;", "getCloseWaitJob", "()Lkotlinx/coroutines/Job;", "closeWaitJob", "", "delegateClose", "Z", "getDelegateClose", "()Z", "Lio/ktor/utils/io/ByteBufferChannel;", "delegatedTo", "Lio/ktor/utils/io/ByteBufferChannel;", "getDelegatedTo", "()Lio/ktor/utils/io/ByteBufferChannel;", "<init>", "(Lio/ktor/utils/io/ByteBufferChannel;Z)V", "ktor-io"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JoiningState {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeWaitJob$FU = AtomicReferenceFieldUpdater.newUpdater(JoiningState.class, Object.class, "_closeWaitJob");
    private volatile /* synthetic */ Object _closeWaitJob;
    private volatile /* synthetic */ int closed;
    private final boolean delegateClose;
    private final ByteBufferChannel delegatedTo;

    public JoiningState(ByteBufferChannel delegatedTo, boolean z) {
        Intrinsics.checkNotNullParameter(delegatedTo, "delegatedTo");
        this.delegatedTo = delegatedTo;
        this.delegateClose = z;
        this._closeWaitJob = null;
        this.closed = 0;
    }

    public final boolean getDelegateClose() {
        return this.delegateClose;
    }

    public final ByteBufferChannel getDelegatedTo() {
        return this.delegatedTo;
    }

    private final Job getCloseWaitJob() {
        CompletableJob Job$default;
        do {
            Job job = (Job) this._closeWaitJob;
            if (job != null) {
                return job;
            }
            Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        } while (!UByte$$ExternalSyntheticBackport0.m(_closeWaitJob$FU, this, (Object) null, Job$default));
        if (this.closed == 1) {
            Job.DefaultImpls.cancel$default((Job) Job$default, (CancellationException) null, 1, (Object) null);
        }
        return Job$default;
    }

    public final void complete() {
        this.closed = 1;
        Job job = (Job) _closeWaitJob$FU.getAndSet(this, null);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final Object awaitClose(Continuation<? super Unit> continuation) {
        Object join;
        return (this.closed != 1 && (join = getCloseWaitJob().join(continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? join : Unit.INSTANCE;
    }
}
