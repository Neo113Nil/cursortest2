package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "Lcom/stripe/android/core/exception/StripeException;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class FinancialConnectionsError extends StripeException {
    public final String name;
    public final StripeException stripeException;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/stripe/android/financialconnections/exception/FinancialConnectionsError$1", "Lcom/stripe/android/core/exception/StripeException;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.exception.FinancialConnectionsError$1, reason: invalid class name */
    public final class AnonymousClass1 extends StripeException {
    }

    public FinancialConnectionsError(String str, StripeException stripeException) {
        super(stripeException.stripeError, stripeException.requestId, stripeException.statusCode, stripeException.getCause(), stripeException.getMessage());
        this.name = str;
        this.stripeException = stripeException;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final String analyticsValue() {
        return "fcError";
    }

    public FinancialConnectionsError(String str, String str2) {
        this(str, new AnonymousClass1(null, null, 0, null, str2));
    }
}
