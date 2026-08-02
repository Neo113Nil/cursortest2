package com.withpersona.sdk2.inquiry.internal.state;

import android.util.DisplayMetrics;
import androidx.camera.video.VideoCapture;
import androidx.lifecycle.SavedStateHandle;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker;
import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.InquiryErrorMessagesKt;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.PollingMode;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager;
import com.withpersona.sdk2.inquiry.internal.StepState;
import com.withpersona.sdk2.inquiry.internal.TransitionBackWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.selfie.DesignVersion;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.commonmark.node.Node;

/* loaded from: classes9.dex */
public final class InquiryStateManager extends Node {
    public final CreateInquiryWorker_Factory_Impl createInquiryWorker;
    public final DocumentWorkflow documentWorkflow;
    public final ExchangeOneTimeCodeWorker_Factory_Impl exchangeOneTimeCodeWorkerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 externalInquiryController;
    public final FeatureFlagManager featureFlagManager;
    public final FeatureFlagWorker_Factory_Impl featureFlagWorkerFactory;
    public final GovernmentIdWorkflow governmentIdWorkflow;
    public final CreateInquirySessionWorker_Factory_Impl inquirySessionWorker;
    public final IntegrationWorkflow integrationWorkflow;
    public final NavigationStateManager navigationStateManager;
    public final PollingWorker_Factory_Impl pollingWorker;
    public final RestoreUiStepStateWorker_Factory_Impl restoreUiStepStateWorkerFactory;
    public final SelfieWorkflow selfieWorkflow;
    public final SilentNetworkAuthenticationManager silentNetworkAuthenticationManager;
    public final TrackingEventsLogger trackingEventsLogger;
    public final TrackingMetadataProvider trackingMetadataProvider;
    public final TransitionBackWorker_Factory_Impl transitionBackWorker;
    public final TransitionWorker_Factory_Impl transitionWorkerFactory;
    public final UiStepSavedStateHelper uiStepSavedStateHelper;
    public final UiWorkflow uiWorkflow;
    public final UpdateInquirySessionWorker_Factory_Impl updateInquirySessionWorkerFactory;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DesignVersion.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DesignVersion designVersion = DesignVersion.V0;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[PollingMode.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PollingMode pollingMode = PollingMode.Background;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr4[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryStateManager(InquiryWorkflow$Props inquiryWorkflow$Props, SavedStateHandle savedStateHandle, CreateInquiryWorker_Factory_Impl createInquiryWorker_Factory_Impl, CreateInquirySessionWorker_Factory_Impl createInquirySessionWorker_Factory_Impl, PollingWorker_Factory_Impl pollingWorker_Factory_Impl, TransitionBackWorker_Factory_Impl transitionBackWorker_Factory_Impl, TransitionWorker_Factory_Impl transitionWorker_Factory_Impl, UpdateInquirySessionWorker_Factory_Impl updateInquirySessionWorker_Factory_Impl, ExchangeOneTimeCodeWorker_Factory_Impl exchangeOneTimeCodeWorker_Factory_Impl, GovernmentIdWorkflow governmentIdWorkflow, SelfieWorkflow selfieWorkflow, UiWorkflow uiWorkflow, DocumentWorkflow documentWorkflow, IntegrationWorkflow integrationWorkflow, InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, UiStepSavedStateHelper uiStepSavedStateHelper, RestoreUiStepStateWorker_Factory_Impl restoreUiStepStateWorker_Factory_Impl, FeatureFlagWorker_Factory_Impl featureFlagWorker_Factory_Impl, FeatureFlagManager featureFlagManager, TrackingEventsLogger trackingEventsLogger, TrackingMetadataProvider trackingMetadataProvider, SilentNetworkAuthenticationManager silentNetworkAuthenticationManager) {
        super(inquiryWorkflow$Props, savedStateHandle);
        WorkflowState createInquirySession;
        inquiryWorkflow$Props.getClass();
        savedStateHandle.getClass();
        createInquiryWorker_Factory_Impl.getClass();
        createInquirySessionWorker_Factory_Impl.getClass();
        pollingWorker_Factory_Impl.getClass();
        transitionBackWorker_Factory_Impl.getClass();
        transitionWorker_Factory_Impl.getClass();
        updateInquirySessionWorker_Factory_Impl.getClass();
        exchangeOneTimeCodeWorker_Factory_Impl.getClass();
        governmentIdWorkflow.getClass();
        selfieWorkflow.getClass();
        uiWorkflow.getClass();
        documentWorkflow.getClass();
        integrationWorkflow.getClass();
        inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1.getClass();
        navigationStateManager.getClass();
        externalEventLogger.getClass();
        uiStepSavedStateHelper.getClass();
        restoreUiStepStateWorker_Factory_Impl.getClass();
        featureFlagWorker_Factory_Impl.getClass();
        featureFlagManager.getClass();
        trackingEventsLogger.getClass();
        trackingMetadataProvider.getClass();
        silentNetworkAuthenticationManager.getClass();
        this.createInquiryWorker = createInquiryWorker_Factory_Impl;
        this.inquirySessionWorker = createInquirySessionWorker_Factory_Impl;
        this.pollingWorker = pollingWorker_Factory_Impl;
        this.transitionBackWorker = transitionBackWorker_Factory_Impl;
        this.transitionWorkerFactory = transitionWorker_Factory_Impl;
        this.updateInquirySessionWorkerFactory = updateInquirySessionWorker_Factory_Impl;
        this.exchangeOneTimeCodeWorkerFactory = exchangeOneTimeCodeWorker_Factory_Impl;
        this.governmentIdWorkflow = governmentIdWorkflow;
        this.selfieWorkflow = selfieWorkflow;
        this.uiWorkflow = uiWorkflow;
        this.documentWorkflow = documentWorkflow;
        this.integrationWorkflow = integrationWorkflow;
        this.externalInquiryController = inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.restoreUiStepStateWorkerFactory = restoreUiStepStateWorker_Factory_Impl;
        this.featureFlagWorkerFactory = featureFlagWorker_Factory_Impl;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.trackingMetadataProvider = trackingMetadataProvider;
        this.silentNetworkAuthenticationManager = silentNetworkAuthenticationManager;
        if (((SubtreeManager) this.lastChild).getState() == null) {
            if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.TemplateProps) {
                InquiryWorkflow$Props.TemplateProps templateProps = (InquiryWorkflow$Props.TemplateProps) inquiryWorkflow$Props;
                createInquirySession = new InquiryState.CreateInquiryFromTemplate(templateProps.templateId, templateProps.templateVersion, templateProps.accountId, templateProps.environmentId, templateProps.referenceId, templateProps.fields, templateProps.themeSetId, templateProps.staticInquiryTemplate, InquirySessionConfig.Default, templateProps.redirectUri);
            } else if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.OneTimeCodeProps) {
                createInquirySession = new InquiryState.ExchangeOneTimeCode(((InquiryWorkflow$Props.OneTimeCodeProps) inquiryWorkflow$Props).oneTimeLinkCode, InquirySessionConfig.Default);
            } else {
                if (!(inquiryWorkflow$Props instanceof InquiryWorkflow$Props.InquiryProps)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
                InquiryWorkflow$Props.InquiryProps inquiryProps = (InquiryWorkflow$Props.InquiryProps) inquiryWorkflow$Props;
                String str = inquiryProps.inquiryId;
                String str2 = inquiryProps.sessionToken;
                DisplayMetrics displayMetrics = ExtensionsKt.displayMetrics;
                str.getClass();
                createInquirySession = (!StringsKt__StringsJVMKt.startsWith(str, "iqfs", true) || str2 == null) ? (str2 == null || str2.length() == 0) ? new InquiryState.CreateInquirySession(str, (InquirySessionDataWrapper) null, 6) : new InquiryState.LoadFeatureFlagSession(str, str2, InquirySessionConfig.Default) : new InquiryState.ResumeFallbackInquiry(str, str2, InquirySessionConfig.Default);
            }
            updateState(createInquirySession);
        } else {
            InquiryState inquiryState = (InquiryState) ((SubtreeManager) this.lastChild).getState();
            if (inquiryState instanceof InquiryState.UiStepRunning) {
                updateState(InquiryState.UiStepRunning.copy$default((InquiryState.UiStepRunning) inquiryState, null, null, null, null, null, true, 786431));
            }
        }
        SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
        HCaptcha$$ExternalSyntheticLambda2 hCaptcha$$ExternalSyntheticLambda2 = new HCaptcha$$ExternalSyntheticLambda2(this, 25);
        subtreeManager.children = hCaptcha$$ExternalSyntheticLambda2;
        hCaptcha$$ExternalSyntheticLambda2.invoke(subtreeManager.getState());
    }

    public static final void handleState$onCancel(InquiryStateManager inquiryStateManager, boolean z, boolean z2) {
        InquiryState inquiryState = (InquiryState) ((SubtreeManager) inquiryStateManager.lastChild).getState();
        if (inquiryState == null) {
            return;
        }
        String inquiryId = inquiryState.getInquiryId();
        String sessionToken = inquiryState.getSessionToken();
        StepStyle styles = inquiryState.getStyles();
        NextStep.CancelDialog cancelDialog = inquiryState.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = inquiryState.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = inquiryState.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = inquiryState.getCancelDialog();
        inquiryStateManager.setOutput(new InquiryWorkflow$Output.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z, z2));
    }

