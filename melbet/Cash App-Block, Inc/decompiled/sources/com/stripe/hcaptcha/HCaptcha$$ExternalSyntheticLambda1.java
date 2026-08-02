package com.stripe.hcaptcha;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.views.AddressTypeaheadKt$SearchResults$1$1;
import com.squareup.cash.R;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.view.ActivityHost;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.FinalizeRecordingError;
import com.withpersona.sdk2.camera.MissingAudioPermissionError;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.camera.UnsupportedDevice;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.camera2.CameraDirection;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.document.CaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentUtilsKt;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquiryResult;
import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResult;
import com.withpersona.sdk2.inquiry.internal.network.ExchangeOneTimeCodeResult;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryConfigData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiFramework;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import dagger.Lazy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes9.dex */
public final /* synthetic */ class HCaptcha$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ HCaptcha$$ExternalSyntheticLambda1(GovIdCaptureRenderer govIdCaptureRenderer, SubtreeManager subtreeManager, GovernmentIdState.WaitForAutocapture waitForAutocapture, GovernmentIdWorkflow.Input input) {
        this.$r8$classId = 17;
        this.f$0 = govIdCaptureRenderer;
        this.f$1 = subtreeManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v44 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DocumentWorkflow.State.UploadState readyToSubmit;
        String string2;
        CameraChoice cameraChoice;
        CameraChoice cameraChoice2;
        InquiryConfigData inquiryConfigData;
        int i = this.$r8$classId;
        DocumentCameraWorker.Output.Cancel cancel = DocumentCameraWorker.Output.Cancel.INSTANCE;
        int i2 = 10;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                HCaptcha hCaptcha = (HCaptcha) obj3;
                String str = (String) obj;
                str.getClass();
                long j = ((HCaptchaConfig) obj2).tokenExpiration;
                Handler handler = (Handler) hCaptcha.handler;
                handler.postDelayed(new Task$$ExternalSyntheticLambda0(hCaptcha, i5), Duration.m4167getInWholeMillisecondsimpl(j));
                hCaptcha.result = new HCaptchaTokenResponse(str, handler);
                hCaptcha.tryCallbacks();
                break;
            case 1:
                DefaultReturnUrl defaultReturnUrl = (DefaultReturnUrl) obj2;
                ActivityHost activityHost = (ActivityHost) obj;
                activityHost.getClass();
                ActivityResultLauncher activityResultLauncher = ((DefaultPaymentNextActionHandlerRegistry) ((Lazy) obj3).get()).paymentBrowserAuthLauncher;
                if (activityResultLauncher != null) {
                    break;
                } else {
                    break;
                }
            case 2:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                if (!ref$BooleanRef.element) {
                    ref$IntRef.element += (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax);
                    ref$BooleanRef.element = true;
                }
                break;
            case 3:
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                BringIntoViewRequesterImpl bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) obj2;
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                if (focusStateImpl.isFocused()) {
                    JobKt.launch$default(coroutineScope, null, null, new AddressTypeaheadKt$SearchResults$1$1(bringIntoViewRequesterImpl, r8, 1), 3);
                }
                break;
            case 4:
                PhoneNumberController phoneNumberController = (PhoneNumberController) obj3;
                MutableState mutableState = (MutableState) obj2;
                FocusStateImpl focusStateImpl2 = (FocusStateImpl) obj;
                focusStateImpl2.getClass();
                if (((Boolean) mutableState.getValue()).booleanValue() != focusStateImpl2.isFocused()) {
                    boolean isFocused = focusStateImpl2.isFocused();
                    StateFlowImpl stateFlowImpl = phoneNumberController._hasFocus;
                    Boolean valueOf = Boolean.valueOf(isFocused);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, valueOf);
                }
                mutableState.setValue(Boolean.valueOf(focusStateImpl2.isFocused()));
                break;
            case 5:
                MutableState mutableState2 = (MutableState) obj3;
                SimpleTextFieldController simpleTextFieldController = (SimpleTextFieldController) obj2;
                FocusStateImpl focusStateImpl3 = (FocusStateImpl) obj;
                focusStateImpl3.getClass();
                if (((Boolean) mutableState2.getValue()).booleanValue() != focusStateImpl3.isFocused()) {
                    boolean isFocused2 = focusStateImpl3.isFocused();
                    StateFlowImpl stateFlowImpl2 = simpleTextFieldController._hasFocus;
                    Boolean valueOf2 = Boolean.valueOf(isFocused2);
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, valueOf2);
                }
                mutableState2.setValue(Boolean.valueOf(focusStateImpl3.isFocused()));
                break;
            case 6:
                final View view = (View) obj3;
                final MutableState mutableState3 = (MutableState) obj2;
                ((DisposableEffectScope) obj).getClass();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.stripe.android.uicore.navigation.KeyboardControllerKt$$ExternalSyntheticLambda2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        WindowInsetsCompat rootWindowInsets = ViewCompat.Api23Impl.getRootWindowInsets(view);
                        mutableState3.setValue(Boolean.valueOf(rootWindowInsets != null ? rootWindowInsets.mImpl.isVisible(8) : true));
                    }
                };
                view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
                break;
            case 7:
                String str2 = ((DocumentWorkflow.State.UploadState.UploadFiles) obj3).documentId;
                DocumentFileUploadWorker.Response response = (DocumentFileUploadWorker.Response) obj2;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                List<Parcelable> documents = ((DocumentWorkflow.State) updater.state).getDocuments();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(documents, 10));
                for (Parcelable parcelable : documents) {
                    DocumentFileUploadWorker.Response.Success success = (DocumentFileUploadWorker.Response.Success) response;
                    if (Intrinsics.areEqual(parcelable, success.oldLocalDocument)) {
                        parcelable = success.newRemoteDocument;
                    }
                    arrayList.add(parcelable);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                            readyToSubmit = new DocumentWorkflow.State.UploadState.UploadFiles(str2);
                            updater.state = DocumentWorkflow.State.copyWithUploadState$document_release$default((DocumentWorkflow.State) updater.state, readyToSubmit, null, arrayList, null, 10);
                            break;
                        }
                    }
                }
                readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(str2);
                updater.state = DocumentWorkflow.State.copyWithUploadState$document_release$default((DocumentWorkflow.State) updater.state, readyToSubmit, null, arrayList, null, 10);
            case 8:
                Object obj4 = (DocumentFile.Local) obj3;
                DocumentFileUploadWorker.Response response2 = (DocumentFileUploadWorker.Response) obj2;
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                List<Parcelable> documents2 = ((DocumentWorkflow.State) updater2.state).getDocuments();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(documents2, 10));
                for (Parcelable parcelable2 : documents2) {
                    if ((parcelable2 instanceof DocumentFile.Local) && parcelable2.equals(obj4)) {
                        parcelable2 = DocumentFile.Local.copy$default((DocumentFile.Local) parcelable2, ((DocumentFileUploadWorker.Response.ProgressUpdate) response2).progressPercentage);
                    }
                    arrayList2.add(parcelable2);
                }
                DocumentWorkflow.State state = (DocumentWorkflow.State) updater2.state;
                updater2.state = DocumentWorkflow.State.copyWithUploadState$document_release$default(state, state.getUploadState(), null, arrayList2, null, 10);
                break;
            case 9:
                DocumentWorkflow documentWorkflow = (DocumentWorkflow) obj3;
                DocumentWorkflow.Input input = (DocumentWorkflow.Input) obj2;
                DocumentCameraWorker.Output output = (DocumentCameraWorker.Output) obj;
                output.getClass();
                if (output instanceof DocumentCameraWorker.Output.Success) {
                    break;
                } else if (output.equals(cancel)) {
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 10:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.state = new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Collection) ((DocumentWorkflow.State) updater3.state).getDocuments(), (Object) new DocumentFile.Local(((DocumentCameraWorker.Output.Success) ((DocumentCameraWorker.Output) obj3)).absoluteFilePath, CaptureMethod.MANUAL, 0)), ((DocumentWorkflow.Input) obj2).documentFileLimit), ((DocumentWorkflow.State) updater3.state).getDocumentId(), ((DocumentWorkflow.State) updater3.state).getUploadState(), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                break;
            case 11:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.state = new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Iterable) DocumentUtilsKt.toDocumentUploadFiles(((DocumentsSelectWorker.Output.Success) ((DocumentsSelectWorker.Output) obj3)).absoluteFilePaths), (Collection) ((DocumentWorkflow.State) updater4.state).getDocuments()), ((DocumentWorkflow.Input) obj2).documentFileLimit), ((DocumentWorkflow.State) updater4.state).getDocumentId(), ((DocumentWorkflow.State) updater4.state).getUploadState(), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                break;
            case 12:
                DocumentWorkflow.Input input2 = (DocumentWorkflow.Input) obj2;
                DocumentCameraWorker.Output output2 = (DocumentCameraWorker.Output) obj;
                output2.getClass();
                SubtreeManager subtreeManager = (SubtreeManager) ((DocumentStepStateManager) obj3).lastChild;
                DocumentWorkflow.State state2 = (DocumentWorkflow.State) subtreeManager.getState();
                if (state2 == null) {
                    break;
                } else {
                    if (output2 instanceof DocumentCameraWorker.Output.Success) {
                        subtreeManager.updateState(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.take(CollectionsKt.plus((Collection) state2.getDocuments(), (Object) new DocumentFile.Local(((DocumentCameraWorker.Output.Success) output2).absoluteFilePath, CaptureMethod.MANUAL, 0)), input2.documentFileLimit), state2.getDocumentId(), state2.getUploadState(), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE));
                    } else if (!output2.equals(cancel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        subtreeManager.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                    }
                    break;
                }
            case 13:
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                ((GovernmentIdWorkflow) obj3).documentSelectWorker.openDocumentLauncher.launch(new String[]{"image/*", "application/pdf"});
                updater5.state = GovernmentIdState.ChooseCaptureMethod.copy$default((GovernmentIdState.ChooseCaptureMethod) ((GovernmentIdState) obj2), true, null, 447);
                break;
            case 14:
                Function1 function1 = (Function1) obj3;
                SubtreeManager subtreeManager2 = (SubtreeManager) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                if (th instanceof CameraError) {
                    CameraError cameraError = (CameraError) th;
                    if (!(cameraError instanceof NoActiveRecordingError)) {
                        if (cameraError instanceof NoSuitableCameraError) {
                            function1.invoke(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
                        } else if (cameraError instanceof MissingAudioPermissionError) {
                            function1.invoke(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
                        } else if (cameraError instanceof RecordingTooLongError) {
                            GovernmentIdState governmentIdState = (GovernmentIdState) subtreeManager2.getState();
                            if (governmentIdState != null) {
                                governmentIdState.deleteAllIds();
                            }
                            GovernmentIdState governmentIdState2 = (GovernmentIdState) subtreeManager2.getState();
                            subtreeManager2.updateState(new GovernmentIdState.ShowInstructions(governmentIdState2 != null ? governmentIdState2.getCountryCode$government_id_release() : null));
                        } else if (cameraError instanceof RecordingInterrupted) {
                            GovernmentIdState governmentIdState3 = (GovernmentIdState) subtreeManager2.getState();
                            if (governmentIdState3 != null) {
                                governmentIdState3.deleteAllIds();
                            }
                            if (!((RecordingInterrupted) th).isClosedDueToBadCameraConfiguration) {
                                GovernmentIdState governmentIdState4 = (GovernmentIdState) subtreeManager2.getState();
                                subtreeManager2.updateState(new GovernmentIdState.ShowInstructions(governmentIdState4 != null ? governmentIdState4.getCountryCode$government_id_release() : 0));
                            }
                        } else if (cameraError instanceof FinalizeRecordingError) {
                            function1.invoke(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                        } else if (!(cameraError instanceof UnsupportedDevice)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            function1.invoke(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                        }
                    }
                    break;
                } else {
                    function1.invoke(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unexpected camera error with type ", th.getClass().getCanonicalName()))));
                    break;
                }
            case 15:
                GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) obj3;
                SubtreeManager subtreeManager3 = (SubtreeManager) governmentIdStepStateManager.lastChild;
                Context context = governmentIdStepStateManager.applicationContext;
                GovernmentIdState governmentIdState5 = (GovernmentIdState) obj2;
                SubmitVerificationWorker.Response response3 = (SubmitVerificationWorker.Response) obj;
                response3.getClass();
                if (response3 instanceof SubmitVerificationWorker.Response.Success) {
                    governmentIdStepStateManager.updateState(GovernmentIdState.Submit.copy$default((GovernmentIdState.Submit) governmentIdState5));
                    governmentIdStepStateManager.setOutput(GovernmentIdWorkflow.Output.Finished.INSTANCE);
                } else if (response3 instanceof SubmitVerificationWorker.Response.FileUploadError) {
                    GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse = ((SubmitVerificationWorker.Response.FileUploadError) response3).cause;
                    if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                        string2 = context.getString(R.string.pi2_governmentid_error_min_dimension_size, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
                        string2.getClass();
                    } else {
                        string2 = context.getString(R.string.pi2_governmentid_error_unable_to_upload_file);
                        string2.getClass();
                    }
                    GovernmentIdState governmentIdState6 = (GovernmentIdState) subtreeManager3.getState();
                    GovernmentIdState backState$government_id_release = governmentIdState6 != null ? governmentIdState6.getBackState$government_id_release() : null;
                    if (backState$government_id_release != null) {
                        governmentIdStepStateManager.updateState(backState$government_id_release.copyWithErrorMessage$government_id_release(string2));
                    }
                } else if (!(response3 instanceof SubmitVerificationWorker.Response.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    GovernmentIdState governmentIdState7 = (GovernmentIdState) subtreeManager3.getState();
                    GovernmentIdState backState$government_id_release2 = governmentIdState7 != null ? governmentIdState7.getBackState$government_id_release() : null;
                    InternalErrorInfo internalErrorInfo = ((SubmitVerificationWorker.Response.Error) response3).cause;
                    if ((internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).isRecoverable() && backState$government_id_release2 != null) {
                        String string3 = context.getString(R.string.pi2_network_connection_error);
                        string3.getClass();
                        governmentIdStepStateManager.updateState(backState$government_id_release2.copyWithErrorMessage$government_id_release(string3));
                    } else {
                        governmentIdStepStateManager.updateState(GovernmentIdState.Submit.copy$default((GovernmentIdState.Submit) governmentIdState5));
                        governmentIdStepStateManager.setOutput(new GovernmentIdWorkflow.Output.Error(internalErrorInfo));
                    }
                }
                break;
            case 16:
                GovernmentIdState.WaitForAutocapture waitForAutocapture = (GovernmentIdState.WaitForAutocapture) obj3;
                SubtreeManager subtreeManager4 = (SubtreeManager) obj2;
                ((Unit) obj).getClass();
                if (waitForAutocapture.manualCapture == Screen.CameraScreen.ManualCapture.Hidden) {
                    subtreeManager4.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, Screen.CameraScreen.ManualCapture.Enabled, null, null, false, false, null, 32759));
                }
                break;
            case 17:
                SubtreeManager subtreeManager5 = (SubtreeManager) obj2;
                WebRtcWorker.Response response4 = (WebRtcWorker.Response) obj;
                response4.getClass();
                CameraChoices bestCameraChoices = Camera2UtilsKt.getBestCameraChoices(((GovIdCaptureRenderer) obj3).applicationContext, CameraDirection.FRONT);
                if (response4 instanceof WebRtcWorker.Response.Success) {
                    WorkflowState state3 = subtreeManager5.getState();
                    GovernmentIdState.WaitForAutocapture waitForAutocapture2 = state3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state3 : null;
                    if (waitForAutocapture2 != null && waitForAutocapture2.webRtcState == WebRtcState.Connecting) {
                        break;
                    } else {
                        if (waitForAutocapture2 != null) {
                            subtreeManager5.updateState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, WebRtcState.Connecting, null, false, false, null, 32639));
                        }
                        if (bestCameraChoices != null && (cameraChoice2 = bestCameraChoices.primaryChoice) != null) {
                            cameraChoice2.size.getWidth();
                        }
                        if (bestCameraChoices != null && (cameraChoice = bestCameraChoices.primaryChoice) != null) {
                            cameraChoice.size.getHeight();
                        }
                    }
                } else if (!(response4 instanceof WebRtcWorker.Response.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    WorkflowState state4 = subtreeManager5.getState();
                    GovernmentIdState.WaitForAutocapture waitForAutocapture3 = state4 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state4 : null;
                    if (waitForAutocapture3 == null || waitForAutocapture3.webRtcState == WebRtcState.Connecting) {
                        break;
                    } else {
                        GovernmentIdState governmentIdState8 = (GovernmentIdState) subtreeManager5.getState();
                        subtreeManager5.updateState(new GovernmentIdState.ShowInstructions(governmentIdState8 != null ? governmentIdState8.getCountryCode$government_id_release() : null));
                    }
                }
                break;
            case 18:
                ((UiComponent) obj).getClass();
                ((IntegrationWorkflow) obj3).onEvent((StatefulWorkflow.RenderContext) obj2, IntegrationWorkflow.Event.OpenBrowser.INSTANCE);
                break;
            case 19:
                InquiryStateManager inquiryStateManager = (InquiryStateManager) obj3;
                InquiryState.ExchangeOneTimeCode exchangeOneTimeCode = (InquiryState.ExchangeOneTimeCode) obj2;
                ExchangeOneTimeCodeResult exchangeOneTimeCodeResult = (ExchangeOneTimeCodeResult) obj;
                exchangeOneTimeCodeResult.getClass();
                if (exchangeOneTimeCodeResult instanceof ExchangeOneTimeCodeResult.Success) {
                    ExchangeOneTimeCodeResult.Success success2 = (ExchangeOneTimeCodeResult.Success) exchangeOneTimeCodeResult;
                    inquiryStateManager.updateState(new InquiryState.LoadFeatureFlagSession(success2.inquiryId, success2.sessionToken, success2.inquirySessionConfig));
                } else if (!(exchangeOneTimeCodeResult instanceof ExchangeOneTimeCodeResult.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    exchangeOneTimeCode.getClass();
                    inquiryStateManager.setErrorOutput(null, ((ExchangeOneTimeCodeResult.Error) exchangeOneTimeCodeResult).cause, null);
                }
                break;
            case 20:
                InquiryStateManager inquiryStateManager2 = (InquiryStateManager) obj3;
                InquiryState.CreateInquirySession createInquirySession = (InquiryState.CreateInquirySession) obj2;
                CreateInquirySessionResult createInquirySessionResult = (CreateInquirySessionResult) obj;
                createInquirySessionResult.getClass();
                if (createInquirySessionResult instanceof CreateInquirySessionResult.Success) {
                    String str3 = createInquirySession.inquiryId;
                    CreateInquirySessionResult.Success success3 = (CreateInquirySessionResult.Success) createInquirySessionResult;
                    String str4 = success3.sessionToken;
                    inquiryStateManager2.updateState(new InquiryState.LoadFeatureFlagSession(str3, str4, success3.inquirySessionConfig));
                    inquiryStateManager2.trackingEventsLogger.setSessionToken(str4);
                    ExternalEventLogger externalEventLogger = inquiryStateManager2.externalEventLogger;
                    JobKt.launch$default(externalEventLogger.coroutineScope, null, null, new TransitionWorker$run$1(externalEventLogger, new InquiryEvent.StartEvent(createInquirySession.inquiryId, StringsKt.substringAfter(str4, "Bearer ", str4)), r8, 25), 3);
                } else if (!(createInquirySessionResult instanceof CreateInquirySessionResult.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    createInquirySession.getClass();
                    inquiryStateManager2.setErrorOutput(null, ((CreateInquirySessionResult.Error) createInquirySessionResult).cause, null);
                }
                break;
            case 21:
                InquiryStateManager inquiryStateManager3 = (InquiryStateManager) obj3;
                InquiryAttributes inquiryAttributes = (InquiryAttributes) obj2;
                CreateInquiryResult createInquiryResult = (CreateInquiryResult) obj;
                createInquiryResult.getClass();
                if (createInquiryResult instanceof CreateInquiryResult.Success) {
                    CreateInquiryResult.Success success4 = (CreateInquiryResult.Success) createInquiryResult;
                    String str5 = success4.inquiryId;
                    DisplayMetrics displayMetrics = ExtensionsKt.displayMetrics;
                    str5.getClass();
                    if (StringsKt__StringsJVMKt.startsWith(str5, "iqfs", true)) {
                        inquiryStateManager3.setOutput(new InquiryWorkflow$Output.ReinitializeWithFallbackMode(str5, success4.fallbackSessionToken));
                    } else {
                        inquiryStateManager3.updateState(new InquiryState.CreateInquirySession(str5, success4.inquirySession, 2));
                    }
                } else if (!(createInquiryResult instanceof CreateInquiryResult.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    CreateInquiryResult.Error error = (CreateInquiryResult.Error) createInquiryResult;
                    inquiryStateManager3.setErrorOutput(inquiryAttributes.sessionToken, error.cause, error.debugMessage);
                }
                break;
            case 22:
                InquiryStateManager inquiryStateManager4 = (InquiryStateManager) obj3;
                TrackingEventsLogger trackingEventsLogger = inquiryStateManager4.trackingEventsLogger;
                InquiryState.LoadFeatureFlagSession loadFeatureFlagSession = (InquiryState.LoadFeatureFlagSession) obj2;
                FeatureFlagWorker.Response response5 = (FeatureFlagWorker.Response) obj;
                response5.getClass();
                if (!(response5 instanceof FeatureFlagWorker.Response.Success) && !(response5 instanceof FeatureFlagWorker.Response.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    FeatureFlagManager featureFlagManager = inquiryStateManager4.featureFlagManager;
                    TipsFeatureFlag tipsFeatureFlag = TipsFeatureFlag.INSTANCE$5;
                    featureFlagManager.getClass();
                    trackingEventsLogger.setIsEnabled(featureFlagManager.getValue(tipsFeatureFlag));
                    TrackingMetadataProvider trackingMetadataProvider = inquiryStateManager4.trackingMetadataProvider;
                    LinkedHashMap linkedHashMap = featureFlagManager.defaultFeatureFlagMap;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), Boolean.valueOf(featureFlagManager.getValue((TipsFeatureFlag) entry.getValue())));
                    }
                    trackingMetadataProvider.setFeatureFlags(linkedHashMap2);
                    UiFramework uiFramework = featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$3) ? UiFramework.PersonaWorkflow : UiFramework.SquareWorkflow;
                    InquiryWorkflow$Props inquiryWorkflow$Props = (InquiryWorkflow$Props) ((StateFlowImpl) inquiryStateManager4.firstChild).getValue();
                    inquiryWorkflow$Props.getClass();
                    uiFramework.getClass();
                    if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.TemplateProps) {
                        InquiryWorkflow$Props.TemplateProps templateProps = (InquiryWorkflow$Props.TemplateProps) inquiryWorkflow$Props;
                        String str6 = templateProps.templateId;
                        String str7 = templateProps.templateVersion;
                        String lowerCase = templateProps.environment.name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        String str8 = templateProps.environmentId;
                        String str9 = templateProps.themeSetId;
                        boolean z = templateProps.accountId != null;
                        Map map = templateProps.fields;
                        inquiryConfigData = new InquiryConfigData(str6, str7, lowerCase, str8, uiFramework, str9, Boolean.valueOf(z), Boolean.valueOf(map != null && (map.isEmpty() ^ true)), null, null, Boolean.valueOf(templateProps.redirectUri != null), Boolean.valueOf(templateProps.referenceId != null), Boolean.TRUE, Boolean.valueOf(templateProps.theme != null), 768, null);
                    } else if (inquiryWorkflow$Props instanceof InquiryWorkflow$Props.InquiryProps) {
                        InquiryWorkflow$Props.InquiryProps inquiryProps = (InquiryWorkflow$Props.InquiryProps) inquiryWorkflow$Props;
                        String lowerCase2 = inquiryProps.environment.name().toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        boolean z2 = inquiryProps.theme != null;
                        Boolean bool = Boolean.TRUE;
                        inquiryConfigData = new InquiryConfigData(null, null, lowerCase2, null, uiFramework, null, null, null, bool, null, null, null, bool, Boolean.valueOf(z2), 3819, null);
                    } else if (!(inquiryWorkflow$Props instanceof InquiryWorkflow$Props.OneTimeCodeProps)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        InquiryWorkflow$Props.OneTimeCodeProps oneTimeCodeProps = (InquiryWorkflow$Props.OneTimeCodeProps) inquiryWorkflow$Props;
                        String lowerCase3 = oneTimeCodeProps.environment.name().toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        boolean z3 = oneTimeCodeProps.theme != null;
                        Boolean bool2 = Boolean.TRUE;
                        inquiryConfigData = new InquiryConfigData(null, null, lowerCase3, null, uiFramework, null, null, null, null, bool2, null, null, bool2, Boolean.valueOf(z3), 3563, null);
                    }
                    TrackingEventsLogger.DefaultImpls.logInquiryStartEvent$default(trackingEventsLogger, inquiryConfigData, false, 2, null);
                    inquiryStateManager4.updateState(new InquiryState.ShowLoadingSpinner(loadFeatureFlagSession.sessionToken, loadFeatureFlagSession.inquiryId, null, loadFeatureFlagSession.inquirySessionConfig));
                    break;
                }
                break;
            case 23:
                InquiryStateManager inquiryStateManager5 = (InquiryStateManager) obj3;
                InquiryState.DocumentStepRunning documentStepRunning = (InquiryState.DocumentStepRunning) obj2;
                DocumentWorkflow.Output output3 = (DocumentWorkflow.Output) obj;
                output3.getClass();
                if (output3.equals(DocumentWorkflow.Output.Canceled.INSTANCE)) {
                    String str10 = documentStepRunning.inquiryId;
                    NextStep.CancelDialog cancelDialog = documentStepRunning.cancelDialog;
                    inquiryStateManager5.setOutput(new InquiryWorkflow$Output.Cancel(str10, documentStepRunning.sessionToken, documentStepRunning.styles, cancelDialog != null ? cancelDialog.getTitle() : null, cancelDialog != null ? cancelDialog.getPrompt() : null, cancelDialog != null ? cancelDialog.getBtnResume() : null, cancelDialog != null ? cancelDialog.getBtnSubmit() : null));
                } else if (output3.equals(DocumentWorkflow.Output.Back.INSTANCE)) {
                    inquiryStateManager5.updateState(InquiryState.DocumentStepRunning.copy$default(documentStepRunning, TransitionStatus.TransitioningBack.INSTANCE));
                } else if (output3 instanceof DocumentWorkflow.Output.Errored) {
                    InternalErrorInfo internalErrorInfo2 = ((DocumentWorkflow.Output.Errored) output3).cause;
                    if (InquiryStateManager.isInconsistentStateError(internalErrorInfo2)) {
                        inquiryStateManager5.updateState(InquiryStateManager.resyncState(documentStepRunning));
                    } else {
                        inquiryStateManager5.setErrorOutput(documentStepRunning.sessionToken, internalErrorInfo2, null);
                    }
                } else if (!output3.equals(DocumentWorkflow.Output.Finished.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    inquiryStateManager5.updateState(InquiryState.DocumentStepRunning.copy$default(documentStepRunning, new TransitionStatus.UpdateInquirySession(null, false)));
                }
                break;
            case 24:
                DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = (DeviceFeatureRequestWorkflow) obj3;
                DeviceFeatureRequestWorkflow.Props props = (DeviceFeatureRequestWorkflow.Props) obj2;
                DeviceFeatureRequestWorker.Output output4 = (DeviceFeatureRequestWorker.Output) obj;
                output4.getClass();
                if (output4 instanceof DeviceFeatureRequestWorker.Output.Success) {
                    break;
                } else if (output4 instanceof DeviceFeatureRequestWorker.Output.Denied) {
                    break;
                } else if (output4 instanceof DeviceFeatureRequestWorker.Output.NotSupported) {
                    Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.setFlags(268435456);
                    deviceFeatureRequestWorkflow.applicationContext.startActivity(intent);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 25:
                SelfieWorkflow.Input input3 = (SelfieWorkflow.Input) obj3;
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                updater6.state = new SelfieState.WaitForCameraFeed(SelfieWorkflowUtilsKt.createBackState(updater6, false), input3.orderedPoses, input3.poseConfigs, ((SelfieState.ReviewCaptures) obj2).cameraFacingMode);
                break;
            case 26:
                SelfieState.ShowPoseHint showPoseHint = (SelfieState.ShowPoseHint) obj3;
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                updater7.state = new SelfieState.Capture(RecyclerView.DECELERATION_RATE, 8193, System.currentTimeMillis(), showPoseHint.startSelfieTimestamp, showPoseHint.cameraFacingMode, showPoseHint.cameraProperties, (SelfieBrightnessInfo) null, (SelfieError) null, ((SelfieWorkflow.Input) obj2).poseConfigs, SelfieWorkflowUtilsKt.createBackState(updater7, false), showPoseHint.selfies, showPoseHint.posesNeeded, showPoseHint.autoCaptureSupported, showPoseHint.isFlashEnabled);
                break;
            case 27:
                SelfieWorkflow.Input input4 = (SelfieWorkflow.Input) obj3;
                WorkflowAction.Updater updater8 = (WorkflowAction.Updater) obj;
                updater8.getClass();
                updater8.state = new SelfieState.WaitForCameraFeed(SelfieWorkflowUtilsKt.createBackState(updater8, false), input4.orderedPoses, input4.poseConfigs, ((SelfieState.RestartCamera) obj2).cameraFacingMode);
                break;
            case 28:
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj3;
                SelfieState.Capture capture = (SelfieState.Capture) obj2;
                SelfieAnalyzeWorker.Output output5 = (SelfieAnalyzeWorker.Output) obj;
                output5.getClass();
                SubtreeManager subtreeManager6 = (SubtreeManager) selfieStepStateManager.lastChild;
                WorkflowState state5 = subtreeManager6.getState();
                SelfieState.Capture capture2 = state5 instanceof SelfieState.Capture ? (SelfieState.Capture) state5 : null;
                if (capture2 == null) {
                    break;
                } else {
                    if (output5 instanceof SelfieAnalyzeWorker.Output.Detected) {
                        Selfie selfie = ((SelfieAnalyzeWorker.Output.Detected) output5).selfie;
                        if (selfie != null) {
                            TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(selfieStepStateManager.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.TAKING_PHOTO, selfie.getCaptureMethod().name(), ((Selfie.Pose) CollectionsKt.first(capture2.getPosesNeeded())).name(), null, 8, null), false, 2, null);
                            subtreeManager6.updateState(selfieStepStateManager.nextState(subtreeManager6, capture, selfie));
                        } else {
                            subtreeManager6.updateState(SelfieState.Capture.copy$default(capture2, null, RecyclerView.DECELERATION_RATE, null, false, SelfieState.FlashState.FlashOn, 8191));
                        }
                    } else if (output5 instanceof SelfieAnalyzeWorker.Output.SelfieDetectionError) {
                        SelfieAnalyzeWorker.Output.SelfieDetectionError selfieDetectionError = (SelfieAnalyzeWorker.Output.SelfieDetectionError) output5;
                        SelfieError selfieError = selfieDetectionError.error;
                        SelfieError selfieError2 = SelfieError.FaceDetectionUnsupported;
                        float f = selfieDetectionError.poseScore;
                        SelfieBrightnessInfo selfieBrightnessInfo = selfieDetectionError.brightnessInfo;
                        if (selfieError == selfieError2) {
                            subtreeManager6.updateState(SelfieState.Capture.copy$default(capture2, null, f, selfieBrightnessInfo, false, null, 16313));
                        } else {
                            subtreeManager6.updateState(SelfieState.Capture.copy$default(capture2, selfieError, f, selfieBrightnessInfo, false, null, 16376));
                        }
                    } else if (!(output5 instanceof SelfieAnalyzeWorker.Output.RuntimeError)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        selfieStepStateManager.setErrorOutput(((SelfieAnalyzeWorker.Output.RuntimeError) output5).error);
                    }
                    break;
                }
            default:
                SelfieState.WaitForWebRtcSetup waitForWebRtcSetup = (SelfieState.WaitForWebRtcSetup) obj3;
                SelfieStepStateManager selfieStepStateManager2 = (SelfieStepStateManager) obj2;
                WebRtcWorker.Response response6 = (WebRtcWorker.Response) obj;
                response6.getClass();
                if (response6 instanceof WebRtcWorker.Response.Success) {
                    CameraProperties cameraProperties = waitForWebRtcSetup.cameraProperties;
                    cameraProperties.size.getWidth();
                    cameraProperties.size.getHeight();
                } else if (!(response6 instanceof WebRtcWorker.Response.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    SubtreeManager subtreeManager7 = (SubtreeManager) selfieStepStateManager2.lastChild;
                    subtreeManager7.updateState(new SelfieState.RestartCamera(false, false, MaterialAttributes.createBackState(subtreeManager7, false), waitForWebRtcSetup.cameraFacingMode));
                }
                break;
        }
        return null;
    }

    public /* synthetic */ HCaptcha$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ HCaptcha$$ExternalSyntheticLambda1(SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, SelfieStepStateManager selfieStepStateManager, SelfieWorkflow.Input input) {
        this.$r8$classId = 29;
        this.f$0 = waitForWebRtcSetup;
        this.f$1 = selfieStepStateManager;
    }
}
