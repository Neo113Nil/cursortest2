package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;

/* loaded from: classes8.dex */
public final class FinancialConnectionsInstitutionsRepositoryImpl {
    public final ApiRequest.Factory apiRequestFactory;
    public final ProvideApiRequestOptions provideApiRequestOptions;
    public final FinancialConnectionsRequestExecutor requestExecutor;

    public FinancialConnectionsInstitutionsRepositoryImpl(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory factory) {
        this.requestExecutor = financialConnectionsRequestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.apiRequestFactory = factory;
    }
}
