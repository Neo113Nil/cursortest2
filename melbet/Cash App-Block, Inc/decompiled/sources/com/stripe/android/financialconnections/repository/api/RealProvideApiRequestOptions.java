package com.stripe.android.financialconnections.repository.api;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;

/* loaded from: classes8.dex */
public final class RealProvideApiRequestOptions implements ProvideApiRequestOptions {
    public final ApiRequest.Options apiRequestOptions;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final RealIsLinkWithStripe isLinkWithStripe;

    public RealProvideApiRequestOptions(RealConsumerSessionRepository realConsumerSessionRepository, RealIsLinkWithStripe realIsLinkWithStripe, ApiRequest.Options options) {
        realConsumerSessionRepository.getClass();
        realIsLinkWithStripe.getClass();
        options.getClass();
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.isLinkWithStripe = realIsLinkWithStripe;
        this.apiRequestOptions = options;
    }

    @Override // com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions
    public final ApiRequest.Options invoke(boolean z) {
        String str;
        if (z) {
            CachedConsumerSession provideConsumerSession = this.consumerSessionProvider.provideConsumerSession();
            if (provideConsumerSession == null || !provideConsumerSession.isVerified) {
                provideConsumerSession = null;
            }
            if (provideConsumerSession == null || (str = provideConsumerSession.publishableKey) == null || !this.isLinkWithStripe.initialState.isLinkWithStripe) {
                str = null;
            }
            ApiRequest.Options options = str != null ? new ApiRequest.Options(str, (String) null, 6) : null;
            if (options != null) {
                return options;
            }
        }
        return this.apiRequestOptions;
    }
}
