package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fq1 implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public dq1 e;
    public boolean f;

    public fq1(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new po0("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                dq1 dq1Var = this.e;
                if (dq1Var == null || !dq1Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.e.a((eq1) this.d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zu1 b(Intent intent) {
        eq1 eq1Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            eq1Var = new eq1(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
            eq1Var.b.a.b(scheduledThreadPoolExecutor, new m2(6, scheduledThreadPoolExecutor.schedule(new e4(11, eq1Var), 20L, TimeUnit.SECONDS)));
            this.d.add(eq1Var);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return eq1Var.b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:18:0x0054->B:20:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        fq1 fq1Var;
        ArrayDeque arrayDeque;
        s40 s;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            s = s40.s();
            context = this.a;
            fq1Var = this;
            try {
            } catch (SecurityException e) {
                e = e;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                fq1Var.f = false;
                while (true) {
                    arrayDeque = fq1Var.d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((eq1) arrayDeque.poll()).b.c(null);
                }
            }
        } catch (SecurityException e2) {
            e = e2;
            fq1Var = this;
        }
        if (s.F(context, context.getClass().getName(), this.b, fq1Var, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        fq1Var.f = false;
        while (true) {
            arrayDeque = fq1Var.d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((eq1) arrayDeque.poll()).b.c(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f = false;
            if (iBinder instanceof dq1) {
                this.e = (dq1) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.d;
            while (!arrayDeque.isEmpty()) {
                ((eq1) arrayDeque.poll()).b.c(null);
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
