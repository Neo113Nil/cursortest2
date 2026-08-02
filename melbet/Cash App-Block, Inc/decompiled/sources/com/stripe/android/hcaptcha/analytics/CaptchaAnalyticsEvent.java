package com.stripe.android.hcaptcha.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public interface CaptchaAnalyticsEvent extends AnalyticsEvent {
    default Map getAdditionalParams() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    String getSiteKey();
}
