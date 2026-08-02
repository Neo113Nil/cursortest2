package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.graphics.backend.math.Quat;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class Hero3DCardViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardWobbleState f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda6(CardWobbleState cardWobbleState, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = cardWobbleState;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        CardWobbleState cardWobbleState = this.f$0;
        switch (i) {
            case 0:
                return ((Quat) mutableState.getValue()).times(cardWobbleState.wobbleRotation());
            case 1:
                return ((Quat) mutableState.getValue()).times(cardWobbleState.wobbleRotation());
            case 2:
                return Float.valueOf(((Number) ((InteractiveCardState) mutableState.getValue()).zTranslation.getValue()).floatValue() + cardWobbleState.wobbleTranslation().vector[2]);
            case 3:
                return Float.valueOf(((Number) ((InteractiveCardState) mutableState.getValue()).zTranslation.getValue()).floatValue() + cardWobbleState.wobbleTranslation().vector[2]);
            default:
                return ((Quat) mutableState.getValue()).times(cardWobbleState.wobbleRotation());
        }
    }
}
