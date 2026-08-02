package com.squareup.cash.wallet.views;

import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.NextUpDismissMethod;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletCardSchemeViewKt$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ CardSchemeViewModel.Module.NextUpCard f$1;

    public /* synthetic */ WalletCardSchemeViewKt$$ExternalSyntheticLambda13(Function1 function1, CardSchemeViewModel.Module.NextUpCard nextUpCard, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = nextUpCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardSchemeViewModel.Module.NextUpCard nextUpCard = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new WalletHomeViewEvent.NextUpCardViewed(nextUpCard.id, nextUpCard.actionId));
                break;
            case 1:
                function1.invoke(new WalletHomeViewEvent.NextUpCardDismissed(nextUpCard.id, nextUpCard.actionId, NextUpDismissMethod.SWIPE));
                break;
            case 2:
                function1.invoke(new WalletHomeViewEvent.NextUpCardDismissed(nextUpCard.id, nextUpCard.actionId, NextUpDismissMethod.ACCESSIBILITY_ACTION));
                break;
            case 3:
                function1.invoke(new WalletHomeViewEvent.NextUpCardViewed(nextUpCard.id, nextUpCard.actionId));
                break;
            default:
                function1.invoke(new WalletHomeViewEvent.NextUpCardClicked(nextUpCard.actionId));
                break;
        }
        return Unit.INSTANCE;
    }
}
