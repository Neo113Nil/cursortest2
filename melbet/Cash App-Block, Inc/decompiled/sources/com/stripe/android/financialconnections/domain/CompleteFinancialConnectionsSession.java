package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class CompleteFinancialConnectionsSession {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final Payload fetchPaginatedAccountsForSession;
    public final FinancialConnectionsRepositoryImpl repository;

    public final class Result {
        public final FinancialConnectionsSession session;
        public final String status;

        public Result(FinancialConnectionsSession financialConnectionsSession, String str) {
            financialConnectionsSession.getClass();
            this.session = financialConnectionsSession;
            this.status = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.areEqual(this.session, result.session) && this.status.equals(result.status);
        }

        public final int hashCode() {
            return this.status.hashCode() + (this.session.hashCode() * 31);
        }

        public final String toString() {
            return "Result(session=" + this.session + ", status=" + this.status + ")";
        }
    }

    public CompleteFinancialConnectionsSession(FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl, Payload payload, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        financialConnectionsRepositoryImpl.getClass();
        payload.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.repository = financialConnectionsRepositoryImpl;
        this.fetchPaginatedAccountsForSession = payload;
        this.configuration = financialConnectionsSheetConfiguration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(NativeAuthFlowCoordinator.Message.Complete.EarlyTerminationCause earlyTerminationCause, Throwable th, ContinuationImpl continuationImpl) {
        CompleteFinancialConnectionsSession$invoke$1 completeFinancialConnectionsSession$invoke$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Throwable th2;
        if (continuationImpl instanceof CompleteFinancialConnectionsSession$invoke$1) {
            completeFinancialConnectionsSession$invoke$1 = (CompleteFinancialConnectionsSession$invoke$1) continuationImpl;
            int i2 = completeFinancialConnectionsSession$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                completeFinancialConnectionsSession$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = completeFinancialConnectionsSession$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = completeFinancialConnectionsSession$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = earlyTerminationCause != null ? "user_initiated_with_custom_manual_entry" : null;
                    String str2 = this.configuration.financialConnectionsSessionClientSecret;
                    completeFinancialConnectionsSession$invoke$1.L$0 = earlyTerminationCause;
                    completeFinancialConnectionsSession$invoke$1.L$1 = th;
                    completeFinancialConnectionsSession$invoke$1.label = 1;
                    FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = this.repository;
                    obj = financialConnectionsRepositoryImpl.requestExecutor.execute(ApiRequest.Factory.createPost$default(financialConnectionsRepositoryImpl.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/complete", financialConnectionsRepositoryImpl.provideApiRequestOptions.invoke(true), MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("client_secret", str2), new Pair("terminal_error", str)))), FinancialConnectionsSession.Companion.serializer(), completeFinancialConnectionsSession$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th2 = completeFinancialConnectionsSession$invoke$1.L$1;
                        earlyTerminationCause = completeFinancialConnectionsSession$invoke$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
                        return new Result(financialConnectionsSession, earlyTerminationCause == null ? "custom_manual_entry" : (financialConnectionsSession.getAccounts().data.isEmpty() && financialConnectionsSession.paymentAccount == null && financialConnectionsSession.bankAccountToken == null) ? th2 != null ? "failed" : "canceled" : "completed");
                    }
                    th = completeFinancialConnectionsSession$invoke$1.L$1;
                    earlyTerminationCause = completeFinancialConnectionsSession$invoke$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                completeFinancialConnectionsSession$invoke$1.L$0 = earlyTerminationCause;
                completeFinancialConnectionsSession$invoke$1.L$1 = th;
                completeFinancialConnectionsSession$invoke$1.label = 2;
                obj = this.fetchPaginatedAccountsForSession.invoke((FinancialConnectionsSession) obj, completeFinancialConnectionsSession$invoke$1);
                if (obj != coroutineSingletons) {
                    th2 = th;
                    FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) obj;
                    return new Result(financialConnectionsSession2, earlyTerminationCause == null ? "custom_manual_entry" : (financialConnectionsSession2.getAccounts().data.isEmpty() && financialConnectionsSession2.paymentAccount == null && financialConnectionsSession2.bankAccountToken == null) ? th2 != null ? "failed" : "canceled" : "completed");
                }
                return coroutineSingletons;
            }
        }
        completeFinancialConnectionsSession$invoke$1 = new CompleteFinancialConnectionsSession$invoke$1(this, continuationImpl);
        obj = completeFinancialConnectionsSession$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = completeFinancialConnectionsSession$invoke$1.label;
        if (i != 0) {
        }
        completeFinancialConnectionsSession$invoke$1.L$0 = earlyTerminationCause;
        completeFinancialConnectionsSession$invoke$1.L$1 = th;
        completeFinancialConnectionsSession$invoke$1.label = 2;
        obj = this.fetchPaginatedAccountsForSession.invoke((FinancialConnectionsSession) obj, completeFinancialConnectionsSession$invoke$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
