package com.squareup.cash.wallet.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$2$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.viewmodels.ShiftNoteViewEvent;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$DisabledClockInTapped;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.views.shift.LoadingAction;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import io.noties.markwon.MarkwonImpl;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda9(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        Continuation continuation = null;
        continuation = null;
        continuation = null;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                CardSchemeViewModel.Module.HeroCard heroCard = (CardSchemeViewModel.Module.HeroCard) obj2;
                if (!((Boolean) ((MutableState) obj).getValue()).booleanValue()) {
                    function1.invoke(new WalletHomeViewEvent.ToggleCardDataVisibility(heroCard.cardDetails.isLocked));
                }
                break;
            case 1:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new WorkflowNode$tick$1$1((CardSchemePresenter) obj2, (RoundUpsElement) obj, continuation, 13), 3);
                break;
            case 2:
                Float f = (Float) obj2;
                MutableState mutableState = (MutableState) obj;
                Object invoke = ((Function0) obj3).invoke();
                if (invoke != null) {
                    mutableState.setValue(invoke);
                } else {
                    invoke = mutableState.getValue();
                    if (invoke == null) {
                    }
                }
                break;
            case 3:
                break;
            case 4:
                ((MutableState) obj).setValue(Boolean.TRUE);
                ((Function1) obj3).invoke((CardModelView) obj2);
                break;
            case 5:
                CardSchemeViewModel.Module.CardAnimation cardAnimation = (CardSchemeViewModel.Module.CardAnimation) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                break;
            case 6:
                CardModelView cardModelView = (CardModelView) obj2;
                Function0 function0 = (Function0) obj;
                if (((Boolean) ((Function0) obj3).invoke()).booleanValue()) {
                    cardModelView.setAlpha(1.0f);
                }
                function0.invoke();
                break;
            case 7:
                Function0 function02 = (Function0) obj2;
                Function0 function03 = (Function0) obj;
                Object invoke2 = ((Function0) obj3).invoke();
                if (!((List) invoke2).isEmpty() && ((Boolean) function02.invoke()).booleanValue() && !((Boolean) function03.invoke()).booleanValue()) {
                    continuation = invoke2;
                }
                break;
            case 8:
                CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel = (CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel) obj;
                ((Function1) obj3).invoke(new WalletHomeViewEvent.PresentationStatusClicked((PresentationTimelineViewModel) obj2, deliveryStatusRowModel.title, deliveryStatusRowModel.subtitle, deliveryStatusRowModel.themeToken, deliveryStatusRowModel.deviceId));
                break;
            case 9:
                PresentationAction presentationAction = (PresentationAction) obj2;
                Function1 function12 = (Function1) obj3;
                CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel2 = (CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel) obj;
                if (presentationAction != null) {
                    String str = presentationAction.clientRouteUrl;
                    String str2 = deliveryStatusRowModel2.buttonLabel;
                    if (str2 == null) {
                        str2 = "";
                    }
                    function12.invoke(new WalletHomeViewEvent.PresentationStatusActionClicked(str, str2, deliveryStatusRowModel2.themeToken, deliveryStatusRowModel2.deviceId));
                }
                break;
            case 10:
                RealPayDataLoader realPayDataLoader = (RealPayDataLoader) obj;
                break;
            case 11:
                TakeBreakBottomSheetViewModel.BreakItem breakItem = (TakeBreakBottomSheetViewModel.BreakItem) obj2;
                String str3 = breakItem.token;
                ((MutableState) obj).setValue(str3);
                ((Function1) obj3).invoke(new TakeBreakBottomSheetViewEvent.BreakSelected(str3, breakItem.versionNumber));
                break;
            case 12:
                Function1 function13 = (Function1) obj3;
                TextFieldState textFieldState = (TextFieldState) obj2;
                ((MutableState) obj).setValue(LoadingAction.SAVE);
                function13.invoke(new ShiftNoteViewEvent.AddNoteClicked(String.valueOf(textFieldState != null ? textFieldState.getValue$foundation().text : null)));
                break;
            case 13:
                ((MutableState) obj).setValue(Boolean.FALSE);
                ((MutableState) obj2).setValue(LoadingAction.DELETE);
                ((Function1) obj3).invoke(ShiftNoteViewEvent.DeleteNoteClicked.INSTANCE);
                break;
            case 14:
                ((Function1) obj3).invoke(new ShiftSection2ViewEvent$DisabledClockInTapped((OffsetDateTime) obj2, (String) obj));
                break;
            case 15:
                ((View) obj2).performHapticFeedback(6);
                ((Function1) obj3).invoke((PartnerAccount) obj);
                break;
            case 16:
                ((FocusOwnerImpl) obj2).clearFocus(false);
                ((Function1) obj3).invoke((FinancialConnectionsInstitution) obj);
                break;
            case 17:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new MoneyTabUIKt$MoneyTabLoaded$2$1((LazyListState) obj, continuation, i2), 3);
                FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj2);
                break;
            case 18:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new ShimmerModifierKt$shimmer$1$1((RealWebSocket$connect$1) obj2, (OnBackPressedDispatcher) obj, continuation, 14), 3);
                break;
            case 19:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new ShimmerModifierKt$shimmer$1$1((RealWebSocket$connect$1) obj2, (Function0) obj, continuation, 15), 3);
                break;
            case 20:
                ((DocumentWorkflow) obj3).onEvent((StatefulWorkflow.RenderContext) obj2, new DocumentWorkflow.Event.Submit(((DocumentWorkflow.State.ReviewCaptures) ((DocumentWorkflow.State) obj)).documentId));
                break;
            case 21:
                MarkwonImpl markwonImpl = (MarkwonImpl) obj2;
                Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = (Pi2GovernmentidCameraBinding) obj;
                View view = ((BasicGovIdCaptureViewController) obj3).customOverlayView;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        break;
                    } else {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                        ImageView imageView = pi2GovernmentidCameraBinding.overlayGuide;
                        layoutParams2.topToTop = imageView.getId();
                        layoutParams2.bottomToBottom = imageView.getId();
                        layoutParams2.startToStart = imageView.getId();
                        layoutParams2.endToEnd = imageView.getId();
                        view.setLayoutParams(layoutParams2);
                    }
                }
                markwonImpl.onLayout();
                break;
            case 22:
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj3;
                Screen.CameraScreen cameraScreen = (Screen.CameraScreen) obj2;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) obj;
                StandaloneCoroutine standaloneCoroutine = cameraScreenRunner.currentCaptureJob;
                boolean z = standaloneCoroutine != null && standaloneCoroutine.isActive();
                TrackingEventsLogger.DefaultImpls.logGovernmentIdButtonClickEvent$default(cameraScreenRunner.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
                if (!z) {
                    cameraScreenRunner.startLocalVideoCaptureIfNeeded(cameraScreen, cameraScreen.maxRecordingLengthMs);
                    cameraScreen.manualCaptureClicked.invoke();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    cameraScreenRunner.currentCaptureJob = JobKt.launch$default(lifecycleCoroutineScopeImpl, MainDispatcherLoader.dispatcher, null, new GlanceAppWidgetReceiver$onDeleted$1(cameraScreen, cameraScreenRunner, null), 2);
                }
                break;
            case 23:
                GovernmentIdWorkflowUtilsKt.handlePermissionChanged(((CaptureRenderer) obj3).applicationContext, (StatefulWorkflow.RenderContext) obj2, (GovernmentIdWorkflow.Input) obj, true);
                break;
            case 24:
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(((CaptureRenderer) obj3).trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, null, 4, null), false, 2, null);
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default(new CaptureRenderer$$ExternalSyntheticLambda3((GovernmentIdState.WaitForAutocapture) obj, i4)));
                break;
            case 25:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
            case 26:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
            case 27:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
            case 28:
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(((GovIdCaptureRenderer) obj3).trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, null, 4, null), false, 2, null);
                ((SubtreeManager) obj2).updateState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) obj, Screen.CameraScreen.ManualCapture.Disabled, null, null, false, false, null, 32759));
                break;
            default:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda9(SubtreeManager subtreeManager, GovernmentIdWorkflow.Input input, POPMatchingFactory pOPMatchingFactory, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = subtreeManager;
        this.f$1 = input;
        this.f$2 = function1;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda9(Object obj, MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = mutableState;
        this.f$1 = mutableState2;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda9(Object obj, Function1 function1, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = function1;
        this.f$2 = obj2;
    }
}
