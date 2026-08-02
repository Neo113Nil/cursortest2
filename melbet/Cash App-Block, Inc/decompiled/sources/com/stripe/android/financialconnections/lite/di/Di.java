package com.stripe.android.financialconnections.lite.di;

import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonImpl;
import papa.AppUpdateData;

/* loaded from: classes8.dex */
public final class Di {
    public static final ApiRequest.Factory apiRequestFactory = new ApiRequest.Factory(new ApiVersion(SetsKt__SetsJVMKt.setOf("financial_connections_client_api_beta=v1")).getCode());
    public static final JsonImpl json = AppUpdateData.Json$default(new StripeApiRepository$$ExternalSyntheticLambda5(9));
    public static final Logger$Companion$NOOP_LOGGER$1 logger;
    public static final DefaultIoScheduler workContext;

    static {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        workContext = DefaultIoScheduler.INSTANCE;
        logger = Logger$Companion.NOOP_LOGGER;
    }
}
