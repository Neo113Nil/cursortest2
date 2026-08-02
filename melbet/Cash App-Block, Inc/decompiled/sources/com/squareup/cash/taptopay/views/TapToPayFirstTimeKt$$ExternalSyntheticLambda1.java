package com.squareup.cash.taptopay.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class TapToPayFirstTimeKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TapToPayFirstTimeKt$$ExternalSyntheticLambda1(int i, int i2, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = function1;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.intValue();
                TapToPayKt.TapToPayFirstTime(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 1:
                num.getClass();
                ScreenshotReviewViewKt.ScreenshotConfirm(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 2:
                num.intValue();
                ScreenshotReviewViewKt.DisputesTrackerFailedContent(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 3:
                num.getClass();
                ScreenshotReviewViewKt.SupportIncidentNotFound(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 4:
                num.getClass();
                ScreenshotReviewViewKt.Loading(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 5:
                num.intValue();
                TapToPayKt.TapToPayOnboardingComplete(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 6:
                num.intValue();
                TapToPayKt.TapToPayPaymentConfirmationDemo(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            case 7:
                num.intValue();
                TapToPayKt.TapToPayPaymentError(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            default:
                num.intValue();
                AddMoneyViewKt.SetDefaultInstrumentView(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
