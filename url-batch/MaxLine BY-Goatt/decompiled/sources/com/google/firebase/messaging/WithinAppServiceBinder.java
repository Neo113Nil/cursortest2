package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.WithinAppServiceConnection;
import defpackage.jt2;
import defpackage.th;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface IntentHandler {
        jt2 handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        int i = 3;
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "service received new intent via bind strategy");
        }
        this.intentHandler.handle(bindRequest.intent).c(new th(1), new c(i, bindRequest));
    }
}
