package com.onesignal.core.internal.http.impl;

import com.onesignal.core.internal.config.ConfigModelStore;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class HttpConnectionFactory implements IHttpConnectionFactory {
    private final ConfigModelStore _configModelStore;

    public HttpConnectionFactory(ConfigModelStore _configModelStore) {
        i.e(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // com.onesignal.core.internal.http.impl.IHttpConnectionFactory
    public HttpURLConnection newHttpURLConnection(String url) {
        i.e(url, "url");
        URLConnection openConnection = new URL(this._configModelStore.getModel().getApiUrl() + url).openConnection();
        i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
