package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.exception.AccountNoneEligibleForPaymentMethodError;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class SelectAccounts {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsAccountsRepositoryImpl repository;

    public SelectAccounts(FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, int i) {
        financialConnectionsAccountsRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        switch (i) {
            case 1:
                this.repository = financialConnectionsAccountsRepositoryImpl;
                this.configuration = financialConnectionsSheetConfiguration;
                break;
            default:
                this.repository = financialConnectionsAccountsRepositoryImpl;
                this.configuration = financialConnectionsSheetConfiguration;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(boolean z, SynchronizeSessionResponse synchronizeSessionResponse, ContinuationImpl continuationImpl) {
        PollAuthorizationSessionAccounts$invoke$1 pollAuthorizationSessionAccounts$invoke$1;
        int i;
        StripeException stripeException;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        String str;
        Map map;
        String str2;
        Map map2;
        boolean z2;
        SynchronizeSessionResponse synchronizeSessionResponse2;
        Object obj;
        int i2;
        try {
            if (continuationImpl instanceof PollAuthorizationSessionAccounts$invoke$1) {
                pollAuthorizationSessionAccounts$invoke$1 = (PollAuthorizationSessionAccounts$invoke$1) continuationImpl;
                int i3 = pollAuthorizationSessionAccounts$invoke$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    pollAuthorizationSessionAccounts$invoke$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj2 = pollAuthorizationSessionAccounts$invoke$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pollAuthorizationSessionAccounts$invoke$1.label;
                    Continuation continuation = null;
                    continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        try {
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                            try {
                                if (financialConnectionsSessionManifest == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = financialConnectionsSessionManifest.activeAuthSession;
                                if (financialConnectionsAuthorizationSession == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                Iterator it = FinancialConnectionsAuthorizationSession.Flow.getEntries().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (Intrinsics.areEqual(((FinancialConnectionsAuthorizationSession.Flow) obj).getValue(), financialConnectionsAuthorizationSession.flow)) {
                                        break;
                                    }
                                }
                                FinancialConnectionsAuthorizationSession.Flow flow = (FinancialConnectionsAuthorizationSession.Flow) obj;
                                try {
                                    Duration.Companion companion = Duration.Companion;
                                    DurationUnit durationUnit = DurationUnit.SECONDS;
                                    long m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(1.75d, durationUnit));
                                    if (flow == null) {
                                        i2 = -1;
                                    } else {
                                        try {
                                            i2 = PollAuthorizationSessionAccountsKt$WhenMappings.$EnumSwitchMapping$0[flow.ordinal()];
                                        } catch (StripeException e) {
                                            stripeException = e;
                                            z2 = z;
                                            synchronizeSessionResponse2 = synchronizeSessionResponse;
                                            synchronizeSessionResponse = synchronizeSessionResponse2;
                                            z = z2;
                                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = synchronizeSessionResponse.manifest;
                                            financialConnectionsInstitution = financialConnectionsSessionManifest2.activeInstitution;
                                            str = financialConnectionsSessionManifest2.businessName;
                                            if (str == null) {
                                            }
                                            boolean showManualEntryInErrors = ListItemKt.showManualEntryInErrors(synchronizeSessionResponse);
                                            if (financialConnectionsInstitution == null) {
                                            }
                                        }
                                    }
                                    int i4 = 2;
                                    if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                                        m4167getInWholeMillisecondsimpl = 0;
                                    } else if (i2 == 5) {
                                        m4167getInWholeMillisecondsimpl = Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(0.5d, durationUnit));
                                    }
                                    PollTimingOptions pollTimingOptions = new PollTimingOptions(m4167getInWholeMillisecondsimpl, 6);
                                    RealSheetState$peek$3.AnonymousClass2 anonymousClass2 = new RealSheetState$peek$3.AnonymousClass2(i4, continuation, 12);
                                    PollAuthorizationSessionAccounts$invoke$4 pollAuthorizationSessionAccounts$invoke$4 = new PollAuthorizationSessionAccounts$invoke$4(this, financialConnectionsAuthorizationSession, financialConnectionsSessionManifest, synchronizeSessionResponse, z, null);
                                    pollAuthorizationSessionAccounts$invoke$1.L$0 = synchronizeSessionResponse;
                                    pollAuthorizationSessionAccounts$invoke$1.Z$0 = z;
                                    pollAuthorizationSessionAccounts$invoke$1.label = 1;
                                    obj2 = ErrorsKt.retryOnException(pollTimingOptions, anonymousClass2, pollAuthorizationSessionAccounts$invoke$4, pollAuthorizationSessionAccounts$invoke$1);
                                    if (obj2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    synchronizeSessionResponse = synchronizeSessionResponse;
                                    z = z;
                                } catch (StripeException e2) {
                                    e = e2;
                                    z2 = z;
                                    synchronizeSessionResponse2 = synchronizeSessionResponse;
                                    stripeException = e;
                                    synchronizeSessionResponse = synchronizeSessionResponse2;
                                    z = z2;
                                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest22 = synchronizeSessionResponse.manifest;
                                    financialConnectionsInstitution = financialConnectionsSessionManifest22.activeInstitution;
                                    str = financialConnectionsSessionManifest22.businessName;
                                    if (str == null) {
                                        str = financialConnectionsSessionManifest22.connectPlatformName;
                                    }
                                    boolean showManualEntryInErrors2 = ListItemKt.showManualEntryInErrors(synchronizeSessionResponse);
                                    if (financialConnectionsInstitution == null) {
                                        throw stripeException;
                                    }
                                    StripeError stripeError = stripeException.stripeError;
                                    if (stripeError != null && (map2 = stripeError.extraFields) != null) {
                                        continuation = (String) map2.get("reason");
                                    }
                                    if (!Intrinsics.areEqual(continuation, "no_supported_payment_method_type_accounts_found")) {
                                        throw new AccountLoadError(showManualEntryInErrors2, z, financialConnectionsInstitution, stripeException);
                                    }
                                    int parseInt = (stripeError == null || (map = stripeError.extraFields) == null || (str2 = (String) map.get("total_accounts_count")) == null) ? 0 : Integer.parseInt(str2);
                                    if (str == null) {
                                        str = "";
                                    }
                                    throw new AccountNoneEligibleForPaymentMethodError(parseInt, financialConnectionsInstitution, str, stripeException);
                                }
                            } catch (StripeException e3) {
                                e = e3;
                            }
                        } catch (StripeException e4) {
                            e = e4;
                            stripeException = e;
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest222 = synchronizeSessionResponse.manifest;
                            financialConnectionsInstitution = financialConnectionsSessionManifest222.activeInstitution;
                            str = financialConnectionsSessionManifest222.businessName;
                            if (str == null) {
                            }
                            boolean showManualEntryInErrors22 = ListItemKt.showManualEntryInErrors(synchronizeSessionResponse);
                            if (financialConnectionsInstitution == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = pollAuthorizationSessionAccounts$invoke$1.Z$0;
                        synchronizeSessionResponse = pollAuthorizationSessionAccounts$invoke$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return (PartnerAccountsList) obj2;
                }
            }
            if (i != 0) {
            }
            return (PartnerAccountsList) obj2;
        } catch (StripeException e5) {
            e = e5;
        }
        pollAuthorizationSessionAccounts$invoke$1 = new PollAuthorizationSessionAccounts$invoke$1(this, continuationImpl);
        Object obj22 = pollAuthorizationSessionAccounts$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollAuthorizationSessionAccounts$invoke$1.label;
        Continuation continuation2 = null;
        continuation2 = null;
    }
}
