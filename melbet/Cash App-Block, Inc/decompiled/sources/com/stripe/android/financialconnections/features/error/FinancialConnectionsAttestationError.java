package com.stripe.android.financialconnections.features.error;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.attestation.AttestationError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/financialconnections/features/error/FinancialConnectionsAttestationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinancialConnectionsAttestationError extends Exception {
    public final ElementsSessionContext.PrefillDetails prefillDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsAttestationError(AttestationError.ErrorType errorType, ElementsSessionContext.PrefillDetails prefillDetails, String str, Throwable th) {
        super(str, th);
        errorType.getClass();
        this.prefillDetails = prefillDetails;
    }
}
