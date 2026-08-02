package com.stripe.android.core.networking;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class DefaultAnalyticsRequestExecutor {
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final DefaultStripeNetworkClient stripeNetworkClient;
    public final CoroutineContext workContext;

    public DefaultAnalyticsRequestExecutor(Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, CoroutineContext coroutineContext) {
        logger$Companion$NOOP_LOGGER$1.getClass();
        coroutineContext.getClass();
        this.stripeNetworkClient = new DefaultStripeNetworkClient(coroutineContext, logger$Companion$NOOP_LOGGER$1, 14);
        this.workContext = coroutineContext;
        this.logger = logger$Companion$NOOP_LOGGER$1;
    }

    public final void executeAsync(AnalyticsRequest analyticsRequest) {
        analyticsRequest.getClass();
        this.logger.info("Event: " + analyticsRequest.params.get(BreadcrumbHelper.Category.EVENT));
        JobKt.launch$default(JobKt.CoroutineScope(this.workContext), null, null, new WorkerWorkflow$render$1(this, analyticsRequest, (Continuation) null, 22), 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAnalyticsRequestExecutor() {
        this(Logger$Companion.NOOP_LOGGER, DefaultIoScheduler.INSTANCE);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
    }
}
