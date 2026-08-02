package com.squareup.util.coroutines;

import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.Signal;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class StateFlowKt {
    public static final SetupTeardownKt$$ExternalSyntheticLambda0 noOpTeardown = new SetupTeardownKt$$ExternalSyntheticLambda0();
    public static final Object NO_VALUE = new Object();

    public static final void closeWith(Object obj, CoroutineScope coroutineScope, Function1 function1) {
        JobKt.launch$default(coroutineScope, null, CoroutineStart.ATOMIC, new FlowQuery$asFlow$1(function1, obj, null, 12), 1);
    }

    public static final FlowExtensionsKt$combine$$inlined$combine$1 combine(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Flow flow6, Flow flow7, Flow flow8, Flow flow9, Flow flow10, Flow flow11, Flow flow12, Flow flow13, Flow flow14, Function15 function15) {
        flow.getClass();
        flow3.getClass();
        flow4.getClass();
        flow6.getClass();
        flow7.getClass();
        flow8.getClass();
        function15.getClass();
        return new FlowExtensionsKt$combine$$inlined$combine$1(27, new Flow[]{flow, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11, flow12, flow13, flow14}, function15);
    }

    public static final DerivedStateFlow combineState(StateFlow stateFlow, StateFlow stateFlow2, Function2 function2) {
        stateFlow.getClass();
        stateFlow2.getClass();
        return new DerivedStateFlow(new StateFlowKt$$ExternalSyntheticLambda4(function2, stateFlow, stateFlow2, 0), new SafeFlow(new TakeUntil$collectSafely$2(stateFlow, stateFlow2, new StateFlowKt$combineState$2(function2), (Continuation) null, 25)));
    }

    public static final FlowExtensionsKt$doOnFirst$$inlined$map$1 doOnFirst(Flow flow, Function1 function1, Function1 function12) {
        flow.getClass();
        int i = 0;
        return new FlowExtensionsKt$doOnFirst$$inlined$map$1(FlowKt.drop(new FlowUtil$createFlow$$inlined$map$1(new Pair(Boolean.FALSE, null), flow, new FlowExtensionsKt$doOnFirst$2(function1, function12, null, i)), 1), i);
    }

    public static final Object doWhile(Flow flow, Function1 function1, Function2 function2, SuspendLambda suspendLambda) {
        Object collectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new StateFlowKt$mapState$$inlined$map$1(flow, function1, 2)), new FlowExtensionsKt$doWhile$3(function2, null, 0), suspendLambda);
        return collectLatest == CoroutineSingletons.COROUTINE_SUSPENDED ? collectLatest : Unit.INSTANCE;
    }

    public static final void emitOrThrow(MutableSharedFlow mutableSharedFlow, Object obj) {
        mutableSharedFlow.getClass();
        if (mutableSharedFlow.tryEmit(obj)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("emitOrThrow failed to emit element of type ", obj != null ? obj.getClass().getSimpleName() : null, ", would drop an element."));
    }

    public static final StandaloneCoroutine launchUndispatchedWithRethrow(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2) {
        coroutineScope.getClass();
        coroutineContext.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        StandaloneCoroutine launch = JobKt.launch(coroutineScope, coroutineContext, CoroutineStart.UNDISPATCHED, new FlowQuery$asFlow$1(function2, ref$BooleanRef, ref$ObjectRef, (Continuation) null, 13));
        ref$BooleanRef.element = false;
        Exception exc = (Exception) ref$ObjectRef.element;
        if (exc == null) {
            return launch;
        }
        throw exc;
    }

    public static final DerivedStateFlow mapState(StateFlow stateFlow, Function1 function1) {
        stateFlow.getClass();
        int i = 0;
        return new DerivedStateFlow((Function0) new StateFlowKt$$ExternalSyntheticLambda1(function1, stateFlow, i), (Flow) new StateFlowKt$mapState$$inlined$map$1(stateFlow, function1, i));
    }

    public static final Flow runUntil(Flow flow, Signal signal) {
        flow.getClass();
        signal.getClass();
        return signal.equals(Signal.Green.INSTANCE) ? flow : FlowKt.channelFlow(new CoroutinesKt$until$2(signal, flow, (Continuation) null, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (r14.invoke(r0, r7, r1) == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00df -> B:12:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object runWithRetries(int i, long j, Function1 function1, Function3 function3, ContinuationImpl continuationImpl) {
        RunWithRetriesKt$runWithRetries$1 runWithRetriesKt$runWithRetries$1;
        int i2;
        long j2;
        Function1 function12;
        Function3 function32;
        RunWithRetriesKt$runWithRetries$1 runWithRetriesKt$runWithRetries$12;
        int i3;
        int i4;
        Object obj;
        Function1 function13;
        Function3 function33;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        Function1 function14;
        Object th;
        if (continuationImpl instanceof RunWithRetriesKt$runWithRetries$1) {
            runWithRetriesKt$runWithRetries$1 = (RunWithRetriesKt$runWithRetries$1) continuationImpl;
            int i10 = runWithRetriesKt$runWithRetries$1.label;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                runWithRetriesKt$runWithRetries$1.label = i10 - PKIFailureInfo.systemUnavail;
                Object obj2 = runWithRetriesKt$runWithRetries$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = runWithRetriesKt$runWithRetries$1.label;
                int i11 = 0;
                Object obj3 = null;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    j2 = j;
                    function12 = function1;
                    function32 = function3;
                    runWithRetriesKt$runWithRetries$12 = runWithRetriesKt$runWithRetries$1;
                    i3 = 0;
                    i4 = i;
                    if (i3 >= i4) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i8 = runWithRetriesKt$runWithRetries$1.I$3;
                            i7 = runWithRetriesKt$runWithRetries$1.I$2;
                            i6 = runWithRetriesKt$runWithRetries$1.I$1;
                            j3 = runWithRetriesKt$runWithRetries$1.J$0;
                            i5 = runWithRetriesKt$runWithRetries$1.I$0;
                            function33 = runWithRetriesKt$runWithRetries$1.L$1;
                            function13 = runWithRetriesKt$runWithRetries$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            obj = null;
                            int i12 = i8;
                            i9 = i6;
                            runWithRetriesKt$runWithRetries$1.L$0 = function13;
                            runWithRetriesKt$runWithRetries$1.L$1 = function33;
                            runWithRetriesKt$runWithRetries$1.I$0 = i5;
                            runWithRetriesKt$runWithRetries$1.J$0 = j3;
                            runWithRetriesKt$runWithRetries$1.I$1 = i9;
                            runWithRetriesKt$runWithRetries$1.I$2 = i7;
                            runWithRetriesKt$runWithRetries$1.I$3 = i12;
                            runWithRetriesKt$runWithRetries$1.label = 3;
                            if (JobKt.delay(j3, runWithRetriesKt$runWithRetries$1) != coroutineSingletons) {
                                j2 = j3;
                                function32 = function33;
                                runWithRetriesKt$runWithRetries$12 = runWithRetriesKt$runWithRetries$1;
                                i4 = i5;
                                function14 = function13;
                                int i13 = i9 + 1;
                                function12 = function14;
                                obj3 = obj;
                                i11 = 0;
                                i3 = i13;
                                if (i3 >= i4) {
                                }
                            }
                        }
                        if (i2 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i9 = runWithRetriesKt$runWithRetries$1.I$1;
                        j2 = runWithRetriesKt$runWithRetries$1.J$0;
                        int i14 = runWithRetriesKt$runWithRetries$1.I$0;
                        Function3 function34 = runWithRetriesKt$runWithRetries$1.L$1;
                        function14 = runWithRetriesKt$runWithRetries$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        runWithRetriesKt$runWithRetries$12 = runWithRetriesKt$runWithRetries$1;
                        i4 = i14;
                        function32 = function34;
                        obj = null;
                        int i132 = i9 + 1;
                        function12 = function14;
                        obj3 = obj;
                        i11 = 0;
                        i3 = i132;
                        if (i3 >= i4) {
                            return obj3;
                        }
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            function13 = function12;
                            i8 = i11;
                            function33 = function32;
                            int i15 = i3;
                            i5 = i4;
                            runWithRetriesKt$runWithRetries$1 = runWithRetriesKt$runWithRetries$12;
                            j3 = j2;
                            i7 = i15;
                            i6 = i7;
                            obj = obj3;
                            Integer num = new Integer(i7 + 1);
                            runWithRetriesKt$runWithRetries$1.L$0 = function13;
                            runWithRetriesKt$runWithRetries$1.L$1 = function33;
                            runWithRetriesKt$runWithRetries$1.I$0 = i5;
                            runWithRetriesKt$runWithRetries$1.J$0 = j3;
                            runWithRetriesKt$runWithRetries$1.I$1 = i6;
                            runWithRetriesKt$runWithRetries$1.I$2 = i7;
                            runWithRetriesKt$runWithRetries$1.I$3 = i8;
                            runWithRetriesKt$runWithRetries$1.label = 2;
                        }
                        runWithRetriesKt$runWithRetries$12.L$0 = function12;
                        runWithRetriesKt$runWithRetries$12.L$1 = function32;
                        runWithRetriesKt$runWithRetries$12.I$0 = i4;
                        runWithRetriesKt$runWithRetries$12.J$0 = j2;
                        runWithRetriesKt$runWithRetries$12.I$1 = i3;
                        runWithRetriesKt$runWithRetries$12.I$2 = i3;
                        runWithRetriesKt$runWithRetries$12.I$3 = i11;
                        runWithRetriesKt$runWithRetries$12.label = 1;
                        Object invoke = function12.invoke(runWithRetriesKt$runWithRetries$12);
                        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
                    }
                    i8 = runWithRetriesKt$runWithRetries$1.I$3;
                    i7 = runWithRetriesKt$runWithRetries$1.I$2;
                    i6 = runWithRetriesKt$runWithRetries$1.I$1;
                    j3 = runWithRetriesKt$runWithRetries$1.J$0;
                    i5 = runWithRetriesKt$runWithRetries$1.I$0;
                    function33 = runWithRetriesKt$runWithRetries$1.L$1;
                    function13 = runWithRetriesKt$runWithRetries$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj2);
                        return obj2;
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj3;
                        Integer num2 = new Integer(i7 + 1);
                        runWithRetriesKt$runWithRetries$1.L$0 = function13;
                        runWithRetriesKt$runWithRetries$1.L$1 = function33;
                        runWithRetriesKt$runWithRetries$1.I$0 = i5;
                        runWithRetriesKt$runWithRetries$1.J$0 = j3;
                        runWithRetriesKt$runWithRetries$1.I$1 = i6;
                        runWithRetriesKt$runWithRetries$1.I$2 = i7;
                        runWithRetriesKt$runWithRetries$1.I$3 = i8;
                        runWithRetriesKt$runWithRetries$1.label = 2;
                    }
                }
            }
        }
        runWithRetriesKt$runWithRetries$1 = new RunWithRetriesKt$runWithRetries$1(continuationImpl);
        Object obj22 = runWithRetriesKt$runWithRetries$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = runWithRetriesKt$runWithRetries$1.label;
        int i112 = 0;
        Object obj32 = null;
        if (i2 != 0) {
        }
    }

    public static void sendOrThrow$default(Channel channel, Object obj) {
        channel.getClass();
        Object mo1159trySendJP2dKIU = channel.mo1159trySendJP2dKIU(obj);
        if (mo1159trySendJP2dKIU instanceof ChannelResult.Closed) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("sendOrThrow failed to send element of type ", obj != null ? obj.getClass().getSimpleName() : null, ", channel is closed."));
        } else if (mo1159trySendJP2dKIU instanceof ChannelResult.Failed) {
            Drop$$ExternalSyntheticBUOutline0.m("sendOrThrow failed to send element of type ", obj != null ? obj.getClass().getSimpleName() : null, ", result: ", new ChannelResult(mo1159trySendJP2dKIU));
        }
    }

    public static final Teardown setup(SetupTeardown setupTeardown, CoroutineScope coroutineScope, Object obj) {
        setupTeardown.getClass();
        coroutineScope.getClass();
        return setupTeardown.setup(coroutineScope, obj);
    }

    public static final StateFlow stateInScoped(StateFlow stateFlow, CoroutineScope coroutineScope, Function2 function2) {
        stateFlow.getClass();
        coroutineScope.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new CoroutinesKt$until$2(stateFlow, function2, ref$ObjectRef, null, 12), 1);
        Object obj = ref$ObjectRef.element;
        if (obj != null) {
            return (StateFlow) obj;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unable to synchronously produce output state");
        return null;
    }

    public static final Object until(Function1 function1, Function1 function12, Continuation continuation) {
        return JobKt.coroutineScope(new CoroutinesKt$until$2(function1, function12, (Continuation) null, 0), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: withTimeoutOrThrow-rnQQ1Ag, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m3995withTimeoutOrThrowrnQQ1Ag(long j, Function0 function0, Function2 function2, ContinuationImpl continuationImpl) {
        CoroutinesKt$withTimeoutOrThrow$1 coroutinesKt$withTimeoutOrThrow$1;
        int i;
        List list;
        if (continuationImpl instanceof CoroutinesKt$withTimeoutOrThrow$1) {
            coroutinesKt$withTimeoutOrThrow$1 = (CoroutinesKt$withTimeoutOrThrow$1) continuationImpl;
            int i2 = coroutinesKt$withTimeoutOrThrow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                coroutinesKt$withTimeoutOrThrow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = coroutinesKt$withTimeoutOrThrow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coroutinesKt$withTimeoutOrThrow$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(j);
                    SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(function2, continuation, 2);
                    coroutinesKt$withTimeoutOrThrow$1.L$0 = function0;
                    coroutinesKt$withTimeoutOrThrow$1.label = 1;
                    obj = JobKt.withTimeoutOrNull(m4167getInWholeMillisecondsimpl, simpleChannelFlowKt$simpleChannelFlow$1, coroutinesKt$withTimeoutOrThrow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function0 = coroutinesKt$withTimeoutOrThrow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                if (list.isEmpty()) {
                    return list.get(0);
                }
                a$$ExternalSyntheticBUOutline0.m$1((String) function0.invoke());
                return null;
            }
        }
        coroutinesKt$withTimeoutOrThrow$1 = new CoroutinesKt$withTimeoutOrThrow$1(continuationImpl);
        Object obj2 = coroutinesKt$withTimeoutOrThrow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutinesKt$withTimeoutOrThrow$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list == null) {
        }
        if (list.isEmpty()) {
        }
    }

    public static final DerivedStateFlow combineState(StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, Function3 function3) {
        stateFlow2.getClass();
        stateFlow3.getClass();
        return new DerivedStateFlow(new StateFlowKt$$ExternalSyntheticLambda2(function3, stateFlow, stateFlow2, stateFlow3, 0), FlowKt.combine(stateFlow, stateFlow2, stateFlow3, new StateFlowKt$combineState$4(function3)));
    }
}
