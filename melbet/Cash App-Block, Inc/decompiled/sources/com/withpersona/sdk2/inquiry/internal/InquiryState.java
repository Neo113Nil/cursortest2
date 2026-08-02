package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.governmentid.DesignVersion;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public abstract class InquiryState implements WorkflowState, Parcelable {
    public boolean didGoBack;

    public final class Complete extends InquiryState {
        public static final Parcelable.Creator<Complete> CREATOR = new MrzKey.Creator(3);
        public final Map fields;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final String inquiryStatus;
        public final String redirectUri;
        public final String sessionToken;
        public final TransitionStatus transitionStatus;

        public Complete(String str, String str2, TransitionStatus transitionStatus, String str3, Map map, InquirySessionConfig inquirySessionConfig, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.inquiryStatus = str3;
            this.fields = map;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) obj;
            return Intrinsics.areEqual(this.inquiryId, complete.inquiryId) && Intrinsics.areEqual(this.sessionToken, complete.sessionToken) && Intrinsics.areEqual(this.transitionStatus, complete.transitionStatus) && Intrinsics.areEqual(this.inquiryStatus, complete.inquiryStatus) && this.fields.equals(complete.fields) && Intrinsics.areEqual(this.inquirySessionConfig, complete.inquirySessionConfig) && Intrinsics.areEqual(this.redirectUri, complete.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode = (this.inquirySessionConfig.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31, 31, this.inquiryStatus), this.fields, 31)) * 31;
            String str = this.redirectUri;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Complete(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", transitionStatus=");
            m.append(this.transitionStatus);
            m.append(", inquiryStatus=");
            m.append(this.inquiryStatus);
            m.append(", fields=");
            m.append(this.fields);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", redirectUri=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.redirectUri, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeString(this.inquiryStatus);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.fields, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeString(this.redirectUri);
        }
    }

    public final class CreateInquiryFromTemplate extends InquiryState {
        public static final Parcelable.Creator<CreateInquiryFromTemplate> CREATOR = new MrzKey.Creator(4);
        public final String accountId;
        public final String environmentId;
        public final Map fields;
        public final InquirySessionConfig inquirySessionConfig;
        public final String redirectUri;
        public final String referenceId;
        public final StaticInquiryTemplate staticInquiryTemplate;
        public final String templateId;
        public final String templateVersion;
        public final String themeSetId;

        public CreateInquiryFromTemplate(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, InquirySessionConfig inquirySessionConfig, String str7) {
            inquirySessionConfig.getClass();
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.environmentId = str4;
            this.referenceId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
            this.inquirySessionConfig = inquirySessionConfig;
            this.redirectUri = str7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateInquiryFromTemplate)) {
                return false;
            }
            CreateInquiryFromTemplate createInquiryFromTemplate = (CreateInquiryFromTemplate) obj;
            return Intrinsics.areEqual(this.templateId, createInquiryFromTemplate.templateId) && Intrinsics.areEqual(this.templateVersion, createInquiryFromTemplate.templateVersion) && Intrinsics.areEqual(this.accountId, createInquiryFromTemplate.accountId) && Intrinsics.areEqual(this.environmentId, createInquiryFromTemplate.environmentId) && Intrinsics.areEqual(this.referenceId, createInquiryFromTemplate.referenceId) && Intrinsics.areEqual(this.fields, createInquiryFromTemplate.fields) && Intrinsics.areEqual(this.themeSetId, createInquiryFromTemplate.themeSetId) && Intrinsics.areEqual(this.staticInquiryTemplate, createInquiryFromTemplate.staticInquiryTemplate) && Intrinsics.areEqual(this.inquirySessionConfig, createInquiryFromTemplate.inquirySessionConfig) && Intrinsics.areEqual(this.redirectUri, createInquiryFromTemplate.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public final int hashCode() {
            String str = this.templateId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.environmentId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referenceId;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map map = this.fields;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            int hashCode8 = (this.inquirySessionConfig.hashCode() + ((hashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31)) * 31;
            String str7 = this.redirectUri;
            return hashCode8 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreateInquiryFromTemplate(templateId=", this.templateId, ", templateVersion=", this.templateVersion, ", accountId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.accountId, ", environmentId=", this.environmentId, ", referenceId=");
            m.append(this.referenceId);
            m.append(", fields=");
            m.append(this.fields);
            m.append(", themeSetId=");
            m.append(this.themeSetId);
            m.append(", staticInquiryTemplate=");
            m.append(this.staticInquiryTemplate);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", redirectUri=");
            m.append(this.redirectUri);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.templateId);
            parcel.writeString(this.templateVersion);
            parcel.writeString(this.accountId);
            parcel.writeString(this.environmentId);
            parcel.writeString(this.referenceId);
            Map map = this.fields;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeParcelable((Parcelable) entry.getValue(), i);
                }
            }
            parcel.writeString(this.themeSetId);
            parcel.writeParcelable(this.staticInquiryTemplate, i);
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeString(this.redirectUri);
        }
    }

    public final class DocumentStepRunning extends InquiryState implements StepState {
        public static final Parcelable.Creator<DocumentStepRunning> CREATOR = new Creator();
        public final NextStep.Document.AssetConfig assetConfig;
        public final NextStep.CancelDialog cancelDialog;
        public final NextStep.Document documentStep;
        public final String fromComponent;
        public final String fromStep;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final DocumentPages pages;
        public final String sessionToken;
        public final StepStyles.DocumentStepStyle styles;
        public final TransitionStatus transitionStatus;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DocumentStepRunning(parcel.readString(), parcel.readString(), (TransitionStatus) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (DocumentPages) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentStepRunning[i];
            }
        }

        public DocumentStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, DocumentPages documentPages, NextStep.Document.AssetConfig assetConfig, String str4, InquirySessionConfig inquirySessionConfig) {
            str.getClass();
            str2.getClass();
            document.getClass();
            str3.getClass();
            documentPages.getClass();
            str4.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = documentStepStyle;
            this.cancelDialog = cancelDialog;
            this.documentStep = document;
            this.fromComponent = str3;
            this.pages = documentPages;
            this.assetConfig = assetConfig;
            this.fromStep = str4;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        public static DocumentStepRunning copy$default(DocumentStepRunning documentStepRunning, TransitionStatus transitionStatus) {
            String str = documentStepRunning.inquiryId;
            String str2 = documentStepRunning.sessionToken;
            StepStyles.DocumentStepStyle documentStepStyle = documentStepRunning.styles;
            NextStep.CancelDialog cancelDialog = documentStepRunning.cancelDialog;
            NextStep.Document document = documentStepRunning.documentStep;
            String str3 = documentStepRunning.fromComponent;
            DocumentPages documentPages = documentStepRunning.pages;
            NextStep.Document.AssetConfig assetConfig = documentStepRunning.assetConfig;
            String str4 = documentStepRunning.fromStep;
            InquirySessionConfig inquirySessionConfig = documentStepRunning.inquirySessionConfig;
            documentStepRunning.getClass();
            str.getClass();
            str2.getClass();
            document.getClass();
            str3.getClass();
            documentPages.getClass();
            str4.getClass();
            inquirySessionConfig.getClass();
            return new DocumentStepRunning(str, str2, transitionStatus, documentStepStyle, cancelDialog, document, str3, documentPages, assetConfig, str4, inquirySessionConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentStepRunning)) {
                return false;
            }
            DocumentStepRunning documentStepRunning = (DocumentStepRunning) obj;
            return Intrinsics.areEqual(this.inquiryId, documentStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, documentStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, documentStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, documentStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, documentStepRunning.cancelDialog) && Intrinsics.areEqual(this.documentStep, documentStepRunning.documentStep) && Intrinsics.areEqual(this.fromComponent, documentStepRunning.fromComponent) && Intrinsics.areEqual(this.pages, documentStepRunning.pages) && Intrinsics.areEqual(this.assetConfig, documentStepRunning.assetConfig) && Intrinsics.areEqual(this.fromStep, documentStepRunning.fromStep) && Intrinsics.areEqual(this.inquirySessionConfig, documentStepRunning.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.StepState
        public final StepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode = (m + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int hashCode2 = (hashCode + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode3 = (this.pages.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.documentStep.hashCode() + ((hashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31)) * 31, 31, this.fromComponent)) * 31;
            NextStep.Document.AssetConfig assetConfig = this.assetConfig;
            return this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (assetConfig != null ? assetConfig.hashCode() : 0)) * 31, 31, this.fromStep);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentStepRunning(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", transitionStatus=");
            m.append(this.transitionStatus);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", cancelDialog=");
            m.append(this.cancelDialog);
            m.append(", documentStep=");
            m.append(this.documentStep);
            m.append(", fromComponent=");
            m.append(this.fromComponent);
            m.append(", pages=");
            m.append(this.pages);
            m.append(", assetConfig=");
            m.append(this.assetConfig);
            m.append(", fromStep=");
            m.append(this.fromStep);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.cancelDialog, i);
            parcel.writeParcelable(this.documentStep, i);
            parcel.writeString(this.fromComponent);
            parcel.writeParcelable(this.pages, i);
            parcel.writeParcelable(this.assetConfig, i);
            parcel.writeString(this.fromStep);
            parcel.writeParcelable(this.inquirySessionConfig, i);
        }
    }

    public final class ExchangeOneTimeCode extends InquiryState {
        public static final Parcelable.Creator<ExchangeOneTimeCode> CREATOR = new MrzKey.Creator(6);
        public final InquirySessionConfig inquirySessionConfig;
        public final String oneTimeLinkCode;

        public ExchangeOneTimeCode(String str, InquirySessionConfig inquirySessionConfig) {
            str.getClass();
            inquirySessionConfig.getClass();
            this.oneTimeLinkCode = str;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExchangeOneTimeCode)) {
                return false;
            }
            ExchangeOneTimeCode exchangeOneTimeCode = (ExchangeOneTimeCode) obj;
            return Intrinsics.areEqual(this.oneTimeLinkCode, exchangeOneTimeCode.oneTimeLinkCode) && Intrinsics.areEqual(this.inquirySessionConfig, exchangeOneTimeCode.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public final int hashCode() {
            return this.inquirySessionConfig.hashCode() + (this.oneTimeLinkCode.hashCode() * 31);
        }

        public final String toString() {
            return "ExchangeOneTimeCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.oneTimeLinkCode);
            parcel.writeParcelable(this.inquirySessionConfig, i);
        }
    }

    public final class GovernmentIdStepRunning extends InquiryState implements StepState {
        public static final Parcelable.Creator<GovernmentIdStepRunning> CREATOR = new Creator();
        public final NextStep.GovernmentId.AssetConfig assetConfig;
        public final boolean audioEnabled;
        public final AutoClassificationConfig autoClassificationConfig;
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final NextStep.CancelDialog cancelDialog;
        public final String countryCode;
        public final DesignVersion designVersion;
        public final DigitalIdConfig digitalIdConfig;
        public final List enabledCaptureFileTypes;
        public final List enabledCaptureOptionsNativeMobile;
        public final List enabledIdClasses;
        public final String fieldKeyDocument;
        public final String fieldKeyIdClass;
        public final String flowWatermarkText;
        public final String fromComponent;
        public final String fromStep;
        public final Integer holographicTorchEnabledDurationMs;
        public final int imageCaptureCount;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final List localizationOverrides;
        public final NextStep.GovernmentId.Localizations localizations;
        public final long manualCaptureButtonDelayMs;
        public final PendingPageTextPosition pendingPageTextVerticalPosition;
        public final StyleElements.Axis reviewCaptureButtonsAxis;
        public final String sessionToken;
        public final boolean shouldSkipReviewScreen;
        public final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;
        public final String silentNetworkAuthenticationCheckUrl;
        public final boolean staticCaptureTipsEnabled;
        public final StepStyles.GovernmentIdStepStyle styles;
        public final TransitionStatus transitionStatus;
        public final List videoCaptureMethods;
        public final String webRtcJwt;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                TransitionStatus transitionStatus;
                boolean z2;
                String str;
                String str2;
                ArrayList arrayList;
                boolean z3;
                boolean z4;
                String str3;
                boolean z5;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransitionStatus transitionStatus2 = (TransitionStatus) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                boolean z6 = false;
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdStepRunning.class, parcel, arrayList2, i, 1);
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    transitionStatus = transitionStatus2;
                    z2 = true;
                } else {
                    transitionStatus = transitionStatus2;
                    z2 = z;
                }
                NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    str = readString;
                    str2 = readString2;
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    str = readString;
                    int i2 = 0;
                    while (true) {
                        str2 = readString2;
                        if (i2 == readInt2) {
                            break;
                        }
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdStepRunning.class, parcel, arrayList3, i2, 1);
                        readString2 = str2;
                    }
                    arrayList = arrayList3;
                }
                int readInt3 = parcel.readInt();
                TransitionStatus transitionStatus3 = transitionStatus;
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    arrayList4.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                    i3++;
                    readInt3 = readInt3;
                }
                int readInt4 = parcel.readInt();
                boolean z7 = true;
                long readLong = parcel.readLong();
                String str4 = str;
                String readString6 = parcel.readString();
                String str5 = str2;
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z7 = false;
                }
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                int i4 = 0;
                while (i4 != readInt5) {
                    arrayList5.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
                    i4++;
                    readInt5 = readInt5;
                }
                int readInt6 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt6);
                int i5 = 0;
                while (i5 != readInt6) {
                    arrayList6.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(parcel.readString()));
                    i5++;
                    readInt6 = readInt6;
                }
                String readString8 = parcel.readString();
                NextStep.GovernmentId.AssetConfig assetConfig = (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                AutoClassificationConfig autoClassificationConfig = (AutoClassificationConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StyleElements.Axis valueOf = StyleElements.Axis.valueOf(parcel.readString());
                PendingPageTextPosition valueOf2 = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    str3 = readString8;
                    z5 = z4;
                } else {
                    z4 = z3;
                    str3 = readString8;
                    z5 = false;
                }
                DigitalIdConfig digitalIdConfig = (DigitalIdConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new GovernmentIdStepRunning(str4, str5, transitionStatus3, governmentIdStepStyle, cancelDialog, readString3, arrayList2, readString4, readString5, z6, z2, localizations, arrayList, arrayList4, readInt4, readLong, readString6, readString7, z7, arrayList5, arrayList6, str3, assetConfig, autoClassificationConfig, valueOf, valueOf2, z5, digitalIdConfig, z4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (InquirySessionConfig) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()), DesignVersion.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GovernmentIdStepRunning[i];
            }
        }

        public GovernmentIdStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z, boolean z2, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i, long j, String str6, String str7, boolean z3, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, AutoClassificationConfig autoClassificationConfig, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z4, DigitalIdConfig digitalIdConfig, boolean z5, Integer num, InquirySessionConfig inquirySessionConfig, DesignVersion designVersion, String str9, String str10, Integer num2) {
            str.getClass();
            str2.getClass();
            list.getClass();
            str4.getClass();
            str5.getClass();
            localizations.getClass();
            list3.getClass();
            str6.getClass();
            str7.getClass();
            list4.getClass();
            list5.getClass();
            autoClassificationConfig.getClass();
            axis.getClass();
            pendingPageTextPosition.getClass();
            inquirySessionConfig.getClass();
            designVersion.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = governmentIdStepStyle;
            this.cancelDialog = cancelDialog;
            this.countryCode = str3;
            this.enabledIdClasses = list;
            this.fromComponent = str4;
            this.fromStep = str5;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.localizations = localizations;
            this.localizationOverrides = list2;
            this.enabledCaptureOptionsNativeMobile = list3;
            this.imageCaptureCount = i;
            this.manualCaptureButtonDelayMs = j;
            this.fieldKeyDocument = str6;
            this.fieldKeyIdClass = str7;
            this.shouldSkipReviewScreen = z3;
            this.enabledCaptureFileTypes = list4;
            this.videoCaptureMethods = list5;
            this.webRtcJwt = str8;
            this.assetConfig = assetConfig;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = axis;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.audioEnabled = z4;
            this.digitalIdConfig = digitalIdConfig;
            this.staticCaptureTipsEnabled = z5;
            this.holographicTorchEnabledDurationMs = num;
            this.inquirySessionConfig = inquirySessionConfig;
            this.designVersion = designVersion;
            this.flowWatermarkText = str9;
            this.silentNetworkAuthenticationCheckUrl = str10;
            this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num2;
        }

        public static GovernmentIdStepRunning copy$default(GovernmentIdStepRunning governmentIdStepRunning, TransitionStatus transitionStatus) {
            String str = governmentIdStepRunning.inquiryId;
            String str2 = governmentIdStepRunning.sessionToken;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = governmentIdStepRunning.styles;
            NextStep.CancelDialog cancelDialog = governmentIdStepRunning.cancelDialog;
            String str3 = governmentIdStepRunning.countryCode;
            List list = governmentIdStepRunning.enabledIdClasses;
            String str4 = governmentIdStepRunning.fromComponent;
            String str5 = governmentIdStepRunning.fromStep;
            boolean z = governmentIdStepRunning.backStepEnabled;
            boolean z2 = governmentIdStepRunning.cancelButtonEnabled;
            NextStep.GovernmentId.Localizations localizations = governmentIdStepRunning.localizations;
            List list2 = governmentIdStepRunning.localizationOverrides;
            List list3 = governmentIdStepRunning.enabledCaptureOptionsNativeMobile;
            int i = governmentIdStepRunning.imageCaptureCount;
            long j = governmentIdStepRunning.manualCaptureButtonDelayMs;
            String str6 = governmentIdStepRunning.fieldKeyDocument;
            String str7 = governmentIdStepRunning.fieldKeyIdClass;
            boolean z3 = governmentIdStepRunning.shouldSkipReviewScreen;
            List list4 = governmentIdStepRunning.enabledCaptureFileTypes;
            List list5 = governmentIdStepRunning.videoCaptureMethods;
            String str8 = governmentIdStepRunning.webRtcJwt;
            NextStep.GovernmentId.AssetConfig assetConfig = governmentIdStepRunning.assetConfig;
            AutoClassificationConfig autoClassificationConfig = governmentIdStepRunning.autoClassificationConfig;
            StyleElements.Axis axis = governmentIdStepRunning.reviewCaptureButtonsAxis;
            PendingPageTextPosition pendingPageTextPosition = governmentIdStepRunning.pendingPageTextVerticalPosition;
            boolean z4 = governmentIdStepRunning.audioEnabled;
            DigitalIdConfig digitalIdConfig = governmentIdStepRunning.digitalIdConfig;
            boolean z5 = governmentIdStepRunning.staticCaptureTipsEnabled;
            Integer num = governmentIdStepRunning.holographicTorchEnabledDurationMs;
            InquirySessionConfig inquirySessionConfig = governmentIdStepRunning.inquirySessionConfig;
            DesignVersion designVersion = governmentIdStepRunning.designVersion;
            String str9 = governmentIdStepRunning.flowWatermarkText;
            String str10 = governmentIdStepRunning.silentNetworkAuthenticationCheckUrl;
            Integer num2 = governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            governmentIdStepRunning.getClass();
            str.getClass();
            str2.getClass();
            list.getClass();
            str4.getClass();
            str5.getClass();
            localizations.getClass();
            list3.getClass();
            str6.getClass();
            str7.getClass();
            list4.getClass();
            list5.getClass();
            autoClassificationConfig.getClass();
            axis.getClass();
            pendingPageTextPosition.getClass();
            inquirySessionConfig.getClass();
            designVersion.getClass();
            return new GovernmentIdStepRunning(str, str2, transitionStatus, governmentIdStepStyle, cancelDialog, str3, list, str4, str5, z, z2, localizations, list2, list3, i, j, str6, str7, z3, list4, list5, str8, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, z4, digitalIdConfig, z5, num, inquirySessionConfig, designVersion, str9, str10, num2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GovernmentIdStepRunning)) {
                return false;
            }
            GovernmentIdStepRunning governmentIdStepRunning = (GovernmentIdStepRunning) obj;
            return Intrinsics.areEqual(this.inquiryId, governmentIdStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, governmentIdStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, governmentIdStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, governmentIdStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, governmentIdStepRunning.cancelDialog) && Intrinsics.areEqual(this.countryCode, governmentIdStepRunning.countryCode) && Intrinsics.areEqual(this.enabledIdClasses, governmentIdStepRunning.enabledIdClasses) && Intrinsics.areEqual(this.fromComponent, governmentIdStepRunning.fromComponent) && Intrinsics.areEqual(this.fromStep, governmentIdStepRunning.fromStep) && this.backStepEnabled == governmentIdStepRunning.backStepEnabled && this.cancelButtonEnabled == governmentIdStepRunning.cancelButtonEnabled && Intrinsics.areEqual(this.localizations, governmentIdStepRunning.localizations) && Intrinsics.areEqual(this.localizationOverrides, governmentIdStepRunning.localizationOverrides) && Intrinsics.areEqual(this.enabledCaptureOptionsNativeMobile, governmentIdStepRunning.enabledCaptureOptionsNativeMobile) && this.imageCaptureCount == governmentIdStepRunning.imageCaptureCount && this.manualCaptureButtonDelayMs == governmentIdStepRunning.manualCaptureButtonDelayMs && Intrinsics.areEqual(this.fieldKeyDocument, governmentIdStepRunning.fieldKeyDocument) && Intrinsics.areEqual(this.fieldKeyIdClass, governmentIdStepRunning.fieldKeyIdClass) && this.shouldSkipReviewScreen == governmentIdStepRunning.shouldSkipReviewScreen && Intrinsics.areEqual(this.enabledCaptureFileTypes, governmentIdStepRunning.enabledCaptureFileTypes) && Intrinsics.areEqual(this.videoCaptureMethods, governmentIdStepRunning.videoCaptureMethods) && Intrinsics.areEqual(this.webRtcJwt, governmentIdStepRunning.webRtcJwt) && Intrinsics.areEqual(this.assetConfig, governmentIdStepRunning.assetConfig) && Intrinsics.areEqual(this.autoClassificationConfig, governmentIdStepRunning.autoClassificationConfig) && this.reviewCaptureButtonsAxis == governmentIdStepRunning.reviewCaptureButtonsAxis && this.pendingPageTextVerticalPosition == governmentIdStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == governmentIdStepRunning.audioEnabled && Intrinsics.areEqual(this.digitalIdConfig, governmentIdStepRunning.digitalIdConfig) && this.staticCaptureTipsEnabled == governmentIdStepRunning.staticCaptureTipsEnabled && Intrinsics.areEqual(this.holographicTorchEnabledDurationMs, governmentIdStepRunning.holographicTorchEnabledDurationMs) && Intrinsics.areEqual(this.inquirySessionConfig, governmentIdStepRunning.inquirySessionConfig) && this.designVersion == governmentIdStepRunning.designVersion && Intrinsics.areEqual(this.flowWatermarkText, governmentIdStepRunning.flowWatermarkText) && Intrinsics.areEqual(this.silentNetworkAuthenticationCheckUrl, governmentIdStepRunning.silentNetworkAuthenticationCheckUrl) && Intrinsics.areEqual(this.silentNetworkAuthenticationBackgroundTimeoutSeconds, governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.StepState
        public final StepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode = (m + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
            int hashCode2 = (hashCode + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode3 = (hashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            String str = this.countryCode;
            int hashCode4 = (this.localizations.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.enabledIdClasses), 31, this.fromComponent), 31, this.fromStep), 31, this.backStepEnabled), 31, this.cancelButtonEnabled)) * 31;
            List list = this.localizationOverrides;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageCaptureCount, Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.enabledCaptureOptionsNativeMobile), 31), 31, this.manualCaptureButtonDelayMs), 31, this.fieldKeyDocument), 31, this.fieldKeyIdClass), 31, this.shouldSkipReviewScreen), 31, this.enabledCaptureFileTypes), 31, this.videoCaptureMethods);
            String str2 = this.webRtcJwt;
            int hashCode5 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            NextStep.GovernmentId.AssetConfig assetConfig = this.assetConfig;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.pendingPageTextVerticalPosition.hashCode() + ((this.reviewCaptureButtonsAxis.hashCode() + ((this.autoClassificationConfig.hashCode() + ((hashCode5 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.audioEnabled);
            DigitalIdConfig digitalIdConfig = this.digitalIdConfig;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (digitalIdConfig == null ? 0 : digitalIdConfig.hashCode())) * 31, 31, this.staticCaptureTipsEnabled);
            Integer num = this.holographicTorchEnabledDurationMs;
            int hashCode6 = (this.designVersion.hashCode() + ((this.inquirySessionConfig.hashCode() + ((m4 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
            String str3 = this.flowWatermarkText;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.silentNetworkAuthenticationCheckUrl;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num2 = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            return hashCode8 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GovernmentIdStepRunning(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", transitionStatus=");
            m.append(this.transitionStatus);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", cancelDialog=");
            m.append(this.cancelDialog);
            m.append(", countryCode=");
            m.append(this.countryCode);
            m.append(", enabledIdClasses=");
            Recorder$$ExternalSyntheticOutline2.m(", fromComponent=", this.fromComponent, ", fromStep=", m, this.enabledIdClasses);
            NavAction$$ExternalSyntheticOutline0.m(m, this.fromStep, ", backStepEnabled=", this.backStepEnabled, ", cancelButtonEnabled=");
            m.append(this.cancelButtonEnabled);
            m.append(", localizations=");
            m.append(this.localizations);
            m.append(", localizationOverrides=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.localizationOverrides, ", enabledCaptureOptionsNativeMobile=", this.enabledCaptureOptionsNativeMobile, ", imageCaptureCount=");
            m.append(this.imageCaptureCount);
            m.append(", manualCaptureButtonDelayMs=");
            m.append(this.manualCaptureButtonDelayMs);
            Boxes$$ExternalSyntheticOutline1.m(m, ", fieldKeyDocument=", this.fieldKeyDocument, ", fieldKeyIdClass=", this.fieldKeyIdClass);
            m.append(", shouldSkipReviewScreen=");
            m.append(this.shouldSkipReviewScreen);
            m.append(", enabledCaptureFileTypes=");
            m.append(this.enabledCaptureFileTypes);
            m.append(", videoCaptureMethods=");
            m.append(this.videoCaptureMethods);
            m.append(", webRtcJwt=");
            m.append(this.webRtcJwt);
            m.append(", assetConfig=");
            m.append(this.assetConfig);
            m.append(", autoClassificationConfig=");
            m.append(this.autoClassificationConfig);
            m.append(", reviewCaptureButtonsAxis=");
            m.append(this.reviewCaptureButtonsAxis);
            m.append(", pendingPageTextVerticalPosition=");
            m.append(this.pendingPageTextVerticalPosition);
            m.append(", audioEnabled=");
            m.append(this.audioEnabled);
            m.append(", digitalIdConfig=");
            m.append(this.digitalIdConfig);
            m.append(", staticCaptureTipsEnabled=");
            m.append(this.staticCaptureTipsEnabled);
            m.append(", holographicTorchEnabledDurationMs=");
            m.append(this.holographicTorchEnabledDurationMs);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", designVersion=");
            m.append(this.designVersion);
            Boxes$$ExternalSyntheticOutline1.m(m, ", flowWatermarkText=", this.flowWatermarkText, ", silentNetworkAuthenticationCheckUrl=", this.silentNetworkAuthenticationCheckUrl);
            m.append(", silentNetworkAuthenticationBackgroundTimeoutSeconds=");
            m.append(this.silentNetworkAuthenticationBackgroundTimeoutSeconds);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.cancelDialog, i);
            parcel.writeString(this.countryCode);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledIdClasses, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.fromComponent);
            parcel.writeString(this.fromStep);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeParcelable(this.localizations, i);
            List list = this.localizationOverrides;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m2.hasNext()) {
                    parcel.writeParcelable((Parcelable) m2.next(), i);
                }
            }
            Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledCaptureOptionsNativeMobile, parcel);
            while (m3.hasNext()) {
                parcel.writeString(((CaptureOptionNativeMobile) m3.next()).name());
            }
            parcel.writeInt(this.imageCaptureCount);
            parcel.writeLong(this.manualCaptureButtonDelayMs);
            parcel.writeString(this.fieldKeyDocument);
            parcel.writeString(this.fieldKeyIdClass);
            parcel.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            Iterator m4 = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledCaptureFileTypes, parcel);
            while (m4.hasNext()) {
                parcel.writeString(((NextStep.GovernmentId.CaptureFileType) m4.next()).name());
            }
            Iterator m5 = CameraState$Type$EnumUnboxingLocalUtility.m(this.videoCaptureMethods, parcel);
            while (m5.hasNext()) {
                parcel.writeString(((NextStep.GovernmentId.VideoCaptureMethod) m5.next()).name());
            }
            parcel.writeString(this.webRtcJwt);
            parcel.writeParcelable(this.assetConfig, i);
            parcel.writeParcelable(this.autoClassificationConfig, i);
            parcel.writeString(this.reviewCaptureButtonsAxis.name());
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
            parcel.writeInt(this.audioEnabled ? 1 : 0);
            parcel.writeParcelable(this.digitalIdConfig, i);
            parcel.writeInt(this.staticCaptureTipsEnabled ? 1 : 0);
            Integer num = this.holographicTorchEnabledDurationMs;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeString(this.designVersion.name());
            parcel.writeString(this.flowWatermarkText);
            parcel.writeString(this.silentNetworkAuthenticationCheckUrl);
            Integer num2 = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
            }
        }
    }

    public final class IntegrationStepRunning extends InquiryState implements StepState {
        public static final Parcelable.Creator<IntegrationStepRunning> CREATOR = new Creator();
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final NextStep.CancelDialog cancelDialog;
        public final String clientSideKey;
        public final String flowUrl;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final String inquiryStatus;
        public final IntegrationPage integrationPage;
        public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;
        public final NextStep.Integration.Localizations localizations;
        public final String redirectPath;
        public final String sessionToken;
        public final String stepName;
        public final StepStyles.IntegrationStepStyle styles;
        public final InternalErrorInfo transitionError;
        public final TransitionStatus transitionStatus;

        /* renamed from: type, reason: collision with root package name */
        public final String f1456type;

        public final class Creator implements Parcelable.Creator {
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning, still in use, count: 2, list:
                  (r1v0 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning) from 0x006f: MOVE (r15v1 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning) = (r1v0 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning)
                  (r1v0 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning) from 0x006b: MOVE (r15v5 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning) = (r1v0 com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r20) {
                /*
                    r19 = this;
                    r0 = r20
                    r0.getClass()
                    com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning r1 = new com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning
                    r2 = r1
                    java.lang.String r1 = r0.readString()
                    r3 = r2
                    java.lang.String r2 = r0.readString()
                    java.lang.Class<com.withpersona.sdk2.inquiry.internal.InquiryState$IntegrationStepRunning> r4 = com.withpersona.sdk2.inquiry.internal.InquiryState.IntegrationStepRunning.class
                    java.lang.ClassLoader r5 = r4.getClassLoader()
                    android.os.Parcelable r5 = r0.readParcelable(r5)
                    com.withpersona.sdk2.inquiry.internal.TransitionStatus r5 = (com.withpersona.sdk2.inquiry.internal.TransitionStatus) r5
                    java.lang.ClassLoader r6 = r4.getClassLoader()
                    android.os.Parcelable r6 = r0.readParcelable(r6)
                    com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$IntegrationStepStyle r6 = (com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles.IntegrationStepStyle) r6
                    java.lang.ClassLoader r7 = r4.getClassLoader()
                    android.os.Parcelable r7 = r0.readParcelable(r7)
                    com.withpersona.sdk2.inquiry.network.dto.NextStep$CancelDialog r7 = (com.withpersona.sdk2.inquiry.network.dto.NextStep.CancelDialog) r7
                    r8 = r4
                    r4 = r6
                    java.lang.String r6 = r0.readString()
                    r9 = r3
                    r3 = r5
                    r5 = r7
                    java.lang.String r7 = r0.readString()
                    r10 = r8
                    java.lang.String r8 = r0.readString()
                    java.lang.String r11 = r0.readString()
                    com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$IntegrationStepBrowserType r11 = com.withpersona.sdk2.inquiry.network.dto.NextStep.Integration.IntegrationStepBrowserType.valueOf(r11)
                    java.lang.ClassLoader r12 = r10.getClassLoader()
                    android.os.Parcelable r12 = r0.readParcelable(r12)
                    com.withpersona.sdk2.inquiry.network.dto.NextStep$Integration$Localizations r12 = (com.withpersona.sdk2.inquiry.network.dto.NextStep.Integration.Localizations) r12
                    r13 = r9
                    r9 = r11
                    java.lang.String r11 = r0.readString()
                    r14 = r10
                    r10 = r12
                    java.lang.String r12 = r0.readString()
                    int r15 = r0.readInt()
                    r16 = 0
                    r17 = 1
                    if (r15 == 0) goto L6f
                    r15 = r13
                    r13 = r17
                    goto L72
                L6f:
                    r15 = r13
                    r13 = r16
                L72:
                    int r18 = r0.readInt()
                    if (r18 == 0) goto L7a
                    r16 = r17
                L7a:
                    r17 = r15
                    java.lang.String r15 = r0.readString()
                    r19 = r1
                    java.lang.ClassLoader r1 = r14.getClassLoader()
                    android.os.Parcelable r1 = r0.readParcelable(r1)
                    com.withpersona.sdk2.inquiry.integration.IntegrationPage r1 = (com.withpersona.sdk2.inquiry.integration.IntegrationPage) r1
                    r18 = r1
                    java.lang.ClassLoader r1 = r14.getClassLoader()
                    android.os.Parcelable r1 = r0.readParcelable(r1)
                    com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo r1 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo) r1
                    java.lang.ClassLoader r14 = r14.getClassLoader()
                    android.os.Parcelable r0 = r0.readParcelable(r14)
                    com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r0 = (com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig) r0
                    r14 = r16
                    r16 = r18
                    r18 = r0
                    r0 = r17
                    r17 = r1
                    r1 = r19
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    r15 = r0
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.InquiryState.IntegrationStepRunning.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntegrationStepRunning[i];
            }
        }

        public IntegrationStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str3, String str4, String str5, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType, NextStep.Integration.Localizations localizations, String str6, String str7, boolean z, boolean z2, String str8, IntegrationPage integrationPage, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
            integrationStepBrowserType.getClass();
            str6.getClass();
            str7.getClass();
            str8.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = integrationStepStyle;
            this.cancelDialog = cancelDialog;
            this.f1456type = str3;
            this.flowUrl = str4;
            this.redirectPath = str5;
            this.integrationStepBrowserType = integrationStepBrowserType;
            this.localizations = localizations;
            this.inquiryStatus = str6;
            this.stepName = str7;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.clientSideKey = str8;
            this.integrationPage = integrationPage;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        public static IntegrationStepRunning copy$default(IntegrationStepRunning integrationStepRunning, TransitionStatus transitionStatus) {
            String str = integrationStepRunning.inquiryId;
            String str2 = integrationStepRunning.sessionToken;
            StepStyles.IntegrationStepStyle integrationStepStyle = integrationStepRunning.styles;
            NextStep.CancelDialog cancelDialog = integrationStepRunning.cancelDialog;
            String str3 = integrationStepRunning.f1456type;
            String str4 = integrationStepRunning.flowUrl;
            String str5 = integrationStepRunning.redirectPath;
            NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = integrationStepRunning.integrationStepBrowserType;
            NextStep.Integration.Localizations localizations = integrationStepRunning.localizations;
            String str6 = integrationStepRunning.inquiryStatus;
            String str7 = integrationStepRunning.stepName;
            boolean z = integrationStepRunning.backStepEnabled;
            boolean z2 = integrationStepRunning.cancelButtonEnabled;
            String str8 = integrationStepRunning.clientSideKey;
            IntegrationPage integrationPage = integrationStepRunning.integrationPage;
            InternalErrorInfo internalErrorInfo = integrationStepRunning.transitionError;
            InquirySessionConfig inquirySessionConfig = integrationStepRunning.inquirySessionConfig;
            integrationStepRunning.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            integrationStepBrowserType.getClass();
            str6.getClass();
            str7.getClass();
            str8.getClass();
            inquirySessionConfig.getClass();
            return new IntegrationStepRunning(str, str2, transitionStatus, integrationStepStyle, cancelDialog, str3, str4, str5, integrationStepBrowserType, localizations, str6, str7, z, z2, str8, integrationPage, internalErrorInfo, inquirySessionConfig);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegrationStepRunning)) {
                return false;
            }
            IntegrationStepRunning integrationStepRunning = (IntegrationStepRunning) obj;
            return Intrinsics.areEqual(this.inquiryId, integrationStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, integrationStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, integrationStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, integrationStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, integrationStepRunning.cancelDialog) && Intrinsics.areEqual(this.f1456type, integrationStepRunning.f1456type) && Intrinsics.areEqual(this.flowUrl, integrationStepRunning.flowUrl) && Intrinsics.areEqual(this.redirectPath, integrationStepRunning.redirectPath) && this.integrationStepBrowserType == integrationStepRunning.integrationStepBrowserType && Intrinsics.areEqual(this.localizations, integrationStepRunning.localizations) && Intrinsics.areEqual(this.inquiryStatus, integrationStepRunning.inquiryStatus) && Intrinsics.areEqual(this.stepName, integrationStepRunning.stepName) && this.backStepEnabled == integrationStepRunning.backStepEnabled && this.cancelButtonEnabled == integrationStepRunning.cancelButtonEnabled && Intrinsics.areEqual(this.clientSideKey, integrationStepRunning.clientSideKey) && Intrinsics.areEqual(this.integrationPage, integrationStepRunning.integrationPage) && Intrinsics.areEqual(this.transitionError, integrationStepRunning.transitionError) && Intrinsics.areEqual(this.inquirySessionConfig, integrationStepRunning.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.StepState
        public final StepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode = (m + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int hashCode2 = (hashCode + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode3 = (this.integrationStepBrowserType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31, 31, this.f1456type), 31, this.flowUrl), 31, this.redirectPath)) * 31;
            NextStep.Integration.Localizations localizations = this.localizations;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (localizations == null ? 0 : localizations.hashCode())) * 31, 31, this.inquiryStatus), 31, this.stepName), 31, this.backStepEnabled), 31, this.cancelButtonEnabled), 31, this.clientSideKey);
            IntegrationPage integrationPage = this.integrationPage;
            int hashCode4 = (m2 + (integrationPage == null ? 0 : integrationPage.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return this.inquirySessionConfig.hashCode() + ((hashCode4 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IntegrationStepRunning(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", transitionStatus=");
            m.append(this.transitionStatus);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", cancelDialog=");
            m.append(this.cancelDialog);
            m.append(", type=");
            m.append(this.f1456type);
            m.append(", flowUrl=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.flowUrl, ", redirectPath=", this.redirectPath, ", integrationStepBrowserType=");
            m.append(this.integrationStepBrowserType);
            m.append(", localizations=");
            m.append(this.localizations);
            m.append(", inquiryStatus=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.inquiryStatus, ", stepName=", this.stepName, ", backStepEnabled=");
            re$$ExternalSyntheticOutline0.m(m, this.backStepEnabled, ", cancelButtonEnabled=", this.cancelButtonEnabled, ", clientSideKey=");
            m.append(this.clientSideKey);
            m.append(", integrationPage=");
            m.append(this.integrationPage);
            m.append(", transitionError=");
            m.append(this.transitionError);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.cancelDialog, i);
            parcel.writeString(this.f1456type);
            parcel.writeString(this.flowUrl);
            parcel.writeString(this.redirectPath);
            parcel.writeString(this.integrationStepBrowserType.name());
            parcel.writeParcelable(this.localizations, i);
            parcel.writeString(this.inquiryStatus);
            parcel.writeString(this.stepName);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeString(this.clientSideKey);
            parcel.writeParcelable(this.integrationPage, i);
            parcel.writeParcelable(this.transitionError, i);
            parcel.writeParcelable(this.inquirySessionConfig, i);
        }
    }

    public final class LoadFeatureFlagSession extends InquiryState {
        public static final Parcelable.Creator<LoadFeatureFlagSession> CREATOR = new MrzKey.Creator(7);
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final String sessionToken;

        public LoadFeatureFlagSession(String str, String str2, InquirySessionConfig inquirySessionConfig) {
            str.getClass();
            str2.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadFeatureFlagSession)) {
                return false;
            }
            LoadFeatureFlagSession loadFeatureFlagSession = (LoadFeatureFlagSession) obj;
            return Intrinsics.areEqual(this.inquiryId, loadFeatureFlagSession.inquiryId) && Intrinsics.areEqual(this.sessionToken, loadFeatureFlagSession.sessionToken) && Intrinsics.areEqual(this.inquirySessionConfig, loadFeatureFlagSession.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final int hashCode() {
            return this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadFeatureFlagSession(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.inquirySessionConfig, i);
        }
    }

    public final class ResumeFallbackInquiry extends InquiryState {
        public static final Parcelable.Creator<ResumeFallbackInquiry> CREATOR = new MrzKey.Creator(8);
        public final String fallbackInquiryId;
        public final String fallbackSessionToken;
        public final InquirySessionConfig inquirySessionConfig;

        public ResumeFallbackInquiry(String str, String str2, InquirySessionConfig inquirySessionConfig) {
            str.getClass();
            str2.getClass();
            inquirySessionConfig.getClass();
            this.fallbackInquiryId = str;
            this.fallbackSessionToken = str2;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResumeFallbackInquiry)) {
                return false;
            }
            ResumeFallbackInquiry resumeFallbackInquiry = (ResumeFallbackInquiry) obj;
            return Intrinsics.areEqual(this.fallbackInquiryId, resumeFallbackInquiry.fallbackInquiryId) && Intrinsics.areEqual(this.fallbackSessionToken, resumeFallbackInquiry.fallbackSessionToken) && Intrinsics.areEqual(this.inquirySessionConfig, resumeFallbackInquiry.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public final int hashCode() {
            return this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fallbackInquiryId.hashCode() * 31, 31, this.fallbackSessionToken);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResumeFallbackInquiry(fallbackInquiryId=", this.fallbackInquiryId, ", fallbackSessionToken=", this.fallbackSessionToken, ", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.fallbackInquiryId);
            parcel.writeString(this.fallbackSessionToken);
            parcel.writeParcelable(this.inquirySessionConfig, i);
        }
    }

    public final class SelfieStepRunning extends InquiryState implements StepState {
        public static final Parcelable.Creator<SelfieStepRunning> CREATOR = new Creator();
        public final NextStep.Selfie.AssetConfig assetConfig;
        public final boolean audioEnabled;
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final NextStep.CancelDialog cancelDialog;
        public final com.withpersona.sdk2.inquiry.selfie.DesignVersion designVersion;
        public final List enabledCaptureFileTypes;
        public final String fieldKeySelfie;
        public final String fileUploadUrl;
        public final String flowWatermarkText;
        public final String fromComponent;
        public final String fromStep;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final NextStep.Selfie.Localizations localizations;
        public final List orderedPoses;
        public final PendingPageTextPosition pendingPageTextVerticalPosition;
        public final PoseConfigs poseConfigs;
        public final boolean requireStrictSelfieCapture;
        public final NextStep.Selfie.CaptureMethod selfieType;
        public final String sessionToken;
        public final Integer silentNetworkAuthenticationBackgroundTimeoutSeconds;
        public final String silentNetworkAuthenticationCheckUrl;
        public final boolean skipPromptPage;
        public final StepStyles.SelfieStepStyle styles;
        public final TransitionStatus transitionStatus;
        public final List videoCaptureMethods;
        public final String webRtcJwt;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                Class cls2;
                boolean z2;
                boolean z3;
                boolean z4;
                Class cls3;
                boolean z5;
                String str;
                ArrayList arrayList;
                TransitionStatus transitionStatus;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransitionStatus transitionStatus2 = (TransitionStatus) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.Selfie.CaptureMethod valueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    cls = SelfieStepRunning.class;
                    z = true;
                } else {
                    cls = SelfieStepRunning.class;
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    cls2 = cls;
                    z3 = false;
                    z2 = true;
                } else {
                    cls2 = cls;
                    z2 = false;
                    z3 = false;
                }
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = true;
                    z6 = z3;
                }
                if (parcel.readInt() != 0) {
                    cls3 = cls2;
                    z5 = z4;
                } else {
                    cls3 = cls2;
                    z5 = z3;
                }
                NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(cls3.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList3.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
                }
                NextStep.Selfie.AssetConfig assetConfig = (NextStep.Selfie.AssetConfig) parcel.readParcelable(cls3.getClassLoader());
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    str = readString;
                    transitionStatus = transitionStatus2;
                    arrayList = null;
                } else {
                    int readInt3 = parcel.readInt();
                    str = readString;
                    arrayList = new ArrayList(readInt3);
                    transitionStatus = transitionStatus2;
                    int i3 = 0;
                    while (i3 != readInt3) {
                        arrayList.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                        i3++;
                        readInt3 = readInt3;
                    }
                }
                return new SelfieStepRunning(str, readString2, transitionStatus, selfieStepStyle, cancelDialog, valueOf, readString3, readString4, z, z2, readString5, z6, z5, localizations, arrayList2, arrayList3, assetConfig, readString6, arrayList, PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0, (PoseConfigs) parcel.readParcelable(cls3.getClassLoader()), com.withpersona.sdk2.inquiry.selfie.DesignVersion.valueOf(parcel.readString()), (InquirySessionConfig) parcel.readParcelable(cls3.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieStepRunning[i];
            }
        }

        public SelfieStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z5, PoseConfigs poseConfigs, com.withpersona.sdk2.inquiry.selfie.DesignVersion designVersion, InquirySessionConfig inquirySessionConfig, String str7, String str8, String str9, Integer num) {
            str.getClass();
            str2.getClass();
            captureMethod.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            localizations.getClass();
            list.getClass();
            list2.getClass();
            pendingPageTextPosition.getClass();
            poseConfigs.getClass();
            designVersion.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = selfieStepStyle;
            this.cancelDialog = cancelDialog;
            this.selfieType = captureMethod;
            this.fromComponent = str3;
            this.fromStep = str4;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.fieldKeySelfie = str5;
            this.requireStrictSelfieCapture = z3;
            this.skipPromptPage = z4;
            this.localizations = localizations;
            this.enabledCaptureFileTypes = list;
            this.videoCaptureMethods = list2;
            this.assetConfig = assetConfig;
            this.webRtcJwt = str6;
            this.orderedPoses = list3;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            this.audioEnabled = z5;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.inquirySessionConfig = inquirySessionConfig;
            this.fileUploadUrl = str7;
            this.flowWatermarkText = str8;
            this.silentNetworkAuthenticationCheckUrl = str9;
            this.silentNetworkAuthenticationBackgroundTimeoutSeconds = num;
        }

        public static SelfieStepRunning copy$default(SelfieStepRunning selfieStepRunning, TransitionStatus transitionStatus) {
            String str = selfieStepRunning.inquiryId;
            String str2 = selfieStepRunning.sessionToken;
            StepStyles.SelfieStepStyle selfieStepStyle = selfieStepRunning.styles;
            NextStep.CancelDialog cancelDialog = selfieStepRunning.cancelDialog;
            NextStep.Selfie.CaptureMethod captureMethod = selfieStepRunning.selfieType;
            String str3 = selfieStepRunning.fromComponent;
            String str4 = selfieStepRunning.fromStep;
            boolean z = selfieStepRunning.backStepEnabled;
            boolean z2 = selfieStepRunning.cancelButtonEnabled;
            String str5 = selfieStepRunning.fieldKeySelfie;
            boolean z3 = selfieStepRunning.requireStrictSelfieCapture;
            boolean z4 = selfieStepRunning.skipPromptPage;
            NextStep.Selfie.Localizations localizations = selfieStepRunning.localizations;
            List list = selfieStepRunning.enabledCaptureFileTypes;
            List list2 = selfieStepRunning.videoCaptureMethods;
            NextStep.Selfie.AssetConfig assetConfig = selfieStepRunning.assetConfig;
            String str6 = selfieStepRunning.webRtcJwt;
            List list3 = selfieStepRunning.orderedPoses;
            PendingPageTextPosition pendingPageTextPosition = selfieStepRunning.pendingPageTextVerticalPosition;
            boolean z5 = selfieStepRunning.audioEnabled;
            PoseConfigs poseConfigs = selfieStepRunning.poseConfigs;
            com.withpersona.sdk2.inquiry.selfie.DesignVersion designVersion = selfieStepRunning.designVersion;
            InquirySessionConfig inquirySessionConfig = selfieStepRunning.inquirySessionConfig;
            String str7 = selfieStepRunning.fileUploadUrl;
            String str8 = selfieStepRunning.flowWatermarkText;
            String str9 = selfieStepRunning.silentNetworkAuthenticationCheckUrl;
            Integer num = selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            selfieStepRunning.getClass();
            str.getClass();
            str2.getClass();
            captureMethod.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            localizations.getClass();
            list.getClass();
            list2.getClass();
            pendingPageTextPosition.getClass();
            poseConfigs.getClass();
            designVersion.getClass();
            inquirySessionConfig.getClass();
            return new SelfieStepRunning(str, str2, transitionStatus, selfieStepStyle, cancelDialog, captureMethod, str3, str4, z, z2, str5, z3, z4, localizations, list, list2, assetConfig, str6, list3, pendingPageTextPosition, z5, poseConfigs, designVersion, inquirySessionConfig, str7, str8, str9, num);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelfieStepRunning)) {
                return false;
            }
            SelfieStepRunning selfieStepRunning = (SelfieStepRunning) obj;
            return Intrinsics.areEqual(this.inquiryId, selfieStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, selfieStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, selfieStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, selfieStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, selfieStepRunning.cancelDialog) && this.selfieType == selfieStepRunning.selfieType && Intrinsics.areEqual(this.fromComponent, selfieStepRunning.fromComponent) && Intrinsics.areEqual(this.fromStep, selfieStepRunning.fromStep) && this.backStepEnabled == selfieStepRunning.backStepEnabled && this.cancelButtonEnabled == selfieStepRunning.cancelButtonEnabled && Intrinsics.areEqual(this.fieldKeySelfie, selfieStepRunning.fieldKeySelfie) && this.requireStrictSelfieCapture == selfieStepRunning.requireStrictSelfieCapture && this.skipPromptPage == selfieStepRunning.skipPromptPage && Intrinsics.areEqual(this.localizations, selfieStepRunning.localizations) && Intrinsics.areEqual(this.enabledCaptureFileTypes, selfieStepRunning.enabledCaptureFileTypes) && Intrinsics.areEqual(this.videoCaptureMethods, selfieStepRunning.videoCaptureMethods) && Intrinsics.areEqual(this.assetConfig, selfieStepRunning.assetConfig) && Intrinsics.areEqual(this.webRtcJwt, selfieStepRunning.webRtcJwt) && Intrinsics.areEqual(this.orderedPoses, selfieStepRunning.orderedPoses) && this.pendingPageTextVerticalPosition == selfieStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == selfieStepRunning.audioEnabled && Intrinsics.areEqual(this.poseConfigs, selfieStepRunning.poseConfigs) && this.designVersion == selfieStepRunning.designVersion && Intrinsics.areEqual(this.inquirySessionConfig, selfieStepRunning.inquirySessionConfig) && Intrinsics.areEqual(this.fileUploadUrl, selfieStepRunning.fileUploadUrl) && Intrinsics.areEqual(this.flowWatermarkText, selfieStepRunning.flowWatermarkText) && Intrinsics.areEqual(this.silentNetworkAuthenticationCheckUrl, selfieStepRunning.silentNetworkAuthenticationCheckUrl) && Intrinsics.areEqual(this.silentNetworkAuthenticationBackgroundTimeoutSeconds, selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.StepState
        public final StepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode = (m + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int hashCode2 = (hashCode + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.localizations.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.selfieType.hashCode() + ((hashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31)) * 31, 31, this.fromComponent), 31, this.fromStep), 31, this.backStepEnabled), 31, this.cancelButtonEnabled), 31, this.fieldKeySelfie), 31, this.requireStrictSelfieCapture), 31, this.skipPromptPage)) * 31, 31, this.enabledCaptureFileTypes), 31, this.videoCaptureMethods);
            NextStep.Selfie.AssetConfig assetConfig = this.assetConfig;
            int hashCode3 = (m2 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
            String str = this.webRtcJwt;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.orderedPoses;
            int hashCode5 = (this.inquirySessionConfig.hashCode() + ((this.designVersion.hashCode() + ((this.poseConfigs.poseConfigs.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.pendingPageTextVerticalPosition.hashCode() + ((hashCode4 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.audioEnabled)) * 31)) * 31)) * 31;
            String str2 = this.fileUploadUrl;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.flowWatermarkText;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.silentNetworkAuthenticationCheckUrl;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            return hashCode8 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelfieStepRunning(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", transitionStatus=");
            m.append(this.transitionStatus);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", cancelDialog=");
            m.append(this.cancelDialog);
            m.append(", selfieType=");
            m.append(this.selfieType);
            m.append(", fromComponent=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.fromComponent, ", fromStep=", this.fromStep, ", backStepEnabled=");
            re$$ExternalSyntheticOutline0.m(m, this.backStepEnabled, ", cancelButtonEnabled=", this.cancelButtonEnabled, ", fieldKeySelfie=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.fieldKeySelfie, ", requireStrictSelfieCapture=", this.requireStrictSelfieCapture, ", skipPromptPage=");
            m.append(this.skipPromptPage);
            m.append(", localizations=");
            m.append(this.localizations);
            m.append(", enabledCaptureFileTypes=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.enabledCaptureFileTypes, ", videoCaptureMethods=", this.videoCaptureMethods, ", assetConfig=");
            m.append(this.assetConfig);
            m.append(", webRtcJwt=");
            m.append(this.webRtcJwt);
            m.append(", orderedPoses=");
            m.append(this.orderedPoses);
            m.append(", pendingPageTextVerticalPosition=");
            m.append(this.pendingPageTextVerticalPosition);
            m.append(", audioEnabled=");
            m.append(this.audioEnabled);
            m.append(", poseConfigs=");
            m.append(this.poseConfigs);
            m.append(", designVersion=");
            m.append(this.designVersion);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", fileUploadUrl=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.fileUploadUrl, ", flowWatermarkText=", this.flowWatermarkText, ", silentNetworkAuthenticationCheckUrl=");
            m.append(this.silentNetworkAuthenticationCheckUrl);
            m.append(", silentNetworkAuthenticationBackgroundTimeoutSeconds=");
            m.append(this.silentNetworkAuthenticationBackgroundTimeoutSeconds);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.cancelDialog, i);
            parcel.writeString(this.selfieType.name());
            parcel.writeString(this.fromComponent);
            parcel.writeString(this.fromStep);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeString(this.fieldKeySelfie);
            parcel.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            parcel.writeInt(this.skipPromptPage ? 1 : 0);
            parcel.writeParcelable(this.localizations, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledCaptureFileTypes, parcel);
            while (m.hasNext()) {
                parcel.writeString(((NextStep.Selfie.CaptureFileType) m.next()).name());
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.videoCaptureMethods, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((NextStep.Selfie.VideoCaptureMethod) m2.next()).name());
            }
            parcel.writeParcelable(this.assetConfig, i);
            parcel.writeString(this.webRtcJwt);
            List list = this.orderedPoses;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m3 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m3.hasNext()) {
                    parcel.writeString(((NextStep.Selfie.SelfiePose) m3.next()).name());
                }
            }
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
            parcel.writeInt(this.audioEnabled ? 1 : 0);
            parcel.writeParcelable(this.poseConfigs, i);
            parcel.writeString(this.designVersion.name());
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeString(this.fileUploadUrl);
            parcel.writeString(this.flowWatermarkText);
            parcel.writeString(this.silentNetworkAuthenticationCheckUrl);
            Integer num = this.silentNetworkAuthenticationBackgroundTimeoutSeconds;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
        }
    }

    public final class UiStepRunning extends InquiryState implements StepState {
        public static final Parcelable.Creator<UiStepRunning> CREATOR = new Creator();
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final NextStep.CancelDialog cancelDialog;
        public final String clientSideKey;
        public final List components;
        public final Map fields;
        public final boolean finalStep;
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final String inquiryStatus;
        public final boolean isRestoringState;
        public final NextStep.Ui.Localizations localizations;
        public final String redirectUri;
        public final List serverComponentErrors;
        public final String sessionToken;
        public final String stepName;
        public final StepStyles.UiStepStyle styles;
        public final InternalErrorInfo transitionError;
        public final TransitionStatus transitionStatus;
        public final String webviewUrl;

        public final class Creator implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                boolean z;
                int i;
                String str;
                ArrayList arrayList2;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.Ui.Localizations localizations = (NextStep.Ui.Localizations) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(UiStepRunning.class, parcel, arrayList, i2, 1);
                    }
                }
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                    i = 0;
                } else {
                    z = false;
                    i = 0;
                }
                String readString5 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                int i3 = i;
                while (true) {
                    str = readString;
                    if (i3 == readInt2) {
                        break;
                    }
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    i3++;
                    readString = str;
                    readString2 = readString2;
                }
                String str2 = readString2;
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    int i4 = i;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(UiStepRunning.class, parcel, arrayList2, i4, 1);
                        readInt3 = readInt3;
                    }
                }
                return new UiStepRunning(str, str2, transitionStatus, uiStepStyle, cancelDialog, localizations, readString3, readString4, arrayList3, z2, z3, z, readString5, linkedHashMap, readString6, arrayList2, (InternalErrorInfo) parcel.readParcelable(UiStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(UiStepRunning.class.getClassLoader()), parcel.readInt() != 0 ? 1 : i, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UiStepRunning[i];
            }
        }

        public UiStepRunning(String str, String str2, TransitionStatus transitionStatus, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str3, String str4, List list, boolean z, boolean z2, boolean z3, String str5, Map map, String str6, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z4, String str7) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str6);
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.transitionStatus = transitionStatus;
            this.styles = uiStepStyle;
            this.cancelDialog = cancelDialog;
            this.localizations = localizations;
            this.inquiryStatus = str3;
            this.stepName = str4;
            this.components = list;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.finalStep = z3;
            this.webviewUrl = str5;
            this.fields = map;
            this.clientSideKey = str6;
            this.serverComponentErrors = list2;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.isRestoringState = z4;
            this.redirectUri = str7;
        }

        public static UiStepRunning copy$default(UiStepRunning uiStepRunning, TransitionStatus transitionStatus, List list, String str, List list2, InternalErrorInfo internalErrorInfo, boolean z, int i) {
            InquirySessionConfig inquirySessionConfig;
            boolean z2;
            String str2 = uiStepRunning.inquiryId;
            String str3 = uiStepRunning.sessionToken;
            TransitionStatus transitionStatus2 = (i & 4) != 0 ? uiStepRunning.transitionStatus : transitionStatus;
            StepStyles.UiStepStyle uiStepStyle = uiStepRunning.styles;
            TransitionStatus transitionStatus3 = transitionStatus2;
            NextStep.CancelDialog cancelDialog = uiStepRunning.cancelDialog;
            NextStep.Ui.Localizations localizations = uiStepRunning.localizations;
            String str4 = uiStepRunning.inquiryStatus;
            String str5 = uiStepRunning.stepName;
            List list3 = (i & 256) != 0 ? uiStepRunning.components : list;
            boolean z3 = uiStepRunning.backStepEnabled;
            List list4 = list3;
            boolean z4 = uiStepRunning.cancelButtonEnabled;
            boolean z5 = uiStepRunning.finalStep;
            String str6 = uiStepRunning.webviewUrl;
            Map map = uiStepRunning.fields;
            String str7 = (i & 16384) != 0 ? uiStepRunning.clientSideKey : str;
            List list5 = (i & 32768) != 0 ? uiStepRunning.serverComponentErrors : list2;
            InternalErrorInfo internalErrorInfo2 = (i & 65536) != 0 ? uiStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig2 = uiStepRunning.inquirySessionConfig;
            if ((i & PKIFailureInfo.transactionIdInUse) != 0) {
                inquirySessionConfig = inquirySessionConfig2;
                z2 = uiStepRunning.isRestoringState;
            } else {
                inquirySessionConfig = inquirySessionConfig2;
                z2 = z;
            }
            String str8 = uiStepRunning.redirectUri;
            uiStepRunning.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            str7.getClass();
            inquirySessionConfig.getClass();
            return new UiStepRunning(str2, str3, transitionStatus3, uiStepStyle, cancelDialog, localizations, str4, str5, list4, z3, z4, z5, str6, map, str7, list5, internalErrorInfo2, inquirySessionConfig, z2, str8);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiStepRunning)) {
                return false;
            }
            UiStepRunning uiStepRunning = (UiStepRunning) obj;
            return Intrinsics.areEqual(this.inquiryId, uiStepRunning.inquiryId) && Intrinsics.areEqual(this.sessionToken, uiStepRunning.sessionToken) && Intrinsics.areEqual(this.transitionStatus, uiStepRunning.transitionStatus) && Intrinsics.areEqual(this.styles, uiStepRunning.styles) && Intrinsics.areEqual(this.cancelDialog, uiStepRunning.cancelDialog) && Intrinsics.areEqual(this.localizations, uiStepRunning.localizations) && Intrinsics.areEqual(this.inquiryStatus, uiStepRunning.inquiryStatus) && Intrinsics.areEqual(this.stepName, uiStepRunning.stepName) && Intrinsics.areEqual(this.components, uiStepRunning.components) && this.backStepEnabled == uiStepRunning.backStepEnabled && this.cancelButtonEnabled == uiStepRunning.cancelButtonEnabled && this.finalStep == uiStepRunning.finalStep && Intrinsics.areEqual(this.webviewUrl, uiStepRunning.webviewUrl) && this.fields.equals(uiStepRunning.fields) && Intrinsics.areEqual(this.clientSideKey, uiStepRunning.clientSideKey) && Intrinsics.areEqual(this.serverComponentErrors, uiStepRunning.serverComponentErrors) && Intrinsics.areEqual(this.transitionError, uiStepRunning.transitionError) && Intrinsics.areEqual(this.inquirySessionConfig, uiStepRunning.inquirySessionConfig) && this.isRestoringState == uiStepRunning.isRestoringState && Intrinsics.areEqual(this.redirectUri, uiStepRunning.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.StepState
        public final StepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
            TransitionStatus transitionStatus = this.transitionStatus;
            int hashCode = (m + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int hashCode2 = (hashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int hashCode3 = (hashCode2 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            NextStep.Ui.Localizations localizations = this.localizations;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (localizations == null ? 0 : localizations.hashCode())) * 31, 31, this.inquiryStatus), 31, this.stepName);
            List list = this.components;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.backStepEnabled), 31, this.cancelButtonEnabled), 31, this.finalStep);
            String str = this.webviewUrl;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m((m3 + (str == null ? 0 : str.hashCode())) * 31, this.fields, 31), 31, this.clientSideKey);
            List list2 = this.serverComponentErrors;
            int hashCode4 = (m4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.inquirySessionConfig.hashCode() + ((hashCode4 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31)) * 31, 31, this.isRestoringState);
            String str2 = this.redirectUri;
            return m5 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UiStepRunning(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", transitionStatus=");
            m.append(this.transitionStatus);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", cancelDialog=");
            m.append(this.cancelDialog);
            m.append(", localizations=");
            m.append(this.localizations);
            m.append(", inquiryStatus=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.inquiryStatus, ", stepName=", this.stepName, ", components=");
            m.append(this.components);
            m.append(", backStepEnabled=");
            m.append(this.backStepEnabled);
            m.append(", cancelButtonEnabled=");
            re$$ExternalSyntheticOutline0.m(m, this.cancelButtonEnabled, ", finalStep=", this.finalStep, ", webviewUrl=");
            m.append(this.webviewUrl);
            m.append(", fields=");
            m.append(this.fields);
            m.append(", clientSideKey=");
            NavAction$$ExternalSyntheticOutline0.m(this.clientSideKey, ", serverComponentErrors=", ", transitionError=", m, this.serverComponentErrors);
            m.append(this.transitionError);
            m.append(", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(", isRestoringState=");
            m.append(this.isRestoringState);
            m.append(", redirectUri=");
            m.append(this.redirectUri);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.cancelDialog, i);
            parcel.writeParcelable(this.localizations, i);
            parcel.writeString(this.inquiryStatus);
            parcel.writeString(this.stepName);
            List list = this.components;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
            }
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeInt(this.finalStep ? 1 : 0);
            parcel.writeString(this.webviewUrl);
            Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.fields, parcel);
            while (m2.hasNext()) {
                Map.Entry entry = (Map.Entry) m2.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
            parcel.writeString(this.clientSideKey);
            List list2 = this.serverComponentErrors;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator m3 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list2);
                while (m3.hasNext()) {
                    parcel.writeParcelable((Parcelable) m3.next(), i);
                }
            }
            parcel.writeParcelable(this.transitionError, i);
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeInt(this.isRestoringState ? 1 : 0);
            parcel.writeString(this.redirectUri);
        }
    }

    public NextStep.CancelDialog getCancelDialog() {
        return null;
    }

    public String getFromStep() {
        return null;
    }

    public String getInquiryId() {
        return null;
    }

    public abstract InquirySessionConfig getInquirySessionConfig();

    public String getSessionToken() {
        return null;
    }

    public StepStyle getStyles() {
        return null;
    }

    public TransitionStatus getTransitionStatus() {
        return null;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
    public final boolean isSameStateAs(WorkflowState workflowState) {
        return getClass() == workflowState.getClass() && Intrinsics.areEqual(getFromStep(), ((InquiryState) workflowState).getFromStep());
    }

    public final InquiryState updateTransitionStatus(TransitionStatus transitionStatus) {
        if (this instanceof Complete) {
            Complete complete = (Complete) this;
            String str = complete.inquiryId;
            str.getClass();
            String str2 = complete.sessionToken;
            str2.getClass();
            String str3 = complete.inquiryStatus;
            str3.getClass();
            InquirySessionConfig inquirySessionConfig = complete.inquirySessionConfig;
            inquirySessionConfig.getClass();
            return new Complete(str, str2, transitionStatus, str3, complete.fields, inquirySessionConfig, complete.redirectUri);
        }
        if ((this instanceof CreateInquiryFromTemplate) || (this instanceof ResumeFallbackInquiry) || (this instanceof CreateInquirySession) || (this instanceof ExchangeOneTimeCode)) {
            return this;
        }
        if (this instanceof DocumentStepRunning) {
            return DocumentStepRunning.copy$default((DocumentStepRunning) this, transitionStatus);
        }
        if (this instanceof GovernmentIdStepRunning) {
            return GovernmentIdStepRunning.copy$default((GovernmentIdStepRunning) this, transitionStatus);
        }
        if (this instanceof SelfieStepRunning) {
            return SelfieStepRunning.copy$default((SelfieStepRunning) this, transitionStatus);
        }
        if (this instanceof ShowLoadingSpinner) {
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) this;
            String str4 = showLoadingSpinner.sessionToken;
            str4.getClass();
            String str5 = showLoadingSpinner.inquiryId;
            str5.getClass();
            InquirySessionConfig inquirySessionConfig2 = showLoadingSpinner.inquirySessionConfig;
            inquirySessionConfig2.getClass();
            return new ShowLoadingSpinner(str4, transitionStatus, str5, showLoadingSpinner.styles, showLoadingSpinner.useBasicSpinner, inquirySessionConfig2);
        }
        if (this instanceof UiStepRunning) {
            return UiStepRunning.copy$default((UiStepRunning) this, transitionStatus, null, null, null, null, false, 1048571);
        }
        if (this instanceof IntegrationStepRunning) {
            return IntegrationStepRunning.copy$default((IntegrationStepRunning) this, transitionStatus);
        }
        if (this instanceof LoadFeatureFlagSession) {
            return this;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final class CreateInquirySession extends InquiryState {
        public static final Parcelable.Creator<CreateInquirySession> CREATOR = new MrzKey.Creator(5);
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final InquirySessionDataWrapper inquirySessionDataWrapper;

        public CreateInquirySession(String str, InquirySessionConfig inquirySessionConfig, InquirySessionDataWrapper inquirySessionDataWrapper) {
            str.getClass();
            inquirySessionConfig.getClass();
            this.inquiryId = str;
            this.inquirySessionConfig = inquirySessionConfig;
            this.inquirySessionDataWrapper = inquirySessionDataWrapper;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateInquirySession)) {
                return false;
            }
            CreateInquirySession createInquirySession = (CreateInquirySession) obj;
            return Intrinsics.areEqual(this.inquiryId, createInquirySession.inquiryId) && Intrinsics.areEqual(this.inquirySessionConfig, createInquirySession.inquirySessionConfig) && Intrinsics.areEqual(this.inquirySessionDataWrapper, createInquirySession.inquirySessionDataWrapper);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public final int hashCode() {
            int hashCode = (this.inquirySessionConfig.hashCode() + (this.inquiryId.hashCode() * 31)) * 31;
            InquirySessionDataWrapper inquirySessionDataWrapper = this.inquirySessionDataWrapper;
            return hashCode + (inquirySessionDataWrapper == null ? 0 : inquirySessionDataWrapper.hashCode());
        }

        public final String toString() {
            return "CreateInquirySession(inquiryId=" + this.inquiryId + ", inquirySessionConfig=" + this.inquirySessionConfig + ", inquirySessionDataWrapper=" + this.inquirySessionDataWrapper + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeParcelable(this.inquirySessionConfig, i);
            parcel.writeParcelable(this.inquirySessionDataWrapper, i);
        }

        public CreateInquirySession(String str, InquirySessionDataWrapper inquirySessionDataWrapper, int i) {
            this(str, InquirySessionConfig.Default, (i & 4) != 0 ? null : inquirySessionDataWrapper);
        }
    }

    public final class ShowLoadingSpinner extends InquiryState {
        public static final Parcelable.Creator<ShowLoadingSpinner> CREATOR = new MrzKey.Creator(9);
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final String sessionToken;
        public final StepStyle styles;
        public final TransitionStatus transitionStatus;
        public final boolean useBasicSpinner;

        public ShowLoadingSpinner(String str, TransitionStatus transitionStatus, String str2, StepStyle stepStyle, boolean z, InquirySessionConfig inquirySessionConfig) {
            str.getClass();
            str2.getClass();
            inquirySessionConfig.getClass();
            this.sessionToken = str;
            this.transitionStatus = transitionStatus;
            this.inquiryId = str2;
            this.styles = stepStyle;
            this.useBasicSpinner = z;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLoadingSpinner)) {
                return false;
            }
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) obj;
            return Intrinsics.areEqual(this.sessionToken, showLoadingSpinner.sessionToken) && Intrinsics.areEqual(this.transitionStatus, showLoadingSpinner.transitionStatus) && Intrinsics.areEqual(this.inquiryId, showLoadingSpinner.inquiryId) && Intrinsics.areEqual(this.styles, showLoadingSpinner.styles) && this.useBasicSpinner == showLoadingSpinner.useBasicSpinner && Intrinsics.areEqual(this.inquirySessionConfig, showLoadingSpinner.inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState, com.withpersona.sdk2.inquiry.internal.StepState
        public final StepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryState
        public final TransitionStatus getTransitionStatus() {
            return this.transitionStatus;
        }

        public final int hashCode() {
            int hashCode = this.sessionToken.hashCode() * 31;
            TransitionStatus transitionStatus = this.transitionStatus;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (transitionStatus == null ? 0 : transitionStatus.hashCode())) * 31, 31, this.inquiryId);
            StepStyle stepStyle = this.styles;
            return this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (stepStyle != null ? stepStyle.hashCode() : 0)) * 31, 31, this.useBasicSpinner);
        }

        public final String toString() {
            return "ShowLoadingSpinner(sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryId=" + this.inquiryId + ", styles=" + this.styles + ", useBasicSpinner=" + this.useBasicSpinner + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.transitionStatus, i);
            parcel.writeString(this.inquiryId);
            parcel.writeParcelable(this.styles, i);
            parcel.writeInt(this.useBasicSpinner ? 1 : 0);
            parcel.writeParcelable(this.inquirySessionConfig, i);
        }

        public ShowLoadingSpinner(String str, String str2, StepStyle stepStyle, InquirySessionConfig inquirySessionConfig) {
            this(str, new TransitionStatus.CheckingForNextState(false, 3), str2, stepStyle, true, inquirySessionConfig);
        }
    }
}
