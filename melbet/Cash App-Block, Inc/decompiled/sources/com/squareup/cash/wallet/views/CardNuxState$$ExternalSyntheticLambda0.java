package com.squareup.cash.wallet.views;

import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class CardNuxState$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardNuxState f$0;

    public /* synthetic */ CardNuxState$$ExternalSyntheticLambda0(CardNuxState cardNuxState, int i) {
        this.$r8$classId = i;
        this.f$0 = cardNuxState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardNuxState cardNuxState = this.f$0;
        switch (i) {
            case 0:
                Engine engine = new Engine(cardNuxState.scope, new AlertBannerKt$$ExternalSyntheticLambda3(cardNuxState, 17));
                engine.initialize();
                break;
            case 3:
                cardNuxState.pendingGridReturnEntrance$delegate.setValue(Boolean.TRUE);
                break;
        }
        return cardNuxState.getCurrentCard();
    }
}