    public static boolean isInconsistentStateError(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    public static InquiryState.ShowLoadingSpinner resyncState(StepState stepState) {
        return new InquiryState.ShowLoadingSpinner(stepState.getSessionToken(), stepState.getInquiryId(), stepState.getStyles(), stepState.getInquirySessionConfig());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void runTransitionWorkerIfNeeded$handleError(InquiryStateManager inquiryStateManager, InquiryState inquiryState, String str, InternalErrorInfo internalErrorInfo) {
        Collection<UiComponentError> values;
        SubtreeManager subtreeManager = (SubtreeManager) inquiryStateManager.lastChild;
        r2 = null;
        List list = null;
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if ((internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) || (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                inquiryStateManager.setErrorOutput(str, internalErrorInfo, null);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
        if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
            WorkflowState state = subtreeManager.getState();
            InquiryState.UiStepRunning uiStepRunning = state instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state : null;
            if (uiStepRunning == null) {
                return;
            }
            Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
            if (details != null && (values = details.values()) != null) {
                list = CollectionsKt.toList(values);
            }
            inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, null, list, null, false, 1015803));
            return;
        }
        if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
            if (inquiryState instanceof StepState) {
                inquiryStateManager.updateState(resyncState((StepState) inquiryState));
                return;
            } else {
                inquiryStateManager.setErrorOutput(str, internalErrorInfo, null);
                return;
            }
        }
        if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        if (!networkErrorInfo.isRecoverable()) {
            inquiryStateManager.setErrorOutput(str, internalErrorInfo, null);
            return;
        }
        WorkflowState state2 = subtreeManager.getState();
        InquiryState.UiStepRunning uiStepRunning2 = state2 instanceof InquiryState.UiStepRunning ? (InquiryState.UiStepRunning) state2 : null;
        if (uiStepRunning2 == null) {
            return;
        }
        inquiryStateManager.updateState(InquiryState.UiStepRunning.copy$default(uiStepRunning2, null, null, null, null, networkErrorInfo, false, 983035));
    }

