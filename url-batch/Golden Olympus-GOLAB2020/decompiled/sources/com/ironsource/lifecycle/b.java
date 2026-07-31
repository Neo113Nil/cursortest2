package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import com.ironsource.ok;
import com.ironsource.pk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private static final b f17067m = new b();

    /* renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f17068n = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    static final long f17069o = 700;

    /* renamed from: a, reason: collision with root package name */
    private int f17070a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f17071b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17072c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17073d = true;

    /* renamed from: e, reason: collision with root package name */
    private pk f17074e = pk.NONE;

    /* renamed from: f, reason: collision with root package name */
    private final List<ok> f17075f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f17076g = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            b.this.f();
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f17077h = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            b.this.g();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f17078i = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            b.this.h();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f17079j = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            b.this.i();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f17080k = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            b.this.j();
        }
    };

    /* renamed from: l, reason: collision with root package name */
    private final a.InterfaceC0151a f17081l = new a();

    class a implements a.InterfaceC0151a {
        a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0151a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0151a
        public void b(Activity activity) {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0151a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<ok> it = this.f17075f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<ok> it = this.f17075f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<ok> it = this.f17075f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<ok> it = this.f17075f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a a4 = com.ironsource.lifecycle.a.a(activity);
        if (a4 != null) {
            a4.d(this.f17081l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    private void a() {
        if (this.f17071b == 0) {
            this.f17072c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f17077h);
            this.f17074e = pk.PAUSED;
        }
    }

    private void b() {
        if (this.f17070a == 0 && this.f17072c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f17078i);
            this.f17073d = true;
            this.f17074e = pk.STOPPED;
        }
    }

    public static b d() {
        return f17067m;
    }

    public pk c() {
        return this.f17074e;
    }

    public boolean e() {
        return this.f17074e == pk.STOPPED;
    }

    void a(Activity activity) {
        int i4 = this.f17071b - 1;
        this.f17071b = i4;
        if (i4 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f17076g, f17069o);
        }
    }

    void b(Activity activity) {
        int i4 = this.f17071b + 1;
        this.f17071b = i4;
        if (i4 == 1) {
            if (!this.f17072c) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f17076g);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f17079j);
            this.f17072c = false;
            this.f17074e = pk.RESUMED;
        }
    }

    void c(Activity activity) {
        int i4 = this.f17070a + 1;
        this.f17070a = i4;
        if (i4 == 1 && this.f17073d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f17080k);
            this.f17073d = false;
            this.f17074e = pk.STARTED;
        }
    }

    void d(Activity activity) {
        this.f17070a--;
        b();
    }

    void a(Context context) {
        Application application;
        if (!f17068n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void b(ok okVar) {
        if (this.f17075f.contains(okVar)) {
            this.f17075f.remove(okVar);
        }
    }

    public void a(ok okVar) {
        if (!IronsourceLifecycleProvider.a() || okVar == null || this.f17075f.contains(okVar)) {
            return;
        }
        this.f17075f.add(okVar);
    }
}
