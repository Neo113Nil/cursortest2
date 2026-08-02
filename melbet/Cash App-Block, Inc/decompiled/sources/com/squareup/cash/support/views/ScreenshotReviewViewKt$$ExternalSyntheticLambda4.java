package com.squareup.cash.support.views;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageSystemMessageComposeView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTextComposeView;
import com.squareup.cash.support.viewmodels.ScreenshotConfirmViewEvent$Confirm;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewEvent;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewEvent;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewEvent;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ScreenshotReviewViewKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ScreenshotReviewViewKt$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 7;
        Role role = null;
        int i2 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.$r8$classId) {
            case 0:
                ScreenshotReviewViewModel.Screenshot screenshot = (ScreenshotReviewViewModel.Screenshot) obj;
                screenshot.getClass();
                break;
            case 1:
                ((String) obj).getClass();
                break;
            case 2:
                ((String) obj).getClass();
                break;
            case 3:
                int i3 = MessageSystemMessageComposeView.$r8$clinit;
                ((String) obj).getClass();
                break;
            case 4:
                int i4 = MessageTextComposeView.$r8$clinit;
                ((String) obj).getClass();
                break;
            case 5:
                int i5 = MessageTextComposeView.$r8$clinit;
                ((String) obj).getClass();
                break;
            case 6:
                int i6 = MessageTextComposeView.$r8$clinit;
                ((String) obj).getClass();
                break;
            case 7:
                DisputeRow disputeRow = (DisputeRow) obj;
                disputeRow.getClass();
                break;
            case 8:
                DisputeRow disputeRow2 = (DisputeRow) obj;
                disputeRow2.getClass();
                break;
            case 9:
                ((Link) obj).getClass();
                break;
            case 10:
                ((ScreenshotConfirmViewEvent$Confirm) obj).getClass();
                break;
            case 11:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 12:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 13:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 14:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 15:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 16:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 17:
                ((ScreenshotReviewViewEvent) obj).getClass();
                break;
            case 18:
                ((SupportDisputeTrackerViewEvent) obj).getClass();
                break;
            case 19:
                ((SupportDisputeTrackerViewEvent) obj).getClass();
                break;
            case 20:
                ((SupportDisputeTrackerViewEvent) obj).getClass();
                break;
            case 21:
                ((SupportDisputeTrackerViewEvent) obj).getClass();
                break;
            case 22:
                ((SupportDisputeTrackerViewEvent) obj).getClass();
                break;
            case 23:
                ScreenshotReviewViewModel.Screenshot screenshot2 = (ScreenshotReviewViewModel.Screenshot) obj;
                screenshot2.getClass();
                break;
            case 24:
                ScreenshotReviewViewModel.Screenshot screenshot3 = (ScreenshotReviewViewModel.Screenshot) obj;
                screenshot3.getClass();
                break;
            case 25:
                ((ScreenshotReviewViewModel.Screenshot) obj).getClass();
                break;
            case 26:
                ((SupportDisputeTrackerViewEvent) obj).getClass();
                break;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                break;
            case 28:
                ((SupportIncidentDetailsViewEvent) obj).getClass();
                break;
            default:
                ((SupportPhoneStatusViewEvent) obj).getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
