package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Function0 $backwardResting$inlined;
    public final /* synthetic */ Function0 $cardRotation$inlined;
    public final /* synthetic */ float $flingScale$inlined;
    public final /* synthetic */ Function0 $forwardResting$inlined;
    public final /* synthetic */ Ref$LongRef $lastVelocity$inlined;
    public final /* synthetic */ Function0 $onCardSettled$inlined;
    public final /* synthetic */ SpringSpec $springSpec$inlined;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1(Continuation continuation, Ref$LongRef ref$LongRef, Function0 function0, Function0 function02, Function0 function03, SpringSpec springSpec, float f, Function0 function04) {
        super(3, continuation);
        this.$lastVelocity$inlined = ref$LongRef;
        this.$cardRotation$inlined = function0;
        this.$forwardResting$inlined = function02;
        this.$backwardResting$inlined = function03;
        this.$springSpec$inlined = springSpec;
        this.$flingScale$inlined = f;
        this.$onCardSettled$inlined = function04;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1 hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1 = new Hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.$lastVelocity$inlined, this.$cardRotation$inlined, this.$forwardResting$inlined, this.$backwardResting$inlined, this.$springSpec$inlined, this.$flingScale$inlined, this.$onCardSettled$inlined);
        hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return hero3DCardViewKt$cardSettleFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__MergeKt$flatMapMerge$$inlined$map$1;
        FlowCollector flowCollector = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Offset offset = (Offset) obj2;
            Ref$LongRef ref$LongRef = this.$lastVelocity$inlined;
            if (offset != null) {
                ref$LongRef.element = offset.packedValue;
                flowKt__MergeKt$flatMapMerge$$inlined$map$1 = EmptyFlow.INSTANCE;
            } else {
                flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(4, Hero3DCardViewKt.m3791flingCardToClosestSideF0iM_J4((Quat) this.$cardRotation$inlined.invoke(), (Quat) this.$forwardResting$inlined.invoke(), (Quat) this.$backwardResting$inlined.invoke(), ref$LongRef.element, this.$springSpec$inlined, this.$flingScale$inlined), new MulticastedPagingData$asPagingData$2(this.$onCardSettled$inlined, continuation, 8));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowKt__MergeKt$flatMapMerge$$inlined$map$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
