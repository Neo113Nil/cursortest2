package com.onesignal.core.internal.http.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c implements d {
    private final com.onesignal.core.internal.config.c _configModelStore;

    public c(com.onesignal.core.internal.config.c _configModelStore) {
        i.e(_configModelStore, "_configModelStore");
        this._configModelStore = _configModelStore;
    }

    @Override // com.onesignal.core.internal.http.impl.d
    public HttpURLConnection newHttpURLConnection(String url) {
        i.e(url, "url");
        URLConnection openConnection = new URL(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getApiUrl() + url).openConnection();
        i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) openConnection;
    }
}
