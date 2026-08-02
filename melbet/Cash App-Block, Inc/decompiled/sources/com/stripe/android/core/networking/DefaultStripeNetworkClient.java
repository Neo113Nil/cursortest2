package com.stripe.android.core.networking;

import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class DefaultStripeNetworkClient {
    public final ConnectionFactory$Default connectionFactory;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final int maxRetries;
    public final LinearRetryDelaySupplier retryDelaySupplier;
    public final CoroutineContext workContext;

    public DefaultStripeNetworkClient(CoroutineContext coroutineContext, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, int i) {
        if ((i & 1) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineContext = DefaultIoScheduler.INSTANCE;
        }
        LinearRetryDelaySupplier linearRetryDelaySupplier = new LinearRetryDelaySupplier(1);
        logger$Companion$NOOP_LOGGER$1 = (i & 16) != 0 ? Logger$Companion.NOOP_LOGGER : logger$Companion$NOOP_LOGGER$1;
        coroutineContext.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.workContext = coroutineContext;
        this.connectionFactory = ConnectionFactory$Default.INSTANCE;
        this.retryDelaySupplier = linearRetryDelaySupplier;
        this.maxRetries = 3;
        this.logger = logger$Companion$NOOP_LOGGER$1;
    }

    public final Object executeRequest(StripeRequest stripeRequest, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.workContext, new GovernmentIdFeed$analyze$5(new ListsKt$$ExternalSyntheticLambda0(27, this, stripeRequest), stripeRequest.getRetryResponseCodes(), this.maxRetries, this, (Continuation) null, 13), continuationImpl);
    }
}
