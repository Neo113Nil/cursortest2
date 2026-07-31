package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.s;

/* loaded from: classes.dex */
public class r implements i {

    /* renamed from: n, reason: collision with root package name */
    private static final r f911n = new r();

    /* renamed from: j, reason: collision with root package name */
    private Handler f916j;

    /* renamed from: f, reason: collision with root package name */
    private int f912f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f913g = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f914h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f915i = true;

    /* renamed from: k, reason: collision with root package name */
    private final j f917k = new j(this);

    /* renamed from: l, reason: collision with root package name */
    private Runnable f918l = new a();

    /* renamed from: m, reason: collision with root package name */
    s.a f919m = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.g();
            r.this.j();
        }
    }

    class b implements s.a {
        b() {
        }

        @Override // androidx.lifecycle.s.a
        public void a() {
        }

        @Override // androidx.lifecycle.s.a
        public void b() {
            r.this.d();
        }

        @Override // androidx.lifecycle.s.a
        public void onResume() {
            r.this.c();
        }
    }

    class c extends androidx.lifecycle.b {

        class a extends androidx.lifecycle.b {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                r.this.c();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                r.this.d();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                s.f(activity).h(r.this.f919m);
            }
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            r.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            r.this.e();
        }
    }

    private r() {
    }

    public static i k() {
        return f911n;
    }

    static void l(Context context) {
        f911n.f(context);
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f917k;
    }

    void b() {
        int i7 = this.f913g - 1;
        this.f913g = i7;
        if (i7 == 0) {
            this.f916j.postDelayed(this.f918l, 700L);
        }
    }

    void c() {
        int i7 = this.f913g + 1;
        this.f913g = i7;
        if (i7 == 1) {
            if (!this.f914h) {
                this.f916j.removeCallbacks(this.f918l);
            } else {
                this.f917k.h(e.b.ON_RESUME);
                this.f914h = false;
            }
        }
    }

    void d() {
        int i7 = this.f912f + 1;
        this.f912f = i7;
        if (i7 == 1 && this.f915i) {
            this.f917k.h(e.b.ON_START);
            this.f915i = false;
        }
    }

    void e() {
        this.f912f--;
        j();
    }

    void f(Context context) {
        this.f916j = new Handler();
        this.f917k.h(e.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void g() {
        if (this.f913g == 0) {
            this.f914h = true;
            this.f917k.h(e.b.ON_PAUSE);
        }
    }

    void j() {
        if (this.f912f == 0 && this.f914h) {
            this.f917k.h(e.b.ON_STOP);
            this.f915i = true;
        }
    }
}
