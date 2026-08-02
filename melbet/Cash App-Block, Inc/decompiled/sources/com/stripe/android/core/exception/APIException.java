package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/core/exception/APIException;", "Lcom/stripe/android/core/exception/StripeException;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class APIException extends StripeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public APIException(int i, int i2, StripeError stripeError, String str, String str2, Throwable th) {
        super(r3, r4, r5, r6, str2);
        int i3;
        StripeError stripeError2;
        String str3;
        Throwable th2;
        stripeError = (i2 & 1) != 0 ? null : stripeError;
        str = (i2 & 2) != 0 ? null : str;
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? stripeError != null ? stripeError.message : null : str2;
        if ((i2 & 16) != 0) {
            StripeError stripeError3 = stripeError;
            i3 = i;
            stripeError2 = stripeError3;
            str3 = str;
            th2 = null;
        } else {
            StripeError stripeError4 = stripeError;
            i3 = i;
            stripeError2 = stripeError4;
            str3 = str;
            th2 = th;
        }
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final String analyticsValue() {
        return "apiError";
    }
}
