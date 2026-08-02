package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.lifecycle.SavedStateHandle;
import coil3.RealImageLoader;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentInstructionsView;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.DocumentUtilsKt;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.document.network.DocumentCreateWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
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
import com.withpersona.sdk2.inquiry.workflows.NamedWorkflowWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import dev.chrisbanes.haze.Pool;
import java.util.ArrayList;
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
import kotlin.text.MatchResult;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.FormBody;
import org.commonmark.node.Node;

/* loaded from: classes9.dex */
public final class DocumentStepStateManager extends Node {
    public final Context applicationContext;
    public final DocumentCameraWorker documentCameraWorker;
    public final Pool documentCreateWorkerFactory;
    public final MatchResult.Destructured documentFileDeleteWorkerFactory;
    public final FormBody.Builder documentFileUploadWorkerFactory;
    public final o0 documentLoadWorker;
    public final TextSetter documentSubmitWorker;
    public final n documentsSelectWorkerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final RealImageLoader imageLoader;
    public final NavigationStateManager navigationStateManager;
    public final PermissionRequestWorker_Factory_Impl permissionRequestWorker;
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentStepStateManager(DocumentWorkflow.Input input, SavedStateHandle savedStateHandle, RealImageLoader realImageLoader, Context context, DocumentCameraWorker documentCameraWorker, n nVar, Pool pool, o0 o0Var, FormBody.Builder builder, MatchResult.Destructured destructured, TextSetter textSetter, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger, PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl) {
        super(input, savedStateHandle);
        WorkflowState reviewCaptures;
        input.getClass();
        savedStateHandle.getClass();
        realImageLoader.getClass();
        context.getClass();
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
        permissionRequestWorker_Factory_Impl.getClass();
        this.imageLoader = realImageLoader;
        this.applicationContext = context;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = nVar;
        this.documentCreateWorkerFactory = pool;
        this.documentLoadWorker = o0Var;
        this.documentFileUploadWorkerFactory = builder;
        this.documentFileDeleteWorkerFactory = destructured;
        this.documentSubmitWorker = textSetter;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker_Factory_Impl;
        Continuation continuation = null;
        if (((SubtreeManager) this.lastChild).getState() == null) {
            SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
            DocumentWorkflow.Input input2 = (DocumentWorkflow.Input) ((StateFlowImpl) this.firstChild).getValue();
            input2.getClass();
            DocumentWorkflow.StartPage startPage = input2.startPage;
            if (Intrinsics.areEqual(startPage, DocumentWorkflow.StartPage.Prompt.INSTANCE)) {
                reviewCaptures = new DocumentWorkflow.State.Start(input2.documentId);
            } else {
                if (!(startPage instanceof DocumentWorkflow.StartPage.Review)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
                reviewCaptures = new DocumentWorkflow.State.ReviewCaptures(EmptyList.INSTANCE, ((DocumentWorkflow.StartPage.Review) startPage).documentId, null, true, null, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            }
            subtreeManager.updateState(reviewCaptures);
        }
        SubtreeManager subtreeManager2 = (SubtreeManager) this.lastChild;
        DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda19 = new DocumentStepStateManager$$ExternalSyntheticLambda19(this, 10);
        subtreeManager2.children = documentStepStateManager$$ExternalSyntheticLambda19;
        documentStepStateManager$$ExternalSyntheticLambda19.invoke(subtreeManager2.getState());
        JobKt.launch$default((ContextScope) this.parent, Dispatchers.Unconfined, null, new HazeSourceNode$launchPreDraw$1(this, continuation, 12), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$handleState(final DocumentStepStateManager documentStepStateManager, DocumentWorkflow.Input input, final DocumentWorkflow.State state) {
        int i;
        DocumentPages documentPages;
        int i2;
        DocumentWorkflow.State.UploadState uploadState;
        SubtreeManager subtreeManager;
        NavigationStateManager navigationStateManager;
        String str;
        int i3;
        DocumentPages documentPages2;
        DocumentWorkflow.Screen loadingAnimation;
        UiStepBottomSheet uiStepBottomSheet;
        DocumentWorkflow.Screen reviewCaptures;
        String str2;
        UiStepBottomSheet uiStepBottomSheet2;
        String str3;
        UiStepBottomSheet uiStepBottomSheet3;
        String str4;
        DocumentsSelectWorker documentsSelectWorker;
        PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl = documentStepStateManager.permissionRequestWorker;
        NavigationStateManager navigationStateManager2 = documentStepStateManager.navigationStateManager;
        Context context = documentStepStateManager.applicationContext;
        boolean z = input.backStepEnabled;
        String str5 = input.permissionsRationale;
        String str6 = input.permissionsTitle;
        int i4 = input.documentFileLimit;
        String str7 = input.sessionToken;
        DocumentPages documentPages3 = input.pages;
        NavigationStateManager.setState$default(navigationStateManager2, z, input.cancelButtonEnabled, !(state instanceof DocumentWorkflow.State.UploadDocument), 8);
        DocumentWorkflow.State.CaptureState captureState = state.getCaptureState();
        SubtreeManager subtreeManager2 = (SubtreeManager) documentStepStateManager.lastChild;
        int ordinal = captureState.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = i4;
            documentPages = documentPages3;
            i2 = 6;
        } else {
            if (ordinal == 2) {
                i = i4;
                documentPages = documentPages3;
                i2 = 6;
                subtreeManager2.runningWorker(documentStepStateManager.documentCameraWorker, new HCaptcha$$ExternalSyntheticLambda1(12, documentStepStateManager, input));
                uploadState = state.getUploadState();
                int i5 = 7;
                Continuation continuation = null;
                if (Intrinsics.areEqual(uploadState, DocumentWorkflow.State.UploadState.CreateDocument.INSTANCE)) {
                    int i6 = i2;
                    int i7 = i;
                    if (uploadState instanceof DocumentWorkflow.State.UploadState.UploadFiles) {
                        List documents = state.getDocuments();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : documents) {
                            if (obj instanceof DocumentFile.Local) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            subtreeManager2.runningSideEffect("upload_complete", new SessionWorker$doWork$2$1(documentStepStateManager, (DocumentWorkflow.State.UploadState.UploadFiles) uploadState, continuation, 13));
                        } else {
                            char c = 3;
                            for (DocumentFile.Local local : CollectionsKt.take(arrayList, 3)) {
                                FormBody.Builder builder = documentStepStateManager.documentFileUploadWorkerFactory;
                                DocumentWorkflow.State.UploadState.UploadFiles uploadFiles = (DocumentWorkflow.State.UploadState.UploadFiles) uploadState;
                                String str8 = uploadFiles.documentId;
                                boolean z2 = i7 == 1;
                                builder.getClass();
                                str7.getClass();
                                str8.getClass();
                                local.getClass();
                                int i8 = i7;
                                DocumentFileUploadWorker documentFileUploadWorker = new DocumentFileUploadWorker(str7, (DocumentService) builder.names, str8, local, (RealFileHelper) builder.values, z2);
                                String str9 = local.absoluteFilePath;
                                str9.getClass();
                                NamedWorkflowWorker namedWorkflowWorker = new NamedWorkflowWorker(str9, documentFileUploadWorker);
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                subtreeManager3.runningWorker(namedWorkflowWorker, new OpenSourceKt$$ExternalSyntheticLambda9(documentStepStateManager, uploadFiles, local, input, 20));
                                uploadState = uploadState;
                                subtreeManager2 = subtreeManager3;
                                str6 = str6;
                                navigationStateManager2 = navigationStateManager2;
                                c = 3;
                                i6 = 6;
                                i7 = i8;
                            }
                        }
                        subtreeManager = subtreeManager2;
                        navigationStateManager = navigationStateManager2;
                        str = str6;
                        i3 = i7;
                        documentPages2 = documentPages;
                    } else {
                        subtreeManager = subtreeManager2;
                        navigationStateManager = navigationStateManager2;
                        str = str6;
                        i3 = i7;
                        documentPages2 = documentPages;
                        if (uploadState instanceof DocumentWorkflow.State.UploadState.DeleteFiles) {
                            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                                DocumentWorkflow.State.ReviewCaptures reviewCaptures2 = (DocumentWorkflow.State.ReviewCaptures) state;
                                DocumentFile documentFile = reviewCaptures2.documentFileToDelete;
                                DocumentFile.Remote remote = documentFile instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFile : null;
                                if (remote != null) {
                                    MatchResult.Destructured destructured = documentStepStateManager.documentFileDeleteWorkerFactory;
                                    String str10 = reviewCaptures2.documentId;
                                    destructured.getClass();
                                    str7.getClass();
                                    str10.getClass();
                                    subtreeManager.runningWorker(new DocumentFileDeleteWorker(str7, (DocumentService) destructured.match, remote), new SelfieWorkflow$$ExternalSyntheticLambda38(i5, documentStepStateManager, remote, (DocumentWorkflow.State.UploadState.DeleteFiles) uploadState));
                                }
                            }
                        } else if (!(uploadState instanceof DocumentWorkflow.State.UploadState.ReadyToSubmit)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                    }
                } else if (state.getDocumentId() != null) {
                    subtreeManager = subtreeManager2;
                    navigationStateManager = navigationStateManager2;
                    str = str6;
                    i3 = i;
                    documentPages2 = documentPages;
                } else {
                    Pool pool = documentStepStateManager.documentCreateWorkerFactory;
                    String str11 = input.kind;
                    String str12 = input.fieldKeyDocument;
                    pool.getClass();
                    str7.getClass();
                    str11.getClass();
                    str12.getClass();
                    int i9 = i;
                    subtreeManager2.runningWorker(new DocumentCreateWorker(str7, (DocumentService) pool.pool, str11, i9, str12), new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, i2));
                    subtreeManager = subtreeManager2;
                    navigationStateManager = navigationStateManager2;
                    str = str6;
                    i3 = i9;
                    documentPages2 = documentPages;
                }
                DocumentUtilsKt.logState(documentStepStateManager.externalEventLogger, documentStepStateManager.trackingEventsLogger, input, state);
                int i10 = 5;
                if (state instanceof DocumentWorkflow.State.Start) {
                    int i11 = 1;
                    if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                        DocumentWorkflow.State.ReviewCaptures reviewCaptures3 = (DocumentWorkflow.State.ReviewCaptures) state;
                        List list = reviewCaptures3.documents;
                        String str13 = reviewCaptures3.documentId;
                        if (reviewCaptures3.shouldLoadDocuments) {
                            o0 o0Var = documentStepStateManager.documentLoadWorker;
                            o0Var.getClass();
                            str7.getClass();
                            str13.getClass();
                            subtreeManager.runningWorker(new DocumentLoadWorker(str7, (DocumentService) o0Var.a, str13), new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, i11));
                        }
                        if (reviewCaptures3.captureState == DocumentWorkflow.State.CaptureState.CheckCameraPermissions) {
                            Permission permission = Permission.Camera;
                            String str14 = str == null ? "" : str;
                            if (str5 == null) {
                                String string2 = context.getString(R.string.pi2_document_camera_permission_rationale);
                                string2.getClass();
                                str3 = string2;
                            } else {
                                str3 = str5;
                            }
                            String string3 = context.getString(R.string.pi2_document_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                            string3.getClass();
                            final int i12 = 2;
                            subtreeManager.runningWorker(permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission, false, str14, str3, string3, input.permissionsModalPositiveButton, input.permissionsModalNegativeButton, null, null, null, input.styles)), new Function1(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda2
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i13 = i12;
                                    DocumentWorkflow.State state2 = state;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i13) {
                                        case 0:
                                            DocumentFile.Remote remote2 = (DocumentFile.Remote) obj2;
                                            remote2.getClass();
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, new DocumentWorkflow.Event.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state2).documentId, remote2));
                                            break;
                                        case 1:
                                            SubtreeManager subtreeManager4 = (SubtreeManager) documentStepStateManager2.lastChild;
                                            PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj2;
                                            output.getClass();
                                            int ordinal2 = output.permissionState.result.ordinal();
                                            if (ordinal2 == 0) {
                                                DocumentCameraWorker documentCameraWorker = documentStepStateManager2.documentCameraWorker;
                                                String string4 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                                string4.getClass();
                                                subtreeManager4.updateState(documentCameraWorker.launchTakePicture(string4) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                            } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                subtreeManager4.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                            }
                                            break;
                                        case 2:
                                            SubtreeManager subtreeManager5 = (SubtreeManager) documentStepStateManager2.lastChild;
                                            PermissionRequestWorker.Output output2 = (PermissionRequestWorker.Output) obj2;
                                            output2.getClass();
                                            int ordinal3 = output2.permissionState.result.ordinal();
                                            if (ordinal3 == 0) {
                                                DocumentCameraWorker documentCameraWorker2 = documentStepStateManager2.documentCameraWorker;
                                                String string5 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                                string5.getClass();
                                                subtreeManager5.updateState(documentCameraWorker2.launchTakePicture(string5) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                            } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                subtreeManager5.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                            }
                                            break;
                                        default:
                                            SubtreeManager subtreeManager6 = (SubtreeManager) documentStepStateManager2.lastChild;
                                            PermissionRequestWorker.Output output3 = (PermissionRequestWorker.Output) obj2;
                                            output3.getClass();
                                            int ordinal4 = output3.permissionState.result.ordinal();
                                            if (ordinal4 == 0) {
                                                DocumentCameraWorker documentCameraWorker3 = documentStepStateManager2.documentCameraWorker;
                                                String string6 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                                string6.getClass();
                                                subtreeManager6.updateState(documentCameraWorker3.launchTakePicture(string6) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                            } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                subtreeManager6.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        RealImageLoader realImageLoader = documentStepStateManager.imageLoader;
                        String str15 = input.promptTitle;
                        String str16 = input.promptDescription;
                        String str17 = input.disclaimer;
                        String str18 = input.submitButtonText;
                        List list2 = reviewCaptures3.documents;
                        StepStyles.DocumentStepStyle documentStepStyle = input.styles;
                        NavigationState navigationState = navigationStateManager.getNavigationState();
                        boolean z3 = reviewCaptures3.shouldLoadDocuments;
                        boolean z4 = list.size() < i3;
                        boolean z5 = !list.isEmpty() && Intrinsics.areEqual(reviewCaptures3.uploadState, new DocumentWorkflow.State.UploadState.ReadyToSubmit(str13));
                        String str19 = reviewCaptures3.error;
                        if (reviewCaptures3.shouldShowUploadOptionsDialog) {
                            UploadOptionsDialog uploadOptionsDialog = documentPages2.uploadOptionsDialog;
                            UiComponentScreen uiComponentScreen = NestedUiStepKt.to(uploadOptionsDialog);
                            List componentNamesToActions = documentStepStateManager.componentNamesToActions(uploadOptionsDialog);
                            final int i13 = 12;
                            Function0 function0 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i14 = i13;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i14) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            String str20 = uploadOptionsDialog.cancelButton;
                            componentNamesToActions.getClass();
                            uiStepBottomSheet2 = new UiStepBottomSheet(uiComponentScreen, componentNamesToActions, function0, str20, true);
                        } else {
                            uiStepBottomSheet2 = null;
                        }
                        final int i14 = 13;
                        final int i15 = 14;
                        final int i16 = 15;
                        final int i17 = 8;
                        final int i18 = 0;
                        final int i19 = 16;
                        final int i20 = 17;
                        final int i21 = 18;
                        loadingAnimation = new DocumentWorkflow.Screen.ReviewCaptures(realImageLoader, str15, str16, str17, str18, list2, navigationState, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i14;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i15;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i16;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i17;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new Function1(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda2
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i132 = i18;
                                DocumentWorkflow.State state2 = state;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i132) {
                                    case 0:
                                        DocumentFile.Remote remote2 = (DocumentFile.Remote) obj2;
                                        remote2.getClass();
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, new DocumentWorkflow.Event.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state2).documentId, remote2));
                                        break;
                                    case 1:
                                        SubtreeManager subtreeManager4 = (SubtreeManager) documentStepStateManager2.lastChild;
                                        PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj2;
                                        output.getClass();
                                        int ordinal2 = output.permissionState.result.ordinal();
                                        if (ordinal2 == 0) {
                                            DocumentCameraWorker documentCameraWorker = documentStepStateManager2.documentCameraWorker;
                                            String string4 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                            string4.getClass();
                                            subtreeManager4.updateState(documentCameraWorker.launchTakePicture(string4) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                        } else if (ordinal2 != 1 && ordinal2 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            subtreeManager4.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                        }
                                        break;
                                    case 2:
                                        SubtreeManager subtreeManager5 = (SubtreeManager) documentStepStateManager2.lastChild;
                                        PermissionRequestWorker.Output output2 = (PermissionRequestWorker.Output) obj2;
                                        output2.getClass();
                                        int ordinal3 = output2.permissionState.result.ordinal();
                                        if (ordinal3 == 0) {
                                            DocumentCameraWorker documentCameraWorker2 = documentStepStateManager2.documentCameraWorker;
                                            String string5 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                            string5.getClass();
                                            subtreeManager5.updateState(documentCameraWorker2.launchTakePicture(string5) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                        } else if (ordinal3 != 1 && ordinal3 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            subtreeManager5.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                        }
                                        break;
                                    default:
                                        SubtreeManager subtreeManager6 = (SubtreeManager) documentStepStateManager2.lastChild;
                                        PermissionRequestWorker.Output output3 = (PermissionRequestWorker.Output) obj2;
                                        output3.getClass();
                                        int ordinal4 = output3.permissionState.result.ordinal();
                                        if (ordinal4 == 0) {
                                            DocumentCameraWorker documentCameraWorker3 = documentStepStateManager2.documentCameraWorker;
                                            String string6 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                            string6.getClass();
                                            subtreeManager6.updateState(documentCameraWorker3.launchTakePicture(string6) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                        } else if (ordinal4 != 1 && ordinal4 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            subtreeManager6.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new StateFlowsKt$$ExternalSyntheticLambda2(5, documentStepStateManager, state), new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i19;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i20;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, z3, z4, z5, str19, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                            public final /* synthetic */ DocumentStepStateManager f$0;

                            {
                                this.f$0 = documentStepStateManager;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i142 = i21;
                                DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                switch (i142) {
                                    case 0:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 1:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 2:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 3:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 4:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 5:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 6:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 7:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 8:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                        break;
                                    case 9:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 10:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 11:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 12:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    case 13:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                    case 14:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                        break;
                                    case 15:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                        break;
                                    case 16:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                        break;
                                    case 17:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                        break;
                                    case 18:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                        break;
                                    case 19:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                        break;
                                    default:
                                        documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, documentStepStyle, uiStepBottomSheet2);
                    } else {
                        int i22 = 12;
                        if (state instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) {
                            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) state;
                            String str21 = reviewCapturesWithoutDocumentId.documentId;
                            if (str21 != null) {
                                subtreeManager.runningSideEffect(str21, new SessionWorker$doWork$2$1(documentStepStateManager, str21, null, i22));
                            }
                            if (reviewCapturesWithoutDocumentId.captureState == DocumentWorkflow.State.CaptureState.CheckCameraPermissions) {
                                Permission permission2 = Permission.Camera;
                                String str22 = str == null ? "" : str;
                                if (str5 == null) {
                                    String string4 = context.getString(R.string.pi2_document_camera_permission_rationale);
                                    string4.getClass();
                                    str2 = string4;
                                } else {
                                    str2 = str5;
                                }
                                String string5 = context.getString(R.string.pi2_document_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                                string5.getClass();
                                final int i23 = 3;
                                subtreeManager.runningWorker(permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission2, false, str22, str2, string5, input.permissionsModalPositiveButton, input.permissionsModalNegativeButton, null, null, null, input.styles)), new Function1(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda2
                                    public final /* synthetic */ DocumentStepStateManager f$0;

                                    {
                                        this.f$0 = documentStepStateManager;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i132 = i23;
                                        DocumentWorkflow.State state2 = state;
                                        DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                        switch (i132) {
                                            case 0:
                                                DocumentFile.Remote remote2 = (DocumentFile.Remote) obj2;
                                                remote2.getClass();
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, new DocumentWorkflow.Event.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state2).documentId, remote2));
                                                break;
                                            case 1:
                                                SubtreeManager subtreeManager4 = (SubtreeManager) documentStepStateManager2.lastChild;
                                                PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj2;
                                                output.getClass();
                                                int ordinal2 = output.permissionState.result.ordinal();
                                                if (ordinal2 == 0) {
                                                    DocumentCameraWorker documentCameraWorker = documentStepStateManager2.documentCameraWorker;
                                                    String string42 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                                    string42.getClass();
                                                    subtreeManager4.updateState(documentCameraWorker.launchTakePicture(string42) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                                } else if (ordinal2 != 1 && ordinal2 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    subtreeManager4.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                                }
                                                break;
                                            case 2:
                                                SubtreeManager subtreeManager5 = (SubtreeManager) documentStepStateManager2.lastChild;
                                                PermissionRequestWorker.Output output2 = (PermissionRequestWorker.Output) obj2;
                                                output2.getClass();
                                                int ordinal3 = output2.permissionState.result.ordinal();
                                                if (ordinal3 == 0) {
                                                    DocumentCameraWorker documentCameraWorker2 = documentStepStateManager2.documentCameraWorker;
                                                    String string52 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                                    string52.getClass();
                                                    subtreeManager5.updateState(documentCameraWorker2.launchTakePicture(string52) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                                } else if (ordinal3 != 1 && ordinal3 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    subtreeManager5.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                                }
                                                break;
                                            default:
                                                SubtreeManager subtreeManager6 = (SubtreeManager) documentStepStateManager2.lastChild;
                                                PermissionRequestWorker.Output output3 = (PermissionRequestWorker.Output) obj2;
                                                output3.getClass();
                                                int ordinal4 = output3.permissionState.result.ordinal();
                                                if (ordinal4 == 0) {
                                                    DocumentCameraWorker documentCameraWorker3 = documentStepStateManager2.documentCameraWorker;
                                                    String string6 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                                    string6.getClass();
                                                    subtreeManager6.updateState(documentCameraWorker3.launchTakePicture(string6) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                                } else if (ordinal4 != 1 && ordinal4 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    break;
                                                } else {
                                                    subtreeManager6.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            RealImageLoader realImageLoader2 = documentStepStateManager.imageLoader;
                            String str23 = input.promptTitle;
                            String str24 = input.promptDescription;
                            String str25 = input.disclaimer;
                            String str26 = input.submitButtonText;
                            List list3 = reviewCapturesWithoutDocumentId.documents;
                            StepStyles.DocumentStepStyle documentStepStyle2 = input.styles;
                            NavigationState navigationState2 = navigationStateManager.getNavigationState();
                            boolean z6 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                            boolean z7 = reviewCapturesWithoutDocumentId.documents.size() < i3;
                            String str27 = reviewCapturesWithoutDocumentId.error;
                            if (reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog) {
                                UploadOptionsDialog uploadOptionsDialog2 = documentPages2.uploadOptionsDialog;
                                UiComponentScreen uiComponentScreen2 = NestedUiStepKt.to(uploadOptionsDialog2);
                                List componentNamesToActions2 = documentStepStateManager.componentNamesToActions(uploadOptionsDialog2);
                                final int i24 = 19;
                                Function0 function02 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                    public final /* synthetic */ DocumentStepStateManager f$0;

                                    {
                                        this.f$0 = documentStepStateManager;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i24;
                                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                        DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                        switch (i142) {
                                            case 0:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                                break;
                                            case 1:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                                break;
                                            case 2:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                                break;
                                            case 3:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                                break;
                                            case 4:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                                break;
                                            case 5:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                                break;
                                            case 6:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                                break;
                                            case 7:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                                break;
                                            case 8:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                                break;
                                            case 9:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                                break;
                                            case 10:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                                break;
                                            case 11:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                                break;
                                            case 12:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                                break;
                                            case 13:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                                break;
                                            case 14:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                                break;
                                            case 15:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                                break;
                                            case 16:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                                break;
                                            case 17:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                                break;
                                            case 18:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                                break;
                                            case 19:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                                break;
                                            default:
                                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                String str28 = uploadOptionsDialog2.cancelButton;
                                componentNamesToActions2.getClass();
                                uiStepBottomSheet = new UiStepBottomSheet(uiComponentScreen2, componentNamesToActions2, function02, str28, true);
                            } else {
                                uiStepBottomSheet = null;
                            }
                            final int i25 = 20;
                            Function0 function03 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i25;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i26 = 1;
                            Function0 function04 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i26;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i27 = 3;
                            Function0 function05 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i27;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i28 = 4;
                            final int i29 = 5;
                            final int i30 = 6;
                            final int i31 = 7;
                            reviewCaptures = new DocumentWorkflow.Screen.ReviewCaptures(realImageLoader2, str23, str24, str25, str26, list3, navigationState2, function03, function04, function05, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i28;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, new DocumentWorkflow$$ExternalSyntheticLambda7(i28), new ShimmerThemeKt$$ExternalSyntheticLambda0(12), new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i29;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i30;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, z6, z7, false, str27, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i31;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, documentStepStyle2, uiStepBottomSheet);
                        } else {
                            if (!(state instanceof DocumentWorkflow.State.UploadDocument)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            TextSetter textSetter = documentStepStateManager.documentSubmitWorker;
                            String str29 = input.inquiryId;
                            String str30 = input.fromStep;
                            String str31 = input.fromComponent;
                            List list4 = ((DocumentWorkflow.State.UploadDocument) state).documents;
                            textSetter.getClass();
                            str7.getClass();
                            str29.getClass();
                            str30.getClass();
                            str31.getClass();
                            list4.getClass();
                            subtreeManager.runningWorker(new DocumentSubmitWorker(str7, (DocumentService) textSetter.textView, str29, str30, str31, (FallbackModeManager) textSetter.textSwitcher, (DataCollector) textSetter.scannerText, list4), new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, 0));
                            NavigationStateManager navigationStateManager3 = navigationStateManager;
                            NavigationStateManager.setState$default(navigationStateManager3, false, false, false, 12);
                            String str32 = input.pendingTitle;
                            String str33 = input.pendingDescription;
                            StepStyles.DocumentStepStyle documentStepStyle3 = input.styles;
                            NextStep.Document.AssetConfig.PendingPage pendingPage = input.assetConfig.getPendingPage();
                            NavigationState navigationState3 = navigationStateManager3.getNavigationState();
                            PendingPageTextPosition pendingPageTextPosition = input.pendingPageTextVerticalPosition;
                            final int i32 = 9;
                            Function0 function06 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i32;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i33 = 10;
                            loadingAnimation = new DocumentWorkflow.Screen.LoadingAnimation(str32, str33, navigationState3, function06, new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                                public final /* synthetic */ DocumentStepStateManager f$0;

                                {
                                    this.f$0 = documentStepStateManager;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i142 = i33;
                                    DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                                    DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                                    DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                                    DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                                    DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                                    DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                                    DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                                    DocumentStepStateManager documentStepStateManager2 = this.f$0;
                                    switch (i142) {
                                        case 0:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 1:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 2:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 3:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 4:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 5:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 6:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 7:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 8:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                            break;
                                        case 9:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 10:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 11:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 12:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        case 13:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                        case 14:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                            break;
                                        case 15:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                            break;
                                        case 16:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                            break;
                                        case 17:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                            break;
                                        case 18:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                            break;
                                        case 19:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                            break;
                                        default:
                                            documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, documentStepStyle3, pendingPage, pendingPageTextPosition);
                        }
                    }
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) documentStepStateManager.next;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, loadingAnimation);
                }
                DocumentStartPage documentStartPage = documentPages2.documentStartPage;
                UploadOptionsDialog uploadOptionsDialog3 = documentPages2.uploadOptionsDialog;
                UiComponentScreen uiComponentScreen3 = NestedUiStepKt.to(documentStartPage);
                DocumentStartPage documentStartPage2 = documentPages2.documentStartPage;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str34 = documentStartPage2.selectDocumentButton;
                final int i34 = 2;
                DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda19 = new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, i34);
                if (str34 != null) {
                    linkedHashMap.put(str34, documentStepStateManager$$ExternalSyntheticLambda19);
                }
                String str35 = documentStartPage2.selectPhotoButton;
                DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda192 = new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, 3);
                if (str35 != null) {
                    linkedHashMap.put(str35, documentStepStateManager$$ExternalSyntheticLambda192);
                }
                String str36 = documentStartPage2.takePhotoButton;
                DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda193 = new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, 4);
                if (str36 != null) {
                    linkedHashMap.put(str36, documentStepStateManager$$ExternalSyntheticLambda193);
                }
                String str37 = documentStartPage2.launchUploadOptionsButton;
                DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda194 = new DocumentStepStateManager$$ExternalSyntheticLambda19(documentStepStateManager, i10);
                if (str37 != null) {
                    linkedHashMap.put(str37, documentStepStateManager$$ExternalSyntheticLambda194);
                }
                List list5 = MapsKt___MapsKt.toList(linkedHashMap);
                NavigationState navigationState4 = navigationStateManager.getNavigationState();
                final int i35 = 0;
                Function0 function07 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                    public final /* synthetic */ DocumentStepStateManager f$0;

                    {
                        this.f$0 = documentStepStateManager;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i35;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        DocumentStepStateManager documentStepStateManager2 = this.f$0;
                        switch (i142) {
                            case 0:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                break;
                            case 1:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                break;
                            case 2:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 3:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                break;
                            case 4:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                break;
                            case 5:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 6:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                break;
                            case 7:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                break;
                            case 8:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                break;
                            case 9:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 10:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 11:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                break;
                            case 12:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                break;
                            case 13:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                break;
                            case 14:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                break;
                            case 15:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                break;
                            case 16:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 17:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                break;
                            case 18:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                break;
                            case 19:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                break;
                            default:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                Function0 function08 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                    public final /* synthetic */ DocumentStepStateManager f$0;

                    {
                        this.f$0 = documentStepStateManager;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i142 = i34;
                        DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                        DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                        DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                        DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                        DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                        DocumentStepStateManager documentStepStateManager2 = this.f$0;
                        switch (i142) {
                            case 0:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                break;
                            case 1:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                break;
                            case 2:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 3:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                break;
                            case 4:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                break;
                            case 5:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 6:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                break;
                            case 7:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                break;
                            case 8:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                break;
                            case 9:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 10:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 11:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                break;
                            case 12:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                break;
                            case 13:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                break;
                            case 14:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                break;
                            case 15:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                break;
                            case 16:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                break;
                            case 17:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                break;
                            case 18:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                break;
                            case 19:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                break;
                            default:
                                documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                DocumentWorkflow.State.Start start = (DocumentWorkflow.State.Start) state;
                if (start.shouldShowUploadOptionsDialog) {
                    UiComponentScreen uiComponentScreen4 = NestedUiStepKt.to(uploadOptionsDialog3);
                    List componentNamesToActions3 = documentStepStateManager.componentNamesToActions(uploadOptionsDialog3);
                    final int i36 = 11;
                    Function0 function09 = new Function0(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda0
                        public final /* synthetic */ DocumentStepStateManager f$0;

                        {
                            this.f$0 = documentStepStateManager;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i142 = i36;
                            DocumentWorkflow.Event.OpenUploadOptions openUploadOptions = DocumentWorkflow.Event.OpenUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
                            DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
                            DocumentWorkflow.Event.DismissError dismissError = DocumentWorkflow.Event.DismissError.INSTANCE;
                            DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
                            DocumentWorkflow.Event.Back back = DocumentWorkflow.Event.Back.INSTANCE;
                            DocumentWorkflow.Event.CloseUploadOptions closeUploadOptions = DocumentWorkflow.Event.CloseUploadOptions.INSTANCE;
                            DocumentWorkflow.Event.Cancel cancel = DocumentWorkflow.Event.Cancel.INSTANCE;
                            DocumentStepStateManager documentStepStateManager2 = this.f$0;
                            switch (i142) {
                                case 0:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                    break;
                                case 1:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                    break;
                                case 2:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                    break;
                                case 3:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                    break;
                                case 4:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                    break;
                                case 5:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                    break;
                                case 6:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                    break;
                                case 7:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                    break;
                                case 8:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, openUploadOptions);
                                    break;
                                case 9:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                    break;
                                case 10:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                    break;
                                case 11:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                    break;
                                case 12:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                    break;
                                case 13:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                    break;
                                case 14:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectPhotoFromLibrary);
                                    break;
                                case 15:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, takePhoto);
                                    break;
                                case 16:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, cancel);
                                    break;
                                case 17:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, back);
                                    break;
                                case 18:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, dismissError);
                                    break;
                                case 19:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, closeUploadOptions);
                                    break;
                                default:
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, selectDocument);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    String str38 = uploadOptionsDialog3.cancelButton;
                    componentNamesToActions3.getClass();
                    uiStepBottomSheet3 = new UiStepBottomSheet(uiComponentScreen4, componentNamesToActions3, function09, str38, true);
                } else {
                    uiStepBottomSheet3 = null;
                }
                reviewCaptures = new DocumentInstructionsView(uiComponentScreen3, list5, navigationState4, function07, function08, uiStepBottomSheet3);
                if (start.captureState == DocumentWorkflow.State.CaptureState.CheckCameraPermissions) {
                    Permission permission3 = Permission.Camera;
                    String str39 = str == null ? "" : str;
                    if (str5 == null) {
                        String string6 = context.getString(R.string.pi2_document_camera_permission_rationale);
                        string6.getClass();
                        str4 = string6;
                    } else {
                        str4 = str5;
                    }
                    String string7 = context.getString(R.string.pi2_document_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                    string7.getClass();
                    final int i37 = 1;
                    subtreeManager.runningWorker(permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission3, false, str39, str4, string7, input.permissionsModalPositiveButton, input.permissionsModalNegativeButton, null, null, null, input.styles)), new Function1(documentStepStateManager) { // from class: com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$$ExternalSyntheticLambda2
                        public final /* synthetic */ DocumentStepStateManager f$0;

                        {
                            this.f$0 = documentStepStateManager;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i132 = i37;
                            DocumentWorkflow.State state2 = state;
                            DocumentStepStateManager documentStepStateManager2 = this.f$0;
                            switch (i132) {
                                case 0:
                                    DocumentFile.Remote remote2 = (DocumentFile.Remote) obj2;
                                    remote2.getClass();
                                    documentStepStateManager2.onEvent((SubtreeManager) documentStepStateManager2.lastChild, new DocumentWorkflow.Event.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state2).documentId, remote2));
                                    break;
                                case 1:
                                    SubtreeManager subtreeManager4 = (SubtreeManager) documentStepStateManager2.lastChild;
                                    PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj2;
                                    output.getClass();
                                    int ordinal2 = output.permissionState.result.ordinal();
                                    if (ordinal2 == 0) {
                                        DocumentCameraWorker documentCameraWorker = documentStepStateManager2.documentCameraWorker;
                                        String string42 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                        string42.getClass();
                                        subtreeManager4.updateState(documentCameraWorker.launchTakePicture(string42) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                    } else if (ordinal2 != 1 && ordinal2 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        subtreeManager4.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                    }
                                    break;
                                case 2:
                                    SubtreeManager subtreeManager5 = (SubtreeManager) documentStepStateManager2.lastChild;
                                    PermissionRequestWorker.Output output2 = (PermissionRequestWorker.Output) obj2;
                                    output2.getClass();
                                    int ordinal3 = output2.permissionState.result.ordinal();
                                    if (ordinal3 == 0) {
                                        DocumentCameraWorker documentCameraWorker2 = documentStepStateManager2.documentCameraWorker;
                                        String string52 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                        string52.getClass();
                                        subtreeManager5.updateState(documentCameraWorker2.launchTakePicture(string52) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                    } else if (ordinal3 != 1 && ordinal3 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        subtreeManager5.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                    }
                                    break;
                                default:
                                    SubtreeManager subtreeManager6 = (SubtreeManager) documentStepStateManager2.lastChild;
                                    PermissionRequestWorker.Output output3 = (PermissionRequestWorker.Output) obj2;
                                    output3.getClass();
                                    int ordinal4 = output3.permissionState.result.ordinal();
                                    if (ordinal4 == 0) {
                                        DocumentCameraWorker documentCameraWorker3 = documentStepStateManager2.documentCameraWorker;
                                        String string62 = documentStepStateManager2.applicationContext.getString(R.string.pi2_camera_error);
                                        string62.getClass();
                                        subtreeManager6.updateState(documentCameraWorker3.launchTakePicture(string62) ? state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CameraRunning) : state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                    } else if (ordinal4 != 1 && ordinal4 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        subtreeManager6.updateState(state2.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                loadingAnimation = reviewCaptures;
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) documentStepStateManager.next;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, loadingAnimation);
            }
            if (ordinal != 3 && ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            DocumentWorkflow.State.CaptureState captureState2 = state.getCaptureState();
            DocumentWorkflow.State.CaptureState captureState3 = DocumentWorkflow.State.CaptureState.SelectFileFromDocuments;
            n nVar = documentStepStateManager.documentsSelectWorkerFactory;
            if (captureState2 == captureState3) {
                i = i4;
                documentPages = documentPages3;
                documentsSelectWorker = new DocumentsSelectWorker("DocumentPicker", (Context) nVar.c, (SdkFilesManager) nVar.d, new DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0(nVar, 0));
            } else {
                i = i4;
                documentPages = documentPages3;
                documentsSelectWorker = new DocumentsSelectWorker("PhotoLibraryPicker", (Context) nVar.c, (SdkFilesManager) nVar.d, new DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0(nVar, 1));
            }
            i2 = 6;
            subtreeManager2.runningWorker(documentsSelectWorker, new SelfieWorkflow$$ExternalSyntheticLambda38(i2, documentStepStateManager, input, state));
        }
        uploadState = state.getUploadState();
        int i52 = 7;
        Continuation continuation2 = null;
        if (Intrinsics.areEqual(uploadState, DocumentWorkflow.State.UploadState.CreateDocument.INSTANCE)) {
        }
        DocumentUtilsKt.logState(documentStepStateManager.externalEventLogger, documentStepStateManager.trackingEventsLogger, input, state);
        int i102 = 5;
        if (state instanceof DocumentWorkflow.State.Start) {
        }
        loadingAnimation = reviewCaptures;
        StateFlowImpl stateFlowImpl22 = (StateFlowImpl) documentStepStateManager.next;
        stateFlowImpl22.getClass();
        stateFlowImpl22.updateState(null, loadingAnimation);
    }

    public final List componentNamesToActions(UploadOptionsDialog uploadOptionsDialog) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = uploadOptionsDialog.selectDocumentButton;
        DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda19 = new DocumentStepStateManager$$ExternalSyntheticLambda19(this, 7);
        if (str != null) {
            linkedHashMap.put(str, documentStepStateManager$$ExternalSyntheticLambda19);
        }
        String str2 = uploadOptionsDialog.selectPhotoButton;
        DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda192 = new DocumentStepStateManager$$ExternalSyntheticLambda19(this, 8);
        if (str2 != null) {
            linkedHashMap.put(str2, documentStepStateManager$$ExternalSyntheticLambda192);
        }
        String str3 = uploadOptionsDialog.takePhotoButton;
        DocumentStepStateManager$$ExternalSyntheticLambda19 documentStepStateManager$$ExternalSyntheticLambda193 = new DocumentStepStateManager$$ExternalSyntheticLambda19(this, 9);
        if (str3 != null) {
            linkedHashMap.put(str3, documentStepStateManager$$ExternalSyntheticLambda193);
        }
        return MapsKt___MapsKt.toList(linkedHashMap);
    }

    public final void onEvent(SubtreeManager subtreeManager, DocumentWorkflow.Event event) {
        DocumentWorkflow.State state = (DocumentWorkflow.State) subtreeManager.getState();
        if (state == null) {
            return;
        }
        if (event.equals(DocumentWorkflow.Event.Cancel.INSTANCE)) {
            setOutput(DocumentWorkflow.Output.Canceled.INSTANCE);
            return;
        }
        if (event.equals(DocumentWorkflow.Event.Back.INSTANCE)) {
            setOutput(DocumentWorkflow.Output.Back.INSTANCE);
            return;
        }
        if (event.equals(DocumentWorkflow.Event.SelectDocument.INSTANCE)) {
            subtreeManager.updateState(state.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.SelectFileFromDocuments).copyWithUploadOptions$document_release(false));
            return;
        }
        if (event.equals(DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE)) {
            subtreeManager.updateState(state.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.SelectImageFromPhotoLibrary).copyWithUploadOptions$document_release(false));
            return;
        }
        if (event.equals(DocumentWorkflow.Event.TakePhoto.INSTANCE)) {
            subtreeManager.updateState(state.copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CheckCameraPermissions).copyWithUploadOptions$document_release(false));
            return;
        }
        if (event.equals(DocumentWorkflow.Event.OpenUploadOptions.INSTANCE)) {
            subtreeManager.updateState(state.copyWithUploadOptions$document_release(true));
            return;
        }
        if (event.equals(DocumentWorkflow.Event.CloseUploadOptions.INSTANCE)) {
            subtreeManager.updateState(state.copyWithUploadOptions$document_release(false));
            return;
        }
        if (event instanceof DocumentWorkflow.Event.RemoveDocument) {
            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                DocumentWorkflow.Event.RemoveDocument removeDocument = (DocumentWorkflow.Event.RemoveDocument) event;
                subtreeManager.updateState(DocumentWorkflow.State.copyWithUploadState$document_release$default(state, new DocumentWorkflow.State.UploadState.DeleteFiles(removeDocument.documentId), null, null, removeDocument.document, 6));
                return;
            }
            return;
        }
        if (event.equals(DocumentWorkflow.Event.DismissError.INSTANCE)) {
            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                subtreeManager.updateState(DocumentWorkflow.State.ReviewCaptures.copy$default((DocumentWorkflow.State.ReviewCaptures) state, null, null, null, null, false, 127));
            }
        } else {
            if (!(event instanceof DocumentWorkflow.Event.Submit)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            String str = ((DocumentWorkflow.Event.Submit) event).documentId;
            subtreeManager.updateState(new DocumentWorkflow.State.UploadDocument(state.getDocuments(), str, new DocumentWorkflow.State.UploadState.ReadyToSubmit(str), null));
        }
    }
}
