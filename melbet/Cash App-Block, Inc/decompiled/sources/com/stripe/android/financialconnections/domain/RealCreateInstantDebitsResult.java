package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.UpdateAvailableIncentives;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RealCreateInstantDebitsResult {
    public final FinancialConnectionsConsumerSessionRepositoryImpl consumerRepository;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final ElementsSessionContext elementsSessionContext;
    public final FinancialConnectionsRepositoryImpl repository;

    public RealCreateInstantDebitsResult(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl, RealConsumerSessionRepository realConsumerSessionRepository, ElementsSessionContext elementsSessionContext) {
        financialConnectionsConsumerSessionRepositoryImpl.getClass();
        financialConnectionsRepositoryImpl.getClass();
        realConsumerSessionRepository.getClass();
        this.consumerRepository = financialConnectionsConsumerSessionRepositoryImpl;
        this.repository = financialConnectionsRepositoryImpl;
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.elementsSessionContext = elementsSessionContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, ContinuationImpl continuationImpl) {
        RealCreateInstantDebitsResult$invoke$1 realCreateInstantDebitsResult$invoke$1;
        int i;
        String str2;
        ElementsSessionContext.BillingDetails billingDetails;
        LinkMode linkMode;
        LinkMode linkMode2;
        ConsumerPaymentDetails.BankAccount bankAccount;
        if (continuationImpl instanceof RealCreateInstantDebitsResult$invoke$1) {
            realCreateInstantDebitsResult$invoke$1 = (RealCreateInstantDebitsResult$invoke$1) continuationImpl;
            int i2 = realCreateInstantDebitsResult$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCreateInstantDebitsResult$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCreateInstantDebitsResult$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCreateInstantDebitsResult$invoke$1.label;
                boolean z = false;
                FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = this.consumerRepository;
                ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
                String str3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CachedConsumerSession provideConsumerSession = this.consumerSessionProvider.provideConsumerSession();
                    str2 = provideConsumerSession != null ? provideConsumerSession.clientSecret : null;
                    if (str2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Consumer session client secret cannot be null");
                        return null;
                    }
                    ElementsSessionContext.BillingDetails billingDetails2 = elementsSessionContext != null ? elementsSessionContext.billingDetails : null;
                    realCreateInstantDebitsResult$invoke$1.L$2 = str2;
                    realCreateInstantDebitsResult$invoke$1.L$3 = billingDetails2;
                    realCreateInstantDebitsResult$invoke$1.label = 1;
                    Object createPaymentDetails = financialConnectionsConsumerSessionRepositoryImpl.createPaymentDetails(str, str2, billingDetails2, realCreateInstantDebitsResult$invoke$1);
                    if (createPaymentDetails != coroutineSingletons) {
                        ElementsSessionContext.BillingDetails billingDetails3 = billingDetails2;
                        obj = createPaymentDetails;
                        billingDetails = billingDetails3;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        bankAccount = realCreateInstantDebitsResult$invoke$1.L$5;
                        SafeTrace.throwOnFailure(obj);
                        str3 = ((SharePaymentDetails) obj).encodedPaymentMethod;
                        return new InstantDebitsResult(str3, bankAccount.last4, bankAccount.bankAccountName, z);
                    }
                    if (i == 3) {
                        bankAccount = realCreateInstantDebitsResult$invoke$1.L$5;
                        SafeTrace.throwOnFailure(obj);
                        str3 = (String) obj;
                        return new InstantDebitsResult(str3, bankAccount.last4, bankAccount.bankAccountName, z);
                    }
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bankAccount = realCreateInstantDebitsResult$invoke$1.L$5;
                    SafeTrace.throwOnFailure(obj);
                    Object obj2 = ((Result) obj).value;
                    Result.Companion companion = Result.Companion;
                    boolean z2 = obj2 instanceof Result.Failure;
                    Object obj3 = obj2;
                    if (!z2) {
                        obj3 = Boolean.valueOf(!((UpdateAvailableIncentives) obj2).data.isEmpty());
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z3 = obj3 instanceof Result.Failure;
                    Object obj4 = obj3;
                    if (z3) {
                        obj4 = bool;
                    }
                    z = ((Boolean) obj4).booleanValue();
                    return new InstantDebitsResult(str3, bankAccount.last4, bankAccount.bankAccountName, z);
                }
                billingDetails = realCreateInstantDebitsResult$invoke$1.L$3;
                str2 = realCreateInstantDebitsResult$invoke$1.L$2;
                SafeTrace.throwOnFailure(obj);
                List list = ((ConsumerPaymentDetails) obj).paymentDetails;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (obj5 instanceof ConsumerPaymentDetails.BankAccount) {
                        arrayList.add(obj5);
                    }
                }
                ConsumerPaymentDetails.BankAccount bankAccount2 = (ConsumerPaymentDetails.BankAccount) CollectionsKt.first((List) arrayList);
                linkMode = elementsSessionContext == null ? elementsSessionContext.linkMode : null;
                linkMode2 = LinkMode.LinkCardBrand;
                if (linkMode != linkMode2) {
                    String str4 = bankAccount2.id;
                    linkMode.getClass();
                    String str5 = linkMode == linkMode2 ? "card" : "bank_account";
                    if (elementsSessionContext != null) {
                        ElementsSessionContext.BillingDetails billingDetails4 = elementsSessionContext.billingDetails;
                    }
                    realCreateInstantDebitsResult$invoke$1.L$2 = str2;
                    realCreateInstantDebitsResult$invoke$1.L$3 = null;
                    realCreateInstantDebitsResult$invoke$1.L$5 = bankAccount2;
                    realCreateInstantDebitsResult$invoke$1.label = 2;
                    Object sharePaymentDetails = financialConnectionsConsumerSessionRepositoryImpl.sharePaymentDetails(str4, str2, str5, realCreateInstantDebitsResult$invoke$1);
                    if (sharePaymentDetails != coroutineSingletons) {
                        obj = sharePaymentDetails;
                        bankAccount = bankAccount2;
                        str3 = ((SharePaymentDetails) obj).encodedPaymentMethod;
                        return new InstantDebitsResult(str3, bankAccount.last4, bankAccount.bankAccountName, z);
                    }
                } else {
                    String str6 = bankAccount2.id;
                    realCreateInstantDebitsResult$invoke$1.L$2 = str2;
                    realCreateInstantDebitsResult$invoke$1.L$3 = null;
                    realCreateInstantDebitsResult$invoke$1.L$5 = bankAccount2;
                    realCreateInstantDebitsResult$invoke$1.label = 3;
                    FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = this.repository;
                    financialConnectionsRepositoryImpl.getClass();
                    Map mapOf = MapsKt__MapsKt.mapOf(new Pair("type", "link"), new Pair("link", MapsKt__MapsKt.mapOf(new Pair("credentials", Thread$State$EnumUnboxingLocalUtility.m("consumer_session_client_secret", str2)), new Pair("payment_details_id", str6))));
                    Map mapOf2 = billingDetails != null ? MapsKt__MapsJVMKt.mapOf(new Pair("billing_details", ComposeUtilsKt.toApiParams(billingDetails))) : null;
                    if (mapOf2 == null) {
                        mapOf2 = EmptyMap.INSTANCE;
                        mapOf2.getClass();
                    }
                    FraudDetectionData cached = financialConnectionsRepositoryImpl.fraudDetectionDataRepository.getCached();
                    Map params = cached != null ? cached.getParams() : null;
                    if (params == null) {
                        params = EmptyMap.INSTANCE;
                        params.getClass();
                    }
                    Object executeInternal = financialConnectionsRepositoryImpl.requestExecutor.executeInternal(ApiRequest.Factory.createPost$default(financialConnectionsRepositoryImpl.apiRequestFactory, "https://api.stripe.com/v1/payment_methods", financialConnectionsRepositoryImpl.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(mapOf, mapOf2), params)), new StripeApiRepository$$ExternalSyntheticLambda5(10), realCreateInstantDebitsResult$invoke$1);
                    if (executeInternal != coroutineSingletons) {
                        obj = executeInternal;
                        bankAccount = bankAccount2;
                        str3 = (String) obj;
                        return new InstantDebitsResult(str3, bankAccount.last4, bankAccount.bankAccountName, z);
                    }
                }
                return coroutineSingletons;
            }
        }
        realCreateInstantDebitsResult$invoke$1 = new RealCreateInstantDebitsResult$invoke$1(this, continuationImpl);
        Object obj6 = realCreateInstantDebitsResult$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCreateInstantDebitsResult$invoke$1.label;
        boolean z4 = false;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl2 = this.consumerRepository;
        ElementsSessionContext elementsSessionContext2 = this.elementsSessionContext;
        String str32 = null;
        if (i != 0) {
        }
        List list2 = ((ConsumerPaymentDetails) obj6).paymentDetails;
        ArrayList arrayList2 = new ArrayList();
        while (r15.hasNext()) {
        }
        ConsumerPaymentDetails.BankAccount bankAccount22 = (ConsumerPaymentDetails.BankAccount) CollectionsKt.first((List) arrayList2);
        if (elementsSessionContext2 == null) {
        }
        linkMode2 = LinkMode.LinkCardBrand;
        if (linkMode != linkMode2) {
        }
        return coroutineSingletons2;
    }
}
