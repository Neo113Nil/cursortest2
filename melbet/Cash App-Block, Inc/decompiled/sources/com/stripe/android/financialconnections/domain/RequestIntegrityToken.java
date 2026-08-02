package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.attestation.AttestationError;
import com.stripe.attestation.IntegrityStandardRequestManager;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RequestIntegrityToken {
    public final FinancialConnectionsAnalyticsTrackerImpl analyticsTracker;
    public final IntegrityStandardRequestManager integrityRequestManager;

    public RequestIntegrityToken(IntegrityStandardRequestManager integrityStandardRequestManager, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl) {
        integrityStandardRequestManager.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        this.integrityRequestManager = integrityStandardRequestManager;
        this.analyticsTracker = financialConnectionsAnalyticsTrackerImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint, FinancialConnectionsSessionManifest.Pane pane, ContinuationImpl continuationImpl) {
        RequestIntegrityToken$invoke$1 requestIntegrityToken$invoke$1;
        int i;
        Object m4080requestTokengIAlus;
        boolean z;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof RequestIntegrityToken$invoke$1) {
            requestIntegrityToken$invoke$1 = (RequestIntegrityToken$invoke$1) continuationImpl;
            int i2 = requestIntegrityToken$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestIntegrityToken$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = requestIntegrityToken$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestIntegrityToken$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    requestIntegrityToken$invoke$1.L$0 = attestationEndpoint;
                    requestIntegrityToken$invoke$1.L$1 = pane;
                    requestIntegrityToken$invoke$1.label = 1;
                    m4080requestTokengIAlus = this.integrityRequestManager.m4080requestTokengIAlus(requestIntegrityToken$invoke$1);
                    if (m4080requestTokengIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pane = requestIntegrityToken$invoke$1.L$1;
                    attestationEndpoint = requestIntegrityToken$invoke$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m4080requestTokengIAlus = ((Result) obj).value;
                }
                Result.Companion companion = Result.Companion;
                z = m4080requestTokengIAlus instanceof Result.Failure;
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = this.analyticsTracker;
                if (!z) {
                    pane.getClass();
                    attestationEndpoint.getClass();
                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("api", attestationEndpoint.analyticsValue))), "attestation.request_token_succeeded", true));
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4080requestTokengIAlus);
                if (m4120exceptionOrNullimpl != null) {
                    pane.getClass();
                    attestationEndpoint.getClass();
                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("api", attestationEndpoint.analyticsValue), new Pair("error_reason", m4120exceptionOrNullimpl instanceof AttestationError ? ((AttestationError) m4120exceptionOrNullimpl).errorType.name() : "unknown")), "attestation.request_token_failed", true));
                }
                SafeTrace.throwOnFailure(m4080requestTokengIAlus);
                return m4080requestTokengIAlus;
            }
        }
        requestIntegrityToken$invoke$1 = new RequestIntegrityToken$invoke$1(this, continuationImpl);
        Object obj2 = requestIntegrityToken$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestIntegrityToken$invoke$1.label;
        if (i != 0) {
        }
        Result.Companion companion2 = Result.Companion;
        z = m4080requestTokengIAlus instanceof Result.Failure;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = this.analyticsTracker;
        if (!z) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4080requestTokengIAlus);
        if (m4120exceptionOrNullimpl != null) {
        }
        SafeTrace.throwOnFailure(m4080requestTokengIAlus);
        return m4080requestTokengIAlus;
    }
}
