package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.n;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.EmitWorkerOutputAction;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptchaStateListener;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreenKt;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RealFileHelper;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStepKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.Pool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.FormBody;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class DocumentWorkflow extends StatefulWorkflow {
    public final Context applicationContext;
    public final DocumentCameraWorker documentCameraWorker;
    public final Pool documentCreateWorker;
    public final MatchResult.Destructured documentFileDeleteWorker;
    public final FormBody.Builder documentFileUploadWorker;
    public final o0 documentLoadWorker;
    public final TextSetter documentSubmitWorker;
    public final n documentsSelectWorkerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final RealImageLoader imageLoader;
    public final NavigationStateManager navigationStateManager;
    public final PermissionRequestWorkflow permissionRequestWorkflow;
    public final TrackingEventsLogger trackingEventsLogger;

    public abstract class Event {
        public static final SandboxFlags_Factory INSTANCE = new SandboxFlags_Factory(11);

        public final class Back extends Event {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return 1245705540;
            }

            public final String toString() {
                return Constants.META_BACK_BUTTON;
            }
        }

        public final class Cancel extends Event {
            public static final Cancel INSTANCE = new Cancel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return -1143899241;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        public final class CloseUploadOptions extends Event {
            public static final CloseUploadOptions INSTANCE = new CloseUploadOptions();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseUploadOptions);
            }

            public final int hashCode() {
                return -1422406686;
            }

            public final String toString() {
                return "CloseUploadOptions";
            }
        }

        public final class DismissError extends Event {
            public static final DismissError INSTANCE = new DismissError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissError);
            }

            public final int hashCode() {
                return -967280389;
            }

            public final String toString() {
                return "DismissError";
            }
        }

        public final class OpenUploadOptions extends Event {
            public static final OpenUploadOptions INSTANCE = new OpenUploadOptions();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenUploadOptions);
            }

            public final int hashCode() {
                return -1532240394;
            }

            public final String toString() {
                return "OpenUploadOptions";
            }
        }

        public final class RemoveDocument extends Event {
            public final DocumentFile.Remote document;
            public final String documentId;

            public RemoveDocument(String str, DocumentFile.Remote remote) {
                str.getClass();
                remote.getClass();
                this.documentId = str;
                this.document = remote;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RemoveDocument)) {
                    return false;
                }
                RemoveDocument removeDocument = (RemoveDocument) obj;
                return Intrinsics.areEqual(this.documentId, removeDocument.documentId) && Intrinsics.areEqual(this.document, removeDocument.document);
            }

            public final int hashCode() {
                return this.document.hashCode() + (this.documentId.hashCode() * 31);
            }

            public final String toString() {
                return "RemoveDocument(documentId=" + this.documentId + ", document=" + this.document + ")";
            }
        }

        public final class SelectDocument extends Event {
            public static final SelectDocument INSTANCE = new SelectDocument();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SelectDocument);
            }

            public final int hashCode() {
                return -1818587564;
            }

            public final String toString() {
                return "SelectDocument";
            }
        }

        public final class SelectPhotoFromLibrary extends Event {
            public static final SelectPhotoFromLibrary INSTANCE = new SelectPhotoFromLibrary();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SelectPhotoFromLibrary);
            }

            public final int hashCode() {
                return 1457257560;
            }

            public final String toString() {
                return "SelectPhotoFromLibrary";
            }
        }

        public final class Submit extends Event {
            public final String documentId;

            public Submit(String str) {
                str.getClass();
                this.documentId = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Submit) && Intrinsics.areEqual(this.documentId, ((Submit) obj).documentId);
            }

            public final int hashCode() {
                return this.documentId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Submit(documentId=", this.documentId, ")");
            }
        }

        public final class TakePhoto extends Event {
            public static final TakePhoto INSTANCE = new TakePhoto();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof TakePhoto);
            }

            public final int hashCode() {
                return -623405138;
            }

            public final String toString() {
                return "TakePhoto";
            }
        }
    }

    public final class Input implements Parcelable {
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        public final NextStep.Document.AssetConfig assetConfig;
        public final boolean backStepEnabled;
        public final boolean cancelButtonEnabled;
        public final String disclaimer;
        public final int documentFileLimit;
        public final String documentId;
        public final String fieldKeyDocument;
        public final String fromComponent;
        public final String fromStep;
        public final String inquiryId;
        public final String kind;
        public final String largeFileErrorPrompt;
        public final DocumentPages pages;
        public final String pendingDescription;
        public final PendingPageTextPosition pendingPageTextVerticalPosition;
        public final String pendingTitle;
        public final String permissionsModalNegativeButton;
        public final String permissionsModalPositiveButton;
        public final String permissionsRationale;
        public final String permissionsTitle;
        public final String promptDescription;
        public final String promptTitle;
        public final String sessionToken;
        public final StartPage startPage;
        public final StepStyles.DocumentStepStyle styles;
        public final String submitButtonText;

        public final class Creator implements Parcelable.Creator {
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input, still in use, count: 2, list:
                  (r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input) from 0x0077: MOVE (r18v1 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input) = (r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input)
                  (r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input) from 0x0072: MOVE (r18v4 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input) = (r1v0 com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r28) {
                /*
                    r27 = this;
                    r0 = r28
                    r0.getClass()
                    com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input r1 = new com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input
                    r2 = r1
                    java.lang.String r1 = r0.readString()
                    r3 = r2
                    java.lang.String r2 = r0.readString()
                    r4 = r3
                    java.lang.String r3 = r0.readString()
                    r5 = r4
                    java.lang.String r4 = r0.readString()
                    r6 = r5
                    java.lang.String r5 = r0.readString()
                    r7 = r6
                    java.lang.String r6 = r0.readString()
                    r8 = r7
                    java.lang.String r7 = r0.readString()
                    r9 = r8
                    java.lang.String r8 = r0.readString()
                    r10 = r9
                    java.lang.String r9 = r0.readString()
                    r11 = r10
                    java.lang.String r10 = r0.readString()
                    r12 = r11
                    java.lang.String r11 = r0.readString()
                    r13 = r12
                    java.lang.String r12 = r0.readString()
                    r14 = r13
                    java.lang.String r13 = r0.readString()
                    java.lang.Class<com.withpersona.sdk2.inquiry.document.DocumentWorkflow$Input> r15 = com.withpersona.sdk2.inquiry.document.DocumentWorkflow.Input.class
                    r27 = r1
                    java.lang.ClassLoader r1 = r15.getClassLoader()
                    android.os.Parcelable r1 = r0.readParcelable(r1)
                    com.withpersona.sdk2.inquiry.document.DocumentWorkflow$StartPage r1 = (com.withpersona.sdk2.inquiry.document.DocumentWorkflow.StartPage) r1
                    r16 = r1
                    android.os.Parcelable$Creator<com.withpersona.sdk2.inquiry.document.DocumentPages> r1 = com.withpersona.sdk2.inquiry.document.DocumentPages.CREATOR
                    java.lang.Object r1 = r1.createFromParcel(r0)
                    com.withpersona.sdk2.inquiry.document.DocumentPages r1 = (com.withpersona.sdk2.inquiry.document.DocumentPages) r1
                    r17 = r14
                    r14 = r16
                    int r16 = r0.readInt()
                    int r18 = r0.readInt()
                    r19 = 0
                    r20 = 1
                    if (r18 == 0) goto L77
                    r18 = r17
                    r17 = r20
                    goto L7b
                L77:
                    r18 = r17
                    r17 = r19
                L7b:
                    int r21 = r0.readInt()
                    if (r21 == 0) goto L83
                    r19 = r20
                L83:
                    java.lang.String r20 = r0.readString()
                    r21 = r18
                    r18 = r19
                    r19 = r20
                    java.lang.String r20 = r0.readString()
                    r22 = r21
                    java.lang.String r21 = r0.readString()
                    r23 = r22
                    java.lang.String r22 = r0.readString()
                    r24 = r23
                    java.lang.String r23 = r0.readString()
                    r25 = r1
                    java.lang.ClassLoader r1 = r15.getClassLoader()
                    android.os.Parcelable r1 = r0.readParcelable(r1)
                    com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$DocumentStepStyle r1 = (com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles.DocumentStepStyle) r1
                    java.lang.ClassLoader r15 = r15.getClassLoader()
                    android.os.Parcelable r15 = r0.readParcelable(r15)
                    com.withpersona.sdk2.inquiry.network.dto.NextStep$Document$AssetConfig r15 = (com.withpersona.sdk2.inquiry.network.dto.NextStep.Document.AssetConfig) r15
                    java.lang.String r0 = r0.readString()
                    com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition r26 = com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition.valueOf(r0)
                    r0 = r25
                    r25 = r15
                    r15 = r0
                    r0 = r24
                    r24 = r1
                    r1 = r27
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.DocumentWorkflow.Input.Creator.createFromParcel(android.os.Parcel):java.lang.Object");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        public Input(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, StartPage startPage, DocumentPages documentPages, int i, boolean z, boolean z2, String str14, String str15, String str16, String str17, String str18, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextPosition) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str11);
            str12.getClass();
            startPage.getClass();
            documentPages.getClass();
            assetConfig.getClass();
            pendingPageTextPosition.getClass();
            this.sessionToken = str;
            this.inquiryId = str2;
            this.fromStep = str3;
            this.fromComponent = str4;
            this.promptTitle = str5;
            this.promptDescription = str6;
            this.disclaimer = str7;
            this.submitButtonText = str8;
            this.pendingTitle = str9;
            this.pendingDescription = str10;
            this.fieldKeyDocument = str11;
            this.kind = str12;
            this.documentId = str13;
            this.startPage = startPage;
            this.pages = documentPages;
            this.documentFileLimit = i;
            this.backStepEnabled = z;
            this.cancelButtonEnabled = z2;
            this.permissionsTitle = str14;
            this.permissionsRationale = str15;
            this.permissionsModalPositiveButton = str16;
            this.permissionsModalNegativeButton = str17;
            this.largeFileErrorPrompt = str18;
            this.styles = documentStepStyle;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextPosition;
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
            return Intrinsics.areEqual(this.sessionToken, input.sessionToken) && Intrinsics.areEqual(this.inquiryId, input.inquiryId) && Intrinsics.areEqual(this.fromStep, input.fromStep) && Intrinsics.areEqual(this.fromComponent, input.fromComponent) && Intrinsics.areEqual(this.promptTitle, input.promptTitle) && Intrinsics.areEqual(this.promptDescription, input.promptDescription) && Intrinsics.areEqual(this.disclaimer, input.disclaimer) && Intrinsics.areEqual(this.submitButtonText, input.submitButtonText) && Intrinsics.areEqual(this.pendingTitle, input.pendingTitle) && Intrinsics.areEqual(this.pendingDescription, input.pendingDescription) && Intrinsics.areEqual(this.fieldKeyDocument, input.fieldKeyDocument) && Intrinsics.areEqual(this.kind, input.kind) && Intrinsics.areEqual(this.documentId, input.documentId) && Intrinsics.areEqual(this.startPage, input.startPage) && Intrinsics.areEqual(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.areEqual(this.permissionsTitle, input.permissionsTitle) && Intrinsics.areEqual(this.permissionsRationale, input.permissionsRationale) && Intrinsics.areEqual(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && Intrinsics.areEqual(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && Intrinsics.areEqual(this.largeFileErrorPrompt, input.largeFileErrorPrompt) && Intrinsics.areEqual(this.styles, input.styles) && Intrinsics.areEqual(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sessionToken.hashCode() * 31, 31, this.inquiryId), 31, this.fromStep), 31, this.fromComponent);
            String str = this.promptTitle;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promptDescription;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclaimer;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.submitButtonText;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pendingTitle;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pendingDescription;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.fieldKeyDocument), 31, this.kind);
            String str7 = this.documentId;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.documentFileLimit, (this.pages.hashCode() + ((this.startPage.hashCode() + ((m2 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31)) * 31, 31), 31, this.backStepEnabled), 31, this.cancelButtonEnabled);
            String str8 = this.permissionsTitle;
            int hashCode6 = (m3 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.permissionsRationale;
            int hashCode7 = (hashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.permissionsModalPositiveButton;
            int hashCode8 = (hashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.permissionsModalNegativeButton;
            int hashCode9 = (hashCode8 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.largeFileErrorPrompt;
            int hashCode10 = (hashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            return this.pendingPageTextVerticalPosition.hashCode() + ((this.assetConfig.hashCode() + ((hashCode10 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Input(sessionToken=", this.sessionToken, ", inquiryId=", this.inquiryId, ", fromStep=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.fromStep, ", fromComponent=", this.fromComponent, ", promptTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.promptTitle, ", promptDescription=", this.promptDescription, ", disclaimer=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.disclaimer, ", submitButtonText=", this.submitButtonText, ", pendingTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.pendingTitle, ", pendingDescription=", this.pendingDescription, ", fieldKeyDocument=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.fieldKeyDocument, ", kind=", this.kind, ", documentId=");
            m.append(this.documentId);
            m.append(", startPage=");
            m.append(this.startPage);
            m.append(", pages=");
            m.append(this.pages);
            m.append(", documentFileLimit=");
            m.append(this.documentFileLimit);
            m.append(", backStepEnabled=");
            re$$ExternalSyntheticOutline0.m(m, this.backStepEnabled, ", cancelButtonEnabled=", this.cancelButtonEnabled, ", permissionsTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.permissionsTitle, ", permissionsRationale=", this.permissionsRationale, ", permissionsModalPositiveButton=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.permissionsModalPositiveButton, ", permissionsModalNegativeButton=", this.permissionsModalNegativeButton, ", largeFileErrorPrompt=");
            m.append(this.largeFileErrorPrompt);
            m.append(", styles=");
            m.append(this.styles);
            m.append(", assetConfig=");
            m.append(this.assetConfig);
            m.append(", pendingPageTextVerticalPosition=");
            m.append(this.pendingPageTextVerticalPosition);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.fromStep);
            parcel.writeString(this.fromComponent);
            parcel.writeString(this.promptTitle);
            parcel.writeString(this.promptDescription);
            parcel.writeString(this.disclaimer);
            parcel.writeString(this.submitButtonText);
            parcel.writeString(this.pendingTitle);
            parcel.writeString(this.pendingDescription);
            parcel.writeString(this.fieldKeyDocument);
            parcel.writeString(this.kind);
            parcel.writeString(this.documentId);
            parcel.writeParcelable(this.startPage, i);
            this.pages.writeToParcel(parcel, i);
            parcel.writeInt(this.documentFileLimit);
            parcel.writeInt(this.backStepEnabled ? 1 : 0);
            parcel.writeInt(this.cancelButtonEnabled ? 1 : 0);
            parcel.writeString(this.permissionsTitle);
            parcel.writeString(this.permissionsRationale);
            parcel.writeString(this.permissionsModalPositiveButton);
            parcel.writeString(this.permissionsModalNegativeButton);
            parcel.writeString(this.largeFileErrorPrompt);
            parcel.writeParcelable(this.styles, i);
            parcel.writeParcelable(this.assetConfig, i);
            parcel.writeString(this.pendingPageTextVerticalPosition.name());
        }
    }

    public abstract class Output {

        public final class Back extends Output {
            public static final Back INSTANCE = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return 89823627;
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
                return -1234032835;
            }

            public final String toString() {
                return "Canceled";
            }
        }

        public final class Errored extends Output {
            public final InternalErrorInfo cause;

            public Errored(InternalErrorInfo internalErrorInfo) {
                internalErrorInfo.getClass();
                this.cause = internalErrorInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Errored) && Intrinsics.areEqual(this.cause, ((Errored) obj).cause);
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final String toString() {
                return "Errored(cause=" + this.cause + ")";
            }
        }

        public final class Finished extends Output {
            public static final Finished INSTANCE = new Finished();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finished);
            }

            public final int hashCode() {
                return -1784519914;
            }

            public final String toString() {
                return "Finished";
            }
        }
    }

    public interface Screen {

        public final class LoadingAnimation implements Screen {
            public final NextStep.Document.AssetConfig.PendingPage assetConfig;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function0 onCancel;
            public final PendingPageTextPosition pendingPageTextVerticalPosition;
            public final String prompt;
            public final StepStyles.DocumentStepStyle styles;
            public final String title;

            public LoadingAnimation(String str, String str2, NavigationState navigationState, Function0 function0, Function0 function02, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextPosition) {
                navigationState.getClass();
                pendingPageTextPosition.getClass();
                this.title = str;
                this.prompt = str2;
                this.navigationState = navigationState;
                this.onBack = function0;
                this.onCancel = function02;
                this.styles = documentStepStyle;
                this.assetConfig = pendingPage;
                this.pendingPageTextVerticalPosition = pendingPageTextPosition;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadingAnimation)) {
                    return false;
                }
                LoadingAnimation loadingAnimation = (LoadingAnimation) obj;
                return Intrinsics.areEqual(this.title, loadingAnimation.title) && Intrinsics.areEqual(this.prompt, loadingAnimation.prompt) && Intrinsics.areEqual(this.navigationState, loadingAnimation.navigationState) && this.onBack.equals(loadingAnimation.onBack) && this.onCancel.equals(loadingAnimation.onCancel) && Intrinsics.areEqual(this.styles, loadingAnimation.styles) && Intrinsics.areEqual(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.Screen
            public final UiStepBottomSheet getBottomSheet() {
                return null;
            }

            public final int hashCode() {
                String str = this.title;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.prompt;
                int hashCode2 = (this.onCancel.hashCode() + ((this.onBack.hashCode() + ((this.navigationState.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int hashCode3 = (hashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                NextStep.Document.AssetConfig.PendingPage pendingPage = this.assetConfig;
                return (this.pendingPageTextVerticalPosition.hashCode() + ((hashCode3 + (pendingPage != null ? pendingPage.hashCode() : 0)) * 31)) * 31;
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadingAnimation(title=", this.title, ", prompt=", this.prompt, ", navigationState=");
                m.append(this.navigationState);
                m.append(", onBack=");
                m.append(this.onBack);
                m.append(", onCancel=");
                m.append(this.onCancel);
                m.append(", styles=");
                m.append(this.styles);
                m.append(", assetConfig=");
                m.append(this.assetConfig);
                m.append(", pendingPageTextVerticalPosition=");
                m.append(this.pendingPageTextVerticalPosition);
                m.append(", bottomSheet=null)");
                return m.toString();
            }
        }

        public final class ReviewCaptures implements Screen {
            public final boolean addButtonEnabled;
            public final UiStepBottomSheet bottomSheet;
            public final boolean disabled;
            public final String disclaimer;
            public final List documents;
            public final String error;
            public final RealImageLoader imageLoader;
            public final NavigationState navigationState;
            public final Function0 onBack;
            public final Function0 onCancel;
            public final Function0 onErrorDismissed;
            public final Function1 onRemove;
            public final Function0 onSubmit;
            public final Function0 openCamera;
            public final Function0 openSelectFile;
            public final Function0 openUploadOptions;
            public final String prompt;
            public final Function0 selectFromPhotoLibrary;
            public final StepStyles.DocumentStepStyle styles;
            public final boolean submitButtonEnabled;
            public final String submitButtonText;
            public final String title;

            public ReviewCaptures(RealImageLoader realImageLoader, String str, String str2, String str3, String str4, List list, NavigationState navigationState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Function0 function05, Function0 function06, Function0 function07, boolean z, boolean z2, boolean z3, String str5, Function0 function08, StepStyles.DocumentStepStyle documentStepStyle, UiStepBottomSheet uiStepBottomSheet) {
                realImageLoader.getClass();
                list.getClass();
                navigationState.getClass();
                this.imageLoader = realImageLoader;
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.submitButtonText = str4;
                this.documents = list;
                this.navigationState = navigationState;
                this.openSelectFile = function0;
                this.selectFromPhotoLibrary = function02;
                this.openCamera = function03;
                this.openUploadOptions = function04;
                this.onRemove = function1;
                this.onSubmit = function05;
                this.onCancel = function06;
                this.onBack = function07;
                this.disabled = z;
                this.addButtonEnabled = z2;
                this.submitButtonEnabled = z3;
                this.error = str5;
                this.onErrorDismissed = function08;
                this.styles = documentStepStyle;
                this.bottomSheet = uiStepBottomSheet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) obj;
                return Intrinsics.areEqual(this.imageLoader, reviewCaptures.imageLoader) && Intrinsics.areEqual(this.title, reviewCaptures.title) && Intrinsics.areEqual(this.prompt, reviewCaptures.prompt) && Intrinsics.areEqual(this.disclaimer, reviewCaptures.disclaimer) && Intrinsics.areEqual(this.submitButtonText, reviewCaptures.submitButtonText) && Intrinsics.areEqual(this.documents, reviewCaptures.documents) && Intrinsics.areEqual(this.navigationState, reviewCaptures.navigationState) && Intrinsics.areEqual(this.openSelectFile, reviewCaptures.openSelectFile) && Intrinsics.areEqual(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && Intrinsics.areEqual(this.openCamera, reviewCaptures.openCamera) && Intrinsics.areEqual(this.openUploadOptions, reviewCaptures.openUploadOptions) && Intrinsics.areEqual(this.onRemove, reviewCaptures.onRemove) && Intrinsics.areEqual(this.onSubmit, reviewCaptures.onSubmit) && Intrinsics.areEqual(this.onCancel, reviewCaptures.onCancel) && Intrinsics.areEqual(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && Intrinsics.areEqual(this.error, reviewCaptures.error) && Intrinsics.areEqual(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && Intrinsics.areEqual(this.styles, reviewCaptures.styles) && Intrinsics.areEqual(this.bottomSheet, reviewCaptures.bottomSheet);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.Screen
            public final UiStepBottomSheet getBottomSheet() {
                return this.bottomSheet;
            }

            public final int hashCode() {
                int hashCode = this.imageLoader.hashCode() * 31;
                String str = this.title;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.prompt;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclaimer;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.submitButtonText;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.onBack.hashCode() + ((this.onCancel.hashCode() + ((this.onSubmit.hashCode() + Recorder$$ExternalSyntheticOutline1.m((this.openUploadOptions.hashCode() + ((this.openCamera.hashCode() + ((this.selectFromPhotoLibrary.hashCode() + ((this.openSelectFile.hashCode() + ((this.navigationState.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.documents)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.onRemove)) * 31)) * 31)) * 31, 31, this.disabled), 31, this.addButtonEnabled), 31, this.submitButtonEnabled);
                String str5 = this.error;
                int hashCode5 = (this.onErrorDismissed.hashCode() + ((m + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int hashCode6 = (hashCode5 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                UiStepBottomSheet uiStepBottomSheet = this.bottomSheet;
                return hashCode6 + (uiStepBottomSheet != null ? uiStepBottomSheet.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReviewCaptures(imageLoader=");
                sb.append(this.imageLoader);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", prompt=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.prompt, ", disclaimer=", this.disclaimer, ", submitButtonText=");
                NavAction$$ExternalSyntheticOutline0.m(this.submitButtonText, ", documents=", ", navigationState=", sb, this.documents);
                sb.append(this.navigationState);
                sb.append(", openSelectFile=");
                sb.append(this.openSelectFile);
                sb.append(", selectFromPhotoLibrary=");
                sb.append(this.selectFromPhotoLibrary);
                sb.append(", openCamera=");
                sb.append(this.openCamera);
                sb.append(", openUploadOptions=");
                sb.append(this.openUploadOptions);
                sb.append(", onRemove=");
                sb.append(this.onRemove);
                sb.append(", onSubmit=");
                sb.append(this.onSubmit);
                sb.append(", onCancel=");
                sb.append(this.onCancel);
                sb.append(", onBack=");
                sb.append(this.onBack);
                sb.append(", disabled=");
                sb.append(this.disabled);
                sb.append(", addButtonEnabled=");
                re$$ExternalSyntheticOutline0.m(sb, this.addButtonEnabled, ", submitButtonEnabled=", this.submitButtonEnabled, ", error=");
                sb.append(this.error);
                sb.append(", onErrorDismissed=");
                sb.append(this.onErrorDismissed);
                sb.append(", styles=");
                sb.append(this.styles);
                sb.append(", bottomSheet=");
                sb.append(this.bottomSheet);
                sb.append(")");
                return sb.toString();
            }
        }

        UiStepBottomSheet getBottomSheet();
    }

    public interface StartPage extends Parcelable {

        public final class Prompt implements StartPage {
            public static final Prompt INSTANCE = new Prompt();
            public static final Parcelable.Creator<Prompt> CREATOR = new HCaptchaStateListener.Creator(25);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Prompt);
            }

            public final int hashCode() {
                return 813153962;
            }

            public final String toString() {
                return "Prompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Review implements StartPage {
            public static final Parcelable.Creator<Review> CREATOR = new HCaptchaStateListener.Creator(26);
            public final String documentId;

            public Review(String str) {
                str.getClass();
                this.documentId = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Review) && Intrinsics.areEqual(this.documentId, ((Review) obj).documentId);
            }

            public final int hashCode() {
                return this.documentId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Review(documentId=", this.documentId, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.documentId);
            }
        }
    }

    public DocumentWorkflow(RealImageLoader realImageLoader, Context context, PermissionRequestWorkflow permissionRequestWorkflow, DocumentCameraWorker documentCameraWorker, n nVar, Pool pool, o0 o0Var, FormBody.Builder builder, MatchResult.Destructured destructured, TextSetter textSetter, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger) {
        realImageLoader.getClass();
        context.getClass();
        permissionRequestWorkflow.getClass();
        documentCameraWorker.getClass();
        nVar.getClass();
        pool.getClass();
        o0Var.getClass();
        builder.getClass();
        destructured.getClass();
        textSetter.getClass();
        navigationStateManager.getClass();
        externalEventLogger.getClass();
        trackingEventsLogger.getClass();
        this.imageLoader = realImageLoader;
        this.applicationContext = context;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = nVar;
        this.documentCreateWorker = pool;
        this.documentLoadWorker = o0Var;
        this.documentFileUploadWorker = builder;
        this.documentFileDeleteWorker = destructured;
        this.documentSubmitWorker = textSetter;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public final List componentNamesToActions(UploadOptionsDialog uploadOptionsDialog, StatefulWorkflow.RenderContext renderContext) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = uploadOptionsDialog.selectDocumentButton;
        DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda42 = new DocumentWorkflow$$ExternalSyntheticLambda42(this, renderContext, 4);
        if (str != null) {
            linkedHashMap.put(str, documentWorkflow$$ExternalSyntheticLambda42);
        }
        String str2 = uploadOptionsDialog.selectPhotoButton;
        DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda422 = new DocumentWorkflow$$ExternalSyntheticLambda42(this, renderContext, 5);
        if (str2 != null) {
            linkedHashMap.put(str2, documentWorkflow$$ExternalSyntheticLambda422);
        }
        String str3 = uploadOptionsDialog.takePhotoButton;
        DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda423 = new DocumentWorkflow$$ExternalSyntheticLambda42(this, renderContext, 6);
        if (str3 != null) {
            linkedHashMap.put(str3, documentWorkflow$$ExternalSyntheticLambda423);
        }
        return MapsKt___MapsKt.toList(linkedHashMap);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Object initialState(Object obj, Snapshot snapshot) {
        Parcelable readParcelable;
        Input input = (Input) obj;
        input.getClass();
        StartPage startPage = input.startPage;
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
            State state = (State) readParcelable;
            if (state != null) {
                return state.copyWithUploadOptions$document_release(false);
            }
        }
        if (Intrinsics.areEqual(startPage, StartPage.Prompt.INSTANCE)) {
            return new State.Start(input.documentId);
        }
        if (!(startPage instanceof StartPage.Review)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return new State.ReviewCaptures(EmptyList.INSTANCE, ((StartPage.Review) startPage).documentId, null, true, null, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
    }

    public final void onEvent(StatefulWorkflow.RenderContext renderContext, final Event event) {
        EmitWorkerOutputAction action$default;
        if (event.equals(Event.Cancel.INSTANCE)) {
            action$default = Workflows.action$default(this, new EncodeKt$$ExternalSyntheticLambda0(25));
        } else if (event.equals(Event.Back.INSTANCE)) {
            action$default = Workflows.action$default(this, new EncodeKt$$ExternalSyntheticLambda0(26));
        } else if (event.equals(Event.SelectDocument.INSTANCE)) {
            action$default = Workflows.action$default(this, new EncodeKt$$ExternalSyntheticLambda0(27));
        } else if (event.equals(Event.SelectPhotoFromLibrary.INSTANCE)) {
            action$default = Workflows.action$default(this, new EncodeKt$$ExternalSyntheticLambda0(28));
        } else if (event.equals(Event.TakePhoto.INSTANCE)) {
            action$default = Workflows.action$default(this, new EncodeKt$$ExternalSyntheticLambda0(29));
        } else {
            final int i = 1;
            if (event.equals(Event.OpenUploadOptions.INSTANCE)) {
                action$default = Workflows.action$default(this, new DocumentWorkflow$$ExternalSyntheticLambda7(i));
            } else if (event.equals(Event.CloseUploadOptions.INSTANCE)) {
                action$default = Workflows.action$default(this, new DocumentWorkflow$$ExternalSyntheticLambda7(2));
            } else if (event instanceof Event.RemoveDocument) {
                final int i2 = 0;
                action$default = Workflows.action$default(this, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        DocumentWorkflow.Event event2 = event;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i3) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                if (obj2 instanceof DocumentWorkflow.State.ReviewCaptures) {
                                    DocumentWorkflow.Event.RemoveDocument removeDocument = (DocumentWorkflow.Event.RemoveDocument) event2;
                                    updater.state = DocumentWorkflow.State.copyWithUploadState$document_release$default((DocumentWorkflow.State) obj2, new DocumentWorkflow.State.UploadState.DeleteFiles(removeDocument.documentId), null, null, removeDocument.document, 6);
                                }
                                break;
                            default:
                                updater.getClass();
                                String str = ((DocumentWorkflow.Event.Submit) event2).documentId;
                                updater.state = new DocumentWorkflow.State.UploadDocument(((DocumentWorkflow.State) updater.state).getDocuments(), str, new DocumentWorkflow.State.UploadState.ReadyToSubmit(str), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            } else if (event.equals(Event.DismissError.INSTANCE)) {
                action$default = Workflows.action$default(this, new DocumentWorkflow$$ExternalSyntheticLambda7(3));
            } else {
                if (!(event instanceof Event.Submit)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                action$default = Workflows.action$default(this, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i;
                        DocumentWorkflow.Event event2 = event;
                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                        switch (i3) {
                            case 0:
                                updater.getClass();
                                Object obj2 = updater.state;
                                if (obj2 instanceof DocumentWorkflow.State.ReviewCaptures) {
                                    DocumentWorkflow.Event.RemoveDocument removeDocument = (DocumentWorkflow.Event.RemoveDocument) event2;
                                    updater.state = DocumentWorkflow.State.copyWithUploadState$document_release$default((DocumentWorkflow.State) obj2, new DocumentWorkflow.State.UploadState.DeleteFiles(removeDocument.documentId), null, null, removeDocument.document, 6);
                                }
                                break;
                            default:
                                updater.getClass();
                                String str = ((DocumentWorkflow.Event.Submit) event2).documentId;
                                updater.state = new DocumentWorkflow.State.UploadDocument(((DocumentWorkflow.State) updater.state).getDocuments(), str, new DocumentWorkflow.State.UploadState.ReadyToSubmit(str), null);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        renderContext.$$delegate_0.getActionSink().send(action$default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x035b  */
    @Override // com.squareup.workflow1.StatefulWorkflow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object render(Object obj, Object obj2, StatefulWorkflow.RenderContext renderContext) {
        DocumentPages documentPages;
        String str;
        int i;
        NavigationStateManager navigationStateManager;
        String str2;
        Input input;
        String str3;
        boolean z;
        DocumentPages documentPages2;
        final StatefulWorkflow.RenderContext renderContext2;
        String str4;
        boolean z2;
        String str5;
        ModalContainerScreen withRequestPermissionsIfNeeded;
        String str6;
        ModalContainerScreen withRequestPermissionsIfNeeded2;
        Object obj3;
        String str7;
        ModalContainerScreen withRequestPermissionsIfNeeded3;
        DocumentsSelectWorker documentsSelectWorker;
        final DocumentWorkflow documentWorkflow = this;
        BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
        Input input2 = (Input) obj;
        final State state = (State) obj2;
        input2.getClass();
        state.getClass();
        boolean z3 = input2.backStepEnabled;
        String str8 = input2.permissionsRationale;
        String str9 = input2.permissionsTitle;
        int i2 = input2.documentFileLimit;
        String str10 = input2.sessionToken;
        DocumentPages documentPages3 = input2.pages;
        boolean z4 = state instanceof State.UploadDocument;
        NavigationStateManager navigationStateManager2 = documentWorkflow.navigationStateManager;
        NavigationStateManager.setState$default(navigationStateManager2, z3, input2.cancelButtonEnabled, !z4, 8);
        int ordinal = state.getCaptureState().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            documentPages = documentPages3;
            str = str8;
            i = 1;
        } else if (ordinal != 2) {
            if (ordinal != 3 && ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            State.CaptureState captureState = state.getCaptureState();
            State.CaptureState captureState2 = State.CaptureState.SelectFileFromDocuments;
            n nVar = documentWorkflow.documentsSelectWorkerFactory;
            if (captureState == captureState2) {
                documentPages = documentPages3;
                str = str8;
                documentsSelectWorker = new DocumentsSelectWorker("DocumentPicker", (Context) nVar.c, (SdkFilesManager) nVar.d, new DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0(nVar, 0));
                i = 1;
            } else {
                documentPages = documentPages3;
                str = str8;
                i = 1;
                documentsSelectWorker = new DocumentsSelectWorker("PhotoLibraryPicker", (Context) nVar.c, (SdkFilesManager) nVar.d, new DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0(nVar, i));
            }
            Workflows.runningWorker(renderContext, documentsSelectWorker, Reflection.typeOf(DocumentsSelectWorker.class), "", new SelfieWorkflow$$ExternalSyntheticLambda38(3, documentWorkflow, input2, state));
        } else {
            documentPages = documentPages3;
            str = str8;
            i = 1;
            Workflows.runningWorker(renderContext, documentWorkflow.documentCameraWorker, Reflection.typeOf(DocumentCameraWorker.class), "", new HCaptcha$$ExternalSyntheticLambda1(9, documentWorkflow, input2));
        }
        State.UploadState uploadState = state.getUploadState();
        Continuation continuation = null;
        if (!Intrinsics.areEqual(uploadState, State.UploadState.CreateDocument.INSTANCE)) {
            navigationStateManager = navigationStateManager2;
            if (uploadState instanceof State.UploadState.UploadFiles) {
                List documents = state.getDocuments();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : documents) {
                    if (obj4 instanceof DocumentFile.Local) {
                        arrayList.add(obj4);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = z4;
                    documentPages2 = documentPages;
                    Logger$_log$2 logger$_log$2 = new Logger$_log$2(renderContext, documentWorkflow, (State.UploadState.UploadFiles) uploadState, continuation, 25);
                    documentWorkflow = documentWorkflow;
                    baseRenderContext.runningSideEffect("upload_complete", logger$_log$2);
                    input = input2;
                    str3 = str9;
                    str4 = "";
                    renderContext2 = renderContext;
                    DocumentUtilsKt.logState(documentWorkflow.externalEventLogger, documentWorkflow.trackingEventsLogger, input, state);
                    z2 = state instanceof State.Start;
                    Context context = documentWorkflow.applicationContext;
                    if (z2) {
                    }
                } else {
                    str2 = "";
                    char c = 2;
                    z = z4;
                    documentPages2 = documentPages;
                    char c2 = 4;
                    char c3 = 3;
                    Iterator it = CollectionsKt.take(arrayList, 3).iterator();
                    while (it.hasNext()) {
                        DocumentFile.Local local = (DocumentFile.Local) it.next();
                        State.UploadState.UploadFiles uploadFiles = (State.UploadState.UploadFiles) uploadState;
                        String str11 = uploadFiles.documentId;
                        boolean z5 = i2 == i ? i : 0;
                        FormBody.Builder builder = documentWorkflow.documentFileUploadWorker;
                        builder.getClass();
                        str10.getClass();
                        str11.getClass();
                        local.getClass();
                        Input input3 = input2;
                        Workflows.runningWorker(renderContext, new DocumentFileUploadWorker(str10, (DocumentService) builder.names, str11, local, (RealFileHelper) builder.values, z5), Reflection.typeOf(DocumentFileUploadWorker.class), local.absoluteFilePath, new OpenSourceKt$$ExternalSyntheticLambda9(documentWorkflow, uploadFiles, local, input3, 19));
                        input2 = input3;
                        c2 = 4;
                        str9 = str9;
                        it = it;
                        c = 2;
                        c3 = 3;
                        i = 1;
                    }
                    input = input2;
                    str3 = str9;
                    renderContext2 = renderContext;
                    str4 = str2;
                    DocumentUtilsKt.logState(documentWorkflow.externalEventLogger, documentWorkflow.trackingEventsLogger, input, state);
                    z2 = state instanceof State.Start;
                    Context context2 = documentWorkflow.applicationContext;
                    if (z2) {
                    }
                }
            } else {
                str2 = "";
                input = input2;
                str3 = str9;
                z = z4;
                documentPages2 = documentPages;
                int i3 = 4;
                renderContext2 = renderContext;
                if (uploadState instanceof State.UploadState.DeleteFiles) {
                    if (state instanceof State.ReviewCaptures) {
                        State.ReviewCaptures reviewCaptures = (State.ReviewCaptures) state;
                        DocumentFile documentFile = reviewCaptures.documentFileToDelete;
                        DocumentFile.Remote remote = documentFile instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFile : null;
                        if (remote != null) {
                            String str12 = reviewCaptures.documentId;
                            MatchResult.Destructured destructured = documentWorkflow.documentFileDeleteWorker;
                            destructured.getClass();
                            str10.getClass();
                            str12.getClass();
                            str4 = str2;
                            Workflows.runningWorker(renderContext2, new DocumentFileDeleteWorker(str10, (DocumentService) destructured.match, remote), Reflection.typeOf(DocumentFileDeleteWorker.class), str4, new SelfieWorkflow$$ExternalSyntheticLambda38(i3, documentWorkflow, remote, (State.UploadState.DeleteFiles) uploadState));
                        }
                    }
                    str4 = str2;
                } else {
                    str4 = str2;
                    if (!(uploadState instanceof State.UploadState.ReadyToSubmit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                DocumentUtilsKt.logState(documentWorkflow.externalEventLogger, documentWorkflow.trackingEventsLogger, input, state);
                z2 = state instanceof State.Start;
                Context context22 = documentWorkflow.applicationContext;
                if (z2) {
                }
            }
        } else {
            if (state.getDocumentId() != null) {
                str2 = "";
                input = input2;
                str3 = str9;
                navigationStateManager = navigationStateManager2;
                z = z4;
                documentPages2 = documentPages;
                renderContext2 = renderContext;
                str4 = str2;
                DocumentUtilsKt.logState(documentWorkflow.externalEventLogger, documentWorkflow.trackingEventsLogger, input, state);
                z2 = state instanceof State.Start;
                Context context222 = documentWorkflow.applicationContext;
                if (z2) {
                    DocumentStartPage documentStartPage = documentPages2.documentStartPage;
                    UploadOptionsDialog uploadOptionsDialog = documentPages2.uploadOptionsDialog;
                    UiComponentScreen uiComponentScreen = NestedUiStepKt.to(documentStartPage);
                    DocumentStartPage documentStartPage2 = documentPages2.documentStartPage;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str13 = documentStartPage2.selectDocumentButton;
                    DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda42 = new DocumentWorkflow$$ExternalSyntheticLambda42(documentWorkflow, renderContext2, 0);
                    if (str13 != null) {
                        linkedHashMap.put(str13, documentWorkflow$$ExternalSyntheticLambda42);
                    }
                    String str14 = documentStartPage2.selectPhotoButton;
                    DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda422 = new DocumentWorkflow$$ExternalSyntheticLambda42(documentWorkflow, renderContext2, 1);
                    if (str14 != null) {
                        linkedHashMap.put(str14, documentWorkflow$$ExternalSyntheticLambda422);
                    }
                    String str15 = documentStartPage2.takePhotoButton;
                    final int i4 = 2;
                    DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda423 = new DocumentWorkflow$$ExternalSyntheticLambda42(documentWorkflow, renderContext2, 2);
                    if (str15 != null) {
                        linkedHashMap.put(str15, documentWorkflow$$ExternalSyntheticLambda423);
                    }
                    String str16 = documentStartPage2.launchUploadOptionsButton;
                    DocumentWorkflow$$ExternalSyntheticLambda42 documentWorkflow$$ExternalSyntheticLambda424 = new DocumentWorkflow$$ExternalSyntheticLambda42(documentWorkflow, renderContext2, 3);
                    if (str16 != null) {
                        linkedHashMap.put(str16, documentWorkflow$$ExternalSyntheticLambda424);
                    }
                    final int i5 = 0;
                    final int i6 = 9;
                    DocumentInstructionsView documentInstructionsView = new DocumentInstructionsView(uiComponentScreen, MapsKt___MapsKt.toList(linkedHashMap), navigationStateManager.getNavigationState(), new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i5;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext3 = renderContext2;
                            DocumentWorkflow documentWorkflow2 = this.f$0;
                            switch (i7) {
                                case 0:
                                    documentWorkflow2.onEvent(renderContext3, back);
                                    break;
                                case 1:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 2:
                                    documentWorkflow2.onEvent(renderContext3, back);
                                    break;
                                case 3:
                                    documentWorkflow2.onEvent(renderContext3, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow2.onEvent(renderContext3, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow2.onEvent(renderContext3, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow2.onEvent(renderContext3, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow2.onEvent(renderContext3, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 10:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 11:
                                    documentWorkflow2.onEvent(renderContext3, back);
                                    break;
                                case 12:
                                    documentWorkflow2.onEvent(renderContext3, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 15:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 16:
                                    documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow2.onEvent(renderContext3, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow2.onEvent(renderContext3, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow2.onEvent(renderContext3, takePhoto);
                                    break;
                                default:
                                    documentWorkflow2.onEvent(renderContext3, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i6;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext3 = renderContext2;
                            DocumentWorkflow documentWorkflow2 = this.f$0;
                            switch (i7) {
                                case 0:
                                    documentWorkflow2.onEvent(renderContext3, back);
                                    break;
                                case 1:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 2:
                                    documentWorkflow2.onEvent(renderContext3, back);
                                    break;
                                case 3:
                                    documentWorkflow2.onEvent(renderContext3, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow2.onEvent(renderContext3, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow2.onEvent(renderContext3, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow2.onEvent(renderContext3, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow2.onEvent(renderContext3, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 10:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 11:
                                    documentWorkflow2.onEvent(renderContext3, back);
                                    break;
                                case 12:
                                    documentWorkflow2.onEvent(renderContext3, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 15:
                                    documentWorkflow2.onEvent(renderContext3, cancel);
                                    break;
                                case 16:
                                    documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow2.onEvent(renderContext3, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow2.onEvent(renderContext3, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow2.onEvent(renderContext3, takePhoto);
                                    break;
                                default:
                                    documentWorkflow2.onEvent(renderContext3, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, null);
                    State.Start start = (State.Start) state;
                    if (start.shouldShowUploadOptionsDialog) {
                        UiComponentScreen uiComponentScreen2 = NestedUiStepKt.to(uploadOptionsDialog);
                        List componentNamesToActions = documentWorkflow.componentNamesToActions(uploadOptionsDialog, renderContext2);
                        final int i7 = 16;
                        Function0 function0 = new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                            public final /* synthetic */ DocumentWorkflow f$0;

                            {
                                this.f$0 = documentWorkflow;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i7;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                StatefulWorkflow.RenderContext renderContext3 = renderContext2;
                                DocumentWorkflow documentWorkflow2 = this.f$0;
                                switch (i72) {
                                    case 0:
                                        documentWorkflow2.onEvent(renderContext3, back);
                                        break;
                                    case 1:
                                        documentWorkflow2.onEvent(renderContext3, cancel);
                                        break;
                                    case 2:
                                        documentWorkflow2.onEvent(renderContext3, back);
                                        break;
                                    case 3:
                                        documentWorkflow2.onEvent(renderContext3, dismissError);
                                        break;
                                    case 4:
                                        documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                        break;
                                    case 5:
                                        documentWorkflow2.onEvent(renderContext3, selectDocument);
                                        break;
                                    case 6:
                                        documentWorkflow2.onEvent(renderContext3, selectPhotoFromLibrary);
                                        break;
                                    case 7:
                                        documentWorkflow2.onEvent(renderContext3, takePhoto);
                                        break;
                                    case 8:
                                        documentWorkflow2.onEvent(renderContext3, openUploadOptions);
                                        break;
                                    case 9:
                                        documentWorkflow2.onEvent(renderContext3, cancel);
                                        break;
                                    case 10:
                                        documentWorkflow2.onEvent(renderContext3, cancel);
                                        break;
                                    case 11:
                                        documentWorkflow2.onEvent(renderContext3, back);
                                        break;
                                    case 12:
                                        documentWorkflow2.onEvent(renderContext3, dismissError);
                                        break;
                                    case 13:
                                        documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                        break;
                                    case 14:
                                        documentWorkflow2.onEvent(renderContext3, cancel);
                                        break;
                                    case 15:
                                        documentWorkflow2.onEvent(renderContext3, cancel);
                                        break;
                                    case 16:
                                        documentWorkflow2.onEvent(renderContext3, closeUploadOptions);
                                        break;
                                    case 17:
                                        documentWorkflow2.onEvent(renderContext3, selectDocument);
                                        break;
                                    case 18:
                                        documentWorkflow2.onEvent(renderContext3, selectPhotoFromLibrary);
                                        break;
                                    case 19:
                                        documentWorkflow2.onEvent(renderContext3, takePhoto);
                                        break;
                                    default:
                                        documentWorkflow2.onEvent(renderContext3, openUploadOptions);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        String str17 = uploadOptionsDialog.cancelButton;
                        componentNamesToActions.getClass();
                        obj3 = ModalContainerScreenKt.firstInModalStack("document_upload_options_dialog", new UiStepBottomSheet(uiComponentScreen2, componentNamesToActions, function0, str17, true), documentInstructionsView);
                    } else {
                        obj3 = documentInstructionsView;
                    }
                    boolean z6 = start.captureState == State.CaptureState.CheckCameraPermissions;
                    Permission permission = Permission.Camera;
                    String str18 = str3 == null ? str4 : str3;
                    if (str == null) {
                        str7 = context222.getString(R.string.pi2_document_camera_permission_rationale);
                        str7.getClass();
                    } else {
                        str7 = str;
                    }
                    String string2 = context222.getString(R.string.pi2_document_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context222));
                    string2.getClass();
                    withRequestPermissionsIfNeeded3 = PermissionsStateKt.withRequestPermissionsIfNeeded(obj3, renderContext, z6, permission, false, str18, str7, string2, input.permissionsModalPositiveButton, input.permissionsModalNegativeButton, null, null, null, documentWorkflow.permissionRequestWorkflow, input.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda17
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i8 = i4;
                            final DocumentWorkflow.State state2 = state;
                            final DocumentWorkflow documentWorkflow2 = this.f$0;
                            final PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj5;
                            switch (i8) {
                                case 0:
                                    output.getClass();
                                    final int i9 = 1;
                                    return Workflows.action$default(documentWorkflow2, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i10 = i9;
                                            DocumentWorkflow.State state3 = state2;
                                            DocumentWorkflow documentWorkflow3 = documentWorkflow2;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                            switch (i10) {
                                                case 0:
                                                    updater.getClass();
                                                    int ordinal2 = output2.permissionState.result.ordinal();
                                                    if (ordinal2 == 0) {
                                                        DocumentCameraWorker documentCameraWorker = documentWorkflow3.documentCameraWorker;
                                                        String string3 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string3.getClass();
                                                        updater.state = documentCameraWorker.launchTakePicture(string3) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                case 1:
                                                    updater.getClass();
                                                    int ordinal3 = output2.permissionState.result.ordinal();
                                                    if (ordinal3 == 0) {
                                                        DocumentCameraWorker documentCameraWorker2 = documentWorkflow3.documentCameraWorker;
                                                        String string4 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string4.getClass();
                                                        updater.state = documentCameraWorker2.launchTakePicture(string4) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    int ordinal4 = output2.permissionState.result.ordinal();
                                                    if (ordinal4 == 0) {
                                                        DocumentCameraWorker documentCameraWorker3 = documentWorkflow3.documentCameraWorker;
                                                        String string5 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string5.getClass();
                                                        updater.state = documentCameraWorker3.launchTakePicture(string5) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                case 1:
                                    output.getClass();
                                    final int i10 = 2;
                                    return Workflows.action$default(documentWorkflow2, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i102 = i10;
                                            DocumentWorkflow.State state3 = state2;
                                            DocumentWorkflow documentWorkflow3 = documentWorkflow2;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                            switch (i102) {
                                                case 0:
                                                    updater.getClass();
                                                    int ordinal2 = output2.permissionState.result.ordinal();
                                                    if (ordinal2 == 0) {
                                                        DocumentCameraWorker documentCameraWorker = documentWorkflow3.documentCameraWorker;
                                                        String string3 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string3.getClass();
                                                        updater.state = documentCameraWorker.launchTakePicture(string3) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                case 1:
                                                    updater.getClass();
                                                    int ordinal3 = output2.permissionState.result.ordinal();
                                                    if (ordinal3 == 0) {
                                                        DocumentCameraWorker documentCameraWorker2 = documentWorkflow3.documentCameraWorker;
                                                        String string4 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string4.getClass();
                                                        updater.state = documentCameraWorker2.launchTakePicture(string4) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    int ordinal4 = output2.permissionState.result.ordinal();
                                                    if (ordinal4 == 0) {
                                                        DocumentCameraWorker documentCameraWorker3 = documentWorkflow3.documentCameraWorker;
                                                        String string5 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string5.getClass();
                                                        updater.state = documentCameraWorker3.launchTakePicture(string5) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                default:
                                    output.getClass();
                                    final int i11 = 0;
                                    return Workflows.action$default(documentWorkflow2, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i102 = i11;
                                            DocumentWorkflow.State state3 = state2;
                                            DocumentWorkflow documentWorkflow3 = documentWorkflow2;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                            switch (i102) {
                                                case 0:
                                                    updater.getClass();
                                                    int ordinal2 = output2.permissionState.result.ordinal();
                                                    if (ordinal2 == 0) {
                                                        DocumentCameraWorker documentCameraWorker = documentWorkflow3.documentCameraWorker;
                                                        String string3 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string3.getClass();
                                                        updater.state = documentCameraWorker.launchTakePicture(string3) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                case 1:
                                                    updater.getClass();
                                                    int ordinal3 = output2.permissionState.result.ordinal();
                                                    if (ordinal3 == 0) {
                                                        DocumentCameraWorker documentCameraWorker2 = documentWorkflow3.documentCameraWorker;
                                                        String string4 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string4.getClass();
                                                        updater.state = documentCameraWorker2.launchTakePicture(string4) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    int ordinal4 = output2.permissionState.result.ordinal();
                                                    if (ordinal4 == 0) {
                                                        DocumentCameraWorker documentCameraWorker3 = documentWorkflow3.documentCameraWorker;
                                                        String string5 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string5.getClass();
                                                        updater.state = documentCameraWorker3.launchTakePicture(string5) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                            }
                        }
                    });
                    return withRequestPermissionsIfNeeded3;
                }
                final StatefulWorkflow.RenderContext renderContext3 = renderContext2;
                if (state instanceof State.ReviewCaptures) {
                    State.ReviewCaptures reviewCaptures2 = (State.ReviewCaptures) state;
                    List list = reviewCaptures2.documents;
                    String str19 = reviewCaptures2.documentId;
                    if (reviewCaptures2.shouldLoadDocuments) {
                        o0 o0Var = documentWorkflow.documentLoadWorker;
                        o0Var.getClass();
                        str10.getClass();
                        str19.getClass();
                        DocumentLoadWorker documentLoadWorker = new DocumentLoadWorker(str10, (DocumentService) o0Var.a, str19);
                        final int i8 = 1;
                        Workflows.runningWorker(renderContext3, documentLoadWorker, Reflection.typeOf(DocumentLoadWorker.class), str4, new Function1(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda31
                            public final /* synthetic */ DocumentWorkflow f$0;

                            {
                                this.f$0 = documentWorkflow;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i9 = i8;
                                final int i10 = 1;
                                final int i11 = 0;
                                DocumentWorkflow documentWorkflow2 = this.f$0;
                                switch (i9) {
                                    case 0:
                                        DocumentSubmitWorker.Response response = (DocumentSubmitWorker.Response) obj5;
                                        response.getClass();
                                        if (!response.equals(DocumentSubmitWorker.Response.Success.INSTANCE)) {
                                            if (!(response instanceof DocumentSubmitWorker.Response.Error)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        final DocumentLoadWorker.Response response2 = (DocumentLoadWorker.Response) obj5;
                                        response2.getClass();
                                        if (!(response2 instanceof DocumentLoadWorker.Response.Success)) {
                                            if (!(response2 instanceof DocumentLoadWorker.Response.Error)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    default:
                                        final DocumentCreateWorker.Response response3 = (DocumentCreateWorker.Response) obj5;
                                        response3.getClass();
                                        if (!(response3 instanceof DocumentCreateWorker.Response.Success)) {
                                            if (!(response3 instanceof DocumentCreateWorker.Response.Error)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                }
                                return null;
                            }
                        });
                    }
                    String str20 = input.promptTitle;
                    String str21 = input.promptDescription;
                    String str22 = input.disclaimer;
                    String str23 = input.submitButtonText;
                    List list2 = reviewCaptures2.documents;
                    StepStyles.DocumentStepStyle documentStepStyle = input.styles;
                    NavigationState navigationState = navigationStateManager.getNavigationState();
                    boolean z7 = reviewCaptures2.shouldLoadDocuments;
                    Input input4 = input;
                    boolean z8 = list.size() < i2;
                    boolean z9 = !list.isEmpty() && Intrinsics.areEqual(reviewCaptures2.uploadState, new State.UploadState.ReadyToSubmit(str19));
                    String str24 = reviewCaptures2.error;
                    final int i9 = 17;
                    Function0 function02 = new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i9;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow2 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i10 = 18;
                    Function0 function03 = new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i10;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow2 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i11 = 19;
                    Function0 function04 = new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i11;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow2 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i12 = 20;
                    Function0 function05 = new Function0(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i12;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow2 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow2.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow2.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow2.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow2.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow2.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow2.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow2.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow2.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    SelfieWorkflow$$ExternalSyntheticLambda38 selfieWorkflow$$ExternalSyntheticLambda38 = new SelfieWorkflow$$ExternalSyntheticLambda38(documentWorkflow, renderContext3, state, false, 2);
                    final DocumentWorkflow documentWorkflow2 = documentWorkflow;
                    HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(i12, documentWorkflow2, renderContext3, state);
                    final int i13 = 1;
                    Function0 function06 = new Function0(documentWorkflow2) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i13;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i14 = 2;
                    Function0 function07 = new Function0(documentWorkflow2) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i14;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i15 = 3;
                    Screen.ReviewCaptures reviewCaptures3 = new Screen.ReviewCaptures(documentWorkflow2.imageLoader, str20, str21, str22, str23, list2, navigationState, function02, function03, function04, function05, selfieWorkflow$$ExternalSyntheticLambda38, heroCardViewKt$$ExternalSyntheticLambda9, function06, function07, z7, z8, z9, str24, new Function0(documentWorkflow2) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i15;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, documentStepStyle, null);
                    boolean z10 = reviewCaptures2.captureState == State.CaptureState.CheckCameraPermissions;
                    Permission permission2 = Permission.Camera;
                    String str25 = str3 == null ? str4 : str3;
                    if (str == null) {
                        String string3 = context222.getString(R.string.pi2_document_camera_permission_rationale);
                        string3.getClass();
                        str6 = string3;
                    } else {
                        str6 = str;
                    }
                    String string4 = context222.getString(R.string.pi2_document_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context222));
                    string4.getClass();
                    final int i16 = 0;
                    withRequestPermissionsIfNeeded2 = PermissionsStateKt.withRequestPermissionsIfNeeded(reviewCaptures3, renderContext3, z10, permission2, false, str25, str6, string4, input4.permissionsModalPositiveButton, input4.permissionsModalNegativeButton, null, null, null, documentWorkflow2.permissionRequestWorkflow, input4.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1(documentWorkflow2) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda17
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow2;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i82 = i16;
                            final DocumentWorkflow.State state2 = state;
                            final DocumentWorkflow documentWorkflow22 = this.f$0;
                            final PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj5;
                            switch (i82) {
                                case 0:
                                    output.getClass();
                                    final int i92 = 1;
                                    return Workflows.action$default(documentWorkflow22, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i102 = i92;
                                            DocumentWorkflow.State state3 = state2;
                                            DocumentWorkflow documentWorkflow3 = documentWorkflow22;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                            switch (i102) {
                                                case 0:
                                                    updater.getClass();
                                                    int ordinal2 = output2.permissionState.result.ordinal();
                                                    if (ordinal2 == 0) {
                                                        DocumentCameraWorker documentCameraWorker = documentWorkflow3.documentCameraWorker;
                                                        String string32 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string32.getClass();
                                                        updater.state = documentCameraWorker.launchTakePicture(string32) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                case 1:
                                                    updater.getClass();
                                                    int ordinal3 = output2.permissionState.result.ordinal();
                                                    if (ordinal3 == 0) {
                                                        DocumentCameraWorker documentCameraWorker2 = documentWorkflow3.documentCameraWorker;
                                                        String string42 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string42.getClass();
                                                        updater.state = documentCameraWorker2.launchTakePicture(string42) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    int ordinal4 = output2.permissionState.result.ordinal();
                                                    if (ordinal4 == 0) {
                                                        DocumentCameraWorker documentCameraWorker3 = documentWorkflow3.documentCameraWorker;
                                                        String string5 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string5.getClass();
                                                        updater.state = documentCameraWorker3.launchTakePicture(string5) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                case 1:
                                    output.getClass();
                                    final int i102 = 2;
                                    return Workflows.action$default(documentWorkflow22, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i1022 = i102;
                                            DocumentWorkflow.State state3 = state2;
                                            DocumentWorkflow documentWorkflow3 = documentWorkflow22;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                            switch (i1022) {
                                                case 0:
                                                    updater.getClass();
                                                    int ordinal2 = output2.permissionState.result.ordinal();
                                                    if (ordinal2 == 0) {
                                                        DocumentCameraWorker documentCameraWorker = documentWorkflow3.documentCameraWorker;
                                                        String string32 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string32.getClass();
                                                        updater.state = documentCameraWorker.launchTakePicture(string32) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                case 1:
                                                    updater.getClass();
                                                    int ordinal3 = output2.permissionState.result.ordinal();
                                                    if (ordinal3 == 0) {
                                                        DocumentCameraWorker documentCameraWorker2 = documentWorkflow3.documentCameraWorker;
                                                        String string42 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string42.getClass();
                                                        updater.state = documentCameraWorker2.launchTakePicture(string42) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    int ordinal4 = output2.permissionState.result.ordinal();
                                                    if (ordinal4 == 0) {
                                                        DocumentCameraWorker documentCameraWorker3 = documentWorkflow3.documentCameraWorker;
                                                        String string5 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string5.getClass();
                                                        updater.state = documentCameraWorker3.launchTakePicture(string5) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                default:
                                    output.getClass();
                                    final int i112 = 0;
                                    return Workflows.action$default(documentWorkflow22, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int i1022 = i112;
                                            DocumentWorkflow.State state3 = state2;
                                            DocumentWorkflow documentWorkflow3 = documentWorkflow22;
                                            PermissionRequestWorkflow.Output output2 = output;
                                            WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                            switch (i1022) {
                                                case 0:
                                                    updater.getClass();
                                                    int ordinal2 = output2.permissionState.result.ordinal();
                                                    if (ordinal2 == 0) {
                                                        DocumentCameraWorker documentCameraWorker = documentWorkflow3.documentCameraWorker;
                                                        String string32 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string32.getClass();
                                                        updater.state = documentCameraWorker.launchTakePicture(string32) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                case 1:
                                                    updater.getClass();
                                                    int ordinal3 = output2.permissionState.result.ordinal();
                                                    if (ordinal3 == 0) {
                                                        DocumentCameraWorker documentCameraWorker2 = documentWorkflow3.documentCameraWorker;
                                                        String string42 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string42.getClass();
                                                        updater.state = documentCameraWorker2.launchTakePicture(string42) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                                default:
                                                    updater.getClass();
                                                    int ordinal4 = output2.permissionState.result.ordinal();
                                                    if (ordinal4 == 0) {
                                                        DocumentCameraWorker documentCameraWorker3 = documentWorkflow3.documentCameraWorker;
                                                        String string5 = documentWorkflow3.applicationContext.getString(R.string.pi2_camera_error);
                                                        string5.getClass();
                                                        updater.state = documentCameraWorker3.launchTakePicture(string5) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    } else {
                                                        updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                            }
                        }
                    });
                    if (!reviewCaptures2.shouldShowUploadOptionsDialog) {
                        return new ModalContainerScreen(withRequestPermissionsIfNeeded2, "document_upload_screen", EmptyList.INSTANCE);
                    }
                    UploadOptionsDialog uploadOptionsDialog2 = documentPages2.uploadOptionsDialog;
                    UiComponentScreen uiComponentScreen3 = NestedUiStepKt.to(uploadOptionsDialog2);
                    List componentNamesToActions2 = documentWorkflow2.componentNamesToActions(uploadOptionsDialog2, renderContext3);
                    final int i17 = 4;
                    Function0 function08 = new Function0(documentWorkflow2) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i17;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    String str26 = uploadOptionsDialog2.cancelButton;
                    componentNamesToActions2.getClass();
                    return ModalContainerScreenKt.firstInModalStack("document_upload_screen", new UiStepBottomSheet(uiComponentScreen3, componentNamesToActions2, function08, str26, true), withRequestPermissionsIfNeeded2);
                }
                final DocumentWorkflow documentWorkflow3 = documentWorkflow;
                Input input5 = input;
                if (!(state instanceof State.ReviewCapturesWithoutDocumentId)) {
                    if (!z) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str27 = input5.inquiryId;
                    String str28 = input5.fromStep;
                    String str29 = input5.fromComponent;
                    List list3 = ((State.UploadDocument) state).documents;
                    TextSetter textSetter = documentWorkflow3.documentSubmitWorker;
                    textSetter.getClass();
                    str10.getClass();
                    str27.getClass();
                    str28.getClass();
                    str29.getClass();
                    list3.getClass();
                    DocumentSubmitWorker documentSubmitWorker = new DocumentSubmitWorker(str10, (DocumentService) textSetter.textView, str27, str28, str29, (FallbackModeManager) textSetter.textSwitcher, (DataCollector) textSetter.scannerText, list3);
                    final int i18 = 0;
                    Workflows.runningWorker(renderContext3, documentSubmitWorker, Reflection.typeOf(DocumentSubmitWorker.class), str4, new Function1(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda31
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow3;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i92 = i18;
                            final int i102 = 1;
                            final int i112 = 0;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i92) {
                                case 0:
                                    DocumentSubmitWorker.Response response = (DocumentSubmitWorker.Response) obj5;
                                    response.getClass();
                                    if (!response.equals(DocumentSubmitWorker.Response.Success.INSTANCE)) {
                                        if (!(response instanceof DocumentSubmitWorker.Response.Error)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                case 1:
                                    final DocumentLoadWorker.Response response2 = (DocumentLoadWorker.Response) obj5;
                                    response2.getClass();
                                    if (!(response2 instanceof DocumentLoadWorker.Response.Success)) {
                                        if (!(response2 instanceof DocumentLoadWorker.Response.Error)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                default:
                                    final DocumentCreateWorker.Response response3 = (DocumentCreateWorker.Response) obj5;
                                    response3.getClass();
                                    if (!(response3 instanceof DocumentCreateWorker.Response.Success)) {
                                        if (!(response3 instanceof DocumentCreateWorker.Response.Error)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                            }
                            return null;
                        }
                    });
                    NavigationStateManager navigationStateManager3 = navigationStateManager;
                    NavigationStateManager.setState$default(navigationStateManager3, false, false, false, 12);
                    String str30 = input5.pendingTitle;
                    String str31 = input5.pendingDescription;
                    StepStyles.DocumentStepStyle documentStepStyle2 = input5.styles;
                    NextStep.Document.AssetConfig.PendingPage pendingPage = input5.assetConfig.getPendingPage();
                    NavigationState navigationState2 = navigationStateManager3.getNavigationState();
                    PendingPageTextPosition pendingPageTextPosition = input5.pendingPageTextVerticalPosition;
                    final int i19 = 14;
                    Function0 function09 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow3;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i19;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i20 = 15;
                    return new Screen.LoadingAnimation(str30, str31, navigationState2, function09, new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                        public final /* synthetic */ DocumentWorkflow f$0;

                        {
                            this.f$0 = documentWorkflow3;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i72 = i20;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                            DocumentWorkflow documentWorkflow22 = this.f$0;
                            switch (i72) {
                                case 0:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 1:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 2:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 3:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 4:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 5:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 6:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 7:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                case 8:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                                case 9:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 10:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 11:
                                    documentWorkflow22.onEvent(renderContext32, back);
                                    break;
                                case 12:
                                    documentWorkflow22.onEvent(renderContext32, dismissError);
                                    break;
                                case 13:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 14:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 15:
                                    documentWorkflow22.onEvent(renderContext32, cancel);
                                    break;
                                case 16:
                                    documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                    break;
                                case 17:
                                    documentWorkflow22.onEvent(renderContext32, selectDocument);
                                    break;
                                case 18:
                                    documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                    break;
                                case 19:
                                    documentWorkflow22.onEvent(renderContext32, takePhoto);
                                    break;
                                default:
                                    documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, documentStepStyle2, pendingPage, pendingPageTextPosition);
                }
                State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (State.ReviewCapturesWithoutDocumentId) state;
                String str32 = reviewCapturesWithoutDocumentId.documentId;
                if (str32 != null) {
                    baseRenderContext.runningSideEffect(str32, new Logger$_log$2(renderContext3, documentWorkflow3, str32, (Continuation) null));
                }
                String str33 = input5.promptTitle;
                String str34 = input5.promptDescription;
                String str35 = input5.disclaimer;
                String str36 = input5.submitButtonText;
                List list4 = reviewCapturesWithoutDocumentId.documents;
                StepStyles.DocumentStepStyle documentStepStyle3 = input5.styles;
                NavigationState navigationState3 = navigationStateManager.getNavigationState();
                boolean z11 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                boolean z12 = reviewCapturesWithoutDocumentId.documents.size() < i2;
                String str37 = reviewCapturesWithoutDocumentId.error;
                final int i21 = 5;
                Function0 function010 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i21;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i22 = 6;
                Function0 function011 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i22;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i23 = 7;
                Function0 function012 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i23;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i24 = 8;
                Function0 function013 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i24;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                EncodeKt$$ExternalSyntheticLambda0 encodeKt$$ExternalSyntheticLambda0 = new EncodeKt$$ExternalSyntheticLambda0(23);
                ShimmerThemeKt$$ExternalSyntheticLambda0 shimmerThemeKt$$ExternalSyntheticLambda0 = new ShimmerThemeKt$$ExternalSyntheticLambda0(11);
                final int i25 = 10;
                Function0 function014 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i25;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i26 = 11;
                Function0 function015 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i26;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i27 = 12;
                Screen.ReviewCaptures reviewCaptures4 = new Screen.ReviewCaptures(documentWorkflow3.imageLoader, str33, str34, str35, str36, list4, navigationState3, function010, function011, function012, function013, encodeKt$$ExternalSyntheticLambda0, shimmerThemeKt$$ExternalSyntheticLambda0, function014, function015, z11, z12, false, str37, new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i27;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, documentStepStyle3, null);
                boolean z13 = reviewCapturesWithoutDocumentId.captureState == State.CaptureState.CheckCameraPermissions;
                Permission permission3 = Permission.Camera;
                String str38 = str3 == null ? str4 : str3;
                if (str == null) {
                    String string5 = context222.getString(R.string.pi2_document_camera_permission_rationale);
                    string5.getClass();
                    str5 = string5;
                } else {
                    str5 = str;
                }
                String string6 = context222.getString(R.string.pi2_document_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context222));
                string6.getClass();
                final int i28 = 1;
                withRequestPermissionsIfNeeded = PermissionsStateKt.withRequestPermissionsIfNeeded(reviewCaptures4, renderContext3, z13, permission3, false, str38, str5, string6, input5.permissionsModalPositiveButton, input5.permissionsModalNegativeButton, null, null, null, documentWorkflow3.permissionRequestWorkflow, input5.styles, (r30 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda17
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i82 = i28;
                        final DocumentWorkflow.State state2 = state;
                        final DocumentWorkflow documentWorkflow22 = this.f$0;
                        final PermissionRequestWorkflow.Output output = (PermissionRequestWorkflow.Output) obj5;
                        switch (i82) {
                            case 0:
                                output.getClass();
                                final int i92 = 1;
                                return Workflows.action$default(documentWorkflow22, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i1022 = i92;
                                        DocumentWorkflow.State state3 = state2;
                                        DocumentWorkflow documentWorkflow32 = documentWorkflow22;
                                        PermissionRequestWorkflow.Output output2 = output;
                                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                        switch (i1022) {
                                            case 0:
                                                updater.getClass();
                                                int ordinal2 = output2.permissionState.result.ordinal();
                                                if (ordinal2 == 0) {
                                                    DocumentCameraWorker documentCameraWorker = documentWorkflow32.documentCameraWorker;
                                                    String string32 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string32.getClass();
                                                    updater.state = documentCameraWorker.launchTakePicture(string32) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                            case 1:
                                                updater.getClass();
                                                int ordinal3 = output2.permissionState.result.ordinal();
                                                if (ordinal3 == 0) {
                                                    DocumentCameraWorker documentCameraWorker2 = documentWorkflow32.documentCameraWorker;
                                                    String string42 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string42.getClass();
                                                    updater.state = documentCameraWorker2.launchTakePicture(string42) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                            default:
                                                updater.getClass();
                                                int ordinal4 = output2.permissionState.result.ordinal();
                                                if (ordinal4 == 0) {
                                                    DocumentCameraWorker documentCameraWorker3 = documentWorkflow32.documentCameraWorker;
                                                    String string52 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string52.getClass();
                                                    updater.state = documentCameraWorker3.launchTakePicture(string52) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            case 1:
                                output.getClass();
                                final int i102 = 2;
                                return Workflows.action$default(documentWorkflow22, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i1022 = i102;
                                        DocumentWorkflow.State state3 = state2;
                                        DocumentWorkflow documentWorkflow32 = documentWorkflow22;
                                        PermissionRequestWorkflow.Output output2 = output;
                                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                        switch (i1022) {
                                            case 0:
                                                updater.getClass();
                                                int ordinal2 = output2.permissionState.result.ordinal();
                                                if (ordinal2 == 0) {
                                                    DocumentCameraWorker documentCameraWorker = documentWorkflow32.documentCameraWorker;
                                                    String string32 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string32.getClass();
                                                    updater.state = documentCameraWorker.launchTakePicture(string32) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                            case 1:
                                                updater.getClass();
                                                int ordinal3 = output2.permissionState.result.ordinal();
                                                if (ordinal3 == 0) {
                                                    DocumentCameraWorker documentCameraWorker2 = documentWorkflow32.documentCameraWorker;
                                                    String string42 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string42.getClass();
                                                    updater.state = documentCameraWorker2.launchTakePicture(string42) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                            default:
                                                updater.getClass();
                                                int ordinal4 = output2.permissionState.result.ordinal();
                                                if (ordinal4 == 0) {
                                                    DocumentCameraWorker documentCameraWorker3 = documentWorkflow32.documentCameraWorker;
                                                    String string52 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string52.getClass();
                                                    updater.state = documentCameraWorker3.launchTakePicture(string52) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            default:
                                output.getClass();
                                final int i112 = 0;
                                return Workflows.action$default(documentWorkflow22, new Function1() { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda46
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i1022 = i112;
                                        DocumentWorkflow.State state3 = state2;
                                        DocumentWorkflow documentWorkflow32 = documentWorkflow22;
                                        PermissionRequestWorkflow.Output output2 = output;
                                        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj6;
                                        switch (i1022) {
                                            case 0:
                                                updater.getClass();
                                                int ordinal2 = output2.permissionState.result.ordinal();
                                                if (ordinal2 == 0) {
                                                    DocumentCameraWorker documentCameraWorker = documentWorkflow32.documentCameraWorker;
                                                    String string32 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string32.getClass();
                                                    updater.state = documentCameraWorker.launchTakePicture(string32) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                            case 1:
                                                updater.getClass();
                                                int ordinal3 = output2.permissionState.result.ordinal();
                                                if (ordinal3 == 0) {
                                                    DocumentCameraWorker documentCameraWorker2 = documentWorkflow32.documentCameraWorker;
                                                    String string42 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string42.getClass();
                                                    updater.state = documentCameraWorker2.launchTakePicture(string42) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                            default:
                                                updater.getClass();
                                                int ordinal4 = output2.permissionState.result.ordinal();
                                                if (ordinal4 == 0) {
                                                    DocumentCameraWorker documentCameraWorker3 = documentWorkflow32.documentCameraWorker;
                                                    String string52 = documentWorkflow32.applicationContext.getString(R.string.pi2_camera_error);
                                                    string52.getClass();
                                                    updater.state = documentCameraWorker3.launchTakePicture(string52) ? state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    updater.state = state3.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                        }
                    }
                });
                if (!reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog) {
                    return new ModalContainerScreen(withRequestPermissionsIfNeeded, "document_upload_screen", EmptyList.INSTANCE);
                }
                UploadOptionsDialog uploadOptionsDialog3 = documentPages2.uploadOptionsDialog;
                UiComponentScreen uiComponentScreen4 = NestedUiStepKt.to(uploadOptionsDialog3);
                List componentNamesToActions3 = documentWorkflow3.componentNamesToActions(uploadOptionsDialog3, renderContext3);
                final int i29 = 13;
                Function0 function016 = new Function0(documentWorkflow3) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda12
                    public final /* synthetic */ DocumentWorkflow f$0;

                    {
                        this.f$0 = documentWorkflow3;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i29;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        StatefulWorkflow.RenderContext renderContext32 = renderContext3;
                        DocumentWorkflow documentWorkflow22 = this.f$0;
                        switch (i72) {
                            case 0:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 1:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 2:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 3:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 4:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 5:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 6:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 7:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            case 8:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                            case 9:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 10:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 11:
                                documentWorkflow22.onEvent(renderContext32, back);
                                break;
                            case 12:
                                documentWorkflow22.onEvent(renderContext32, dismissError);
                                break;
                            case 13:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 14:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 15:
                                documentWorkflow22.onEvent(renderContext32, cancel);
                                break;
                            case 16:
                                documentWorkflow22.onEvent(renderContext32, closeUploadOptions);
                                break;
                            case 17:
                                documentWorkflow22.onEvent(renderContext32, selectDocument);
                                break;
                            case 18:
                                documentWorkflow22.onEvent(renderContext32, selectPhotoFromLibrary);
                                break;
                            case 19:
                                documentWorkflow22.onEvent(renderContext32, takePhoto);
                                break;
                            default:
                                documentWorkflow22.onEvent(renderContext32, openUploadOptions);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                String str39 = uploadOptionsDialog3.cancelButton;
                componentNamesToActions3.getClass();
                return ModalContainerScreenKt.firstInModalStack("document_upload_screen", new UiStepBottomSheet(uiComponentScreen4, componentNamesToActions3, function016, str39, true), withRequestPermissionsIfNeeded);
            }
            String str40 = input2.kind;
            String str41 = input2.fieldKeyDocument;
            Pool pool = documentWorkflow.documentCreateWorker;
            pool.getClass();
            str10.getClass();
            str40.getClass();
            str41.getClass();
            navigationStateManager = navigationStateManager2;
            DocumentCreateWorker documentCreateWorker = new DocumentCreateWorker(str10, (DocumentService) pool.pool, str40, i2, str41);
            final int i30 = 2;
            Workflows.runningWorker(renderContext, documentCreateWorker, Reflection.typeOf(DocumentCreateWorker.class), "", new Function1(documentWorkflow) { // from class: com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda31
                public final /* synthetic */ DocumentWorkflow f$0;

                {
                    this.f$0 = documentWorkflow;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    int i92 = i30;
                    final int i102 = 1;
                    final int i112 = 0;
                    DocumentWorkflow documentWorkflow22 = this.f$0;
                    switch (i92) {
                        case 0:
                            DocumentSubmitWorker.Response response = (DocumentSubmitWorker.Response) obj5;
                            response.getClass();
                            if (!response.equals(DocumentSubmitWorker.Response.Success.INSTANCE)) {
                                if (!(response instanceof DocumentSubmitWorker.Response.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 1:
                            final DocumentLoadWorker.Response response2 = (DocumentLoadWorker.Response) obj5;
                            response2.getClass();
                            if (!(response2 instanceof DocumentLoadWorker.Response.Success)) {
                                if (!(response2 instanceof DocumentLoadWorker.Response.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        default:
                            final DocumentCreateWorker.Response response3 = (DocumentCreateWorker.Response) obj5;
                            response3.getClass();
                            if (!(response3 instanceof DocumentCreateWorker.Response.Success)) {
                                if (!(response3 instanceof DocumentCreateWorker.Response.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                    return null;
                }
            });
            str4 = "";
            input = input2;
            str3 = str9;
            z = z4;
            documentPages2 = documentPages;
            renderContext2 = renderContext;
            DocumentUtilsKt.logState(documentWorkflow.externalEventLogger, documentWorkflow.trackingEventsLogger, input, state);
            z2 = state instanceof State.Start;
            Context context2222 = documentWorkflow.applicationContext;
            if (z2) {
            }
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public final Snapshot snapshotState(Object obj) {
        State state = (State) obj;
        state.getClass();
        return SnapshotParcelsKt.toSnapshot(state);
    }

    public abstract class State implements WorkflowState {
        public final CaptureState captureState;
        public final List documents;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CaptureState {
            public static final /* synthetic */ CaptureState[] $VALUES;
            public static final CaptureState CameraRunning;
            public static final CaptureState CheckCameraPermissions;
            public static final CaptureState None;
            public static final CaptureState SelectFileFromDocuments;
            public static final CaptureState SelectImageFromPhotoLibrary;

            static {
                CaptureState captureState = new CaptureState("None", 0);
                None = captureState;
                CaptureState captureState2 = new CaptureState("CheckCameraPermissions", 1);
                CheckCameraPermissions = captureState2;
                CaptureState captureState3 = new CaptureState("CameraRunning", 2);
                CameraRunning = captureState3;
                CaptureState captureState4 = new CaptureState("SelectFileFromDocuments", 3);
                SelectFileFromDocuments = captureState4;
                CaptureState captureState5 = new CaptureState("SelectImageFromPhotoLibrary", 4);
                SelectImageFromPhotoLibrary = captureState5;
                $VALUES = new CaptureState[]{captureState, captureState2, captureState3, captureState4, captureState5};
            }

            public static CaptureState valueOf(String str) {
                return (CaptureState) Enum.valueOf(CaptureState.class, str);
            }

            public static CaptureState[] values() {
                return (CaptureState[]) $VALUES.clone();
            }
        }

        public final class UploadDocument extends State {
            public static final Parcelable.Creator<UploadDocument> CREATOR = new Frame.Creator(1);
            public final String documentId;
            public final List documents;
            public final String error;
            public final UploadState uploadState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UploadDocument(List list, String str, UploadState uploadState, String str2) {
                super(CaptureState.None, list);
                list.getClass();
                str.getClass();
                uploadState.getClass();
                this.documents = list;
                this.documentId = str;
                this.uploadState = uploadState;
                this.error = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UploadDocument)) {
                    return false;
                }
                UploadDocument uploadDocument = (UploadDocument) obj;
                return Intrinsics.areEqual(this.documents, uploadDocument.documents) && Intrinsics.areEqual(this.documentId, uploadDocument.documentId) && Intrinsics.areEqual(this.uploadState, uploadDocument.uploadState) && Intrinsics.areEqual(this.error, uploadDocument.error);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final List getDocuments() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final UploadState getUploadState() {
                return this.uploadState;
            }

            public final int hashCode() {
                int hashCode = (this.uploadState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.documents.hashCode() * 31, 31, this.documentId)) * 31;
                String str = this.error;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("UploadDocument(documents=", ", documentId=", this.documentId, ", uploadState=", this.documents);
                m.append(this.uploadState);
                m.append(", error=");
                m.append(this.error);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.documents, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                parcel.writeString(this.documentId);
                parcel.writeParcelable(this.uploadState, i);
                parcel.writeString(this.error);
            }
        }

        public interface UploadState extends Parcelable {

            public final class CreateDocument implements UploadState {
                public static final CreateDocument INSTANCE = new CreateDocument();
                public static final Parcelable.Creator<CreateDocument> CREATOR = new Frame.Creator(2);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof CreateDocument);
                }

                public final int hashCode() {
                    return 1079141691;
                }

                public final String toString() {
                    return "CreateDocument";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            public final class DeleteFiles implements UploadState {
                public static final Parcelable.Creator<DeleteFiles> CREATOR = new Frame.Creator(3);
                public final String documentId;

                public DeleteFiles(String str) {
                    str.getClass();
                    this.documentId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof DeleteFiles) && Intrinsics.areEqual(this.documentId, ((DeleteFiles) obj).documentId);
                }

                public final int hashCode() {
                    return this.documentId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeleteFiles(documentId=", this.documentId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.documentId);
                }
            }

            public final class ReadyToSubmit implements UploadState {
                public static final Parcelable.Creator<ReadyToSubmit> CREATOR = new Frame.Creator(4);
                public final String documentId;

                public ReadyToSubmit(String str) {
                    str.getClass();
                    this.documentId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ReadyToSubmit) && Intrinsics.areEqual(this.documentId, ((ReadyToSubmit) obj).documentId);
                }

                public final int hashCode() {
                    return this.documentId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReadyToSubmit(documentId=", this.documentId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.documentId);
                }
            }

            public final class UploadFiles implements UploadState {
                public static final Parcelable.Creator<UploadFiles> CREATOR = new Frame.Creator(5);
                public final String documentId;

                public UploadFiles(String str) {
                    str.getClass();
                    this.documentId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UploadFiles) && Intrinsics.areEqual(this.documentId, ((UploadFiles) obj).documentId);
                }

                public final int hashCode() {
                    return this.documentId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UploadFiles(documentId=", this.documentId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.documentId);
                }
            }
        }

        public State(CaptureState captureState, List list) {
            this.captureState = captureState;
            this.documents = list;
        }

        public static State copyWithUploadState$document_release$default(State state, UploadState uploadState, String str, ArrayList arrayList, DocumentFile.Remote remote, int i) {
            String str2 = (i & 2) != 0 ? null : str;
            List list = (i & 4) != 0 ? null : arrayList;
            DocumentFile.Remote remote2 = (i & 8) != 0 ? null : remote;
            state.getClass();
            uploadState.getClass();
            if (state instanceof Start) {
                Start start = (Start) state;
                if (str2 == null) {
                    str2 = start.documentId;
                }
                return Start.copy$default(start, null, uploadState, str2, false, 9);
            }
            if (state instanceof ReviewCaptures) {
                ReviewCaptures reviewCaptures = (ReviewCaptures) state;
                if (list == null) {
                    list = reviewCaptures.documents;
                }
                return ReviewCaptures.copy$default(reviewCaptures, list, null, uploadState, remote2, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
            }
            DocumentFile.Remote remote3 = remote2;
            if (state instanceof ReviewCapturesWithoutDocumentId) {
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) state;
                if (str2 == null) {
                    str2 = reviewCapturesWithoutDocumentId.documentId;
                }
                String str3 = str2;
                if (list == null) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                return ReviewCapturesWithoutDocumentId.copy$default(reviewCapturesWithoutDocumentId, list, str3, null, uploadState, remote3, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            }
            if (!(state instanceof UploadDocument)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            UploadDocument uploadDocument = (UploadDocument) state;
            List list2 = uploadDocument.documents;
            String str4 = uploadDocument.documentId;
            String str5 = uploadDocument.error;
            list2.getClass();
            str4.getClass();
            return new UploadDocument(list2, str4, uploadState, str5);
        }

        public final State copyWithCaptureState$document_release(CaptureState captureState) {
            if (this instanceof Start) {
                return Start.copy$default((Start) this, captureState, null, null, false, 14);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.copy$default((ReviewCaptures) this, null, captureState, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.copy$default((ReviewCapturesWithoutDocumentId) this, null, null, captureState, null, null, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public final State copyWithUploadOptions$document_release(boolean z) {
            if (this instanceof Start) {
                return Start.copy$default((Start) this, null, null, null, z, 7);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.copy$default((ReviewCaptures) this, null, null, null, null, z, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.copy$default((ReviewCapturesWithoutDocumentId) this, null, null, null, null, null, z, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        public CaptureState getCaptureState() {
            return this.captureState;
        }

        public abstract String getDocumentId();

        public List getDocuments() {
            return this.documents;
        }

        public abstract UploadState getUploadState();

        @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowState
        public final boolean isSameStateAs(WorkflowState workflowState) {
            return getClass() == workflowState.getClass() && getCaptureState() == ((State) workflowState).getCaptureState();
        }

        public final class Start extends State {
            public static final Parcelable.Creator<Start> CREATOR = new HCaptchaStateListener.Creator(29);
            public final CaptureState captureState;
            public final String documentId;
            public final boolean shouldShowUploadOptionsDialog;
            public final UploadState uploadState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(CaptureState captureState, UploadState uploadState, String str, boolean z) {
                super(captureState, EmptyList.INSTANCE);
                captureState.getClass();
                uploadState.getClass();
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z;
            }

            public static Start copy$default(Start start, CaptureState captureState, UploadState uploadState, String str, boolean z, int i) {
                if ((i & 1) != 0) {
                    captureState = start.captureState;
                }
                if ((i & 2) != 0) {
                    uploadState = start.uploadState;
                }
                if ((i & 4) != 0) {
                    str = start.documentId;
                }
                if ((i & 8) != 0) {
                    z = start.shouldShowUploadOptionsDialog;
                }
                start.getClass();
                captureState.getClass();
                uploadState.getClass();
                return new Start(captureState, uploadState, str, z);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Start)) {
                    return false;
                }
                Start start = (Start) obj;
                return this.captureState == start.captureState && Intrinsics.areEqual(this.uploadState, start.uploadState) && Intrinsics.areEqual(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final CaptureState getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final UploadState getUploadState() {
                return this.uploadState;
            }

            public final int hashCode() {
                int hashCode = (this.uploadState.hashCode() + (this.captureState.hashCode() * 31)) * 31;
                String str = this.documentId;
                return Boolean.hashCode(this.shouldShowUploadOptionsDialog) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Start(captureState=");
                sb.append(this.captureState);
                sb.append(", uploadState=");
                sb.append(this.uploadState);
                sb.append(", documentId=");
                return re$$ExternalSyntheticOutline0.m(sb, this.documentId, ", shouldShowUploadOptionsDialog=", this.shouldShowUploadOptionsDialog, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.captureState.name());
                parcel.writeParcelable(this.uploadState, i);
                parcel.writeString(this.documentId);
                parcel.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
            }

            public /* synthetic */ Start(String str) {
                this(CaptureState.None, UploadState.CreateDocument.INSTANCE, str, false);
            }
        }

        public final class ReviewCapturesWithoutDocumentId extends State {
            public static final Parcelable.Creator<ReviewCapturesWithoutDocumentId> CREATOR = new HCaptchaStateListener.Creator(28);
            public final CaptureState captureState;
            public final DocumentFile documentFileToDelete;
            public final String documentId;
            public final List documents;
            public final String error;
            public final boolean reloadingFromPreviousSession;
            public final boolean shouldShowUploadOptionsDialog;
            public final UploadState uploadState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReviewCapturesWithoutDocumentId(List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2) {
                super(captureState, list);
                list.getClass();
                captureState.getClass();
                uploadState.getClass();
                this.documents = list;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.reloadingFromPreviousSession = z;
                this.shouldShowUploadOptionsDialog = z2;
                this.error = str2;
            }

            public static ReviewCapturesWithoutDocumentId copy$default(ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId, List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, int i) {
                if ((i & 1) != 0) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                List list2 = list;
                if ((i & 2) != 0) {
                    str = reviewCapturesWithoutDocumentId.documentId;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    captureState = reviewCapturesWithoutDocumentId.captureState;
                }
                CaptureState captureState2 = captureState;
                if ((i & 8) != 0) {
                    uploadState = reviewCapturesWithoutDocumentId.uploadState;
                }
                UploadState uploadState2 = uploadState;
                if ((i & 16) != 0) {
                    documentFile = reviewCapturesWithoutDocumentId.documentFileToDelete;
                }
                DocumentFile documentFile2 = documentFile;
                boolean z2 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                boolean z3 = (i & 64) != 0 ? reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog : z;
                String str3 = reviewCapturesWithoutDocumentId.error;
                reviewCapturesWithoutDocumentId.getClass();
                list2.getClass();
                captureState2.getClass();
                uploadState2.getClass();
                return new ReviewCapturesWithoutDocumentId(list2, str2, captureState2, uploadState2, documentFile2, z2, z3, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReviewCapturesWithoutDocumentId)) {
                    return false;
                }
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) obj;
                return Intrinsics.areEqual(this.documents, reviewCapturesWithoutDocumentId.documents) && Intrinsics.areEqual(this.documentId, reviewCapturesWithoutDocumentId.documentId) && this.captureState == reviewCapturesWithoutDocumentId.captureState && Intrinsics.areEqual(this.uploadState, reviewCapturesWithoutDocumentId.uploadState) && Intrinsics.areEqual(this.documentFileToDelete, reviewCapturesWithoutDocumentId.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCapturesWithoutDocumentId.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog && Intrinsics.areEqual(this.error, reviewCapturesWithoutDocumentId.error);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final CaptureState getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final List getDocuments() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final UploadState getUploadState() {
                return this.uploadState;
            }

            public final int hashCode() {
                int hashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int hashCode2 = (this.uploadState.hashCode() + ((this.captureState.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (documentFile == null ? 0 : documentFile.hashCode())) * 31, 31, this.reloadingFromPreviousSession), 31, this.shouldShowUploadOptionsDialog);
                String str2 = this.error;
                return m + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("ReviewCapturesWithoutDocumentId(documents=", ", documentId=", this.documentId, ", captureState=", this.documents);
                m.append(this.captureState);
                m.append(", uploadState=");
                m.append(this.uploadState);
                m.append(", documentFileToDelete=");
                m.append(this.documentFileToDelete);
                m.append(", reloadingFromPreviousSession=");
                m.append(this.reloadingFromPreviousSession);
                m.append(", shouldShowUploadOptionsDialog=");
                m.append(this.shouldShowUploadOptionsDialog);
                m.append(", error=");
                m.append(this.error);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.documents, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                parcel.writeString(this.documentId);
                parcel.writeString(this.captureState.name());
                parcel.writeParcelable(this.uploadState, i);
                parcel.writeParcelable(this.documentFileToDelete, i);
                parcel.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                parcel.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                parcel.writeString(this.error);
            }

            public /* synthetic */ ReviewCapturesWithoutDocumentId(List list, String str, UploadState uploadState, String str2, int i) {
                this(list, str, CaptureState.None, uploadState, null, false, false, (i & 128) != 0 ? null : str2);
            }
        }

        public final class ReviewCaptures extends State {
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new HCaptchaStateListener.Creator(27);
            public final CaptureState captureState;
            public final DocumentFile documentFileToDelete;
            public final String documentId;
            public final List documents;
            public final String error;
            public final boolean shouldLoadDocuments;
            public final boolean shouldShowUploadOptionsDialog;
            public final UploadState uploadState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReviewCaptures(List list, String str, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, boolean z2, String str2) {
                super(captureState, list);
                list.getClass();
                str.getClass();
                captureState.getClass();
                uploadState.getClass();
                this.documents = list;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = documentFile;
                this.shouldLoadDocuments = z;
                this.shouldShowUploadOptionsDialog = z2;
                this.error = str2;
            }

            public static ReviewCaptures copy$default(ReviewCaptures reviewCaptures, List list, CaptureState captureState, UploadState uploadState, DocumentFile documentFile, boolean z, int i) {
                if ((i & 1) != 0) {
                    list = reviewCaptures.documents;
                }
                List list2 = list;
                String str = reviewCaptures.documentId;
                if ((i & 4) != 0) {
                    captureState = reviewCaptures.captureState;
                }
                CaptureState captureState2 = captureState;
                if ((i & 8) != 0) {
                    uploadState = reviewCaptures.uploadState;
                }
                UploadState uploadState2 = uploadState;
                if ((i & 16) != 0) {
                    documentFile = reviewCaptures.documentFileToDelete;
                }
                DocumentFile documentFile2 = documentFile;
                boolean z2 = (i & 32) != 0 ? reviewCaptures.shouldLoadDocuments : false;
                if ((i & 64) != 0) {
                    z = reviewCaptures.shouldShowUploadOptionsDialog;
                }
                boolean z3 = z;
                String str2 = (i & 128) != 0 ? reviewCaptures.error : null;
                reviewCaptures.getClass();
                list2.getClass();
                str.getClass();
                captureState2.getClass();
                uploadState2.getClass();
                return new ReviewCaptures(list2, str, captureState2, uploadState2, documentFile2, z2, z3, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) obj;
                return Intrinsics.areEqual(this.documents, reviewCaptures.documents) && Intrinsics.areEqual(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && Intrinsics.areEqual(this.uploadState, reviewCaptures.uploadState) && Intrinsics.areEqual(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.shouldLoadDocuments == reviewCaptures.shouldLoadDocuments && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && Intrinsics.areEqual(this.error, reviewCaptures.error);
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final CaptureState getCaptureState() {
                return this.captureState;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final List getDocuments() {
                return this.documents;
            }

            @Override // com.withpersona.sdk2.inquiry.document.DocumentWorkflow.State
            public final UploadState getUploadState() {
                return this.uploadState;
            }

            public final int hashCode() {
                int hashCode = (this.uploadState.hashCode() + ((this.captureState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.documents.hashCode() * 31, 31, this.documentId)) * 31)) * 31;
                DocumentFile documentFile = this.documentFileToDelete;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (documentFile == null ? 0 : documentFile.hashCode())) * 31, 31, this.shouldLoadDocuments), 31, this.shouldShowUploadOptionsDialog);
                String str = this.error;
                return m + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("ReviewCaptures(documents=", ", documentId=", this.documentId, ", captureState=", this.documents);
                m.append(this.captureState);
                m.append(", uploadState=");
                m.append(this.uploadState);
                m.append(", documentFileToDelete=");
                m.append(this.documentFileToDelete);
                m.append(", shouldLoadDocuments=");
                m.append(this.shouldLoadDocuments);
                m.append(", shouldShowUploadOptionsDialog=");
                m.append(this.shouldShowUploadOptionsDialog);
                m.append(", error=");
                m.append(this.error);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.documents, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                parcel.writeString(this.documentId);
                parcel.writeString(this.captureState.name());
                parcel.writeParcelable(this.uploadState, i);
                parcel.writeParcelable(this.documentFileToDelete, i);
                parcel.writeInt(this.shouldLoadDocuments ? 1 : 0);
                parcel.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                parcel.writeString(this.error);
            }

            public /* synthetic */ ReviewCaptures(List list, String str, UploadState uploadState, boolean z, String str2, int i) {
                this(list, str, CaptureState.None, (i & 8) != 0 ? UploadState.CreateDocument.INSTANCE : uploadState, null, (i & 32) != 0 ? false : z, false, (i & 128) != 0 ? null : str2);
            }
        }
    }
}
