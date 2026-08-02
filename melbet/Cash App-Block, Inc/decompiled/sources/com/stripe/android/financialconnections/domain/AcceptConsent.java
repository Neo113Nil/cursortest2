package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;

/* loaded from: classes8.dex */
public final class AcceptConsent {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsManifestRepositoryImpl repository;

    public AcceptConsent(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl) {
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.repository = financialConnectionsManifestRepositoryImpl;
        this.configuration = financialConnectionsSheetConfiguration;
    }
}
