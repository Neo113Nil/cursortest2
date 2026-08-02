package com.squareup.cash.wallet.views;

import androidx.compose.runtime.State;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $cardEnabled$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State $showContouredText$delegate;
    public final /* synthetic */ InteractiveCardState $this_with;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4(InteractiveCardState interactiveCardState, State state, State state2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_with = interactiveCardState;
        this.$cardEnabled$delegate = state;
        this.$showContouredText$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4(this.$this_with, this.$cardEnabled$delegate, this.$showContouredText$delegate, continuation, 0);
            default:
                return new Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4(this.$this_with, this.$cardEnabled$delegate, this.$showContouredText$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$5$2$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        int i = this.$r8$classId;
        State state = this.$showContouredText$delegate;
        State state2 = this.$cardEnabled$delegate;
        InteractiveCardState interactiveCardState = this.$this_with;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    booleanValue = ((Boolean) state2.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) state.getValue()).booleanValue();
                    this.label = 1;
                    if (InteractiveCardState.animateCardTranslation$default(interactiveCardState, false, booleanValue, booleanValue2, this) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean InteractiveCardEffect$lambda$20 = CoreInteractiveCardKt.InteractiveCardEffect$lambda$20(state2);
                    boolean booleanValue3 = ((Boolean) state.getValue()).booleanValue();
                    this.label = 1;
                    if (InteractiveCardState.animateCardTranslation$default(interactiveCardState, false, InteractiveCardEffect$lambda$20, booleanValue3, this) == coroutineSingletons2) {
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
