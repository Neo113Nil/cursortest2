package io.ktor.utils.io.jvm.javaio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.EventLoopKt;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;

/* compiled from: Blocking.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\"\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0084Hø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/BlockingAdapter;", "", "", "rc", "", "finish", "(I)V", "loop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Thread;", "thread", "parkingLoop", "(Ljava/lang/Thread;)V", "rendezvous", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "ucont", "rendezvousBlock", "shutdown", "()V", "jobToken", "submitAndAwait", "(Ljava/lang/Object;)I", "", "buffer", TypedValues.CycleType.S_WAVE_OFFSET, "length", "([BII)I", "Lkotlinx/coroutines/DisposableHandle;", "disposable", "Lkotlinx/coroutines/DisposableHandle;", "end", "Lkotlin/coroutines/Continuation;", "<set-?>", "I", "getLength", "()I", "getOffset", "Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/Job;", "getParent", "()Lkotlinx/coroutines/Job;", "<init>", "(Lkotlinx/coroutines/Job;)V", "ktor-io"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
abstract class BlockingAdapter {
    static final /* synthetic */ AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(BlockingAdapter.class, Object.class, RemoteConfigConstants.ResponseFieldKey.STATE);
    private final DisposableHandle disposable;
    private final Continuation<Unit> end;
    private int length;
    private int offset;
    private final Job parent;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private static /* synthetic */ void getState$annotations() {
    }

    protected abstract Object loop(Continuation<? super Unit> continuation);

    public BlockingAdapter(Job job) {
        this.parent = job;
        Continuation<Unit> continuation = new Continuation<Unit>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingAdapter$end$1
            private final CoroutineContext context;

            {
                this.context = BlockingAdapter.this.getParent() != null ? UnsafeBlockingTrampoline.INSTANCE.plus(BlockingAdapter.this.getParent()) : UnsafeBlockingTrampoline.INSTANCE;
            }

            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return this.context;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object result) {
                Object obj;
                boolean z;
                Throwable m594exceptionOrNullimpl;
                DisposableHandle disposableHandle;
                Job parent;
                Object m594exceptionOrNullimpl2 = Result.m594exceptionOrNullimpl(result);
                if (m594exceptionOrNullimpl2 == null) {
                    m594exceptionOrNullimpl2 = Unit.INSTANCE;
                }
                BlockingAdapter blockingAdapter = BlockingAdapter.this;
                do {
                    obj = blockingAdapter.state;
                    z = obj instanceof Thread;
                    if (!(z ? true : obj instanceof Continuation ? true : Intrinsics.areEqual(obj, this))) {
                        return;
                    }
                } while (!UByte$$ExternalSyntheticBackport0.m(BlockingAdapter.state$FU, blockingAdapter, obj, m594exceptionOrNullimpl2));
                if (z) {
                    PollersKt.getParkingImpl().unpark(obj);
                } else if ((obj instanceof Continuation) && (m594exceptionOrNullimpl = Result.m594exceptionOrNullimpl(result)) != null) {
                    Result.Companion companion = Result.INSTANCE;
                    ((Continuation) obj).resumeWith(Result.m591constructorimpl(ResultKt.createFailure(m594exceptionOrNullimpl)));
                }
                if (Result.m597isFailureimpl(result) && !(Result.m594exceptionOrNullimpl(result) instanceof CancellationException) && (parent = BlockingAdapter.this.getParent()) != null) {
                    Job.DefaultImpls.cancel$default(parent, (CancellationException) null, 1, (Object) null);
                }
                disposableHandle = BlockingAdapter.this.disposable;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                }
            }
        };
        this.end = continuation;
        this.state = this;
        this.result = 0;
        this.disposable = job != null ? job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingAdapter$disposable$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Continuation continuation2;
                if (th != null) {
                    continuation2 = BlockingAdapter.this.end;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m591constructorimpl(ResultKt.createFailure(th)));
                }
            }
        }) : null;
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(new BlockingAdapter$block$1(this, null), 1)).invoke(continuation);
        if (!(this.state != this)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ BlockingAdapter(Job job, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : job);
    }

    public final Job getParent() {
        return this.parent;
    }

    protected final int getOffset() {
        return this.offset;
    }

    protected final int getLength() {
        return this.length;
    }

    public final void shutdown() {
        DisposableHandle disposableHandle = this.disposable;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
        Continuation<Unit> continuation = this.end;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m591constructorimpl(ResultKt.createFailure(new CancellationException("Stream closed"))));
    }

    public final int submitAndAwait(byte[] buffer, int offset, int length) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.offset = offset;
        this.length = length;
        return submitAndAwait(buffer);
    }

    public final int submitAndAwait(Object jobToken) {
        Object obj;
        Object noWhenBranchMatchedException;
        Intrinsics.checkNotNullParameter(jobToken, "jobToken");
        Thread currentThread = Thread.currentThread();
        Continuation continuation = null;
        do {
            obj = this.state;
            if (obj instanceof Continuation) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                continuation = (Continuation) obj;
                noWhenBranchMatchedException = currentThread;
            } else {
                if (obj instanceof Unit) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (Intrinsics.areEqual(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(noWhenBranchMatchedException);
        } while (!UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj, noWhenBranchMatchedException));
        Intrinsics.checkNotNull(continuation);
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m591constructorimpl(jobToken));
        Intrinsics.checkNotNull(currentThread);
        parkingLoop(currentThread);
        Object obj2 = this.state;
        if (obj2 instanceof Throwable) {
            throw ((Throwable) obj2);
        }
        return this.result;
    }

    private final void parkingLoop(Thread thread) {
        Logger adapter_logger;
        if (this.state != thread) {
            return;
        }
        if (!PollersKt.isParkingAllowed()) {
            adapter_logger = BlockingKt.getADAPTER_LOGGER();
            adapter_logger.warn("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long processNextEventInCurrentThread = EventLoopKt.processNextEventInCurrentThread();
            if (this.state != thread) {
                return;
            }
            if (processNextEventInCurrentThread > 0) {
                PollersKt.getParkingImpl().park(processNextEventInCurrentThread);
            }
        }
    }

    private final Object rendezvous$$forInline(int i, Continuation<Object> continuation) {
        this.result = i;
        InlineMarker.mark(0);
        Object rendezvousBlock = rendezvousBlock(continuation);
        if (rendezvousBlock == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return rendezvousBlock;
    }

    protected final Object rendezvous(int i, Continuation<Object> continuation) {
        this.result = i;
        Object rendezvousBlock = rendezvousBlock(continuation);
        if (rendezvousBlock == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return rendezvousBlock;
    }

    protected final void finish(int rc) {
        this.result = rc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object rendezvousBlock(Continuation<Object> ucont) {
        Object obj;
        Continuation intercepted;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                intercepted = IntrinsicsKt.intercepted(ucont);
                obj = obj3;
            } else {
                if (!Intrinsics.areEqual(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                intercepted = IntrinsicsKt.intercepted(ucont);
            }
            if (UByte$$ExternalSyntheticBackport0.m(state$FU, this, obj3, intercepted)) {
                if (obj != null) {
                    PollersKt.getParkingImpl().unpark(obj);
                }
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            obj2 = obj;
        }
    }
}
