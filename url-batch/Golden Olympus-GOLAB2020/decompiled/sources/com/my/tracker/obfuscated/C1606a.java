package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1606a {

    /* renamed from: d, reason: collision with root package name */
    final C1631f0 f21094d;

    /* renamed from: e, reason: collision with root package name */
    final C1712z2 f21095e;

    /* renamed from: f, reason: collision with root package name */
    final C1703x1 f21096f;

    /* renamed from: g, reason: collision with root package name */
    final Application f21097g;

    /* renamed from: a, reason: collision with root package name */
    final Map f21091a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    final Handler f21092b = AbstractC1658m.f21416a;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f21093c = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    long f21101k = 0;

    /* renamed from: l, reason: collision with root package name */
    long f21102l = 0;

    /* renamed from: h, reason: collision with root package name */
    final Runnable f21098h = new Runnable() { // from class: com.my.tracker.obfuscated.B
        @Override // java.lang.Runnable
        public final void run() {
            C1606a.this.b();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    final Runnable f21099i = new Runnable() { // from class: com.my.tracker.obfuscated.C
        @Override // java.lang.Runnable
        public final void run() {
            C1606a.this.c();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    final Runnable f21100j = new Runnable() { // from class: com.my.tracker.obfuscated.D
        @Override // java.lang.Runnable
        public final void run() {
            C1606a.this.d();
        }
    };

    /* renamed from: com.my.tracker.obfuscated.a$a, reason: collision with other inner class name */
    private final class C0173a implements Application.ActivityLifecycleCallbacks {
        private C0173a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C1606a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C1606a.this.c(activity);
        }
    }

    private C1606a(C1631f0 c1631f0, C1712z2 c1712z2, C1703x1 c1703x1, Application application) {
        this.f21094d = c1631f0;
        this.f21095e = c1712z2;
        this.f21096f = c1703x1;
        this.f21097g = application;
    }

    public void e() {
        if (this.f21093c.get()) {
            AbstractC1658m.f(this.f21099i);
        }
    }

    void f() {
        AbstractC1708y2.a("ActivityHandler: timer tick for buffering period");
        this.f21094d.a();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f21093c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(AbstractC1700w2.a(this.f21095e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        C1676q1.a(this.f21097g).d(AbstractC1700w2.b(this.f21101k));
    }

    public void a() {
        this.f21097g.registerActivityLifecycleCallbacks(new C0173a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.f21091a.put(activity, Boolean.TRUE) != null || this.f21091a.size() > 1) {
            return;
        }
        C1661m2.d().a();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f21101k >= AbstractC1700w2.a(this.f21095e.i())) {
            this.f21096f.c();
            if (this.f21095e.u()) {
                this.f21094d.g();
                a(AbstractC1700w2.a(this.f21095e.e()));
                return;
            }
        }
        long j4 = this.f21102l - currentTimeMillis;
        if (j4 > 0) {
            a(j4);
        } else {
            f();
        }
    }

    void c(Activity activity) {
        if (this.f21091a.remove(activity) == null || !this.f21091a.isEmpty()) {
            return;
        }
        C1661m2.d().b();
        this.f21093c.set(false);
        this.f21092b.removeCallbacks(this.f21098h);
        this.f21101k = System.currentTimeMillis();
        AbstractC1658m.a(this.f21100j);
    }

    public void d(final Activity activity) {
        AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.A
            @Override // java.lang.Runnable
            public final void run() {
                C1606a.this.a(activity);
            }
        });
    }

    public static C1606a a(C1631f0 c1631f0, C1712z2 c1712z2, C1703x1 c1703x1, Application application) {
        return new C1606a(c1631f0, c1712z2, c1703x1, application);
    }

    void a(long j4) {
        this.f21092b.removeCallbacks(this.f21098h);
        this.f21093c.set(true);
        this.f21092b.postDelayed(this.f21098h, j4);
        this.f21102l = System.currentTimeMillis() + j4;
    }
}
