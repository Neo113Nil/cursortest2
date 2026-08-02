package dev.chrisbanes.haze;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.FinalizeRecordingError;
import com.withpersona.sdk2.camera.MissingAudioPermissionError;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.camera.UnsupportedDevice;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.selfie.DesignVersion;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.ui.ComponentWorkHelperKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda35;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.cache.DiskLruCache;
import papa.internal.LaunchTracker;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes9.dex */
public final /* synthetic */ class BlurEffectKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BlurEffectKt$$ExternalSyntheticLambda1(Map map, UiComponent uiComponent, UiWorkflow uiWorkflow) {
        this.$r8$classId = 12;
        this.f$0 = map;
        this.f$1 = uiComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2;
        String str = null;
        switch (this.$r8$classId) {
            case 0:
                FieldBinding$$ExternalSyntheticLambda5 fieldBinding$$ExternalSyntheticLambda5 = (FieldBinding$$ExternalSyntheticLambda5) this.f$0;
                GraphicsLayer graphicsLayer = (GraphicsLayer) this.f$1;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                fieldBinding$$ExternalSyntheticLambda5.invoke(drawScope, graphicsLayer);
                return Unit.INSTANCE;
            case 1:
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) this.f$0;
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) this.f$1;
                ((Unit) obj).getClass();
                SubtreeManager subtreeManager = (SubtreeManager) selfieStepStateManager.lastChild;
                WorkflowState state = subtreeManager.getState();
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = state instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) state : null;
                if (startCaptureFaceDetected == null) {
                    return Unit.INSTANCE;
                }
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(selfieStepStateManager.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.COUNTDOWN_STARTED, "auto", startCaptureFaceDetected.getCurrentPose().name(), null, 8, null), false, 2, null);
                boolean z = input.designVersion == DesignVersion.K0000 && startCaptureFaceDetected.getCurrentPose() == Selfie.Pose.Center && !startCaptureFaceDetected.selfies.isEmpty();
                List list = startCaptureFaceDetected.posesNeeded;
                List list2 = startCaptureFaceDetected.selfies;
                long j = startCaptureFaceDetected.startCaptureTimestamp;
                CameraProperties cameraProperties = startCaptureFaceDetected.cameraProperties;
                subtreeManager.updateState(z ? new SelfieState.Capture(startCaptureFaceDetected.poseScore, 8193, j, startCaptureFaceDetected.startSelfieTimestamp, startCaptureFaceDetected.cameraFacingMode, cameraProperties, startCaptureFaceDetected.brightnessInfo, (SelfieError) null, input.poseConfigs, MaterialAttributes.createBackState(subtreeManager, false), list2, list, startCaptureFaceDetected.autoCaptureSupported, startCaptureFaceDetected.isFlashEnabled) : new SelfieState.CountdownToCapture(j, cameraProperties, startCaptureFaceDetected.startSelfieTimestamp, startCaptureFaceDetected.poseScore, startCaptureFaceDetected.brightnessInfo, list, list2, MaterialAttributes.createBackState(subtreeManager, false), input.poseConfigs, startCaptureFaceDetected.autoCaptureSupported, startCaptureFaceDetected.cameraFacingMode, startCaptureFaceDetected.isFlashEnabled));
                return Unit.INSTANCE;
            case 2:
                SubtreeManager subtreeManager2 = (SubtreeManager) this.f$0;
                SelfieStepStateManager selfieStepStateManager2 = (SelfieStepStateManager) this.f$1;
                Throwable th = (Throwable) obj;
                th.getClass();
                SelfieState selfieState = (SelfieState) subtreeManager2.getState();
                if (selfieState == null) {
                    return Unit.INSTANCE;
                }
                if (!(th instanceof CameraError)) {
                    selfieStepStateManager2.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unexpected camera error with type ", th.getClass().getCanonicalName()))));
                    return Unit.INSTANCE;
                }
                CameraError cameraError = (CameraError) th;
                if (!(cameraError instanceof NoActiveRecordingError)) {
                    if (cameraError instanceof NoSuitableCameraError) {
                        selfieStepStateManager2.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
                    } else if (cameraError instanceof MissingAudioPermissionError) {
                        selfieStepStateManager2.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Audio recording permission is required but was not granted.")));
                    } else if (cameraError instanceof RecordingTooLongError) {
                        MaterialAttributes.deleteAllSelfies(selfieState);
                        if (SelfieWorkflowUtilsKt.useCamera(selfieState)) {
                            subtreeManager2.updateState(new SelfieState.RestartCamera(false, false, MaterialAttributes.createBackState(subtreeManager2, false), selfieState.getCameraFacingMode$selfie_release()));
                        }
                    } else if (cameraError instanceof FinalizeRecordingError) {
                        selfieStepStateManager2.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to save video capture to device.")));
                    } else if (cameraError instanceof UnsupportedDevice) {
                        selfieStepStateManager2.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
                    } else {
                        if (!(cameraError instanceof RecordingInterrupted)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        MaterialAttributes.deleteAllSelfies(selfieState);
                        if (SelfieWorkflowUtilsKt.useCamera(selfieState)) {
                            subtreeManager2.updateState(new SelfieState.RestartCamera(false, false, MaterialAttributes.createBackState(subtreeManager2, false), selfieState.getCameraFacingMode$selfie_release()));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                TextView textView = (TextView) this.f$0;
                Function1 function1 = (Function1) this.f$1;
                Typeface typeface = (Typeface) obj;
                typeface.getClass();
                textView.setTypeface(typeface);
                function1.invoke(typeface);
                return Unit.INSTANCE;
            case 4:
                UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) this.f$0;
                SheetComponent sheetComponent = (SheetComponent) this.f$1;
                UiComponent uiComponent = (UiComponent) obj;
                uiComponent.getClass();
                entryScreen.onCreateReusablePersonaClick.invoke(sheetComponent, uiComponent);
                return Unit.INSTANCE;
            case 5:
                UiScreenRunner uiScreenRunner = (UiScreenRunner) this.f$0;
                Function1 function12 = (Function1) this.f$1;
                List list3 = (List) obj;
                list3.getClass();
                Pi2InquiryUiBinding pi2InquiryUiBinding = uiScreenRunner.binding;
                ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(true);
                pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(1);
                pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(1);
                if (!list3.isEmpty()) {
                    function12.invoke(list3);
                }
                return Unit.INSTANCE;
            case 6:
                UiScreenRunner uiScreenRunner2 = (UiScreenRunner) this.f$0;
                UiScreenRunner$$ExternalSyntheticLambda35 uiScreenRunner$$ExternalSyntheticLambda35 = (UiScreenRunner$$ExternalSyntheticLambda35) this.f$1;
                List list4 = (List) obj;
                list4.getClass();
                Pi2InquiryUiBinding pi2InquiryUiBinding2 = uiScreenRunner2.binding;
                ((ImageView) pi2InquiryUiBinding2.navigationBar.binding.navBarBackButton).setEnabled(true);
                pi2InquiryUiBinding2.navigationBar.setImportantForAccessibility(1);
                pi2InquiryUiBinding2.uiStepContainer.setImportantForAccessibility(1);
                if (!list4.isEmpty()) {
                    uiScreenRunner$$ExternalSyntheticLambda35.invoke(list4);
                }
                return Unit.INSTANCE;
            case 7:
                MarkwonImpl markwonImpl = (MarkwonImpl) this.f$0;
                UiScreenRunner uiScreenRunner3 = (UiScreenRunner) this.f$1;
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                windowInsetsCompat.getClass();
                WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
                Insets insetsIgnoringVisibility = impl.getInsetsIgnoringVisibility(519);
                insetsIgnoringVisibility.getClass();
                Insets insets = impl.getInsets(8);
                insets.getClass();
                int i2 = insets.bottom;
                int i3 = insetsIgnoringVisibility.top;
                int i4 = insetsIgnoringVisibility.bottom;
                int max = Integer.max(i4, i2);
                int i5 = insetsIgnoringVisibility.left;
                int i6 = insetsIgnoringVisibility.right;
                View view = (View) markwonImpl.plugins;
                Pi2InquiryUiBinding pi2InquiryUiBinding3 = uiScreenRunner3.binding;
                if (view == null) {
                    pi2InquiryUiBinding3.nestedScroll.setPadding(i5, i3, i6, max);
                } else {
                    ShadowedNestedScrollView shadowedNestedScrollView = pi2InquiryUiBinding3.nestedScroll;
                    shadowedNestedScrollView.setPadding(i5, i3, i6, shadowedNestedScrollView.getPaddingBottom());
                    view.setPadding(i5, view.getPaddingTop(), i6, max);
                }
                MaterialDivider materialDivider = pi2InquiryUiBinding3.footerDivider;
                ViewGroup.LayoutParams layoutParams = materialDivider.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = i4;
                materialDivider.setLayoutParams(marginLayoutParams);
                CoordinatorLayout coordinatorLayout = pi2InquiryUiBinding3.footerSheetCoordinatorLayout;
                coordinatorLayout.setPadding(i5, coordinatorLayout.getPaddingTop(), i6, max);
                return Unit.INSTANCE;
            case 8:
                UiState.Displaying displaying = (UiState.Displaying) this.f$0;
                UiState.PendingAction pendingAction = (UiState.PendingAction) this.f$1;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                List list5 = displaying.components;
                CreatePersonaSheetComponent createPersonaSheetComponent = ((UiState.PendingAction.CreateReusablePersona) pendingAction).createPersonaSheetComponent;
                updater.state = UiState.Displaying.copy$default(displaying, UiComponentKt.updateComponent(list5, createPersonaSheetComponent, CreatePersonaSheetComponent.copy$default(createPersonaSheetComponent, null, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE)), null, null, null, null, null, false, null, null, null, false, null, 0, 65406);
                return Unit.INSTANCE;
            case 9:
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) this.f$0;
                UiState.Displaying displaying2 = (UiState.Displaying) this.f$1;
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.state = UiState.Displaying.copy$default(displaying2, null, null, null, new UiState.Displaying.NfcScan(governmentIdNfcScanComponent), null, null, false, null, null, null, false, null, 0, 57311);
                return Unit.INSTANCE;
            case 10:
                UiWorkflow uiWorkflow = (UiWorkflow) this.f$0;
                UiState.Displaying displaying3 = (UiState.Displaying) this.f$1;
                VerifyReusablePersonaWorker.Output output = (VerifyReusablePersonaWorker.Output) obj;
                output.getClass();
                if (output.equals(VerifyReusablePersonaWorker.Output.Complete.INSTANCE)) {
                    return Workflows.action$default(uiWorkflow, new UiWorkflow$$ExternalSyntheticLambda4(displaying3, i));
                }
                if (output instanceof VerifyReusablePersonaWorker.Output.Error) {
                    return Workflows.action$default(uiWorkflow, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(10, output, uiWorkflow, displaying3));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 11:
                UiState uiState = (UiState) this.f$0;
                HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) this.f$1;
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                UiState.Displaying displaying4 = (UiState.Displaying) uiState;
                GovernmentIdNfcScan.Attributes attributes = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).config.getAttributes();
                updater3.state = ComponentWorkHelperKt.autoSubmitState(displaying4, attributes != null ? attributes.getUnableToScanTransitionComponentName() : null);
                return Unit.INSTANCE;
            case 12:
                Map map = (Map) this.f$0;
                UiComponent uiComponent2 = (UiComponent) this.f$1;
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                Object obj2 = updater4.state;
                UiState.Displaying displaying5 = obj2 instanceof UiState.Displaying ? (UiState.Displaying) obj2 : null;
                if (displaying5 == null) {
                    return Unit.INSTANCE;
                }
                UiState.Displaying copy$default = UiState.Displaying.copy$default(displaying5, null, null, null, null, null, null, false, map, uiComponent2, null, false, null, 0, 62399);
                updater4.state = copy$default;
                UiWorkflow.outputSubmit(updater4, copy$default);
                return Unit.INSTANCE;
            case 13:
                UiState.Displaying displaying6 = (UiState.Displaying) this.f$0;
                PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) this.f$1;
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                updater5.state = ComponentWorkHelperKt.autoSubmitState(displaying6, ((PassportNfcReaderOutput.ReenterDetails) passportNfcReaderOutput).buttonComponentName);
                return Unit.INSTANCE;
            case 14:
                UiState uiState2 = (UiState) this.f$0;
                ButtonComponent buttonComponent = (ButtonComponent) this.f$1;
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                UiState.Displaying displaying7 = (UiState.Displaying) uiState2;
                Integer autoSubmitIntervalSeconds = buttonComponent.getAutoSubmitIntervalSeconds();
                autoSubmitIntervalSeconds.getClass();
                int intValue = autoSubmitIntervalSeconds.intValue();
                String autoSubmitCountdownText = buttonComponent.getAutoSubmitCountdownText();
                if (autoSubmitCountdownText != null) {
                    Integer autoSubmitIntervalSeconds2 = buttonComponent.getAutoSubmitIntervalSeconds();
                    autoSubmitIntervalSeconds2.getClass();
                    str = StringsKt__StringsJVMKt.replace$default(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()));
                }
                updater6.state = UiState.Displaying.copy$default(displaying7, null, null, null, null, new UiState.Displaying.AutoSubmit(buttonComponent, intValue, str), null, false, null, null, null, false, null, 0, 65471);
                return Unit.INSTANCE;
            case 15:
                UiState.Displaying.AutoSubmit autoSubmit = (UiState.Displaying.AutoSubmit) this.f$0;
                UiState uiState3 = (UiState) this.f$1;
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                int i7 = autoSubmit.countdown - 1;
                UiState.Displaying displaying8 = (UiState.Displaying) uiState3;
                AutoSubmitableComponent autoSubmitableComponent = autoSubmit.component;
                String autoSubmitCountdownText2 = autoSubmitableComponent.getAutoSubmitCountdownText();
                updater7.state = UiState.Displaying.copy$default(displaying8, null, null, null, null, new UiState.Displaying.AutoSubmit(autoSubmitableComponent, i7, autoSubmitCountdownText2 != null ? StringsKt__StringsJVMKt.replace$default(autoSubmitCountdownText2, "{time}", String.valueOf(i7)) : null), null, false, null, null, null, false, null, 0, 65471);
                return Unit.INSTANCE;
            case 16:
                UiStepStateManager uiStepStateManager = (UiStepStateManager) this.f$0;
                UiState uiState4 = (UiState) this.f$1;
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) obj;
                governmentIdNfcScanComponent2.getClass();
                uiStepStateManager.handleLaunchNfcScan(governmentIdNfcScanComponent2, (UiState.Displaying) uiState4);
                return Unit.INSTANCE;
            case 17:
                UiStepStateManager uiStepStateManager2 = (UiStepStateManager) this.f$0;
                UiState.Displaying displaying9 = (UiState.Displaying) this.f$1;
                VerifyReusablePersonaWorker.Output output2 = (VerifyReusablePersonaWorker.Output) obj;
                output2.getClass();
                if (output2.equals(VerifyReusablePersonaWorker.Output.Complete.INSTANCE)) {
                    uiStepStateManager2.updateState(UiState.Displaying.copy$default(displaying9, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65407));
                    uiStepStateManager2.setOutput(new UiWorkflow.Output.FinishedWithTransition());
                } else {
                    if (!(output2 instanceof VerifyReusablePersonaWorker.Output.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    uiStepStateManager2.updateState(((VerifyReusablePersonaWorker.Output.Error) output2).errorInfo instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.copy$default(displaying9, null, null, uiStepStateManager2.applicationContext.getString(R.string.pi2_network_connection_error), null, null, null, false, null, null, null, false, null, 0, 65391) : UiState.Displaying.copy$default(displaying9, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65407));
                }
                return Unit.INSTANCE;
            case 18:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) this.f$0;
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) this.f$1;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((EnumColumnAdapter) ((LaunchTracker) gpsConfigQueries.gpsConfigAdapter).appLaunchedCallback).encode((CurrencyCode) badgeQueries$VersionQuery.external_token));
                androidStatement.bindString(1, (String) ((EnumColumnAdapter) ((LaunchTracker) gpsConfigQueries.gpsConfigAdapter).lastAppBecameInvisibleRealtimeMillis).encode((CurrencyCode) badgeQueries$VersionQuery.item_type));
                return Unit.INSTANCE;
            default:
                DiskLruCache diskLruCache = (DiskLruCache) this.f$0;
                Response response = (Response) this.f$1;
                ((IOException) obj).getClass();
                synchronized (diskLruCache) {
                    response.detach$okhttp();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BlurEffectKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
