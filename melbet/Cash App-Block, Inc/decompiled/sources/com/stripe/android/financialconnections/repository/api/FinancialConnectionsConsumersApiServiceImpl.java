package com.stripe.android.financialconnections.repository.api;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;

/* loaded from: classes8.dex */
public final class FinancialConnectionsConsumersApiServiceImpl {
    public final ApiRequest.Options apiOptions;
    public final ApiRequest.Factory apiRequestFactory;
    public final FinancialConnectionsRequestExecutor requestExecutor;

    public FinancialConnectionsConsumersApiServiceImpl(FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor, ApiRequest.Options options, ApiRequest.Factory factory) {
        this.requestExecutor = financialConnectionsRequestExecutor;
        this.apiOptions = options;
        this.apiRequestFactory = factory;
    }
}
