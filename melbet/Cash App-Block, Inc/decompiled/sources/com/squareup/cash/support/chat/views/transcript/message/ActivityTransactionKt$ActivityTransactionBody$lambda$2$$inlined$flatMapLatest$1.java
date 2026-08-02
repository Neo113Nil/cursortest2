package com.squareup.cash.support.chat.views.transcript.message;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ SupportActivityItemLoader $activityItemLoader$inlined;
    public final /* synthetic */ BodyViewModel$ActivityBodyViewModel $model$inlined;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1(Continuation continuation, SupportActivityItemLoader supportActivityItemLoader, BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$activityItemLoader$inlined = supportActivityItemLoader;
        this.$model$inlined = bodyViewModel$ActivityBodyViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel = this.$model$inlined;
        SupportActivityItemLoader supportActivityItemLoader = this.$activityItemLoader$inlined;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1 activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1 = new ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1(continuation, supportActivityItemLoader, bodyViewModel$ActivityBodyViewModel, 0);
                activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1.L$0 = flowCollector;
                activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1.L$1 = obj2;
                return activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1 activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$12 = new ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1(continuation, supportActivityItemLoader, bodyViewModel$ActivityBodyViewModel, 1);
                activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$12.L$0 = flowCollector;
                activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$12.L$1 = obj2;
                return activityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel = this.$model$inlined;
        SupportActivityItemLoader supportActivityItemLoader = this.$activityItemLoader$inlined;
        switch (i) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Object obj2 = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow loadItem = supportActivityItemLoader.loadItem(bodyViewModel$ActivityBodyViewModel.entityId);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector, loadItem, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector2 = this.L$0;
                Object obj3 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow loadItem2 = supportActivityItemLoader.loadItem(bodyViewModel$ActivityBodyViewModel.entityId);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector2, loadItem2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
