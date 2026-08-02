package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.play.core.splitcompat.zzd;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.NfcDataGroupType;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$CreateReusablePersona;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$ScanNfc;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$Ui;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$VerifyReusablePersona;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetViewModel;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlin.text.StringsKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import okio.ByteString;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes9.dex */
public final class UiWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final ComponentWorkHelper componentWorkHelper;
    public final CreateReusablePersonaWorker_Factory_Impl createReusablePersonaWorkerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final FeatureFlagManager featureFlagManager;
    public String lastLoggedPage;
    public final NavigationStateManager navigationStateManager;
    public final ScanNfcWorker.Factory nfcScanWorkerFactory;
    public final PermissionRequestWorkflow permissionRequestWorkflow;
    public final TrackingEventsLogger trackingEventsLogger;
    public final VerifyReusablePersonaWorker_Factory_Impl verifyReusablePersonaWorkerFactory;

    public final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final List components;
        public final boolean finalStep;
        public final String gpsFeatureModalPositiveButton;
        public final String gpsFeatureRationale;
        public final String gpsFeatureTitle;
        public final String gpsPermissionsModalNegativeButton;
        public final String gpsPermissionsModalPositiveButton;
        public final String gpsPermissionsRationale;
        public final String gpsPermissionsTitle;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final boolean isRestoringState;
        public final boolean isSubmitting;
        public final List serverComponentErrors;
        public final String sessionToken;
        public final String stepName;
        public final StepStyles.UiStepStyle styles;
        public final InternalErrorInfo transitionError;

        public final class Creator implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                int i;
                String str;
                String str2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                int i2;
                String str3;
                StepStyles.UiStepStyle uiStepStyle;
                boolean z;
                boolean z2;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                    arrayList2 = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt);
                    int i3 = 0;
                    while (i3 != readInt) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(Input.class, parcel, arrayList5, i3, 1);
                    }
                    arrayList = arrayList5;
                    arrayList2 = null;
                }
                String readString3 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z3 = true;
                } else {
                    i = 0;
                }
                InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) parcel.readParcelable(Input.class.getClassLoader());
                boolean z6 = z4;
                String readString4 = parcel.readString();
                boolean z7 = z5;
                String readString5 = parcel.readString();
                int i4 = i;
                String readString6 = parcel.readString();
                ArrayList arrayList6 = arrayList2;
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                StepStyles.UiStepStyle uiStepStyle2 = (StepStyles.UiStepStyle) parcel.readParcelable(Input.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    str2 = readString2;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList6;
                    str = readString;
                } else {
                    str = readString;
                    int readInt2 = parcel.readInt();
                    str2 = readString2;
                    arrayList3 = new ArrayList(readInt2);
                    arrayList4 = arrayList;
                    int i5 = i4;
                    while (i5 != readInt2) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(Input.class, parcel, arrayList3, i5, 1);
                        readInt2 = readInt2;
                    }
                }
                if (parcel.readInt() != 0) {
                    i2 = 1;
                    str3 = str;
                    uiStepStyle = uiStepStyle2;
                    z = z7;
                    z2 = 1;
                } else {
                    i2 = 1;
                    str3 = str;
                    uiStepStyle = uiStepStyle2;
                    z = z7;
                    z2 = i4;
                }
                InternalErrorInfo internalErrorInfo = (InternalErrorInfo) parcel.readParcelable(Input.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    i2 = i4;
                }
                return new Input(str3, str2, arrayList4, readString3, z6, z, z3, inquirySessionConfig, readString4, readString5, readString6, readString7, readString8, readString9, readString10, uiStepStyle, arrayList3, z2, internalErrorInfo, i2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        public Input(String str, String str2, List list, String str3, boolean z, boolean z2, boolean z3, InquirySessionConfig inquirySessionConfig, String str4, String str5, String str6, String str7, String str8, String str9, String str10, StepStyles.UiStepStyle uiStepStyle, List list2, boolean z4, InternalErrorInfo internalErrorInfo, boolean z5) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            inquirySessionConfig.getClass();
            this.sessionToken = str;
            this.inquiryId = str2;
            this.components = list;
            this.stepName = str3;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.finalStep = z3;
            this.inquirySessionConfig = inquirySessionConfig;
            this.gpsPermissionsTitle = str4;
            this.gpsPermissionsRationale = str5;
            this.gpsPermissionsModalPositiveButton = str6;
            this.gpsPermissionsModalNegativeButton = str7;
            this.gpsFeatureTitle = str8;
            this.gpsFeatureRationale = str9;
            this.gpsFeatureModalPositiveButton = str10;
            this.styles = uiStepStyle;
            this.serverComponentErrors = list2;
            this.isSubmitting = z4;
            this.transitionError = internalErrorInfo;
            this.isRestoringState = z5;
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
            return Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.components, input.components) && Intrinsics.areEqual(this.stepName, input.stepName) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && this.finalStep == input.finalStep && Intrinsics.areEqual(this.inquirySessionConfig, input.inquirySessionConfig) && Intrinsics.areEqual(this.gpsPermissionsTitle, input.gpsPermissionsTitle) && Intrinsics.areEqual(this.gpsPermissionsRationale, input.gpsPermissionsRationale) && Intrinsics.areEqual(this.gpsPermissionsModalPositiveButton, input.gpsPermissionsModalPositiveButton) && Intrinsics.areEqual(this.gpsPermissionsModalNegativeButton, input.gpsPermissionsModalNegativeButton) && Intrinsics.areEqual(this.gpsFeatureTitle, input.gpsFeatureTitle) && Intrinsics.areEqual(this.gpsFeatureRationale, input.gpsFeatureRationale) && Intrinsics.areEqual(this.gpsFeatureModalPositiveButton, input.gpsFeatureModalPositiveButton) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.serverComponentErrors, input.serverComponentErrors) && this.isSubmitting == input.isSubmitting && Intrinsics.areEqual(this.transitionError, input.transitionError) && this.isRestoringState == input.isRestoringState;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionToken.hashCode() * 31, 31, this.inquiryId);
            List list = this.components;
            int hashCode = (this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (list == null ? 0 : list.hashCode())) * 31, 31, this.stepName), 31, this.backStepEnabled), 31, this.cancelButtonEnabled), 31, this.finalStep)) * 31;
            String str = this.gpsPermissionsTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.gpsPermissionsRationale;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsPermissionsModalPositiveButton;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsPermissionsModalNegativeButton;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureTitle;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.gpsFeatureRationale;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.gpsFeatureModalPositiveButton;
            int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int hashCode9 = (hashCode8 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            List list2 = this.serverComponentErrors;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isSubmitting);
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return Boolean.hashCode(this.isRestoringState) + ((m2 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Input(sessionToken=", this.sessionToken, ", inquiryId=", this.inquiryId, ", components=");
            Recorder$$ExternalSyntheticOutline2.m(", stepName=", this.stepName, ", backStepEnabled=", m, this.components);
            re$$ExternalSyntheticOutline0.m(m, this.backStepEnabled, ", cancelButtonEnabled=", this.cancelButtonEnabled, ", finalStep=");
            m.append(this.finalStep);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", gpsPermissionsTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.gpsPermissionsTitle, ", gpsPermissionsRationale=", this.gpsPermissionsRationale, ", gpsPermissionsModalPositiveButton=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.gpsPermissionsModalPositiveButton, ", gpsPermissionsModalNegativeButton=", this.gpsPermissionsModalNegativeButton, ", gpsFeatureTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.gpsFeatureTitle, ", gpsFeatureRationale=", this.gpsFeatureRationale, ", gpsFeatureModalPositiveButton=");
            m.append(this.gpsFeatureModalPositiveButton);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", serverComponentErrors=");
            m.append(this.serverComponentErrors);
            m.append(", isSubmitting=");
            m.append(this.isSubmitting);
            m.append(", transitionError=");
            m.append(this.transitionError);
            m.append(", isRestoringState=");
            m.append(this.isRestoringState);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.inquiryId);
            List list = this.components;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeString(this.stepName);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeInt(this.finalStep ? 1 : 0);
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeString(this.gpsPermissionsTitle);
            parcel.writeString(this.gpsPermissionsRationale);
            parcel.writeString(this.gpsPermissionsModalPositiveButton);
            parcel.writeString(this.gpsPermissionsModalNegativeButton);
            parcel.writeString(this.gpsFeatureTitle);
            parcel.writeString(this.gpsFeatureRationale);
            parcel.writeString(this.gpsFeatureModalPositiveButton);
            parcel.writeParcelable(this.styles, i);
            List list2 = this.serverComponentErrors;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list2);
                while (m2.hasNext()) {
                    parcel.writeParcelable((Parcelable) m2.next(), i);
                }
            }
            parcel.writeInt(this.isSubmitting ? 1 : 0);
            parcel.writeParcelable(this.transitionError, i);
            parcel.writeInt(this.isRestoringState ? 1 : 0);
        }
    }

    public interface Output {

        public final class Back implements Output {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return 1353460011;
            }

            public final String toString() {
                return Constants.META_BACK_BUTTON;
            }
        }

        public final class Canceled implements Output {
            public static final Canceled INSTANCE = new Canceled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Canceled);
            }

            public final int hashCode() {
                return -650975523;
            }

            public final String toString() {
                return "Canceled";
            }
        }

        public final class Completed implements Output {
            public static final Completed INSTANCE = new Completed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Completed);
            }

            public final int hashCode() {
                return -584917881;
            }

            public final String toString() {
                return "Completed";
            }
        }

        public final class Error implements Output {
            public final InternalErrorInfo cause;

            public Error(InternalErrorInfo internalErrorInfo) {
                internalErrorInfo.getClass();
                this.cause = internalErrorInfo;
            }
        }

        public final class FinishedWithTransition implements Output {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FinishedWithTransition);
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "FinishedWithTransition(canReuseWorkflow=true)";
            }
        }

        public final class FinishedWithoutTransition implements Output {
            public final Map componentParams;
            public final UiComponent fromComponent;
            public final String fromStep;

            public FinishedWithoutTransition(UiComponent uiComponent, Map map, String str) {
                uiComponent.getClass();
                map.getClass();
                str.getClass();
                this.fromComponent = uiComponent;
                this.componentParams = map;
                this.fromStep = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinishedWithoutTransition)) {
                    return false;
                }
                FinishedWithoutTransition finishedWithoutTransition = (FinishedWithoutTransition) obj;
                return Intrinsics.areEqual(this.fromComponent, finishedWithoutTransition.fromComponent) && Intrinsics.areEqual(this.componentParams, finishedWithoutTransition.componentParams) && Intrinsics.areEqual(this.fromStep, finishedWithoutTransition.fromStep);
            }

            public final int hashCode() {
                return this.fromStep.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.fromComponent.hashCode() * 31, this.componentParams, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FinishedWithoutTransition(fromComponent=");
                sb.append(this.fromComponent);
                sb.append(", componentParams=");
                sb.append(this.componentParams);
                sb.append(", fromStep=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.fromStep, ")");
            }
        }
    }

    public abstract class Screen {

        public final class EntryScreen extends Screen {
            public final AutoSubmit autoSubmit;
            public final List componentConfigs;
            public final ArrayList componentErrors;
            public final List components;
            public final String error;
            public final HelpBottomSheetViewModel helpBottomSheetViewModel;
            public final boolean isLoading;
            public final Function0 launchActionFromHelpSheet;
            public final Function1 launchNfcScan;
            public final Function0 launchSecondaryActionFromHelpSheet;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function0 onCancel;
            public final Function3 onClick;
            public final Function0 onComplete;
            public final Function2 onCreateReusablePersonaClick;
            public final Function0 onErrorDismissed;
            public final Function0 onHelpBottomSheetDismissed;
            public final Function2 onSuggestionSelected;
            public final Function2 onVerifyPersonaClick;
            public final boolean shouldLaunchHelpBottomSheet;
            public final StepStyles.UiStepStyle styles;

            public final class AutoSubmit {
                public final AutoSubmitableComponent component;
                public final String countdownText;
                public final boolean isReadyToSubmit;

                public AutoSubmit(AutoSubmitableComponent autoSubmitableComponent, String str, boolean z) {
                    autoSubmitableComponent.getClass();
                    this.component = autoSubmitableComponent;
                    this.countdownText = str;
                    this.isReadyToSubmit = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AutoSubmit)) {
                        return false;
                    }
                    AutoSubmit autoSubmit = (AutoSubmit) obj;
                    return Intrinsics.areEqual(this.component, autoSubmit.component) && Intrinsics.areEqual(this.countdownText, autoSubmit.countdownText) && this.isReadyToSubmit == autoSubmit.isReadyToSubmit;
                }

                public final int hashCode() {
                    int hashCode = this.component.hashCode() * 31;
                    String str = this.countdownText;
                    return Boolean.hashCode(this.isReadyToSubmit) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AutoSubmit(component=");
                    sb.append(this.component);
                    sb.append(", countdownText=");
                    sb.append(this.countdownText);
                    sb.append(", isReadyToSubmit=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isReadyToSubmit, ")");
                }
            }

            public EntryScreen(List list, List list2, ArrayList arrayList, NavigationState navigationState, Function3 function3, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function2 function2, AutoSubmit autoSubmit, Function0 function05, Function2 function22, boolean z, StepStyles.UiStepStyle uiStepStyle, String str, Function0 function06, Function2 function23, HelpBottomSheetViewModel helpBottomSheetViewModel, boolean z2, Function0 function07) {
                list.getClass();
                navigationState.getClass();
                this.components = list;
                this.componentConfigs = list2;
                this.componentErrors = arrayList;
                this.navigationState = navigationState;
                this.onClick = function3;
                this.onComplete = function0;
                this.onCancel = function02;
                this.launchNfcScan = function1;
                this.launchActionFromHelpSheet = function03;
                this.launchSecondaryActionFromHelpSheet = function04;
                this.onVerifyPersonaClick = function2;
                this.autoSubmit = autoSubmit;
                this.onBack = function05;
                this.onSuggestionSelected = function22;
                this.isLoading = z;
                this.styles = uiStepStyle;
                this.error = str;
                this.onErrorDismissed = function06;
                this.onCreateReusablePersonaClick = function23;
                this.helpBottomSheetViewModel = helpBottomSheetViewModel;
                this.shouldLaunchHelpBottomSheet = z2;
                this.onHelpBottomSheetDismissed = function07;
            }

            public final boolean isLoading() {
                return this.isLoading;
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionResult permissionResult = PermissionResult.PermissionGranted;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionResult permissionResult2 = PermissionResult.PermissionGranted;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public UiWorkflow(Context context, ScanNfcWorker.Factory factory, CreateReusablePersonaWorker_Factory_Impl createReusablePersonaWorker_Factory_Impl, VerifyReusablePersonaWorker_Factory_Impl verifyReusablePersonaWorker_Factory_Impl, NavigationStateManager navigationStateManager, PermissionRequestWorkflow permissionRequestWorkflow, ComponentWorkHelper componentWorkHelper, ExternalEventLogger externalEventLogger, FeatureFlagManager featureFlagManager, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        factory.getClass();
        createReusablePersonaWorker_Factory_Impl.getClass();
        verifyReusablePersonaWorker_Factory_Impl.getClass();
        navigationStateManager.getClass();
        permissionRequestWorkflow.getClass();
        componentWorkHelper.getClass();
        externalEventLogger.getClass();
        featureFlagManager.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.nfcScanWorkerFactory = factory;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorker_Factory_Impl;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorker_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static void outputSubmit(WorkflowAction.Updater updater, UiState.Displaying displaying) {
        UiComponent uiComponent = displaying.triggeringComponent;
        Map map = displaying.componentParams;
        if (uiComponent == null || map == null) {
            return;
        }
        updater.setOutput(new Output.FinishedWithoutTransition(uiComponent, map, displaying.stepName));
    }

    public static void recurse(List list, Function1 function1) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = (UiComponent) it.next();
            if (uiComponent instanceof UiComponentGroup) {
                recurse(((UiComponentGroup) uiComponent).getChildren(), new ViewGroups$$ExternalSyntheticLambda0(20, function1));
            } else {
                function1.invoke(uiComponent);
            }
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        Input input = (Input) obj;
        input.getClass();
        if (snapshot != null) {
            ByteString bytes = snapshot.bytes();
            Parcelable parcelable = null;
            if (bytes.getSize$okio() <= 0) {
                bytes = null;
            }
            if (bytes != null) {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                byte[] byteArray = bytes.toByteArray();
                obtain.unmarshall(byteArray, 0, byteArray.length);
                obtain.setDataPosition(0);
                parcelable = obtain.readParcelable(Snapshot.class.getClassLoader());
                parcelable.getClass();
                obtain.recycle();
            }
            UiState uiState = (UiState) parcelable;
            if (uiState != null) {
                return uiState;
            }
        }
        List list = input.components;
        List list2 = list != null ? UiComponentKt.to(list) : EmptyList.INSTANCE;
        TipsFeatureFlag tipsFeatureFlag = TipsFeatureFlag.INSTANCE$1;
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        featureFlagManager.getClass();
        if (!featureFlagManager.getValue(tipsFeatureFlag)) {
            list2 = ComponentWorkHelperKt.removeFileUploadComponents(list2);
        }
        String str = input.stepName;
        StepStyles.UiStepStyle uiStepStyle = input.styles;
        List list3 = input.serverComponentErrors;
        if (list3 == null) {
            list3 = EmptyList.INSTANCE;
        }
        return new UiState.Displaying(list2, str, list3, uiStepStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0410  */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r51v0 */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetViewModel] */
    /* JADX WARN: Type inference failed for: r51v2 */
    @Override // com.squareup.workflow1.StatefulWorkflow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Object obj, Object obj2, final StatefulWorkflow.RenderContext renderContext) {
        zzd inquiryPage$ScanNfc;
        boolean z;
        Screen.EntryScreen.AutoSubmit autoSubmit;
        boolean z2;
        UiState.PendingAction pendingAction;
        String str;
        UiState uiState;
        NavigationStateManager navigationStateManager;
        List list;
        Context context;
        String str2;
        UiState uiState2;
        UiState.Displaying.AutoSubmit autoSubmit2;
        Screen.EntryScreen.AutoSubmit autoSubmit3;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        ?? listOf;
        ?? scanDocumentError;
        String str7;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
        Input input = (Input) obj;
        UiState uiState3 = (UiState) obj2;
        input.getClass();
        uiState3.getClass();
        boolean z3 = input.isRestoringState;
        boolean z4 = input.isSubmitting;
        String str8 = input.stepName;
        if (z3) {
            return Unit.INSTANCE;
        }
        if (!(uiState3 instanceof UiState.Displaying)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        UiState.Displaying displaying = (UiState.Displaying) uiState3;
        UiState.Displaying.NfcScan nfcScan = displaying.nfcScan;
        UiState.Displaying.AutoSubmit autoSubmit4 = displaying.autoSubmit;
        List list2 = displaying.components;
        UiState.PendingAction pendingAction2 = displaying.pendingAction;
        if (pendingAction2 == null) {
            inquiryPage$ScanNfc = nfcScan != null ? new InquiryPage$ScanNfc(str8) : new InquiryPage$Ui(str8);
        } else if (pendingAction2 instanceof UiState.PendingAction.CreateReusablePersona) {
            inquiryPage$ScanNfc = new InquiryPage$CreateReusablePersona(str8);
        } else {
            if (!(pendingAction2 instanceof UiState.PendingAction.VerifyReusablePersona)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            inquiryPage$ScanNfc = new InquiryPage$VerifyReusablePersona(str8);
        }
        String str9 = inquiryPage$ScanNfc.getStepName() + ":" + inquiryPage$ScanNfc;
        if (!str9.equals(this.lastLoggedPage)) {
            this.lastLoggedPage = str9;
            this.externalEventLogger.logPageChange(inquiryPage$ScanNfc);
            this.trackingEventsLogger.logInquiryPageViewEvent(inquiryPage$ScanNfc.getStepName(), inquiryPage$ScanNfc.toString(), false);
        }
        if (pendingAction2 instanceof UiState.PendingAction.CreateReusablePersona) {
            String str10 = input.sessionToken;
            String str11 = input.inquiryId;
            autoSubmit = null;
            CreatePersonaSheetComponent createPersonaSheetComponent = ((UiState.PendingAction.CreateReusablePersona) pendingAction2).createPersonaSheetComponent;
            String str12 = createPersonaSheetComponent.url;
            if (str12 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            z = z4;
            Workflows.runningWorker(renderContext, this.createReusablePersonaWorkerFactory.create(str10, str11, str12, createPersonaSheetComponent.name), Reflection.typeOf(CreateReusablePersonaWorker.class), "", new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(13, pendingAction2, this, displaying));
        } else {
            z = z4;
            autoSubmit = null;
            if (pendingAction2 instanceof UiState.PendingAction.VerifyReusablePersona) {
                String str13 = input.sessionToken;
                String str14 = input.inquiryId;
                UiState.PendingAction.VerifyReusablePersona verifyReusablePersona = (UiState.PendingAction.VerifyReusablePersona) pendingAction2;
                VerifyPersonaButtonComponent verifyPersonaButtonComponent = verifyReusablePersona.verifyPersonaButtonComponent;
                String str15 = verifyPersonaButtonComponent.url;
                if (str15 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                Workflows.runningWorker(renderContext, this.verifyReusablePersonaWorkerFactory.create(str13, str14, str15, verifyPersonaButtonComponent.name, verifyReusablePersona.componentParams), Reflection.typeOf(VerifyReusablePersonaWorker.class), "", new BlurEffectKt$$ExternalSyntheticLambda1(10, this, displaying));
            } else if (pendingAction2 != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        final HelpBottomSheetComponent helpBottomSheetComponent = (HelpBottomSheetComponent) ExtensionsKt.findFirstComponentOrNull(list2, Reflection.factory.getOrCreateKotlinClass(HelpBottomSheetComponent.class), UiWorkflow$render$$inlined$findFirstComponentOrNull$default$1.INSTANCE);
        boolean z5 = helpBottomSheetComponent != null && ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).isEnabled();
        boolean z6 = input.backStepEnabled;
        boolean z7 = input.cancelButtonEnabled;
        boolean z8 = pendingAction2 == null && !z;
        NavigationStateManager navigationStateManager2 = this.navigationStateManager;
        navigationStateManager2.setState(z6, z7, z8, z5);
        recurse(list2, new UiWorkflow$$ExternalSyntheticLambda14(this, input, uiState3, renderContext));
        Context context2 = this.applicationContext;
        if (nfcScan != null) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = nfcScan.component;
            String textValue = governmentIdNfcScanComponent.cardAccessNumberController.getTextValue();
            String textValue2 = governmentIdNfcScanComponent.documentNumberController.getTextValue();
            Date dateValue = governmentIdNfcScanComponent.dateOfBirthController.getDateValue();
            z2 = z5;
            Date dateValue2 = governmentIdNfcScanComponent.expirationDateController.getDateValue();
            pendingAction = pendingAction2;
            GovernmentIdNfcScan governmentIdNfcScan = governmentIdNfcScanComponent.config;
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
            if (StringsKt.isBlank(textValue2) || dateValue == null || dateValue2 == null) {
                str = "";
                uiState = uiState3;
                navigationStateManager = navigationStateManager2;
                list = list2;
                context = context2;
                baseRenderContext.runningSideEffect("client_side_nfc_form_validation", new UiWorkflow$runGovIdNfcWork$1(renderContext, this, attributes, textValue2, dateValue, dateValue2, nfcScan, displaying, null));
                InquirySessionConfig inquirySessionConfig = input.inquirySessionConfig;
                Permission permission = inquirySessionConfig.gpsPrecisionRequirement != GpsPrecisionRequirement.ROUGH ? Permission.RoughLocation : Permission.PreciseLocation;
                boolean z9 = inquirySessionConfig.gpsCollectionRequirement != GpsCollectionRequirement.OPTIONAL;
                str2 = displaying.error;
                if (str2 == null && input.transitionError != null) {
                    str2 = context.getString(R.string.pi2_network_connection_error);
                }
                String str16 = str2;
                int i2 = 11;
                if (autoSubmit4 == null) {
                    ButtonComponent buttonComponent = (ButtonComponent) ExtensionsKt.findFirstComponentOrNull(list, Reflection.factory.getOrCreateKotlinClass(ButtonComponent.class), new InstantKt$$ExternalSyntheticLambda0(i2));
                    if (buttonComponent != null) {
                        uiState2 = uiState;
                        baseRenderContext.runningSideEffect("begin_countdown", new UiWorkflow$render$3$1(renderContext, this, uiState2, buttonComponent, null));
                        if (autoSubmit4 != null || (i = autoSubmit4.countdown) < 1) {
                            autoSubmit2 = autoSubmit4;
                        } else {
                            UiState uiState4 = uiState2;
                            autoSubmit2 = autoSubmit4;
                            uiState2 = uiState4;
                            baseRenderContext.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "countdown_"), new UiWorkflow$render$4$1(renderContext, this, autoSubmit4, uiState4, null));
                        }
                        List list3 = displaying.components;
                        List list4 = input.components;
                        List list5 = displaying.componentErrors;
                        List list6 = input.serverComponentErrors;
                        ArrayList plus = CollectionsKt.plus(list6 != null ? list6 : EmptyList.INSTANCE, (Collection) list5);
                        NavigationState navigationState = navigationStateManager.getNavigationState();
                        if (!z || autoSubmit2 == null) {
                            autoSubmit3 = autoSubmit;
                        } else {
                            autoSubmit3 = new Screen.EntryScreen.AutoSubmit(autoSubmit2.component, autoSubmit2.countdownText, autoSubmit2.countdown <= 0);
                        }
                        boolean z10 = pendingAction == null || z;
                        StepStyles.UiStepStyle uiStepStyle = displaying.styles;
                        boolean z11 = !z2 && displaying.showHelpBottomSheet;
                        ?? viewModel = helpBottomSheetComponent != null ? ((GovernmentIdNfcScanComponent) helpBottomSheetComponent).getViewModel() : autoSubmit;
                        final UiState uiState5 = uiState2;
                        BasicShieetScope$$ExternalSyntheticLambda0 basicShieetScope$$ExternalSyntheticLambda0 = new BasicShieetScope$$ExternalSyntheticLambda0(this, uiState5, input, renderContext, 18);
                        UiWorkflow$$ExternalSyntheticLambda18 uiWorkflow$$ExternalSyntheticLambda18 = new UiWorkflow$$ExternalSyntheticLambda18(this, uiState5, renderContext);
                        final int i3 = 0;
                        UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda25 = new UiWorkflow$$ExternalSyntheticLambda25(this, uiState5, renderContext, input, i3);
                        ComposeLayoutInfoKt$$ExternalSyntheticLambda6 composeLayoutInfoKt$$ExternalSyntheticLambda6 = new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(i2, this, uiState5, renderContext);
                        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                GovernmentIdNfcScan.Attributes attributes2;
                                String unableToScanTransitionComponentName2;
                                int i4 = i3;
                                StatefulWorkflow.RenderContext renderContext2 = renderContext;
                                UiState uiState6 = uiState5;
                                UiWorkflow uiWorkflow = this;
                                HelpBottomSheetComponent helpBottomSheetComponent2 = helpBottomSheetComponent;
                                switch (i4) {
                                    case 0:
                                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent)) {
                                            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) helpBottomSheetComponent2;
                                            UiState.Displaying displaying2 = (UiState.Displaying) uiState6;
                                            UiWorkflow.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(9, governmentIdNfcScanComponent2, displaying2)));
                                        }
                                        break;
                                    default:
                                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent) && (attributes2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).config.getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                                            UiWorkflow.recurse(((UiState.Displaying) uiState6).components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent2, 0));
                                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(11, uiState6, helpBottomSheetComponent2)));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        final int i4 = 1;
                        int i5 = 0;
                        int i6 = 1;
                        Screen.EntryScreen entryScreen = new Screen.EntryScreen(list3, list4, plus, navigationState, basicShieetScope$$ExternalSyntheticLambda0, uiWorkflow$$ExternalSyntheticLambda18, uiWorkflow$$ExternalSyntheticLambda25, composeLayoutInfoKt$$ExternalSyntheticLambda6, function0, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                GovernmentIdNfcScan.Attributes attributes2;
                                String unableToScanTransitionComponentName2;
                                int i42 = i4;
                                StatefulWorkflow.RenderContext renderContext2 = renderContext;
                                UiState uiState6 = uiState5;
                                UiWorkflow uiWorkflow = this;
                                HelpBottomSheetComponent helpBottomSheetComponent2 = helpBottomSheetComponent;
                                switch (i42) {
                                    case 0:
                                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent)) {
                                            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) helpBottomSheetComponent2;
                                            UiState.Displaying displaying2 = (UiState.Displaying) uiState6;
                                            UiWorkflow.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(9, governmentIdNfcScanComponent2, displaying2)));
                                        }
                                        break;
                                    default:
                                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent) && (attributes2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).config.getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                                            UiWorkflow.recurse(((UiState.Displaying) uiState6).components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent2, 0));
                                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(11, uiState6, helpBottomSheetComponent2)));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new UiWorkflow$$ExternalSyntheticLambda17(this, uiState5, renderContext), autoSubmit3, new Regex$$ExternalSyntheticLambda1(21, renderContext, this), new UiWorkflow$$ExternalSyntheticLambda17(renderContext, this, uiState5, i5), z10, uiStepStyle, str16, new UiWorkflow$$ExternalSyntheticLambda18(renderContext, this, uiState5, i5), new UiWorkflow$$ExternalSyntheticLambda17(renderContext, this, uiState5, i6), viewModel, z11, new UiWorkflow$$ExternalSyntheticLambda18(renderContext, this, uiState5, i6));
                        boolean z12 = displaying.isRequestingGpsPermissions;
                        str3 = input.gpsPermissionsTitle;
                        if (str3 != null) {
                            str = str3;
                        }
                        str4 = input.gpsPermissionsRationale;
                        if (str4 == null) {
                            str4 = "Gps permission are required to verify your identity";
                        }
                        String str17 = str4;
                        String string2 = context.getString(R.string.pi2_ui_gps_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                        string2.getClass();
                        str5 = input.gpsFeatureModalPositiveButton;
                        if (str5 == null) {
                            str5 = context.getString(R.string.pi2_permissions_continue);
                            str5.getClass();
                        }
                        String str18 = str5;
                        str6 = input.gpsPermissionsModalNegativeButton;
                        if (str6 == null) {
                            str6 = context.getString(R.string.pi2_permissions_continue);
                            str6.getClass();
                        }
                        boolean z13 = z9;
                        return PermissionsStateKt.withRequestPermissionsIfNeeded(entryScreen, renderContext, z12, permission, z13, str, str17, string2, str18, str6, input.gpsFeatureTitle, input.gpsFeatureRationale, input.gpsPermissionsModalNegativeButton, this.permissionRequestWorkflow, input.styles, displaying.requestPermissionKey, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(this, renderContext, z13, uiState5, 22));
                    }
                }
                uiState2 = uiState;
                if (autoSubmit4 != null) {
                }
                autoSubmit2 = autoSubmit4;
                List list32 = displaying.components;
                List list42 = input.components;
                List list52 = displaying.componentErrors;
                List list62 = input.serverComponentErrors;
                ArrayList plus2 = CollectionsKt.plus(list62 != null ? list62 : EmptyList.INSTANCE, (Collection) list52);
                NavigationState navigationState2 = navigationStateManager.getNavigationState();
                if (z) {
                }
                autoSubmit3 = autoSubmit;
                if (pendingAction == null) {
                }
                StepStyles.UiStepStyle uiStepStyle2 = displaying.styles;
                if (z2) {
                }
                if (helpBottomSheetComponent != null) {
                }
                final UiState uiState52 = uiState2;
                BasicShieetScope$$ExternalSyntheticLambda0 basicShieetScope$$ExternalSyntheticLambda02 = new BasicShieetScope$$ExternalSyntheticLambda0(this, uiState52, input, renderContext, 18);
                UiWorkflow$$ExternalSyntheticLambda18 uiWorkflow$$ExternalSyntheticLambda182 = new UiWorkflow$$ExternalSyntheticLambda18(this, uiState52, renderContext);
                final int i32 = 0;
                UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda252 = new UiWorkflow$$ExternalSyntheticLambda25(this, uiState52, renderContext, input, i32);
                ComposeLayoutInfoKt$$ExternalSyntheticLambda6 composeLayoutInfoKt$$ExternalSyntheticLambda62 = new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(i2, this, uiState52, renderContext);
                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        GovernmentIdNfcScan.Attributes attributes2;
                        String unableToScanTransitionComponentName2;
                        int i42 = i32;
                        StatefulWorkflow.RenderContext renderContext2 = renderContext;
                        UiState uiState6 = uiState52;
                        UiWorkflow uiWorkflow = this;
                        HelpBottomSheetComponent helpBottomSheetComponent2 = helpBottomSheetComponent;
                        switch (i42) {
                            case 0:
                                if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent)) {
                                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) helpBottomSheetComponent2;
                                    UiState.Displaying displaying2 = (UiState.Displaying) uiState6;
                                    UiWorkflow.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                                    renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(9, governmentIdNfcScanComponent2, displaying2)));
                                }
                                break;
                            default:
                                if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent) && (attributes2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).config.getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                                    UiWorkflow.recurse(((UiState.Displaying) uiState6).components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent2, 0));
                                    renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(11, uiState6, helpBottomSheetComponent2)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i42 = 1;
                int i52 = 0;
                int i62 = 1;
                Screen.EntryScreen entryScreen2 = new Screen.EntryScreen(list32, list42, plus2, navigationState2, basicShieetScope$$ExternalSyntheticLambda02, uiWorkflow$$ExternalSyntheticLambda182, uiWorkflow$$ExternalSyntheticLambda252, composeLayoutInfoKt$$ExternalSyntheticLambda62, function02, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        GovernmentIdNfcScan.Attributes attributes2;
                        String unableToScanTransitionComponentName2;
                        int i422 = i42;
                        StatefulWorkflow.RenderContext renderContext2 = renderContext;
                        UiState uiState6 = uiState52;
                        UiWorkflow uiWorkflow = this;
                        HelpBottomSheetComponent helpBottomSheetComponent2 = helpBottomSheetComponent;
                        switch (i422) {
                            case 0:
                                if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent)) {
                                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) helpBottomSheetComponent2;
                                    UiState.Displaying displaying2 = (UiState.Displaying) uiState6;
                                    UiWorkflow.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                                    renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(9, governmentIdNfcScanComponent2, displaying2)));
                                }
                                break;
                            default:
                                if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent) && (attributes2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).config.getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                                    UiWorkflow.recurse(((UiState.Displaying) uiState6).components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent2, 0));
                                    renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(11, uiState6, helpBottomSheetComponent2)));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new UiWorkflow$$ExternalSyntheticLambda17(this, uiState52, renderContext), autoSubmit3, new Regex$$ExternalSyntheticLambda1(21, renderContext, this), new UiWorkflow$$ExternalSyntheticLambda17(renderContext, this, uiState52, i52), z10, uiStepStyle2, str16, new UiWorkflow$$ExternalSyntheticLambda18(renderContext, this, uiState52, i52), new UiWorkflow$$ExternalSyntheticLambda17(renderContext, this, uiState52, i62), viewModel, z11, new UiWorkflow$$ExternalSyntheticLambda18(renderContext, this, uiState52, i62));
                boolean z122 = displaying.isRequestingGpsPermissions;
                str3 = input.gpsPermissionsTitle;
                if (str3 != null) {
                }
                str4 = input.gpsPermissionsRationale;
                if (str4 == null) {
                }
                String str172 = str4;
                String string22 = context.getString(R.string.pi2_ui_gps_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                string22.getClass();
                str5 = input.gpsFeatureModalPositiveButton;
                if (str5 == null) {
                }
                String str182 = str5;
                str6 = input.gpsPermissionsModalNegativeButton;
                if (str6 == null) {
                }
                boolean z132 = z9;
                return PermissionsStateKt.withRequestPermissionsIfNeeded(entryScreen2, renderContext, z122, permission, z132, str, str172, string22, str182, str6, input.gpsFeatureTitle, input.gpsFeatureRationale, input.gpsPermissionsModalNegativeButton, this.permissionRequestWorkflow, input.styles, displaying.requestPermissionKey, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(this, renderContext, z132, uiState52, 22));
            }
            MrzKey mrzKey = new MrzKey(textValue2, dateValue2, dateValue);
            if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new NfcDataGroupType[]{NfcDataGroupType.Dg1, NfcDataGroupType.Dg2, NfcDataGroupType.Sod});
            } else {
                listOf = new ArrayList();
                Iterator it = enabledDataGroups.iterator();
                while (it.hasNext()) {
                    int i7 = WhenMappings.$EnumSwitchMapping$1[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                    Iterator it2 = it;
                    Object obj3 = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? autoSubmit : NfcDataGroupType.Sod : NfcDataGroupType.Dg14 : NfcDataGroupType.Dg2 : NfcDataGroupType.Dg1;
                    if (obj3 != null) {
                        listOf.add(obj3);
                    }
                    it = it2;
                }
            }
            List list7 = listOf;
            String str19 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle2;
            String str20 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? "" : scanDocumentPrompt;
            String str21 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? "" : authenticating;
            String str22 = (attributes == null || (reading = attributes.getReading()) == null) ? "" : reading;
            String str23 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? "" : readingTitle;
            String str24 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? "" : authenticatingTitle;
            String string3 = context2.getString(R.string.pi2_permissions_cancel);
            string3.getClass();
            String str25 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? "" : scanDocumentSuccessTitle;
            String str26 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? "" : scanDocumentSuccess;
            String str27 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? "" : enableNfcPrompt;
            String string4 = context2.getString(R.string.pi2_permissions_continue);
            string4.getClass();
            String string5 = context2.getString(R.string.pi2_permissions_cancel);
            string5.getClass();
            if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == 0) {
                scanDocumentError = attributes != null ? attributes.getScanDocumentError() : autoSubmit;
                if (scanDocumentError == 0) {
                    str7 = "";
                    String string6 = context2.getString(R.string.pi2_retry);
                    string6.getClass();
                    String str28 = (attributes != null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? "" : authenticationErrorPrompt;
                    String string7 = context2.getString(R.string.pi2_retry);
                    string7.getClass();
                    String str29 = (attributes != null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? "" : scanDocumentError2;
                    String string8 = context2.getString(R.string.pi2_retry);
                    string8.getClass();
                    Workflows.runningWorker(renderContext, ((ScanNfcWorker_Factory_Impl) this.nfcScanWorkerFactory).create(textValue, mrzKey, new PassportNfcStrings(str19, str20, str21, str24, str22, str23, string3, str25, str26, str27, string4, string5, str7, string6, str28, string7, str29, string8, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), list7, input.styles, governmentIdNfcScan.getStyles(), this.featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$2)), Reflection.typeOf(ScanNfcWorker.class), "", new UiWorkflow$$ExternalSyntheticLambda14(this, displaying, nfcScan, governmentIdNfcScanComponent));
                    str = "";
                    uiState = uiState3;
                    navigationStateManager = navigationStateManager2;
                    list = list2;
                }
            }
            str7 = scanDocumentError;
            String string62 = context2.getString(R.string.pi2_retry);
            string62.getClass();
            if (attributes != null) {
            }
            String string72 = context2.getString(R.string.pi2_retry);
            string72.getClass();
            if (attributes != null) {
            }
            String string82 = context2.getString(R.string.pi2_retry);
            string82.getClass();
            Workflows.runningWorker(renderContext, ((ScanNfcWorker_Factory_Impl) this.nfcScanWorkerFactory).create(textValue, mrzKey, new PassportNfcStrings(str19, str20, str21, str24, str22, str23, string3, str25, str26, str27, string4, string5, str7, string62, str28, string72, str29, string82, (attributes != null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? "" : errorModalChipNotDetectedTitle, (attributes != null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? "" : errorModalChipNotDetectedText, (attributes != null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? "" : errorModalLostConnectionTitle, (attributes != null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? "" : errorModalLostConnectionText, (attributes != null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? "" : errorModalIncorrectIdDetailsTitle, (attributes != null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? "" : errorModalIncorrectIdDetailsText, (attributes != null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? "" : errorModalGenericErrorTitle, (attributes != null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? "" : errorModalGenericErrorText, (attributes != null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? "" : errorModalTryAgainButtonText, (attributes != null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? "" : errorModalTroubleshootingTipsButtonText, (attributes != null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? "" : errorModalReenterIdDetailsButtonText, (attributes != null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? "" : scanDocumentPromptTitle, (attributes != null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? "" : rescanDocumentPrompt, (attributes != null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? "" : successfulScanTransitionComponentName, (attributes != null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? "" : unableToScanTransitionComponentName, (attributes != null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? "" : incorrectIdDetailsTransitionComponentName), list7, input.styles, governmentIdNfcScan.getStyles(), this.featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$2)), Reflection.typeOf(ScanNfcWorker.class), "", new UiWorkflow$$ExternalSyntheticLambda14(this, displaying, nfcScan, governmentIdNfcScanComponent));
            str = "";
            uiState = uiState3;
            navigationStateManager = navigationStateManager2;
            list = list2;
        } else {
            z2 = z5;
            pendingAction = pendingAction2;
            str = "";
            uiState = uiState3;
            navigationStateManager = navigationStateManager2;
            list = list2;
        }
        context = context2;
        InquirySessionConfig inquirySessionConfig2 = input.inquirySessionConfig;
        Permission permission2 = inquirySessionConfig2.gpsPrecisionRequirement != GpsPrecisionRequirement.ROUGH ? Permission.RoughLocation : Permission.PreciseLocation;
        if (inquirySessionConfig2.gpsCollectionRequirement != GpsCollectionRequirement.OPTIONAL) {
        }
        str2 = displaying.error;
        if (str2 == null) {
            str2 = context.getString(R.string.pi2_network_connection_error);
        }
        String str162 = str2;
        int i22 = 11;
        if (autoSubmit4 == null) {
        }
        uiState2 = uiState;
        if (autoSubmit4 != null) {
        }
        autoSubmit2 = autoSubmit4;
        List list322 = displaying.components;
        List list422 = input.components;
        List list522 = displaying.componentErrors;
        List list622 = input.serverComponentErrors;
        ArrayList plus22 = CollectionsKt.plus(list622 != null ? list622 : EmptyList.INSTANCE, (Collection) list522);
        NavigationState navigationState22 = navigationStateManager.getNavigationState();
        if (z) {
        }
        autoSubmit3 = autoSubmit;
        if (pendingAction == null) {
        }
        StepStyles.UiStepStyle uiStepStyle22 = displaying.styles;
        if (z2) {
        }
        if (helpBottomSheetComponent != null) {
        }
        final UiState uiState522 = uiState2;
        BasicShieetScope$$ExternalSyntheticLambda0 basicShieetScope$$ExternalSyntheticLambda022 = new BasicShieetScope$$ExternalSyntheticLambda0(this, uiState522, input, renderContext, 18);
        UiWorkflow$$ExternalSyntheticLambda18 uiWorkflow$$ExternalSyntheticLambda1822 = new UiWorkflow$$ExternalSyntheticLambda18(this, uiState522, renderContext);
        final int i322 = 0;
        UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda2522 = new UiWorkflow$$ExternalSyntheticLambda25(this, uiState522, renderContext, input, i322);
        ComposeLayoutInfoKt$$ExternalSyntheticLambda6 composeLayoutInfoKt$$ExternalSyntheticLambda622 = new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(i22, this, uiState522, renderContext);
        Function0 function022 = new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GovernmentIdNfcScan.Attributes attributes2;
                String unableToScanTransitionComponentName2;
                int i422 = i322;
                StatefulWorkflow.RenderContext renderContext2 = renderContext;
                UiState uiState6 = uiState522;
                UiWorkflow uiWorkflow = this;
                HelpBottomSheetComponent helpBottomSheetComponent2 = helpBottomSheetComponent;
                switch (i422) {
                    case 0:
                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent)) {
                            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) helpBottomSheetComponent2;
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState6;
                            UiWorkflow.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(9, governmentIdNfcScanComponent2, displaying2)));
                        }
                        break;
                    default:
                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent) && (attributes2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).config.getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                            UiWorkflow.recurse(((UiState.Displaying) uiState6).components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent2, 0));
                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(11, uiState6, helpBottomSheetComponent2)));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i422 = 1;
        int i522 = 0;
        int i622 = 1;
        Screen.EntryScreen entryScreen22 = new Screen.EntryScreen(list322, list422, plus22, navigationState22, basicShieetScope$$ExternalSyntheticLambda022, uiWorkflow$$ExternalSyntheticLambda1822, uiWorkflow$$ExternalSyntheticLambda2522, composeLayoutInfoKt$$ExternalSyntheticLambda622, function022, new Function0() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GovernmentIdNfcScan.Attributes attributes2;
                String unableToScanTransitionComponentName2;
                int i4222 = i422;
                StatefulWorkflow.RenderContext renderContext2 = renderContext;
                UiState uiState6 = uiState522;
                UiWorkflow uiWorkflow = this;
                HelpBottomSheetComponent helpBottomSheetComponent2 = helpBottomSheetComponent;
                switch (i4222) {
                    case 0:
                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent)) {
                            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) helpBottomSheetComponent2;
                            UiState.Displaying displaying2 = (UiState.Displaying) uiState6;
                            UiWorkflow.recurse(displaying2.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(9, governmentIdNfcScanComponent2, displaying2)));
                        }
                        break;
                    default:
                        if (helpBottomSheetComponent2 != null && (helpBottomSheetComponent2 instanceof GovernmentIdNfcScanComponent) && (attributes2 = ((GovernmentIdNfcScanComponent) helpBottomSheetComponent2).config.getAttributes()) != null && (unableToScanTransitionComponentName2 = attributes2.getUnableToScanTransitionComponentName()) != null && (!StringsKt.isBlank(unableToScanTransitionComponentName2))) {
                            UiWorkflow.recurse(((UiState.Displaying) uiState6).components, new UiWorkflow$$ExternalSyntheticLambda9(true, helpBottomSheetComponent2, 0));
                            renderContext2.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new BlurEffectKt$$ExternalSyntheticLambda1(11, uiState6, helpBottomSheetComponent2)));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new UiWorkflow$$ExternalSyntheticLambda17(this, uiState522, renderContext), autoSubmit3, new Regex$$ExternalSyntheticLambda1(21, renderContext, this), new UiWorkflow$$ExternalSyntheticLambda17(renderContext, this, uiState522, i522), z10, uiStepStyle22, str162, new UiWorkflow$$ExternalSyntheticLambda18(renderContext, this, uiState522, i522), new UiWorkflow$$ExternalSyntheticLambda17(renderContext, this, uiState522, i622), viewModel, z11, new UiWorkflow$$ExternalSyntheticLambda18(renderContext, this, uiState522, i622));
        boolean z1222 = displaying.isRequestingGpsPermissions;
        str3 = input.gpsPermissionsTitle;
        if (str3 != null) {
        }
        str4 = input.gpsPermissionsRationale;
        if (str4 == null) {
        }
        String str1722 = str4;
        String string222 = context.getString(R.string.pi2_ui_gps_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
        string222.getClass();
        str5 = input.gpsFeatureModalPositiveButton;
        if (str5 == null) {
        }
        String str1822 = str5;
        str6 = input.gpsPermissionsModalNegativeButton;
        if (str6 == null) {
        }
        boolean z1322 = z9;
        return PermissionsStateKt.withRequestPermissionsIfNeeded(entryScreen22, renderContext, z1222, permission2, z1322, str, str1722, string222, str1822, str6, input.gpsFeatureTitle, input.gpsFeatureRationale, input.gpsPermissionsModalNegativeButton, this.permissionRequestWorkflow, input.styles, displaying.requestPermissionKey, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(this, renderContext, z1322, uiState522, 22));
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        UiState uiState = (UiState) obj;
        uiState.getClass();
        return SnapshotParcelsKt.toSnapshot(uiState);
    }
}
