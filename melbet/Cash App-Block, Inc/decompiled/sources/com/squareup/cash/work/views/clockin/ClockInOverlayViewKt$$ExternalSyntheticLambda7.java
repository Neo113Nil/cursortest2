package com.squareup.cash.work.views.clockin;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ClockInOverlayViewKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ClockInOverlayState f$0;
    public final /* synthetic */ ClockInOverlayViewModel.Loaded f$1;
    public final /* synthetic */ PaddingValuesImpl f$2;

    public /* synthetic */ ClockInOverlayViewKt$$ExternalSyntheticLambda7(ClockInOverlayState clockInOverlayState, ClockInOverlayViewModel.Loaded loaded, PaddingValuesImpl paddingValuesImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = clockInOverlayState;
        this.f$1 = loaded;
        this.f$2 = paddingValuesImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        PaddingValuesImpl paddingValuesImpl = this.f$2;
        ClockInOverlayViewModel.Loaded loaded = this.f$1;
        ClockInOverlayState clockInOverlayState = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                DisclaimerTextKt.ClockInOverlayLoadedContent(clockInOverlayState, loaded, paddingValuesImpl, composer, Updater.updateChangedFlags(1));
                break;
            default:
                DisclaimerTextKt.ClockInOverlayModeContent(clockInOverlayState, loaded, paddingValuesImpl, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
