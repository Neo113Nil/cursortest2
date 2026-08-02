package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import coil3.RealImageLoader;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda5;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface Screen {

    public final class AutoClassificationSelectCountryAndIdClassScreen implements Screen {
        public final String continueButtonText;
        public final String countryInputTitle;
        public final ArrayList countryOptions;
        public final DesignVersion designVersion;
        public final String idClassInputTitle;
        public final ArrayList idClassOptions;
        public final boolean isContinueEnabled;
        public final String manualClassificationTitle;
        public final NavigationState navigationState;
        public final Function0 onBackClick;
        public final Function0 onCancelClick;
        public final Function0 onContinueClick;
        public final Function1 onCountrySelected;
        public final Function1 onIdClassSelected;
        public final String selectedCountryCode;
        public final String selectedIdClass;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final ScreenTransition transition;

        public final class CountryOption {
            public final String countryCode;
            public final String countryName;
            public final String flagEmoji;

            public CountryOption(String str, String str2, String str3) {
                str.getClass();
                str2.getClass();
                this.countryCode = str;
                this.countryName = str2;
                this.flagEmoji = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CountryOption)) {
                    return false;
                }
                CountryOption countryOption = (CountryOption) obj;
                return Intrinsics.areEqual(this.countryCode, countryOption.countryCode) && Intrinsics.areEqual(this.countryName, countryOption.countryName) && this.flagEmoji.equals(countryOption.flagEmoji);
            }

            public final int hashCode() {
                return this.flagEmoji.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.countryCode.hashCode() * 31, 31, this.countryName);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CountryOption(countryCode=", this.countryCode, ", countryName=", this.countryName, ", flagEmoji="), this.flagEmoji, ")");
            }
        }

        public AutoClassificationSelectCountryAndIdClassScreen(String str, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, ArrayList arrayList, String str2, ArrayList arrayList2, String str3, String str4, String str5, String str6, boolean z, NavigationState navigationState, DesignVersion designVersion, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, ScreenTransition screenTransition) {
            navigationState.getClass();
            designVersion.getClass();
            screenTransition.getClass();
            this.manualClassificationTitle = str;
            this.styles = governmentIdStepStyle;
            this.countryOptions = arrayList;
            this.selectedCountryCode = str2;
            this.idClassOptions = arrayList2;
            this.selectedIdClass = str3;
            this.countryInputTitle = str4;
            this.idClassInputTitle = str5;
            this.continueButtonText = str6;
            this.isContinueEnabled = z;
            this.navigationState = navigationState;
            this.designVersion = designVersion;
            this.onCountrySelected = function1;
            this.onIdClassSelected = function12;
            this.onContinueClick = function0;
            this.onBackClick = function02;
            this.onCancelClick = function03;
            this.transition = screenTransition;
        }
    }

    public final class CameraScreen implements Screen {
        public final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;
        public final Function2 autoCapture;
        public final List autoCaptureRules;
        public final int autoCaptureRulesId;
        public final boolean autoCapturing;
        public final Function0 back;
        public final Camera2Controller_Factory_Impl camera2ControllerFactory;
        public final CameraXController_Factory_Impl cameraXControllerFactory;
        public final ManualCapture captureButtonState;
        public final IdConfig.Side captureSide;
        public final CaptureTipsViewModel captureTips;
        public final Function0 checkPermissions;
        public final Function0 close;
        public final DesignVersion designVersion;
        public final String disclaimer;
        public final boolean enableAnalyzer;
        public final boolean finalizeLocalVideo;
        public final String hintText;
        public final boolean holographicTorchEnabled;
        public final IdClass idClass;
        public final boolean isAudioRequired;
        public final boolean isEnabled;
        public final Function0 manualCaptureClicked;
        public final Function2 manuallyCapture;
        public final long maxRecordingLengthMs;
        public final String message;
        public final NavigationState navigationState;
        public final Function1 onCameraError;
        public final Function1 onCaptureError;
        public final Function2 onLocalVideoFinalized;
        public final Overlay overlay;
        public final boolean playSideTransition;
        public final int remainingCaptureCount;
        public final boolean showFinalizeUi;
        public final GovernmentIdState state;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final String title;
        public final ScreenTransition transition;
        public final VideoCaptureMethod videoCaptureMethod;
        public final String watermarkText;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ManualCapture {
            public static final /* synthetic */ ManualCapture[] $VALUES;
            public static final ManualCapture Disabled;
            public static final ManualCapture Enabled;
            public static final ManualCapture Hidden;

            static {
                ManualCapture manualCapture = new ManualCapture("Disabled", 0);
                Disabled = manualCapture;
                ManualCapture manualCapture2 = new ManualCapture("Enabled", 1);
                Enabled = manualCapture2;
                ManualCapture manualCapture3 = new ManualCapture("Hidden", 2);
                Hidden = manualCapture3;
                $VALUES = new ManualCapture[]{manualCapture, manualCapture2, manualCapture3};
            }

            public static ManualCapture valueOf(String str) {
                return (ManualCapture) Enum.valueOf(ManualCapture.class, str);
            }

            public static ManualCapture[] values() {
                return (ManualCapture[]) $VALUES.clone();
            }
        }

        public CameraScreen(String str, String str2, String str3, String str4, ManualCapture manualCapture, Overlay overlay, IdClass idClass, IdConfig.Side side, NavigationState navigationState, Function2 function2, Function0 function0, Function0 function02, boolean z, List list, GovernmentIdState governmentIdState, int i, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, Function2 function22, Function1 function1, Function1 function12, int i2, Function0 function03, Function0 function04, VideoCaptureMethod videoCaptureMethod, boolean z2, Function2 function23, boolean z3, long j, boolean z4, String str5, CaptureTipsViewModel captureTipsViewModel, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z5, boolean z6, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, DesignVersion designVersion, boolean z7, boolean z8, String str6, ScreenTransition screenTransition) {
            str2.getClass();
            str4.getClass();
            manualCapture.getClass();
            overlay.getClass();
            idClass.getClass();
            side.getClass();
            navigationState.getClass();
            list.getClass();
            governmentIdState.getClass();
            cameraXController_Factory_Impl.getClass();
            camera2Controller_Factory_Impl.getClass();
            designVersion.getClass();
            this.title = str;
            this.message = str2;
            this.disclaimer = str4;
            this.captureButtonState = manualCapture;
            this.overlay = overlay;
            this.idClass = idClass;
            this.captureSide = side;
            this.navigationState = navigationState;
            this.manuallyCapture = function2;
            this.close = function0;
            this.back = function02;
            this.autoCapturing = z;
            this.autoCaptureRules = list;
            this.state = governmentIdState;
            this.autoCaptureRulesId = i;
            this.styles = governmentIdStepStyle;
            this.autoCapture = function22;
            this.onCaptureError = function1;
            this.onCameraError = function12;
            this.remainingCaptureCount = i2;
            this.manualCaptureClicked = function03;
            this.checkPermissions = function04;
            this.videoCaptureMethod = videoCaptureMethod;
            this.finalizeLocalVideo = z2;
            this.onLocalVideoFinalized = function23;
            this.enableAnalyzer = z3;
            this.maxRecordingLengthMs = j;
            this.showFinalizeUi = z4;
            this.hintText = str5;
            this.captureTips = captureTipsViewModel;
            this.assetConfig = capturePage;
            this.isEnabled = z5;
            this.isAudioRequired = z6;
            this.cameraXControllerFactory = cameraXController_Factory_Impl;
            this.camera2ControllerFactory = camera2Controller_Factory_Impl;
            this.designVersion = designVersion;
            this.playSideTransition = z7;
            this.holographicTorchEnabled = z8;
            this.watermarkText = str6;
            this.transition = screenTransition;
        }
    }

    public final class ChooseCaptureMethodScreen implements Screen {
        public final String body;
        public final String cameraText;
        public final List captureOptions;
        public final String error;
        public final int localAsset;
        public final NavigationState navigationState;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda0 onBack;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda2 onCameraCaptureClick;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda0 onCancel;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda5 onErrorDismissed;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda5 onUploadClick;
        public final RemoteImage pictographAsset;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final String title;
        public final ScreenTransition transition;
        public final String uploadButtonText;

        public ChooseCaptureMethodScreen(List list, String str, String str2, String str3, String str4, NavigationState navigationState, GovernmentIdStepStateManager$$ExternalSyntheticLambda2 governmentIdStepStateManager$$ExternalSyntheticLambda2, GovernmentIdStepStateManager$$ExternalSyntheticLambda5 governmentIdStepStateManager$$ExternalSyntheticLambda5, GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda0, GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda02, String str5, GovernmentIdStepStateManager$$ExternalSyntheticLambda5 governmentIdStepStateManager$$ExternalSyntheticLambda52, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i, ScreenTransition screenTransition) {
            list.getClass();
            str3.getClass();
            str4.getClass();
            navigationState.getClass();
            this.captureOptions = list;
            this.title = str;
            this.body = str2;
            this.cameraText = str3;
            this.uploadButtonText = str4;
            this.navigationState = navigationState;
            this.onCameraCaptureClick = governmentIdStepStateManager$$ExternalSyntheticLambda2;
            this.onUploadClick = governmentIdStepStateManager$$ExternalSyntheticLambda5;
            this.onBack = governmentIdStepStateManager$$ExternalSyntheticLambda0;
            this.onCancel = governmentIdStepStateManager$$ExternalSyntheticLambda02;
            this.error = str5;
            this.onErrorDismissed = governmentIdStepStateManager$$ExternalSyntheticLambda52;
            this.styles = governmentIdStepStyle;
            this.pictographAsset = remoteImage;
            this.localAsset = i;
            this.transition = screenTransition;
        }
    }

    public final class ErrorScreen implements Screen {
        public final String continueButtonText;
        public final NavigationState navigationState;
        public final HeroCardViewKt$$ExternalSyntheticLambda9 onBackClick;
        public final CameraHelper$$ExternalSyntheticLambda0 onCancelClick;
        public final CameraHelper$$ExternalSyntheticLambda0 onContinueClick;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final String titleText;
        public final ScreenTransition transition;
        public final boolean videoCaptureEnabled;

        public ErrorScreen(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NavigationState navigationState, CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0, HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9, CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda02, boolean z, ScreenTransition screenTransition) {
            navigationState.getClass();
            this.titleText = str;
            this.continueButtonText = str2;
            this.styles = governmentIdStepStyle;
            this.navigationState = navigationState;
            this.onContinueClick = cameraHelper$$ExternalSyntheticLambda0;
            this.onBackClick = heroCardViewKt$$ExternalSyntheticLambda9;
            this.onCancelClick = cameraHelper$$ExternalSyntheticLambda02;
            this.videoCaptureEnabled = z;
            this.transition = screenTransition;
        }
    }

    public final class InstructionsScreen implements Screen {
        public final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;
        public final String chooseText;
        public final String disclaimer;
        public final ArrayList enabledIdClasses;
        public final String error;
        public final InquiryTheme.IconStyle iconStyle;
        public final boolean isEnabled;
        public final NavigationState navigationState;
        public final Function0 onBack;
        public final Function0 onCancel;
        public final Function0 onErrorDismissed;
        public final String prompt;
        public final Function1 selectIdClass;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final String title;
        public final ScreenTransition transition;

        public InstructionsScreen(String str, String str2, String str3, String str4, ArrayList arrayList, NavigationState navigationState, Function1 function1, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.SelectPage selectPage, boolean z, Function0 function0, Function0 function02, String str5, Function0 function03, InquiryTheme.IconStyle iconStyle, ScreenTransition screenTransition) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            navigationState.getClass();
            iconStyle.getClass();
            screenTransition.getClass();
            this.title = str;
            this.prompt = str2;
            this.chooseText = str3;
            this.disclaimer = str4;
            this.enabledIdClasses = arrayList;
            this.navigationState = navigationState;
            this.selectIdClass = function1;
            this.styles = governmentIdStepStyle;
            this.assetConfig = selectPage;
            this.isEnabled = z;
            this.onBack = function0;
            this.onCancel = function02;
            this.error = str5;
            this.onErrorDismissed = function03;
            this.iconStyle = iconStyle;
            this.transition = screenTransition;
        }
    }

    public abstract class Overlay implements Parcelable {

        public final class Barcode extends Overlay {
            public static final Barcode INSTANCE = new Barcode();
            public static final Parcelable.Creator<Barcode> CREATOR = new RawExtraction.Creator(5);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Barcode);
            }

            public final int hashCode() {
                return 1779545178;
            }

            public final String toString() {
                return "Barcode";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class CornersOnly extends Overlay {
            public static final CornersOnly INSTANCE = new CornersOnly();
            public static final Parcelable.Creator<CornersOnly> CREATOR = new RawExtraction.Creator(6);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CornersOnly);
            }

            public final int hashCode() {
                return 1450323044;
            }

            public final String toString() {
                return "CornersOnly";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Custom extends Overlay {
            public static final Parcelable.Creator<Custom> CREATOR = new RawExtraction.Creator(7);
            public final RemoteImage config;
            public final RemoteImageComponent customImage;

            public Custom(RemoteImageComponent remoteImageComponent, RemoteImage remoteImage) {
                remoteImageComponent.getClass();
                remoteImage.getClass();
                this.customImage = remoteImageComponent;
                this.config = remoteImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.customImage, i);
                parcel.writeParcelable(this.config, i);
            }
        }

        public final class GenericFront extends Overlay {
            public static final GenericFront INSTANCE = new GenericFront();
            public static final Parcelable.Creator<GenericFront> CREATOR = new RawExtraction.Creator(8);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GenericFront);
            }

            public final int hashCode() {
                return 212467448;
            }

            public final String toString() {
                return "GenericFront";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Passport extends Overlay {
            public static final Passport INSTANCE = new Passport();
            public static final Parcelable.Creator<Passport> CREATOR = new RawExtraction.Creator(9);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Passport);
            }

            public final int hashCode() {
                return -1995687048;
            }

            public final String toString() {
                return "Passport";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Rectangle extends Overlay {
            public static final Rectangle INSTANCE = new Rectangle();
            public static final Parcelable.Creator<Rectangle> CREATOR = new RawExtraction.Creator(10);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Rectangle);
            }

            public final int hashCode() {
                return 319154889;
            }

            public final String toString() {
                return "Rectangle";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public final class ReviewScreen implements Screen {
        public final Function0 acceptImage;
        public final String acceptText;
        public final NextStep.GovernmentId.AssetConfig.CapturePage assetConfig;
        public final IdConfig.Side captureSide;
        public final Function0 close;
        public final String confirmCaptureTitle;
        public final DesignVersion designVersion;
        public final String disclaimer;
        public final String error;
        public final IdClass idClass;
        public final RealImageLoader imageLoader;
        public final String imagePath;
        public final boolean isAutoClassifying;
        public final boolean isEnabled;
        public final boolean keepCameraAlive;
        public final String message;
        public final NavigationState navigationState;
        public final Function0 onErrorDismissed;
        public final Overlay overlay;
        public final Function0 retryImage;
        public final String retryText;
        public final StyleElements.Axis reviewCaptureButtonsAxis;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final ScreenTransition transition;

        public ReviewScreen(RealImageLoader realImageLoader, String str, String str2, Overlay overlay, String str3, IdConfig.Side side, IdClass idClass, NavigationState navigationState, Function0 function0, String str4, Function0 function02, String str5, String str6, Function0 function03, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, String str7, Function0 function04, NextStep.GovernmentId.AssetConfig.CapturePage capturePage, boolean z, boolean z2, StyleElements.Axis axis, DesignVersion designVersion, boolean z3, ScreenTransition screenTransition) {
            realImageLoader.getClass();
            str2.getClass();
            overlay.getClass();
            str3.getClass();
            side.getClass();
            idClass.getClass();
            navigationState.getClass();
            str4.getClass();
            str5.getClass();
            axis.getClass();
            designVersion.getClass();
            screenTransition.getClass();
            this.imageLoader = realImageLoader;
            this.message = str;
            this.disclaimer = str2;
            this.overlay = overlay;
            this.imagePath = str3;
            this.captureSide = side;
            this.idClass = idClass;
            this.navigationState = navigationState;
            this.acceptImage = function0;
            this.acceptText = str4;
            this.retryImage = function02;
            this.retryText = str5;
            this.confirmCaptureTitle = str6;
            this.close = function03;
            this.styles = governmentIdStepStyle;
            this.error = str7;
            this.onErrorDismissed = function04;
            this.assetConfig = capturePage;
            this.isEnabled = z;
            this.isAutoClassifying = z2;
            this.reviewCaptureButtonsAxis = axis;
            this.designVersion = designVersion;
            this.keepCameraAlive = z3;
            this.transition = screenTransition;
        }
    }

    public final class ReviewSelectedImageScreen implements Screen {
        public final String body;
        public final String chooseNewPhotoText;
        public final String confirmButtonText;
        public final String error;
        public final String fileMimeType;
        public final String fileName;
        public final String fileToReviewPath;
        public final RealImageLoader imageLoader;
        public final boolean isAutoClassifying;
        public final NavigationState navigationState;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda0 onBack;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda0 onCancel;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda0 onChooseNewPhotoClick;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda5 onErrorDismissed;
        public final GovernmentIdStepStateManager$$ExternalSyntheticLambda2 onUsePhotoClick;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final String title;
        public final ScreenTransition transition;

        public ReviewSelectedImageScreen(RealImageLoader realImageLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, NavigationState navigationState, GovernmentIdStepStateManager$$ExternalSyntheticLambda2 governmentIdStepStateManager$$ExternalSyntheticLambda2, GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda0, GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda02, GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda03, String str8, GovernmentIdStepStateManager$$ExternalSyntheticLambda5 governmentIdStepStateManager$$ExternalSyntheticLambda5, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z, ScreenTransition screenTransition) {
            realImageLoader.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            str6.getClass();
            navigationState.getClass();
            this.imageLoader = realImageLoader;
            this.title = str;
            this.body = str2;
            this.confirmButtonText = str3;
            this.chooseNewPhotoText = str4;
            this.fileToReviewPath = str5;
            this.fileMimeType = str6;
            this.fileName = str7;
            this.navigationState = navigationState;
            this.onUsePhotoClick = governmentIdStepStateManager$$ExternalSyntheticLambda2;
            this.onChooseNewPhotoClick = governmentIdStepStateManager$$ExternalSyntheticLambda0;
            this.onBack = governmentIdStepStateManager$$ExternalSyntheticLambda02;
            this.onCancel = governmentIdStepStateManager$$ExternalSyntheticLambda03;
            this.error = str8;
            this.onErrorDismissed = governmentIdStepStateManager$$ExternalSyntheticLambda5;
            this.styles = governmentIdStepStyle;
            this.isAutoClassifying = z;
            this.transition = screenTransition;
        }
    }

    public final class SubmittingScreen implements Screen {
        public final NextStep.GovernmentId.AssetConfig.PendingPage assetConfig;
        public final String description;
        public final boolean isFinalizingVideoCapture;
        public final NavigationState navigationState;
        public final Function0 onBack;
        public final Function0 onCancel;
        public final PendingPageTextPosition pendingPageTextVerticalPosition;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final String title;
        public final ScreenTransition transition;

        public SubmittingScreen(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, NavigationState navigationState, Function0 function0, Function0 function02, PendingPageTextPosition pendingPageTextPosition, boolean z, ScreenTransition screenTransition) {
            str.getClass();
            str2.getClass();
            navigationState.getClass();
            pendingPageTextPosition.getClass();
            screenTransition.getClass();
            this.title = str;
            this.description = str2;
            this.styles = governmentIdStepStyle;
            this.assetConfig = pendingPage;
            this.navigationState = navigationState;
            this.onBack = function0;
            this.onCancel = function02;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.isFinalizingVideoCapture = z;
            this.transition = screenTransition;
        }

        public /* synthetic */ SubmittingScreen(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.GovernmentId.AssetConfig.PendingPage pendingPage, NavigationState navigationState, Function0 function0, Function0 function02, PendingPageTextPosition pendingPageTextPosition, ScreenTransition screenTransition, int i) {
            this(str, str2, governmentIdStepStyle, pendingPage, navigationState, function0, function02, pendingPageTextPosition, false, (i & 512) != 0 ? ScreenTransition.SLIDE_IN : screenTransition);
        }
    }
}
