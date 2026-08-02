package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PostAuthorizationSession {
    public final String applicationId;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsManifestRepositoryImpl repository;

    public PostAuthorizationSession(FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, String str) {
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        str.getClass();
        this.repository = financialConnectionsManifestRepositoryImpl;
        this.configuration = financialConnectionsSheetConfiguration;
        this.applicationId = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsInstitution financialConnectionsInstitution, SynchronizeSessionResponse synchronizeSessionResponse, ContinuationImpl continuationImpl) {
        PostAuthorizationSession$invoke$1 postAuthorizationSession$invoke$1;
        int i;
        try {
            if (continuationImpl instanceof PostAuthorizationSession$invoke$1) {
                postAuthorizationSession$invoke$1 = (PostAuthorizationSession$invoke$1) continuationImpl;
                int i2 = postAuthorizationSession$invoke$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    postAuthorizationSession$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = postAuthorizationSession$invoke$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = postAuthorizationSession$invoke$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = this.repository;
                        String str = this.configuration.financialConnectionsSessionClientSecret;
                        String str2 = this.applicationId;
                        postAuthorizationSession$invoke$1.L$0 = financialConnectionsInstitution;
                        postAuthorizationSession$invoke$1.L$1 = synchronizeSessionResponse;
                        postAuthorizationSession$invoke$1.label = 1;
                        obj = financialConnectionsManifestRepositoryImpl.postAuthorizationSession(str, str2, financialConnectionsInstitution, postAuthorizationSession$invoke$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        synchronizeSessionResponse = postAuthorizationSession$invoke$1.L$1;
                        financialConnectionsInstitution = postAuthorizationSession$invoke$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (FinancialConnectionsAuthorizationSession) obj;
                }
            }
            if (i != 0) {
            }
            return (FinancialConnectionsAuthorizationSession) obj;
        } catch (StripeException e) {
            FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsInstitution;
            boolean showManualEntryInErrors = ListItemKt.showManualEntryInErrors(synchronizeSessionResponse);
            StripeError stripeError = e.stripeError;
            if (stripeError == null) {
                throw e;
            }
            Map map = stripeError.extraFields;
            String str3 = map != null ? (String) map.get("institution_unavailable") : null;
            String str4 = map != null ? (String) map.get("expected_to_be_available_at") : null;
            if (!Intrinsics.areEqual(str3, "true")) {
                throw e;
            }
            if (str4 == null || str4.length() == 0) {
                throw new InstitutionUnplannedDowntimeError(e, financialConnectionsInstitution2, showManualEntryInErrors);
            }
            Duration.Companion companion = Duration.Companion;
            throw new InstitutionPlannedDowntimeError(financialConnectionsInstitution2, showManualEntryInErrors, Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(Long.parseLong(str4), DurationUnit.SECONDS)), e);
        }
        postAuthorizationSession$invoke$1 = new PostAuthorizationSession$invoke$1(this, continuationImpl);
        Object obj2 = postAuthorizationSession$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = postAuthorizationSession$invoke$1.label;
    }
}
