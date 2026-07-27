package com.onesignal.flutter;

import H2.f;
import H2.n;
import H2.o;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
abstract class FlutterMessengerResponder {
    protected o channel;
    Context context;
    f messenger;

    private void runOnMainThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void invokeMethodOnUiThread(final String str, final HashMap hashMap) {
        runOnMainThread(new Runnable() { // from class: com.onesignal.flutter.FlutterMessengerResponder.4
            @Override // java.lang.Runnable
            public void run() {
                FlutterMessengerResponder.this.channel.a(str, hashMap, null);
            }
        });
    }

    public void replyError(final n nVar, final String str, final String str2, final Object obj) {
        runOnMainThread(new Runnable() { // from class: com.onesignal.flutter.FlutterMessengerResponder.2
            @Override // java.lang.Runnable
            public void run() {
                nVar.b(str, str2, obj);
            }
        });
    }

    public void replyNotImplemented(final n nVar) {
        runOnMainThread(new Runnable() { // from class: com.onesignal.flutter.FlutterMessengerResponder.3
            @Override // java.lang.Runnable
            public void run() {
                nVar.a();
            }
        });
    }

    public void replySuccess(final n nVar, final Object obj) {
        runOnMainThread(new Runnable() { // from class: com.onesignal.flutter.FlutterMessengerResponder.1
            @Override // java.lang.Runnable
            public void run() {
                nVar.success(obj);
            }
        });
    }
}
