package com.onesignal.core.internal.http.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements c {
    private final com.onesignal.core.internal.config.b _configModelStore;

    public b(com.onesignal.core.internal.config.b bVar) {
        bVar.getClass();
        this._configModelStore = bVar;
    }

    @Override // com.onesignal.core.internal.http.impl.c
    public HttpURLConnection newHttpURLConnection(String str) {
        str.getClass();
        URLConnection openConnection = new URL(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getApiUrl() + str).openConnection();
        openConnection.getClass();
        return (HttpURLConnection) openConnection;
    }
}
