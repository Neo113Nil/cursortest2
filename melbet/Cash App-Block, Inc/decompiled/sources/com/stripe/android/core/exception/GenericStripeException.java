package com.stripe.android.core.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/core/exception/GenericStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GenericStripeException extends StripeException {
    public final String analyticsValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericStripeException(String str, Throwable th) {
        super(0, 7, null, null, th.getMessage(), th);
        th.getClass();
        this.analyticsValue = str;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final String analyticsValue() {
        String str = this.analyticsValue;
        return str == null ? "unknown" : str;
    }
}
