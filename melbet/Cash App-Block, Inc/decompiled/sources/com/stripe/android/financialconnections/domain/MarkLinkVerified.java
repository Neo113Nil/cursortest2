package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;

/* loaded from: classes8.dex */
public final class MarkLinkVerified {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsManifestRepositoryImpl repository;

    public MarkLinkVerified(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl) {
        financialConnectionsSheetConfiguration.getClass();
        financialConnectionsManifestRepositoryImpl.getClass();
        this.configuration = financialConnectionsSheetConfiguration;
        this.repository = financialConnectionsManifestRepositoryImpl;
    }
}
