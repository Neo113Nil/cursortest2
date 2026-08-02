package com.squareup.cash.transfers.views;

import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class LinkedAccountsViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow f$1;

    public /* synthetic */ LinkedAccountsViewKt$$ExternalSyntheticLambda4(Function1 function1, LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow instrumentRow, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = instrumentRow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow instrumentRow = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(instrumentRow.linkedAccountsViewEvent);
                break;
            default:
                function1.invoke(instrumentRow.linkedAccountsViewEvent);
                break;
        }
        return Unit.INSTANCE;
    }
}
