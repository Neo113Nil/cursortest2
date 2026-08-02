package com.squareup.cash.transfers.views;

import android.view.View;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddMoneyViewKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AddMoneyViewKt$$ExternalSyntheticLambda1(View view, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        AddMoneyViewEvent.CtaClick ctaClick = AddMoneyViewEvent.CtaClick.INSTANCE;
        Function1 function1 = this.f$1;
        View view = this.f$0;
        switch (i) {
            case 0:
                Keyboards.hideKeyboard(view);
                function1.invoke(AddMoneyViewEvent.CloseClick.INSTANCE);
                break;
            case 1:
                Keyboards.hideKeyboard(view);
                function1.invoke(PaymentConfigurationViewEvent.DismissSheet.INSTANCE);
                break;
            case 2:
                Keyboards.hideKeyboard(view);
                function1.invoke(PoolContributeWithNoteViewEvent.DismissSheet.INSTANCE);
                break;
            case 3:
                Keyboards.hideKeyboard(view);
                function1.invoke(StartPoolViewEvent.DismissSheet.INSTANCE);
                break;
            case 4:
                Keyboards.hideKeyboard(view);
                function1.invoke(Boolean.TRUE);
                break;
            case 5:
                Keyboards.hideKeyboard(view);
                function1.invoke(AddMoneyViewEvent.ChangeInstrumentClick.INSTANCE);
                break;
            case 6:
                Keyboards.hideKeyboard(view);
                function1.invoke(ctaClick);
                break;
            default:
                Keyboards.hideKeyboard(view);
                function1.invoke(ctaClick);
                break;
        }
        return Unit.INSTANCE;
    }
}
