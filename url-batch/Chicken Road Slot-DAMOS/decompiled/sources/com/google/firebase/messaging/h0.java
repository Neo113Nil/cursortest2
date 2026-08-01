package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3139a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f3140b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3141c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3142d;

    /* renamed from: e, reason: collision with root package name */
    public f0 f3143e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3144f;

    public h0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new h7.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3142d = new ArrayDeque();
        this.f3144f = false;
        Context applicationContext = context.getApplicationContext();
        this.f3139a = applicationContext;
        this.f3140b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f3141c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f3142d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                f0 f0Var = this.f3143e;
                if (f0Var == null || !f0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f3143e.a((g0) this.f3142d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized w7.n b(Intent intent) {
        g0 g0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            g0Var = new g0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f3141c;
            g0Var.f3136b.f10117a.b(scheduledThreadPoolExecutor, new b1.h(5, scheduledThreadPoolExecutor.schedule(new androidx.lifecycle.d0(4, g0Var), 20L, TimeUnit.SECONDS)));
            this.f3142d.add(g0Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return g0Var.f3136b.f10117a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f3144f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f3144f) {
            return;
        }
        this.f3144f = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e2);
        }
        if (f7.a.b().a(this.f3139a, this.f3140b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f3144f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f3142d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((g0) arrayDeque.poll()).f3136b.c(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f3144f = false;
            if (iBinder instanceof f0) {
                this.f3143e = (f0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f3142d;
            while (!arrayDeque.isEmpty()) {
                ((g0) arrayDeque.poll()).f3136b.c(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
