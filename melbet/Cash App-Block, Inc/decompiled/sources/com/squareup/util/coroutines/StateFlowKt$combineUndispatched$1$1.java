package com.squareup.util.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StateFlowKt$combineUndispatched$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FlowCollector $$this$flow;
    public final /* synthetic */ StateFlow $flow1;
    public final /* synthetic */ StateFlow $flow2;
    public final /* synthetic */ StateFlowKt$combineState$2 $transform;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Object[] L$2;
    public Channel L$3;
    public byte[] L$5;
    public FlowCollector L$7;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowKt$combineUndispatched$1$1(StateFlow stateFlow, StateFlow stateFlow2, FlowCollector flowCollector, StateFlowKt$combineState$2 stateFlowKt$combineState$2, Continuation continuation) {
        super(2, continuation);
        this.$flow1 = stateFlow;
        this.$flow2 = stateFlow2;
        this.$$this$flow = flowCollector;
        this.$transform = stateFlowKt$combineState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StateFlowKt$combineUndispatched$1$1 stateFlowKt$combineUndispatched$1$1 = new StateFlowKt$combineUndispatched$1$1(this.$flow1, this.$flow2, this.$$this$flow, this.$transform, continuation);
        stateFlowKt$combineUndispatched$1$1.L$0 = obj;
        return stateFlowKt$combineUndispatched$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StateFlowKt$combineUndispatched$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b4, code lost:
    
        if (r14 != r2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0129  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0129 -> B:7:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0131 -> B:8:0x009e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        int i;
        int i2;
        Object[] objArr;
        Channel channel;
        int i3;
        boolean z;
        Object[] objArr2;
        Channel channel2;
        byte[] bArr2;
        FlowCollector flowCollector;
        Object obj2;
        Object obj3;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        UninitializedResult uninitializedResult = UninitializedResult.INSTANCE;
        boolean z2 = false;
        int i5 = 2;
        if (i4 == 0) {
            SafeTrace.throwOnFailure(obj);
            StateFlow[] stateFlowArr = {this.$flow1, this.$flow2};
            Object[] objArr3 = new Object[2];
            ArraysKt___ArraysJvmKt.fill(objArr3, 0, 2, uninitializedResult);
            BufferedChannel Channel$default = PapaEvent.Channel$default(2, null, null, 6);
            AtomicInteger atomicInteger = new AtomicInteger(2);
            int i6 = 0;
            while (i6 < 2) {
                int i7 = i6;
                JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new GovernmentIdFeed$analyze$5(stateFlowArr, i7, atomicInteger, Channel$default, (Continuation) null, 12), 1);
                i6 = i7 + 1;
            }
            bArr = new byte[2];
            i = 0;
            i2 = 2;
            objArr = objArr3;
            channel = Channel$default;
            i3 = 2;
            i = (byte) (i + 1);
            this.L$0 = null;
            this.L$2 = objArr;
            this.L$3 = channel;
            this.L$5 = bArr;
            this.I$0 = i3;
            this.I$1 = i2;
            this.I$2 = i;
            this.label = 1;
            obj3 = channel.mo4187receiveCatchingJP2dKIU(this);
        } else if (i4 == 1) {
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            bArr = this.L$5;
            channel = this.L$3;
            objArr = this.L$2;
            SafeTrace.throwOnFailure(obj);
            obj3 = ((ChannelResult) obj).holder;
            IndexedValue indexedValue = (IndexedValue) ChannelResult.m4191getOrNullimpl(obj3);
            if (indexedValue == null) {
                return Unit.INSTANCE;
            }
            while (true) {
                int i8 = indexedValue.index;
                z = z2;
                Object obj4 = objArr[i8];
                objArr[i8] = indexedValue.value;
                if (obj4 == uninitializedResult) {
                    i2--;
                }
                if (bArr[i8] == i) {
                    break;
                }
                bArr[i8] = (byte) i;
                indexedValue = (IndexedValue) ChannelResult.m4191getOrNullimpl(channel.mo4189tryReceivePtdJZtk());
                if (indexedValue == null) {
                    break;
                }
                z2 = z ? 1 : 0;
            }
            if (i2 == 0) {
                Object obj5 = objArr[z ? 1 : 0];
                Object obj6 = objArr[1];
                this.L$0 = null;
                this.L$2 = objArr;
                this.L$3 = channel;
                this.L$5 = bArr;
                FlowCollector flowCollector2 = this.$$this$flow;
                this.L$7 = flowCollector2;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = i5;
                obj2 = this.$transform.invoke(obj5, obj6, this);
                if (obj2 != coroutineSingletons) {
                    objArr2 = objArr;
                    channel2 = channel;
                    bArr2 = bArr;
                    flowCollector = flowCollector2;
                    this.L$0 = null;
                    this.L$2 = objArr2;
                    this.L$3 = channel2;
                    this.L$5 = bArr2;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 3;
                    if (flowCollector.emit(obj2, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            z2 = z ? 1 : 0;
            i = (byte) (i + 1);
            this.L$0 = null;
            this.L$2 = objArr;
            this.L$3 = channel;
            this.L$5 = bArr;
            this.I$0 = i3;
            this.I$1 = i2;
            this.I$2 = i;
            this.label = 1;
            obj3 = channel.mo4187receiveCatchingJP2dKIU(this);
        } else {
            if (i4 == 2) {
                i = this.I$2;
                i2 = this.I$1;
                i3 = this.I$0;
                flowCollector = this.L$7;
                bArr2 = this.L$5;
                channel2 = this.L$3;
                objArr2 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                z = false;
                obj2 = obj;
                this.L$0 = null;
                this.L$2 = objArr2;
                this.L$3 = channel2;
                this.L$5 = bArr2;
                this.L$7 = null;
                this.I$0 = i3;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = 3;
                if (flowCollector.emit(obj2, this) != coroutineSingletons) {
                    bArr = bArr2;
                    channel = channel2;
                    objArr = objArr2;
                    z2 = z;
                    i5 = 2;
                    i = (byte) (i + 1);
                    this.L$0 = null;
                    this.L$2 = objArr;
                    this.L$3 = channel;
                    this.L$5 = bArr;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 1;
                    obj3 = channel.mo4187receiveCatchingJP2dKIU(this);
                }
                return coroutineSingletons;
            }
            if (i4 != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            i2 = this.I$1;
            i3 = this.I$0;
            bArr = this.L$5;
            channel = this.L$3;
            objArr = this.L$2;
            SafeTrace.throwOnFailure(obj);
            z = false;
            z2 = z;
            i5 = 2;
            i = (byte) (i + 1);
            this.L$0 = null;
            this.L$2 = objArr;
            this.L$3 = channel;
            this.L$5 = bArr;
            this.I$0 = i3;
            this.I$1 = i2;
            this.I$2 = i;
            this.label = 1;
            obj3 = channel.mo4187receiveCatchingJP2dKIU(this);
        }
    }
}
