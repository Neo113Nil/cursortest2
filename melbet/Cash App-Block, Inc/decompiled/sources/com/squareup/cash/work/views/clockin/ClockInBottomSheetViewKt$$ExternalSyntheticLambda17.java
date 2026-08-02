package com.squareup.cash.work.views.clockin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ClockInBottomSheetViewKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClockInBottomSheetViewModel.JobItem f$0;

    public /* synthetic */ ClockInBottomSheetViewKt$$ExternalSyntheticLambda17(ClockInBottomSheetViewModel.JobItem jobItem, int i) {
        this.$r8$classId = i;
        this.f$0 = jobItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ClockInBottomSheetViewModel.JobItem jobItem = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = jobItem != null ? jobItem.title : null;
                    if (str == null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer, 31697956, R.string.work_views_clock_in_not_selected, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(31697274);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, jobItem.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
