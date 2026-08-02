package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.modal.AlertScreen;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.FinalizeRecordingError;
import com.withpersona.sdk2.camera.MissingAudioPermissionError;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.RecordingTooLongError;
import com.withpersona.sdk2.camera.UnsupportedDevice;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.internal.AppUpdateDetector$Companion$$ExternalSyntheticLambda5;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieV1UtilsKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;

    public /* synthetic */ SelfieV1UtilsKt$$ExternalSyntheticLambda4(StatefulWorkflow.RenderContext renderContext, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 0;
        int i3 = 23;
        int i4 = 22;
        int i5 = 21;
        final int i6 = 1;
        final StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                CameraProperties.FacingMode facingMode = (CameraProperties.FacingMode) obj;
                facingMode.getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new ForwardingFileSystem$$ExternalSyntheticLambda0(facingMode, i6)));
                break;
            case 1:
                final PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj;
                output.getClass();
                break;
            case 2:
                final PermissionRequestWorkflow.Output output2 = (PermissionRequestWorkflow.Output) obj;
                output2.getClass();
                break;
            case 3:
                BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
                Throwable th = (Throwable) obj;
                th.getClass();
                if (!(th instanceof CameraError)) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(new AppUpdateDetector$Companion$$ExternalSyntheticLambda5(th, 2)));
                    break;
                } else {
                    CameraError cameraError = (CameraError) th;
                    if (!(cameraError instanceof NoActiveRecordingError)) {
                        if (!(cameraError instanceof NoSuitableCameraError)) {
                            if (!(cameraError instanceof MissingAudioPermissionError)) {
                                if (!(cameraError instanceof RecordingTooLongError)) {
                                    if (!(cameraError instanceof FinalizeRecordingError)) {
                                        if (!(cameraError instanceof UnsupportedDevice)) {
                                            if (!(cameraError instanceof RecordingInterrupted)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                baseRenderContext.getActionSink().send(Workflows.action$default(new AppUpdateDetector$Companion$$ExternalSyntheticLambda5(th, i6)));
                                            }
                                        } else {
                                            baseRenderContext.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(10)));
                                        }
                                    } else {
                                        baseRenderContext.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(9)));
                                    }
                                } else {
                                    baseRenderContext.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(8)));
                                }
                            } else {
                                baseRenderContext.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(7)));
                            }
                        } else {
                            baseRenderContext.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(15)));
                        }
                    }
                    break;
                }
            case 4:
                final Option option = (Option) obj;
                option.getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i7 = i6;
                        Option option2 = option;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj2;
                        switch (i7) {
                            case 0:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = obj3 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) obj3 : null;
                                if (autoClassificationManualSelect != null) {
                                    updater.state = GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect, null, option2.value, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                updater.getClass();
                                Object obj4 = updater.state;
                                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect2 = obj4 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) obj4 : null;
                                if (autoClassificationManualSelect2 != null) {
                                    updater.state = GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect2, option2.value, null, 1535);
                                    break;
                                } else {
                                    break;
                                }
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 5:
                final Option option2 = (Option) obj;
                option2.getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i7 = i2;
                        Option option22 = option2;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj2;
                        switch (i7) {
                            case 0:
                                updater.getClass();
                                Object obj3 = updater.state;
                                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = obj3 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) obj3 : null;
                                if (autoClassificationManualSelect != null) {
                                    updater.state = GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect, null, option22.value, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                updater.getClass();
                                Object obj4 = updater.state;
                                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect2 = obj4 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) obj4 : null;
                                if (autoClassificationManualSelect2 != null) {
                                    updater.state = GovernmentIdState.AutoClassificationManualSelect.copy$default(autoClassificationManualSelect2, option22.value, null, 1535);
                                    break;
                                } else {
                                    break;
                                }
                        }
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 6:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj2 = updater.state;
                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj2 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj2 : null;
                if (waitForAutocapture != null && waitForAutocapture.webRtcState != WebRtcState.Connecting) {
                    renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(i5)));
                    break;
                } else {
                    break;
                }
                break;
            case 7:
                ((AlertScreen.Event) obj).getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(i4)));
                break;
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new AppUpdateDetector$Companion$$ExternalSyntheticLambda5(th2, 3)));
                break;
            case 9:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new MoneyTabUIKt$$ExternalSyntheticLambda24(((Boolean) obj).booleanValue(), i3)));
                break;
            case 10:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11).invoke(th3);
                break;
            case 11:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                if (!(th4 instanceof CameraError)) {
                    renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new AppUpdateDetector$Companion$$ExternalSyntheticLambda5(th4, 4)));
                    break;
                } else {
                    CameraError cameraError2 = (CameraError) th4;
                    if (!(cameraError2 instanceof NoActiveRecordingError)) {
                        if (!(cameraError2 instanceof NoSuitableCameraError)) {
                            if (!(cameraError2 instanceof MissingAudioPermissionError)) {
                                if (!(cameraError2 instanceof RecordingTooLongError)) {
                                    if (!(cameraError2 instanceof FinalizeRecordingError)) {
                                        if (!(cameraError2 instanceof UnsupportedDevice)) {
                                            if (!(cameraError2 instanceof RecordingInterrupted)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(25)));
                                            }
                                        } else {
                                            renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(24)));
                                        }
                                    } else {
                                        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(i3)));
                                    }
                                } else {
                                    renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(i4)));
                                }
                            } else {
                                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(i5)));
                            }
                        } else {
                            renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(20)));
                        }
                    }
                    break;
                }
            default:
                File file = (File) obj;
                file.getClass();
                ArrayList arrayList = new ArrayList();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.CaptureMethod.MANUAL));
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new TextStreamsKt$$ExternalSyntheticLambda0(13, arrayList)));
                break;
        }
        return Unit.INSTANCE;
    }
}