    public final LoadingStepModel renderInquiryFromAttributes(InquiryAttributes inquiryAttributes, CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0) {
        NavigationStateManager.setState$default(this.navigationStateManager, false, false, false, 12);
        ((SubtreeManager) this.lastChild).runningWorker(new CreateInquiryWorker(inquiryAttributes, (InquiryApiHelper) this.createInquiryWorker.delegateFactory.inquiryApiHelperProvider.get()), new HCaptcha$$ExternalSyntheticLambda1(21, this, inquiryAttributes));
        return new LoadingStepModel(new VideoCapture.AnonymousClass3(null, true, cameraHelper$$ExternalSyntheticLambda0, 12));
    }

    public final void setErrorOutput(String str, InternalErrorInfo internalErrorInfo, String str2) {
        if (str2 == null) {
            internalErrorInfo.getClass();
            if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
                str2 = "Unable to find a suitable camera.";
            } else if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
                str2 = "The SDK is misconfigured.";
            } else if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
                str2 = "There was a problem reaching the server.";
            } else if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                str2 = "There was an issue with camera permissions.";
            } else if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
                str2 = "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1";
            } else if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
                str2 = "The device has no available disk space.";
            } else if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                str2 = "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.";
            } else if (internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode) {
                str2 = "Invalid one time link code.";
            } else {
                if (!(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str2 = "An otherwise unexpected error occurred.";
            }
        }
        setOutput(new InquiryWorkflow$Output.Error(str2, InquiryErrorMessagesKt.toErrorCode(internalErrorInfo), internalErrorInfo, str));
    }
}
