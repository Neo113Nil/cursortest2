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
import y1.ThreadFactoryC1023a;

/* loaded from: classes.dex */
public final class M implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4473a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4474b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4475c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f4476d;

    /* renamed from: e, reason: collision with root package name */
    public K f4477e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4478f;

    public M(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1023a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4476d = new ArrayDeque();
        this.f4478f = false;
        Context applicationContext = context.getApplicationContext();
        this.f4473a = applicationContext;
        this.f4474b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f4475c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f4476d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                K k7 = this.f4477e;
                if (k7 == null || !k7.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f4477e.a((L) this.f4476d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized K1.p b(Intent intent) {
        L l7;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            l7 = new L(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f4475c;
            l7.f4472b.f1428a.b(scheduledThreadPoolExecutor, new A4.b(8, scheduledThreadPoolExecutor.schedule(new A.k(8, l7), 20L, TimeUnit.SECONDS)));
            this.f4476d.add(l7);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return l7.f4472b.f1428a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        M m2;
        ArrayDeque arrayDeque;
        w1.a a7;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f4478f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f4478f) {
            return;
        }
        this.f4478f = true;
        try {
            a7 = w1.a.a();
            context = this.f4473a;
            m2 = this;
            try {
            } catch (SecurityException e7) {
                e = e7;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                m2.f4478f = false;
                while (true) {
                    arrayDeque = m2.f4476d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((L) arrayDeque.poll()).f4472b.d(null);
                }
            }
        } catch (SecurityException e8) {
            e = e8;
            m2 = this;
        }
        if (a7.c(context, context.getClass().getName(), this.f4474b, m2, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        m2.f4478f = false;
        while (true) {
            arrayDeque = m2.f4476d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((L) arrayDeque.poll()).f4472b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f4478f = false;
            if (iBinder instanceof K) {
                this.f4477e = (K) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f4476d;
            while (!arrayDeque.isEmpty()) {
                ((L) arrayDeque.poll()).f4472b.d(null);
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
