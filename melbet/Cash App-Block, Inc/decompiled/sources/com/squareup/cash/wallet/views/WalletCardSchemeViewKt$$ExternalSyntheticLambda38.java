package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class WalletCardSchemeViewKt$$ExternalSyntheticLambda38 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardSchemeViewModel.Module.HeroCard f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ WalletCardSchemeViewKt$$ExternalSyntheticLambda38(CardSchemeViewModel.Module.HeroCard heroCard, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = heroCard;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        CardSchemeViewModel.Module.HeroCard heroCard = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HeroCardViewKt.Render(heroCard, companion, function1, gapComposer, 48);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HeroCardViewKt.Render(heroCard, companion, function1, gapComposer2, 48);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
