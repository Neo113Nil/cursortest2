package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.math.MathUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TimerWorker;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$Selfie;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda14;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridgeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.p0;
import okio.ByteString;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class SelfieWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final Camera2Controller_Factory_Impl camera2ControllerFactory;
    public final CameraXController_Factory_Impl cameraXControllerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final p0 localVideoCaptureRenderer;
    public final NavigationStateManager navigationStateManager;
    public final PermissionRequestWorkflow permissionRequestWorkflow;
    public KClass previousStateClass;
    public final SelfieAnalyzeWorker_Factory_Impl selfieAnalyzeWorker;
    public final SubmitVerificationWorker_Factory_Impl submitVerificationWorker;
    public final TrackingEventsLogger trackingEventsLogger;
    public final WebRtcWorker.Factory webRtcWorkerFactory;

    public final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final NextStep.Selfie.AssetConfig assetConfig;
        public final boolean backStepEnabled;
        public final String cameraPermissionsModalNegativeButton;
        public final String cameraPermissionsModalPositiveButton;
        public final String cameraPermissionsRationale;
        public final String cameraPermissionsTitle;
        public final boolean cancelButtonEnabled;
        public final DesignVersion designVersion;
        public final String fieldKeySelfie;
        public final String fileUploadUrl;
        public final String flowWatermarkText;
        public final String fromComponent;
        public final String fromStep;
        public final String inquiryId;
        public final String microphonePermissionsModalNegativeButton;
        public final String microphonePermissionsModalPositiveButton;
        public final String microphonePermissionsRationale;
        public final String microphonePermissionsTitle;
        public final List orderedPoses;
        public final PendingPageTextPosition pendingPageTextVerticalPosition;
        public final PoseConfigs poseConfigs;
        public final boolean requireStrictSelfieCapture;
        public final SelfieType selfieType;
        public final String sessionToken;
        public final boolean skipPromptPage;
        public final Strings strings;
        public final StepStyles.SelfieStepStyle styles;
        public final VideoCaptureConfig videoCaptureConfig;

        public final class Creator implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                int i;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                }
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    i = z ? 1 : 0;
                    z = z2 ? 1 : 0;
                } else {
                    i = z ? 1 : 0;
                }
                boolean z5 = z2;
                if (parcel.readInt() == 0) {
                    z5 = i;
                }
                Strings createFromParcel = Strings.CREATOR.createFromParcel(parcel);
                SelfieType selfieType = (SelfieType) parcel.readParcelable(Input.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    arrayList.add(Selfie.Pose.valueOf(parcel.readString()));
                    i++;
                    readString = readString;
                }
                return new Input(readString, readString2, readString3, readString4, z4, z3, readString5, z, z5, createFromParcel, selfieType, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.SelfieStepStyle) parcel.readParcelable(Input.class.getClassLoader()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.Selfie.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), PoseConfigs.CREATOR.createFromParcel(parcel), DesignVersion.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        public final class Strings implements Parcelable {
            public static final Parcelable.Creator<Strings> CREATOR = new PoseConfigs.Creator(22);
            public final String autoCaptureOn;
            public final String cameraLoadingTitle;
            public final String capturePageTitle;
            public final String captureSuccess;
            public final String disclosure;
            public final String processingDescription;
            public final String processingTitle;
            public final String prompt;
            public final String selfieCheckPageBtnRetake;
            public final String selfieCheckPageBtnSubmit;
            public final String selfieCheckPageDescription;
            public final String selfieCheckPageLabelFront;
            public final String selfieCheckPageLabelLeft;
            public final String selfieCheckPageLabelRight;
            public final String selfieCheckPageTitle;
            public final String selfieHintAutoCaptureTimeout;
            public final String selfieHintCenterFace;
            public final String selfieHintCenterFaceDescription;
            public final String selfieHintFaceIncomplete;
            public final String selfieHintFaceTooClose;
            public final String selfieHintFaceTooFar;
            public final String selfieHintHoldStill;
            public final String selfieHintLookLeft;
            public final String selfieHintLookLeftDescription;
            public final String selfieHintLookRight;
            public final String selfieHintLookRightDescription;
            public final String selfieHintMultipleFaces;
            public final String selfieHintPoseNotCentered;
            public final String selfieHintTakePhoto;
            public final String selfieHintVerifying;
            public final String startButton;
            public final String title;

            public Strings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, str12, str13, str14, str15);
                str16.getClass();
                str17.getClass();
                this.title = str;
                this.prompt = str2;
                this.disclosure = str3;
                this.startButton = str4;
                this.capturePageTitle = str5;
                this.selfieHintTakePhoto = str6;
                this.selfieHintCenterFace = str7;
                this.selfieHintFaceTooClose = str8;
                this.selfieHintFaceTooFar = str9;
                this.selfieHintMultipleFaces = str10;
                this.selfieHintFaceIncomplete = str11;
                this.selfieHintPoseNotCentered = str12;
                this.selfieHintLookLeft = str13;
                this.selfieHintLookRight = str14;
                this.selfieHintHoldStill = str15;
                this.processingTitle = str16;
                this.processingDescription = str17;
                this.selfieCheckPageTitle = str18;
                this.selfieCheckPageDescription = str19;
                this.selfieCheckPageLabelFront = str20;
                this.selfieCheckPageLabelLeft = str21;
                this.selfieCheckPageLabelRight = str22;
                this.selfieCheckPageBtnSubmit = str23;
                this.selfieCheckPageBtnRetake = str24;
                this.autoCaptureOn = str25;
                this.captureSuccess = str26;
                this.selfieHintCenterFaceDescription = str27;
                this.selfieHintLookLeftDescription = str28;
                this.selfieHintLookRightDescription = str29;
                this.cameraLoadingTitle = str30;
                this.selfieHintVerifying = str31;
                this.selfieHintAutoCaptureTimeout = str32;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) obj;
                return Intrinsics.areEqual(this.title, strings.title) && Intrinsics.areEqual(this.prompt, strings.prompt) && Intrinsics.areEqual(this.disclosure, strings.disclosure) && Intrinsics.areEqual(this.startButton, strings.startButton) && Intrinsics.areEqual(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.areEqual(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.areEqual(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.areEqual(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.areEqual(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.areEqual(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.areEqual(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.areEqual(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.areEqual(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.areEqual(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.areEqual(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.areEqual(this.processingTitle, strings.processingTitle) && Intrinsics.areEqual(this.processingDescription, strings.processingDescription) && Intrinsics.areEqual(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.areEqual(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.areEqual(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.areEqual(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.areEqual(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.areEqual(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.areEqual(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && Intrinsics.areEqual(this.autoCaptureOn, strings.autoCaptureOn) && Intrinsics.areEqual(this.captureSuccess, strings.captureSuccess) && Intrinsics.areEqual(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && Intrinsics.areEqual(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && Intrinsics.areEqual(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && Intrinsics.areEqual(this.cameraLoadingTitle, strings.cameraLoadingTitle) && Intrinsics.areEqual(this.selfieHintVerifying, strings.selfieHintVerifying) && Intrinsics.areEqual(this.selfieHintAutoCaptureTimeout, strings.selfieHintAutoCaptureTimeout);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.prompt), 31, this.disclosure), 31, this.startButton), 31, this.capturePageTitle), 31, this.selfieHintTakePhoto), 31, this.selfieHintCenterFace), 31, this.selfieHintFaceTooClose), 31, this.selfieHintFaceTooFar), 31, this.selfieHintMultipleFaces), 31, this.selfieHintFaceIncomplete), 31, this.selfieHintPoseNotCentered), 31, this.selfieHintLookLeft), 31, this.selfieHintLookRight), 31, this.selfieHintHoldStill), 31, this.processingTitle), 31, this.processingDescription);
                String str = this.selfieCheckPageTitle;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.selfieCheckPageDescription;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.selfieCheckPageLabelFront;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.selfieCheckPageLabelLeft;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.selfieCheckPageLabelRight;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieCheckPageBtnSubmit;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.selfieCheckPageBtnRetake;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.autoCaptureOn;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.captureSuccess;
                int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.selfieHintCenterFaceDescription;
                int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.selfieHintLookLeftDescription;
                int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.selfieHintLookRightDescription;
                int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.cameraLoadingTitle;
                int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.selfieHintVerifying;
                int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.selfieHintAutoCaptureTimeout;
                return hashCode14 + (str15 != null ? str15.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Strings(title=", this.title, ", prompt=", this.prompt, ", disclosure=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.disclosure, ", startButton=", this.startButton, ", capturePageTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.capturePageTitle, ", selfieHintTakePhoto=", this.selfieHintTakePhoto, ", selfieHintCenterFace=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintCenterFace, ", selfieHintFaceTooClose=", this.selfieHintFaceTooClose, ", selfieHintFaceTooFar=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintFaceTooFar, ", selfieHintMultipleFaces=", this.selfieHintMultipleFaces, ", selfieHintFaceIncomplete=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintFaceIncomplete, ", selfieHintPoseNotCentered=", this.selfieHintPoseNotCentered, ", selfieHintLookLeft=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintLookLeft, ", selfieHintLookRight=", this.selfieHintLookRight, ", selfieHintHoldStill=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintHoldStill, ", processingTitle=", this.processingTitle, ", processingDescription=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.processingDescription, ", selfieCheckPageTitle=", this.selfieCheckPageTitle, ", selfieCheckPageDescription=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieCheckPageDescription, ", selfieCheckPageLabelFront=", this.selfieCheckPageLabelFront, ", selfieCheckPageLabelLeft=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieCheckPageLabelLeft, ", selfieCheckPageLabelRight=", this.selfieCheckPageLabelRight, ", selfieCheckPageBtnSubmit=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieCheckPageBtnSubmit, ", selfieCheckPageBtnRetake=", this.selfieCheckPageBtnRetake, ", autoCaptureOn=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.autoCaptureOn, ", captureSuccess=", this.captureSuccess, ", selfieHintCenterFaceDescription=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintCenterFaceDescription, ", selfieHintLookLeftDescription=", this.selfieHintLookLeftDescription, ", selfieHintLookRightDescription=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.selfieHintLookRightDescription, ", cameraLoadingTitle=", this.cameraLoadingTitle, ", selfieHintVerifying=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.selfieHintVerifying, ", selfieHintAutoCaptureTimeout=", this.selfieHintAutoCaptureTimeout, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.disclosure);
                parcel.writeString(this.startButton);
                parcel.writeString(this.capturePageTitle);
                parcel.writeString(this.selfieHintTakePhoto);
                parcel.writeString(this.selfieHintCenterFace);
                parcel.writeString(this.selfieHintFaceTooClose);
                parcel.writeString(this.selfieHintFaceTooFar);
                parcel.writeString(this.selfieHintMultipleFaces);
                parcel.writeString(this.selfieHintFaceIncomplete);
                parcel.writeString(this.selfieHintPoseNotCentered);
                parcel.writeString(this.selfieHintLookLeft);
                parcel.writeString(this.selfieHintLookRight);
                parcel.writeString(this.selfieHintHoldStill);
                parcel.writeString(this.processingTitle);
                parcel.writeString(this.processingDescription);
                parcel.writeString(this.selfieCheckPageTitle);
                parcel.writeString(this.selfieCheckPageDescription);
                parcel.writeString(this.selfieCheckPageLabelFront);
                parcel.writeString(this.selfieCheckPageLabelLeft);
                parcel.writeString(this.selfieCheckPageLabelRight);
                parcel.writeString(this.selfieCheckPageBtnSubmit);
                parcel.writeString(this.selfieCheckPageBtnRetake);
                parcel.writeString(this.autoCaptureOn);
                parcel.writeString(this.captureSuccess);
                parcel.writeString(this.selfieHintCenterFaceDescription);
                parcel.writeString(this.selfieHintLookLeftDescription);
                parcel.writeString(this.selfieHintLookRightDescription);
                parcel.writeString(this.cameraLoadingTitle);
                parcel.writeString(this.selfieHintVerifying);
                parcel.writeString(this.selfieHintAutoCaptureTimeout);
            }
        }

        public Input(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, Strings strings, SelfieType selfieType, List list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, StepStyles.SelfieStepStyle selfieStepStyle, VideoCaptureConfig videoCaptureConfig, NextStep.Selfie.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextPosition, PoseConfigs poseConfigs, DesignVersion designVersion, String str14, String str15) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            strings.getClass();
            selfieType.getClass();
            list.getClass();
            videoCaptureConfig.getClass();
            assetConfig.getClass();
            pendingPageTextPosition.getClass();
            poseConfigs.getClass();
            designVersion.getClass();
            this.sessionToken = str;
            this.inquiryId = str2;
            this.fromComponent = str3;
            this.fromStep = str4;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.fieldKeySelfie = str5;
            this.requireStrictSelfieCapture = z3;
            this.skipPromptPage = z4;
            this.strings = strings;
            this.selfieType = selfieType;
            this.orderedPoses = list;
            this.cameraPermissionsTitle = str6;
            this.cameraPermissionsRationale = str7;
            this.cameraPermissionsModalPositiveButton = str8;
            this.cameraPermissionsModalNegativeButton = str9;
            this.microphonePermissionsTitle = str10;
            this.microphonePermissionsRationale = str11;
            this.microphonePermissionsModalPositiveButton = str12;
            this.microphonePermissionsModalNegativeButton = str13;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.fileUploadUrl = str14;
            this.flowWatermarkText = str15;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.fromComponent, input.fromComponent) && Intrinsics.areEqual(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.areEqual(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.areEqual(this.strings, input.strings) && Intrinsics.areEqual(this.selfieType, input.selfieType) && Intrinsics.areEqual(this.orderedPoses, input.orderedPoses) && Intrinsics.areEqual(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.areEqual(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.areEqual(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.areEqual(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.areEqual(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.areEqual(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.areEqual(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.areEqual(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.areEqual(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.areEqual(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion && Intrinsics.areEqual(this.fileUploadUrl, input.fileUploadUrl) && Intrinsics.areEqual(this.flowWatermarkText, input.flowWatermarkText);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.selfieType.hashCode() + ((this.strings.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionToken.hashCode() * 31, 31, this.inquiryId), 31, this.fromComponent), 31, this.fromStep), 31, this.backStepEnabled), 31, this.cancelButtonEnabled), 31, this.fieldKeySelfie), 31, this.requireStrictSelfieCapture), 31, this.skipPromptPage)) * 31)) * 31, 31, this.orderedPoses);
            String str = this.cameraPermissionsTitle;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int hashCode9 = (this.designVersion.hashCode() + ((this.poseConfigs.poseConfigs.hashCode() + ((this.pendingPageTextVerticalPosition.hashCode() + ((this.assetConfig.hashCode() + ((this.videoCaptureConfig.hashCode() + ((hashCode8 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            String str9 = this.fileUploadUrl;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.flowWatermarkText;
            return hashCode10 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Input(sessionToken=", this.sessionToken, ", inquiryId=", this.inquiryId, ", fromComponent=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.fromComponent, ", fromStep=", this.fromStep, ", backStepEnabled=");
            re$$ExternalSyntheticOutline0.m(m, this.backStepEnabled, ", cancelButtonEnabled=", this.cancelButtonEnabled, ", fieldKeySelfie=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.fieldKeySelfie, ", requireStrictSelfieCapture=", this.requireStrictSelfieCapture, ", skipPromptPage=");
            m.append(this.skipPromptPage);
            m.append(", strings=");
            m.append(this.strings);
            m.append(", selfieType=");
            m.append(this.selfieType);
            m.append(", orderedPoses=");
            m.append(this.orderedPoses);
            m.append(", cameraPermissionsTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.cameraPermissionsTitle, ", cameraPermissionsRationale=", this.cameraPermissionsRationale, ", cameraPermissionsModalPositiveButton=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.cameraPermissionsModalPositiveButton, ", cameraPermissionsModalNegativeButton=", this.cameraPermissionsModalNegativeButton, ", microphonePermissionsTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.microphonePermissionsTitle, ", microphonePermissionsRationale=", this.microphonePermissionsRationale, ", microphonePermissionsModalPositiveButton=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.microphonePermissionsModalPositiveButton, ", microphonePermissionsModalNegativeButton=", this.microphonePermissionsModalNegativeButton, ", styles=");
            m.append(this.styles);
            m.append(", videoCaptureConfig=");
            m.append(this.videoCaptureConfig);
            m.append(", assetConfig=");
            m.append(this.assetConfig);
            m.append(", pendingPageTextVerticalPosition=");
            m.append(this.pendingPageTextVerticalPosition);
            m.append(", poseConfigs=");
            m.append(this.poseConfigs);
            m.append(", designVersion=");
            m.append(this.designVersion);
            m.append(", fileUploadUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.fileUploadUrl, ", flowWatermarkText=", this.flowWatermarkText, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.fromComponent);
            parcel.writeString(this.fromStep);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeString(this.fieldKeySelfie);
            parcel.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            parcel.writeInt(this.skipPromptPage ? 1 : 0);
            this.strings.writeToParcel(parcel, i);
            parcel.writeParcelable(this.selfieType, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.orderedPoses, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            parcel.writeString(this.cameraPermissionsTitle);
            parcel.writeString(this.cameraPermissionsRationale);
            parcel.writeString(this.cameraPermissionsModalPositiveButton);
            parcel.writeString(this.cameraPermissionsModalNegativeButton);
            parcel.writeString(this.microphonePermissionsTitle);
            parcel.writeString(this.microphonePermissionsRationale);
            parcel.writeString(this.microphonePermissionsModalPositiveButton);
            parcel.writeString(this.microphonePermissionsModalNegativeButton);
            parcel.writeParcelable(this.styles, i);
            this.videoCaptureConfig.writeToParcel(parcel, i);
            parcel.writeParcelable(this.assetConfig, i);
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeString(this.designVersion.name());
            parcel.writeString(this.fileUploadUrl);
            parcel.writeString(this.flowWatermarkText);
        }
    }

    public abstract class Output {

        public final class Back extends Output {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return 869674411;
            }

            public final String toString() {
                return Constants.META_BACK_BUTTON;
            }
        }

        public final class Canceled extends Output {
            public static final Canceled INSTANCE = new Canceled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Canceled);
            }

            public final int hashCode() {
                return 1455860573;
            }

            public final String toString() {
                return "Canceled";
            }
        }

        public final class Error extends Output {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo internalErrorInfo) {
                internalErrorInfo.getClass();
                this.cause = internalErrorInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) obj).cause);
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        public final class Finished extends Output {
            public static final Finished INSTANCE = new Finished();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finished);
            }

            public final int hashCode() {
                return 905373494;
            }

            public final String toString() {
                return "Finished";
            }
        }
    }

    public abstract class Screen {

        public final class CameraScreen extends Screen {
            public final boolean allowSwitchCamera;
            public final String autoCaptureText;
            public final SelfieBrightnessInfo brightnessInfo;
            public final Camera2Controller_Factory_Impl camera2ControllerFactory;
            public final CameraXController_Factory_Impl cameraXControllerFactory;
            public final String captureSuccessText;
            public final String description;
            public final DesignVersion designVersion;
            public final CameraProperties.FacingMode facingMode;
            public final boolean isAudioRequired;
            public final boolean isAutoCaptureOn;
            public final boolean isFlashEnabled;
            public final boolean isFlashOn;
            public final String message;
            public final zzpc mode;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function1 onCameraError;
            public final Function1 onCameraFacingModeSelected;
            public final Function0 onCancel;
            public final Function1 onFlashSet;
            public final Function0 onPermissionChanged;
            public final Selfie.Pose pose;
            public final float poseScore;
            public final String realTimeHint;
            public final boolean recordingLocallyRequired;
            public final boolean requestingPermissions;
            public final boolean requireStrictSelfieCapture;
            public final StepStyles.SelfieStepStyle styles;
            public final String title;
            public final VideoCaptureMethod videoCaptureMethod;
            public final String watermarkText;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Overlay {
                public static final /* synthetic */ Overlay[] $VALUES;
                public static final Overlay CENTER;
                public static final Overlay CLEAR;
                public static final Overlay FINALIZING;
                public static final Overlay LOOK_LEFT;
                public static final Overlay LOOK_RIGHT;

                static {
                    Overlay overlay = new Overlay("CLEAR", 0);
                    CLEAR = overlay;
                    Overlay overlay2 = new Overlay("CENTER", 1);
                    CENTER = overlay2;
                    Overlay overlay3 = new Overlay("LOOK_LEFT", 2);
                    LOOK_LEFT = overlay3;
                    Overlay overlay4 = new Overlay("LOOK_RIGHT", 3);
                    LOOK_RIGHT = overlay4;
                    Overlay overlay5 = new Overlay("FINALIZING", 4);
                    FINALIZING = overlay5;
                    $VALUES = new Overlay[]{overlay, overlay2, overlay3, overlay4, overlay5};
                }

                public static Overlay valueOf(String str) {
                    return (Overlay) Enum.valueOf(Overlay.class, str);
                }

                public static Overlay[] values() {
                    return (Overlay[]) $VALUES.clone();
                }
            }

            public CameraScreen(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, zzpc zzpcVar, StepStyles.SelfieStepStyle selfieStepStyle, boolean z2, NavigationState navigationState, Function0 function0, Function0 function02, Function1 function1, Function0 function03, VideoCaptureMethod videoCaptureMethod, boolean z3, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, Function1 function12, float f, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.FacingMode facingMode, boolean z4, boolean z5, Function1 function13, Selfie.Pose pose, boolean z6, boolean z7, boolean z8, DesignVersion designVersion, String str9) {
                navigationState.getClass();
                cameraXController_Factory_Impl.getClass();
                camera2Controller_Factory_Impl.getClass();
                facingMode.getClass();
                designVersion.getClass();
                this.title = str;
                this.message = str2;
                this.description = str3;
                this.autoCaptureText = str4;
                this.captureSuccessText = str5;
                this.realTimeHint = str6;
                this.isAutoCaptureOn = z;
                this.mode = zzpcVar;
                this.styles = selfieStepStyle;
                this.requireStrictSelfieCapture = z2;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.onCameraError = function1;
                this.onPermissionChanged = function03;
                this.videoCaptureMethod = videoCaptureMethod;
                this.isAudioRequired = z3;
                this.cameraXControllerFactory = cameraXController_Factory_Impl;
                this.camera2ControllerFactory = camera2Controller_Factory_Impl;
                this.onCameraFacingModeSelected = function12;
                this.poseScore = f;
                this.brightnessInfo = selfieBrightnessInfo;
                this.facingMode = facingMode;
                this.isFlashEnabled = z4;
                this.isFlashOn = z5;
                this.onFlashSet = function13;
                this.pose = pose;
                this.requestingPermissions = z6;
                this.recordingLocallyRequired = z7;
                this.allowSwitchCamera = z8;
                this.designVersion = designVersion;
                this.watermarkText = str9;
            }
        }

        public final class InstructionsScreen extends Screen {
            public final String disclosure;
            public final RemoteImage instructionAsset;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function0 onCancel;
            public final Function0 onClick;
            public final List orderedPoses;
            public final String prompt;
            public final SelfieType selfieType;
            public final String start;
            public final StepStyles.SelfieStepStyle styles;
            public final String title;

            public InstructionsScreen(String str, String str2, String str3, String str4, StepStyles.SelfieStepStyle selfieStepStyle, RemoteImage remoteImage, NavigationState navigationState, SelfieType selfieType, List list, Function0 function0, Function0 function02, Function0 function03) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                navigationState.getClass();
                selfieType.getClass();
                list.getClass();
                this.title = str;
                this.prompt = str2;
                this.disclosure = str3;
                this.start = str4;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.selfieType = selfieType;
                this.orderedPoses = list;
                this.onClick = function0;
                this.onBack = function02;
                this.onCancel = function03;
            }
        }

        public final class OldCameraScreen extends Screen {
            public final AssetOverrides assetOverrides;
            public final Camera2Controller_Factory_Impl camera2ControllerFactory;
            public final CameraXController_Factory_Impl cameraXControllerFactory;
            public final boolean isAudioRequired;
            public final String message;
            public final MathUtils mode;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function1 onCameraError;
            public final Function0 onCancel;
            public final Function0 onPermissionChanged;
            public final boolean recordingLocallyRequired;
            public final boolean requireStrictSelfieCapture;
            public final StepStyles.SelfieStepStyle styles;
            public final String title;
            public final VideoCaptureMethod videoCaptureMethod;
            public final String watermarkText;

            public final class AssetOverrides {
                public final RemoteImage leftPoseImage;
                public final RemoteImage rightPoseImage;

                public AssetOverrides(RemoteImage remoteImage, RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) obj;
                    return Intrinsics.areEqual(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.areEqual(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public final int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int hashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return hashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                public final String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Overlay {
                public static final /* synthetic */ Overlay[] $VALUES;
                public static final Overlay CENTER;
                public static final Overlay CENTER_COMPLETE;
                public static final Overlay CLEAR;
                public static final Overlay COMPLETE;
                public static final Overlay COMPLETE_WITH_CAPTURE;
                public static final Overlay FINALIZING;
                public static final Overlay LOOK_LEFT;
                public static final Overlay LOOK_LEFT_COMPLETE;
                public static final Overlay LOOK_LEFT_HINT;
                public static final Overlay LOOK_RIGHT;
                public static final Overlay LOOK_RIGHT_COMPLETE;
                public static final Overlay LOOK_RIGHT_HINT;

                static {
                    Overlay overlay = new Overlay("CLEAR", 0);
                    CLEAR = overlay;
                    Overlay overlay2 = new Overlay("CENTER", 1);
                    CENTER = overlay2;
                    Overlay overlay3 = new Overlay("CENTER_COMPLETE", 2);
                    CENTER_COMPLETE = overlay3;
                    Overlay overlay4 = new Overlay("LOOK_LEFT_HINT", 3);
                    LOOK_LEFT_HINT = overlay4;
                    Overlay overlay5 = new Overlay("LOOK_LEFT", 4);
                    LOOK_LEFT = overlay5;
                    Overlay overlay6 = new Overlay("LOOK_LEFT_COMPLETE", 5);
                    LOOK_LEFT_COMPLETE = overlay6;
                    Overlay overlay7 = new Overlay("LOOK_RIGHT_HINT", 6);
                    LOOK_RIGHT_HINT = overlay7;
                    Overlay overlay8 = new Overlay("LOOK_RIGHT", 7);
                    LOOK_RIGHT = overlay8;
                    Overlay overlay9 = new Overlay("LOOK_RIGHT_COMPLETE", 8);
                    LOOK_RIGHT_COMPLETE = overlay9;
                    Overlay overlay10 = new Overlay("FINALIZING", 9);
                    FINALIZING = overlay10;
                    Overlay overlay11 = new Overlay("COMPLETE_WITH_CAPTURE", 10);
                    COMPLETE_WITH_CAPTURE = overlay11;
                    Overlay overlay12 = new Overlay("COMPLETE", 11);
                    COMPLETE = overlay12;
                    $VALUES = new Overlay[]{overlay, overlay2, overlay3, overlay4, overlay5, overlay6, overlay7, overlay8, overlay9, overlay10, overlay11, overlay12};
                }

                public static Overlay valueOf(String str) {
                    return (Overlay) Enum.valueOf(Overlay.class, str);
                }

                public static Overlay[] values() {
                    return (Overlay[]) $VALUES.clone();
                }
            }

            public OldCameraScreen(String str, String str2, MathUtils mathUtils, StepStyles.SelfieStepStyle selfieStepStyle, AssetOverrides assetOverrides, boolean z, NavigationState navigationState, Function0 function0, Function0 function02, Function1 function1, Function0 function03, VideoCaptureMethod videoCaptureMethod, boolean z2, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, boolean z3, String str3) {
                navigationState.getClass();
                cameraXController_Factory_Impl.getClass();
                camera2Controller_Factory_Impl.getClass();
                this.title = str;
                this.message = str2;
                this.mode = mathUtils;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.onCameraError = function1;
                this.onPermissionChanged = function03;
                this.videoCaptureMethod = videoCaptureMethod;
                this.isAudioRequired = z2;
                this.cameraXControllerFactory = cameraXController_Factory_Impl;
                this.camera2ControllerFactory = camera2Controller_Factory_Impl;
                this.recordingLocallyRequired = z3;
                this.watermarkText = str3;
            }
        }

        public final class RestartCameraScreen extends Screen {
            public final Function0 rendered;

            public RestartCameraScreen(Function0 function0) {
                this.rendered = function0;
            }
        }

        public final class ReviewCapturesScreen extends Screen {
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function0 onCancel;
            public final Function0 onRetakePhotos;
            public final Function0 onUsePhotos;
            public final ArrayList selfies;
            public final Strings strings;
            public final StepStyles.SelfieStepStyle styles;

            public final class Strings {
                public final String description;
                public final String retakeButton;
                public final String selfieLabelFront;
                public final String selfieLabelLeft;
                public final String selfieLabelRight;
                public final String submitButton;
                public final String title;

                public Strings(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
                    str6.getClass();
                    str7.getClass();
                    this.title = str;
                    this.description = str2;
                    this.selfieLabelFront = str3;
                    this.selfieLabelLeft = str4;
                    this.selfieLabelRight = str5;
                    this.submitButton = str6;
                    this.retakeButton = str7;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) obj;
                    return Intrinsics.areEqual(this.title, strings.title) && Intrinsics.areEqual(this.description, strings.description) && Intrinsics.areEqual(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.areEqual(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.areEqual(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.areEqual(this.submitButton, strings.submitButton) && Intrinsics.areEqual(this.retakeButton, strings.retakeButton);
                }

                public final int hashCode() {
                    return this.retakeButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.selfieLabelFront), 31, this.selfieLabelLeft), 31, this.selfieLabelRight), 31, this.submitButton);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Strings(title=", this.title, ", description=", this.description, ", selfieLabelFront=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.selfieLabelFront, ", selfieLabelLeft=", this.selfieLabelLeft, ", selfieLabelRight=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.selfieLabelRight, ", submitButton=", this.submitButton, ", retakeButton=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.retakeButton, ")");
                }
            }

            public ReviewCapturesScreen(Strings strings, ArrayList arrayList, StepStyles.SelfieStepStyle selfieStepStyle, NavigationState navigationState, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
                navigationState.getClass();
                this.strings = strings;
                this.selfies = arrayList;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = function0;
                this.onRetakePhotos = function02;
                this.onBack = function03;
                this.onCancel = function04;
            }
        }

        public final class SubmittingScreen extends Screen {
            public final RemoteImage customLoadingAsset;
            public final String description;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function0 onCancel;
            public final PendingPageTextPosition pendingPageTextVerticalPosition;
            public final StepStyles.SelfieStepStyle styles;
            public final String title;

            public SubmittingScreen(String str, String str2, PendingPageTextPosition pendingPageTextPosition, StepStyles.SelfieStepStyle selfieStepStyle, NavigationState navigationState, Function0 function0, Function0 function02, RemoteImage remoteImage) {
                str.getClass();
                str2.getClass();
                pendingPageTextPosition.getClass();
                navigationState.getClass();
                this.title = str;
                this.description = str2;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.customLoadingAsset = remoteImage;
            }
        }
    }

    public SelfieWorkflow(Context context, SubmitVerificationWorker_Factory_Impl submitVerificationWorker_Factory_Impl, WebRtcWorker.Factory factory, SelfieAnalyzeWorker_Factory_Impl selfieAnalyzeWorker_Factory_Impl, PermissionRequestWorkflow permissionRequestWorkflow, p0 p0Var, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, RealCameraStatsManager realCameraStatsManager, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger) {
        Class<?> cls;
        context.getClass();
        submitVerificationWorker_Factory_Impl.getClass();
        factory.getClass();
        selfieAnalyzeWorker_Factory_Impl.getClass();
        permissionRequestWorkflow.getClass();
        p0Var.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        realCameraStatsManager.getClass();
        navigationStateManager.getClass();
        externalEventLogger.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.submitVerificationWorker = submitVerificationWorker_Factory_Impl;
        this.webRtcWorkerFactory = factory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker_Factory_Impl;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = p0Var;
        this.cameraXControllerFactory = cameraXController_Factory_Impl;
        this.camera2ControllerFactory = camera2Controller_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        Lazy lazy = WebRtcManagerBridgeKt.webRtcWrapperExists$delegate;
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            cls.newInstance();
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        Parcelable readParcelable;
        Input input = (Input) obj;
        input.getClass();
        SelfieState selfieState = null;
        if (snapshot != null) {
            ByteString bytes = snapshot.bytes();
            if (bytes.getSize$okio() <= 0) {
                bytes = null;
            }
            if (bytes == null) {
                readParcelable = null;
            } else {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                byte[] byteArray = bytes.toByteArray();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                readParcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                readParcelable.getClass();
                obtain.recycle();
            }
            SelfieState selfieState2 = (SelfieState) readParcelable;
            if (selfieState2 != null) {
                return selfieState2;
            }
        }
        return input.skipPromptPage ? new SelfieState.WaitForCameraFeed(selfieState, input.orderedPoses, input.poseConfigs, CameraProperties.FacingMode.User) : new SelfieState.ShowInstructions();
    }

    public final boolean isVideoCapture(Input input) {
        Serializable m4101isVideo0E7RQCE = input.videoCaptureConfig.m4101isVideo0E7RQCE(this.applicationContext);
        if (Result.m4120exceptionOrNullimpl(m4101isVideo0E7RQCE) == null) {
            return ((Boolean) m4101isVideo0E7RQCE).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelfieState.CaptureTransition nextState(WorkflowAction.Updater updater, SelfieState selfieState, Selfie selfie) {
        SelfieCaptureMethod selfieCaptureMethod;
        SelfieState reviewStateIfNeeded;
        SelfieState finalizeWebRtc;
        SelfieState selfieState2;
        CameraState cameraState = (CameraState) selfieState;
        SelfiePoseType selfiePoseType = SelfieWorkflowUtilsKt.toSelfiePoseType(cameraState.getCurrentPose());
        Selfie.CaptureMethod captureMethod = selfie.getCaptureMethod();
        captureMethod.getClass();
        int ordinal = captureMethod.ordinal();
        if (ordinal == 0) {
            selfieCaptureMethod = SelfieCaptureMethod.AUTO;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            selfieCaptureMethod = SelfieCaptureMethod.MANUAL;
        }
        SelfiePoseEventData selfiePoseEventData = new SelfiePoseEventData(selfiePoseType, selfieCaptureMethod, null, 4, null);
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        TrackingEventsLogger.DefaultImpls.logSelfiePoseCaptureEvent$default(trackingEventsLogger, selfiePoseEventData, false, 2, null);
        SelfieCaptureState selfieCaptureState = SelfieCaptureState.CAPTURED_PHOTO;
        String lowerCase = selfie.getCaptureMethod().name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(selfieCaptureState, lowerCase, cameraState.getCurrentPose().name(), null, 8, null), false, 2, null);
        List drop = CollectionsKt.drop(cameraState.getPosesNeeded(), 1);
        if (drop.isEmpty()) {
            if (videoCaptureMethod((Input) updater.props) == VideoCaptureMethod.Upload) {
                CaptureState captureState = (CaptureState) selfieState;
                finalizeWebRtc = new SelfieState.FinalizeLocalVideoCapture(CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), captureState.getCameraProperties(), captureState.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release());
            } else if (videoCaptureMethod((Input) updater.props) == VideoCaptureMethod.Stream) {
                CaptureState captureState2 = (CaptureState) selfieState;
                finalizeWebRtc = new SelfieState.FinalizeWebRtc(CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), captureState2.getCameraProperties(), captureState2.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release());
            } else {
                CaptureState captureState3 = (CaptureState) selfieState;
                reviewStateIfNeeded = SelfieWorkflowUtilsKt.reviewStateIfNeeded(updater, CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), null, captureState3.getCameraProperties(), captureState3.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release());
            }
            selfieState2 = finalizeWebRtc;
            return new SelfieState.CaptureTransition(selfieState2, cameraState.getCurrentPose(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release(), ((CameraState) selfieState).isFlashEnabled());
        }
        if (CollectionsKt.first(drop) == Selfie.Pose.Center) {
            CaptureState captureState4 = (CaptureState) selfieState;
            reviewStateIfNeeded = new SelfieState.StartCapture(null, RecyclerView.DECELERATION_RATE, null, drop, CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), System.currentTimeMillis(), captureState4.getStartSelfieTimestamp(), captureState4.getCameraProperties(), selfieState.getBackState$selfie_release(), ((Input) updater.props).poseConfigs, selfieState.getCameraFacingMode$selfie_release(), ((CameraState) selfieState).isFlashEnabled(), 131);
        } else {
            CameraState cameraState2 = (CameraState) selfieState;
            CaptureState captureState5 = (CaptureState) selfieState;
            reviewStateIfNeeded = new SelfieState.ShowPoseHint(CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), drop, cameraState2.getAutoCaptureSupported(), captureState5.getCameraProperties(), captureState5.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release(), ((Input) updater.props).poseConfigs, selfieState.getCameraFacingMode$selfie_release(), cameraState2.isFlashEnabled());
        }
        selfieState2 = reviewStateIfNeeded;
        return new SelfieState.CaptureTransition(selfieState2, cameraState.getCurrentPose(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release(), ((CameraState) selfieState).isFlashEnabled());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0db7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0925  */
    @Override // com.squareup.workflow1.StatefulWorkflow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Object obj, Object obj2, final StatefulWorkflow.RenderContext renderContext) {
        Object submittingScreen;
        Object oldCreateCameraScreen$default;
        boolean z;
        Screen.OldCameraScreen.Overlay overlay;
        VideoCaptureConfig videoCaptureConfig;
        SelfieState.FlashState flashState;
        String str;
        String str2;
        int ordinal;
        Screen.OldCameraScreen.Overlay overlay2;
        Screen.OldCameraScreen.Overlay overlay3;
        final StatefulWorkflow.RenderContext renderContext2;
        SelfieState.FlashState flashState2;
        boolean z2;
        SelfieState.Capture capture;
        MathUtils selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture;
        SelfieState.Capture capture2;
        Continuation continuation;
        SelfieState.FlashState flashState3;
        SelfieState.FlashState flashState4;
        Screen.OldCameraScreen.Overlay overlay4;
        final StatefulWorkflow.RenderContext renderContext3;
        int i;
        SelfieState.CountdownToManualCapture countdownToManualCapture;
        MathUtils selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown;
        final StatefulWorkflow.RenderContext renderContext4;
        SelfieState.CountdownToCapture countdownToCapture;
        String str3;
        Input input;
        final StatefulWorkflow.RenderContext renderContext5;
        final Input input2;
        String str4;
        final Input input3;
        SelfieState.StartCapture startCapture;
        StatefulWorkflow.RenderContext renderContext6;
        String str5;
        SelfieWorkflow selfieWorkflow;
        SelfieState.StartCapture startCapture2;
        Selfie.Pose pose;
        int i2;
        Screen.OldCameraScreen.Overlay overlay5;
        final SelfieWorkflow selfieWorkflow2;
        SelfieState.StartCapture startCapture3;
        final StatefulWorkflow.RenderContext renderContext7;
        MathUtils selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2;
        SelfieHintPose selfieHintPose;
        String str6;
        Screen.OldCameraScreen.Overlay overlay6;
        Object obj3;
        RemoteImage selfiePictograph;
        RemoteImage remoteImage;
        BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
        final Input input4 = (Input) obj;
        SelfieState selfieState = (SelfieState) obj2;
        input4.getClass();
        selfieState.getClass();
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(selfieState.getClass());
        int i3 = 22;
        Continuation continuation2 = null;
        if (!SelfieWorkflowUtilsKt.useCamera(selfieState)) {
            baseRenderContext.runningSideEffect("close_camera", new HazeSourceNode$launchPreDraw$1(this, continuation2, i3));
        }
        VideoCaptureConfig videoCaptureConfig2 = input4.videoCaptureConfig;
        NextStep.Selfie.AssetConfig assetConfig = input4.assetConfig;
        SelfieType selfieType = input4.selfieType;
        Input.Strings strings = input4.strings;
        Context context = this.applicationContext;
        Serializable m4101isVideo0E7RQCE = videoCaptureConfig2.m4101isVideo0E7RQCE(context);
        if (Result.m4120exceptionOrNullimpl(m4101isVideo0E7RQCE) == null) {
        } else {
            baseRenderContext.runningSideEffect("output_webrtc_error", new InquiryViewModel.AnonymousClass1(renderContext, this, continuation2, 26));
        }
        boolean z3 = selfieState instanceof SelfieState.Submit;
        NavigationStateManager navigationStateManager = this.navigationStateManager;
        NavigationStateManager.setState$default(navigationStateManager, input4.backStepEnabled, input4.cancelButtonEnabled, !z3, 8);
        SelfiePage selfiePage = MaterialAttributes.toSelfiePage(selfieState);
        this.externalEventLogger.logPageChange(new InquiryPage$Selfie(input4.fromStep, selfiePage));
        if (!Intrinsics.areEqual(this.previousStateClass, orCreateKotlinClass)) {
            TrackingEventsLogger.DefaultImpls.logInquiryPageViewEvent$default(this.trackingEventsLogger, input4.fromStep, selfiePage.toString(), false, 4, null);
            this.previousStateClass = orCreateKotlinClass;
        }
        boolean z4 = selfieState instanceof SelfieState.ShowInstructions;
        int i4 = 7;
        int i5 = 15;
        SelfieType.ConfigurablePoses configurablePoses = SelfieType.ConfigurablePoses.INSTANCE;
        if (z4) {
            SelfieState.ShowInstructions showInstructions = (SelfieState.ShowInstructions) selfieState;
            String str7 = strings.title;
            String str8 = strings.prompt;
            String str9 = strings.disclosure;
            String str10 = strings.startButton;
            NavigationState navigationState = navigationStateManager.getNavigationState();
            if (Intrinsics.areEqual(selfieType, SelfieType.CenterOnly.INSTANCE)) {
                NextStep.Selfie.AssetConfig.PromptPage promptPage = assetConfig.getPromptPage();
                if (promptPage != null) {
                    selfiePictograph = promptPage.getSelfieCenterPictograph();
                    remoteImage = selfiePictograph;
                }
                remoteImage = null;
            } else {
                if (!Intrinsics.areEqual(selfieType, SelfieType.ThreePhotos.INSTANCE) && !Intrinsics.areEqual(selfieType, configurablePoses)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                NextStep.Selfie.AssetConfig.PromptPage promptPage2 = assetConfig.getPromptPage();
                if (promptPage2 != null) {
                    selfiePictograph = promptPage2.getSelfiePictograph();
                    remoteImage = selfiePictograph;
                }
                remoteImage = null;
            }
            oldCreateCameraScreen$default = new Screen.InstructionsScreen(str7, str8, str9, str10, input4.styles, remoteImage, navigationState, input4.selfieType, input4.orderedPoses, new UiWorkflow$$ExternalSyntheticLambda25(renderContext, this, (Parcelable) input4, (Parcelable) showInstructions, 22), new SelfieWorkflow$$ExternalSyntheticLambda2(i5, renderContext, this), new SelfieWorkflow$$ExternalSyntheticLambda3(i4, renderContext, this));
        } else {
            int i6 = 11;
            final int i7 = 0;
            if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                SelfieState.WaitForWebRtcSetup waitForWebRtcSetup = (SelfieState.WaitForWebRtcSetup) selfieState;
                Workflows.runningWorker(renderContext, new WebRtcWorker(this.webRtcWorkerFactory.service, videoCaptureConfig2.webRtcJwt), Reflection.typeOf(WebRtcWorker.class), "", new UiWorkflow$$ExternalSyntheticLambda14(this, waitForWebRtcSetup, input4, renderContext, 2));
                String str11 = strings.capturePageTitle;
                Screen.OldCameraScreen.Overlay overlay7 = Screen.OldCameraScreen.Overlay.CLEAR;
                long j = videoCaptureConfig2.maxRecordingLengthMs;
                Intrinsics.areEqual(selfieType, configurablePoses);
                oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, waitForWebRtcSetup.getCurrentPose(), str11, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup(j), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(i7, renderContext, this), new SelfieWorkflow$$ExternalSyntheticLambda3(i7, renderContext, this), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, i6), new Function0(this) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                    public final /* synthetic */ SelfieWorkflow f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i8 = i7;
                        SelfieWorkflow.Input input5 = input4;
                        StatefulWorkflow.RenderContext renderContext8 = renderContext;
                        SelfieWorkflow selfieWorkflow3 = this.f$0;
                        switch (i8) {
                            case 0:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 1:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 2:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 3:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 4:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 5:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 6:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 7:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 8:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            case 9:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                            default:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, videoCaptureMethod(input4), videoCaptureConfig2.recordAudio, this.cameraXControllerFactory, this.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, waitForWebRtcSetup.cameraFacingMode, waitForWebRtcSetup.isFlashEnabled, false, false, false, 251658240);
            } else {
                int i8 = 10;
                if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                    if (selfieState instanceof SelfieState.RestartCamera) {
                        submittingScreen = new Screen.RestartCameraScreen(new UiWorkflow$$ExternalSyntheticLambda25(renderContext, this, (Parcelable) input4, selfieState, 23));
                    } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                        SelfieState.ShowPoseHint showPoseHint = (SelfieState.ShowPoseHint) selfieState;
                        int ordinal2 = ((Selfie.Pose) CollectionsKt.first(showPoseHint.posesNeeded)).ordinal();
                        if (ordinal2 == 0) {
                            a$$ExternalSyntheticBUOutline0.m$1("Pose hint cannot be shown for center pose");
                            return null;
                        }
                        if (ordinal2 == 1) {
                            selfieHintPose = SelfieHintPose.Left;
                        } else {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            selfieHintPose = SelfieHintPose.Right;
                        }
                        int ordinal3 = selfieHintPose.ordinal();
                        if (ordinal3 == 0) {
                            str6 = strings.selfieHintPoseNotCentered;
                        } else if (ordinal3 == 1) {
                            str6 = strings.selfieHintLookLeft;
                        } else {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str6 = strings.selfieHintLookRight;
                        }
                        String str12 = str6;
                        String str13 = strings.capturePageTitle;
                        int ordinal4 = selfieHintPose.ordinal();
                        if (ordinal4 == 0) {
                            overlay6 = Screen.OldCameraScreen.Overlay.CENTER;
                        } else if (ordinal4 == 1) {
                            overlay6 = Screen.OldCameraScreen.Overlay.LOOK_LEFT_HINT;
                        } else {
                            if (ordinal4 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            overlay6 = Screen.OldCameraScreen.Overlay.LOOK_RIGHT_HINT;
                        }
                        final int i9 = 2;
                        oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, showPoseHint.getCurrentPose(), str13, str12, null, showPoseHint.autoCaptureSupported, new SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint(new UiWorkflow$$ExternalSyntheticLambda25(renderContext, this, (Parcelable) showPoseHint, (Parcelable) input4, 19), overlay6, !Intrinsics.areEqual(selfieType, configurablePoses)), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(i8, renderContext, this), new SelfieWorkflow$$ExternalSyntheticLambda3(1, renderContext, this), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11), new Function0(this) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                            public final /* synthetic */ SelfieWorkflow f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i82 = i9;
                                SelfieWorkflow.Input input5 = input4;
                                StatefulWorkflow.RenderContext renderContext8 = renderContext;
                                SelfieWorkflow selfieWorkflow3 = this.f$0;
                                switch (i82) {
                                    case 0:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 1:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 2:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 3:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 4:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 5:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 6:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 7:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 8:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    case 9:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                    default:
                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, videoCaptureMethod(input4), videoCaptureConfig2.recordAudio, this.cameraXControllerFactory, this.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, showPoseHint.cameraFacingMode, showPoseHint.isFlashEnabled, false, false, false, 251658240);
                    } else {
                        boolean z5 = selfieState instanceof SelfieState.StartCapture;
                        SelfieAnalyzeWorker_Factory_Impl selfieAnalyzeWorker_Factory_Impl = this.selfieAnalyzeWorker;
                        if (z5) {
                            SelfieState.StartCapture startCapture4 = (SelfieState.StartCapture) selfieState;
                            if (MaterialColors.getCurrentPoseConfig(startCapture4).autoCaptureEnabled) {
                                SelfieAnalyzeWorker create = selfieAnalyzeWorker_Factory_Impl.create((Selfie.Pose) CollectionsKt.first(startCapture4.getPosesNeeded()), false);
                                OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(this, startCapture4, input4, renderContext, 29);
                                input3 = input4;
                                startCapture = startCapture4;
                                renderContext6 = renderContext;
                                Workflows.runningWorker(renderContext6, create, Reflection.typeOf(SelfieAnalyzeWorker.class), "", openSourceKt$$ExternalSyntheticLambda9);
                            } else {
                                input3 = input4;
                                startCapture = startCapture4;
                                renderContext6 = renderContext;
                            }
                            Selfie.Pose pose2 = (Selfie.Pose) CollectionsKt.first(startCapture.getPosesNeeded());
                            boolean manualCaptureEnabled = DateStrings.getManualCaptureEnabled(startCapture);
                            if (manualCaptureEnabled) {
                                str5 = null;
                                selfieWorkflow = this;
                                startCapture2 = startCapture;
                                pose = pose2;
                                i2 = 1;
                            } else {
                                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                ref$BooleanRef.element = true;
                                startCapture2 = startCapture;
                                pose = pose2;
                                i2 = 1;
                                Logger$log$1 logger$log$1 = new Logger$log$1(ref$BooleanRef, renderContext6, this, (Continuation) null, 22);
                                selfieWorkflow = this;
                                str5 = null;
                                baseRenderContext.runningSideEffect("check_if_manual_capture_enabled", logger$log$1);
                            }
                            int ordinal5 = pose.ordinal();
                            if (ordinal5 == 0) {
                                overlay5 = Screen.OldCameraScreen.Overlay.CENTER;
                            } else if (ordinal5 == i2) {
                                overlay5 = Screen.OldCameraScreen.Overlay.LOOK_LEFT;
                            } else {
                                if (ordinal5 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                overlay5 = Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
                            }
                            Screen.OldCameraScreen.Overlay overlay8 = overlay5;
                            SelfieError selfieError = startCapture2.selfieError;
                            String hintMessage = selfieError != null ? SelfieUtilsKt.toHintMessage(selfieError, strings, (Selfie.Pose) CollectionsKt.first(startCapture2.getPosesNeeded())) : str5;
                            String str14 = hintMessage == null ? strings.selfieHintTakePhoto : hintMessage;
                            String str15 = strings.capturePageTitle;
                            if (!manualCaptureEnabled) {
                                selfieWorkflow2 = selfieWorkflow;
                                startCapture3 = startCapture2;
                                renderContext7 = renderContext;
                                selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay8, !Intrinsics.areEqual(selfieType, configurablePoses));
                            } else if (selfieWorkflow.isVideoCapture(input3)) {
                                SelfieState.StartCapture startCapture5 = startCapture2;
                                selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown(new UiWorkflow$$ExternalSyntheticLambda25(renderContext, selfieWorkflow, (Parcelable) startCapture5, (Parcelable) input3, 20), overlay8, !Intrinsics.areEqual(selfieType, configurablePoses));
                                renderContext7 = renderContext;
                                startCapture3 = startCapture5;
                                selfieWorkflow2 = this;
                            } else {
                                renderContext7 = renderContext;
                                startCapture3 = startCapture2;
                                selfieWorkflow2 = this;
                                selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(new UiWorkflow$$ExternalSyntheticLambda14(pose, renderContext7, selfieWorkflow2, startCapture3, 1), new SelfieWorkflow$$ExternalSyntheticLambda7(1, renderContext7, selfieWorkflow2), false, overlay8, !Intrinsics.areEqual(selfieType, configurablePoses));
                            }
                            final int i10 = 3;
                            oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input3, renderContext7, (Selfie.Pose) CollectionsKt.first(startCapture3.getPosesNeeded()), str15, str14, hintMessage, startCapture3.autoCaptureSupported, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2, SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input3), input3.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(11, renderContext7, selfieWorkflow2), new SelfieWorkflow$$ExternalSyntheticLambda3(2, renderContext7, selfieWorkflow2), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext7, 11), new Function0(selfieWorkflow2) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                public final /* synthetic */ SelfieWorkflow f$0;

                                {
                                    this.f$0 = selfieWorkflow2;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i82 = i10;
                                    SelfieWorkflow.Input input5 = input3;
                                    StatefulWorkflow.RenderContext renderContext8 = renderContext7;
                                    SelfieWorkflow selfieWorkflow3 = this.f$0;
                                    switch (i82) {
                                        case 0:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 1:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 2:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 3:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 4:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 5:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 6:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 7:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 8:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        case 9:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                        default:
                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow3.applicationContext, renderContext8, input5, selfieWorkflow3.isVideoCapture(input5));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, selfieWorkflow2.videoCaptureMethod(input3), videoCaptureConfig2.recordAudio, selfieWorkflow2.cameraXControllerFactory, selfieWorkflow2.camera2ControllerFactory, startCapture3.poseScore, startCapture3.brightnessInfo, startCapture3.cameraFacingMode, startCapture3.isFlashEnabled, false, false, false, 251658240);
                        } else {
                            final SelfieWorkflow selfieWorkflow3 = this;
                            Continuation continuation3 = null;
                            if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                                if (MaterialColors.getCurrentPoseConfig(startCaptureFaceDetected).autoCaptureEnabled) {
                                    SelfieAnalyzeWorker create2 = selfieAnalyzeWorker_Factory_Impl.create(startCaptureFaceDetected.getCurrentPose(), false);
                                    renderContext5 = renderContext;
                                    str4 = "";
                                    UiWorkflow$$ExternalSyntheticLambda14 uiWorkflow$$ExternalSyntheticLambda14 = new UiWorkflow$$ExternalSyntheticLambda14(this, renderContext5, startCaptureFaceDetected, input4, 3);
                                    startCaptureFaceDetected = startCaptureFaceDetected;
                                    selfieWorkflow3 = this;
                                    input2 = input4;
                                    Workflows.runningWorker(renderContext5, create2, Reflection.typeOf(SelfieAnalyzeWorker.class), str4, uiWorkflow$$ExternalSyntheticLambda14);
                                } else {
                                    renderContext5 = renderContext;
                                    input2 = input4;
                                    str4 = "";
                                }
                                Worker.Companion.getClass();
                                TimerWorker timerWorker = new TimerWorker(1000L, str4);
                                SelfieWorkflow$$ExternalSyntheticLambda23 selfieWorkflow$$ExternalSyntheticLambda23 = new SelfieWorkflow$$ExternalSyntheticLambda23(selfieWorkflow3, input2, 0);
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType typeOf = Reflection.typeOf(Unit.class);
                                companion.getClass();
                                Workflows.runningWorker(renderContext5, timerWorker, Reflection.typeOf(Worker.class, KTypeProjection.Companion.invariant(typeOf)), str4, selfieWorkflow$$ExternalSyntheticLambda23);
                                String str16 = strings.capturePageTitle;
                                String str17 = strings.selfieHintHoldStill;
                                SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture3 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(Screen.OldCameraScreen.Overlay.CENTER, !Intrinsics.areEqual(selfieType, configurablePoses));
                                boolean z6 = input2.requireStrictSelfieCapture;
                                NavigationState navigationState2 = navigationStateManager.getNavigationState();
                                SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda4 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext5, 11);
                                VideoCaptureMethod videoCaptureMethod = selfieWorkflow3.videoCaptureMethod(input2);
                                Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input2);
                                boolean z7 = videoCaptureConfig2.recordAudio;
                                boolean z8 = startCaptureFaceDetected.autoCaptureSupported;
                                Selfie.Pose currentPose = startCaptureFaceDetected.getCurrentPose();
                                float f = startCaptureFaceDetected.poseScore;
                                SelfieBrightnessInfo selfieBrightnessInfo = startCaptureFaceDetected.brightnessInfo;
                                CameraProperties.FacingMode facingMode = startCaptureFaceDetected.cameraFacingMode;
                                boolean z9 = startCaptureFaceDetected.isFlashEnabled;
                                final int i11 = 4;
                                oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input2, renderContext5, currentPose, str16, str17, str17, z8, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture3, makeCameraScreenAssetOverrides, z6, navigationState2, new SelfieWorkflow$$ExternalSyntheticLambda2(12, renderContext5, selfieWorkflow3), new SelfieWorkflow$$ExternalSyntheticLambda3(3, renderContext5, selfieWorkflow3), selfieV1UtilsKt$$ExternalSyntheticLambda4, new Function0(selfieWorkflow3) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                    public final /* synthetic */ SelfieWorkflow f$0;

                                    {
                                        this.f$0 = selfieWorkflow3;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i82 = i11;
                                        SelfieWorkflow.Input input5 = input2;
                                        StatefulWorkflow.RenderContext renderContext8 = renderContext5;
                                        SelfieWorkflow selfieWorkflow32 = this.f$0;
                                        switch (i82) {
                                            case 0:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 1:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 2:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 3:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 4:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 5:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 6:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 7:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 8:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            case 9:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                            default:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input5, selfieWorkflow32.isVideoCapture(input5));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, videoCaptureMethod, z7, selfieWorkflow3.cameraXControllerFactory, selfieWorkflow3.camera2ControllerFactory, f, selfieBrightnessInfo, facingMode, z9, false, false, false, 251658240);
                            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                                SelfieState.CountdownToCapture countdownToCapture2 = (SelfieState.CountdownToCapture) selfieState;
                                int i12 = countdownToCapture2.countDown;
                                if (MaterialColors.getCurrentPoseConfig(countdownToCapture2).autoCaptureEnabled) {
                                    countdownToCapture = countdownToCapture2;
                                    renderContext4 = renderContext;
                                    str3 = null;
                                    input = input4;
                                    Workflows.runningWorker(renderContext4, selfieAnalyzeWorker_Factory_Impl.create(countdownToCapture2.getCurrentPose(), false), Reflection.typeOf(SelfieAnalyzeWorker.class), "", new UiWorkflow$$ExternalSyntheticLambda14(this, renderContext4, countdownToCapture, input4, 5));
                                } else {
                                    renderContext4 = renderContext;
                                    countdownToCapture = countdownToCapture2;
                                    str3 = null;
                                    input = input4;
                                }
                                SelfieState.CountdownToCapture countdownToCapture3 = countdownToCapture;
                                final Input input5 = input;
                                baseRenderContext.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i12, "countdown_"), new ContentInViewNode$launchAnimation$2(input, renderContext4, this, countdownToCapture3, (Continuation) null));
                                SelfieError selfieError2 = countdownToCapture3.selfieError;
                                String hintMessage2 = selfieError2 != null ? SelfieUtilsKt.toHintMessage(selfieError2, strings, countdownToCapture3.getCurrentPose()) : str3;
                                final int i13 = 10;
                                oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input5, renderContext4, countdownToCapture3.getCurrentPose(), strings.capturePageTitle, hintMessage2 == null ? strings.selfieHintCenterFace : hintMessage2, hintMessage2, countdownToCapture3.autoCaptureSupported, new SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown(i12, Screen.OldCameraScreen.Overlay.CENTER, !Intrinsics.areEqual(selfieType, configurablePoses)), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input5), input5.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(20, renderContext4, this), new SelfieWorkflow$$ExternalSyntheticLambda3(14, renderContext4, this), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext4, 11), new Function0(this) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                    public final /* synthetic */ SelfieWorkflow f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i82 = i13;
                                        SelfieWorkflow.Input input52 = input5;
                                        StatefulWorkflow.RenderContext renderContext8 = renderContext4;
                                        SelfieWorkflow selfieWorkflow32 = this.f$0;
                                        switch (i82) {
                                            case 0:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 1:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 2:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 3:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 4:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 5:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 6:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 7:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 8:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            case 9:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                            default:
                                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, videoCaptureMethod(input5), videoCaptureConfig2.recordAudio, this.cameraXControllerFactory, this.camera2ControllerFactory, countdownToCapture3.poseScore, countdownToCapture3.brightnessInfo, countdownToCapture3.cameraFacingMode, countdownToCapture3.isFlashEnabled, false, false, false, 251658240);
                            } else {
                                final SelfieWorkflow selfieWorkflow4 = selfieWorkflow3;
                                int i14 = 21;
                                if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                                    SelfieState.CountdownToManualCapture countdownToManualCapture2 = (SelfieState.CountdownToManualCapture) selfieState;
                                    List list = countdownToManualCapture2.posesNeeded;
                                    int i15 = countdownToManualCapture2.countDown;
                                    Selfie.Pose pose3 = (Selfie.Pose) CollectionsKt.first(list);
                                    int ordinal6 = pose3.ordinal();
                                    if (ordinal6 == 0) {
                                        overlay4 = Screen.OldCameraScreen.Overlay.CENTER;
                                    } else if (ordinal6 == 1) {
                                        overlay4 = Screen.OldCameraScreen.Overlay.LOOK_LEFT;
                                    } else {
                                        if (ordinal6 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        overlay4 = Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
                                    }
                                    Screen.OldCameraScreen.Overlay overlay9 = overlay4;
                                    baseRenderContext.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i15, "countdown_to_manual_capture_"), new SelfieWorkflow$renderCapture$2(renderContext, selfieWorkflow4, continuation3, 2));
                                    SelfieError selfieError3 = countdownToManualCapture2.selfieError;
                                    String hintMessage3 = selfieError3 != null ? SelfieUtilsKt.toHintMessage(selfieError3, strings, (Selfie.Pose) CollectionsKt.first(countdownToManualCapture2.getPosesNeeded())) : null;
                                    String str18 = hintMessage3 == null ? strings.selfieHintCenterFace : hintMessage3;
                                    String str19 = strings.capturePageTitle;
                                    if (i15 == 0) {
                                        i = 21;
                                        renderContext3 = renderContext;
                                        countdownToManualCapture = countdownToManualCapture2;
                                        UiWorkflow$$ExternalSyntheticLambda14 uiWorkflow$$ExternalSyntheticLambda142 = new UiWorkflow$$ExternalSyntheticLambda14(pose3, renderContext3, selfieWorkflow4, countdownToManualCapture, 6);
                                        selfieWorkflow4 = selfieWorkflow4;
                                        selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown = new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(uiWorkflow$$ExternalSyntheticLambda142, new SelfieWorkflow$$ExternalSyntheticLambda7(0, renderContext3, selfieWorkflow4), true, overlay9, !Intrinsics.areEqual(selfieType, configurablePoses));
                                    } else {
                                        renderContext3 = renderContext;
                                        i = 21;
                                        countdownToManualCapture = countdownToManualCapture2;
                                        selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown = new SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown(i15, overlay9, !Intrinsics.areEqual(selfieType, configurablePoses));
                                    }
                                    final int i16 = 1;
                                    oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext3, (Selfie.Pose) CollectionsKt.first(countdownToManualCapture.getPosesNeeded()), str19, str18, hintMessage3, countdownToManualCapture.autoCaptureSupported, selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown, SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(i, renderContext3, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(15, renderContext3, selfieWorkflow4), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext3, 11), new Function0(selfieWorkflow4) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                        public final /* synthetic */ SelfieWorkflow f$0;

                                        {
                                            this.f$0 = selfieWorkflow4;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i82 = i16;
                                            SelfieWorkflow.Input input52 = input4;
                                            StatefulWorkflow.RenderContext renderContext8 = renderContext3;
                                            SelfieWorkflow selfieWorkflow32 = this.f$0;
                                            switch (i82) {
                                                case 0:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 1:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 2:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 3:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 4:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 5:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 6:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 7:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 8:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 9:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                default:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, selfieWorkflow4.videoCaptureMethod(input4), videoCaptureConfig2.recordAudio, selfieWorkflow4.cameraXControllerFactory, selfieWorkflow4.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, countdownToManualCapture.cameraFacingMode, countdownToManualCapture.isFlashEnabled, false, false, false, 251658240);
                                } else if (selfieState instanceof SelfieState.Capture) {
                                    SelfieState.Capture capture3 = (SelfieState.Capture) selfieState;
                                    SelfieError selfieError4 = capture3.selfieError;
                                    SelfieState.FlashState flashState5 = capture3.flashState;
                                    Selfie.Pose pose4 = (Selfie.Pose) CollectionsKt.first(capture3.getPosesNeeded());
                                    SelfieState.FlashState flashState6 = capture3.isFlashEnabled ? flashState5 == SelfieState.FlashState.Disabled ? SelfieState.FlashState.Enabled : flashState5 : SelfieState.FlashState.Disabled;
                                    if (MaterialColors.getCurrentPoseConfig(capture3).autoCaptureEnabled) {
                                        flashState = flashState5;
                                        videoCaptureConfig = videoCaptureConfig2;
                                        Workflows.runningWorker(renderContext, selfieAnalyzeWorker_Factory_Impl.create(pose4, flashState6 == SelfieState.FlashState.Disabled || flashState6 == SelfieState.FlashState.ReadyToCapture), Reflection.typeOf(SelfieAnalyzeWorker.class), "", new SelfieWorkflow$$ExternalSyntheticLambda38(0, selfieWorkflow4, capture3, renderContext));
                                    } else {
                                        videoCaptureConfig = videoCaptureConfig2;
                                        flashState = flashState5;
                                    }
                                    String hintMessage4 = selfieError4 != null ? SelfieUtilsKt.toHintMessage(selfieError4, strings, (Selfie.Pose) CollectionsKt.first(capture3.getPosesNeeded())) : null;
                                    if (pose4 == Selfie.Pose.Left) {
                                        str2 = strings.selfieHintLookLeft;
                                    } else if (pose4 == Selfie.Pose.Right) {
                                        str2 = strings.selfieHintLookRight;
                                    } else {
                                        if (selfieError4 != null) {
                                            str = hintMessage4;
                                        } else if (pose4 == Selfie.Pose.Center) {
                                            str2 = strings.selfieHintCenterFace;
                                        } else {
                                            str = null;
                                        }
                                        ordinal = pose4.ordinal();
                                        if (ordinal != 0) {
                                            overlay2 = Screen.OldCameraScreen.Overlay.CENTER;
                                        } else if (ordinal == 1) {
                                            overlay2 = Screen.OldCameraScreen.Overlay.LOOK_LEFT;
                                        } else {
                                            if (ordinal != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            overlay2 = Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
                                        }
                                        overlay3 = overlay2;
                                        if (DateStrings.getManualCaptureEnabled(capture3) || flashState6 == SelfieState.FlashState.FlashOn || flashState6 == SelfieState.FlashState.ReadyToCapture) {
                                            renderContext2 = renderContext;
                                            flashState2 = flashState6;
                                            z2 = true;
                                            capture = capture3;
                                            selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                        } else {
                                            flashState2 = flashState6;
                                            renderContext2 = renderContext;
                                            capture = capture3;
                                            UiWorkflow$$ExternalSyntheticLambda14 uiWorkflow$$ExternalSyntheticLambda143 = new UiWorkflow$$ExternalSyntheticLambda14(pose4, renderContext2, selfieWorkflow4, capture, 4);
                                            selfieWorkflow4 = selfieWorkflow4;
                                            selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(uiWorkflow$$ExternalSyntheticLambda143, new SelfieWorkflow$$ExternalSyntheticLambda7(2, renderContext2, selfieWorkflow4), false, overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                            z2 = true;
                                        }
                                        if (DateStrings.getManualCaptureEnabled(capture)) {
                                            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                            ref$BooleanRef2.element = z2;
                                            capture2 = capture;
                                            continuation = null;
                                            Logger$log$1 logger$log$12 = new Logger$log$1(ref$BooleanRef2, renderContext2, this, continuation, 22);
                                            selfieWorkflow4 = this;
                                            baseRenderContext.runningSideEffect("check_if_manual_capture_enabled", logger$log$12);
                                        } else {
                                            capture2 = capture;
                                            continuation = null;
                                        }
                                        flashState3 = SelfieState.FlashState.FlashOn;
                                        if (flashState2 == flashState3) {
                                            baseRenderContext.runningSideEffect("wait_to_capture_with_flash_on", new SelfieWorkflow$renderCapture$2(renderContext2, selfieWorkflow4, continuation, 0));
                                        }
                                        flashState4 = SelfieState.FlashState.ReadyToCapture;
                                        if (flashState2 == flashState4) {
                                            baseRenderContext.runningSideEffect("turn_off_flash", new SelfieWorkflow$renderCapture$2(renderContext2, selfieWorkflow4, continuation, 1));
                                        }
                                        SelfieState.FlashState flashState7 = flashState;
                                        VideoCaptureMethod videoCaptureMethod2 = selfieWorkflow4.videoCaptureMethod(input4);
                                        String str20 = strings.capturePageTitle;
                                        boolean z10 = input4.requireStrictSelfieCapture;
                                        NavigationState navigationState3 = navigationStateManager.getNavigationState();
                                        SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda42 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 11);
                                        String str21 = str;
                                        Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides2 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4);
                                        boolean z11 = videoCaptureConfig.recordAudio;
                                        String str22 = hintMessage4;
                                        boolean z12 = capture2.autoCaptureSupported;
                                        Selfie.Pose pose5 = (Selfie.Pose) CollectionsKt.first(capture2.getPosesNeeded());
                                        float f2 = capture2.poseScore;
                                        SelfieBrightnessInfo selfieBrightnessInfo2 = capture2.brightnessInfo;
                                        CameraProperties.FacingMode facingMode2 = capture2.cameraFacingMode;
                                        boolean z13 = capture2.isFlashEnabled;
                                        boolean z14 = flashState7 != flashState3 || flashState7 == flashState4;
                                        boolean z15 = selfieWorkflow4.videoCaptureMethod(input4) != VideoCaptureMethod.Upload;
                                        final int i17 = 6;
                                        oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext2, pose5, str20, str21, str22, z12, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture, makeCameraScreenAssetOverrides2, z10, navigationState3, new SelfieWorkflow$$ExternalSyntheticLambda2(16, renderContext2, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(8, renderContext2, selfieWorkflow4), selfieV1UtilsKt$$ExternalSyntheticLambda42, new Function0(selfieWorkflow4) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                            public final /* synthetic */ SelfieWorkflow f$0;

                                            {
                                                this.f$0 = selfieWorkflow4;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i17;
                                                SelfieWorkflow.Input input52 = input4;
                                                StatefulWorkflow.RenderContext renderContext8 = renderContext2;
                                                SelfieWorkflow selfieWorkflow32 = this.f$0;
                                                switch (i82) {
                                                    case 0:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 1:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 2:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 3:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 4:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 5:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 6:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 7:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 8:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 9:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    default:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, videoCaptureMethod2, z11, selfieWorkflow4.cameraXControllerFactory, selfieWorkflow4.camera2ControllerFactory, f2, selfieBrightnessInfo2, facingMode2, z13, z14, false, z15, 33554432);
                                    }
                                    str = str2;
                                    ordinal = pose4.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    overlay3 = overlay2;
                                    if (DateStrings.getManualCaptureEnabled(capture3)) {
                                    }
                                    renderContext2 = renderContext;
                                    flashState2 = flashState6;
                                    z2 = true;
                                    capture = capture3;
                                    selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                    if (DateStrings.getManualCaptureEnabled(capture)) {
                                    }
                                    flashState3 = SelfieState.FlashState.FlashOn;
                                    if (flashState2 == flashState3) {
                                    }
                                    flashState4 = SelfieState.FlashState.ReadyToCapture;
                                    if (flashState2 == flashState4) {
                                    }
                                    SelfieState.FlashState flashState72 = flashState;
                                    VideoCaptureMethod videoCaptureMethod22 = selfieWorkflow4.videoCaptureMethod(input4);
                                    String str202 = strings.capturePageTitle;
                                    boolean z102 = input4.requireStrictSelfieCapture;
                                    NavigationState navigationState32 = navigationStateManager.getNavigationState();
                                    SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda422 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 11);
                                    String str212 = str;
                                    Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides22 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4);
                                    boolean z112 = videoCaptureConfig.recordAudio;
                                    String str222 = hintMessage4;
                                    boolean z122 = capture2.autoCaptureSupported;
                                    Selfie.Pose pose52 = (Selfie.Pose) CollectionsKt.first(capture2.getPosesNeeded());
                                    float f22 = capture2.poseScore;
                                    SelfieBrightnessInfo selfieBrightnessInfo22 = capture2.brightnessInfo;
                                    CameraProperties.FacingMode facingMode22 = capture2.cameraFacingMode;
                                    boolean z132 = capture2.isFlashEnabled;
                                    if (flashState72 != flashState3) {
                                    }
                                    if (selfieWorkflow4.videoCaptureMethod(input4) != VideoCaptureMethod.Upload) {
                                    }
                                    final int i172 = 6;
                                    oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext2, pose52, str202, str212, str222, z122, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture, makeCameraScreenAssetOverrides22, z102, navigationState32, new SelfieWorkflow$$ExternalSyntheticLambda2(16, renderContext2, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(8, renderContext2, selfieWorkflow4), selfieV1UtilsKt$$ExternalSyntheticLambda422, new Function0(selfieWorkflow4) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                        public final /* synthetic */ SelfieWorkflow f$0;

                                        {
                                            this.f$0 = selfieWorkflow4;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i82 = i172;
                                            SelfieWorkflow.Input input52 = input4;
                                            StatefulWorkflow.RenderContext renderContext8 = renderContext2;
                                            SelfieWorkflow selfieWorkflow32 = this.f$0;
                                            switch (i82) {
                                                case 0:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 1:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 2:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 3:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 4:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 5:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 6:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 7:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 8:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                case 9:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                                default:
                                                    SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, videoCaptureMethod22, z112, selfieWorkflow4.cameraXControllerFactory, selfieWorkflow4.camera2ControllerFactory, f22, selfieBrightnessInfo22, facingMode22, z132, z14, false, z15, 33554432);
                                } else {
                                    Continuation continuation4 = null;
                                    if (selfieState instanceof SelfieState.CaptureTransition) {
                                        SelfieState.CaptureTransition captureTransition = (SelfieState.CaptureTransition) selfieState;
                                        String str23 = strings.capturePageTitle;
                                        if (captureTransition.nextState instanceof SelfieState.Submit) {
                                            overlay = Screen.OldCameraScreen.Overlay.COMPLETE_WITH_CAPTURE;
                                            z = true;
                                        } else {
                                            int ordinal7 = captureTransition.completedPose.ordinal();
                                            if (ordinal7 != 0) {
                                                z = true;
                                                if (ordinal7 == 1) {
                                                    overlay = Screen.OldCameraScreen.Overlay.LOOK_LEFT_COMPLETE;
                                                } else {
                                                    if (ordinal7 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    overlay = Screen.OldCameraScreen.Overlay.LOOK_RIGHT_COMPLETE;
                                                }
                                            } else {
                                                z = true;
                                                overlay = Screen.OldCameraScreen.Overlay.CENTER_COMPLETE;
                                            }
                                        }
                                        final int i18 = 5;
                                        oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, null, str23, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(new SelfieWorkflow$$ExternalSyntheticLambda3(renderContext, selfieWorkflow4), z, overlay, Intrinsics.areEqual(selfieType, configurablePoses) ^ z), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(13, renderContext, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(i18, renderContext, selfieWorkflow4), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11), new Function0(selfieWorkflow4) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                            public final /* synthetic */ SelfieWorkflow f$0;

                                            {
                                                this.f$0 = selfieWorkflow4;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i18;
                                                SelfieWorkflow.Input input52 = input4;
                                                StatefulWorkflow.RenderContext renderContext8 = renderContext;
                                                SelfieWorkflow selfieWorkflow32 = this.f$0;
                                                switch (i82) {
                                                    case 0:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 1:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 2:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 3:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 4:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 5:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 6:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 7:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 8:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    case 9:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                    default:
                                                        SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, selfieWorkflow4.videoCaptureMethod(input4), videoCaptureConfig2.recordAudio, selfieWorkflow4.cameraXControllerFactory, selfieWorkflow4.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, captureTransition.cameraFacingMode, captureTransition.isFlashOn, false, false, false, 251658240);
                                    } else {
                                        int i19 = 18;
                                        if (selfieState instanceof SelfieState.FinalizeLocalVideoCapture) {
                                            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (SelfieState.FinalizeLocalVideoCapture) selfieState;
                                            p0 p0Var = selfieWorkflow4.localVideoCaptureRenderer;
                                            p0Var.getClass();
                                            int i20 = 23;
                                            baseRenderContext.runningSideEffect("finalize_delay", new TransitionWorker$run$1(finalizeLocalVideoCapture, renderContext, continuation4, i20));
                                            oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, null, null, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture(new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 12), new StateFlowsKt$$ExternalSyntheticLambda2(i19, renderContext, finalizeLocalVideoCapture), finalizeLocalVideoCapture.isDelayComplete, finalizeLocalVideoCapture.isFinalizeComplete ? Screen.OldCameraScreen.Overlay.COMPLETE : Screen.OldCameraScreen.Overlay.FINALIZING, !Intrinsics.areEqual(selfieType, configurablePoses)), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, ((NavigationStateManager) p0Var.d).getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext, 22), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext, i20), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11), new UiScreenRunner$$ExternalSyntheticLambda29(i14, p0Var, renderContext, input4), VideoCaptureMethod.Upload, videoCaptureConfig2.recordAudio, (CameraXController_Factory_Impl) p0Var.b, (Camera2Controller_Factory_Impl) p0Var.c, RecyclerView.DECELERATION_RATE, null, finalizeLocalVideoCapture.cameraFacingMode, false, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.FinalizeWebRtc) {
                                            final int i21 = 8;
                                            oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, null, strings.capturePageTitle, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(new ShimmerThemeKt$$ExternalSyntheticLambda0(i14), false, Screen.OldCameraScreen.Overlay.FINALIZING, !Intrinsics.areEqual(selfieType, configurablePoses)), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(i19, renderContext, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(10, renderContext, selfieWorkflow4), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11), new Function0(selfieWorkflow4) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                                public final /* synthetic */ SelfieWorkflow f$0;

                                                {
                                                    this.f$0 = selfieWorkflow4;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i82 = i21;
                                                    SelfieWorkflow.Input input52 = input4;
                                                    StatefulWorkflow.RenderContext renderContext8 = renderContext;
                                                    SelfieWorkflow selfieWorkflow32 = this.f$0;
                                                    switch (i82) {
                                                        case 0:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 1:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 2:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 3:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 4:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 5:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 6:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 7:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 8:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 9:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        default:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, selfieWorkflow4.videoCaptureMethod(input4), videoCaptureConfig2.recordAudio, selfieWorkflow4.cameraXControllerFactory, selfieWorkflow4.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, ((SelfieState.FinalizeWebRtc) selfieState).cameraFacingMode, false, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.WebRtcFinished) {
                                            SelfieState.WebRtcFinished webRtcFinished = (SelfieState.WebRtcFinished) selfieState;
                                            final int i22 = 7;
                                            oldCreateCameraScreen$default = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, null, strings.capturePageTitle, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(new UiScreenRunner$$ExternalSyntheticLambda29(13, renderContext, selfieWorkflow4, webRtcFinished), false, Screen.OldCameraScreen.Overlay.COMPLETE, !Intrinsics.areEqual(selfieType, configurablePoses)), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4), input4.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(17, renderContext, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(9, renderContext, selfieWorkflow4), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11), new Function0(selfieWorkflow4) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                                                public final /* synthetic */ SelfieWorkflow f$0;

                                                {
                                                    this.f$0 = selfieWorkflow4;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i82 = i22;
                                                    SelfieWorkflow.Input input52 = input4;
                                                    StatefulWorkflow.RenderContext renderContext8 = renderContext;
                                                    SelfieWorkflow selfieWorkflow32 = this.f$0;
                                                    switch (i82) {
                                                        case 0:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 1:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 2:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 3:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 4:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 5:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 6:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 7:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 8:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        case 9:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                        default:
                                                            SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, selfieWorkflow4.videoCaptureMethod(input4), videoCaptureConfig2.recordAudio, selfieWorkflow4.cameraXControllerFactory, selfieWorkflow4.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, webRtcFinished.cameraFacingMode, false, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.ReviewCaptures) {
                                            SelfieState.ReviewCaptures reviewCaptures = (SelfieState.ReviewCaptures) selfieState;
                                            String str24 = strings.selfieCheckPageTitle;
                                            if (str24 == null) {
                                                str24 = context.getString(R.string.pi2_selfie_check_page_title);
                                                str24.getClass();
                                            }
                                            String str25 = str24;
                                            String str26 = strings.selfieCheckPageDescription;
                                            if (str26 == null) {
                                                str26 = context.getString(R.string.pi2_selfie_check_page_description);
                                                str26.getClass();
                                            }
                                            String str27 = str26;
                                            String str28 = strings.selfieCheckPageLabelFront;
                                            if (str28 == null) {
                                                str28 = context.getString(R.string.pi2_selfie_check_page_label_front);
                                                str28.getClass();
                                            }
                                            String str29 = str28;
                                            String str30 = strings.selfieCheckPageLabelLeft;
                                            if (str30 == null) {
                                                str30 = context.getString(R.string.pi2_selfie_check_page_label_left);
                                                str30.getClass();
                                            }
                                            String str31 = str30;
                                            String str32 = strings.selfieCheckPageLabelRight;
                                            if (str32 == null) {
                                                str32 = context.getString(R.string.pi2_selfie_check_page_label_right);
                                                str32.getClass();
                                            }
                                            String str33 = str32;
                                            String str34 = strings.selfieCheckPageBtnSubmit;
                                            if (str34 == null) {
                                                str34 = context.getString(R.string.pi2_selfie_check_page_label_btn_submit);
                                                str34.getClass();
                                            }
                                            String str35 = str34;
                                            String str36 = strings.selfieCheckPageBtnRetake;
                                            if (str36 == null) {
                                                str36 = context.getString(R.string.pi2_selfie_check_page_label_btn_retake);
                                                str36.getClass();
                                            }
                                            submittingScreen = new Screen.ReviewCapturesScreen(new Screen.ReviewCapturesScreen.Strings(str25, str27, str29, str31, str33, str35, str36), reviewCaptures.selfiesToReview, input4.styles, navigationStateManager.getNavigationState(), new UiScreenRunner$$ExternalSyntheticLambda29(12, renderContext, selfieWorkflow4, reviewCaptures), new UiWorkflow$$ExternalSyntheticLambda25(renderContext, selfieWorkflow4, (Parcelable) input4, (Parcelable) reviewCaptures, 21), new SelfieWorkflow$$ExternalSyntheticLambda2(14, renderContext, selfieWorkflow4), new SelfieWorkflow$$ExternalSyntheticLambda3(6, renderContext, selfieWorkflow4));
                                        } else {
                                            if (!z3) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            SelfieState.Submit submit = (SelfieState.Submit) selfieState;
                                            Workflows.runningWorker(renderContext, selfieWorkflow4.submitVerificationWorker.create(input4.sessionToken, input4.inquiryId, input4.fromComponent, input4.fromStep, input4.selfieType, input4.fieldKeySelfie, submit.selfies, submit.webRtcObjectId, submit.cameraProperties, submit.startSelfieTimestamp, input4.fileUploadUrl), Reflection.typeOf(SubmitVerificationWorker.class), "", new SelfieWorkflow$$ExternalSyntheticLambda7(3, renderContext, selfieWorkflow4));
                                            NavigationStateManager.setState$default(navigationStateManager, false, false, false, 12);
                                            String str37 = strings.processingTitle;
                                            String str38 = strings.processingDescription;
                                            PendingPageTextPosition pendingPageTextPosition = input4.pendingPageTextVerticalPosition;
                                            StepStyles.SelfieStepStyle selfieStepStyle = input4.styles;
                                            NavigationState navigationState4 = navigationStateManager.getNavigationState();
                                            SelfieWorkflow$$ExternalSyntheticLambda3 selfieWorkflow$$ExternalSyntheticLambda3 = new SelfieWorkflow$$ExternalSyntheticLambda3(11, renderContext, selfieWorkflow4);
                                            SelfieWorkflow$$ExternalSyntheticLambda3 selfieWorkflow$$ExternalSyntheticLambda32 = new SelfieWorkflow$$ExternalSyntheticLambda3(12, renderContext, selfieWorkflow4);
                                            NextStep.Selfie.AssetConfig.RecordPage recordPage = assetConfig.getRecordPage();
                                            submittingScreen = new Screen.SubmittingScreen(str37, str38, pendingPageTextPosition, selfieStepStyle, navigationState4, selfieWorkflow$$ExternalSyntheticLambda3, selfieWorkflow$$ExternalSyntheticLambda32, recordPage != null ? recordPage.getLoadingPictograph() : null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return !(submittingScreen instanceof Screen.OldCameraScreen) ? new ModalContainerScreen(submittingScreen, "PermissionFlowModal", EmptyList.INSTANCE) : submittingScreen;
                }
                final SelfieState.WaitForCameraFeed waitForCameraFeed = (SelfieState.WaitForCameraFeed) selfieState;
                boolean z16 = (waitForCameraFeed.hasRequestedCameraPermissions || PermissionsStateKt.hasPermission(context, Permission.Camera)) ? false : true;
                boolean z17 = !waitForCameraFeed.hasRequestedAudioPermissions && isVideoCapture(input4) && ContextUtilsKt.isMicPresent(context) && videoCaptureConfig2.recordAudio && !PermissionsStateKt.hasPermission(context, Permission.RecordAudio);
                long currentTimeMillis = System.currentTimeMillis();
                String str39 = strings.capturePageTitle;
                BadgeQueries$$ExternalSyntheticLambda3 badgeQueries$$ExternalSyntheticLambda3 = new BadgeQueries$$ExternalSyntheticLambda3(renderContext, this, input4, waitForCameraFeed, currentTimeMillis, 5);
                Screen.OldCameraScreen.Overlay overlay10 = Screen.OldCameraScreen.Overlay.CLEAR;
                SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable = new SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable(badgeQueries$$ExternalSyntheticLambda3, !Intrinsics.areEqual(selfieType, configurablePoses), videoCaptureMethod(input4) == VideoCaptureMethod.Upload, videoCaptureConfig2.maxRecordingLengthMs, new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, i8));
                boolean z18 = input4.requireStrictSelfieCapture;
                NavigationState navigationState5 = navigationStateManager.getNavigationState();
                SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda43 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext, 11);
                VideoCaptureMethod videoCaptureMethod3 = videoCaptureMethod(input4);
                Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides3 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input4);
                final int i23 = 9;
                Screen oldCreateCameraScreen$default2 = SelfieV1UtilsKt.oldCreateCameraScreen$default(input4, renderContext, null, str39, null, null, false, selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable, makeCameraScreenAssetOverrides3, z18, navigationState5, new SelfieWorkflow$$ExternalSyntheticLambda2(19, renderContext, this), new SelfieWorkflow$$ExternalSyntheticLambda3(13, renderContext, this), selfieV1UtilsKt$$ExternalSyntheticLambda43, new Function0(this) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda4
                    public final /* synthetic */ SelfieWorkflow f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i82 = i23;
                        SelfieWorkflow.Input input52 = input4;
                        StatefulWorkflow.RenderContext renderContext8 = renderContext;
                        SelfieWorkflow selfieWorkflow32 = this.f$0;
                        switch (i82) {
                            case 0:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 1:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 2:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 3:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 4:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 5:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 6:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 7:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 8:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            case 9:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                            default:
                                SelfieWorkflowUtilsKt.handlePermissionChanged(selfieWorkflow32.applicationContext, renderContext8, input52, selfieWorkflow32.isVideoCapture(input52));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, videoCaptureMethod3, videoCaptureConfig2.recordAudio, this.cameraXControllerFactory, this.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, waitForCameraFeed.cameraFacingMode, waitForCameraFeed.isFlashEnabled, false, z16 || z17, false, 218103808);
                if (z16) {
                    Permission permission = Permission.Camera;
                    String str40 = input4.cameraPermissionsTitle;
                    String str41 = str40 != null ? str40 : "";
                    String str42 = input4.cameraPermissionsRationale;
                    if (str42 == null) {
                        str42 = context.getString(R.string.pi2_selfie_camera_permission_rationale);
                        str42.getClass();
                    }
                    String string2 = context.getString(R.string.pi2_selfie_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                    string2.getClass();
                    final int i24 = 0;
                    obj3 = PermissionsStateKt.withRequestPermissionsIfNeeded(oldCreateCameraScreen$default2, renderContext, true, permission, false, str41, str42, string2, input4.cameraPermissionsModalPositiveButton, input4.cameraPermissionsModalNegativeButton, null, null, null, this.permissionRequestWorkflow, input4.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1(this) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda60
                        public final /* synthetic */ SelfieWorkflow f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i24) {
                                case 0:
                                    final PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj4;
                                    output.getClass();
                                    final int i25 = 0;
                                    final SelfieState.WaitForCameraFeed waitForCameraFeed2 = waitForCameraFeed;
                                    final SelfieWorkflow.Input input6 = input4;
                                    final SelfieWorkflow selfieWorkflow5 = this.f$0;
                                    final StatefulWorkflow.RenderContext renderContext8 = renderContext;
                                    return Workflows.action$default(selfieWorkflow5, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda70
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            int i26 = i25;
                                            SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
                                            StatefulWorkflow.RenderContext renderContext9 = renderContext8;
                                            SelfieWorkflow selfieWorkflow6 = selfieWorkflow5;
                                            SelfieWorkflow.Input input7 = input6;
                                            SelfieState.WaitForCameraFeed waitForCameraFeed3 = waitForCameraFeed2;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj5;
                                            switch (i26) {
                                                case 0:
                                                    updater.getClass();
                                                    if (output2.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed3, true, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                                    } else if (!input7.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input7.backStepEnabled) {
                                                        selfieWorkflow6.setOutputForWorkflow(renderContext9, back);
                                                    } else {
                                                        selfieWorkflow6.setOutputForWorkflow(renderContext9, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    if (output2.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed3, false, true, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                                    } else if (!input7.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input7.backStepEnabled) {
                                                        selfieWorkflow6.setOutputForWorkflow(renderContext9, back);
                                                    } else {
                                                        selfieWorkflow6.setOutputForWorkflow(renderContext9, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                default:
                                    final PermissionRequestWorkflow.Output output2 = (PermissionRequestWorkflow.Output) obj4;
                                    output2.getClass();
                                    final int i26 = 1;
                                    final SelfieState.WaitForCameraFeed waitForCameraFeed3 = waitForCameraFeed;
                                    final SelfieWorkflow.Input input7 = input4;
                                    final SelfieWorkflow selfieWorkflow6 = this.f$0;
                                    final StatefulWorkflow.RenderContext renderContext9 = renderContext;
                                    return Workflows.action$default(selfieWorkflow6, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda70
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            int i262 = i26;
                                            SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
                                            StatefulWorkflow.RenderContext renderContext92 = renderContext9;
                                            SelfieWorkflow selfieWorkflow62 = selfieWorkflow6;
                                            SelfieWorkflow.Input input72 = input7;
                                            SelfieState.WaitForCameraFeed waitForCameraFeed32 = waitForCameraFeed3;
                                            PermissionRequestWorkflow.Output output22 = output2;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj5;
                                            switch (i262) {
                                                case 0:
                                                    updater.getClass();
                                                    if (output22.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed32, true, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                                    } else if (!input72.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input72.backStepEnabled) {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, back);
                                                    } else {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    if (output22.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed32, false, true, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                                    } else if (!input72.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input72.backStepEnabled) {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, back);
                                                    } else {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                            }
                        }
                    });
                } else if (z17) {
                    Permission permission2 = Permission.RecordAudio;
                    String str43 = input4.microphonePermissionsRationale;
                    if (str43 == null) {
                        str43 = context.getString(R.string.pi2_selfie_mic_permission_rationale);
                        str43.getClass();
                    }
                    String str44 = str43;
                    String string3 = context.getString(R.string.pi2_selfie_mic_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                    string3.getClass();
                    String str45 = input4.microphonePermissionsModalPositiveButton;
                    String str46 = input4.microphonePermissionsModalNegativeButton;
                    String str47 = input4.microphonePermissionsTitle;
                    final int i25 = 1;
                    obj3 = PermissionsStateKt.withRequestPermissionsIfNeeded(oldCreateCameraScreen$default2, renderContext, true, permission2, false, str47 != null ? str47 : "", str44, string3, str45, str46, null, null, null, this.permissionRequestWorkflow, input4.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1(this) { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda60
                        public final /* synthetic */ SelfieWorkflow f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i25) {
                                case 0:
                                    final PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj4;
                                    output.getClass();
                                    final int i252 = 0;
                                    final SelfieState.WaitForCameraFeed waitForCameraFeed2 = waitForCameraFeed;
                                    final SelfieWorkflow.Input input6 = input4;
                                    final SelfieWorkflow selfieWorkflow5 = this.f$0;
                                    final StatefulWorkflow.RenderContext renderContext8 = renderContext;
                                    return Workflows.action$default(selfieWorkflow5, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda70
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            int i262 = i252;
                                            SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
                                            StatefulWorkflow.RenderContext renderContext92 = renderContext8;
                                            SelfieWorkflow selfieWorkflow62 = selfieWorkflow5;
                                            SelfieWorkflow.Input input72 = input6;
                                            SelfieState.WaitForCameraFeed waitForCameraFeed32 = waitForCameraFeed2;
                                            PermissionRequestWorkflow.Output output22 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj5;
                                            switch (i262) {
                                                case 0:
                                                    updater.getClass();
                                                    if (output22.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed32, true, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                                    } else if (!input72.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input72.backStepEnabled) {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, back);
                                                    } else {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    if (output22.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed32, false, true, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                                    } else if (!input72.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input72.backStepEnabled) {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, back);
                                                    } else {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                default:
                                    final PermissionRequestWorkflow.Output output2 = (PermissionRequestWorkflow.Output) obj4;
                                    output2.getClass();
                                    final int i26 = 1;
                                    final SelfieState.WaitForCameraFeed waitForCameraFeed3 = waitForCameraFeed;
                                    final SelfieWorkflow.Input input7 = input4;
                                    final SelfieWorkflow selfieWorkflow6 = this.f$0;
                                    final StatefulWorkflow.RenderContext renderContext9 = renderContext;
                                    return Workflows.action$default(selfieWorkflow6, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda70
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            int i262 = i26;
                                            SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
                                            StatefulWorkflow.RenderContext renderContext92 = renderContext9;
                                            SelfieWorkflow selfieWorkflow62 = selfieWorkflow6;
                                            SelfieWorkflow.Input input72 = input7;
                                            SelfieState.WaitForCameraFeed waitForCameraFeed32 = waitForCameraFeed3;
                                            PermissionRequestWorkflow.Output output22 = output2;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj5;
                                            switch (i262) {
                                                case 0:
                                                    updater.getClass();
                                                    if (output22.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed32, true, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                                    } else if (!input72.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input72.backStepEnabled) {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, back);
                                                    } else {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    if (output22.permissionState.result == PermissionResult.PermissionGranted) {
                                                        updater.state = SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed32, false, true, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                                    } else if (!input72.skipPromptPage) {
                                                        updater.state = new SelfieState.ShowInstructions();
                                                    } else if (input72.backStepEnabled) {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, back);
                                                    } else {
                                                        selfieWorkflow62.setOutputForWorkflow(renderContext92, new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                            }
                        }
                    });
                } else {
                    obj3 = oldCreateCameraScreen$default2;
                }
                oldCreateCameraScreen$default = obj3;
            }
        }
        submittingScreen = oldCreateCameraScreen$default;
        if (!(submittingScreen instanceof Screen.OldCameraScreen)) {
        }
    }

    public final void setErrorOutput(StatefulWorkflow.RenderContext renderContext, Throwable th) {
        String message;
        String message2 = th.getMessage();
        if (message2 != null && StringsKt.contains((CharSequence) message2, (CharSequence) "ENOSPC", false)) {
            setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th instanceof ImageCaptureException)) {
            setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.UnknownErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unknown error. Type: ", th.getClass().getCanonicalName()))));
            return;
        }
        Throwable cause = th.getCause();
        if (cause == null || (message = cause.getMessage()) == null || !StringsKt.contains((CharSequence) message, (CharSequence) "ENOSPC", false)) {
            setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.UnknownErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unknown error. Type: ", th.getClass().getCanonicalName()))));
        } else {
            setOutputForWorkflow(renderContext, new Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        }
    }

    public final void setOutputForWorkflow(StatefulWorkflow.RenderContext renderContext, Output output) {
        if (!(output instanceof Output.Finished) && !(output instanceof Output.Back) && !(output instanceof Output.Error)) {
            boolean z = output instanceof Output.Canceled;
        }
        renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(this, new ForwardingFileSystem$$ExternalSyntheticLambda0(output, 3)));
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        SelfieState selfieState = (SelfieState) obj;
        selfieState.getClass();
        return SnapshotParcelsKt.toSnapshot(selfieState);
    }

    public final VideoCaptureMethod videoCaptureMethod(Input input) {
        Serializable m4102videoCaptureMethod0E7RQCE = input.videoCaptureConfig.m4102videoCaptureMethod0E7RQCE(this.applicationContext);
        return Result.m4120exceptionOrNullimpl(m4102videoCaptureMethod0E7RQCE) == null ? (VideoCaptureMethod) m4102videoCaptureMethod0E7RQCE : VideoCaptureMethod.None;
    }
}
