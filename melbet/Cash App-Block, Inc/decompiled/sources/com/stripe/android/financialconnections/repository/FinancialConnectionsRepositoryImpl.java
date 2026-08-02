package com.stripe.android.financialconnections.repository;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession$invoke$1;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class FinancialConnectionsRepositoryImpl {
    public final ApiRequest.Factory apiRequestFactory;
    public final DefaultFraudDetectionDataRepository fraudDetectionDataRepository;
    public final ProvideApiRequestOptions provideApiRequestOptions;
    public final FinancialConnectionsRequestExecutor requestExecutor;

    public FinancialConnectionsRepositoryImpl(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ProvideApiRequestOptions provideApiRequestOptions, DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository, ApiRequest.Factory factory) {
        financialConnectionsRequestExecutor.getClass();
        provideApiRequestOptions.getClass();
        defaultFraudDetectionDataRepository.getClass();
        factory.getClass();
        this.requestExecutor = financialConnectionsRequestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.fraudDetectionDataRepository = defaultFraudDetectionDataRepository;
        this.apiRequestFactory = factory;
    }

    public final Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, FetchPaginatedAccountsForSession$invoke$1 fetchPaginatedAccountsForSession$invoke$1) {
        ApiRequest.Options invoke = this.provideApiRequestOptions.invoke(false);
        List<Pair> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair("client_secret", getFinancialConnectionsAcccountsParams.clientSecret), new Pair("starting_after", getFinancialConnectionsAcccountsParams.startingAfterAccountId)});
        Map map = EmptyMap.INSTANCE;
        map.getClass();
        for (Pair pair : listOf) {
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            Map m = str2 != null ? Thread$State$EnumUnboxingLocalUtility.m(str, str2) : null;
            if (m == null) {
                m = EmptyMap.INSTANCE;
                m.getClass();
            }
            map = MapsKt__MapsKt.plus(map, m);
        }
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/list_accounts", invoke, map), FinancialConnectionsAccountList.Companion.serializer(), fetchPaginatedAccountsForSession$invoke$1);
    }

    public final Object getFinancialConnectionsSession(String str, ContinuationImpl continuationImpl) {
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/session_receipt", this.provideApiRequestOptions.invoke(false), MapsKt__MapsJVMKt.mapOf(new Pair("client_secret", str))), FinancialConnectionsSession.Companion.serializer(), continuationImpl);
    }
}
