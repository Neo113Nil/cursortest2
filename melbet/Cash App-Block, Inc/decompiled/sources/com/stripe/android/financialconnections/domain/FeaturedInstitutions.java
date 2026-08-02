package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepositoryImpl;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes8.dex */
public final class FeaturedInstitutions {
    public final FinancialConnectionsInstitutionsRepositoryImpl repository;

    public FeaturedInstitutions(FinancialConnectionsInstitutionsRepositoryImpl financialConnectionsInstitutionsRepositoryImpl) {
        financialConnectionsInstitutionsRepositoryImpl.getClass();
        this.repository = financialConnectionsInstitutionsRepositoryImpl;
    }

    public final Object invoke(String str, InstitutionPickerViewModel.AnonymousClass1 anonymousClass1) {
        FinancialConnectionsInstitutionsRepositoryImpl financialConnectionsInstitutionsRepositoryImpl = this.repository;
        return financialConnectionsInstitutionsRepositoryImpl.requestExecutor.execute(ApiRequest.Factory.createGet$default(financialConnectionsInstitutionsRepositoryImpl.apiRequestFactory, "https://api.stripe.com/v1/connections/featured_institutions", financialConnectionsInstitutionsRepositoryImpl.provideApiRequestOptions.invoke(true), MapsKt__MapsJVMKt.mapOf(new Pair("client_secret", str))), InstitutionResponse.Companion.serializer(), anonymousClass1);
    }
}
