package com.withpersona.sdk2.inquiry.webrtc.networking;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.zzc;
import com.squareup.cash.R;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.exit.ExitState;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.utils.Experiment;
import com.stripe.android.model.LinkBrand;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagService;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class WebRtcWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public NetworkCallResult.Success L$1;
    public int label;
    public final /* synthetic */ WebRtcWorker this$0;

    /* renamed from: com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((WebRtcWorker) obj, continuation, 0);
                case 1:
                    return new AnonymousClass1((AccountPickerViewModel) obj, continuation, 1);
                case 2:
                    return new AnonymousClass1((ConsentViewModel) obj, continuation, 2);
                case 3:
                    return new AnonymousClass1((ErrorViewModel) obj, continuation, 3);
                case 4:
                    return new AnonymousClass1((ExitViewModel) obj, continuation, 4);
                case 5:
                    return new AnonymousClass1((ManualEntryViewModel) obj, continuation, 5);
                case 6:
                    return new AnonymousClass1((ManualEntrySuccessViewModel) obj, continuation, 6);
                case 7:
                    return new AnonymousClass1((NetworkingLinkSignupViewModel) obj, continuation, 7);
                case 8:
                    return new AnonymousClass1((PartnerAuthViewModel) obj, continuation, 8);
                case 9:
                    return new AnonymousClass1((DocumentFileDeleteWorker) obj, continuation, 9);
                case 10:
                    return new AnonymousClass1((DocumentFileUploadWorker) obj, continuation, 10);
                case 11:
                    return new AnonymousClass1((DocumentLoadWorker) obj, continuation, 11);
                case 12:
                    return new AnonymousClass1((DocumentSubmitWorker) obj, continuation, 12);
                case 13:
                    return new AnonymousClass1((FeatureFlagWorker) obj, continuation, 13);
                case 14:
                    return new AnonymousClass1((GovernmentIdStepStateManager) obj, continuation, 14);
                case 15:
                    return new AnonymousClass1((InquiryStateManager) obj, continuation, 15);
                default:
                    return new AnonymousClass1((UiAddressDetailsWorker) obj, continuation, 16);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x01e8, code lost:
        
            if (r12 == r0) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x01f5, code lost:
        
            if (r12 == r0) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x01d5, code lost:
        
            if (r12 == r0) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:248:0x03d5, code lost:
        
            if (r12 == r0) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:250:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:252:0x03ca, code lost:
        
            if (r12.emit(com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE, r11) == r0) goto L211;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
        
            if (r12 == r5) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
        
            if (r12 == r5) goto L54;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object failure;
            TextResource.StringId stringId;
            TextResource.StringId stringId2;
            TextResource stringId3;
            TextResource pluralId;
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            String str = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    WebRtcWorker webRtcWorker = (WebRtcWorker) obj2;
                    WebRtcService webRtcService = webRtcWorker.service;
                    String str2 = webRtcWorker.jwt;
                    this.label = 1;
                    Object requestServerConfig = webRtcService.requestServerConfig(str2, this);
                    return requestServerConfig == coroutineSingletons ? coroutineSingletons : requestServerConfig;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync = ((AccountPickerViewModel) obj2).getOrFetchSync;
                        this.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                        if (obj == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    FinancialConnectionsInstitution financialConnectionsInstitution = ((SynchronizeSessionResponse) obj).manifest.activeInstitution;
                    if (financialConnectionsInstitution != null) {
                        return financialConnectionsInstitution;
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                case 2:
                    ConsentViewModel consentViewModel = (ConsentViewModel) obj2;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync2 = consentViewModel.getOrFetchSync;
                        this.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync2, null, this, 3);
                        if (obj == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                    Experiment experiment = Experiment.CONNECTIONS_CONSENT_COMBINED_LOGO;
                    boolean areEqual = Intrinsics.areEqual(zzc.experimentAssignment(financialConnectionsSessionManifest, experiment), "treatment");
                    zzc.trackExposure(consentViewModel.eventTracker, experiment, financialConnectionsSessionManifest);
                    TextUpdate textUpdate = synchronizeSessionResponse.text;
                    textUpdate.getClass();
                    ConsentPane consentPane = textUpdate.consent;
                    consentPane.getClass();
                    return new ConsentState.Payload(consentPane, synchronizeSessionResponse.visual.merchantLogos, areEqual, !(synchronizeSessionResponse.manifest.isLinkWithStripe != null ? r12.booleanValue() : false));
                case 3:
                    ErrorViewModel errorViewModel = (ErrorViewModel) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl = errorViewModel.coordinator.flow;
                        this.label = 1;
                        break;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = ((SynchronizeSessionResponse) obj).manifest;
                            FinancialConnectionsErrorRepository.State state = (FinancialConnectionsErrorRepository.State) errorViewModel.errorRepository.get();
                            Throwable th = state != null ? state.error : null;
                            if (th != null) {
                                return new ErrorState.Payload(th, financialConnectionsSessionManifest2.disableLinkMoreAccounts, financialConnectionsSessionManifest2.allowManualEntry);
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    GetOrFetchSync getOrFetchSync3 = errorViewModel.getOrFetchSync;
                    this.label = 2;
                    obj = GetOrFetchSync.invoke$default(getOrFetchSync3, null, this, 3);
                    break;
                case 4:
                    ExitViewModel exitViewModel = (ExitViewModel) obj2;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    try {
                        if (i6 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            Result.Companion companion = Result.Companion;
                            GetOrFetchSync getOrFetchSync4 = exitViewModel.getOrFetchSync;
                            this.label = 1;
                            obj = GetOrFetchSync.invoke$default(getOrFetchSync4, null, this, 3);
                            if (obj == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        failure = ((SynchronizeSessionResponse) obj).manifest;
                        Result.Companion companion2 = Result.Companion;
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.Companion;
                        failure = new Result.Failure(th2);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = (FinancialConnectionsSessionManifest) failure;
                    if (financialConnectionsSessionManifest3 != null) {
                        String str3 = financialConnectionsSessionManifest3.businessName;
                        if (str3 == null) {
                            str3 = financialConnectionsSessionManifest3.connectPlatformName;
                        }
                        str = str3;
                    }
                    if ((financialConnectionsSessionManifest3 != null ? Intrinsics.areEqual(financialConnectionsSessionManifest3.isNetworkingUserFlow, Boolean.TRUE) : false) && ((ExitState) exitViewModel.stateFlow.$$delegate_0.getValue()).referrer == FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE) {
                        r4 = true;
                    }
                    LinkBrand invoke = exitViewModel.currentLinkBrand.invoke();
                    if (!r4) {
                        stringId = str == null ? new TextResource.StringId(R.string.stripe_exit_modal_desc_no_business) : new TextResource.StringId(R.string.stripe_exit_modal_desc, CollectionsKt__CollectionsJVMKt.listOf(str));
                    } else if (str == null) {
                        if (invoke == LinkBrand.Link) {
                            stringId = new TextResource.StringId(R.string.stripe_close_dialog_networking_desc_no_business);
                        } else {
                            stringId2 = new TextResource.StringId(R.string.stripe_close_dialog_networking_desc_no_business_with_brand, CollectionsKt__CollectionsJVMKt.listOf(invoke.brandName()));
                            stringId = stringId2;
                        }
                    } else if (invoke == LinkBrand.Link) {
                        stringId = new TextResource.StringId(R.string.stripe_close_dialog_networking_desc, CollectionsKt__CollectionsJVMKt.listOf(str));
                    } else {
                        stringId2 = new TextResource.StringId(R.string.stripe_close_dialog_networking_desc_with_brand, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, invoke.brandName()}));
                        stringId = stringId2;
                    }
                    return new ExitState.Payload(stringId);
                case 5:
                    ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) obj2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync5 = manualEntryViewModel.getOrFetchSync;
                        this.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync5, null, this, 3);
                        if (obj == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest4 = ((SynchronizeSessionResponse) obj).manifest;
                    if (financialConnectionsSessionManifest4 != null) {
                        manualEntryViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY, 25));
                        return new ManualEntryState.Payload(financialConnectionsSessionManifest4.manualEntryUsesMicrodeposits, financialConnectionsSessionManifest4.manualEntryMode == ManualEntryMode.CUSTOM, !financialConnectionsSessionManifest4.livemode);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                case 6:
                    ManualEntrySuccessViewModel manualEntrySuccessViewModel = (ManualEntrySuccessViewModel) obj2;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync6 = manualEntrySuccessViewModel.getOrFetchSync;
                        this.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync6, null, this, 3);
                        if (obj == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest5 = ((SynchronizeSessionResponse) obj).manifest;
                    SuccessContentRepository.State state2 = (SuccessContentRepository.State) manualEntrySuccessViewModel.successContentRepository.get();
                    if (state2 == null || (stringId3 = state2.heading) == null) {
                        stringId3 = new TextResource.StringId(R.string.stripe_success_pane_title);
                    }
                    if (state2 == null || (pluralId = state2.message) == null) {
                        pluralId = new TextResource.PluralId(R.string.stripe_success_pane_desc_singular, R.string.stripe_success_pane_desc_plural, 1);
                    }
                    SuccessState.Payload payload = new SuccessState.Payload(financialConnectionsSessionManifest5.businessName, stringId3, pluralId, false);
                    manualEntrySuccessViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, 25));
                    return payload;
                case 7:
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) obj2;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) networkingLinkSignupViewModel.stateFlow.$$delegate_0.getValue();
                    LinkSignupHandler linkSignupHandler = networkingLinkSignupViewModel.linkSignupHandler;
                    this.label = 1;
                    Enum performSignup = linkSignupHandler.performSignup(networkingLinkSignupState, this);
                    return performSignup == coroutineSingletons8 ? coroutineSingletons8 : performSignup;
                case 8:
                    PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) obj2;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync7 = partnerAuthViewModel.getOrFetchSync;
                        this.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync7, null, this, 3);
                        break;
                    } else {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return (SharedPartnerAuthState.Payload) obj;
                            }
                            if (i10 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return (SharedPartnerAuthState.Payload) obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    SynchronizeSessionResponse synchronizeSessionResponse2 = (SynchronizeSessionResponse) obj;
                    if (partnerAuthViewModel.initialState.pane != FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR) {
                        this.label = 3;
                        obj = PartnerAuthViewModel.access$initializePartnerAuth(partnerAuthViewModel, synchronizeSessionResponse2, this);
                        break;
                    } else {
                        this.label = 2;
                        obj = PartnerAuthViewModel.access$initializeBankAuthRepair(partnerAuthViewModel, synchronizeSessionResponse2, this);
                        break;
                    }
                    return coroutineSingletons9;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    DocumentFileDeleteWorker documentFileDeleteWorker = (DocumentFileDeleteWorker) obj2;
                    DocumentService documentService = documentFileDeleteWorker.service;
                    String str4 = documentFileDeleteWorker.sessionToken;
                    String str5 = documentFileDeleteWorker.remoteDocument.documentFileId;
                    this.label = 1;
                    Object deleteFile = documentService.deleteFile(str4, str5, this);
                    return deleteFile == coroutineSingletons10 ? coroutineSingletons10 : deleteFile;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    DocumentFileUploadWorker documentFileUploadWorker = (DocumentFileUploadWorker) obj2;
                    DocumentService documentService2 = documentFileUploadWorker.service;
                    String str6 = documentFileUploadWorker.sessionToken;
                    String str7 = documentFileUploadWorker.documentId;
                    this.label = 1;
                    Object loadDocuments = documentService2.loadDocuments(str6, str7, this);
                    return loadDocuments == coroutineSingletons11 ? coroutineSingletons11 : loadDocuments;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    DocumentLoadWorker documentLoadWorker = (DocumentLoadWorker) obj2;
                    DocumentService documentService3 = documentLoadWorker.service;
                    String str8 = documentLoadWorker.sessionToken;
                    String str9 = documentLoadWorker.documentId;
                    this.label = 1;
                    Object loadDocuments2 = documentService3.loadDocuments(str8, str9, this);
                    return loadDocuments2 == coroutineSingletons12 ? coroutineSingletons12 : loadDocuments2;
                case 12:
                    DocumentSubmitWorker documentSubmitWorker = (DocumentSubmitWorker) obj2;
                    String str10 = documentSubmitWorker.fromComponent;
                    String str11 = documentSubmitWorker.fromStep;
                    String str12 = documentSubmitWorker.sessionToken;
                    FallbackModeManager fallbackModeManager = documentSubmitWorker.fallbackModeManager;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return (Response) obj;
                        }
                        if (i14 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return (Response) obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (!((RealFallbackModeManager) fallbackModeManager).isFallbackModeActive()) {
                        DocumentService documentService4 = documentSubmitWorker.service;
                        String str13 = documentSubmitWorker.inquiryId;
                        str11.getClass();
                        str10.getClass();
                        SubmitDocumentRequest submitDocumentRequest = new SubmitDocumentRequest(null, new SubmitDocumentRequest.Meta(str11, str10), 1, null);
                        this.label = 2;
                        obj = documentService4.submitDocument(str12, str13, submitDocumentRequest, this);
                        break;
                    } else {
                        str11.getClass();
                        str10.getClass();
                        SubmitDocumentRequest submitDocumentRequest2 = new SubmitDocumentRequest(null, new SubmitDocumentRequest.Meta(str11, str10), 1, null);
                        this.label = 1;
                        obj = ((RealFallbackModeManager) fallbackModeManager).transition(str12, submitDocumentRequest2, this);
                        break;
                    }
                    return coroutineSingletons13;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlagWorker featureFlagWorker = (FeatureFlagWorker) obj2;
                    FeatureFlagService featureFlagService = featureFlagWorker.featureFlagService;
                    String str14 = featureFlagWorker.sessionToken;
                    List list = CollectionsKt.toList(featureFlagWorker.featureFlagManager.defaultFeatureFlagMap.keySet());
                    list.getClass();
                    String[] strArr = (String[]) list.toArray(new String[0]);
                    this.label = 1;
                    Object featureFlag = featureFlagService.getFeatureFlag(str14, strArr, this);
                    return featureFlag == coroutineSingletons14 ? coroutineSingletons14 : featureFlag;
                case 14:
                    GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) obj2;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Context context = governmentIdStepStateManager.applicationContext;
                        this.label = 1;
                        if (CameraHelper.INSTANCE.unbind(context, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    governmentIdStepStateManager.videoCaptureHelper.getClass();
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 != 0) {
                        if (i17 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    InquiryStateManager inquiryStateManager = (InquiryStateManager) obj2;
                    SharedFlowImpl sharedFlowImpl2 = inquiryStateManager.externalInquiryController.controllerRequestFlow;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(inquiryStateManager, 27);
                    this.label = 1;
                    sharedFlowImpl2.collect(anonymousClass1, this);
                    return coroutineSingletons16;
                default:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    UiAddressDetailsWorker uiAddressDetailsWorker = (UiAddressDetailsWorker) obj2;
                    UiService uiService = uiAddressDetailsWorker.uiService;
                    String str15 = uiAddressDetailsWorker.sessionToken;
                    String str16 = uiAddressDetailsWorker.addressId;
                    this.label = 1;
                    Object addressDetails = uiService.getAddressDetails(str15, str16, this);
                    return addressDetails == coroutineSingletons17 ? coroutineSingletons17 : addressDetails;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRtcWorker$run$1(WebRtcWorker webRtcWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = webRtcWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebRtcWorker$run$1 webRtcWorker$run$1 = new WebRtcWorker$run$1(this.this$0, continuation);
        webRtcWorker$run$1.L$0 = obj;
        return webRtcWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebRtcWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r2.emit(r6, r16) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r2.emit(r5, r16) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r5 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r2.emit(r6, r16) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object enqueueRetriableRequestWithRetry;
        NetworkCallResult networkCallResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation, 0);
            this.L$0 = flowCollector;
            this.label = 1;
            enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                NetworkCallResult networkCallResult2 = this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    WebRtcWorker.Response.Error error = new WebRtcWorker.Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.L$0 = networkCallResult;
                    this.L$1 = null;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
            enqueueRetriableRequestWithRetry = obj;
        }
        networkCallResult = (NetworkCallResult) enqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            NetworkCallResult.Success success = (NetworkCallResult.Success) networkCallResult;
            if (((AuthorizeWebRtcResponse) success.getResponse()) != null) {
                WebRtcWorker.Response.Success success2 = new WebRtcWorker.Response.Success();
                this.L$0 = flowCollector;
                this.L$1 = success;
                this.label = 2;
            } else {
                WebRtcWorker.Response.Error error2 = new WebRtcWorker.Response.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body to be non-null.", false, null, 8, null));
                this.L$0 = flowCollector;
                this.L$1 = success;
                this.label = 3;
            }
            networkCallResult = networkCallResult2;
            flowCollector = flowCollector2;
        }
        if (networkCallResult instanceof NetworkCallResult.Failure) {
        }
        return Unit.INSTANCE;
    }
}
