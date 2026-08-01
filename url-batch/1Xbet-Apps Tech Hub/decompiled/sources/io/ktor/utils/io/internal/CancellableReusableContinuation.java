package io.ktor.utils.io.internal;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* compiled from: CancellableReusableContinuation.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001b\u0010\f\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00052\u0010\u0010\u000f\u001a\f0\u000eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0007J\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lio/ktor/utils/io/internal/CancellableReusableContinuation;", "", "T", "Lkotlin/coroutines/Continuation;", "value", "", "close", "(Ljava/lang/Object;)V", "", "cause", "(Ljava/lang/Throwable;)V", "actual", "completeSuspendBlock", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/internal/CancellableReusableContinuation$JobRelation;", "relation", "notParent", "(Lio/ktor/utils/io/internal/CancellableReusableContinuation$JobRelation;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "parent", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/Job;", "job", "exception", "resumeWithExceptionContinuationOnly", "(Lkotlinx/coroutines/Job;Ljava/lang/Throwable;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "<init>", "()V", "JobRelation", "ktor-io"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancellableReusableContinuation<T> implements Continuation<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableReusableContinuation.class, Object.class, RemoteConfigConstants.ResponseFieldKey.STATE);
    private static final /* synthetic */ AtomicReferenceFieldUpdater jobCancellationHandler$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableReusableContinuation.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    public final void close(T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Result.Companion companion = Result.INSTANCE;
        resumeWith(Result.m591constructorimpl(value));
        JobRelation jobRelation = (JobRelation) jobCancellationHandler$FU.getAndSet(this, null);
        if (jobRelation != null) {
            jobRelation.dispose();
        }
    }

    public final void close(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Result.Companion companion = Result.INSTANCE;
        resumeWith(Result.m591constructorimpl(ResultKt.createFailure(cause)));
        JobRelation jobRelation = (JobRelation) jobCancellationHandler$FU.getAndSet(this, null);
        if (jobRelation != null) {
            jobRelation.dispose();
        }
    }

    public final Object completeSuspendBlock(Continuation<? super T> actual) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (UByte$$ExternalSyntheticBackport0.m(state$FU, this, (Object) null, actual)) {
                    parent(actual.get$context());
                    return IntrinsicsKt.getCOROUTINE_SUSPENDED();
                }
            } else if (UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj, (Object) null)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                return obj;
            }
        }
    }

    private final void parent(CoroutineContext context) {
        Object obj;
        JobRelation jobRelation;
        Job job = (Job) context.get(Job.INSTANCE);
        JobRelation jobRelation2 = (JobRelation) this.jobCancellationHandler;
        if ((jobRelation2 != null ? jobRelation2.getJob() : null) == job) {
            return;
        }
        if (job == null) {
            JobRelation jobRelation3 = (JobRelation) jobCancellationHandler$FU.getAndSet(this, null);
            if (jobRelation3 != null) {
                jobRelation3.dispose();
                return;
            }
            return;
        }
        JobRelation jobRelation4 = new JobRelation(this, job);
        do {
            obj = this.jobCancellationHandler;
            jobRelation = (JobRelation) obj;
            if (jobRelation != null && jobRelation.getJob() == job) {
                jobRelation4.dispose();
                return;
            }
        } while (!UByte$$ExternalSyntheticBackport0.m(jobCancellationHandler$FU, this, obj, jobRelation4));
        if (jobRelation != null) {
            jobRelation.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notParent(CancellableReusableContinuation<T>.JobRelation relation) {
        UByte$$ExternalSyntheticBackport0.m(jobCancellationHandler$FU, this, relation, (Object) null);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public CoroutineContext get$context() {
        CoroutineContext coroutineContext;
        Object obj = this.state;
        Continuation continuation = obj instanceof Continuation ? (Continuation) obj : null;
        return (continuation == null || (coroutineContext = continuation.get$context()) == null) ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    /* compiled from: CancellableReusableContinuation.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/internal/CancellableReusableContinuation$JobRelation;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "job", "Lkotlinx/coroutines/Job;", "(Lio/ktor/utils/io/internal/CancellableReusableContinuation;Lkotlinx/coroutines/Job;)V", "handler", "Lkotlinx/coroutines/DisposableHandle;", "getJob", "()Lkotlinx/coroutines/Job;", "dispose", "invoke", "ktor-io"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class JobRelation implements Function1<Throwable, Unit> {
        private DisposableHandle handler;
        private final Job job;
        final /* synthetic */ CancellableReusableContinuation<T> this$0;

        public JobRelation(CancellableReusableContinuation cancellableReusableContinuation, Job job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.this$0 = cancellableReusableContinuation;
            this.job = job;
            DisposableHandle invokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job, true, false, this, 2, null);
            if (job.isActive()) {
                this.handler = invokeOnCompletion$default;
            }
        }

        public final Job getJob() {
            return this.job;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(Throwable cause) {
            this.this$0.notParent(this);
            dispose();
            if (cause != null) {
                this.this$0.resumeWithExceptionContinuationOnly(this.job, cause);
            }
        }

        public final void dispose() {
            DisposableHandle disposableHandle = this.handler;
            if (disposableHandle != null) {
                this.handler = null;
                disposableHandle.dispose();
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        Object obj;
        Object obj2;
        do {
            obj = this.state;
            if (obj == null) {
                obj2 = Result.m594exceptionOrNullimpl(result);
                if (obj2 == null) {
                    ResultKt.throwOnFailure(result);
                    obj2 = result;
                }
            } else if (!(obj instanceof Continuation)) {
                return;
            } else {
                obj2 = null;
            }
        } while (!UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj, obj2));
        if (obj instanceof Continuation) {
            ((Continuation) obj).resumeWith(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeWithExceptionContinuationOnly(Job job, Throwable exception) {
        Object obj;
        Continuation continuation;
        do {
            obj = this.state;
            if (!(obj instanceof Continuation)) {
                return;
            }
            continuation = (Continuation) obj;
            if (continuation.get$context().get(Job.INSTANCE) != job) {
                return;
            }
        } while (!UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj, (Object) null));
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m591constructorimpl(ResultKt.createFailure(exception)));
    }
}
