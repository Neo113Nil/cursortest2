package com.squareup.cash.transfers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.room.util.DBUtil;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAddCashDisabledDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BalanceBasedAddCashDisabledDialogViewModel f$1;

    public /* synthetic */ BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda1(int i, BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel, Function1 function1) {
        this.f$1 = balanceBasedAddCashDisabledDialogViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = BalanceBasedAddCashDisabledDialogView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(13, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                    AddMoneyViewKt.BalanceBasedAddCashDisabledDialog(balanceBasedAddCashDisabledDialogViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                AddMoneyViewKt.BalanceBasedAddCashDisabledDialog(balanceBasedAddCashDisabledDialogViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda1(Function1 function1, BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel) {
        this.f$0 = function1;
        this.f$1 = balanceBasedAddCashDisabledDialogViewModel;
    }
}
