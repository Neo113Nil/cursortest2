package com.stripe.android.financialconnections.repository;

import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.lifecycle.SavedStateHandle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.GetCachedAccountsKt;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccountsList;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsAccountsRepositoryImpl {
    public final ApiRequest.Factory apiRequestFactory;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final ProvideApiRequestOptions provideApiRequestOptions;
    public final FinancialConnectionsRequestExecutor requestExecutor;
    public final SavedStateHandle savedStateHandle;

    public FinancialConnectionsAccountsRepositoryImpl(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory factory, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, SavedStateHandle savedStateHandle) {
        this.requestExecutor = financialConnectionsRequestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.apiRequestFactory = factory;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNetworkedAccounts(String str, String str2, ContinuationImpl continuationImpl) {
        FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1 financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1) {
            financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1 = (FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1) continuationImpl;
            int i2 = financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest createGet$default = ApiRequest.Factory.createGet$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/networked_accounts", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("client_secret", str), new Pair("consumer_session_client_secret", str2), new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("data.institution"))));
                    KSerializer serializer = NetworkedAccountsList.Companion.serializer();
                    financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.label = 1;
                    obj = this.requestExecutor.execute(createGet$default, serializer, financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                updateCachedAccounts("getNetworkedAccounts", ((NetworkedAccountsList) obj).data);
                return obj;
            }
        }
        financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1 = new FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1(this, continuationImpl);
        Object obj2 = financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1.label;
        if (i != 0) {
        }
        updateCachedAccounts("getNetworkedAccounts", ((NetworkedAccountsList) obj2).data);
        return obj2;
    }

    public final Object postAttachPaymentAccountToLinkAccountSession(String str, PaymentAccountParams paymentAccountParams, String str2, DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3) {
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/attach_payment_account", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.plus(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("consumer_session_client_secret", str2), new Pair("client_secret", str))), paymentAccountParams.toParamMap())), LinkAccountSessionPaymentAccount.Companion.serializer(), dataStoreImpl$readDataOrHandleCorruption$3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postAuthorizationSessionAccounts(String str, String str2, ContinuationImpl continuationImpl) {
        FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1 financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1) {
            financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1 = (FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1) continuationImpl;
            int i2 = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/accounts", this.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("id", str2), new Pair("client_secret", str), new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("data.institution"))));
                    KSerializer serializer = PartnerAccountsList.Companion.serializer();
                    financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.label = 1;
                    obj = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                updateCachedAccounts("getOrFetchAccounts", ((PartnerAccountsList) obj).data);
                return obj;
            }
        }
        financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1 = new FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1(this, continuationImpl);
        Object obj2 = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1.label;
        if (i != 0) {
        }
        updateCachedAccounts("getOrFetchAccounts", ((PartnerAccountsList) obj2).data);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postAuthorizationSessionSelectedAccounts(String str, String str2, List list, ContinuationImpl continuationImpl) {
        FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1 financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;
        int i;
        if (continuationImpl instanceof FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1) {
            financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1 = (FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1) continuationImpl;
            int i2 = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(true);
                    Map mapOf = MapsKt__MapsKt.mapOf(new Pair("id", str2), new Pair("client_secret", str), new Pair("expand", CollectionsKt__CollectionsJVMKt.listOf("data.institution")));
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    int i3 = 0;
                    for (Object obj2 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        arrayList.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "selected_accounts[", "]"), (String) obj2));
                        i3 = i4;
                    }
                    ApiRequest createPost$default = ApiRequest.Factory.createPost$default(this.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/selected_accounts", invoke, MapsKt__MapsKt.plus(mapOf, arrayList));
                    KSerializer serializer = PartnerAccountsList.Companion.serializer();
                    financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.label = 1;
                    obj = this.requestExecutor.execute(createPost$default, serializer, financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                updateCachedAccounts("postAuthorizationSessionSelectedAccounts", ((PartnerAccountsList) obj).data);
                return obj;
            }
        }
        financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1 = new FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1(this, continuationImpl);
        Object obj3 = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = financialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1.label;
        if (i != 0) {
        }
        updateCachedAccounts("postAuthorizationSessionSelectedAccounts", ((PartnerAccountsList) obj3).data);
        return obj3;
    }

    public final void updateCachedAccounts(String str, List list) {
        this.logger.debug("updating local partner accounts from ".concat(str));
        this.savedStateHandle.set(GetCachedAccountsKt.toCachedPartnerAccounts(list), "CachedPartnerAccounts");
    }
}
