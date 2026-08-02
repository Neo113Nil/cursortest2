package com.withpersona.sdk2.inquiry.ui;

import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.textfield.TextInputLayout;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$2$1;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.android.Keyboards;
import com.squareup.util.cash.ColorsKt;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda25 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda25(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow, Parcelable parcelable, Parcelable parcelable2, int i) {
        this.$r8$classId = i;
        this.f$2 = renderContext;
        this.f$0 = selfieWorkflow;
        this.f$1 = parcelable;
        this.f$3 = parcelable2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        char c = 1;
        Continuation continuation = null;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                UiWorkflow uiWorkflow = (UiWorkflow) obj4;
                TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) ((UiState) obj3)).stepName, false, 10, null);
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new ForwardingFileSystem$$ExternalSyntheticLambda0((UiWorkflow.Input) obj, 12)));
                break;
            case 1:
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ((Function1) obj2).invoke((ActionCardViewEvent) obj);
                break;
            case 2:
                Function1 function1 = (Function1) obj;
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ActionCardViewEvent actionCardViewEvent = ((ActionCardViewModel.ButtonGroup.Button) obj2).action;
                if (actionCardViewEvent != null) {
                    function1.invoke(actionCardViewEvent);
                }
                break;
            case 3:
                Function1 function12 = (Function1) obj;
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ActionCardViewEvent actionCardViewEvent2 = ((ActionCardViewModel.ButtonGroup) obj2).primaryButton.action;
                if (actionCardViewEvent2 != null) {
                    function12.invoke(actionCardViewEvent2);
                }
                break;
            case 4:
                Function1 function13 = (Function1) obj;
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                CellActionCardViewEvent cellActionCardViewEvent = ((CellActionCardViewModel.ButtonGroup.Button) obj2).action;
                if (cellActionCardViewEvent != null) {
                    function13.invoke(cellActionCardViewEvent);
                }
                break;
            case 5:
                Function1 function14 = (Function1) obj;
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                CellActionCardViewEvent cellActionCardViewEvent2 = ((CellActionCardViewModel.ButtonGroup) obj2).primaryButton.action;
                if (cellActionCardViewEvent2 != null) {
                    function14.invoke(cellActionCardViewEvent2);
                }
                break;
            case 6:
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ((Function1) obj2).invoke(((NavigationCardViewModel) obj).action);
                break;
            case 7:
                Function1 function15 = (Function1) obj;
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                TemplateCardViewEvent templateCardViewEvent = ((TemplateCardViewModel.TapBehavior.ButtonGroup.Button) obj2).action;
                if (templateCardViewEvent != null) {
                    function15.invoke(templateCardViewEvent);
                }
                break;
            case 8:
                Function1 function16 = (Function1) obj;
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                TemplateCardViewEvent templateCardViewEvent2 = ((TemplateCardViewModel.TapBehavior.ButtonGroup) obj2).primaryButton.action;
                if (templateCardViewEvent2 != null) {
                    function16.invoke(templateCardViewEvent2);
                }
                break;
            case 9:
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ((Function1) obj2).invoke((TemplateCardViewEvent) obj);
                break;
            case 10:
                ((RealHapticVibrator) obj4).vibrate(((Haptics) obj3).input.standard);
                ((Function1) obj2).invoke(new TemplateCardViewEvent.TokenTapped(((TemplateCardViewModel.BottomPicker) obj).placeholderKey));
                break;
            case 11:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                Function1 function17 = (Function1) obj2;
                TouchRecorder touchRecorder = (TouchRecorder) obj;
                if (((ToolbarViewModel) obj4).isActionEnabled) {
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                    function17.invoke(new MainPaymentViewEvent.ActionClicked(CollectionsKt.toList(touchRecorder.lastGesture)));
                }
                break;
            case 12:
                PoolMemberListPresenter poolMemberListPresenter = (PoolMemberListPresenter) obj4;
                List list = (List) ((MutableState) obj3).getValue();
                List list2 = (List) ((MutableState) obj2).getValue();
                List list3 = (List) ((MutableState) obj).getValue();
                boolean z = poolMemberListPresenter.isOwner;
                PoolMemberListScreen poolMemberListScreen = poolMemberListPresenter.args;
                boolean z2 = poolMemberListPresenter.isModifyingParticipantsEnabled;
                List list4 = list;
                int i2 = 10;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = arrayList;
                        List<PoolParticipant> list5 = list2;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, i2));
                        for (PoolParticipant poolParticipant : list5) {
                            String str = poolParticipant.customer_identifier;
                            String str2 = str == null ? "" : str;
                            String str3 = poolParticipant.full_name;
                            String str4 = str3 == null ? "" : str3;
                            String valueOf = String.valueOf(str3 != null ? StringsKt___StringsKt.firstOrNull(str3) : null);
                            String str5 = poolParticipant.profile_photo_url;
                            arrayList3.add(new PoolListSection.PoolListPerson(str2, str4, null, valueOf, false, true, false, false, false, str5 != null ? new Image(str5, str5, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolParticipant.customer_identifier, poolParticipant.full_name, null, null)), false, false));
                        }
                        break;
                    } else {
                        PoolParticipant poolParticipant2 = (PoolParticipant) it.next();
                        String str6 = poolParticipant2.customer_identifier;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = poolParticipant2.full_name;
                        String str9 = str8 != null ? str8 : "";
                        ArrayList arrayList4 = arrayList;
                        String str10 = poolParticipant2.cashtag;
                        String valueOf2 = String.valueOf(str8 != null ? StringsKt___StringsKt.firstOrNull(str8) : continuation);
                        boolean contains = CollectionsKt.contains(list3, str6);
                        String str11 = poolParticipant2.profile_photo_url;
                        boolean z3 = z;
                        arrayList4.add(new PoolListSection.PoolListPerson(str7, str9, str10, valueOf2, contains, true, false, false, false, str11 != null ? new Image(str11, str11, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolParticipant2.customer_identifier, poolParticipant2.full_name, null, null)), (z && z2 && !poolMemberListScreen.isPoolClosed) || (Intrinsics.areEqual(str6, PlatformKt.activeAccountTokenOrNull(poolMemberListPresenter.sessionManager)) && poolMemberListScreen.viewerCanLeavePool && z2), z3));
                        i2 = 10;
                        z2 = z2;
                        arrayList = arrayList4;
                        poolMemberListScreen = poolMemberListScreen;
                        z = z3;
                        continuation = null;
                        poolMemberListPresenter = poolMemberListPresenter;
                    }
                }
                break;
            case 13:
                Keyboards.hideKeyboard((View) obj4);
                JobKt.launch$default((CoroutineScope) obj3, null, null, new TaxWebAppBridge.AnonymousClass3((Function1) obj2, (Function0) obj, continuation, 16), 3);
                break;
            case 14:
                Event event = (Event) obj4;
                CardModule.Push push = (CardModule.Push) obj3;
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                if (event != null) {
                    cardSchemePresenter.analytics.track(event, null);
                }
                CardModule.CardElementAction cardElementAction = push.action;
                if (cardElementAction != null) {
                    JobKt.launch$default(coroutineScope, null, null, new CardSchemePresenter$models$2$1(cardSchemePresenter, cardElementAction, continuation, c == true ? 1 : 0), 3);
                }
                break;
            case 15:
                Quat times = ((Quat) ((MutableState) obj).getValue()).times(((CardWobbleState) obj4).wobbleRotation());
                break;
            case 16:
                int i3 = HeroCardViewKt.$r8$clinit;
                Boolean bool = (Boolean) ((State) obj4).getValue();
                bool.getClass();
                Boolean bool2 = (Boolean) ((MutableState) obj3).getValue();
                bool2.getClass();
                Boolean bool3 = (Boolean) ((MutableState) obj2).getValue();
                bool3.getClass();
                Boolean bool4 = (Boolean) ((MutableState) obj).getValue();
                bool4.booleanValue();
                break;
            case 17:
                Function1 function18 = (Function1) obj4;
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj3;
                JobIdentifier jobIdentifier = (JobIdentifier) ((MutableState) obj2).getValue();
                LocationIdentifier locationIdentifier = (LocationIdentifier) ((MutableState) obj).getValue();
                if (jobIdentifier != null && locationIdentifier != null) {
                    function18.invoke(new ClockInBottomSheetViewEvent.ClockInClicked(jobIdentifier, locationIdentifier, clockInBottomSheetViewModel.shouldSendShiftToken));
                }
                break;
            case 18:
                GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) obj4;
                GovernmentIdState governmentIdState = (GovernmentIdState) obj3;
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) obj2;
                CaptureConfig captureConfig = (CaptureConfig) obj;
                TrackingEventsLogger.DefaultImpls.logGovernmentIdButtonClickEvent$default(governmentIdStepStateManager.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
                SubtreeManager subtreeManager = (SubtreeManager) governmentIdStepStateManager.lastChild;
                GovernmentIdState governmentIdState2 = (GovernmentIdState) subtreeManager.getState();
                if (governmentIdState2 != null) {
                    GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
                    IdPart$SideIdPart idPart$SideIdPart = reviewCapturedImage.currentPart;
                    List uploadingIds$government_id_release = governmentIdState2.getUploadingIds$government_id_release();
                    Screen.CameraScreen.ManualCapture manualCaptureDefaultState = GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input, reviewCapturedImage.currentPart.side);
                    List parts$government_id_release = governmentIdState2.getParts$government_id_release();
                    int partIndex$government_id_release = governmentIdState2.getPartIndex$government_id_release();
                    GovernmentIdState createBackState = GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager, false);
                    String str12 = reviewCapturedImage.countryCode;
                    governmentIdStepStateManager.videoCaptureHelper.getClass();
                    GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, uploadingIds$government_id_release, captureConfig, manualCaptureDefaultState, parts$government_id_release, partIndex$government_id_release, createBackState, WebRtcState.Disconnected, input.videoCaptureConfig.webRtcJwt, null, false, false, str12, null, new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager, 9), 11776);
                    waitForAutocapture.didGoBack = true;
                    governmentIdStepStateManager.updateState(waitForAutocapture);
                }
                break;
            case 19:
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) obj4, new HCaptcha$$ExternalSyntheticLambda1(26, (SelfieState.ShowPoseHint) obj3, (SelfieWorkflow.Input) obj)));
                break;
            case 20:
                SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj4;
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default(selfieWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda38((SelfieState.StartCapture) obj3, (SelfieWorkflow.Input) obj, selfieWorkflow)));
                break;
            case 21:
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) obj4, new HCaptcha$$ExternalSyntheticLambda1(25, (SelfieWorkflow.Input) obj3, (SelfieState.ReviewCaptures) obj)));
                break;
            case 22:
                SelfieWorkflow selfieWorkflow2 = (SelfieWorkflow) obj4;
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default(selfieWorkflow2, new SelfieWorkflow$$ExternalSyntheticLambda38(21, selfieWorkflow2, (SelfieWorkflow.Input) obj3, (SelfieState.ShowInstructions) obj)));
                break;
            case 23:
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) obj4, new HCaptcha$$ExternalSyntheticLambda1(27, (SelfieWorkflow.Input) obj3, (SelfieState.RestartCamera) obj)));
                break;
            case 24:
                BasicSelfieCaptureViewController basicSelfieCaptureViewController = (BasicSelfieCaptureViewController) obj4;
                basicSelfieCaptureViewController.isPlayingSuccessAnimation = false;
                basicSelfieCaptureViewController.setMessageTitle((String) obj3);
                basicSelfieCaptureViewController.setMessageBody((String) obj2);
                ((CameraScreenRunner$$ExternalSyntheticLambda2) obj).invoke();
                break;
            case 25:
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj4;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = cameraScreenRunner.lifecycleScope;
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                JobKt.launch$default(lifecycleCoroutineScopeImpl, MainDispatcherLoader.dispatcher, null, new CameraScreenRunner$showRendering$2(cameraScreenRunner, (SelfieWorkflow.Screen.CameraScreen) obj3, (CameraController) obj2, (zzpc) obj, (Continuation) null), 2);
                break;
            case 26:
                ((TextInputLayout) obj4).setVisibility(8);
                ((TextInputLayout) obj3).setVisibility(8);
                ((ConstraintLayout) obj2).setVisibility(8);
                ((ConstraintLayout) obj).setVisibility(8);
                break;
            default:
                ImageStylingKt.applyStyle(((LocalImage) obj3).getStyles(), (ThemeableLottieAnimationView) ((o) obj4).c, (String[]) obj2, (String[]) obj, new String[0], new String[0]);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda25(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
