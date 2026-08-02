package kotlinx.coroutines.channels;

import app.cash.broadway.ui.compose.UiScopeKt$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.util.coroutines.StateFlowKt$combineState$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.DefaultSocket;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public class BufferedChannel implements Channel {
    public static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU;
    public static final /* synthetic */ long _closeCause$volatile$FU$offset;
    public static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU;
    public static final /* synthetic */ long bufferEndSegment$volatile$FU$offset;
    public static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU;
    public static final /* synthetic */ long closeHandler$volatile$FU$offset;
    public static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU;
    public static final /* synthetic */ long receiveSegment$volatile$FU$offset;
    public static final /* synthetic */ long sendSegment$volatile$FU$offset;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final Function1 onUndeliveredElement;
    public final ColorModelsKt$$ExternalSyntheticLambda0 onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    public final class BufferedChannelIterator implements Waiter {
        public CancellableContinuationImpl continuation;
        public Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        public final Object hasNext(Continuation continuation) {
            ChannelSegment channelSegment;
            Boolean bool;
            Object obj = this.receiveResult;
            boolean z = true;
            if (obj == BufferedChannelKt.NO_RECEIVE_RESULT || obj == BufferedChannelKt.CHANNEL_CLOSED) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.receiveSegment$volatile$FU;
                BufferedChannel bufferedChannel = BufferedChannel.this;
                ChannelSegment channelSegment2 = (ChannelSegment) atomicReferenceFieldUpdater.get(bufferedChannel);
                while (true) {
                    if (bufferedChannel.isClosedForReceive()) {
                        this.receiveResult = BufferedChannelKt.CHANNEL_CLOSED;
                        Throwable closeCause = bufferedChannel.getCloseCause();
                        if (closeCause != null) {
                            int i = StackTraceRecoveryKt.$r8$clinit;
                            throw closeCause;
                        }
                        z = false;
                    } else {
                        long andIncrement = BufferedChannel.receivers$volatile$FU.getAndIncrement(bufferedChannel);
                        int i2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j = andIncrement / i2;
                        int i3 = (int) (andIncrement % i2);
                        if (channelSegment2.id != j) {
                            channelSegment = bufferedChannel.findSegmentReceive(j, channelSegment2);
                            if (channelSegment == null) {
                                continue;
                            }
                        } else {
                            channelSegment = channelSegment2;
                        }
                        Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i3, andIncrement, null);
                        ChannelSegment channelSegment3 = channelSegment;
                        Symbol symbol = BufferedChannelKt.SUSPEND;
                        UiScopeKt$$ExternalSyntheticLambda0 uiScopeKt$$ExternalSyntheticLambda0 = null;
                        if (updateCellReceive == symbol) {
                            a$$ExternalSyntheticBUOutline0.m$1("unreachable");
                            return null;
                        }
                        Symbol symbol2 = BufferedChannelKt.FAILED;
                        if (updateCellReceive == symbol2) {
                            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment3.cleanPrev();
                            }
                            channelSegment2 = channelSegment3;
                        } else {
                            if (updateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                BufferedChannel bufferedChannel2 = BufferedChannel.this;
                                CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                                try {
                                    this.continuation = orCreateCancellableContinuation;
                                    Object updateCellReceive2 = bufferedChannel2.updateCellReceive(channelSegment3, i3, andIncrement, this);
                                    Function1 function1 = bufferedChannel2.onUndeliveredElement;
                                    if (updateCellReceive2 == symbol) {
                                        invokeOnCancellation(channelSegment3, i3);
                                    } else {
                                        if (updateCellReceive2 == symbol2) {
                                            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                                                channelSegment3.cleanPrev();
                                            }
                                            ChannelSegment channelSegment4 = (ChannelSegment) BufferedChannel.receiveSegment$volatile$FU.get(bufferedChannel2);
                                            while (true) {
                                                if (bufferedChannel2.isClosedForReceive()) {
                                                    CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
                                                    cancellableContinuationImpl.getClass();
                                                    this.continuation = null;
                                                    this.receiveResult = BufferedChannelKt.CHANNEL_CLOSED;
                                                    Throwable closeCause2 = bufferedChannel.getCloseCause();
                                                    if (closeCause2 == null) {
                                                        Result.Companion companion = Result.Companion;
                                                        cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        Result.Companion companion2 = Result.Companion;
                                                        cancellableContinuationImpl.resumeWith(new Result.Failure(closeCause2));
                                                    }
                                                } else {
                                                    long andIncrement2 = BufferedChannel.receivers$volatile$FU.getAndIncrement(bufferedChannel2);
                                                    long j2 = BufferedChannelKt.SEGMENT_SIZE;
                                                    long j3 = andIncrement2 / j2;
                                                    int i4 = (int) (andIncrement2 % j2);
                                                    if (channelSegment4.id != j3) {
                                                        ChannelSegment findSegmentReceive = bufferedChannel2.findSegmentReceive(j3, channelSegment4);
                                                        if (findSegmentReceive != null) {
                                                            channelSegment4 = findSegmentReceive;
                                                        }
                                                    }
                                                    Object updateCellReceive3 = bufferedChannel2.updateCellReceive(channelSegment4, i4, andIncrement2, this);
                                                    if (updateCellReceive3 == BufferedChannelKt.SUSPEND) {
                                                        invokeOnCancellation(channelSegment4, i4);
                                                        break;
                                                    }
                                                    if (updateCellReceive3 == BufferedChannelKt.FAILED) {
                                                        if (andIncrement2 < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                                                            channelSegment4.cleanPrev();
                                                        }
                                                    } else {
                                                        if (updateCellReceive3 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        channelSegment4.cleanPrev();
                                                        this.receiveResult = updateCellReceive3;
                                                        this.continuation = null;
                                                        bool = Boolean.TRUE;
                                                        if (function1 != null) {
                                                            uiScopeKt$$ExternalSyntheticLambda0 = new UiScopeKt$$ExternalSyntheticLambda0(3, function1, updateCellReceive3);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            channelSegment3.cleanPrev();
                                            this.receiveResult = updateCellReceive2;
                                            this.continuation = null;
                                            bool = Boolean.TRUE;
                                            if (function1 != null) {
                                                uiScopeKt$$ExternalSyntheticLambda0 = new UiScopeKt$$ExternalSyntheticLambda0(3, function1, updateCellReceive2);
                                            }
                                        }
                                        orCreateCancellableContinuation.resume(bool, uiScopeKt$$ExternalSyntheticLambda0);
                                    }
                                    Object result = orCreateCancellableContinuation.getResult();
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    return result;
                                } catch (Throwable th) {
                                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                                    throw th;
                                }
                            }
                            channelSegment3.cleanPrev();
                            this.receiveResult = updateCellReceive;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlinx.coroutines.Waiter
        public final void invokeOnCancellation(Segment segment, int i) {
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i);
            }
        }

        public final Object next() {
            Object obj = this.receiveResult;
            Symbol symbol = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (obj == symbol) {
                a$$ExternalSyntheticBUOutline0.m$1("`hasNext()` has not been invoked");
                return null;
            }
            this.receiveResult = symbol;
            if (obj != BufferedChannelKt.CHANNEL_CLOSED) {
                return obj;
            }
            Throwable receiveException = BufferedChannel.this.getReceiveException();
            int i = StackTraceRecoveryKt.$r8$clinit;
            throw receiveException;
        }
    }

    static {
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        sendSegment$volatile$FU$offset = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("sendSegment$volatile"));
        receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
        receiveSegment$volatile$FU$offset = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("receiveSegment$volatile"));
        bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
        bufferEndSegment$volatile$FU$offset = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("bufferEndSegment$volatile"));
        _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
        _closeCause$volatile$FU$offset = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("_closeCause$volatile"));
        closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
        closeHandler$volatile$FU$offset = unsafe.objectFieldOffset(BufferedChannel.class.getDeclaredField("closeHandler$volatile"));
    }

    public BufferedChannel(int i, Function1 function1) {
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        ChannelSegment channelSegment = BufferedChannelKt.NULL_SEGMENT;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = bufferEnd$volatile$FU.get(this);
        ChannelSegment channelSegment2 = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment2;
        this.receiveSegment$volatile = channelSegment2;
        if (isRendezvousOrUnlimited()) {
            channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
            channelSegment2.getClass();
        }
        this.bufferEndSegment$volatile = channelSegment2;
        this.onUndeliveredElementReceiveCancellationConstructor = function1 != null ? new ColorModelsKt$$ExternalSyntheticLambda0(this, 8) : null;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    public static final void access$onClosedSendOnNoWaiterSuspend(BufferedChannel bufferedChannel, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
        Function1 function1 = bufferedChannel.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(function1, obj, cancellableContinuationImpl.context);
        }
        Throwable sendException = bufferedChannel.getSendException();
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(new Result.Failure(sendException));
    }

    public static final int access$updateCellSend(BufferedChannel bufferedChannel, ChannelSegment channelSegment, int i, Object obj, long j, Object obj2, boolean z) {
        channelSegment.setElementLazy(i, obj);
        if (z) {
            return bufferedChannel.updateCellSendSlow(channelSegment, i, obj, j, obj2, z);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferedChannel.bufferOrRendezvousSend(j)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.setElementLazy(i, null);
            if (bufferedChannel.tryResumeReceiver(state$kotlinx_coroutines_core, obj)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                return 0;
            }
            Symbol symbol = BufferedChannelKt.INTERRUPTED_RCV;
            if (channelSegment.data.getAndSet((i * 2) + 1, symbol) == symbol) {
                return 5;
            }
            channelSegment.onCancelledRequest(i, true);
            return 5;
        }
        return bufferedChannel.updateCellSendSlow(channelSegment, i, obj, j, obj2, z);
    }

    public static void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        if ((atomicLongFieldUpdater.addAndGet(bufferedChannel, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bufferedChannel) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static Object receive$suspendImpl(BufferedChannel bufferedChannel, Continuation continuation) {
        ChannelSegment channelSegment;
        Throwable th;
        ChannelSegment channelSegment2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        atomicReferenceFieldUpdater.getClass();
        StateFlowKt$combineState$2 stateFlowKt$combineState$2 = null;
        if (bufferedChannel == null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        ChannelSegment channelSegment3 = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(bufferedChannel, receiveSegment$volatile$FU$offset);
        while (!bufferedChannel.isClosedForReceive()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
            long j = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (channelSegment3.id != j2) {
                ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment3);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment3;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object updateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i, andIncrement, null);
            Symbol symbol = BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected");
                return null;
            }
            Symbol symbol2 = BufferedChannelKt.FAILED;
            if (updateCellReceive == symbol2) {
                if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                bufferedChannel = bufferedChannel2;
                channelSegment3 = channelSegment;
            } else {
                if (updateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegment.cleanPrev();
                    return updateCellReceive;
                }
                Function1 function1 = bufferedChannel2.onUndeliveredElement;
                CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                try {
                    Object updateCellReceive2 = bufferedChannel2.updateCellReceive(channelSegment, i, andIncrement, orCreateCancellableContinuation);
                    if (updateCellReceive2 == symbol) {
                        orCreateCancellableContinuation.invokeOnCancellation(channelSegment, i);
                    } else {
                        if (updateCellReceive2 == symbol2) {
                            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment4 = (ChannelSegment) atomicReferenceFieldUpdater.get(bufferedChannel2);
                            while (true) {
                                if (bufferedChannel2.isClosedForReceive()) {
                                    Result.Companion companion = Result.Companion;
                                    orCreateCancellableContinuation.resumeWith(new Result.Failure(bufferedChannel2.getReceiveException()));
                                    break;
                                }
                                CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bufferedChannel2);
                                    long j3 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (channelSegment4.id != j4) {
                                        try {
                                            ChannelSegment findSegmentReceive2 = bufferedChannel2.findSegmentReceive(j4, channelSegment4);
                                            if (findSegmentReceive2 == null) {
                                                orCreateCancellableContinuation = cancellableContinuationImpl;
                                            } else {
                                                channelSegment2 = findSegmentReceive2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            orCreateCancellableContinuation = cancellableContinuationImpl;
                                            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                                            throw th;
                                        }
                                    } else {
                                        channelSegment2 = channelSegment4;
                                    }
                                    BufferedChannel bufferedChannel3 = bufferedChannel2;
                                    updateCellReceive2 = bufferedChannel3.updateCellReceive(channelSegment2, i2, andIncrement2, cancellableContinuationImpl);
                                    bufferedChannel2 = bufferedChannel3;
                                    ChannelSegment channelSegment5 = channelSegment2;
                                    orCreateCancellableContinuation = cancellableContinuationImpl;
                                    if (updateCellReceive2 == BufferedChannelKt.SUSPEND) {
                                        orCreateCancellableContinuation.invokeOnCancellation(channelSegment5, i2);
                                        break;
                                    }
                                    if (updateCellReceive2 == BufferedChannelKt.FAILED) {
                                        if (andIncrement2 < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment5.cleanPrev();
                                        }
                                        channelSegment4 = channelSegment5;
                                    } else {
                                        if (updateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegment5.cleanPrev();
                                        if (function1 != null) {
                                            stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(bufferedChannel2, 9);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    orCreateCancellableContinuation = cancellableContinuationImpl;
                                    th = th;
                                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                                    throw th;
                                }
                            }
                        } else {
                            channelSegment.cleanPrev();
                            if (function1 != null) {
                                stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(bufferedChannel2, 9);
                            }
                        }
                        orCreateCancellableContinuation.resume(updateCellReceive2, stateFlowKt$combineState$2);
                    }
                    Object result = orCreateCancellableContinuation.getResult();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return result;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable receiveException = bufferedChannel.getReceiveException();
        int i3 = StackTraceRecoveryKt.$r8$clinit;
        throw receiveException;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m4186receiveCatchingJP2dKIU$suspendImpl(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        int i;
        ChannelSegment channelSegment;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i2 = bufferedChannel$receiveCatching$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bufferedChannel$receiveCatching$1.label = i2 - PKIFailureInfo.systemUnavail;
                BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                Object obj = bufferedChannel$receiveCatching$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bufferedChannel$receiveCatching$12.label;
                if (i == 0) {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return ((ChannelResult) obj).holder;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                receiveSegment$volatile$FU.getClass();
                ChannelSegment channelSegment2 = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(bufferedChannel, receiveSegment$volatile$FU$offset);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = receivers$volatile$FU.getAndIncrement(bufferedChannel);
                    long j = BufferedChannelKt.SEGMENT_SIZE;
                    long j2 = andIncrement / j;
                    int i3 = (int) (andIncrement % j);
                    if (channelSegment2.id != j2) {
                        ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment2);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = findSegmentReceive;
                        }
                    } else {
                        channelSegment = channelSegment2;
                    }
                    BufferedChannel bufferedChannel2 = bufferedChannel;
                    Object updateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i3, andIncrement, null);
                    if (updateCellReceive == BufferedChannelKt.SUSPEND) {
                        a$$ExternalSyntheticBUOutline0.m$1("unexpected");
                        return null;
                    }
                    if (updateCellReceive != BufferedChannelKt.FAILED) {
                        if (updateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                            channelSegment.cleanPrev();
                            return updateCellReceive;
                        }
                        bufferedChannel$receiveCatching$12.label = 1;
                        Object m4188receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel2.m4188receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i3, andIncrement, bufferedChannel$receiveCatching$12);
                        return m4188receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutineSingletons ? coroutineSingletons : m4188receiveCatchingOnNoWaiterSuspendGKJJFZk;
                    }
                    if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    bufferedChannel = bufferedChannel2;
                    channelSegment2 = channelSegment;
                }
                return new ChannelResult.Closed(bufferedChannel.getCloseCause());
            }
        }
        bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        Object obj2 = bufferedChannel$receiveCatching$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bufferedChannel$receiveCatching$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object send$suspendImpl(BufferedChannel bufferedChannel, Object obj, Continuation continuation) {
        Object result;
        CoroutineSingletons coroutineSingletons;
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        atomicReferenceFieldUpdater.getClass();
        ChannelSegment channelSegment = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(bufferedChannel, sendSegment$volatile$FU$offset);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosed = bufferedChannel.isClosed(andIncrement, false);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (channelSegment.id != j3) {
                ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j3, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosed) {
                    Object onClosedSend = bufferedChannel.onClosedSend(obj, continuation);
                    if (onClosedSend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return onClosedSend;
                    }
                }
            }
            int access$updateCellSend = access$updateCellSend(bufferedChannel, channelSegment, i2, obj, j, null, isClosed);
            if (access$updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (access$updateCellSend == 1) {
                break;
            }
            if (access$updateCellSend != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = receivers$volatile$FU;
                if (access$updateCellSend == 3) {
                    CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                    try {
                        int access$updateCellSend2 = access$updateCellSend(bufferedChannel, channelSegment, i2, obj, j, orCreateCancellableContinuation, false);
                        if (access$updateCellSend2 == 0) {
                            channelSegment.cleanPrev();
                            Result.Companion companion = Result.Companion;
                        } else if (access$updateCellSend2 != 1) {
                            if (access$updateCellSend2 != 2) {
                                if (access$updateCellSend2 != 4) {
                                    String str = "unexpected";
                                    if (access$updateCellSend2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    channelSegment.cleanPrev();
                                    ChannelSegment channelSegment2 = (ChannelSegment) atomicReferenceFieldUpdater.get(bufferedChannel);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bufferedChannel);
                                        long j4 = andIncrement2 & 1152921504606846975L;
                                        boolean isClosed2 = bufferedChannel.isClosed(andIncrement2, false);
                                        int i3 = BufferedChannelKt.SEGMENT_SIZE;
                                        String str2 = str;
                                        long j5 = i3;
                                        long j6 = j4 / j5;
                                        int i4 = (int) (j4 % j5);
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                        if (channelSegment2.id != j6) {
                                            ChannelSegment findSegmentSend2 = bufferedChannel.findSegmentSend(j6, channelSegment2);
                                            if (findSegmentSend2 != null) {
                                                channelSegment2 = findSegmentSend2;
                                            } else {
                                                if (isClosed2) {
                                                    access$onClosedSendOnNoWaiterSuspend(bufferedChannel, obj, orCreateCancellableContinuation);
                                                    break;
                                                }
                                                str = str2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            }
                                        }
                                        obj2 = obj;
                                        int access$updateCellSend3 = access$updateCellSend(bufferedChannel, channelSegment2, i4, obj2, j4, orCreateCancellableContinuation, isClosed2);
                                        if (access$updateCellSend3 == 0) {
                                            channelSegment2.cleanPrev();
                                            Result.Companion companion2 = Result.Companion;
                                            break;
                                        }
                                        if (access$updateCellSend3 == 1) {
                                            Result.Companion companion3 = Result.Companion;
                                            break;
                                        }
                                        if (access$updateCellSend3 != 2) {
                                            if (access$updateCellSend3 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (access$updateCellSend3 != 4) {
                                                if (access$updateCellSend3 == 5) {
                                                    channelSegment2.cleanPrev();
                                                }
                                                str = str2;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            } else if (j4 < atomicLongFieldUpdater3.get(bufferedChannel)) {
                                                channelSegment2.cleanPrev();
                                            }
                                        } else if (isClosed2) {
                                            channelSegment2.onSlotCleaned();
                                        } else {
                                            orCreateCancellableContinuation.invokeOnCancellation(channelSegment2, i4 + i3);
                                        }
                                    }
                                } else {
                                    obj2 = obj;
                                    if (j < atomicLongFieldUpdater2.get(bufferedChannel)) {
                                        channelSegment.cleanPrev();
                                    }
                                }
                                access$onClosedSendOnNoWaiterSuspend(bufferedChannel, obj2, orCreateCancellableContinuation);
                            } else {
                                orCreateCancellableContinuation.invokeOnCancellation(channelSegment, i2 + i);
                            }
                            result = orCreateCancellableContinuation.getResult();
                            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            if (result != coroutineSingletons) {
                                result = Unit.INSTANCE;
                            }
                            if (result == coroutineSingletons) {
                                return result;
                            }
                        } else {
                            Result.Companion companion4 = Result.Companion;
                        }
                        orCreateCancellableContinuation.resumeWith(Unit.INSTANCE);
                        result = orCreateCancellableContinuation.getResult();
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (result != coroutineSingletons) {
                        }
                        if (result == coroutineSingletons) {
                        }
                    } catch (Throwable th) {
                        orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                        throw th;
                    }
                } else if (access$updateCellSend == 4) {
                    if (j < atomicLongFieldUpdater2.get(bufferedChannel)) {
                        channelSegment.cleanPrev();
                    }
                    Object onClosedSend2 = bufferedChannel.onClosedSend(obj, continuation);
                    if (onClosedSend2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return onClosedSend2;
                    }
                } else if (access$updateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosed) {
                channelSegment.onSlotCleaned();
                Object onClosedSend3 = bufferedChannel.onClosedSend(obj, continuation);
                if (onClosedSend3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return onClosedSend3;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean bufferOrRendezvousSend(long j) {
        return j < bufferEnd$volatile$FU.get(this) || j < receivers$volatile$FU.get(this) + ((long) this.capacity);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        closeOrCancelImpl(cancellationException, true);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    public final ChannelSegment closeLinkedList() {
        bufferEndSegment$volatile$FU.getClass();
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        Object objectVolatile = unsafe.getObjectVolatile(this, bufferEndSegment$volatile$FU$offset);
        sendSegment$volatile$FU.getClass();
        ChannelSegment channelSegment = (ChannelSegment) unsafe.getObjectVolatile(this, sendSegment$volatile$FU$offset);
        if (channelSegment.id > ((ChannelSegment) objectVolatile).id) {
            objectVolatile = channelSegment;
        }
        receiveSegment$volatile$FU.getClass();
        ChannelSegment channelSegment2 = (ChannelSegment) unsafe.getObjectVolatile(this, receiveSegment$volatile$FU$offset);
        if (channelSegment2.id > ((ChannelSegment) objectVolatile).id) {
            objectVolatile = channelSegment2;
        }
        ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ConcurrentLinkedListNode._next$volatile$FU;
            Object nextOrClosed = concurrentLinkedListNode.getNextOrClosed();
            if (nextOrClosed == InlineList.CLOSED) {
                break;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode2 != null) {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            } else if (concurrentLinkedListNode.markAsClosed()) {
                break;
            }
        }
        return (ChannelSegment) concurrentLinkedListNode;
    }

    public final boolean closeOrCancelImpl(Throwable th, boolean z) {
        BufferedChannel bufferedChannel;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                ChannelSegment channelSegment = BufferedChannelKt.NULL_SEGMENT;
                bufferedChannel = this;
                if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = bufferedChannel;
            }
        }
        bufferedChannel = this;
        Symbol symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        while (true) {
            _closeCause$volatile$FU.getClass();
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j5 = _closeCause$volatile$FU$offset;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(bufferedChannel2, j5, symbol, th2);
            bufferedChannel = bufferedChannel2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(bufferedChannel, j5) != symbol) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(bufferedChannel);
            } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(bufferedChannel);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, j2));
        }
        bufferedChannel.isClosedForSend();
        if (z2) {
            bufferedChannel.invokeCloseHandler();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (kotlinx.coroutines.channels.ChannelSegment) r1.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChannelSegment completeClose(long j) {
        long j2;
        ChannelSegment closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            ChannelSegment channelSegment = closeLinkedList;
            loop0: do {
                int i = BufferedChannelKt.SEGMENT_SIZE - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i;
                    if (j2 < receivers$volatile$FU.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                        if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                            if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                                break loop0;
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (channelSegment != null);
            j2 = -1;
            if (j2 != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(j2);
            }
        }
        Object obj = null;
        loop3: for (ChannelSegment channelSegment2 = closeLinkedList; channelSegment2 != null; channelSegment2 = (ChannelSegment) channelSegment2.getPrev()) {
            for (int i2 = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i2; i2--) {
                if ((channelSegment2.id * BufferedChannelKt.SEGMENT_SIZE) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core2 = channelSegment2.getState$kotlinx_coroutines_core(i2);
                    if (state$kotlinx_coroutines_core2 != null && state$kotlinx_coroutines_core2 != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core2 instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core2 instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment2.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core2, BufferedChannelKt.CHANNEL_CLOSED)) {
                                obj = InlineList.m4200plusFjFbRPM(obj, state$kotlinx_coroutines_core2);
                                channelSegment2.onCancelledRequest(i2, true);
                                break;
                            }
                        } else {
                            if (channelSegment2.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core2, BufferedChannelKt.CHANNEL_CLOSED)) {
                                obj = InlineList.m4200plusFjFbRPM(obj, ((WaiterEB) state$kotlinx_coroutines_core2).waiter);
                                channelSegment2.onCancelledRequest(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment2.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core2, BufferedChannelKt.CHANNEL_CLOSED)) {
                            channelSegment2.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                resumeWaiterOnClosedChannel((Waiter) obj, true);
                return closeLinkedList;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeWaiterOnClosedChannel((Waiter) arrayList.get(size), true);
            }
        }
        return closeLinkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r9 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r9, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j) {
        UndeliveredElementException callUndeliveredElementCatchingException;
        receiveSegment$volatile$FU.getClass();
        ChannelSegment channelSegment = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, receiveSegment$volatile$FU$offset);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.capacity + j2, bufferEnd$volatile$FU.get(this))) {
                return;
            }
            BufferedChannel bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j2, 1 + j2)) {
                long j3 = BufferedChannelKt.SEGMENT_SIZE;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (channelSegment.id != j4) {
                    ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j4, channelSegment);
                    if (findSegmentReceive != null) {
                        channelSegment = findSegmentReceive;
                    }
                }
                ChannelSegment channelSegment2 = channelSegment;
                Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment2, i, j2, null);
                if (updateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegment2.cleanPrev();
                    Function1 function1 = bufferedChannel.onUndeliveredElement;
                    if (function1 != null && callUndeliveredElementCatchingException != null) {
                        throw callUndeliveredElementCatchingException;
                    }
                } else if (j2 < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                this = bufferedChannel;
                channelSegment = channelSegment2;
            }
            this = bufferedChannel;
        }
    }

    public final void expandBuffer() {
        BufferedChannel bufferedChannel;
        String obj;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        bufferEndSegment$volatile$FU.getClass();
        ChannelSegment channelSegment = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, bufferEndSegment$volatile$FU$offset);
        loop0: while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            long j = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / j;
            if (this.getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j2 && channelSegment.getNext() != null) {
                    this.moveSegmentBufferEndToSpecifiedOrLast(j2, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this);
                return;
            }
            bufferedChannel = this;
            if (channelSegment.id != j2) {
                ChannelSegment findSegmentBufferEnd = bufferedChannel.findSegmentBufferEnd(j2, channelSegment, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                    this = bufferedChannel;
                } else {
                    channelSegment = findSegmentBufferEnd;
                }
            }
            int i = (int) (andIncrement % j);
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            boolean z = state$kotlinx_coroutines_core instanceof Waiter;
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
            if (!z || andIncrement < atomicLongFieldUpdater.get(bufferedChannel) || !channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                while (true) {
                    Object state$kotlinx_coroutines_core2 = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (!(state$kotlinx_coroutines_core2 instanceof Waiter)) {
                        if (state$kotlinx_coroutines_core2 != BufferedChannelKt.INTERRUPTED_SEND) {
                            if (state$kotlinx_coroutines_core2 != null) {
                                if (state$kotlinx_coroutines_core2 == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core2 == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core2 == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core2 == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core2 == BufferedChannelKt.CHANNEL_CLOSED) {
                                    break loop0;
                                }
                                if (state$kotlinx_coroutines_core2 != BufferedChannelKt.RESUMING_BY_RCV) {
                                    obj = ("Unexpected cell state: " + state$kotlinx_coroutines_core2).toString();
                                    a$$ExternalSyntheticBUOutline0.m$1(obj);
                                    return;
                                }
                            } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.IN_BUFFER)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(bufferedChannel)) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, new WaiterEB((Waiter) state$kotlinx_coroutines_core2))) {
                            break loop0;
                        }
                    } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.RESUMING_BY_EB)) {
                        if (bufferedChannel.tryResumeSender(state$kotlinx_coroutines_core2, channelSegment, i)) {
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                            break;
                        } else {
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onSlotCleaned();
                        }
                    }
                }
                incCompletedExpandBufferAttempts$default(bufferedChannel);
            } else if (bufferedChannel.tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                break;
            } else {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                channelSegment.onSlotCleaned();
                incCompletedExpandBufferAttempts$default(bufferedChannel);
            }
            this = bufferedChannel;
        }
        incCompletedExpandBufferAttempts$default(bufferedChannel);
    }

    public final ChannelSegment findSegmentBufferEnd(long j, ChannelSegment channelSegment, long j2) {
        Object findSegmentInternal;
        ChannelSegment channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = InlineList.findSegmentInternal(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
            if (!InlineList.m4199isClosedimpl(findSegmentInternal)) {
                Segment m4198getSegmentimpl = InlineList.m4198getSegmentimpl(findSegmentInternal);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                    atomicReferenceFieldUpdater.getClass();
                    Segment segment = (Segment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, bufferEndSegment$volatile$FU$offset);
                    if (segment.id >= m4198getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m4198getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (SizeMode$EnumUnboxingLocalUtility.m(atomicReferenceFieldUpdater, this, segment, m4198getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m4198getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m4198getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (InlineList.m4199isClosedimpl(findSegmentInternal)) {
            isClosedForSend();
            moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
            incCompletedExpandBufferAttempts$default(this);
            return null;
        }
        ChannelSegment channelSegment3 = (ChannelSegment) InlineList.m4198getSegmentimpl(findSegmentInternal);
        long j3 = channelSegment3.id;
        if (j3 <= j) {
            return channelSegment3;
        }
        long j4 = j3 * BufferedChannelKt.SEGMENT_SIZE;
        if (!bufferEnd$volatile$FU.compareAndSet(this, j2 + 1, j4)) {
            incCompletedExpandBufferAttempts$default(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        if ((atomicLongFieldUpdater.addAndGet(this, j4 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.decPointers$kotlinx_coroutines_core() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ChannelSegment findSegmentReceive(long j, ChannelSegment channelSegment) {
        Object findSegmentInternal;
        ChannelSegment channelSegment2;
        long j2;
        Unsafe unsafe;
        ChannelSegment channelSegment3 = BufferedChannelKt.NULL_SEGMENT;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = InlineList.findSegmentInternal(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
            if (!InlineList.m4199isClosedimpl(findSegmentInternal)) {
                Segment m4198getSegmentimpl = InlineList.m4198getSegmentimpl(findSegmentInternal);
                while (true) {
                    receiveSegment$volatile$FU.getClass();
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    long j3 = receiveSegment$volatile$FU$offset;
                    Segment segment = (Segment) unsafe2.getObjectVolatile(this, j3);
                    if (segment.id >= m4198getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m4198getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        if (unsafe.compareAndSwapObject(this, receiveSegment$volatile$FU$offset, segment, m4198getSegmentimpl)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == segment);
                    if (m4198getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m4198getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (InlineList.m4199isClosedimpl(findSegmentInternal)) {
            isClosedForSend();
            if (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
                return null;
            }
        } else {
            ChannelSegment channelSegment4 = (ChannelSegment) InlineList.m4198getSegmentimpl(findSegmentInternal);
            long j4 = channelSegment4.id;
            if (!isRendezvousOrUnlimited() && j <= bufferEnd$volatile$FU.get(this) / BufferedChannelKt.SEGMENT_SIZE) {
                while (true) {
                    bufferEndSegment$volatile$FU.getClass();
                    Unsafe unsafe3 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    long j5 = bufferEndSegment$volatile$FU$offset;
                    Segment segment2 = (Segment) unsafe3.getObjectVolatile(this, j5);
                    if (segment2.id >= j4 || !channelSegment4.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        channelSegment2 = channelSegment4;
                        if (unsafe4.compareAndSwapObject(this, bufferEndSegment$volatile$FU$offset, segment2, channelSegment4)) {
                            if (segment2.decPointers$kotlinx_coroutines_core()) {
                                segment2.remove();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != segment2) {
                                break;
                            }
                            channelSegment4 = channelSegment2;
                        }
                    }
                    channelSegment4 = channelSegment2;
                }
                if (j4 > j) {
                    return channelSegment2;
                }
                long j6 = j4 * BufferedChannelKt.SEGMENT_SIZE;
                do {
                    j2 = receivers$volatile$FU.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!receivers$volatile$FU.compareAndSet(this, j2, j6));
                if (j4 * BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
            }
            channelSegment2 = channelSegment4;
            if (j4 > j) {
            }
        }
        return null;
    }

    public final ChannelSegment findSegmentSend(long j, ChannelSegment channelSegment) {
        Object findSegmentInternal;
        long j2;
        long j3;
        Unsafe unsafe;
        ChannelSegment channelSegment2 = BufferedChannelKt.NULL_SEGMENT;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = InlineList.findSegmentInternal(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
            if (!InlineList.m4199isClosedimpl(findSegmentInternal)) {
                Segment m4198getSegmentimpl = InlineList.m4198getSegmentimpl(findSegmentInternal);
                while (true) {
                    sendSegment$volatile$FU.getClass();
                    Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                    long j4 = sendSegment$volatile$FU$offset;
                    Segment segment = (Segment) unsafe2.getObjectVolatile(this, j4);
                    if (segment.id >= m4198getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m4198getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        if (unsafe.compareAndSwapObject(this, sendSegment$volatile$FU$offset, segment, m4198getSegmentimpl)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == segment);
                    if (m4198getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m4198getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        boolean m4199isClosedimpl = InlineList.m4199isClosedimpl(findSegmentInternal);
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        if (m4199isClosedimpl) {
            isClosedForSend();
            if (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE < atomicLongFieldUpdater.get(this)) {
                channelSegment.cleanPrev();
                return null;
            }
        } else {
            ChannelSegment channelSegment3 = (ChannelSegment) InlineList.m4198getSegmentimpl(findSegmentInternal);
            long j5 = channelSegment3.id;
            if (j5 <= j) {
                return channelSegment3;
            }
            long j6 = j5 * BufferedChannelKt.SEGMENT_SIZE;
            do {
                j2 = sendersAndCloseStatus$volatile$FU.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * BufferedChannelKt.SEGMENT_SIZE < atomicLongFieldUpdater.get(this)) {
                channelSegment3.cleanPrev();
            }
        }
        return null;
    }

    public final Throwable getCloseCause() {
        _closeCause$volatile$FU.getClass();
        return (Throwable) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _closeCause$volatile$FU$offset);
    }

    public final DefaultSocket getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, bufferedChannel$onReceive$2);
        return new DefaultSocket(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.onUndeliveredElementReceiveCancellationConstructor, 9);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final DefaultSocket getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, bufferedChannel$onReceiveCatching$2);
        return new DefaultSocket(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.onUndeliveredElementReceiveCancellationConstructor, 9);
    }

    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException() : closeCause;
    }

    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException("Channel was closed") : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            receiveSegment$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = receiveSegment$volatile$FU$offset;
            ChannelSegment channelSegment = (ChannelSegment) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
            long j2 = atomicLongFieldUpdater.get(this);
            if (getSendersCounter$kotlinx_coroutines_core() <= j2) {
                return false;
            }
            long j3 = BufferedChannelKt.SEGMENT_SIZE;
            long j4 = j2 / j3;
            if (channelSegment.id == j4 || (channelSegment = findSegmentReceive(j4, channelSegment)) != null) {
                channelSegment.cleanPrev();
                int i = (int) (j2 % j3);
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                            expandBuffer();
                            break;
                        }
                    } else {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                            return true;
                        }
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.CHANNEL_CLOSED && state$kotlinx_coroutines_core != BufferedChannelKt.DONE_RCV && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                            if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                                return true;
                            }
                            if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                receivers$volatile$FU.compareAndSet(this, j2, j2 + 1);
            } else if (((ChannelSegment) unsafe.getObjectVolatile(this, j)).id < j4) {
                return false;
            }
        }
    }

    public final void invokeCloseHandler() {
        Object objectVolatile;
        BufferedChannel bufferedChannel;
        loop0: while (true) {
            closeHandler$volatile$FU.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = closeHandler$volatile$FU$offset;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            Symbol symbol = objectVolatile == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            while (true) {
                Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                bufferedChannel = this;
                if (unsafe2.compareAndSwapObject(bufferedChannel, closeHandler$volatile$FU$offset, objectVolatile, symbol)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(bufferedChannel, j) != objectVolatile) {
                    break;
                } else {
                    this = bufferedChannel;
                }
            }
            this = bufferedChannel;
        }
        if (objectVolatile == null) {
            return;
        }
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, objectVolatile);
        ((Function1) objectVolatile).invoke(bufferedChannel.getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(Function1 function1) {
        String obj;
        Unsafe unsafe;
        while (true) {
            closeHandler$volatile$FU.getClass();
            Unsafe unsafe2 = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            BufferedChannel bufferedChannel = this;
            if (unsafe2.compareAndSwapObject(bufferedChannel, closeHandler$volatile$FU$offset, (Object) null, function1)) {
                return;
            }
            long j = closeHandler$volatile$FU$offset;
            if (unsafe2.getObjectVolatile(bufferedChannel, j) != null) {
                while (true) {
                    Object objectVolatile = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(bufferedChannel, j);
                    Symbol symbol = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                    if (objectVolatile != symbol) {
                        if (objectVolatile == BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                            a$$ExternalSyntheticBUOutline0.m$1("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            obj = ("Another handler is already registered: " + objectVolatile).toString();
                            a$$ExternalSyntheticBUOutline0.m$1(obj);
                            return;
                        }
                    }
                    Symbol symbol2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                    do {
                        BufferedChannel bufferedChannel2 = bufferedChannel;
                        unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
                        boolean compareAndSwapObject = unsafe.compareAndSwapObject(bufferedChannel2, closeHandler$volatile$FU$offset, symbol, symbol2);
                        bufferedChannel = bufferedChannel2;
                        if (compareAndSwapObject) {
                            function1.invoke(bufferedChannel.getCloseCause());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(bufferedChannel, j) == symbol);
                }
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c0, code lost:
    
        r13 = (kotlinx.coroutines.channels.ChannelSegment) r13.getPrev();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isClosed(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                completeClose(j & 1152921504606846975L);
                if (!z || !hasElements$kotlinx_coroutines_core()) {
                }
            } else {
                if (i != 3) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "unexpected close status: "));
                    return false;
                }
                ChannelSegment completeClose = completeClose(j & 1152921504606846975L);
                UndeliveredElementException undeliveredElementException = null;
                Object obj = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = completeClose.data;
                    int i2 = BufferedChannelKt.SEGMENT_SIZE - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (completeClose.id * BufferedChannelKt.SEGMENT_SIZE) + i2;
                        while (true) {
                            Object state$kotlinx_coroutines_core = completeClose.getState$kotlinx_coroutines_core(i2);
                            if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV) {
                                break loop0;
                            }
                            Symbol symbol = BufferedChannelKt.BUFFERED;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
                            Function1 function1 = this.onUndeliveredElement;
                            if (state$kotlinx_coroutines_core == symbol) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (completeClose.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                                    if (function1 != null) {
                                        undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, atomicReferenceArray.get(i2 * 2), undeliveredElementException);
                                    }
                                    completeClose.setElementLazy(i2, null);
                                    completeClose.onSlotCleaned();
                                }
                            } else if (state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER || state$kotlinx_coroutines_core == null) {
                                if (completeClose.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                                    completeClose.onSlotCleaned();
                                    break;
                                }
                            } else if (!(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                                Symbol symbol2 = BufferedChannelKt.RESUMING_BY_EB;
                                if (state$kotlinx_coroutines_core == symbol2 || state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_RCV) {
                                    break loop0;
                                }
                                if (state$kotlinx_coroutines_core != symbol2) {
                                    break;
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                Waiter waiter = state$kotlinx_coroutines_core instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core).waiter : (Waiter) state$kotlinx_coroutines_core;
                                if (completeClose.casState$kotlinx_coroutines_core(i2, state$kotlinx_coroutines_core, BufferedChannelKt.CHANNEL_CLOSED)) {
                                    if (function1 != null) {
                                        undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, atomicReferenceArray.get(i2 * 2), undeliveredElementException);
                                    }
                                    obj = InlineList.m4200plusFjFbRPM(obj, waiter);
                                    completeClose.setElementLazy(i2, null);
                                    completeClose.onSlotCleaned();
                                }
                            }
                        }
                        i2--;
                    }
                } while (completeClose != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            resumeWaiterOnClosedChannel((Waiter) arrayList.get(size), false);
                        }
                    } else {
                        resumeWaiterOnClosedChannel((Waiter) obj, false);
                    }
                }
                if (undeliveredElementException != null) {
                    throw undeliveredElementException;
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isClosedForReceive() {
        return isClosed(sendersAndCloseStatus$volatile$FU.get(this), true);
    }

    public final boolean isClosedForSend() {
        return isClosed(sendersAndCloseStatus$volatile$FU.get(this), false);
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    public final boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    public final boolean isRendezvousOrUnlimited() {
        long j = bufferEnd$volatile$FU.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final BufferedChannelIterator iterator() {
        return new BufferedChannelIterator();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void moveSegmentBufferEndToSpecifiedOrLast(long j, ChannelSegment channelSegment) {
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        while (channelSegment.id < j && (channelSegment3 = (ChannelSegment) channelSegment.getNext()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.isRemoved() || (channelSegment2 = (ChannelSegment) channelSegment.getNext()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                    atomicReferenceFieldUpdater.getClass();
                    Segment segment = (Segment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, bufferEndSegment$volatile$FU$offset);
                    if (segment.id >= channelSegment.id) {
                        return;
                    }
                    if (!channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (SizeMode$EnumUnboxingLocalUtility.m(atomicReferenceFieldUpdater, this, segment, channelSegment)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                            return;
                        }
                        return;
                    } else if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                        channelSegment.remove();
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r4, r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onClosedSend(Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        Function1 function1 = this.onUndeliveredElement;
        if (function1 == null || callUndeliveredElementCatchingException == null) {
            Throwable sendException = getSendException();
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(sendException));
        } else {
            ExceptionsKt__ExceptionsKt.addSuppressed(callUndeliveredElementCatchingException, getSendException());
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(callUndeliveredElementCatchingException));
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receive(ContinuationImpl continuationImpl) {
        return receive$suspendImpl(this, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public final Object mo4187receiveCatchingJP2dKIU(SuspendLambda suspendLambda) {
        return m4186receiveCatchingJP2dKIU$suspendImpl(this, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4188receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment channelSegment, int i, long j, ContinuationImpl continuationImpl) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        int i2;
        ChannelResult channelResult;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
                StateFlowKt$combineState$2 stateFlowKt$combineState$2 = null;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
                    CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
                    try {
                        ReceiveCatching receiveCatching = new ReceiveCatching(orCreateCancellableContinuation);
                        Object updateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                        if (updateCellReceive == BufferedChannelKt.SUSPEND) {
                            receiveCatching.invokeOnCancellation(channelSegment, i);
                        } else {
                            Object obj2 = BufferedChannelKt.FAILED;
                            Function1 function1 = this.onUndeliveredElement;
                            if (updateCellReceive == obj2) {
                                if (j < getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
                                while (true) {
                                    if (isClosedForReceive()) {
                                        Result.Companion companion = Result.Companion;
                                        orCreateCancellableContinuation.resumeWith(new ChannelResult(new ChannelResult.Closed(getCloseCause())));
                                        break;
                                    }
                                    long andIncrement = receivers$volatile$FU.getAndIncrement(this);
                                    long j2 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j3 = andIncrement / j2;
                                    int i4 = (int) (andIncrement % j2);
                                    if (channelSegment2.id != j3) {
                                        ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment2);
                                        if (findSegmentReceive != null) {
                                            channelSegment2 = findSegmentReceive;
                                        }
                                    }
                                    Object updateCellReceive2 = updateCellReceive(channelSegment2, i4, andIncrement, receiveCatching);
                                    if (updateCellReceive2 == BufferedChannelKt.SUSPEND) {
                                        receiveCatching.invokeOnCancellation(channelSegment2, i4);
                                        break;
                                    }
                                    if (updateCellReceive2 == BufferedChannelKt.FAILED) {
                                        if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment2.cleanPrev();
                                        }
                                    } else {
                                        if (updateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegment2.cleanPrev();
                                        channelResult = new ChannelResult(updateCellReceive2);
                                        if (function1 != null) {
                                            stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(this, 10);
                                        }
                                    }
                                }
                            } else {
                                channelSegment.cleanPrev();
                                channelResult = new ChannelResult(updateCellReceive);
                                if (function1 != null) {
                                    stateFlowKt$combineState$2 = new StateFlowKt$combineState$2(this, 10);
                                }
                            }
                            orCreateCancellableContinuation.resume(channelResult, stateFlowKt$combineState$2);
                        }
                        obj = orCreateCancellableContinuation.getResult();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((ChannelResult) obj).holder;
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
        Object obj3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        StateFlowKt$combineState$2 stateFlowKt$combineState$22 = null;
        if (i2 != 0) {
        }
        return ((ChannelResult) obj3).holder;
    }

    public final void registerSelectForReceive(SelectInstance selectInstance) {
        ChannelSegment channelSegment;
        BufferedChannel bufferedChannel;
        SelectInstance selectInstance2;
        int i;
        receiveSegment$volatile$FU.getClass();
        ChannelSegment channelSegment2 = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, receiveSegment$volatile$FU$offset);
        while (!this.isClosedForReceive()) {
            long andIncrement = receivers$volatile$FU.getAndIncrement(this);
            long j = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (channelSegment2.id != j2) {
                ChannelSegment findSegmentReceive = this.findSegmentReceive(j2, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                    selectInstance2 = selectInstance;
                    i = i2;
                    bufferedChannel = this;
                }
            } else {
                channelSegment = channelSegment2;
                bufferedChannel = this;
                selectInstance2 = selectInstance;
                i = i2;
            }
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, selectInstance2);
            channelSegment2 = channelSegment;
            if (updateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                if (waiter != null) {
                    waiter.invokeOnCancellation(channelSegment2, i);
                    return;
                }
                return;
            }
            if (updateCellReceive != BufferedChannelKt.FAILED) {
                if (updateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    a$$ExternalSyntheticBUOutline0.m$1("unexpected");
                    return;
                } else {
                    channelSegment2.cleanPrev();
                    ((SelectImplementation) selectInstance2).internalResult = updateCellReceive;
                    return;
                }
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            this = bufferedChannel;
            selectInstance = selectInstance2;
        }
        ((SelectImplementation) selectInstance).internalResult = BufferedChannelKt.CHANNEL_CLOSED;
    }

    public final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(new Result.Failure(z ? getReceiveException() : getSendException()));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl cancellableContinuationImpl = ((ReceiveCatching) waiter).cont;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(new ChannelResult(new ChannelResult.Closed(getCloseCause())));
            return;
        }
        if (!(waiter instanceof BufferedChannelIterator)) {
            if (waiter instanceof SelectInstance) {
                ((SelectImplementation) ((SelectInstance) waiter)).trySelect(this, BufferedChannelKt.CHANNEL_CLOSED);
                return;
            } else {
                Path$$ExternalSyntheticBUOutline0.m$1(waiter, "Unexpected waiter: ");
                return;
            }
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) waiter;
        CancellableContinuationImpl cancellableContinuationImpl2 = bufferedChannelIterator.continuation;
        cancellableContinuationImpl2.getClass();
        bufferedChannelIterator.continuation = null;
        bufferedChannelIterator.receiveResult = BufferedChannelKt.CHANNEL_CLOSED;
        Throwable closeCause = BufferedChannel.this.getCloseCause();
        if (closeCause == null) {
            Result.Companion companion3 = Result.Companion;
            cancellableContinuationImpl2.resumeWith(Boolean.FALSE);
        } else {
            Result.Companion companion4 = Result.Companion;
            cancellableContinuationImpl2.resumeWith(new Result.Failure(closeCause));
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(Object obj, Continuation continuation) {
        return send$suspendImpl(this, obj, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d2, code lost:
    
        r15 = r8;
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01da, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        receiveSegment$volatile$FU.getClass();
        Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
        int i3 = 0;
        sendSegment$volatile$FU.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, sendSegment$volatile$FU$offset);
        int i4 = 1;
        bufferEndSegment$volatile$FU.getClass();
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ChannelSegment[]{unsafe.getObjectVolatile(this, receiveSegment$volatile$FU$offset), objectVolatile, unsafe.getObjectVolatile(this, bufferEndSegment$volatile$FU$offset)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long j3 = receivers$volatile$FU.get(this);
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            int i5 = BufferedChannelKt.SEGMENT_SIZE;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i6;
                if (j4 >= sendersCounter$kotlinx_coroutines_core && j4 >= j3) {
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i6);
                Object obj2 = channelSegment.data.get(i6 * 2);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    str = (sendersCounter$kotlinx_coroutines_core > j4 || j4 >= j3) ? (j3 > j4 || j4 >= sendersCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    str = (sendersCounter$kotlinx_coroutines_core > j4 || j4 >= j3) ? (j3 > j4 || j4 >= sendersCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    str = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    str = "EB(" + state$kotlinx_coroutines_core + ')';
                } else if (Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    str = "resuming_sender";
                } else {
                    if (state$kotlinx_coroutines_core != null && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.IN_BUFFER) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.DONE_RCV) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.POISONED) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.INTERRUPTED_RCV) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.INTERRUPTED_SEND) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.CHANNEL_CLOSED)) {
                        str = state$kotlinx_coroutines_core.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (StringsKt___StringsKt.last(sb) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public final Object mo4189tryReceivePtdJZtk() {
        ChannelSegment channelSegment;
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosed(j2, true)) {
            return new ChannelResult.Closed(getCloseCause());
        }
        long j3 = j2 & 1152921504606846975L;
        ChannelResult.Failed failed = ChannelResult.failed;
        if (j >= j3) {
            return failed;
        }
        Object obj = BufferedChannelKt.INTERRUPTED_RCV;
        receiveSegment$volatile$FU.getClass();
        ChannelSegment channelSegment2 = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, receiveSegment$volatile$FU$offset);
        while (!this.isClosedForReceive()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = BufferedChannelKt.SEGMENT_SIZE;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (channelSegment2.id != j5) {
                ChannelSegment findSegmentReceive = this.findSegmentReceive(j5, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel bufferedChannel = this;
            Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, obj);
            channelSegment2 = channelSegment;
            if (updateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    waiter.invokeOnCancellation(channelSegment2, i);
                }
                bufferedChannel.waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegment2.onSlotCleaned();
                return failed;
            }
            if (updateCellReceive != BufferedChannelKt.FAILED) {
                if (updateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegment2.cleanPrev();
                    return updateCellReceive;
                }
                a$$ExternalSyntheticBUOutline0.m$1("unexpected");
                return null;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            this = bufferedChannel;
        }
        return new ChannelResult.Closed(this.getCloseCause());
    }

    public final boolean tryResumeReceiver(Object obj, Object obj2) {
        String obj3;
        if (obj instanceof SelectInstance) {
            return ((SelectImplementation) ((SelectInstance) obj)).trySelect(this, obj2);
        }
        boolean z = obj instanceof ReceiveCatching;
        Function1 function1 = this.onUndeliveredElement;
        if (z) {
            return BufferedChannelKt.tryResume0(((ReceiveCatching) obj).cont, new ChannelResult(obj2), function1 != null ? new StateFlowKt$combineState$2(this, 10) : null);
        }
        if (!(obj instanceof BufferedChannelIterator)) {
            if (obj instanceof CancellableContinuation) {
                return BufferedChannelKt.tryResume0((CancellableContinuation) obj, obj2, function1 != null ? new StateFlowKt$combineState$2(this, 9) : null);
            }
            obj3 = ("Unexpected receiver type: " + obj).toString();
            a$$ExternalSyntheticBUOutline0.m$1(obj3);
            return false;
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) obj;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.continuation;
        cancellableContinuationImpl.getClass();
        bufferedChannelIterator.continuation = null;
        bufferedChannelIterator.receiveResult = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = BufferedChannel.this.onUndeliveredElement;
        return BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, function12 != null ? new UiScopeKt$$ExternalSyntheticLambda0(3, function12, obj2) : null);
    }

    public final boolean tryResumeSender(Object obj, ChannelSegment channelSegment, int i) {
        String obj2;
        TrySelectDetailedResult trySelectDetailedResult;
        if (obj instanceof CancellableContinuation) {
            return BufferedChannelKt.tryResume0((CancellableContinuation) obj, Unit.INSTANCE, null);
        }
        if (!(obj instanceof SelectInstance)) {
            obj2 = ("Unexpected waiter: " + obj).toString();
            a$$ExternalSyntheticBUOutline0.m$1(obj2);
            return false;
        }
        int trySelectInternal = ((SelectImplementation) obj).trySelectInternal(this, Unit.INSTANCE);
        if (trySelectInternal == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.SUCCESSFUL;
        } else if (trySelectInternal == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.REREGISTER;
        } else if (trySelectInternal == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.CANCELLED;
        } else {
            if (trySelectInternal != 3) {
                Path$$ExternalSyntheticBUOutline0.m$1(trySelectInternal, "Unexpected internal result: ");
                return false;
            }
            trySelectDetailedResult = TrySelectDetailedResult.ALREADY_SELECTED;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.REREGISTER) {
            channelSegment.setElementLazy(i, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.SUCCESSFUL;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo1159trySendJP2dKIU(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        boolean z = false;
        long j = 1152921504606846975L;
        boolean z2 = isClosed(atomicLongFieldUpdater.get(this), false) ? false : !bufferOrRendezvousSend(r1 & 1152921504606846975L);
        ChannelResult.Failed failed = ChannelResult.failed;
        if (z2) {
            return failed;
        }
        Object obj2 = BufferedChannelKt.INTERRUPTED_SEND;
        sendSegment$volatile$FU.getClass();
        ChannelSegment channelSegment = (ChannelSegment) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, sendSegment$volatile$FU$offset);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean isClosed = isClosed(andIncrement, z);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (channelSegment.id != j4) {
                ChannelSegment findSegmentSend = findSegmentSend(j4, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else {
                    if (isClosed) {
                        return new ChannelResult.Closed(getSendException());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int access$updateCellSend = access$updateCellSend(this, channelSegment, i2, obj, j2, obj2, isClosed);
            if (access$updateCellSend == 0) {
                channelSegment.cleanPrev();
                return Unit.INSTANCE;
            }
            if (access$updateCellSend == 1) {
                return Unit.INSTANCE;
            }
            if (access$updateCellSend == 2) {
                if (isClosed) {
                    channelSegment.onSlotCleaned();
                    return new ChannelResult.Closed(getSendException());
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    waiter.invokeOnCancellation(channelSegment, i2 + i);
                }
                channelSegment.onSlotCleaned();
                return failed;
            }
            if (access$updateCellSend == 3) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected");
                return null;
            }
            if (access$updateCellSend == 4) {
                if (j2 < receivers$volatile$FU.get(this)) {
                    channelSegment.cleanPrev();
                }
                return new ChannelResult.Closed(getSendException());
            }
            if (access$updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    public final Object updateCellReceive(ChannelSegment channelSegment, int i, long j, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        AtomicReferenceArray atomicReferenceArray = channelSegment.data;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            Object obj2 = atomicReferenceArray.get(i * 2);
            channelSegment.setElementLazy(i, null);
            return obj2;
        }
        while (true) {
            Object state$kotlinx_coroutines_core2 = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core2 == null || state$kotlinx_coroutines_core2 == BufferedChannelKt.IN_BUFFER) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core2 != BufferedChannelKt.BUFFERED) {
                    Symbol symbol = BufferedChannelKt.INTERRUPTED_SEND;
                    if (state$kotlinx_coroutines_core2 != symbol && state$kotlinx_coroutines_core2 != BufferedChannelKt.POISONED) {
                        if (state$kotlinx_coroutines_core2 == BufferedChannelKt.CHANNEL_CLOSED) {
                            expandBuffer();
                            return BufferedChannelKt.FAILED;
                        }
                        if (state$kotlinx_coroutines_core2 != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z = state$kotlinx_coroutines_core2 instanceof WaiterEB;
                            if (z) {
                                state$kotlinx_coroutines_core2 = ((WaiterEB) state$kotlinx_coroutines_core2).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core2, channelSegment, i)) {
                                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                channelSegment.setElementLazy(i, null);
                                return obj3;
                            }
                            channelSegment.setState$kotlinx_coroutines_core(i, symbol);
                            channelSegment.onSlotCleaned();
                            if (z) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    }
                    return BufferedChannelKt.FAILED;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core2, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    channelSegment.setElementLazy(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int updateCellSendSlow(ChannelSegment channelSegment, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j) || z) {
                    if (z) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            channelSegment.onSlotCleaned();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    break;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    Symbol symbol = BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core == symbol) {
                        channelSegment.setElementLazy(i, null);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        channelSegment.setElementLazy(i, null);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.CHANNEL_CLOSED) {
                        channelSegment.setElementLazy(i, null);
                        isClosedForSend();
                        return 4;
                    }
                    channelSegment.setElementLazy(i, null);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, obj)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                        return 0;
                    }
                    if (channelSegment.data.getAndSet((i * 2) + 1, symbol) != symbol) {
                        channelSegment.onCancelledRequest(i, true);
                    }
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        BufferedChannel bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = bufferEnd$volatile$FU;
            if (atomicLongFieldUpdater.get(bufferedChannel) > j) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        int i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(bufferedChannel);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(bufferedChannel)) && j2 == atomicLongFieldUpdater.get(bufferedChannel)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bufferedChannel = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(bufferedChannel);
                    long j5 = atomicLongFieldUpdater2.get(bufferedChannel);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(bufferedChannel)) {
                        break;
                    }
                    if (z) {
                        bufferedChannel = this;
                    } else {
                        bufferedChannel = this;
                        atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        bufferedChannel = this;
                    }
                }
            }
        }
    }
}
