package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InstitutionUnplannedDowntimeError extends FinancialConnectionsError {
    public final FinancialConnectionsInstitution institution;
    public final boolean showManualEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionUnplannedDowntimeError(StripeException stripeException, FinancialConnectionsInstitution financialConnectionsInstitution, boolean z) {
        super("InstitutionUnplannedDowntimeError", stripeException);
        financialConnectionsInstitution.getClass();
        this.institution = financialConnectionsInstitution;
        this.showManualEntry = z;
    }
}
