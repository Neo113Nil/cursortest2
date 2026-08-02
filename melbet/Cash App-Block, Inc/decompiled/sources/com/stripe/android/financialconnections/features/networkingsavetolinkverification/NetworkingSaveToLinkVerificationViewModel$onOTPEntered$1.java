package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent$VerificationError$Error;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.model.LinkBrand;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $otp;
    public int I$0;
    public NetworkingSaveToLinkVerificationState.Payload L$0;
    public NetworkingSaveToLinkVerificationViewModel L$1;
    public List L$2;
    public int label;
    public final /* synthetic */ NetworkingSaveToLinkVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1(NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = networkingSaveToLinkVerificationViewModel;
        this.$otp = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1(this.this$0, this.$otp, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((NetworkingSaveToLinkVerificationViewModel$onOTPEntered$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0162, code lost:
    
        if (r0 != r8) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:19:0x002e, B:21:0x0119, B:33:0x0042, B:35:0x00e2, B:38:0x00f3, B:43:0x0052, B:45:0x00a8, B:47:0x00b0, B:49:0x00ba, B:50:0x00be, B:53:0x00c3, B:54:0x00ca, B:56:0x00cb, B:60:0x0060, B:61:0x0096, B:67:0x007e), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object postMarkLinkVerified;
        NetworkingSaveToLinkVerificationState.Payload payload;
        NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel;
        int i;
        Object invoke;
        List list;
        Object invoke$default;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        Object ensureReadyAccounts;
        NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel2 = this.this$0;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = networkingSaveToLinkVerificationViewModel2.eventTracker;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        boolean z = true;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                failure = new Result.Failure(th);
            }
        } catch (Throwable unused) {
            Result.Companion companion2 = Result.Companion;
        }
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            Object invoke2 = ((NetworkingSaveToLinkVerificationState) networkingSaveToLinkVerificationViewModel2.stateFlow.$$delegate_0.getValue()).payload.invoke();
            if (invoke2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            payload = (NetworkingSaveToLinkVerificationState.Payload) invoke2;
            String str = this.$otp;
            Result.Companion companion3 = Result.Companion;
            ConfirmVerification confirmVerification = networkingSaveToLinkVerificationViewModel2.confirmVerification;
            String str2 = payload.consumerSessionClientSecret;
            this.L$0 = payload;
            this.L$1 = networkingSaveToLinkVerificationViewModel2;
            this.I$0 = 0;
            this.label = 1;
            if (confirmVerification.sms(str2, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            networkingSaveToLinkVerificationViewModel = networkingSaveToLinkVerificationViewModel2;
            i = 0;
        } else if (i2 == 1) {
            i = this.I$0;
            networkingSaveToLinkVerificationViewModel = this.L$1;
            payload = this.L$0;
            SafeTrace.throwOnFailure(obj);
        } else if (i2 == 2) {
            i = this.I$0;
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel3 = this.L$1;
            NetworkingSaveToLinkVerificationState.Payload payload2 = this.L$0;
            SafeTrace.throwOnFailure(obj);
            payload = payload2;
            networkingSaveToLinkVerificationViewModel = networkingSaveToLinkVerificationViewModel3;
            invoke = obj;
            list = (List) invoke;
            if (list.isEmpty()) {
                AttachedPaymentAccountRepository.State state = (AttachedPaymentAccountRepository.State) networkingSaveToLinkVerificationViewModel.attachedPaymentAccountRepository.get();
                if (!((state != null ? state.attachedPaymentAccount : null) instanceof PaymentAccountParams.BankAccount)) {
                    throw new IllegalArgumentException("An already attached account is required when no accounts cached");
                }
            }
            GetOrFetchSync getOrFetchSync = networkingSaveToLinkVerificationViewModel.getOrFetchSync;
            this.L$0 = payload;
            this.L$1 = networkingSaveToLinkVerificationViewModel;
            this.L$2 = list;
            this.I$0 = i;
            this.label = 3;
            invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
            if (invoke$default == coroutineSingletons) {
                return coroutineSingletons;
            }
            financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default).manifest;
            SaveAccountToLink saveAccountToLink = networkingSaveToLinkVerificationViewModel.saveAccountToLink;
            String str3 = payload.consumerSessionClientSecret;
            financialConnectionsSessionManifest.getClass();
            if (financialConnectionsSessionManifest.paymentMethodType != null) {
            }
            LinkBrand invoke3 = networkingSaveToLinkVerificationViewModel.currentLinkBrand.invoke();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 4;
            saveAccountToLink.getClass();
            ensureReadyAccounts = saveAccountToLink.ensureReadyAccounts(z, list, invoke3, new WorkerWorkflow$render$1(saveAccountToLink, str3, (Continuation) null, 25), this);
            if (ensureReadyAccounts == coroutineSingletons) {
            }
            failure = (FinancialConnectionsSessionManifest) ensureReadyAccounts;
            Result.Companion companion4 = Result.Companion;
            if (!(failure instanceof Result.Failure)) {
            }
            if (Result.m4120exceptionOrNullimpl(failure) != null) {
            }
            SafeTrace.throwOnFailure(failure);
            MarkLinkVerified markLinkVerified = networkingSaveToLinkVerificationViewModel2.markLinkVerified;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 5;
            postMarkLinkVerified = markLinkVerified.repository.postMarkLinkVerified(markLinkVerified.configuration.financialConnectionsSessionClientSecret, this);
        } else if (i2 == 3) {
            i = this.I$0;
            List list2 = this.L$2;
            NetworkingSaveToLinkVerificationViewModel networkingSaveToLinkVerificationViewModel4 = this.L$1;
            NetworkingSaveToLinkVerificationState.Payload payload3 = this.L$0;
            SafeTrace.throwOnFailure(obj);
            payload = payload3;
            networkingSaveToLinkVerificationViewModel = networkingSaveToLinkVerificationViewModel4;
            list = list2;
            invoke$default = obj;
            financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default).manifest;
            SaveAccountToLink saveAccountToLink2 = networkingSaveToLinkVerificationViewModel.saveAccountToLink;
            String str32 = payload.consumerSessionClientSecret;
            financialConnectionsSessionManifest.getClass();
            if (financialConnectionsSessionManifest.paymentMethodType != null) {
                z = false;
            }
            LinkBrand invoke32 = networkingSaveToLinkVerificationViewModel.currentLinkBrand.invoke();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = i;
            this.label = 4;
            saveAccountToLink2.getClass();
            ensureReadyAccounts = saveAccountToLink2.ensureReadyAccounts(z, list, invoke32, new WorkerWorkflow$render$1(saveAccountToLink2, str32, (Continuation) null, 25), this);
            if (ensureReadyAccounts == coroutineSingletons) {
                return coroutineSingletons;
            }
            failure = (FinancialConnectionsSessionManifest) ensureReadyAccounts;
            Result.Companion companion42 = Result.Companion;
            if (!(failure instanceof Result.Failure)) {
            }
            if (Result.m4120exceptionOrNullimpl(failure) != null) {
            }
            SafeTrace.throwOnFailure(failure);
            MarkLinkVerified markLinkVerified2 = networkingSaveToLinkVerificationViewModel2.markLinkVerified;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 5;
            postMarkLinkVerified = markLinkVerified2.repository.postMarkLinkVerified(markLinkVerified2.configuration.financialConnectionsSessionClientSecret, this);
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                postMarkLinkVerified = obj;
                Result.Companion companion5 = Result.Companion;
                return Unit.INSTANCE;
            }
            List list3 = this.L$2;
            SafeTrace.throwOnFailure(obj);
            ensureReadyAccounts = obj;
            failure = (FinancialConnectionsSessionManifest) ensureReadyAccounts;
            Result.Companion companion422 = Result.Companion;
            if (!(failure instanceof Result.Failure)) {
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(NetworkingSaveToLinkVerificationViewModel.PANE));
            }
            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(NetworkingSaveToLinkVerificationViewModel.PANE, FinancialConnectionsAnalyticsEvent$VerificationError$Error.ConfirmVerificationSessionError));
            }
            SafeTrace.throwOnFailure(failure);
            MarkLinkVerified markLinkVerified22 = networkingSaveToLinkVerificationViewModel2.markLinkVerified;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = 0;
            this.label = 5;
            postMarkLinkVerified = markLinkVerified22.repository.postMarkLinkVerified(markLinkVerified22.configuration.financialConnectionsSessionClientSecret, this);
        }
        GetCachedAccounts getCachedAccounts = networkingSaveToLinkVerificationViewModel.getCachedAccounts;
        this.L$0 = payload;
        this.L$1 = networkingSaveToLinkVerificationViewModel;
        this.I$0 = i;
        this.label = 2;
        invoke = getCachedAccounts.invoke(this);
        if (invoke == coroutineSingletons) {
            return coroutineSingletons;
        }
        list = (List) invoke;
        if (list.isEmpty()) {
        }
        GetOrFetchSync getOrFetchSync2 = networkingSaveToLinkVerificationViewModel.getOrFetchSync;
        this.L$0 = payload;
        this.L$1 = networkingSaveToLinkVerificationViewModel;
        this.L$2 = list;
        this.I$0 = i;
        this.label = 3;
        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync2, null, this, 3);
        if (invoke$default == coroutineSingletons) {
        }
        financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default).manifest;
        SaveAccountToLink saveAccountToLink22 = networkingSaveToLinkVerificationViewModel.saveAccountToLink;
        String str322 = payload.consumerSessionClientSecret;
        financialConnectionsSessionManifest.getClass();
        if (financialConnectionsSessionManifest.paymentMethodType != null) {
        }
        LinkBrand invoke322 = networkingSaveToLinkVerificationViewModel.currentLinkBrand.invoke();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.I$0 = i;
        this.label = 4;
        saveAccountToLink22.getClass();
        ensureReadyAccounts = saveAccountToLink22.ensureReadyAccounts(z, list, invoke322, new WorkerWorkflow$render$1(saveAccountToLink22, str322, (Continuation) null, 25), this);
        if (ensureReadyAccounts == coroutineSingletons) {
        }
        failure = (FinancialConnectionsSessionManifest) ensureReadyAccounts;
        Result.Companion companion4222 = Result.Companion;
        if (!(failure instanceof Result.Failure)) {
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
        }
        SafeTrace.throwOnFailure(failure);
        MarkLinkVerified markLinkVerified222 = networkingSaveToLinkVerificationViewModel2.markLinkVerified;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.I$0 = 0;
        this.label = 5;
        postMarkLinkVerified = markLinkVerified222.repository.postMarkLinkVerified(markLinkVerified222.configuration.financialConnectionsSessionClientSecret, this);
    }
}
