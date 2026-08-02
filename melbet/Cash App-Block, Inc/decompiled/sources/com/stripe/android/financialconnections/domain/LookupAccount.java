package com.stripe.android.financialconnections.domain;

import android.app.Application;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.FillrAuthenticationStore;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.EmailSource;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class LookupAccount {
    public final Application application;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsConsumerSessionRepositoryImpl consumerSessionRepository;
    public final RequestIntegrityToken requestIntegrityToken;

    public LookupAccount(Application application, RequestIntegrityToken requestIntegrityToken, FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        application.getClass();
        requestIntegrityToken.getClass();
        financialConnectionsConsumerSessionRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.application = application;
        this.requestIntegrityToken = requestIntegrityToken;
        this.consumerSessionRepository = financialConnectionsConsumerSessionRepositoryImpl;
        this.configuration = financialConnectionsSheetConfiguration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
    
        if (r5 == r7) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:20:0x013e, B:19:0x00fc, B:26:0x00ff, B:27:0x0104, B:11:0x0074, B:13:0x00b5), top: B:10:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff A[Catch: all -> 0x007e, TryCatch #2 {all -> 0x007e, blocks: (B:20:0x013e, B:19:0x00fc, B:26:0x00ff, B:27:0x0104, B:11:0x0074, B:13:0x00b5), top: B:10:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, String str2, String str3, EmailSource emailSource, boolean z, String str4, FinancialConnectionsSessionManifest.Pane pane, ContinuationImpl continuationImpl) {
        LookupAccount$invoke$1 lookupAccount$invoke$1;
        int i;
        int i2;
        EmailSource emailSource2;
        String str5;
        String str6;
        String str7;
        boolean z2;
        Object obj;
        String str8;
        Object obj2;
        Throwable m4120exceptionOrNullimpl;
        LookupAccount lookupAccount = this;
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        if (continuationImpl instanceof LookupAccount$invoke$1) {
            lookupAccount$invoke$1 = (LookupAccount$invoke$1) continuationImpl;
            int i3 = lookupAccount$invoke$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                lookupAccount$invoke$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj3 = lookupAccount$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lookupAccount$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        try {
                            if (i == 2) {
                                String str12 = lookupAccount$invoke$1.L$2;
                                String str13 = lookupAccount$invoke$1.L$1;
                                String str14 = lookupAccount$invoke$1.L$0;
                                SafeTrace.throwOnFailure(obj3);
                                str8 = str12;
                                str7 = str13;
                                str6 = str14;
                                if (obj3 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                obj2 = (ConsumerSessionLookup) obj3;
                                Result.Companion companion = Result.Companion;
                            } else {
                                if (i != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                String str15 = lookupAccount$invoke$1.L$2;
                                str10 = lookupAccount$invoke$1.L$1;
                                String str16 = lookupAccount$invoke$1.L$0;
                                SafeTrace.throwOnFailure(obj3);
                                str11 = str15;
                                str9 = str16;
                                if (obj3 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                obj2 = (ConsumerSessionLookup) obj3;
                                str6 = str9;
                                str7 = str10;
                                str8 = str11;
                                Result.Companion companion2 = Result.Companion;
                            }
                        } catch (Throwable th) {
                            th = th;
                            str11 = str9;
                            str9 = str11;
                        }
                    } else {
                        int i4 = lookupAccount$invoke$1.I$0;
                        z2 = lookupAccount$invoke$1.Z$0;
                        LookupAccount lookupAccount2 = lookupAccount$invoke$1.L$6;
                        String str17 = lookupAccount$invoke$1.L$4;
                        EmailSource emailSource3 = lookupAccount$invoke$1.L$3;
                        str8 = lookupAccount$invoke$1.L$2;
                        str7 = lookupAccount$invoke$1.L$1;
                        str6 = lookupAccount$invoke$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj3);
                            i2 = i4;
                            lookupAccount = lookupAccount2;
                            obj = obj3;
                            str5 = str17;
                            emailSource2 = emailSource3;
                            FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = lookupAccount.consumerSessionRepository;
                            String lowerCase = str6.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            String obj4 = StringsKt.trim(lowerCase).toString();
                            String packageName = lookupAccount.application.getPackageName();
                            packageName.getClass();
                            lookupAccount$invoke$1.L$0 = str6;
                            lookupAccount$invoke$1.L$1 = str7;
                            lookupAccount$invoke$1.L$2 = str8;
                            lookupAccount$invoke$1.L$3 = null;
                            lookupAccount$invoke$1.L$4 = null;
                            lookupAccount$invoke$1.L$6 = null;
                            lookupAccount$invoke$1.Z$0 = z2;
                            lookupAccount$invoke$1.I$0 = i2;
                            lookupAccount$invoke$1.label = 2;
                            obj3 = financialConnectionsConsumerSessionRepositoryImpl.mobileLookupConsumerSession(obj4, emailSource2, (String) obj, str5, packageName, lookupAccount$invoke$1);
                            if (obj3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (obj3 == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str11 = str8;
                            str10 = str7;
                            str9 = str6;
                        }
                    }
                    Result.Companion companion3 = Result.Companion;
                    obj2 = new Result.Failure(th);
                    str6 = str9;
                    str7 = str10;
                    str8 = str11;
                } else {
                    SafeTrace.throwOnFailure(obj3);
                    try {
                        Result.Companion companion4 = Result.Companion;
                        i2 = 0;
                        if (z) {
                            RequestIntegrityToken requestIntegrityToken = lookupAccount.requestIntegrityToken;
                            FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint = FinancialConnectionsAnalyticsEvent.AttestationEndpoint.LOOKUP;
                            lookupAccount$invoke$1.L$0 = str9;
                            lookupAccount$invoke$1.L$1 = str10;
                            lookupAccount$invoke$1.L$2 = str11;
                            emailSource2 = emailSource;
                            lookupAccount$invoke$1.L$3 = emailSource2;
                            str5 = str4;
                            lookupAccount$invoke$1.L$4 = str5;
                            lookupAccount$invoke$1.L$6 = lookupAccount;
                            lookupAccount$invoke$1.Z$0 = z;
                            lookupAccount$invoke$1.I$0 = 0;
                            lookupAccount$invoke$1.label = 1;
                            Object invoke = requestIntegrityToken.invoke(attestationEndpoint, pane, lookupAccount$invoke$1);
                            if (invoke != coroutineSingletons) {
                                str6 = str9;
                                str7 = str10;
                                z2 = z;
                                obj = invoke;
                                str8 = str11;
                                FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl2 = lookupAccount.consumerSessionRepository;
                                String lowerCase2 = str6.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                String obj42 = StringsKt.trim(lowerCase2).toString();
                                String packageName2 = lookupAccount.application.getPackageName();
                                packageName2.getClass();
                                lookupAccount$invoke$1.L$0 = str6;
                                lookupAccount$invoke$1.L$1 = str7;
                                lookupAccount$invoke$1.L$2 = str8;
                                lookupAccount$invoke$1.L$3 = null;
                                lookupAccount$invoke$1.L$4 = null;
                                lookupAccount$invoke$1.L$6 = null;
                                lookupAccount$invoke$1.Z$0 = z2;
                                lookupAccount$invoke$1.I$0 = i2;
                                lookupAccount$invoke$1.label = 2;
                                obj3 = financialConnectionsConsumerSessionRepositoryImpl2.mobileLookupConsumerSession(obj42, emailSource2, (String) obj, str5, packageName2, lookupAccount$invoke$1);
                                if (obj3 == coroutineSingletons) {
                                }
                                if (obj3 == null) {
                                }
                            }
                        } else {
                            FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl3 = lookupAccount.consumerSessionRepository;
                            String lowerCase3 = str9.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                            String obj5 = StringsKt.trim(lowerCase3).toString();
                            String str18 = lookupAccount.configuration.financialConnectionsSessionClientSecret;
                            lookupAccount$invoke$1.L$0 = str9;
                            lookupAccount$invoke$1.L$1 = str10;
                            lookupAccount$invoke$1.L$2 = str11;
                            lookupAccount$invoke$1.L$3 = null;
                            lookupAccount$invoke$1.L$4 = null;
                            lookupAccount$invoke$1.L$6 = null;
                            lookupAccount$invoke$1.Z$0 = z;
                            lookupAccount$invoke$1.I$0 = 0;
                            lookupAccount$invoke$1.label = 3;
                            obj3 = financialConnectionsConsumerSessionRepositoryImpl3.postConsumerSession(obj5, str18, lookupAccount$invoke$1);
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                if (m4120exceptionOrNullimpl != null) {
                    return obj2;
                }
                throw FillrAuthenticationStore.toAttestationErrorIfApplicable(m4120exceptionOrNullimpl, new ElementsSessionContext.PrefillDetails(str6, str7, str8));
            }
        }
        lookupAccount$invoke$1 = new LookupAccount$invoke$1(lookupAccount, continuationImpl);
        Object obj32 = lookupAccount$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lookupAccount$invoke$1.label;
        if (i == 0) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
        if (m4120exceptionOrNullimpl != null) {
        }
    }
}
