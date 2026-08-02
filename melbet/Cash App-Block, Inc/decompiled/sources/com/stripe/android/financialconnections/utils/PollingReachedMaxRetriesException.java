package com.stripe.android.financialconnections.utils;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/utils/PollingReachedMaxRetriesException;", "Lcom/stripe/android/core/exception/StripeException;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PollingReachedMaxRetriesException extends StripeException {
    @Override // com.stripe.android.core.exception.StripeException
    public final String analyticsValue() {
        return "pollingReachedMaxRetriesError";
    }
}
