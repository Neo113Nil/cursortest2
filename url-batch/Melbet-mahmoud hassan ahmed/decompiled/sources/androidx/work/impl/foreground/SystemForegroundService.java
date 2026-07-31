package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.l;
import androidx.work.impl.foreground.a;
import d0.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends l implements a.b {

    /* renamed from: k, reason: collision with root package name */
    private static final String f1520k = j.f("SystemFgService");

    /* renamed from: l, reason: collision with root package name */
    private static SystemForegroundService f1521l = null;

    /* renamed from: g, reason: collision with root package name */
    private Handler f1522g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1523h;

    /* renamed from: i, reason: collision with root package name */
    androidx.work.impl.foreground.a f1524i;

    /* renamed from: j, reason: collision with root package name */
    NotificationManager f1525j;

    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1526f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Notification f1527g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f1528h;

        a(int i7, Notification notification, int i8) {
            this.f1526f = i7;
            this.f1527g = notification;
            this.f1528h = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f1526f, this.f1527g, this.f1528h);
            } else {
                SystemForegroundService.this.startForeground(this.f1526f, this.f1527g);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1530f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Notification f1531g;

        b(int i7, Notification notification) {
            this.f1530f = i7;
            this.f1531g = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f1525j.notify(this.f1530f, this.f1531g);
        }
    }

    class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1533f;

        c(int i7) {
            this.f1533f = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f1525j.cancel(this.f1533f);
        }
    }

    private void f() {
        this.f1522g = new Handler(Looper.getMainLooper());
        this.f1525j = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f1524i = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void B() {
        this.f1523h = true;
        j.c().a(f1520k, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f1521l = null;
        stopSelf();
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i7) {
        this.f1522g.post(new c(i7));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i7, int i8, Notification notification) {
        this.f1522g.post(new a(i7, notification, i8));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i7, Notification notification) {
        this.f1522g.post(new b(i7, notification));
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        f1521l = this;
        f();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1524i.k();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f1523h) {
            j.c().d(f1520k, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1524i.k();
            f();
            this.f1523h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1524i.l(intent);
        return 3;
    }
}
