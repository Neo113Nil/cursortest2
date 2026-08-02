package com.squareup.cash.support.views;

import com.squareup.cash.activity.viewmodels.FullScreenActivityViewEvent$Exit;
import com.squareup.cash.support.viewmodels.ScreenshotConfirmViewEvent$Confirm;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewEvent;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewEvent;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewEvent;
import com.squareup.cash.support.viewmodels.SupportFlowCheckConnectionViewEvent$Close;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetEvents;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewEvent;
import com.squareup.cash.support.viewmodels.SupportLoadClientScenarioEvent$GoBack;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScreenshotReviewViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ScreenshotReviewViewKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ScreenshotConfirmViewEvent$Confirm screenshotConfirmViewEvent$Confirm = ScreenshotConfirmViewEvent$Confirm.INSTANCE;
        ScreenshotReviewViewEvent.SendScreenshots sendScreenshots = ScreenshotReviewViewEvent.SendScreenshots.INSTANCE;
        SupportArticleIncidentsSheetViewEvent.Close close = SupportArticleIncidentsSheetViewEvent.Close.INSTANCE;
        SupportDisputeTrackerViewEvent.GoBack goBack = SupportDisputeTrackerViewEvent.GoBack.INSTANCE;
        SupportIncidentDetailsViewEvent.Close close2 = SupportIncidentDetailsViewEvent.Close.INSTANCE;
        ScreenshotReviewViewEvent.ErrorDisplayed errorDisplayed = ScreenshotReviewViewEvent.ErrorDisplayed.INSTANCE;
        ScreenshotReviewViewEvent.TakeMoreScreenshots takeMoreScreenshots = ScreenshotReviewViewEvent.TakeMoreScreenshots.INSTANCE;
        SupportFlowCheckConnectionViewEvent$Close supportFlowCheckConnectionViewEvent$Close = SupportFlowCheckConnectionViewEvent$Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ScreenshotReviewViewEvent.Back.INSTANCE);
                break;
            case 1:
                function1.invoke(screenshotConfirmViewEvent$Confirm);
                break;
            case 2:
                function1.invoke(screenshotConfirmViewEvent$Confirm);
                break;
            case 3:
                function1.invoke(ScreenshotReviewViewEvent.DismissViewScreenshot.INSTANCE);
                break;
            case 4:
                function1.invoke(errorDisplayed);
                break;
            case 5:
                function1.invoke(errorDisplayed);
                break;
            case 6:
                function1.invoke(ScreenshotReviewViewEvent.AbortSendingScreenshots.INSTANCE);
                break;
            case 7:
                function1.invoke(sendScreenshots);
                break;
            case 8:
                function1.invoke(ScreenshotReviewViewEvent.Done.INSTANCE);
                break;
            case 9:
                function1.invoke(takeMoreScreenshots);
                break;
            case 10:
                function1.invoke(sendScreenshots);
                break;
            case 11:
                function1.invoke(takeMoreScreenshots);
                break;
            case 12:
                function1.invoke(errorDisplayed);
                break;
            case 13:
                function1.invoke(ScreenshotReviewViewEvent.AbortTakingScreenshots.INSTANCE);
                break;
            case 14:
                function1.invoke(ScreenshotReviewViewEvent.Close.INSTANCE);
                break;
            case 15:
                function1.invoke(takeMoreScreenshots);
                break;
            case 16:
                int i2 = SupportArticleIncidentsSheetView.$r8$clinit;
                function1.invoke(close);
                break;
            case 17:
                function1.invoke(close);
                break;
            case 18:
                function1.invoke(goBack);
                break;
            case 19:
                function1.invoke(goBack);
                break;
            case 20:
                int i3 = SupportFlowCheckConnectionView.$r8$clinit;
                function1.invoke(supportFlowCheckConnectionViewEvent$Close);
                break;
            case 21:
                int i4 = SupportFlowCheckConnectionView.$r8$clinit;
                function1.invoke(supportFlowCheckConnectionViewEvent$Close);
                break;
            case 22:
                int i5 = SupportFlowCheckConnectionView.$r8$clinit;
                function1.invoke(supportFlowCheckConnectionViewEvent$Close);
                break;
            case 23:
                function1.invoke(FullScreenActivityViewEvent$Exit.INSTANCE);
                break;
            case 24:
                function1.invoke(SupportHomeContactOptionsSheetEvents.DismissSheet.INSTANCE);
                break;
            case 25:
                function1.invoke(SupportHomeContactOptionsSheetEvents.MoreContactOptionsClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(close2);
                break;
            case 27:
                function1.invoke(close2);
                break;
            case 28:
                function1.invoke(SupportLoadClientScenarioEvent$GoBack.INSTANCE);
                break;
            default:
                function1.invoke(SupportPhoneStatusViewEvent.Close.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
