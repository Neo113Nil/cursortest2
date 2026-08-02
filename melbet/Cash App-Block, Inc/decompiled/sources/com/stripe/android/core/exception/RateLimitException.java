package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/core/exception/RateLimitException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RateLimitException extends StripeException {
    public RateLimitException(StripeError stripeError, String str) {
        super(stripeError, str, HttpStatusCode.TOO_MANY_REQUESTS_429, null, stripeError.message);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final String analyticsValue() {
        return "rateLimitError";
    }
}
