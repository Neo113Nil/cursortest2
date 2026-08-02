package com.squareup.cash.transfers.views;

import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class WithdrawViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ WithdrawViewKt$$ExternalSyntheticLambda2(Function1 function1, Function0 function0) {
        this.$r8$classId = 0;
        this.f$0 = function1;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        Function0 function0 = this.f$1;
        switch (i) {
            case 0:
                function1.invoke(WithdrawViewEvent.SaveAmountClick.INSTANCE);
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                function1.invoke("");
                break;
            default:
                function0.invoke();
                function1.invoke(ClockInOverlayViewEvent.Dismiss.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WithdrawViewKt$$ExternalSyntheticLambda2(int i, Function0 function0, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function0;
        this.f$0 = function1;
    }
}
