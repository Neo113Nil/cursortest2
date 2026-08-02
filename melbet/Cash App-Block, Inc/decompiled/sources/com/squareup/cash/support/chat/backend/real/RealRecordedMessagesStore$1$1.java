package com.squareup.cash.support.chat.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.ThrottleLatestKt$throttleLatest$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealRecordedMessagesStore$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealRecordedMessagesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealRecordedMessagesStore$1$1(RealRecordedMessagesStore realRecordedMessagesStore, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realRecordedMessagesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealRecordedMessagesStore realRecordedMessagesStore = this.this$0;
        switch (i) {
            case 0:
                return new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, continuation, 0);
            case 1:
                return new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, continuation, 1);
            case 2:
                return new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, continuation, 2);
            default:
                return new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealRecordedMessagesStore$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealRecordedMessagesStore$1$1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealRecordedMessagesStore$1$1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealRecordedMessagesStore$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealRecordedMessagesStore realRecordedMessagesStore = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowBuilder channelFlow = FlowKt.channelFlow(new ThrottleLatestKt$throttleLatest$1(FlowKt.consumeAsFlow(realRecordedMessagesStore.newMessagesRequests), 1000L, null));
                    RealRecordedMessagesStore$1$1 realRecordedMessagesStore$1$1 = new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(channelFlow, realRecordedMessagesStore$1$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealRecordedMessagesStore.access$loadNewMessagesNow(realRecordedMessagesStore, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealRecordedMessagesStore.access$loadOldMessagesNow(realRecordedMessagesStore, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow(realRecordedMessagesStore.oldMessagesRequests);
                    RealRecordedMessagesStore$1$1 realRecordedMessagesStore$1$12 = new RealRecordedMessagesStore$1$1(realRecordedMessagesStore, continuation, 2);
                    this.label = 1;
                    if (FlowKt.collectLatest(consumeAsFlow, realRecordedMessagesStore$1$12, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
