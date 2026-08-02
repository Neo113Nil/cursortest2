package io.appmetrica.analytics.networkapi;

import io.appmetrica.analytics.networkapi.NetworkClientSettings;

/* loaded from: classes.dex */
public abstract class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkClientSettings f13243a;

    public static abstract class Builder {

        /* renamed from: a, reason: collision with root package name */
        private NetworkClientSettings f13244a = new NetworkClientSettings.Builder().build();

        public abstract NetworkClient build();

        public final NetworkClientSettings getSettings() {
            return this.f13244a;
        }

        public final Builder withSettings(NetworkClientSettings networkClientSettings) {
            this.f13244a = networkClientSettings;
            return this;
        }
    }

    public NetworkClient(NetworkClientSettings networkClientSettings) {
        this.f13243a = networkClientSettings;
    }

    public final NetworkClientSettings getSettings() {
        return this.f13243a;
    }

    public abstract Call newCall(Request request);
}
