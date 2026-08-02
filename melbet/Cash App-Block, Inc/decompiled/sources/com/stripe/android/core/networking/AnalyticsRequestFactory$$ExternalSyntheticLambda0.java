package com.stripe.android.core.networking;

import com.stripe.android.core.utils.PluginDetector;
import javax.inject.Provider;

/* loaded from: classes8.dex */
public final /* synthetic */ class AnalyticsRequestFactory$$ExternalSyntheticLambda0 implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return PluginDetector.pluginType;
    }
}
