package io.appmetrica.analytics;

import dev.hyo.openiap.OpenIapError;

/* loaded from: classes3.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN(OpenIapError.UnknownError.MESSAGE);


        /* renamed from: a, reason: collision with root package name */
        private final String f543a;

        Error(String str) {
            this.f543a = str;
        }

        public String getDescription() {
            return this.f543a;
        }
    }

    void onDeeplinkLoaded(String str);

    void onError(Error error, String str);
}
