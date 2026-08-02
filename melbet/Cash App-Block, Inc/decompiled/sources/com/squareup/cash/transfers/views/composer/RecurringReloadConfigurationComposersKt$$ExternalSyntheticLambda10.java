package com.squareup.cash.transfers.views.composer;

import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ RecurringReloadConfigurationViewModel.AmountPickerItem f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda10(Function1 function1, RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = amountPickerItem;
        this.f$2 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$2;
        RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(amountPickerItem);
                if (amountPickerItem instanceof RecurringReloadConfigurationViewModel.AmountPickerItem.Custom) {
                    function0.invoke();
                }
                break;
            default:
                function1.invoke(amountPickerItem);
                if (amountPickerItem instanceof RecurringReloadConfigurationViewModel.AmountPickerItem.Custom) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
