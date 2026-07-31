package H1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class N implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f926a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f927b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f928c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f929d;

    /* renamed from: e, reason: collision with root package name */
    public L f930e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f931f;

    public N(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new Z0.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f929d = new ArrayDeque();
        this.f931f = false;
        Context applicationContext = context.getApplicationContext();
        this.f926a = applicationContext;
        this.f927b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f928c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f929d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                L l7 = this.f930e;
                if (l7 == null || !l7.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f930e.a((M) this.f929d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized k1.n b(Intent intent) {
        M m4;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            m4 = new M(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f928c;
            m4.f925b.f5157a.a(scheduledThreadPoolExecutor, new B0.b(5, scheduledThreadPoolExecutor.schedule(new RunnableC0139m(2, m4), 20L, TimeUnit.SECONDS)));
            this.f929d.add(m4);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return m4.f925b.f5157a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:20:0x0053->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        N n7;
        ArrayDeque arrayDeque;
        X0.a a7;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f931f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f931f) {
            return;
        }
        this.f931f = true;
        try {
            a7 = X0.a.a();
            context = this.f926a;
            n7 = this;
            try {
            } catch (SecurityException e4) {
                e = e4;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
                n7.f931f = false;
                while (true) {
                    arrayDeque = n7.f929d;
                    if (!arrayDeque.isEmpty()) {
                    }
                    ((M) arrayDeque.poll()).f925b.c(null);
                }
            }
        } catch (SecurityException e7) {
            e = e7;
            n7 = this;
        }
        if (a7.c(context, context.getClass().getName(), this.f927b, n7, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        n7.f931f = false;
        while (true) {
            arrayDeque = n7.f929d;
            if (!arrayDeque.isEmpty()) {
                return;
            } else {
                ((M) arrayDeque.poll()).f925b.c(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f931f = false;
            if (iBinder instanceof L) {
                this.f930e = (L) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f929d;
            while (!arrayDeque.isEmpty()) {
                ((M) arrayDeque.poll()).f925b.c(null);
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
