package com.squareup.cash.work.views.shift;

import com.squareup.cash.work.viewmodels.ShiftListViewEvent;
import com.squareup.cash.work.viewmodels.ShiftNoteViewEvent;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$ClockInUnscheduledClicked;
import com.squareup.cash.work.viewmodels.TimecardDetailViewEvent;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ShiftSection2ViewEvent$ClockInUnscheduledClicked shiftSection2ViewEvent$ClockInUnscheduledClicked = ShiftSection2ViewEvent$ClockInUnscheduledClicked.INSTANCE;
        WorkWebViewEvent.ExitWebView exitWebView = WorkWebViewEvent.ExitWebView.INSTANCE;
        ShiftListViewEvent.BackClicked backClicked = ShiftListViewEvent.BackClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(backClicked);
                break;
            case 1:
                function1.invoke(backClicked);
                break;
            case 2:
                function1.invoke(ShiftListViewEvent.MonthTitleClicked.INSTANCE);
                break;
            case 3:
                function1.invoke(backClicked);
                break;
            case 4:
                function1.invoke(ShiftNoteViewEvent.BackClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(shiftSection2ViewEvent$ClockInUnscheduledClicked);
                break;
            case 6:
                function1.invoke(shiftSection2ViewEvent$ClockInUnscheduledClicked);
                break;
            case 7:
                function1.invoke(TimecardDetailViewEvent.BackClicked.INSTANCE);
                break;
            case 8:
                function1.invoke(TimecardDetailViewEvent.EditClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(WorkWebViewEvent.RetryLoad.INSTANCE);
                break;
            case 10:
                function1.invoke(exitWebView);
                break;
            case 11:
                function1.invoke(exitWebView);
                break;
            default:
                function1.invoke("");
                break;
        }
        return Unit.INSTANCE;
    }
}
