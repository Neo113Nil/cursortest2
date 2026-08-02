package com.squareup.cash.support.chat.views;

import android.app.Dialog;
import android.view.View;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.account.settings.viewmodels.ReferralStatusViewEvent;
import com.squareup.cash.arcade.treehouse.QrCodeScannerBinding$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewEvents;
import com.squareup.cash.buynowpaylater.views.AfterPayStackableInfoSheetView;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.history.treehouse.views.ActivityInviteFriendsView;
import com.squareup.cash.investing.components.categories.InvestingChoiceRow;
import com.squareup.cash.investing.components.categories.InvestingFilterResultRow;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.NewsArticleAdapter;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.components.MooncakeSearchTextField;
import com.squareup.cash.onboarding.viewmodels.CountrySelectorViewEvent;
import com.squareup.cash.onboarding.views.CountrySelectorDialog;
import com.squareup.cash.profile.views.ReferralStatusView;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.views.transcript.message.MessageView;
import com.squareup.cash.support.chat.views.transcript.message.StatusTimestampView;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.document.DocumentTileAdapter;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;

/* loaded from: classes9.dex */
public final /* synthetic */ class ChatView$$ExternalSyntheticLambda28 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ChatView$$ExternalSyntheticLambda28(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((ChatView) obj).handleSendButtonClick();
                return;
            case 1:
                Ui.EventReceiver eventReceiver = ((AfterPayStackableInfoSheetView) obj).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(InfoSheetViewEvents.CloseSheet.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 2:
                RealActivityInvitePresenter realActivityInvitePresenter = ((ActivityInviteFriendsView) obj).presenter;
                if (realActivityInvitePresenter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    throw null;
                }
                ((Navigator) realActivityInvitePresenter.navigator).goTo(((RealFlowStarter) ((FlowStarter) realActivityInvitePresenter.flowStarter)).startInviteFlow(new Finish(null), BlockersScreens.StartFlowEntryPointScreen.Origin.ACTIVITY));
                return;
            case 3:
                ((PageFetcher$generateNewPagingSource$3) obj).invoke();
                return;
            case 4:
                int i2 = InvestingChoiceRow.$r8$clinit;
                ((IntentLauncher$$ExternalSyntheticLambda0) obj).invoke();
                return;
            case 5:
                int i3 = InvestingFilterResultRow.$r8$clinit;
                ((InvestingNewsKt$$ExternalSyntheticLambda0) obj).invoke();
                return;
            case 6:
                QrCodeScannerBinding$$ExternalSyntheticLambda0 qrCodeScannerBinding$$ExternalSyntheticLambda0 = ((NewsArticleAdapter) obj).eventReceiver;
                if (qrCodeScannerBinding$$ExternalSyntheticLambda0 != null) {
                    qrCodeScannerBinding$$ExternalSyntheticLambda0.sendEvent(InvestingCryptoNewsViewEvent.ViewAllArticlesClicked.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 7:
                ((MooncakeSearchTextField) obj).editText.setText("");
                return;
            case 8:
                Ui.EventReceiver eventReceiver2 = ((CountrySelectorDialog) obj).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(CountrySelectorViewEvent.Dismissed.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 9:
                Ui.EventReceiver eventReceiver3 = ((ReferralStatusView) obj).eventReceiver;
                if (eventReceiver3 != null) {
                    eventReceiver3.sendEvent(ReferralStatusViewEvent.BackPressed.INSTANCE);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                    throw null;
                }
            case 10:
                MessageView messageView = (MessageView) obj;
                String str = messageView.timestampText;
                if (str == null || str.length() == 0) {
                    return;
                }
                boolean z = !messageView.showTimestamp;
                messageView.showTimestamp = z;
                StatusTimestampView statusTimestampView = messageView.statusTimestampView;
                statusTimestampView.model$delegate.setValue(ChatContentViewModel.StatusTimestampViewModel.copy$default(statusTimestampView.getModel(), null, null, false, null, z, 15));
                return;
            case 11:
                ((TimelineView) obj).setCollapsed(false);
                return;
            case 12:
                ((DocumentWorkflow.Screen.ReviewCaptures) obj).onSubmit.invoke();
                return;
            case 13:
                ((DocumentTileAdapter) obj).onClickAddButton.invoke();
                return;
            case 14:
                ((Screen.AutoClassificationSelectCountryAndIdClassScreen) obj).onContinueClick.invoke();
                return;
            case 15:
                ((ErrorView) obj).onContinueClick.invoke();
                return;
            case 16:
                ((HeroCardViewKt$$ExternalSyntheticLambda9) obj).invoke();
                return;
            case 17:
                ((CameraScreenRunner$$ExternalSyntheticLambda2) obj).invoke();
                return;
            case 18:
                ((CameraScreenRunner) obj).cameraController.focus();
                return;
            case 19:
                ((Screen.ErrorScreen) obj).onContinueClick.invoke();
                return;
            case 20:
                ((GovernmentIdReviewRunner$$ExternalSyntheticLambda0) obj).invoke();
                return;
            case 21:
                ((GovernmentIdReviewRunner$$ExternalSyntheticLambda0) obj).invoke();
                return;
            case 22:
                ((CancelDialogFragment) obj).dismiss();
                return;
            case 23:
                ((Dialog) obj).dismiss();
                return;
            case 24:
                ((SelfieWorkflow.Screen.InstructionsScreen) obj).onClick.invoke();
                return;
            case 25:
                ((Http2Connection$$ExternalSyntheticLambda3) obj).invoke();
                return;
            case 26:
                ((StateFlowsKt$$ExternalSyntheticLambda2) obj).invoke();
                return;
            case 27:
                InputAddressComponent inputAddressComponent = (InputAddressComponent) obj;
                Boolean bool = Boolean.FALSE;
                inputAddressComponent.isAddressComponentsCollapsed = bool;
                StateFlowImpl stateFlowImpl = inputAddressComponent.isAddressFieldCollapsed._textValue;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, bool);
                return;
            case 28:
                ((Pi2UiInputCheckboxBinding) obj).checkbox.toggle();
                return;
            default:
                ((SharedFlowImpl) ((InputFileUploadComponent) obj).fileUploadController.visitorFactory).tryEmit(Unit.INSTANCE);
                return;
        }
    }
}
