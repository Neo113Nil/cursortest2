package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccountNoneEligibleForPaymentMethodError extends FinancialConnectionsError {
    public final int accountsCount;
    public final FinancialConnectionsInstitution institution;
    public final String merchantName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountNoneEligibleForPaymentMethodError(int i, FinancialConnectionsInstitution financialConnectionsInstitution, String str, StripeException stripeException) {
        super("AccountNoneEligibleForPaymentMethodError", stripeException);
        financialConnectionsInstitution.getClass();
        this.accountsCount = i;
        this.institution = financialConnectionsInstitution;
        this.merchantName = str;
    }
}
