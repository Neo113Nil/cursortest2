package com.stripe.android.payments.core.analytics;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.utils.MapUtilsKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes8.dex */
public final class ErrorReporter$Companion {
    public static Map getAdditionalParamsFromStripeException(StripeException stripeException) {
        stripeException.getClass();
        int i = stripeException.statusCode;
        Integer valueOf = i == 0 ? null : Integer.valueOf(i);
        Pair pair = new Pair("analytics_value", stripeException.analyticsValue());
        Pair pair2 = new Pair("status_code", valueOf != null ? String.valueOf(valueOf.intValue()) : null);
        Pair pair3 = new Pair("request_id", stripeException.requestId);
        StripeError stripeError = stripeException.stripeError;
        return MapUtilsKt.filterNotNullValues(MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair("error_type", stripeError != null ? stripeError.f1428type : null), new Pair("error_code", stripeError != null ? stripeError.code : null)));
    }
}
