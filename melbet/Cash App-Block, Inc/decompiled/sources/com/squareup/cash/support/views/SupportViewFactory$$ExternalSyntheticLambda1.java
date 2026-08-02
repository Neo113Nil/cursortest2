package com.squareup.cash.support.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SupportViewFactory$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScreenshotReviewViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SupportViewFactory$$ExternalSyntheticLambda1(ScreenshotReviewViewModel screenshotReviewViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = screenshotReviewViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ScreenshotReviewViewModel screenshotReviewViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (screenshotReviewViewModel != null) {
                        gapComposer.startReplaceGroup(2092193055);
                        ScreenshotReviewViewKt.ScreenshotReviewContent(screenshotReviewViewModel, function1, gapComposer, 0);
                    } else {
                        gapComposer.startReplaceGroup(433512746);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ScreenshotReviewViewKt.ScreenshotReview(screenshotReviewViewModel, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                ScreenshotReviewViewKt.ScreenshotReviewContent(screenshotReviewViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SupportViewFactory$$ExternalSyntheticLambda1(ScreenshotReviewViewModel screenshotReviewViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = screenshotReviewViewModel;
        this.f$1 = function1;
    }
}
