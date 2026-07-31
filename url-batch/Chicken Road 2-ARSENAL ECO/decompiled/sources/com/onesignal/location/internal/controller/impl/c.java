package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public c(GoogleApiClient realInstance) {
        i.e(realInstance, "realInstance");
        this.realInstance = realInstance;
        this.googleApiClientListenerClass = realInstance.getClass();
    }

    public final R0.a blockingConnect() {
        try {
            Object invoke = this.googleApiClientListenerClass.getMethod("blockingConnect", null).invoke(this.realInstance, null);
            i.c(invoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (R0.a) invoke;
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
