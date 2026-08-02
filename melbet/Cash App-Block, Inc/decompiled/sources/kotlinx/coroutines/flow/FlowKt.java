package kotlinx.coroutines.flow;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.util.cache.Cache;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.compose.StateFlowKt$receiveValueAsState$1$1$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexingIterable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NopCollector;
import kotlinx.coroutines.internal.Symbol;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class FlowKt {
    public static final Symbol NONE;
    public static final Symbol NO_VALUE;
    public static final Symbol PENDING;
    public static final SaversKt$$ExternalSyntheticLambda2 defaultKeySelector = new SaversKt$$ExternalSyntheticLambda2(11);
    public static final SaversKt$$ExternalSyntheticLambda5 defaultAreEquivalent = new SaversKt$$ExternalSyntheticLambda5(14);

    static {
        int i = 0;
        NO_VALUE = new Symbol("NO_VALUE", i);
        NONE = new Symbol("NONE", i);
        PENDING = new Symbol("PENDING", i);
    }

    public static final SharedFlowImpl MutableSharedFlow(int i, int i2, BufferOverflow bufferOverflow) {
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            Path$$ExternalSyntheticBUOutline0.m$3(bufferOverflow, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new SharedFlowImpl(i, i3, bufferOverflow);
    }

    public static /* synthetic */ SharedFlowImpl MutableSharedFlow$default(int i, int i2, BufferOverflow bufferOverflow, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return MutableSharedFlow(i, i2, bufferOverflow);
    }

    public static final StateFlowImpl MutableStateFlow(Object obj) {
        if (obj == null) {
            obj = CombineKt.NULL;
        }
        return new StateFlowImpl(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$emitAbort$FlowKt__LimitKt(FlowCollector flowCollector, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        int i;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i2 = flowKt__LimitKt$emitAbort$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = flowKt__LimitKt$emitAbort$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$emitAbort$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    flowKt__LimitKt$emitAbort$1.L$2 = obj2;
                    flowKt__LimitKt$emitAbort$1.label = 1;
                    if (flowCollector.emit(obj, flowKt__LimitKt$emitAbort$1) == obj4) {
                        return;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    obj2 = flowKt__LimitKt$emitAbort$1.L$2;
                    SafeTrace.throwOnFailure(obj3);
                }
                throw new AbortFlowException(obj2);
            }
        }
        flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
        Object obj32 = flowKt__LimitKt$emitAbort$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$emitAbort$1.label;
        if (i != 0) {
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$invokeSafely$FlowKt__EmittersKt(ThrowingCollector throwingCollector, Function3 function3, Throwable th, ContinuationImpl continuationImpl) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        int i;
        try {
            if (continuationImpl instanceof FlowKt__EmittersKt$invokeSafely$1) {
                flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuationImpl;
                int i2 = flowKt__EmittersKt$invokeSafely$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    flowKt__EmittersKt$invokeSafely$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = flowKt__EmittersKt$invokeSafely$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__EmittersKt$invokeSafely$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowKt__EmittersKt$invokeSafely$1.L$2 = th;
                        flowKt__EmittersKt$invokeSafely$1.label = 1;
                        if (function3.invoke(throwingCollector, th, flowKt__EmittersKt$invokeSafely$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = flowKt__EmittersKt$invokeSafely$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th2, th);
            }
            throw th2;
        }
        flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
        Object obj3 = flowKt__EmittersKt$invokeSafely$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__EmittersKt$invokeSafely$1.label;
    }

    public static final void access$setBufferAt(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final ReadonlySharedFlow asSharedFlow(MutableSharedFlow mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final ReadonlyStateFlow asStateFlow(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    public static Flow buffer$default(Flow flow, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i3 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return flow instanceof FusibleFlow ? FusibleFlow.fuse$default((FusibleFlow) flow, null, i3, bufferOverflow2, 1) : new ChannelFlowOperatorImpl(i3, 2, null, bufferOverflow2, flow);
    }

    public static final CallbackFlowBuilder callbackFlow(Function2 function2) {
        return new CallbackFlowBuilder(function2, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable catchImpl(Flow flow, FlowCollector flowCollector, ContinuationImpl continuationImpl) {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        Job job;
        CancellationException cancellationException;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i2 = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flowKt__ErrorsKt$catchImpl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ErrorsKt$catchImpl$1.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    try {
                        FlowCollector cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(28, flowCollector, m);
                        flowKt__ErrorsKt$catchImpl$1.L$2 = m;
                        flowKt__ErrorsKt$catchImpl$1.label = 1;
                        if (flow.collect(cashCdpConfigProvider$1$2, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef = m;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = flowKt__ErrorsKt$catchImpl$1.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) ref$ObjectRef.element;
                if ((th == null && th.equals(th)) || ((job = (Job) flowKt__ErrorsKt$catchImpl$1.getContext().get(Job.Key.$$INSTANCE)) != null && job.isCancelled() && (cancellationException = job.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th, th);
                    throw th;
                }
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th);
                throw th;
            }
        }
        flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        Object obj2 = flowKt__ErrorsKt$catchImpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ErrorsKt$catchImpl$1.label;
        if (i != 0) {
        }
        th = (Throwable) ref$ObjectRef.element;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    public static final ChannelFlowBuilder channelFlow(Function2 function2) {
        return new ChannelFlowBuilder(function2, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND, 0);
    }

    public static final Object collect(Flow flow, Continuation continuation) {
        Object collect = flow.collect(NopCollector.INSTANCE, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public static final Object collectLatest(Flow flow, Function2 function2, Continuation continuation) {
        Object collect = collect(buffer$default(mapLatest(function2, flow), 0, 2), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public static final FlowKt__MergeKt$flatMapMerge$$inlined$map$1 combine(Flow flow, Flow flow2, Flow flow3, Flow flow4, Function5 function5) {
        return new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(5, new Flow[]{flow, flow2, flow3, flow4}, function5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SharingConfig configureSharing$FlowKt__ShareKt(Flow flow, int i) {
        Channel.Factory.getClass();
        int i2 = Channel.Factory.CHANNEL_DEFAULT_CAPACITY;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (flow instanceof ChannelFlow) {
            ChannelFlow channelFlow = (ChannelFlow) flow;
            BufferOverflow bufferOverflow = channelFlow.onBufferOverflow;
            Flow dropChannelOperators = channelFlow.dropChannelOperators();
            if (dropChannelOperators != null) {
                int i4 = channelFlow.capacity;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (bufferOverflow != BufferOverflow.SUSPEND) {
                    if (i == 0) {
                        i3 = 1;
                    }
                    i3 = 0;
                }
                return new SharingConfig(i3, channelFlow.context, bufferOverflow, dropChannelOperators);
            }
        }
        return new SharingConfig(i3, EmptyCoroutineContext.INSTANCE, BufferOverflow.SUSPEND, flow);
    }

    public static final ChannelAsFlow consumeAsFlow(ReceiveChannel receiveChannel) {
        return new ChannelAsFlow(receiveChannel, true);
    }

    public static final Flow debounce(Flow flow, long j) {
        if (j >= 0) {
            return j == 0 ? flow : new AppLockMonitor$special$$inlined$map$2(new FlowKt__DelayKt$debounceInternal$1(new FlowKt__DelayKt$$ExternalSyntheticLambda0(j, 0), flow, null), 20);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Debounce timeout should not be negative");
        return null;
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final Flow m4195debounceHG0u8IE(Flow flow, long j) {
        return debounce(flow, JobKt.m4183toDelayMillisLRDsOJo(j));
    }

    public static final AppLockMonitor$special$$inlined$map$2 debounceDuration(Flow flow, Function1 function1) {
        return new AppLockMonitor$special$$inlined$map$2(new FlowKt__DelayKt$debounceInternal$1(new ViewGroups$$ExternalSyntheticLambda0(22, function1), flow, null), 20);
    }

    public static final Flow distinctUntilChanged(Flow flow) {
        return flow instanceof StateFlow ? flow : distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
    }

    public static final DistinctFlowImpl distinctUntilChangedBy$FlowKt__DistinctKt(Flow flow, Function1 function1, Function2 function2) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.keySelector == function1 && distinctFlowImpl.areEquivalent == function2) {
                return distinctFlowImpl;
            }
        }
        return new DistinctFlowImpl(flow, function1, function2);
    }

    public static final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop(Flow flow, int i) {
        if (i >= 0) {
            return new FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(flow, i, 0);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final Object emitAll(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        ensureActive(flowCollector);
        Object collect = flow.collect(flowCollector, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0053, B:20:0x0068, B:22:0x0070, B:32:0x0045, B:34:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object emitAllImpl$FlowKt__ChannelsKt(FlowCollector flowCollector, ReceiveChannel receiveChannel, boolean z, Continuation continuation) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        int i;
        BufferedChannel.BufferedChannelIterator it;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        FlowCollector flowCollector2;
        Object hasNext;
        try {
            if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
                int i2 = flowKt__ChannelsKt$emitAllImpl$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__ChannelsKt$emitAllImpl$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        ensureActive(flowCollector);
                        it = receiveChannel.iterator();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext != coroutineSingletons) {
                        }
                    } else if (i == 1) {
                        z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        bufferedChannelIterator = flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        receiveChannel = flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        flowCollector2 = flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        bufferedChannelIterator = flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        receiveChannel = flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        flowCollector2 = flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        it = bufferedChannelIterator;
                        flowCollector = flowCollector2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        flowCollector2 = flowCollector;
                        bufferedChannelIterator = it;
                        obj = hasNext;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                receiveChannel.cancel(null);
                            }
                            return Unit.INSTANCE;
                        }
                        Object next = bufferedChannelIterator.next();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = flowCollector2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = bufferedChannelIterator;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ChannelsKt$emitAllImpl$1.label;
    }

    public static final void ensureActive(FlowCollector flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object first(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        Cache.AnonymousClass1.C00671 c00671;
        Object obj;
        Symbol symbol = CombineKt.NULL;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i2 = flowKt__ReduceKt$first$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__ReduceKt$first$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = flowKt__ReduceKt$first$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$first$1.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                    m.element = symbol;
                    Cache.AnonymousClass1.C00671 c006712 = new Cache.AnonymousClass1.C00671(m, 13);
                    try {
                        flowKt__ReduceKt$first$1.L$1 = m;
                        flowKt__ReduceKt$first$1.L$3 = c006712;
                        flowKt__ReduceKt$first$1.label = 1;
                        if (flow.collect(c006712, flowKt__ReduceKt$first$1) == obj3) {
                            return obj3;
                        }
                        ref$ObjectRef = m;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = m;
                        e = e2;
                        c00671 = c006712;
                        if (e.owner == c00671) {
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c00671 = flowKt__ReduceKt$first$1.L$3;
                    ref$ObjectRef = flowKt__ReduceKt$first$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.owner == c00671) {
                            throw e;
                        }
                        JobKt.ensureActive(flowKt__ReduceKt$first$1.getContext());
                        obj = ref$ObjectRef.element;
                        if (obj != symbol) {
                        }
                    }
                }
                obj = ref$ObjectRef.element;
                if (obj != symbol) {
                    return obj;
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Expected at least one element");
                return null;
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        Object obj22 = flowKt__ReduceKt$first$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$first$1.label;
        if (i != 0) {
        }
        obj = ref$ObjectRef.element;
        if (obj != symbol) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object firstOrNull(Flow flow, Function2 function2, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass2;
        if (continuationImpl instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuationImpl;
            int i2 = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flowKt__ReduceKt$firstOrNull$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$firstOrNull$3.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass22 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(13, function2, m);
                    try {
                        flowKt__ReduceKt$firstOrNull$3.L$2 = m;
                        flowKt__ReduceKt$firstOrNull$3.L$4 = anonymousClass22;
                        flowKt__ReduceKt$firstOrNull$3.label = 1;
                        if (flow.collect(anonymousClass22, flowKt__ReduceKt$firstOrNull$3) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = m;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = m;
                        e = e2;
                        anonymousClass2 = anonymousClass22;
                        if (e.owner == anonymousClass2) {
                            throw e;
                        }
                        JobKt.ensureActive(flowKt__ReduceKt$firstOrNull$3.getContext());
                        return ref$ObjectRef.element;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    anonymousClass2 = flowKt__ReduceKt$firstOrNull$3.L$4;
                    ref$ObjectRef = flowKt__ReduceKt$firstOrNull$3.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.owner == anonymousClass2) {
                        }
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuationImpl);
        Object obj3 = flowKt__ReduceKt$firstOrNull$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$firstOrNull$3.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }

    public static final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 flatMapConcat(Function2 function2, Flow flow) {
        int i = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
        return new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(flow, function2, 0), 23);
    }

    public static final Flow flowOn(Flow flow, CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.$$INSTANCE) == null) {
            return coroutineContext.equals(EmptyCoroutineContext.INSTANCE) ? flow : flow instanceof FusibleFlow ? FusibleFlow.fuse$default((FusibleFlow) flow, coroutineContext, 0, null, 6) : new ChannelFlowOperatorImpl(0, 12, coroutineContext, null, flow);
        }
        Path$$ExternalSyntheticBUOutline0.m$3(coroutineContext, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final Flow fuseSharedFlow(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? sharedFlow : new ChannelFlowOperatorImpl(i, coroutineContext, bufferOverflow, sharedFlow);
    }

    public static final StandaloneCoroutine launchIn(Flow flow, CoroutineScope coroutineScope) {
        return JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(flow, null, 13), 3);
    }

    public static final ChannelFlowTransformLatest mapLatest(Function2 function2, Flow flow) {
        int i = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
        return transformLatest(flow, new FlowKt__ZipKt$combine$1$1(function2, (Continuation) null, 3));
    }

    public static final ChannelFlowBuilder merge(Flow... flowArr) {
        int i = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
        return new ChannelFlowBuilder(flowArr.length == 0 ? EmptyList.INSTANCE : new IndexingIterable(flowArr, 1), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND, 1);
    }

    public static final ChannelAsFlow receiveAsFlow(ReceiveChannel receiveChannel) {
        return new ChannelAsFlow(receiveChannel, false);
    }

    public static final ReadonlySharedFlow shareIn(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i);
        SharedFlowImpl MutableSharedFlow = MutableSharedFlow(i, configureSharing$FlowKt__ShareKt.extraBufferCapacity, (BufferOverflow) configureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new ReadonlySharedFlow(MutableSharedFlow, JobKt.launch(coroutineScope, (CoroutineContext) configureSharing$FlowKt__ShareKt.context, Intrinsics.areEqual(sharingStarted, SharingStarted.Companion.Eagerly) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowQuery$asFlow$1(sharingStarted, (Flow) configureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, NO_VALUE, (Continuation) null)));
    }

    public static final ReadonlyStateFlow stateIn(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        SharingConfig configureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        StateFlowImpl MutableStateFlow = MutableStateFlow(obj);
        return new ReadonlyStateFlow(MutableStateFlow, JobKt.launch(coroutineScope, (CoroutineContext) configureSharing$FlowKt__ShareKt.context, Intrinsics.areEqual(sharingStarted, SharingStarted.Companion.Eagerly) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowQuery$asFlow$1(sharingStarted, (Flow) configureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, obj, (Continuation) null)));
    }

    public static final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take(Flow flow, int i) {
        if (i > 0) {
            return new FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(flow, i, 1);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested element count ", " should be positive"));
        return null;
    }

    public static final ChannelFlowTransformLatest transformLatest(Flow flow, Function3 function3) {
        int i = FlowKt__MergeKt.DEFAULT_CONCURRENCY;
        return new ChannelFlowTransformLatest(function3, flow, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    public static final FinishSetupTileBadgeCounter combine(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return new FinishSetupTileBadgeCounter(24, new Flow[]{flow, flow2, flow3}, function4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object firstOrNull(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        StateFlowKt$receiveValueAsState$1$1$1 stateFlowKt$receiveValueAsState$1$1$1;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i2 = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flowKt__ReduceKt$firstOrNull$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$firstOrNull$1.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    StateFlowKt$receiveValueAsState$1$1$1 stateFlowKt$receiveValueAsState$1$1$12 = new StateFlowKt$receiveValueAsState$1$1$1(2, m);
                    try {
                        flowKt__ReduceKt$firstOrNull$1.L$1 = m;
                        flowKt__ReduceKt$firstOrNull$1.L$3 = stateFlowKt$receiveValueAsState$1$1$12;
                        flowKt__ReduceKt$firstOrNull$1.label = 1;
                        if (flow.collect(stateFlowKt$receiveValueAsState$1$1$12, flowKt__ReduceKt$firstOrNull$1) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = m;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = m;
                        e = e2;
                        stateFlowKt$receiveValueAsState$1$1$1 = stateFlowKt$receiveValueAsState$1$1$12;
                        if (e.owner != stateFlowKt$receiveValueAsState$1$1$1) {
                            JobKt.ensureActive(flowKt__ReduceKt$firstOrNull$1.getContext());
                            return ref$ObjectRef.element;
                        }
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stateFlowKt$receiveValueAsState$1$1$1 = flowKt__ReduceKt$firstOrNull$1.L$3;
                    ref$ObjectRef = flowKt__ReduceKt$firstOrNull$1.L$1;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.owner != stateFlowKt$receiveValueAsState$1$1$1) {
                        }
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        Object obj3 = flowKt__ReduceKt$firstOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$firstOrNull$1.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object first(Flow flow, Function2 function2, Continuation continuation) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2;
        Object obj;
        Symbol symbol = CombineKt.NULL;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            int i2 = flowKt__ReduceKt$first$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flowKt__ReduceKt$first$3.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = flowKt__ReduceKt$first$3.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$first$3.label;
                if (i != 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj2);
                    m.element = symbol;
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$22 = new CashCdpConfigProvider$1$2(29, function2, m);
                    try {
                        flowKt__ReduceKt$first$3.L$2 = m;
                        flowKt__ReduceKt$first$3.L$4 = cashCdpConfigProvider$1$22;
                        flowKt__ReduceKt$first$3.label = 1;
                        if (flow.collect(cashCdpConfigProvider$1$22, flowKt__ReduceKt$first$3) == obj3) {
                            return obj3;
                        }
                        ref$ObjectRef = m;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = m;
                        e = e2;
                        cashCdpConfigProvider$1$2 = cashCdpConfigProvider$1$22;
                        if (e.owner != cashCdpConfigProvider$1$2) {
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cashCdpConfigProvider$1$2 = flowKt__ReduceKt$first$3.L$4;
                    ref$ObjectRef = flowKt__ReduceKt$first$3.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.owner != cashCdpConfigProvider$1$2) {
                            JobKt.ensureActive(flowKt__ReduceKt$first$3.getContext());
                            obj = ref$ObjectRef.element;
                            if (obj != symbol) {
                            }
                        } else {
                            throw e;
                        }
                    }
                }
                obj = ref$ObjectRef.element;
                if (obj != symbol) {
                    return obj;
                }
                OptionalProvider$$ExternalSyntheticLambda0.m("Expected at least one element matching the predicate");
                return null;
            }
        }
        flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        Object obj22 = flowKt__ReduceKt$first$3.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$first$3.label;
        if (i != 0) {
        }
        obj = ref$ObjectRef.element;
        if (obj != symbol) {
        }
    }
}
