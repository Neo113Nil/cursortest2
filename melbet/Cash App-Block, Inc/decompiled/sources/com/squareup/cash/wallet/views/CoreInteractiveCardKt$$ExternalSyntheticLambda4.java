package com.squareup.cash.wallet.views;

import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.views.CardRegistry;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class CoreInteractiveCardKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardRegistry.SharedCardTransitionState f$0;

    public /* synthetic */ CoreInteractiveCardKt$$ExternalSyntheticLambda4(CardRegistry.SharedCardTransitionState sharedCardTransitionState, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedCardTransitionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState = this.f$0;
        switch (i) {
            case 0:
                return sharedCardTransitionState;
            case 1:
                return (Quat) sharedCardTransitionState.rotation.getValue();
            case 2:
                return Float.valueOf(((Number) sharedCardTransitionState.zTranslation.getValue()).floatValue());
            case 3:
                return (Quat) sharedCardTransitionState.rotation.getValue();
            case 4:
                return Float.valueOf(((Number) sharedCardTransitionState.zTranslation.getValue()).floatValue());
            default:
                return new Pair(sharedCardTransitionState.rotation.getValue(), sharedCardTransitionState.zTranslation.getValue());
        }
    }
}
