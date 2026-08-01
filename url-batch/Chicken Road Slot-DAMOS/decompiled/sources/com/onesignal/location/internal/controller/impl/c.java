package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public c(GoogleApiClient googleApiClient) {
        googleApiClient.getClass();
        this.realInstance = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    public final z6.b blockingConnect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("blockingConnect", null).invoke(this.realInstance, null);
            invoke.getClass();
            return (z6.b) invoke;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", null).invoke(this.realInstance, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", null).invoke(this.realInstance, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final GoogleApiClient getRealInstance() {
        return this.realInstance;
    }
}
