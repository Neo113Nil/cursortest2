package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.squareup.cash.wallet.views.CardRegistry;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class RevolvingInteractiveCardsKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardRegistry.SharedCardTransitionState f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ RevolvingInteractiveCardsKt$$ExternalSyntheticLambda2(CardRegistry.SharedCardTransitionState sharedCardTransitionState, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedCardTransitionState;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CardRegistry.SharedCardTransitionState sharedCardTransitionState;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState2;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState3;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState4 = this.f$0;
        switch (i) {
            case 0:
                State state = (State) mutableState.getValue();
                return (state == null || (sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) state.getValue()) == null) ? sharedCardTransitionState4 : sharedCardTransitionState;
            case 1:
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                State state2 = (State) mutableState.getValue();
                return (state2 == null || (sharedCardTransitionState2 = (CardRegistry.SharedCardTransitionState) state2.getValue()) == null) ? sharedCardTransitionState4 : sharedCardTransitionState2;
            default:
                State state3 = (State) mutableState.getValue();
                return (state3 == null || (sharedCardTransitionState3 = (CardRegistry.SharedCardTransitionState) state3.getValue()) == null) ? sharedCardTransitionState4 : sharedCardTransitionState3;
        }
    }
}
