package com.squareup.cash.wallet.views;

import com.squareup.cash.wallet.viewmodels.CardControlDialogViewEvent$TapButton;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArcadeCardControlDialog$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ CardControlDialogViewModel.Button f$1;

    public /* synthetic */ ArcadeCardControlDialog$$ExternalSyntheticLambda3(Function1 function1, CardControlDialogViewModel.Button button, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = button;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardControlDialogViewModel.Button button = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = ArcadeCardControlDialog.$r8$clinit;
                function1.invoke(new CardControlDialogViewEvent$TapButton(button.action));
                break;
            case 1:
                int i3 = ArcadeCardControlDialog.$r8$clinit;
                function1.invoke(new CardControlDialogViewEvent$TapButton(button.action));
                break;
            default:
                int i4 = ArcadeCardControlDialog.$r8$clinit;
                function1.invoke(new CardControlDialogViewEvent$TapButton(button.action));
                break;
        }
        return Unit.INSTANCE;
    }
}
