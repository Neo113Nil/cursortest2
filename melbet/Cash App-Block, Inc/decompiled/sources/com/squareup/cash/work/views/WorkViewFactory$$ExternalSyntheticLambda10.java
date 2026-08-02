package com.squareup.cash.work.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkViewFactory$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ShiftDetailViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda10(ShiftDetailViewModel shiftDetailViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = shiftDetailViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ShiftDetailViewModel shiftDetailViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ShiftDetailViewKt.ShiftDetailView(shiftDetailViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (shiftDetailViewModel instanceof ShiftDetailViewModel.Loading) {
                    gapComposer2.startReplaceGroup(802659856);
                    gapComposer2.end(false);
                } else if (shiftDetailViewModel instanceof ShiftDetailViewModel.Error) {
                    gapComposer2.startReplaceGroup(802661289);
                    ShiftDetailViewKt.ErrorShiftDetailView(function1, gapComposer2, 0);
                    gapComposer2.end(false);
                } else {
                    if (!(shiftDetailViewModel instanceof ShiftDetailViewModel.Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 802658273, false);
                    }
                    gapComposer2.startReplaceGroup(802663537);
                    ShiftDetailViewKt.LoadedShiftDetailView((ShiftDetailViewModel.Loaded) shiftDetailViewModel, function1, gapComposer2, 0);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                ShiftDetailViewKt.ShiftDetailView(shiftDetailViewModel, function1, composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda10(ShiftDetailViewModel shiftDetailViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = shiftDetailViewModel;
        this.f$1 = function1;
    }
}
