package com.squareup.cash.work.presenters.shift;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.protos.client.timecards.UpdateTimecardNotesRequest;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.model.EmailSource;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import java.io.File;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RealClockInRepository$updateNote$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $merchantToken;
    public final /* synthetic */ int $r8$classId;
    public Object $request;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClockInRepository$updateNote$2(FallbackModeApiController fallbackModeApiController, String str, RequestBody requestBody, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 3;
        this.this$0 = fallbackModeApiController;
        this.$merchantToken = str;
        this.$request = requestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$merchantToken;
        switch (i) {
            case 0:
                return new RealClockInRepository$updateNote$2((RealClockInRepository) this.this$0, (UpdateTimecardNotesRequest) this.$request, (String) obj, continuation, 0);
            case 1:
                return new RealClockInRepository$updateNote$2((NetworkingLinkLoginWarmupViewModel) this.this$0, (CachedConsumerSession) this.$request, (NetworkingLinkLoginWarmupState.Payload) obj, continuation, 1);
            case 2:
                return new RealClockInRepository$updateNote$2((PartnerAuthViewModel) obj, continuation);
            case 3:
                return new RealClockInRepository$updateNote$2((FallbackModeApiController) this.this$0, (String) obj, (RequestBody) this.$request, continuation);
            default:
                return new RealClockInRepository$updateNote$2((SubmitVerificationWorker) this.this$0, (File) this.$request, (RequestBody$Companion$asRequestBody$1) obj, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RealClockInRepository$updateNote$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        if (r4 == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AuthSessionEvent.Launched launched;
        Object invoke$default;
        Object invoke;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        int i = this.$r8$classId;
        Object obj2 = this.$merchantToken;
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
                TimecardsService timecardsService = ((RealClockInRepository) this.this$0).timecardsService;
                UpdateTimecardNotesRequest updateTimecardNotesRequest = (UpdateTimecardNotesRequest) this.$request;
                SquareMerchantToken squareMerchantToken = new SquareMerchantToken((String) obj2);
                this.label = 1;
                Object updateTimecardNote = timecardsService.updateTimecardNote(updateTimecardNotesRequest, squareMerchantToken, this);
                return updateTimecardNote == coroutineSingletons ? coroutineSingletons : updateTimecardNote;
            case 1:
                NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = (NetworkingLinkLoginWarmupViewModel) this.this$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = networkingLinkLoginWarmupViewModel.eventTracker;
                    FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkLoginWarmupViewModel.PANE;
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click("click.continue", pane));
                    if (((CachedConsumerSession) this.$request) == null) {
                        LookupAccount lookupAccount = networkingLinkLoginWarmupViewModel.lookupAccount;
                        NetworkingLinkLoginWarmupState.Payload payload = (NetworkingLinkLoginWarmupState.Payload) obj2;
                        String str = payload.email;
                        EmailSource emailSource = EmailSource.CUSTOMER_OBJECT;
                        String str2 = payload.sessionId;
                        boolean z = payload.verifiedFlow;
                        this.label = 1;
                        if (lookupAccount.invoke(str, null, null, emailSource, z, str2, pane, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                NavigationManagerImpl.tryNavigateTo$default(networkingLinkLoginWarmupViewModel.navigationManager, Destination.invoke$default(Destination.NetworkingLinkVerification.INSTANCE, NetworkingLinkLoginWarmupViewModel.PANE), null, 6);
                return Unit.INSTANCE;
            case 2:
                PartnerAuthViewModel partnerAuthViewModel = (PartnerAuthViewModel) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                Continuation continuation = null;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    launched = new AuthSessionEvent.Launched(new Date());
                    GetOrFetchSync getOrFetchSync = partnerAuthViewModel.getOrFetchSync;
                    this.this$0 = launched;
                    this.label = 1;
                    invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.$request;
                        launched = (AuthSessionEvent.Launched) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) invoke;
                        partnerAuthViewModel.logger.debug("Created auth session " + financialConnectionsAuthorizationSession.id);
                        financialConnectionsInstitution = financialConnectionsSessionManifest.activeInstitution;
                        if (financialConnectionsInstitution != null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        Boolean bool = financialConnectionsSessionManifest.isStripeDirect;
                        SharedPartnerAuthState.Payload payload2 = new SharedPartnerAuthState.Payload(bool != null ? bool.booleanValue() : false, financialConnectionsInstitution, financialConnectionsAuthorizationSession);
                        AuthSessionEvent.Loaded loaded = new AuthSessionEvent.Loaded(new Date());
                        if (!financialConnectionsAuthorizationSession.isOAuth()) {
                            loaded = null;
                        }
                        TextSetter textSetter = partnerAuthViewModel.postAuthSessionEvent;
                        String str3 = financialConnectionsAuthorizationSession.id;
                        List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new AuthSessionEvent[]{launched, loaded});
                        textSetter.getClass();
                        str3.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        JobKt.launch$default(GlobalScope.INSTANCE, DefaultIoScheduler.INSTANCE, null, new TakeUntil$collectSafely$2(textSetter, str3, filterNotNull, continuation, 28), 2);
                        return payload2;
                    }
                    launched = (AuthSessionEvent.Launched) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    invoke$default = obj;
                }
                SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) invoke$default;
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = synchronizeSessionResponse.manifest;
                PostAuthorizationSession postAuthorizationSession = partnerAuthViewModel.createAuthorizationSession;
                FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsSessionManifest2.activeInstitution;
                if (financialConnectionsInstitution2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                this.this$0 = launched;
                this.$request = financialConnectionsSessionManifest2;
                this.label = 2;
                invoke = postAuthorizationSession.invoke(financialConnectionsInstitution2, synchronizeSessionResponse, this);
                if (invoke != coroutineSingletons3) {
                    financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) invoke;
                    partnerAuthViewModel.logger.debug("Created auth session " + financialConnectionsAuthorizationSession2.id);
                    financialConnectionsInstitution = financialConnectionsSessionManifest.activeInstitution;
                    if (financialConnectionsInstitution != null) {
                    }
                }
                return coroutineSingletons3;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RequestBody requestBody = (RequestBody) this.$request;
                this.label = 1;
                Object upload = ((FallbackModeApiController) this.this$0).service.upload((String) obj2, requestBody, this);
                return upload == coroutineSingletons4 ? coroutineSingletons4 : upload;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SubmitVerificationWorker submitVerificationWorker = (SubmitVerificationWorker) this.this$0;
                UploadService uploadService = submitVerificationWorker.uploadService;
                String str4 = submitVerificationWorker.fileUploadUrl;
                MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData("file", ((File) this.$request).getName(), (RequestBody$Companion$asRequestBody$1) obj2);
                this.label = 1;
                Object upload2 = uploadService.upload(str4, createFormData, this);
                return upload2 == coroutineSingletons5 ? coroutineSingletons5 : upload2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealClockInRepository$updateNote$2(PartnerAuthViewModel partnerAuthViewModel, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 2;
        this.$merchantToken = partnerAuthViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealClockInRepository$updateNote$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$request = obj2;
        this.$merchantToken = obj3;
    }
}
