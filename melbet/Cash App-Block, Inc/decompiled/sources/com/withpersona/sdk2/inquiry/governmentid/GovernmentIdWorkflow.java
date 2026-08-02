package com.withpersona.sdk2.inquiry.governmentid;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.material.animation.AnimatorSetCompat;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.TimerWorker;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.Named;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.squareup.workflow1.ui.modal.AlertContainerScreen;
import com.squareup.workflow1.ui.modal.AlertScreen;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$GovernmentId;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class GovernmentIdWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final AutoClassificationRenderer autoClassificationRenderer;
    public final AutoClassifyWorker.Factory autoClassifyWorkerFactory;
    public final CaptureRenderer captureRenderer;
    public final DocumentSelectWorker documentSelectWorker;
    public final ExternalEventLogger externalEventLogger;
    public final RealImageLoader imageLoader;
    public final UnleashContext localVideoCaptureRenderer;
    public final NavigationStateManager navigationStateManager;
    public KClass previousStateClass;
    public final SubmitVerificationWorker_Factory_Impl submitVerificationWorkerFactory;
    public final InquiryThemeManager themeManager;
    public final TrackingEventsLogger trackingEventsLogger;
    public final POPMatchingFactory videoCaptureHelper;
    public final WebRtcRenderer webRtcRenderer;

    public final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final NextStep.GovernmentId.AssetConfig assetConfig;
        public final AutoClassificationConfig autoClassificationConfig;
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final String countryCode;
        public final DesignVersion designVersion;
        public final DigitalIdConfig digitalIdConfig;
        public final List enabledCaptureOptionsNativeMobile;
        public final ArrayList enabledIdClasses;
        public final String fieldKeyDocument;
        public final String fieldKeyIdClass;
        public final String flowWatermarkText;
        public final String fromComponent;
        public final String fromStep;
        public final Integer holographicTorchEnabledDurationMs;
        public final int imageCaptureCount;
        public final String inquiryId;
        public final boolean isEnabled;
        public final long manualCaptureButtonDelayMs;
        public final PendingPageTextPosition pendingPageTextVerticalPosition;
        public final StyleElements.Axis reviewCaptureButtonsAxis;
        public final String sessionToken;
        public final boolean shouldSkipReviewScreen;
        public final boolean staticCaptureTipsEnabled;
        public final Strings strings;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final Integer theme;
        public final VideoCaptureConfig videoCaptureConfig;

        public final class Creator implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                int i;
                Class cls;
                boolean z3;
                Integer num;
                boolean z4;
                AutoClassificationConfig autoClassificationConfig;
                DigitalIdConfig createFromParcel;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 == readInt) {
                        break;
                    }
                    i2 = CameraState$Type$EnumUnboxingLocalUtility.m(IdConfig.CREATOR, parcel, arrayList, i2, 1);
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean z5 = false;
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    i = 0;
                    z5 = z2;
                } else {
                    i = 0;
                }
                int readInt2 = parcel.readInt();
                boolean z6 = z2;
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i3 = i; i3 != readInt2; i3++) {
                    arrayList2.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                }
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(Input.class.getClassLoader());
                Strings createFromParcel2 = Strings.CREATOR.createFromParcel(parcel);
                int readInt3 = parcel.readInt();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                int i4 = i;
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    cls = Input.class;
                    z3 = z6;
                } else {
                    cls = Input.class;
                    z3 = i4;
                }
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                VideoCaptureConfig createFromParcel3 = VideoCaptureConfig.CREATOR.createFromParcel(parcel);
                NextStep.GovernmentId.AssetConfig assetConfig = (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(cls.getClassLoader());
                if (parcel.readInt() != 0) {
                    Integer num2 = valueOf;
                    z4 = z6;
                    num = num2;
                } else {
                    num = valueOf;
                    z4 = i4;
                }
                AutoClassificationConfig createFromParcel4 = AutoClassificationConfig.CREATOR.createFromParcel(parcel);
                StyleElements.Axis valueOf2 = StyleElements.Axis.valueOf(parcel.readString());
                PendingPageTextPosition valueOf3 = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    autoClassificationConfig = createFromParcel4;
                    createFromParcel = null;
                } else {
                    autoClassificationConfig = createFromParcel4;
                    createFromParcel = DigitalIdConfig.CREATOR.createFromParcel(parcel);
                }
                DigitalIdConfig digitalIdConfig = createFromParcel;
                if (parcel.readInt() != 0) {
                    i4 = 1;
                }
                return new Input(readString, readString2, arrayList, readString3, readString4, readString5, z, z5, arrayList2, governmentIdStepStyle, createFromParcel2, readInt3, readString6, readString7, readLong, z3, num, createFromParcel3, assetConfig, z4, autoClassificationConfig, valueOf2, valueOf3, digitalIdConfig, i4, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, DesignVersion.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        public final class Strings implements Parcelable {
            public static final Parcelable.Creator<Strings> CREATOR = new Frame.Creator(26);
            public final String autoClassificationCaptureTipText;
            public final String barcodeHelpModalContinueButtonText;
            public final String barcodeHelpModalHints;
            public final String barcodeHelpModalPrompt;
            public final String barcodeHelpModalTitle;
            public final String buttonRetake;
            public final String buttonSubmit;
            public final String cameraPermissionsAllowButtonText;
            public final String cameraPermissionsCancelButtonText;
            public final String cameraPermissionsPrompt;
            public final String cameraPermissionsTitle;
            public final String captureDisclaimer;
            public final OverridableText captureScreenTitle;
            public final String capturing;
            public final String choose;
            public final OverridableText chooseCaptureMethodBody;
            public final String chooseCaptureMethodCameraButton;
            public final OverridableText chooseCaptureMethodTitle;
            public final String chooseCaptureMethodUploadButton;
            public final OverridableText confirmCapture;
            public final OverridableText confirmCaptureTitle;
            public final String countryInputTitle;
            public final String helpButtonText;
            public final String hintHoldStill;
            public final String hintLowLight;
            public final String idBackHelpModalContinueButtonText;
            public final String idBackHelpModalHints;
            public final String idBackHelpModalPrompt;
            public final String idBackHelpModalTitle;
            public final String idClassInputTitle;
            public final String idClassRejectedContinueButtonText;
            public final String idClassRejectedTitle;
            public final LinkedHashMap idClassToName;
            public final String idFrontHelpModalContinueButtonText;
            public final String idFrontHelpModalHints;
            public final String idFrontHelpModalPrompt;
            public final String idFrontHelpModalTitle;
            public final String instructionsDisclaimer;
            public final List localizationOverrides;
            public final String manualClassificationContinueButtonText;
            public final String manualClassificationTitle;
            public final String microphonePermissionsAllowButtonText;
            public final String microphonePermissionsCancelButtonText;
            public final String microphonePermissionsPrompt;
            public final String microphonePermissionsTitle;
            public final String processingDescription;
            public final String processingTitle;
            public final String prompt;
            public final Map reviewSelectedImageBody;
            public final String reviewSelectedImageChooseAnotherButton;
            public final String reviewSelectedImageConfirmButton;
            public final Map reviewSelectedImageTitle;
            public final OverridableText scanInstructions;
            public final String staticCaptureTipsSubtext;
            public final String staticCaptureTipsTitle;
            public final String title;
            public final String unableToClassifyDocumentContinueButtonText;
            public final String unableToClassifyDocumentTitle;

            public Strings(String str, String str2, String str3, String str4, OverridableText overridableText, OverridableText overridableText2, String str5, OverridableText overridableText3, String str6, String str7, String str8, OverridableText overridableText4, String str9, String str10, LinkedHashMap linkedHashMap, OverridableText overridableText5, OverridableText overridableText6, String str11, String str12, Map map, Map map2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, List list) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                overridableText.getClass();
                overridableText2.getClass();
                str5.getClass();
                overridableText3.getClass();
                str6.getClass();
                str7.getClass();
                str8.getClass();
                overridableText4.getClass();
                str9.getClass();
                str10.getClass();
                overridableText5.getClass();
                overridableText6.getClass();
                str11.getClass();
                str12.getClass();
                str13.getClass();
                str14.getClass();
                this.title = str;
                this.prompt = str2;
                this.choose = str3;
                this.instructionsDisclaimer = str4;
                this.captureScreenTitle = overridableText;
                this.scanInstructions = overridableText2;
                this.capturing = str5;
                this.confirmCapture = overridableText3;
                this.captureDisclaimer = str6;
                this.buttonSubmit = str7;
                this.buttonRetake = str8;
                this.confirmCaptureTitle = overridableText4;
                this.processingTitle = str9;
                this.processingDescription = str10;
                this.idClassToName = linkedHashMap;
                this.chooseCaptureMethodTitle = overridableText5;
                this.chooseCaptureMethodBody = overridableText6;
                this.chooseCaptureMethodCameraButton = str11;
                this.chooseCaptureMethodUploadButton = str12;
                this.reviewSelectedImageTitle = map;
                this.reviewSelectedImageBody = map2;
                this.reviewSelectedImageConfirmButton = str13;
                this.reviewSelectedImageChooseAnotherButton = str14;
                this.cameraPermissionsTitle = str15;
                this.cameraPermissionsPrompt = str16;
                this.cameraPermissionsAllowButtonText = str17;
                this.cameraPermissionsCancelButtonText = str18;
                this.microphonePermissionsTitle = str19;
                this.microphonePermissionsPrompt = str20;
                this.microphonePermissionsAllowButtonText = str21;
                this.microphonePermissionsCancelButtonText = str22;
                this.hintHoldStill = str23;
                this.hintLowLight = str24;
                this.helpButtonText = str25;
                this.barcodeHelpModalTitle = str26;
                this.barcodeHelpModalPrompt = str27;
                this.barcodeHelpModalHints = str28;
                this.barcodeHelpModalContinueButtonText = str29;
                this.idFrontHelpModalTitle = str30;
                this.idFrontHelpModalPrompt = str31;
                this.idFrontHelpModalHints = str32;
                this.idFrontHelpModalContinueButtonText = str33;
                this.idBackHelpModalTitle = str34;
                this.idBackHelpModalPrompt = str35;
                this.idBackHelpModalHints = str36;
                this.idBackHelpModalContinueButtonText = str37;
                this.staticCaptureTipsTitle = str38;
                this.staticCaptureTipsSubtext = str39;
                this.unableToClassifyDocumentTitle = str40;
                this.unableToClassifyDocumentContinueButtonText = str41;
                this.idClassRejectedTitle = str42;
                this.idClassRejectedContinueButtonText = str43;
                this.countryInputTitle = str44;
                this.idClassInputTitle = str45;
                this.manualClassificationTitle = str46;
                this.manualClassificationContinueButtonText = str47;
                this.autoClassificationCaptureTipText = str48;
                this.localizationOverrides = list;
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
                return Intrinsics.areEqual(this.title, strings.title) && Intrinsics.areEqual(this.prompt, strings.prompt) && Intrinsics.areEqual(this.choose, strings.choose) && Intrinsics.areEqual(this.instructionsDisclaimer, strings.instructionsDisclaimer) && Intrinsics.areEqual(this.captureScreenTitle, strings.captureScreenTitle) && Intrinsics.areEqual(this.scanInstructions, strings.scanInstructions) && Intrinsics.areEqual(this.capturing, strings.capturing) && Intrinsics.areEqual(this.confirmCapture, strings.confirmCapture) && Intrinsics.areEqual(this.captureDisclaimer, strings.captureDisclaimer) && Intrinsics.areEqual(this.buttonSubmit, strings.buttonSubmit) && Intrinsics.areEqual(this.buttonRetake, strings.buttonRetake) && Intrinsics.areEqual(this.confirmCaptureTitle, strings.confirmCaptureTitle) && Intrinsics.areEqual(this.processingTitle, strings.processingTitle) && Intrinsics.areEqual(this.processingDescription, strings.processingDescription) && this.idClassToName.equals(strings.idClassToName) && Intrinsics.areEqual(this.chooseCaptureMethodTitle, strings.chooseCaptureMethodTitle) && Intrinsics.areEqual(this.chooseCaptureMethodBody, strings.chooseCaptureMethodBody) && Intrinsics.areEqual(this.chooseCaptureMethodCameraButton, strings.chooseCaptureMethodCameraButton) && Intrinsics.areEqual(this.chooseCaptureMethodUploadButton, strings.chooseCaptureMethodUploadButton) && this.reviewSelectedImageTitle.equals(strings.reviewSelectedImageTitle) && this.reviewSelectedImageBody.equals(strings.reviewSelectedImageBody) && Intrinsics.areEqual(this.reviewSelectedImageConfirmButton, strings.reviewSelectedImageConfirmButton) && Intrinsics.areEqual(this.reviewSelectedImageChooseAnotherButton, strings.reviewSelectedImageChooseAnotherButton) && Intrinsics.areEqual(this.cameraPermissionsTitle, strings.cameraPermissionsTitle) && Intrinsics.areEqual(this.cameraPermissionsPrompt, strings.cameraPermissionsPrompt) && Intrinsics.areEqual(this.cameraPermissionsAllowButtonText, strings.cameraPermissionsAllowButtonText) && Intrinsics.areEqual(this.cameraPermissionsCancelButtonText, strings.cameraPermissionsCancelButtonText) && Intrinsics.areEqual(this.microphonePermissionsTitle, strings.microphonePermissionsTitle) && Intrinsics.areEqual(this.microphonePermissionsPrompt, strings.microphonePermissionsPrompt) && Intrinsics.areEqual(this.microphonePermissionsAllowButtonText, strings.microphonePermissionsAllowButtonText) && Intrinsics.areEqual(this.microphonePermissionsCancelButtonText, strings.microphonePermissionsCancelButtonText) && Intrinsics.areEqual(this.hintHoldStill, strings.hintHoldStill) && Intrinsics.areEqual(this.hintLowLight, strings.hintLowLight) && Intrinsics.areEqual(this.helpButtonText, strings.helpButtonText) && Intrinsics.areEqual(this.barcodeHelpModalTitle, strings.barcodeHelpModalTitle) && Intrinsics.areEqual(this.barcodeHelpModalPrompt, strings.barcodeHelpModalPrompt) && Intrinsics.areEqual(this.barcodeHelpModalHints, strings.barcodeHelpModalHints) && Intrinsics.areEqual(this.barcodeHelpModalContinueButtonText, strings.barcodeHelpModalContinueButtonText) && Intrinsics.areEqual(this.idFrontHelpModalTitle, strings.idFrontHelpModalTitle) && Intrinsics.areEqual(this.idFrontHelpModalPrompt, strings.idFrontHelpModalPrompt) && Intrinsics.areEqual(this.idFrontHelpModalHints, strings.idFrontHelpModalHints) && Intrinsics.areEqual(this.idFrontHelpModalContinueButtonText, strings.idFrontHelpModalContinueButtonText) && Intrinsics.areEqual(this.idBackHelpModalTitle, strings.idBackHelpModalTitle) && Intrinsics.areEqual(this.idBackHelpModalPrompt, strings.idBackHelpModalPrompt) && Intrinsics.areEqual(this.idBackHelpModalHints, strings.idBackHelpModalHints) && Intrinsics.areEqual(this.idBackHelpModalContinueButtonText, strings.idBackHelpModalContinueButtonText) && Intrinsics.areEqual(this.staticCaptureTipsTitle, strings.staticCaptureTipsTitle) && Intrinsics.areEqual(this.staticCaptureTipsSubtext, strings.staticCaptureTipsSubtext) && Intrinsics.areEqual(this.unableToClassifyDocumentTitle, strings.unableToClassifyDocumentTitle) && Intrinsics.areEqual(this.unableToClassifyDocumentContinueButtonText, strings.unableToClassifyDocumentContinueButtonText) && Intrinsics.areEqual(this.idClassRejectedTitle, strings.idClassRejectedTitle) && Intrinsics.areEqual(this.idClassRejectedContinueButtonText, strings.idClassRejectedContinueButtonText) && Intrinsics.areEqual(this.countryInputTitle, strings.countryInputTitle) && Intrinsics.areEqual(this.idClassInputTitle, strings.idClassInputTitle) && Intrinsics.areEqual(this.manualClassificationTitle, strings.manualClassificationTitle) && Intrinsics.areEqual(this.manualClassificationContinueButtonText, strings.manualClassificationContinueButtonText) && Intrinsics.areEqual(this.autoClassificationCaptureTipText, strings.autoClassificationCaptureTipText) && Intrinsics.areEqual(this.localizationOverrides, strings.localizationOverrides);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((this.idClassToName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.prompt), 31, this.choose), 31, this.instructionsDisclaimer), this.captureScreenTitle.backingData, 31), this.scanInstructions.backingData, 31), 31, this.capturing), this.confirmCapture.backingData, 31), 31, this.captureDisclaimer), 31, this.buttonSubmit), 31, this.buttonRetake), this.confirmCaptureTitle.backingData, 31), 31, this.processingTitle), 31, this.processingDescription)) * 31, this.chooseCaptureMethodTitle.backingData, 31), this.chooseCaptureMethodBody.backingData, 31), 31, this.chooseCaptureMethodCameraButton), 31, this.chooseCaptureMethodUploadButton), this.reviewSelectedImageTitle, 31), this.reviewSelectedImageBody, 31), 31, this.reviewSelectedImageConfirmButton), 31, this.reviewSelectedImageChooseAnotherButton);
                String str = this.cameraPermissionsTitle;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.cameraPermissionsPrompt;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cameraPermissionsAllowButtonText;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cameraPermissionsCancelButtonText;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.microphonePermissionsTitle;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.microphonePermissionsPrompt;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.microphonePermissionsAllowButtonText;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.microphonePermissionsCancelButtonText;
                int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.hintHoldStill;
                int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.hintLowLight;
                int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.helpButtonText;
                int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.barcodeHelpModalTitle;
                int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.barcodeHelpModalPrompt;
                int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.barcodeHelpModalHints;
                int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.barcodeHelpModalContinueButtonText;
                int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.idFrontHelpModalTitle;
                int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.idFrontHelpModalPrompt;
                int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
                String str18 = this.idFrontHelpModalHints;
                int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
                String str19 = this.idFrontHelpModalContinueButtonText;
                int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
                String str20 = this.idBackHelpModalTitle;
                int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
                String str21 = this.idBackHelpModalPrompt;
                int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
                String str22 = this.idBackHelpModalHints;
                int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
                String str23 = this.idBackHelpModalContinueButtonText;
                int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
                String str24 = this.staticCaptureTipsTitle;
                int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
                String str25 = this.staticCaptureTipsSubtext;
                int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
                String str26 = this.unableToClassifyDocumentTitle;
                int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
                String str27 = this.unableToClassifyDocumentContinueButtonText;
                int hashCode27 = (hashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
                String str28 = this.idClassRejectedTitle;
                int hashCode28 = (hashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
                String str29 = this.idClassRejectedContinueButtonText;
                int hashCode29 = (hashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
                String str30 = this.countryInputTitle;
                int hashCode30 = (hashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
                String str31 = this.idClassInputTitle;
                int hashCode31 = (hashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
                String str32 = this.manualClassificationTitle;
                int hashCode32 = (hashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
                String str33 = this.manualClassificationContinueButtonText;
                int hashCode33 = (hashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
                String str34 = this.autoClassificationCaptureTipText;
                int hashCode34 = (hashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
                List list = this.localizationOverrides;
                return hashCode34 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Strings(title=", this.title, ", prompt=", this.prompt, ", choose=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.choose, ", instructionsDisclaimer=", this.instructionsDisclaimer, ", captureScreenTitle=");
                m.append(this.captureScreenTitle);
                m.append(", scanInstructions=");
                m.append(this.scanInstructions);
                m.append(", capturing=");
                m.append(this.capturing);
                m.append(", confirmCapture=");
                m.append(this.confirmCapture);
                m.append(", captureDisclaimer=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.captureDisclaimer, ", buttonSubmit=", this.buttonSubmit, ", buttonRetake=");
                m.append(this.buttonRetake);
                m.append(", confirmCaptureTitle=");
                m.append(this.confirmCaptureTitle);
                m.append(", processingTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.processingTitle, ", processingDescription=", this.processingDescription, ", idClassToName=");
                m.append(this.idClassToName);
                m.append(", chooseCaptureMethodTitle=");
                m.append(this.chooseCaptureMethodTitle);
                m.append(", chooseCaptureMethodBody=");
                m.append(this.chooseCaptureMethodBody);
                m.append(", chooseCaptureMethodCameraButton=");
                m.append(this.chooseCaptureMethodCameraButton);
                m.append(", chooseCaptureMethodUploadButton=");
                m.append(this.chooseCaptureMethodUploadButton);
                m.append(", reviewSelectedImageTitle=");
                m.append(this.reviewSelectedImageTitle);
                m.append(", reviewSelectedImageBody=");
                m.append(this.reviewSelectedImageBody);
                m.append(", reviewSelectedImageConfirmButton=");
                m.append(this.reviewSelectedImageConfirmButton);
                m.append(", reviewSelectedImageChooseAnotherButton=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.reviewSelectedImageChooseAnotherButton, ", cameraPermissionsTitle=", this.cameraPermissionsTitle, ", cameraPermissionsPrompt=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.cameraPermissionsPrompt, ", cameraPermissionsAllowButtonText=", this.cameraPermissionsAllowButtonText, ", cameraPermissionsCancelButtonText=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.cameraPermissionsCancelButtonText, ", microphonePermissionsTitle=", this.microphonePermissionsTitle, ", microphonePermissionsPrompt=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.microphonePermissionsPrompt, ", microphonePermissionsAllowButtonText=", this.microphonePermissionsAllowButtonText, ", microphonePermissionsCancelButtonText=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.microphonePermissionsCancelButtonText, ", hintHoldStill=", this.hintHoldStill, ", hintLowLight=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.hintLowLight, ", helpButtonText=", this.helpButtonText, ", barcodeHelpModalTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.barcodeHelpModalTitle, ", barcodeHelpModalPrompt=", this.barcodeHelpModalPrompt, ", barcodeHelpModalHints=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.barcodeHelpModalHints, ", barcodeHelpModalContinueButtonText=", this.barcodeHelpModalContinueButtonText, ", idFrontHelpModalTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.idFrontHelpModalTitle, ", idFrontHelpModalPrompt=", this.idFrontHelpModalPrompt, ", idFrontHelpModalHints=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.idFrontHelpModalHints, ", idFrontHelpModalContinueButtonText=", this.idFrontHelpModalContinueButtonText, ", idBackHelpModalTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.idBackHelpModalTitle, ", idBackHelpModalPrompt=", this.idBackHelpModalPrompt, ", idBackHelpModalHints=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.idBackHelpModalHints, ", idBackHelpModalContinueButtonText=", this.idBackHelpModalContinueButtonText, ", staticCaptureTipsTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.staticCaptureTipsTitle, ", staticCaptureTipsSubtext=", this.staticCaptureTipsSubtext, ", unableToClassifyDocumentTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.unableToClassifyDocumentTitle, ", unableToClassifyDocumentContinueButtonText=", this.unableToClassifyDocumentContinueButtonText, ", idClassRejectedTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.idClassRejectedTitle, ", idClassRejectedContinueButtonText=", this.idClassRejectedContinueButtonText, ", countryInputTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.countryInputTitle, ", idClassInputTitle=", this.idClassInputTitle, ", manualClassificationTitle=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.manualClassificationTitle, ", manualClassificationContinueButtonText=", this.manualClassificationContinueButtonText, ", autoClassificationCaptureTipText=");
                m.append(this.autoClassificationCaptureTipText);
                m.append(", localizationOverrides=");
                m.append(this.localizationOverrides);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeString(this.prompt);
                parcel.writeString(this.choose);
                parcel.writeString(this.instructionsDisclaimer);
                this.captureScreenTitle.writeToParcel(parcel, i);
                this.scanInstructions.writeToParcel(parcel, i);
                parcel.writeString(this.capturing);
                this.confirmCapture.writeToParcel(parcel, i);
                parcel.writeString(this.captureDisclaimer);
                parcel.writeString(this.buttonSubmit);
                parcel.writeString(this.buttonRetake);
                this.confirmCaptureTitle.writeToParcel(parcel, i);
                parcel.writeString(this.processingTitle);
                parcel.writeString(this.processingDescription);
                LinkedHashMap linkedHashMap = this.idClassToName;
                parcel.writeInt(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                this.chooseCaptureMethodTitle.writeToParcel(parcel, i);
                this.chooseCaptureMethodBody.writeToParcel(parcel, i);
                parcel.writeString(this.chooseCaptureMethodCameraButton);
                parcel.writeString(this.chooseCaptureMethodUploadButton);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.reviewSelectedImageTitle, parcel);
                while (m.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) m.next();
                    parcel.writeString(((IdConfig.Side) entry2.getKey()).name());
                    parcel.writeString((String) entry2.getValue());
                }
                Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.reviewSelectedImageBody, parcel);
                while (m2.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) m2.next();
                    parcel.writeString(((IdConfig.Side) entry3.getKey()).name());
                    parcel.writeString((String) entry3.getValue());
                }
                parcel.writeString(this.reviewSelectedImageConfirmButton);
                parcel.writeString(this.reviewSelectedImageChooseAnotherButton);
                parcel.writeString(this.cameraPermissionsTitle);
                parcel.writeString(this.cameraPermissionsPrompt);
                parcel.writeString(this.cameraPermissionsAllowButtonText);
                parcel.writeString(this.cameraPermissionsCancelButtonText);
                parcel.writeString(this.microphonePermissionsTitle);
                parcel.writeString(this.microphonePermissionsPrompt);
                parcel.writeString(this.microphonePermissionsAllowButtonText);
                parcel.writeString(this.microphonePermissionsCancelButtonText);
                parcel.writeString(this.hintHoldStill);
                parcel.writeString(this.hintLowLight);
                parcel.writeString(this.helpButtonText);
                parcel.writeString(this.barcodeHelpModalTitle);
                parcel.writeString(this.barcodeHelpModalPrompt);
                parcel.writeString(this.barcodeHelpModalHints);
                parcel.writeString(this.barcodeHelpModalContinueButtonText);
                parcel.writeString(this.idFrontHelpModalTitle);
                parcel.writeString(this.idFrontHelpModalPrompt);
                parcel.writeString(this.idFrontHelpModalHints);
                parcel.writeString(this.idFrontHelpModalContinueButtonText);
                parcel.writeString(this.idBackHelpModalTitle);
                parcel.writeString(this.idBackHelpModalPrompt);
                parcel.writeString(this.idBackHelpModalHints);
                parcel.writeString(this.idBackHelpModalContinueButtonText);
                parcel.writeString(this.staticCaptureTipsTitle);
                parcel.writeString(this.staticCaptureTipsSubtext);
                parcel.writeString(this.unableToClassifyDocumentTitle);
                parcel.writeString(this.unableToClassifyDocumentContinueButtonText);
                parcel.writeString(this.idClassRejectedTitle);
                parcel.writeString(this.idClassRejectedContinueButtonText);
                parcel.writeString(this.countryInputTitle);
                parcel.writeString(this.idClassInputTitle);
                parcel.writeString(this.manualClassificationTitle);
                parcel.writeString(this.manualClassificationContinueButtonText);
                parcel.writeString(this.autoClassificationCaptureTipText);
                List list = this.localizationOverrides;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator m3 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m3.hasNext()) {
                    parcel.writeParcelable((Parcelable) m3.next(), i);
                }
            }
        }

        public Input(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z, boolean z2, List list, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, Strings strings, int i, String str6, String str7, long j, boolean z3, Integer num, VideoCaptureConfig videoCaptureConfig, NextStep.GovernmentId.AssetConfig assetConfig, boolean z4, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, DigitalIdConfig digitalIdConfig, boolean z5, Integer num2, DesignVersion designVersion, String str8) {
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            list.getClass();
            strings.getClass();
            str6.getClass();
            str7.getClass();
            videoCaptureConfig.getClass();
            assetConfig.getClass();
            autoClassificationConfig.getClass();
            axis.getClass();
            pendingPageTextPosition.getClass();
            designVersion.getClass();
            this.sessionToken = str;
            this.countryCode = str2;
            this.enabledIdClasses = arrayList;
            this.inquiryId = str3;
            this.fromStep = str4;
            this.fromComponent = str5;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.enabledCaptureOptionsNativeMobile = list;
            this.styles = governmentIdStepStyle;
            this.strings = strings;
            this.imageCaptureCount = i;
            this.fieldKeyDocument = str6;
            this.fieldKeyIdClass = str7;
            this.manualCaptureButtonDelayMs = j;
            this.shouldSkipReviewScreen = z3;
            this.theme = num;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.isEnabled = z4;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = axis;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.digitalIdConfig = digitalIdConfig;
            this.staticCaptureTipsEnabled = z5;
            this.holographicTorchEnabledDurationMs = num2;
            this.designVersion = designVersion;
            this.flowWatermarkText = str8;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.countryCode);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.enabledIdClasses, parcel);
            while (m.hasNext()) {
                ((IdConfig) m.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.fromStep);
            parcel.writeString(this.fromComponent);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledCaptureOptionsNativeMobile, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((CaptureOptionNativeMobile) m2.next()).name());
            }
            parcel.writeParcelable(this.styles, i);
            this.strings.writeToParcel(parcel, i);
            parcel.writeInt(this.imageCaptureCount);
            parcel.writeString(this.fieldKeyDocument);
            parcel.writeString(this.fieldKeyIdClass);
            parcel.writeLong(this.manualCaptureButtonDelayMs);
            parcel.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            Integer num = this.theme;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            this.videoCaptureConfig.writeToParcel(parcel, i);
            parcel.writeParcelable(this.assetConfig, i);
            parcel.writeInt(this.isEnabled ? 1 : 0);
            this.autoClassificationConfig.writeToParcel(parcel, i);
            parcel.writeString(this.reviewCaptureButtonsAxis.name());
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            if (digitalIdConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                digitalIdConfig.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.staticCaptureTipsEnabled ? 1 : 0);
            Integer num2 = this.holographicTorchEnabledDurationMs;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
            parcel.writeString(this.designVersion.name());
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
                return 1411335115;
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
                return 1649914237;
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
        }

        public final class Finished extends Output {
            public static final Finished INSTANCE = new Finished();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finished);
            }

            public final int hashCode() {
                return 1099427158;
            }

            public final String toString() {
                return "Finished";
            }
        }
    }

    public GovernmentIdWorkflow(Context context, RealImageLoader realImageLoader, SubmitVerificationWorker_Factory_Impl submitVerificationWorker_Factory_Impl, DocumentSelectWorker documentSelectWorker, UnleashContext unleashContext, WebRtcRenderer webRtcRenderer, CaptureRenderer captureRenderer, AutoClassifyWorker.Factory factory, AutoClassificationRenderer autoClassificationRenderer, RealCameraStatsManager realCameraStatsManager, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger, InquiryThemeManager inquiryThemeManager) {
        context.getClass();
        realImageLoader.getClass();
        submitVerificationWorker_Factory_Impl.getClass();
        documentSelectWorker.getClass();
        unleashContext.getClass();
        webRtcRenderer.getClass();
        captureRenderer.getClass();
        factory.getClass();
        autoClassificationRenderer.getClass();
        realCameraStatsManager.getClass();
        navigationStateManager.getClass();
        externalEventLogger.getClass();
        trackingEventsLogger.getClass();
        inquiryThemeManager.getClass();
        this.applicationContext = context;
        this.imageLoader = realImageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorker_Factory_Impl;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = unleashContext;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = factory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.themeManager = inquiryThemeManager;
        this.videoCaptureHelper = new POPMatchingFactory();
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        Input input = (Input) obj;
        input.getClass();
        Object obj2 = null;
        if (snapshot != null) {
            ByteString bytes = snapshot.bytes();
            if (bytes.getSize$okio() <= 0) {
                bytes = null;
            }
            if (bytes != null) {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                byte[] byteArray = bytes.toByteArray();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                Object readParcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                readParcelable.getClass();
                obtain.recycle();
                obj2 = readParcelable;
            }
            obj2 = (GovernmentIdState) obj2;
        }
        if (obj2 != null) {
            return obj2;
        }
        AutoClassificationConfig autoClassificationConfig = input.autoClassificationConfig;
        if (autoClassificationConfig.isEnabled) {
            this.videoCaptureHelper.getClass();
            if (!POPMatchingFactory.isVideoCapture(input)) {
                if (input.enabledCaptureOptionsNativeMobile.size() > 1) {
                    IdPart$SideIdPart idPart$SideIdPart = new IdPart$SideIdPart(IdConfig.Side.Front);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    return new GovernmentIdState.ChooseCaptureMethod(idPart$SideIdPart, emptyList, emptyList, 0, input.countryCode, new CaptureConfig.AutoClassifyConfig(autoClassificationConfig), null);
                }
                IdPart$SideIdPart idPart$SideIdPart2 = new IdPart$SideIdPart(IdConfig.Side.Front);
                EmptyList emptyList2 = EmptyList.INSTANCE;
                return new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart2, emptyList2, new CaptureConfig.AutoClassifyConfig(autoClassificationConfig), input.designVersion == DesignVersion.K0000 ? Screen.CameraScreen.ManualCapture.Hidden : Screen.CameraScreen.ManualCapture.Enabled, emptyList2, 0, null, WebRtcState.Disconnected, input.videoCaptureConfig.webRtcJwt, null, false, false, input.countryCode, null, null, 28160);
            }
        }
        return new GovernmentIdState.ShowInstructions(input.countryCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0e5d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0ea2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0ebb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0ebe  */
    /* JADX WARN: Type inference failed for: r15v44, types: [kotlin.coroutines.Continuation] */
    @Override // com.squareup.workflow1.StatefulWorkflow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Object obj, Object obj2, StatefulWorkflow.RenderContext renderContext) {
        GovernmentIdPage takePhoto;
        GovernmentIdState governmentIdState;
        boolean z;
        Context context;
        boolean z2;
        POPMatchingFactory pOPMatchingFactory;
        Context context2;
        BaseRenderContext baseRenderContext;
        GovernmentIdState governmentIdState2;
        GovernmentIdWorkflow governmentIdWorkflow;
        Object obj3;
        RandomAccess randomAccess;
        Object obj4;
        IdConfig idConfig;
        Object autoClassificationSelectCountryAndIdClassScreen;
        Iterator it;
        List list;
        String str;
        Object obj5;
        int i;
        String str2;
        String str3;
        IdConfig.Side side;
        IdConfig.Side side2;
        Context context3;
        String str4;
        VideoCaptureConfig videoCaptureConfig;
        VideoCaptureMethod videoCaptureMethod;
        Context context4;
        String text;
        POPMatchingFactory pOPMatchingFactory2;
        Screen.CameraScreen cameraScreen;
        VideoCaptureConfig videoCaptureConfig2;
        ModalContainerScreen modalContainerScreen;
        Context context5;
        CaptureConfig captureConfig;
        SelfieWorkflow$$ExternalSyntheticLambda2 selfieWorkflow$$ExternalSyntheticLambda2;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        GovernmentIdWorkflow$$ExternalSyntheticLambda6 governmentIdWorkflow$$ExternalSyntheticLambda6;
        boolean z3;
        String str5;
        final StatefulWorkflow.RenderContext renderContext2 = renderContext;
        BaseRenderContext baseRenderContext2 = renderContext2.$$delegate_0;
        final Input input = (Input) obj;
        GovernmentIdState governmentIdState3 = (GovernmentIdState) obj2;
        input.getClass();
        governmentIdState3.getClass();
        Class<?> cls = governmentIdState3.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls);
        final GovernmentIdWorkflow$$ExternalSyntheticLambda5 governmentIdWorkflow$$ExternalSyntheticLambda5 = new GovernmentIdWorkflow$$ExternalSyntheticLambda5(renderContext2, this);
        boolean z4 = input.backStepEnabled;
        NextStep.GovernmentId.AssetConfig assetConfig = input.assetConfig;
        Input.Strings strings = input.strings;
        boolean z5 = input.cancelButtonEnabled;
        boolean z6 = input.isEnabled;
        boolean z7 = z6 && !(governmentIdState3 instanceof GovernmentIdState.Submit);
        NavigationStateManager navigationStateManager = this.navigationStateManager;
        NavigationStateManager.setState$default(navigationStateManager, z4, z5, z7, 8);
        boolean z8 = governmentIdState3 instanceof GovernmentIdState.AutoClassificationError;
        if (z8) {
            takePhoto = GovernmentIdPage.AutoClassificationFailure.INSTANCE;
        } else if (governmentIdState3 instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = GovernmentIdPage.AutoClassificationSelect.INSTANCE;
        } else if (governmentIdState3 instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = GovernmentIdPage.Select.INSTANCE;
        } else if (governmentIdState3 instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new GovernmentIdPage.Prompt(((GovernmentIdState.ChooseCaptureMethod) governmentIdState3).partIndex);
        } else if ((governmentIdState3 instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState3 instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState3 instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState3 instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState3 instanceof GovernmentIdState.HolographicTorchDelay)) {
            takePhoto = new GovernmentIdPage.TakePhoto(governmentIdState3.getPartIndex$government_id_release());
        } else if (governmentIdState3 instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new GovernmentIdPage.Check(((GovernmentIdState.ReviewCapturedImage) governmentIdState3).partIndex);
        } else if (governmentIdState3 instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new GovernmentIdPage.CheckUpload(((GovernmentIdState.ReviewSelectedImage) governmentIdState3).partIndex);
        } else {
            if (!(governmentIdState3 instanceof GovernmentIdState.Submit)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            takePhoto = GovernmentIdPage.Pending.INSTANCE;
        }
        this.externalEventLogger.logPageChange(new InquiryPage$GovernmentId(input.fromStep, takePhoto));
        boolean areEqual = Intrinsics.areEqual(this.previousStateClass, orCreateKotlinClass);
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (!areEqual) {
            TrackingEventsLogger.DefaultImpls.logInquiryPageViewEvent$default(this.trackingEventsLogger, input.fromStep, takePhoto.toString(), false, 4, null);
            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.LOADING, null, null, 4, null), false, 2, null);
            }
            this.previousStateClass = orCreateKotlinClass;
        }
        boolean z9 = governmentIdState3 instanceof GovernmentIdState.ShowInstructions;
        String str6 = null;
        Context context6 = this.applicationContext;
        final POPMatchingFactory pOPMatchingFactory3 = this.videoCaptureHelper;
        if (z9) {
            HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(input, governmentIdState3, this, renderContext, (Continuation) null, 16);
            input = input;
            governmentIdState = governmentIdState3;
            renderContext2 = renderContext;
            baseRenderContext2.runningSideEffect("check_if_single_id_class", anonymousClass2);
            String str7 = strings.title;
            String str8 = strings.prompt;
            String str9 = strings.choose;
            String str10 = strings.instructionsDisclaimer;
            ArrayList arrayList = input.enabledIdClasses;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IdConfig idConfig2 = (IdConfig) it2.next();
                Iterator it3 = it2;
                String str11 = str9;
                IdIcon idIcon = idConfig2.icon;
                boolean z10 = z9;
                String str12 = idConfig2.idClassKey;
                String str13 = str10;
                String str14 = (String) strings.idClassToName.get(str12);
                if (str14 != null) {
                    str12 = str14;
                }
                arrayList2.add(new EnabledIdClass(idIcon, idConfig2, str12));
                it2 = it3;
                str9 = str11;
                str10 = str13;
                z9 = z10;
            }
            int i2 = 2;
            Screen.InstructionsScreen instructionsScreen = new Screen.InstructionsScreen(str7, str8, str9, str10, arrayList2, navigationStateManager.getNavigationState(), new GovernmentIdWorkflow$renderScreen$2(renderContext2, governmentIdState, input, this), input.styles, assetConfig.getSelectPage(), input.isEnabled, new GovernmentIdWorkflow$$ExternalSyntheticLambda0(renderContext2, this, 3), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, i2), ((GovernmentIdState.ShowInstructions) governmentIdState).error, new GovernmentIdWorkflow$$ExternalSyntheticLambda9(renderContext2, this, governmentIdState, i2), ((InquiryTheme) ((StateFlowImpl) this.themeManager.themeFlow).getValue()).iconStyle, ScreenTransition.SLIDE_IN);
            z = z8;
            context2 = context6;
            baseRenderContext = baseRenderContext2;
            pOPMatchingFactory = pOPMatchingFactory3;
            autoClassificationSelectCountryAndIdClassScreen = instructionsScreen;
            z2 = z9;
            governmentIdWorkflow = this;
        } else {
            governmentIdState = governmentIdState3;
            if (!(governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod)) {
                z = z8;
                boolean z11 = governmentIdState instanceof GovernmentIdState.WaitForAutocapture;
                final CaptureRenderer captureRenderer = this.captureRenderer;
                if (z11) {
                    GovernmentIdState.WaitForAutocapture waitForAutocapture = (GovernmentIdState.WaitForAutocapture) governmentIdState;
                    PermissionRequestWorkflow permissionRequestWorkflow = captureRenderer.permissionRequestWorkflow;
                    Context context7 = captureRenderer.applicationContext;
                    pOPMatchingFactory3.getClass();
                    CaptureConfig captureConfig2 = waitForAutocapture.captureConfig;
                    String str15 = waitForAutocapture.countryCode;
                    IdPart$SideIdPart idPart$SideIdPart = waitForAutocapture.currentPart;
                    IdConfig.Side side3 = idPart$SideIdPart.side;
                    IdConfig.IdSideConfig sideConfig = GovernmentIdKt.getSideConfig(captureConfig2, side3);
                    String idClassKey = GovernmentIdKt.getIdClassKey(captureConfig2);
                    boolean z12 = captureConfig2 instanceof CaptureConfig.AutoClassifyConfig;
                    Workflows.runningWorker(renderContext2, captureRenderer.governmentIdAnalyzeWorkerFactory.create(side3, idClassKey), Reflection.typeOf(GovernmentIdAnalyzeWorker.class), "", new SelfieWorkflow$$ExternalSyntheticLambda38(13, captureRenderer, waitForAutocapture, captureConfig2));
                    Workflows.runningWorker(renderContext2, captureRenderer.governmentIdHintWorkerFactory.create(side3), Reflection.typeOf(GovernmentIdHintWorker.class), "", new DocumentWorkflow$$ExternalSyntheticLambda7(24));
                    VideoCaptureMethod videoCaptureMethod2 = POPMatchingFactory.videoCaptureMethod(input);
                    VideoCaptureConfig videoCaptureConfig3 = input.videoCaptureConfig;
                    VideoCaptureMethod videoCaptureMethod3 = VideoCaptureMethod.Stream;
                    boolean z13 = videoCaptureMethod2 == videoCaptureMethod3;
                    IdConfig.ManualCaptureConfig manualCaptureConfig = sideConfig.manualCaptureConfig;
                    if (!manualCaptureConfig.isEnabled || z13) {
                        str4 = "";
                        videoCaptureConfig = videoCaptureConfig3;
                        videoCaptureMethod = videoCaptureMethod3;
                    } else {
                        Worker.Companion companion = Worker.Companion;
                        videoCaptureConfig = videoCaptureConfig3;
                        long j = manualCaptureConfig.delayMs;
                        if (j < 0) {
                            j = 0;
                        }
                        companion.getClass();
                        TimerWorker timerWorker = new TimerWorker(j, "");
                        String str16 = sideConfig.sideKey;
                        str4 = "";
                        CaptureRenderer$$ExternalSyntheticLambda3 captureRenderer$$ExternalSyntheticLambda3 = new CaptureRenderer$$ExternalSyntheticLambda3(waitForAutocapture, 3);
                        KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                        KType typeOf = Reflection.typeOf(Unit.class);
                        companion2.getClass();
                        videoCaptureMethod = videoCaptureMethod3;
                        Workflows.runningWorker(renderContext2, timerWorker, Reflection.typeOf(Worker.class, KTypeProjection.Companion.invariant(typeOf)), str16, captureRenderer$$ExternalSyntheticLambda3);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    if (waitForAutocapture.error != null) {
                        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(AlertScreen.Button.POSITIVE, context7.getString(R.string.ok)));
                        String string2 = context7.getString(com.squareup.cash.R.string.pi2_error_image_capture_failed);
                        string2.getClass();
                        context4 = context7;
                        arrayList3.add(new AlertScreen(mapOf, string2, new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 7)));
                    } else {
                        context4 = context7;
                    }
                    String captureScreenTitle = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings, side3, idClassKey, str15);
                    String str17 = ((!z12 || (text = strings.autoClassificationCaptureTipText) == null) && (text = strings.scanInstructions.getText(str15, idClassKey, side3)) == null) ? str4 : text;
                    IdConfig.Side side4 = idPart$SideIdPart.side;
                    Screen.CameraScreen.ManualCapture manualCapture = waitForAutocapture.manualCapture;
                    Screen.Overlay overlay = sideConfig.overlay;
                    IdClass idClass = GovernmentIdKt.getIdClass(captureConfig2);
                    NavigationState navigationState = captureRenderer.navigationStateManager.getNavigationState();
                    List list2 = sideConfig.autoCaptureConfig.ruleSet.rules;
                    int i3 = waitForAutocapture.partIndex;
                    SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda4 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 3);
                    VideoCaptureMethod videoCaptureMethod4 = POPMatchingFactory.videoCaptureMethod(input);
                    String textForHint = GovernmentIdWorkflowUtilsKt.getTextForHint(strings, waitForAutocapture.hint);
                    CaptureTipsViewModel captureTips = GovernmentIdWorkflowUtilsKt.getCaptureTips(input, side3);
                    CameraXController_Factory_Impl cameraXController_Factory_Impl = captureRenderer.cameraXControllerFactory;
                    Camera2Controller_Factory_Impl camera2Controller_Factory_Impl = captureRenderer.camera2ControllerFactory;
                    String str18 = str17;
                    Context context8 = context4;
                    String str19 = str4;
                    z2 = z9;
                    final int i4 = 3;
                    WalletHomeViewKt$$ExternalSyntheticLambda2 walletHomeViewKt$$ExternalSyntheticLambda2 = new WalletHomeViewKt$$ExternalSyntheticLambda2(waitForAutocapture, captureConfig2, captureRenderer, input, renderContext2, pOPMatchingFactory3, 4);
                    Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i4;
                            GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
                            GovernmentIdWorkflow$$ExternalSyntheticLambda5 governmentIdWorkflow$$ExternalSyntheticLambda52 = governmentIdWorkflow$$ExternalSyntheticLambda5;
                            switch (i5) {
                                case 0:
                                    governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                    break;
                                case 1:
                                    governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                    break;
                                case 2:
                                    governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                    break;
                                default:
                                    governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    CaptureRenderer$$ExternalSyntheticLambda7 captureRenderer$$ExternalSyntheticLambda7 = new CaptureRenderer$$ExternalSyntheticLambda7(renderContext2, pOPMatchingFactory3, 7);
                    SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda42 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 8);
                    HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(24, captureRenderer, renderContext2, waitForAutocapture);
                    final int i5 = 1;
                    int i6 = 1;
                    Screen.CameraScreen newCameraScreen$default = GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle, str18, manualCapture, overlay, idClass, side4, navigationState, walletHomeViewKt$$ExternalSyntheticLambda2, function0, captureRenderer$$ExternalSyntheticLambda7, false, list2, waitForAutocapture, i3, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, null, selfieV1UtilsKt$$ExternalSyntheticLambda42, selfieV1UtilsKt$$ExternalSyntheticLambda4, videoCaptureMethod4, false, null, heroCardViewKt$$ExternalSyntheticLambda9, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i5;
                            POPMatchingFactory pOPMatchingFactory4 = pOPMatchingFactory3;
                            GovernmentIdWorkflow.Input input2 = input;
                            StatefulWorkflow.RenderContext renderContext3 = renderContext2;
                            CaptureRenderer captureRenderer2 = captureRenderer;
                            switch (i7) {
                                case 0:
                                    Context context9 = captureRenderer2.applicationContext;
                                    pOPMatchingFactory4.getClass();
                                    GovernmentIdWorkflowUtilsKt.handlePermissionChanged(context9, renderContext3, input2, POPMatchingFactory.isVideoCapture(input2));
                                    break;
                                default:
                                    Context context10 = captureRenderer2.applicationContext;
                                    pOPMatchingFactory4.getClass();
                                    GovernmentIdWorkflowUtilsKt.handlePermissionChanged(context10, renderContext3, input2, POPMatchingFactory.isVideoCapture(input2));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, 0, textForHint, captureTips, null, -1981677568, 1);
                    if (waitForAutocapture.checkCameraPermissions) {
                        context8.getClass();
                        permissionRequestWorkflow.getClass();
                        Permission permission = Permission.Camera;
                        String str20 = strings.cameraPermissionsTitle;
                        if (str20 == null) {
                            str20 = str19;
                        }
                        String str21 = strings.cameraPermissionsPrompt;
                        if (str21 == null) {
                            context5 = context8;
                            str21 = context5.getString(com.squareup.cash.R.string.pi2_governmentid_camera_permission_rationale);
                            str21.getClass();
                        } else {
                            context5 = context8;
                        }
                        String string3 = context5.getString(com.squareup.cash.R.string.pi2_governmentid_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context5));
                        string3.getClass();
                        pOPMatchingFactory2 = pOPMatchingFactory3;
                        context = context6;
                        modalContainerScreen = PermissionsStateKt.withRequestPermissionsIfNeeded(newCameraScreen$default, renderContext, true, permission, false, str20, str21, string3, strings.cameraPermissionsAllowButtonText, strings.cameraPermissionsCancelButtonText, null, null, null, permissionRequestWorkflow, input.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, i6));
                        renderContext2 = renderContext;
                    } else {
                        pOPMatchingFactory2 = pOPMatchingFactory3;
                        context = context6;
                        if (waitForAutocapture.checkAudioPermissions && POPMatchingFactory.isVideoCapture(input) && ContextUtilsKt.isMicPresent(context8)) {
                            videoCaptureConfig2 = videoCaptureConfig;
                            if (videoCaptureConfig2.recordAudio) {
                                permissionRequestWorkflow.getClass();
                                Permission permission2 = Permission.RecordAudio;
                                String str22 = strings.microphonePermissionsTitle;
                                String str23 = str22 == null ? str19 : str22;
                                String str24 = strings.microphonePermissionsPrompt;
                                if (str24 == null) {
                                    str24 = context8.getString(com.squareup.cash.R.string.pi2_selfie_mic_permission_rationale);
                                    str24.getClass();
                                }
                                String string4 = context8.getString(com.squareup.cash.R.string.pi2_selfie_mic_permission_denied_rationale, ContextUtilsKt.getApplicationName(context8));
                                string4.getClass();
                                modalContainerScreen = PermissionsStateKt.withRequestPermissionsIfNeeded(newCameraScreen$default, renderContext, true, permission2, false, str23, str24, string4, strings.microphonePermissionsAllowButtonText, strings.microphonePermissionsCancelButtonText, null, null, null, permissionRequestWorkflow, input.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 2));
                                renderContext2 = renderContext;
                            } else {
                                cameraScreen = newCameraScreen$default;
                            }
                        } else {
                            cameraScreen = newCameraScreen$default;
                            videoCaptureConfig2 = videoCaptureConfig;
                        }
                        if (POPMatchingFactory.videoCaptureMethod(input) == videoCaptureMethod && waitForAutocapture.webRtcState == WebRtcState.Disconnected) {
                            WebRtcWorker webRtcWorker = new WebRtcWorker(captureRenderer.webRtcWorkerFactory.service, videoCaptureConfig2.webRtcJwt);
                            input = input;
                            renderContext2 = renderContext;
                            Workflows.runningWorker(renderContext2, webRtcWorker, Reflection.typeOf(WebRtcWorker.class), str19, new OpenSourceKt$$ExternalSyntheticLambda9(captureRenderer, waitForAutocapture, input, renderContext, 23));
                            modalContainerScreen = new ModalContainerScreen(cameraScreen, "PermissionFlowModal", EmptyList.INSTANCE);
                        } else {
                            renderContext2 = renderContext;
                            input = input;
                            modalContainerScreen = new ModalContainerScreen(cameraScreen, "PermissionFlowModal", EmptyList.INSTANCE);
                        }
                        governmentIdWorkflow = this;
                        autoClassificationSelectCountryAndIdClassScreen = new AlertContainerScreen(modalContainerScreen, arrayList3);
                        pOPMatchingFactory = pOPMatchingFactory2;
                        baseRenderContext = baseRenderContext2;
                        governmentIdState2 = governmentIdState;
                    }
                    input = input;
                    governmentIdWorkflow = this;
                    autoClassificationSelectCountryAndIdClassScreen = new AlertContainerScreen(modalContainerScreen, arrayList3);
                    pOPMatchingFactory = pOPMatchingFactory2;
                    baseRenderContext = baseRenderContext2;
                    governmentIdState2 = governmentIdState;
                } else {
                    context = context6;
                    z2 = z9;
                    int i7 = 1;
                    int i8 = 23;
                    if (governmentIdState instanceof GovernmentIdState.CountdownToCapture) {
                        GovernmentIdState.CountdownToCapture countdownToCapture = (GovernmentIdState.CountdownToCapture) governmentIdState;
                        CaptureConfig captureConfig3 = countdownToCapture.captureConfig;
                        captureRenderer.getClass();
                        pOPMatchingFactory3.getClass();
                        IdPart$SideIdPart idPart$SideIdPart2 = countdownToCapture.currentPart;
                        IdConfig.Side side5 = idPart$SideIdPart2.side;
                        IdConfig.IdSideConfig sideConfig2 = GovernmentIdKt.getSideConfig(captureConfig3, side5);
                        Workflows.runningWorker(renderContext2, captureRenderer.governmentIdHintWorkerFactory.create(side5), Reflection.typeOf(GovernmentIdHintWorker.class), "", new DocumentWorkflow$$ExternalSyntheticLambda7(i8));
                        String captureScreenTitle2 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings, side5, GovernmentIdKt.getIdClassKey(captureConfig3), countdownToCapture.countryCode);
                        String str25 = strings.capturing;
                        IdConfig.Side side6 = idPart$SideIdPart2.side;
                        Screen.CameraScreen.ManualCapture manualCapture2 = Screen.CameraScreen.ManualCapture.Disabled;
                        Screen.Overlay overlay2 = sideConfig2.overlay;
                        IdClass idClass2 = GovernmentIdKt.getIdClass(captureConfig3);
                        NavigationState navigationState2 = captureRenderer.navigationStateManager.getNavigationState();
                        List list3 = sideConfig2.autoCaptureConfig.ruleSet.rules;
                        int i9 = countdownToCapture.partIndex;
                        int i10 = input.imageCaptureCount - 1;
                        SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda43 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 3);
                        VideoCaptureMethod videoCaptureMethod5 = POPMatchingFactory.videoCaptureMethod(input);
                        String textForHint2 = GovernmentIdWorkflowUtilsKt.getTextForHint(strings, countdownToCapture.hint);
                        CameraXController_Factory_Impl cameraXController_Factory_Impl2 = captureRenderer.cameraXControllerFactory;
                        Camera2Controller_Factory_Impl camera2Controller_Factory_Impl2 = captureRenderer.camera2ControllerFactory;
                        final int i11 = 2;
                        input = input;
                        final int i12 = 0;
                        renderContext2 = renderContext;
                        AlertContainerScreen alertContainerScreen = new AlertContainerScreen(new ModalContainerScreen(GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle2, str25, manualCapture2, overlay2, idClass2, side6, navigationState2, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i52 = i11;
                                GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
                                GovernmentIdWorkflow$$ExternalSyntheticLambda5 governmentIdWorkflow$$ExternalSyntheticLambda52 = governmentIdWorkflow$$ExternalSyntheticLambda5;
                                switch (i52) {
                                    case 0:
                                        governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                        break;
                                    case 1:
                                        governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                        break;
                                    case 2:
                                        governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                        break;
                                    default:
                                        governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new CaptureRenderer$$ExternalSyntheticLambda7(renderContext2, pOPMatchingFactory3, 6), true, list3, countdownToCapture, i9, cameraXController_Factory_Impl2, camera2Controller_Factory_Impl2, new WalletHomeViewKt$$ExternalSyntheticLambda4(countdownToCapture, captureRenderer, input, renderContext2, pOPMatchingFactory3, 11), new OpenSourceKt$$ExternalSyntheticLambda9(renderContext, countdownToCapture, input, pOPMatchingFactory3, 24), selfieV1UtilsKt$$ExternalSyntheticLambda43, videoCaptureMethod5, false, null, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i12;
                                POPMatchingFactory pOPMatchingFactory4 = pOPMatchingFactory3;
                                GovernmentIdWorkflow.Input input2 = input;
                                StatefulWorkflow.RenderContext renderContext3 = renderContext2;
                                CaptureRenderer captureRenderer2 = captureRenderer;
                                switch (i72) {
                                    case 0:
                                        Context context9 = captureRenderer2.applicationContext;
                                        pOPMatchingFactory4.getClass();
                                        GovernmentIdWorkflowUtilsKt.handlePermissionChanged(context9, renderContext3, input2, POPMatchingFactory.isVideoCapture(input2));
                                        break;
                                    default:
                                        Context context10 = captureRenderer2.applicationContext;
                                        pOPMatchingFactory4.getClass();
                                        GovernmentIdWorkflowUtilsKt.handlePermissionChanged(context10, renderContext3, input2, POPMatchingFactory.isVideoCapture(input2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, i10, textForHint2, null, null, -1545600768, 1), "PermissionFlowModal", EmptyList.INSTANCE));
                        governmentIdWorkflow = this;
                        pOPMatchingFactory = pOPMatchingFactory3;
                        governmentIdState2 = governmentIdState;
                        autoClassificationSelectCountryAndIdClassScreen = alertContainerScreen;
                        baseRenderContext = baseRenderContext2;
                    } else {
                        boolean z14 = governmentIdState instanceof GovernmentIdState.ReviewCapturedImage;
                        AutoClassifyWorker.Factory factory = this.autoClassifyWorkerFactory;
                        if (z14) {
                            TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, null, 4, null), false, 2, null);
                            GovernmentIdState.ReviewCapturedImage reviewCapturedImage = (GovernmentIdState.ReviewCapturedImage) governmentIdState;
                            String str26 = reviewCapturedImage.countryCode;
                            boolean z15 = reviewCapturedImage.submittingForAutoClassification;
                            CaptureConfig captureConfig4 = reviewCapturedImage.captureConfig;
                            IdPart$SideIdPart idPart$SideIdPart3 = reviewCapturedImage.currentPart;
                            IdConfig.Side side7 = idPart$SideIdPart3.side;
                            IdConfig.IdSideConfig sideConfig3 = GovernmentIdKt.getSideConfig(captureConfig4, side7);
                            Frame frame = (Frame) CollectionsKt.first(reviewCapturedImage.idForReview.getFrames());
                            if (z15) {
                                ReviewScreenUtilsKt.runAutoClassificationWorker(input, (GovernmentIdState.ReviewImageState) governmentIdState, renderContext2, pOPMatchingFactory3, factory);
                            }
                            String idClassKey2 = GovernmentIdKt.getIdClassKey(captureConfig4);
                            strings.getClass();
                            idClassKey2.getClass();
                            String text2 = strings.confirmCapture.getText(str26, idClassKey2, side7);
                            String str27 = text2 == null ? "" : text2;
                            String str28 = strings.captureDisclaimer;
                            Screen.Overlay overlay3 = sideConfig3.overlay;
                            IdConfig.Side side8 = idPart$SideIdPart3.side;
                            IdClass idClass3 = GovernmentIdKt.getIdClass(captureConfig4);
                            String str29 = frame.absoluteFilePath;
                            NavigationState navigationState3 = navigationStateManager.getNavigationState();
                            String str30 = strings.buttonSubmit;
                            String str31 = strings.buttonRetake;
                            String text3 = strings.confirmCaptureTitle.getText(str26, GovernmentIdKt.getIdClassKey(captureConfig4), side7);
                            String str32 = text3 == null ? "" : text3;
                            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = input.styles;
                            String str33 = reviewCapturedImage.error;
                            NextStep.GovernmentId.AssetConfig.CapturePage capturePage = assetConfig.getCapturePage();
                            boolean z16 = z6 && !z15;
                            boolean z17 = reviewCapturedImage.submittingForAutoClassification;
                            StyleElements.Axis axis = input.reviewCaptureButtonsAxis;
                            DesignVersion designVersion = input.designVersion;
                            GovernmentIdWorkflow$$ExternalSyntheticLambda6 governmentIdWorkflow$$ExternalSyntheticLambda62 = new GovernmentIdWorkflow$$ExternalSyntheticLambda6(input, governmentIdState, renderContext, this, 0);
                            renderContext2 = renderContext;
                            ta$$ExternalSyntheticLambda1 ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(this, renderContext2, governmentIdState, input, captureConfig4, 20);
                            governmentIdState = governmentIdState;
                            input = input;
                            final int i13 = 0;
                            AlertContainerScreen alertContainerScreen2 = new AlertContainerScreen(new ModalContainerScreen(new Screen.ReviewScreen(this.imageLoader, str27, str28, overlay3, str29, side8, idClass3, navigationState3, governmentIdWorkflow$$ExternalSyntheticLambda62, str30, ta__externalsyntheticlambda1, str31, str32, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i52 = i13;
                                    GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
                                    GovernmentIdWorkflow$$ExternalSyntheticLambda5 governmentIdWorkflow$$ExternalSyntheticLambda52 = governmentIdWorkflow$$ExternalSyntheticLambda5;
                                    switch (i52) {
                                        case 0:
                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                            break;
                                        case 1:
                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                            break;
                                        case 2:
                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                            break;
                                        default:
                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, governmentIdStepStyle, str33, new GovernmentIdWorkflow$$ExternalSyntheticLambda9(renderContext2, this, governmentIdState, i13), capturePage, z16, z17, axis, designVersion, false, ScreenTransition.SLIDE_IN), "PermissionFlowModal", EmptyList.INSTANCE));
                            governmentIdWorkflow = this;
                            autoClassificationSelectCountryAndIdClassScreen = alertContainerScreen2;
                            pOPMatchingFactory = pOPMatchingFactory3;
                            baseRenderContext = baseRenderContext2;
                            context2 = context;
                        } else {
                            governmentIdState = governmentIdState;
                            if (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) {
                                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, null, 4, null), false, 2, null);
                                GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) governmentIdState;
                                GovernmentId governmentId = reviewSelectedImage.idForReview;
                                IdPart$SideIdPart idPart$SideIdPart4 = reviewSelectedImage.currentPart;
                                if (reviewSelectedImage.submittingForAutoClassification) {
                                    ReviewScreenUtilsKt.runAutoClassificationWorker(input, (GovernmentIdState.ReviewImageState) governmentIdState, renderContext2, pOPMatchingFactory3, factory);
                                }
                                String str34 = (String) strings.reviewSelectedImageTitle.get(idPart$SideIdPart4.side);
                                if (str34 == null) {
                                    context3 = context;
                                    str34 = context3.getString(com.squareup.cash.R.string.pi2_governmentid_review_selected_image_title_default);
                                    str34.getClass();
                                } else {
                                    context3 = context;
                                }
                                String str35 = str34;
                                String str36 = (String) strings.reviewSelectedImageBody.get(idPart$SideIdPart4.side);
                                if (str36 == null) {
                                    str36 = context3.getString(com.squareup.cash.R.string.pi2_governmentid_review_selected_image_body_default);
                                    str36.getClass();
                                }
                                String str37 = str36;
                                String str38 = strings.reviewSelectedImageConfirmButton;
                                String str39 = strings.reviewSelectedImageChooseAnotherButton;
                                String str40 = ((Frame) CollectionsKt.first(governmentId.getFrames())).absoluteFilePath;
                                String str41 = ((Frame) CollectionsKt.first(governmentId.getFrames())).mimeType;
                                String str42 = reviewSelectedImage.fileName;
                                NavigationState navigationState4 = navigationStateManager.getNavigationState();
                                String str43 = reviewSelectedImage.error;
                                boolean z18 = reviewSelectedImage.submittingForAutoClassification;
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = input.styles;
                                GovernmentIdWorkflow$$ExternalSyntheticLambda6 governmentIdWorkflow$$ExternalSyntheticLambda63 = new GovernmentIdWorkflow$$ExternalSyntheticLambda6(input, governmentIdState, renderContext2, this, 1);
                                input = input;
                                governmentIdState = governmentIdState;
                                renderContext2 = renderContext2;
                                int i14 = 1;
                                ReviewSelectedImageView reviewSelectedImageView = new ReviewSelectedImageView(this.imageLoader, str35, str37, str38, str39, str40, str41, str42, navigationState4, governmentIdWorkflow$$ExternalSyntheticLambda63, new GovernmentIdWorkflow$$ExternalSyntheticLambda0(renderContext2, this, i7), new GovernmentIdWorkflow$$ExternalSyntheticLambda0(renderContext2, this, 2), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, i14), str43, new GovernmentIdWorkflow$$ExternalSyntheticLambda9(renderContext2, this, governmentIdState, i14), governmentIdStepStyle2, z18);
                                governmentIdWorkflow = this;
                                pOPMatchingFactory = pOPMatchingFactory3;
                                context2 = context3;
                                baseRenderContext = baseRenderContext2;
                                autoClassificationSelectCountryAndIdClassScreen = reviewSelectedImageView;
                            } else {
                                if (!(governmentIdState instanceof GovernmentIdState.Submit)) {
                                    if (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) {
                                        GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (GovernmentIdState.FinalizeLocalVideoCapture) governmentIdState;
                                        UnleashContext unleashContext = this.localVideoCaptureRenderer;
                                        unleashContext.getClass();
                                        pOPMatchingFactory3.getClass();
                                        baseRenderContext = baseRenderContext2;
                                        baseRenderContext.runningSideEffect("finalize_delay", new TransitionWorker$run$1(finalizeLocalVideoCapture, renderContext2, null, 7));
                                        IdPart$SideIdPart idPart$SideIdPart5 = finalizeLocalVideoCapture.currentPart;
                                        IdConfig idConfig3 = finalizeLocalVideoCapture.id;
                                        if (idPart$SideIdPart5 == null) {
                                            idPart$SideIdPart5 = null;
                                        }
                                        if (idPart$SideIdPart5 == null || (side2 = idPart$SideIdPart5.side) == null) {
                                            side2 = IdConfig.Side.Front;
                                        }
                                        IdConfig.Side side9 = side2;
                                        IdConfig.IdSideConfig sideConfig4 = idConfig3.getSideConfig(side9);
                                        String captureScreenTitle3 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings, side9, idConfig3.idClassKey, finalizeLocalVideoCapture.countryCode);
                                        String str44 = strings.capturing;
                                        Screen.CameraScreen.ManualCapture manualCapture3 = Screen.CameraScreen.ManualCapture.Disabled;
                                        IdClass idClass4 = idConfig3.f1453type;
                                        Screen.Overlay overlay4 = sideConfig4.overlay;
                                        NavigationState navigationState5 = ((NavigationStateManager) unleashContext.properties).getNavigationState();
                                        EmptyList emptyList = EmptyList.INSTANCE;
                                        context2 = context;
                                        governmentIdState2 = governmentIdState;
                                        pOPMatchingFactory = pOPMatchingFactory3;
                                        autoClassificationSelectCountryAndIdClassScreen = new AlertContainerScreen(new ModalContainerScreen(GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle3, str44, manualCapture3, overlay4, idClass4, side9, navigationState5, new Equals$$ExternalSyntheticLambda0(12), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 7), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 8), false, emptyList, finalizeLocalVideoCapture, finalizeLocalVideoCapture.partIndex, (CameraXController_Factory_Impl) unleashContext.sessionId, (Camera2Controller_Factory_Impl) unleashContext.remoteAddress, null, new DocumentWorkflow$$ExternalSyntheticLambda7(28), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 3), VideoCaptureMethod.Upload, finalizeLocalVideoCapture.isDelayComplete, new StripeThemeKt$$ExternalSyntheticLambda0(finalizeLocalVideoCapture, renderContext2, input, pOPMatchingFactory, 2), new ShimmerThemeKt$$ExternalSyntheticLambda0(18), new UiScreenRunner$$ExternalSyntheticLambda29(8, unleashContext, renderContext2, input), 0, null, null, null, -1342046208, 1), "PermissionFlowModal", emptyList));
                                        str6 = null;
                                        governmentIdWorkflow = this;
                                    } else {
                                        pOPMatchingFactory = pOPMatchingFactory3;
                                        context2 = context;
                                        baseRenderContext = baseRenderContext2;
                                        governmentIdState2 = governmentIdState;
                                        if (governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) {
                                            GovernmentIdState.FinalizeWebRtc finalizeWebRtc = (GovernmentIdState.FinalizeWebRtc) governmentIdState2;
                                            WebRtcRenderer webRtcRenderer = this.webRtcRenderer;
                                            webRtcRenderer.getClass();
                                            pOPMatchingFactory.getClass();
                                            IdPart$SideIdPart idPart$SideIdPart6 = finalizeWebRtc.currentPart;
                                            IdConfig idConfig4 = finalizeWebRtc.id;
                                            if (idPart$SideIdPart6 == null) {
                                                idPart$SideIdPart6 = null;
                                            }
                                            if (idPart$SideIdPart6 == null || (side = idPart$SideIdPart6.side) == null) {
                                                side = IdConfig.Side.Front;
                                            }
                                            IdConfig.IdSideConfig sideConfig5 = idConfig4.getSideConfig(side);
                                            String captureScreenTitle4 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings, side, idConfig4.idClassKey, finalizeWebRtc.countryCode);
                                            String str45 = strings.capturing;
                                            Screen.CameraScreen.ManualCapture manualCapture4 = Screen.CameraScreen.ManualCapture.Disabled;
                                            IdClass idClass5 = idConfig4.f1453type;
                                            Screen.Overlay overlay5 = sideConfig5.overlay;
                                            NavigationState navigationState6 = webRtcRenderer.navigationStateManager.getNavigationState();
                                            EmptyList emptyList2 = EmptyList.INSTANCE;
                                            autoClassificationSelectCountryAndIdClassScreen = new AlertContainerScreen(new ModalContainerScreen(GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle4, str45, manualCapture4, overlay5, idClass5, side, navigationState6, new Equals$$ExternalSyntheticLambda0(13), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 9), new CaptureRenderer$$ExternalSyntheticLambda7(renderContext2, pOPMatchingFactory, 8), false, emptyList2, finalizeWebRtc, finalizeWebRtc.partIndex, webRtcRenderer.cameraXControllerFactory, webRtcRenderer.camera2ControllerFactory, null, new SelfieWorkflow$$ExternalSyntheticLambda79(2), new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 3), VideoCaptureMethod.Stream, false, null, new ShimmerThemeKt$$ExternalSyntheticLambda0(19), new UiScreenRunner$$ExternalSyntheticLambda29(9, webRtcRenderer, renderContext2, input), 0, null, null, null, -1316880384, 1), "PermissionFlowModal", emptyList2));
                                            governmentIdWorkflow = this;
                                            str6 = null;
                                        } else if (governmentIdState2 instanceof GovernmentIdState.HolographicTorchDelay) {
                                            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = (GovernmentIdState.HolographicTorchDelay) governmentIdState2;
                                            captureRenderer.getClass();
                                            pOPMatchingFactory.getClass();
                                            baseRenderContext.runningSideEffect("holographic_torch_delay", new FlowKt__LimitKt$transformWhile$1(holographicTorchDelay, renderContext2, input, pOPMatchingFactory, null, 7));
                                            IdConfig.Side side10 = holographicTorchDelay.currentPart.side;
                                            IdConfig idConfig5 = holographicTorchDelay.id;
                                            IdConfig.IdSideConfig sideConfig6 = idConfig5.getSideConfig(side10);
                                            String captureScreenTitle5 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings, side10, idConfig5.idClassKey, holographicTorchDelay.countryCode);
                                            String str46 = strings.capturing;
                                            Screen.CameraScreen.ManualCapture manualCapture5 = Screen.CameraScreen.ManualCapture.Disabled;
                                            Screen.Overlay overlay6 = sideConfig6.overlay;
                                            IdClass idClass6 = idConfig5.f1453type;
                                            NavigationState navigationState7 = captureRenderer.navigationStateManager.getNavigationState();
                                            EmptyList emptyList3 = EmptyList.INSTANCE;
                                            final int i15 = 1;
                                            governmentIdWorkflow = this;
                                            autoClassificationSelectCountryAndIdClassScreen = new AlertContainerScreen(new ModalContainerScreen(GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle5, str46, manualCapture5, overlay6, idClass6, side10, navigationState7, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda8
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i52 = i15;
                                                    GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
                                                    GovernmentIdWorkflow$$ExternalSyntheticLambda5 governmentIdWorkflow$$ExternalSyntheticLambda52 = governmentIdWorkflow$$ExternalSyntheticLambda5;
                                                    switch (i52) {
                                                        case 0:
                                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                                            break;
                                                        case 1:
                                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                                            break;
                                                        case 2:
                                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                                            break;
                                                        default:
                                                            governmentIdWorkflow$$ExternalSyntheticLambda52.send(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, new CaptureRenderer$$ExternalSyntheticLambda7(renderContext2, pOPMatchingFactory, 5), false, emptyList3, holographicTorchDelay, holographicTorchDelay.partIndex, captureRenderer.cameraXControllerFactory, captureRenderer.camera2ControllerFactory, null, null, new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 3), POPMatchingFactory.videoCaptureMethod(input), false, null, null, new HeroCardViewKt$$ExternalSyntheticLambda9(23, captureRenderer, renderContext2, input), 0, null, null, null, 870711552, 1), "PermissionFlowModal", emptyList3));
                                            str6 = null;
                                        } else {
                                            governmentIdWorkflow = this;
                                            AutoClassificationRenderer autoClassificationRenderer = governmentIdWorkflow.autoClassificationRenderer;
                                            if (z) {
                                                AutoClassificationErrorType autoClassificationErrorType = ((GovernmentIdState.AutoClassificationError) governmentIdState2).errorType;
                                                autoClassificationRenderer.getClass();
                                                pOPMatchingFactory.getClass();
                                                int ordinal = autoClassificationErrorType.ordinal();
                                                if (ordinal != 0) {
                                                    i = 1;
                                                    if (ordinal != 1) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    str2 = strings.unableToClassifyDocumentTitle;
                                                } else {
                                                    i = 1;
                                                    str2 = strings.idClassRejectedTitle;
                                                }
                                                String str47 = str2;
                                                int ordinal2 = autoClassificationErrorType.ordinal();
                                                if (ordinal2 == 0) {
                                                    str3 = strings.idClassRejectedContinueButtonText;
                                                } else {
                                                    if (ordinal2 != i) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    str3 = strings.unableToClassifyDocumentContinueButtonText;
                                                }
                                                str6 = null;
                                                autoClassificationSelectCountryAndIdClassScreen = new ErrorView(str47, str3, input.styles, autoClassificationRenderer.navigationStateManager.getNavigationState(), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 5), new CaptureRenderer$$ExternalSyntheticLambda7(renderContext2, pOPMatchingFactory, 3), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 6));
                                            } else {
                                                if (!(governmentIdState2 instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = (GovernmentIdState.AutoClassificationManualSelect) governmentIdState2;
                                                autoClassificationRenderer.getClass();
                                                pOPMatchingFactory.getClass();
                                                String str48 = autoClassificationManualSelect.selectedCountryCode;
                                                String str49 = autoClassificationManualSelect.selectedIdClass;
                                                List list4 = autoClassificationManualSelect.idConfigsForCountry;
                                                if (str48 == null) {
                                                    randomAccess = EmptyList.INSTANCE;
                                                } else {
                                                    Iterator it4 = list4.iterator();
                                                    while (true) {
                                                        if (!it4.hasNext()) {
                                                            obj3 = null;
                                                            break;
                                                        }
                                                        obj3 = it4.next();
                                                        if (Intrinsics.areEqual(((IdConfigForCountry) obj3).countryCode, str48)) {
                                                            break;
                                                        }
                                                    }
                                                    IdConfigForCountry idConfigForCountry = (IdConfigForCountry) obj3;
                                                    randomAccess = idConfigForCountry != null ? idConfigForCountry.ids : EmptyList.INSTANCE;
                                                }
                                                EmptyList emptyList4 = (Iterable) randomAccess;
                                                str6 = null;
                                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList4, 10));
                                                Iterator it5 = emptyList4.iterator();
                                                while (it5.hasNext()) {
                                                    IdConfig idConfig6 = (IdConfig) it5.next();
                                                    POPMatchingFactory pOPMatchingFactory4 = pOPMatchingFactory;
                                                    EmptyList emptyList5 = emptyList4;
                                                    List list5 = strings.localizationOverrides;
                                                    if (list5 != null) {
                                                        String str50 = idConfig6.idClassKey;
                                                        Iterator it6 = list5.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                it = it5;
                                                                list = list4;
                                                                obj5 = null;
                                                                break;
                                                            }
                                                            obj5 = it6.next();
                                                            NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj5;
                                                            it = it5;
                                                            list = list4;
                                                            if (StringsKt__StringsJVMKt.equals(localizationOverride.getCountryCode(), str48, true) && Intrinsics.areEqual(localizationOverride.getPage(), "selectPage") && ((Intrinsics.areEqual(localizationOverride.getIdClass(), str50) || localizationOverride.getIdClass() == null) && Intrinsics.areEqual(localizationOverride.getKey(), str50))) {
                                                                break;
                                                            }
                                                            it5 = it;
                                                            list4 = list;
                                                        }
                                                        NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) obj5;
                                                        str = localizationOverride2 != null ? localizationOverride2.getText() : null;
                                                        if (str != null) {
                                                            arrayList4.add(new Option(str, idConfig6.idClassKey));
                                                            emptyList4 = emptyList5;
                                                            it5 = it;
                                                            list4 = list;
                                                            pOPMatchingFactory = pOPMatchingFactory4;
                                                        }
                                                    } else {
                                                        it = it5;
                                                        list = list4;
                                                    }
                                                    str = (String) strings.idClassToName.get(idConfig6.idClassKey);
                                                    if (str == null) {
                                                        str = idConfig6.idClassKey;
                                                    }
                                                    arrayList4.add(new Option(str, idConfig6.idClassKey));
                                                    emptyList4 = emptyList5;
                                                    it5 = it;
                                                    list4 = list;
                                                    pOPMatchingFactory = pOPMatchingFactory4;
                                                }
                                                POPMatchingFactory pOPMatchingFactory5 = pOPMatchingFactory;
                                                EmptyList emptyList6 = emptyList4;
                                                List list6 = list4;
                                                if (str49 == null) {
                                                    idConfig = null;
                                                } else {
                                                    Iterator it7 = emptyList6.iterator();
                                                    while (true) {
                                                        if (!it7.hasNext()) {
                                                            obj4 = null;
                                                            break;
                                                        }
                                                        obj4 = it7.next();
                                                        if (Intrinsics.areEqual(((IdConfig) obj4).idClassKey, str49)) {
                                                            break;
                                                        }
                                                    }
                                                    idConfig = (IdConfig) obj4;
                                                }
                                                String str51 = strings.manualClassificationTitle;
                                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = input.styles;
                                                List list7 = list6;
                                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                                Iterator it8 = list7.iterator();
                                                while (it8.hasNext()) {
                                                    IdConfigForCountry idConfigForCountry2 = (IdConfigForCountry) it8.next();
                                                    Iterator it9 = it8;
                                                    String str52 = idConfigForCountry2.countryCode;
                                                    arrayList5.add(new Screen.AutoClassificationSelectCountryAndIdClassScreen.CountryOption(str52, idConfigForCountry2.countryName, AnimatorSetCompat.countryCodeToFlagEmoji(str52)));
                                                    it8 = it9;
                                                    str51 = str51;
                                                }
                                                String str53 = str51;
                                                String str54 = autoClassificationManualSelect.selectedCountryCode;
                                                String str55 = autoClassificationManualSelect.selectedIdClass;
                                                String str56 = strings.countryInputTitle;
                                                String str57 = strings.idClassInputTitle;
                                                String str58 = strings.manualClassificationContinueButtonText;
                                                boolean z19 = idConfig != null;
                                                NavigationState navigationState8 = autoClassificationRenderer.navigationStateManager.getNavigationState();
                                                DesignVersion designVersion2 = input.designVersion;
                                                SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda44 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 4);
                                                SelfieV1UtilsKt$$ExternalSyntheticLambda4 selfieV1UtilsKt$$ExternalSyntheticLambda45 = new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext2, 5);
                                                ta$$ExternalSyntheticLambda1 ta__externalsyntheticlambda12 = new ta$$ExternalSyntheticLambda1(idConfig, autoClassificationManualSelect, renderContext2, input, pOPMatchingFactory5, 21);
                                                renderContext2 = renderContext2;
                                                input = input;
                                                pOPMatchingFactory = pOPMatchingFactory5;
                                                autoClassificationSelectCountryAndIdClassScreen = new Screen.AutoClassificationSelectCountryAndIdClassScreen(str53, governmentIdStepStyle3, arrayList5, str54, arrayList4, str55, str56, str57, str58, z19, navigationState8, designVersion2, selfieV1UtilsKt$$ExternalSyntheticLambda44, selfieV1UtilsKt$$ExternalSyntheticLambda45, ta__externalsyntheticlambda12, new CaptureRenderer$$ExternalSyntheticLambda7(renderContext2, pOPMatchingFactory, 2), new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 4), ScreenTransition.SLIDE_IN);
                                            }
                                        }
                                    }
                                    z3 = governmentIdState2 instanceof GovernmentIdState.CountdownToCapture;
                                    if (!z3 || (governmentIdState2 instanceof GovernmentIdState.ReviewCapturedImage) || (governmentIdState2 instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState2 instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState2 instanceof GovernmentIdState.HolographicTorchDelay)) {
                                        str5 = "camera_screen";
                                    } else {
                                        if (!(governmentIdState2 instanceof GovernmentIdState.ChooseCaptureMethod) && !(governmentIdState2 instanceof GovernmentIdState.ReviewSelectedImage) && !z2 && !(governmentIdState2 instanceof GovernmentIdState.Submit) && !z && !(governmentIdState2 instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return str6;
                                        }
                                        str5 = str6;
                                    }
                                    if (str5 != null) {
                                        autoClassificationSelectCountryAndIdClassScreen = new Named(autoClassificationSelectCountryAndIdClassScreen, str5);
                                    }
                                    if (!z3 && !(governmentIdState2 instanceof GovernmentIdState.FinalizeWebRtc) && !(governmentIdState2 instanceof GovernmentIdState.WaitForAutocapture) && !(governmentIdState2 instanceof GovernmentIdState.FinalizeLocalVideoCapture) && !(governmentIdState2 instanceof GovernmentIdState.HolographicTorchDelay)) {
                                        if ((governmentIdState2 instanceof GovernmentIdState.ChooseCaptureMethod) && !(governmentIdState2 instanceof GovernmentIdState.ReviewSelectedImage) && !z2 && !(governmentIdState2 instanceof GovernmentIdState.Submit) && !(governmentIdState2 instanceof GovernmentIdState.ReviewCapturedImage) && !z && !(governmentIdState2 instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return str6;
                                        }
                                        baseRenderContext.runningSideEffect("close_camera", new HazeSourceNode$launchPreDraw$1(governmentIdWorkflow, str6, 13));
                                    }
                                    pOPMatchingFactory.getClass();
                                    if (!POPMatchingFactory.webRtcConfigIsValid(input) && ContextUtilsKt.isDebugBuild(context2)) {
                                        baseRenderContext.runningSideEffect("output_webrtc_error", new InquiryViewModel.AnonymousClass1(renderContext2, governmentIdWorkflow, null, 19));
                                    }
                                    return new ScreenWithTransition(autoClassificationSelectCountryAndIdClassScreen, governmentIdState2.didGoBack ? ScreenTransition.SLIDE_OUT : ScreenTransition.SLIDE_IN);
                                }
                                GovernmentIdState.Submit submit = (GovernmentIdState.Submit) governmentIdState;
                                Workflows.runningWorker(renderContext2, this.submitVerificationWorkerFactory.create(input.sessionToken, input.inquiryId, input.fromComponent, input.fromStep, submit.governmentIdRequestArguments, submit.webRtcObjectId, submit.cameraProperties), Reflection.typeOf(SubmitVerificationWorker.class), "", new GovernmentIdWorkflow$$ExternalSyntheticLambda15(this, renderContext2, 0));
                                NavigationStateManager.setState$default(navigationStateManager, false, false, false, 12);
                                governmentIdWorkflow = this;
                                pOPMatchingFactory = pOPMatchingFactory3;
                                context2 = context;
                                autoClassificationSelectCountryAndIdClassScreen = new Screen.SubmittingScreen(strings.processingTitle, strings.processingDescription, input.styles, assetConfig.getPendingPage(), navigationStateManager.getNavigationState(), new GovernmentIdWorkflow$$ExternalSyntheticLambda0(this, renderContext2, 4), new GovernmentIdWorkflow$$ExternalSyntheticLambda0(this, renderContext2, 5), input.pendingPageTextVerticalPosition, (ScreenTransition) null, 768);
                                baseRenderContext = baseRenderContext2;
                            }
                        }
                        str6 = null;
                    }
                }
                context2 = context;
                str6 = null;
                z3 = governmentIdState2 instanceof GovernmentIdState.CountdownToCapture;
                if (z3) {
                }
                str5 = "camera_screen";
                if (str5 != null) {
                }
                if (!z3) {
                    if (governmentIdState2 instanceof GovernmentIdState.ChooseCaptureMethod) {
                    }
                    baseRenderContext.runningSideEffect("close_camera", new HazeSourceNode$launchPreDraw$1(governmentIdWorkflow, str6, 13));
                }
                pOPMatchingFactory.getClass();
                if (!POPMatchingFactory.webRtcConfigIsValid(input)) {
                    baseRenderContext.runningSideEffect("output_webrtc_error", new InquiryViewModel.AnonymousClass1(renderContext2, governmentIdWorkflow, null, 19));
                }
                return new ScreenWithTransition(autoClassificationSelectCountryAndIdClassScreen, governmentIdState2.didGoBack ? ScreenTransition.SLIDE_OUT : ScreenTransition.SLIDE_IN);
            }
            GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
            String str59 = chooseCaptureMethod.countryCode;
            IdPart$SideIdPart idPart$SideIdPart7 = chooseCaptureMethod.currentPart;
            CaptureConfig captureConfig5 = chooseCaptureMethod.captureConfig;
            if (chooseCaptureMethod.choosingDocumentToUpload) {
                captureConfig = captureConfig5;
                z = z8;
                Workflows.runningWorker(renderContext2, this.documentSelectWorker, Reflection.typeOf(DocumentSelectWorker.class), "", new SelfieWorkflow$$ExternalSyntheticLambda38(9, this, idPart$SideIdPart7, governmentIdState));
            } else {
                captureConfig = captureConfig5;
                z = z8;
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = assetConfig.getPromptPage();
            List list8 = input.enabledCaptureOptionsNativeMobile;
            IdConfig.Side side11 = idPart$SideIdPart7.side;
            String text4 = strings.chooseCaptureMethodTitle.getText(str59, GovernmentIdKt.getIdClassKey(captureConfig), side11);
            if (text4 == null) {
                text4 = context6.getString(com.squareup.cash.R.string.pi2_governmentid_choose_capture_method_title_default);
                text4.getClass();
            }
            String str60 = text4;
            String text5 = strings.chooseCaptureMethodBody.getText(str59, GovernmentIdKt.getIdClassKey(captureConfig), side11);
            if (text5 == null) {
                text5 = context6.getString(com.squareup.cash.R.string.pi2_governmentid_choose_capture_method_body_default);
                text5.getClass();
            }
            String str61 = text5;
            String str62 = strings.chooseCaptureMethodCameraButton;
            String str63 = strings.chooseCaptureMethodUploadButton;
            NavigationState navigationState9 = navigationStateManager.getNavigationState();
            GovernmentIdWorkflow$$ExternalSyntheticLambda6 governmentIdWorkflow$$ExternalSyntheticLambda64 = new GovernmentIdWorkflow$$ExternalSyntheticLambda6(renderContext2, governmentIdState, input, this);
            GovernmentIdWorkflow$$ExternalSyntheticLambda9 governmentIdWorkflow$$ExternalSyntheticLambda9 = new GovernmentIdWorkflow$$ExternalSyntheticLambda9(renderContext2, this, governmentIdState, 3);
            GovernmentIdWorkflow$$ExternalSyntheticLambda0 governmentIdWorkflow$$ExternalSyntheticLambda0 = new GovernmentIdWorkflow$$ExternalSyntheticLambda0(renderContext2, this, 6);
            SelfieWorkflow$$ExternalSyntheticLambda2 selfieWorkflow$$ExternalSyntheticLambda22 = new SelfieWorkflow$$ExternalSyntheticLambda2(renderContext2, 3);
            String str64 = chooseCaptureMethod.error;
            GovernmentIdWorkflow$$ExternalSyntheticLambda9 governmentIdWorkflow$$ExternalSyntheticLambda92 = new GovernmentIdWorkflow$$ExternalSyntheticLambda9(renderContext2, this, governmentIdState, 4);
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle4 = input.styles;
            int ordinal3 = side11.ordinal();
            if (ordinal3 != 0) {
                selfieWorkflow$$ExternalSyntheticLambda2 = selfieWorkflow$$ExternalSyntheticLambda22;
                if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        if (ordinal3 != 3) {
                            if (ordinal3 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                                remoteImage = idFrontPictograph;
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                            remoteImage = idFrontPictograph;
                        }
                    }
                    remoteImage = null;
                } else {
                    if (promptPage != null) {
                        idFrontPictograph = promptPage.getIdBackPictograph();
                        remoteImage = idFrontPictograph;
                    }
                    remoteImage = null;
                }
            } else {
                selfieWorkflow$$ExternalSyntheticLambda2 = selfieWorkflow$$ExternalSyntheticLambda22;
                if (GovernmentIdKt.getIdClass(captureConfig) == IdClass.Passport) {
                    if (promptPage != null) {
                        idFrontPictograph = promptPage.getPassportFrontPictograph();
                        remoteImage = idFrontPictograph;
                    }
                    remoteImage = null;
                } else {
                    if (promptPage != null) {
                        idFrontPictograph = promptPage.getIdFrontPictograph();
                        remoteImage = idFrontPictograph;
                    }
                    remoteImage = null;
                }
            }
            int ordinal4 = side11.ordinal();
            int i16 = com.squareup.cash.R.raw.pi2_upload_gov_id_front_lottie;
            if (ordinal4 != 0) {
                governmentIdWorkflow$$ExternalSyntheticLambda6 = governmentIdWorkflow$$ExternalSyntheticLambda64;
                if (ordinal4 == 1 || ordinal4 == 3) {
                    i16 = com.squareup.cash.R.raw.pi2_upload_gov_id_back_lottie;
                }
            } else {
                governmentIdWorkflow$$ExternalSyntheticLambda6 = governmentIdWorkflow$$ExternalSyntheticLambda64;
                if (GovernmentIdKt.getIdClass(captureConfig) == IdClass.Passport) {
                    i16 = com.squareup.cash.R.raw.pi2_upload_gov_id_passport_lottie;
                }
            }
            ChooseCaptureMethodView chooseCaptureMethodView = new ChooseCaptureMethodView(list8, str60, str61, str62, str63, navigationState9, governmentIdWorkflow$$ExternalSyntheticLambda6, governmentIdWorkflow$$ExternalSyntheticLambda9, governmentIdWorkflow$$ExternalSyntheticLambda0, selfieWorkflow$$ExternalSyntheticLambda2, str64, governmentIdWorkflow$$ExternalSyntheticLambda92, governmentIdStepStyle4, remoteImage, i16);
            governmentIdWorkflow = this;
            baseRenderContext = baseRenderContext2;
            pOPMatchingFactory = pOPMatchingFactory3;
            z2 = z9;
            autoClassificationSelectCountryAndIdClassScreen = chooseCaptureMethodView;
            context2 = context6;
        }
        governmentIdState2 = governmentIdState;
        z3 = governmentIdState2 instanceof GovernmentIdState.CountdownToCapture;
        if (z3) {
        }
        str5 = "camera_screen";
        if (str5 != null) {
        }
        if (!z3) {
        }
        pOPMatchingFactory.getClass();
        if (!POPMatchingFactory.webRtcConfigIsValid(input)) {
        }
        return new ScreenWithTransition(autoClassificationSelectCountryAndIdClassScreen, governmentIdState2.didGoBack ? ScreenTransition.SLIDE_OUT : ScreenTransition.SLIDE_IN);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        GovernmentIdState governmentIdState = (GovernmentIdState) obj;
        governmentIdState.getClass();
        for (GovernmentIdState governmentIdState2 = governmentIdState; governmentIdState2 != null; governmentIdState2 = governmentIdState2.getBackState$government_id_release()) {
            if ((governmentIdState2 instanceof GovernmentIdState.AutoClassificationError) || (governmentIdState2 instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                return null;
            }
        }
        return SnapshotParcelsKt.toSnapshot(governmentIdState);
    }
}
