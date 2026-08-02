package com.stripe.android.payments.core.analytics;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.FraudDetectionErrorReporter;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes8.dex */
public final class RealErrorReporter implements FraudDetectionErrorReporter {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final AnalyticsRequestFactory analyticsRequestFactory;

    public RealErrorReporter(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory) {
        defaultAnalyticsRequestExecutor.getClass();
        analyticsRequestFactory.getClass();
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
    }

    public static void report$default(RealErrorReporter realErrorReporter, ErrorReporter$ErrorEvent errorReporter$ErrorEvent, StripeException stripeException, Map map, int i) {
        if ((i & 2) != 0) {
            stripeException = null;
        }
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        realErrorReporter.report(errorReporter$ErrorEvent, stripeException, map);
    }

    public final void report(ErrorReporter$ErrorEvent errorReporter$ErrorEvent, StripeException stripeException, Map map) {
        Map additionalParamsFromStripeException;
        errorReporter$ErrorEvent.getClass();
        map.getClass();
        if (stripeException == null) {
            additionalParamsFromStripeException = EmptyMap.INSTANCE;
            additionalParamsFromStripeException.getClass();
        } else {
            additionalParamsFromStripeException = ErrorReporter$Companion.getAdditionalParamsFromStripeException(stripeException);
        }
        this.analyticsRequestExecutor.executeAsync(this.analyticsRequestFactory.createRequest(errorReporter$ErrorEvent, MapsKt__MapsKt.plus(additionalParamsFromStripeException, map)));
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionErrorReporter
    public void reportFraudDetectionError(StripeException stripeException) {
        report$default(this, ErrorReporter$ExpectedErrorEvent.FRAUD_DETECTION_API_FAILURE, stripeException, null, 4);
    }
}
