package com.stripe.android.financialconnections.features.reset;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.kotterknife.Lazy;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.document.network.ProgressRequestBody;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdService;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.selfie.CaptureState;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieService;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okhttp3.MultipartBody;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ResetViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.RESET;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final Lazy linkMoreAccounts;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final NavigationManagerImpl navigationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetViewModel(ResetState resetState, Lazy lazy, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, NavigationManagerImpl navigationManagerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(resetState, nativeAuthFlowCoordinator);
        lazy.getClass();
        nativeAuthFlowCoordinator.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        navigationManagerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.linkMoreAccounts = lazy;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.navigationManager = navigationManagerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        FinancialConnectionsViewModel.onAsync$default(this, ResetViewModel$logErrors$1.INSTANCE, null, new InquiryViewModel.AnonymousClass1(this, null, 11), 2);
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(this, null), new PhoneNumberController$$ExternalSyntheticLambda5(14));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ResetState resetState = (ResetState) obj;
        resetState.getClass();
        return new TopAppBarStateUpdate(PANE, false, zzai.getError(resetState.payload), false, null, 56);
    }

    /* renamed from: com.stripe.android.financialconnections.features.reset.ResetViewModel$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((ResetViewModel) obj, continuation);
                case 1:
                    return new AnonymousClass1((DocumentFileUploadWorker) this.L$0, (String) obj, continuation, 1);
                case 2:
                    return new AnonymousClass1((DocumentFileUploadWorker) this.L$0, (ProgressRequestBody) obj, continuation, 2);
                case 3:
                    return new AnonymousClass1((SubmitVerificationWorker) this.L$0, (List) obj, continuation, 3);
                case 4:
                    return new AnonymousClass1((GovernmentIdState.FinalizeLocalVideoCapture) this.L$0, (SubtreeManager) obj, continuation, 4);
                case 5:
                    return new AnonymousClass1((com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker) this.L$0, (List) obj, continuation, 5);
                case 6:
                    return new AnonymousClass1((SelfieState.FinalizeLocalVideoCapture) this.L$0, (SubtreeManager) obj, continuation, 6);
                default:
                    return new AnonymousClass1((Ref$BooleanRef) this.L$0, (SelfieStepStateManager) obj, continuation, 7);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0169, code lost:
        
            if (r11 == r8) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x0232, code lost:
        
            if (r11 == r0) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
        
            if (r11 == r8) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
        
            if (r11 == r8) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0158, code lost:
        
            if (r11 == r8) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:7:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    ResetViewModel resetViewModel = (ResetViewModel) obj2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Lazy lazy = resetViewModel.linkMoreAccounts;
                        this.label = 1;
                        obj = ((FinancialConnectionsManifestRepositoryImpl) lazy.initializer).postMarkLinkingMoreAccounts(((FinancialConnectionsSheetConfiguration) lazy.value).financialConnectionsSessionClientSecret, this);
                        break;
                    } else if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i2 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = resetViewModel.eventTracker;
                        FinancialConnectionsSessionManifest.Pane pane = ResetViewModel.PANE;
                        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(pane, 25));
                        NavigationManagerImpl.tryNavigateTo$default(resetViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsSessionManifest.nextPane), pane), new PopUpToBehavior.Current(), 4);
                        break;
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) obj;
                    SharedFlowImpl sharedFlowImpl = resetViewModel.nativeAuthFlowCoordinator.flow;
                    this.L$0 = financialConnectionsSessionManifest2;
                    this.label = 2;
                    if (sharedFlowImpl.emit(NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE, this) != coroutineSingletons) {
                        financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = resetViewModel.eventTracker;
                        FinancialConnectionsSessionManifest.Pane pane2 = ResetViewModel.PANE;
                        financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.Click(pane2, 25));
                        NavigationManagerImpl.tryNavigateTo$default(resetViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsSessionManifest.nextPane), pane2), new PopUpToBehavior.Current(), 4);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DocumentFileUploadWorker documentFileUploadWorker = (DocumentFileUploadWorker) this.L$0;
                        this.label = 1;
                        Object deleteFile = documentFileUploadWorker.service.deleteFile(documentFileUploadWorker.sessionToken, (String) obj2, this);
                        if (deleteFile == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    break;
                case 2:
                    DocumentFileUploadWorker documentFileUploadWorker2 = (DocumentFileUploadWorker) this.L$0;
                    DocumentFile.Local local = documentFileUploadWorker2.localDocument;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DocumentService documentService = documentFileUploadWorker2.service;
                        String str = documentFileUploadWorker2.sessionToken;
                        MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData("data[type]", "document-file");
                        MultipartBody.Part createFormData2 = MultipartBody.Part.Companion.createFormData("data[attributes][document-id]", documentFileUploadWorker2.documentId);
                        MultipartBody.Part createFormData3 = MultipartBody.Part.Companion.createFormData("data[attributes][capture-method]", local.captureMethod.f1449type);
                        MultipartBody.Part createFormData4 = MultipartBody.Part.Companion.createFormData("data[attributes][originals][]", local.absoluteFilePath, (ProgressRequestBody) obj2);
                        String name = new File(local.absoluteFilePath).getName();
                        name.getClass();
                        List<MultipartBody.Part> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MultipartBody.Part[]{createFormData, createFormData2, createFormData3, createFormData4, MultipartBody.Part.Companion.createFormData("data[attributes][name]", name)});
                        this.label = 1;
                        Object addFile = documentService.addFile(str, listOf, this);
                        if (addFile == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    break;
                case 3:
                    List<MultipartBody.Part> list = (List) obj2;
                    SubmitVerificationWorker submitVerificationWorker = (SubmitVerificationWorker) this.L$0;
                    String str2 = submitVerificationWorker.sessionToken;
                    FallbackModeManager fallbackModeManager = submitVerificationWorker.fallbackModeManager;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!((RealFallbackModeManager) fallbackModeManager).isFallbackModeActive()) {
                            GovernmentIdService governmentIdService = submitVerificationWorker.service;
                            String str3 = submitVerificationWorker.inquiryId;
                            this.label = 2;
                            obj = governmentIdService.transitionGovernmentVerification(str2, str3, list, this);
                            break;
                        } else {
                            this.label = 1;
                            obj = ((RealFallbackModeManager) fallbackModeManager).transition(str2, list, this);
                            break;
                        }
                        break;
                    } else if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else if (i5 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                case 4:
                    SubtreeManager subtreeManager = (SubtreeManager) obj2;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        long j = ((GovernmentIdState.FinalizeLocalVideoCapture) this.L$0).minDurationMs;
                        this.label = 1;
                        if (JobKt.delay(j, this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    WorkflowState state = subtreeManager.getState();
                    GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = state instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) state : null;
                    if (finalizeLocalVideoCapture != null) {
                        subtreeManager.updateState(GovernmentIdState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    List<MultipartBody.Part> list2 = (List) obj2;
                    com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker submitVerificationWorker2 = (com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker) this.L$0;
                    String str4 = submitVerificationWorker2.sessionToken;
                    FallbackModeManager fallbackModeManager2 = submitVerificationWorker2.fallbackModeManager;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!((RealFallbackModeManager) fallbackModeManager2).isFallbackModeActive()) {
                            SelfieService selfieService = submitVerificationWorker2.service;
                            String str5 = submitVerificationWorker2.inquiryId;
                            this.label = 2;
                            obj = selfieService.transitionSelfieVerification(str4, str5, list2, this);
                            break;
                        } else {
                            this.label = 1;
                            obj = ((RealFallbackModeManager) fallbackModeManager2).transition(str4, list2, this);
                            break;
                        }
                        break;
                    } else if (i7 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else if (i7 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                case 6:
                    SubtreeManager subtreeManager2 = (SubtreeManager) obj2;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        long j2 = ((SelfieState.FinalizeLocalVideoCapture) this.L$0).minDurationMs;
                        this.label = 1;
                        if (JobKt.delay(j2, this) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    WorkflowState state2 = subtreeManager2.getState();
                    SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = state2 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) state2 : null;
                    if (finalizeLocalVideoCapture2 != null) {
                        subtreeManager2.updateState(SelfieState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture2, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
                        break;
                    } else {
                        break;
                    }
                default:
                    SubtreeManager subtreeManager3 = (SubtreeManager) ((SelfieStepStateManager) obj2).lastChild;
                    Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (ref$BooleanRef.element) {
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        WorkflowState workflowState = (SelfieState) subtreeManager3.getState();
                        if ((workflowState instanceof CaptureState) && ((CaptureState) workflowState).getManualCaptureEnabled()) {
                            subtreeManager3.updateState(workflowState);
                            ref$BooleanRef.element = false;
                        }
                        if (ref$BooleanRef.element) {
                            this.label = 1;
                            if (JobKt.delay(1000L, this) == coroutineSingletons8) {
                                break;
                            }
                            WorkflowState workflowState2 = (SelfieState) subtreeManager3.getState();
                            if (workflowState2 instanceof CaptureState) {
                                subtreeManager3.updateState(workflowState2);
                                ref$BooleanRef.element = false;
                            }
                            if (ref$BooleanRef.element) {
                                break;
                            }
                        }
                    }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ResetViewModel resetViewModel, Continuation continuation) {
            super(1, continuation);
            this.$r8$classId = 0;
            this.this$0 = resetViewModel;
        }
    }
}
