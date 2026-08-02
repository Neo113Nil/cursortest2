package com.stripe.android.core.frauddetection;

import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import kotlin.coroutines.CoroutineContext;
import net.idrnd.face.iad.capture.internal.o0;

/* loaded from: classes8.dex */
public final class DefaultFraudDetectionDataRepository {
    public FraudDetectionData cachedFraudDetectionData;
    public final FraudDetectionErrorReporter errorReporter;
    public final o0 fraudDetectionDataRequestFactory;
    public final WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 fraudDetectionEnabledProvider;
    public final AndroidFileSaver localStore;
    public final DefaultStripeNetworkClient stripeNetworkClient;
    public final CoroutineContext workContext;

    public DefaultFraudDetectionDataRepository(AndroidFileSaver androidFileSaver, o0 o0Var, DefaultStripeNetworkClient defaultStripeNetworkClient, FraudDetectionErrorReporter fraudDetectionErrorReporter, CoroutineContext coroutineContext, WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0) {
        coroutineContext.getClass();
        this.localStore = androidFileSaver;
        this.fraudDetectionDataRequestFactory = o0Var;
        this.stripeNetworkClient = defaultStripeNetworkClient;
        this.errorReporter = fraudDetectionErrorReporter;
        this.workContext = coroutineContext;
        this.fraudDetectionEnabledProvider = workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
    }

    public final FraudDetectionData getCached() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (this.fraudDetectionEnabledProvider.provideFraudDetectionEnabled()) {
            return fraudDetectionData;
        }
        return null;
    }
}
