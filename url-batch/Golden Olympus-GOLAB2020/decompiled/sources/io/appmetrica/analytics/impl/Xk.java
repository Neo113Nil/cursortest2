package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class Xk {

    /* renamed from: a, reason: collision with root package name */
    public final C2818n f38532a;

    /* renamed from: b, reason: collision with root package name */
    public final H5 f38533b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f38534c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f38535d;

    /* renamed from: e, reason: collision with root package name */
    public final C2870p f38536e;

    /* renamed from: f, reason: collision with root package name */
    public final C2766l f38537f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38538g;

    public Xk(C2818n c2818n, C2766l c2766l) {
        this(c2818n, c2766l, new H5(), new C2870p());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f38538g) {
                    H5 h5 = this.f38533b;
                    InterfaceC2885pe interfaceC2885pe = new InterfaceC2885pe() { // from class: io.appmetrica.analytics.impl.bp
                        @Override // io.appmetrica.analytics.impl.InterfaceC2885pe
                        public final void consume(Object obj) {
                            Xk.this.a(activity, (Cc) obj);
                        }
                    };
                    h5.getClass();
                    C3082x4.l().f40118c.a().execute(new G5(h5, interfaceC2885pe));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f38538g) {
                    H5 h5 = this.f38533b;
                    InterfaceC2885pe interfaceC2885pe = new InterfaceC2885pe() { // from class: io.appmetrica.analytics.impl.Yo
                        @Override // io.appmetrica.analytics.impl.InterfaceC2885pe
                        public final void consume(Object obj) {
                            Xk.this.b(activity, (Cc) obj);
                        }
                    };
                    h5.getClass();
                    C3082x4.l().f40118c.a().execute(new G5(h5, interfaceC2885pe));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Xk(C2818n c2818n, C2766l c2766l, H5 h5, C2870p c2870p) {
        this.f38538g = false;
        this.f38532a = c2818n;
        this.f38537f = c2766l;
        this.f38533b = h5;
        this.f38536e = c2870p;
        this.f38534c = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.Zo
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                Xk.this.a(activity, activityEvent);
            }
        };
        this.f38535d = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.ap
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                Xk.this.b(activity, activityEvent);
            }
        };
    }

    public final synchronized EnumC2792m a() {
        try {
            if (!this.f38538g) {
                this.f38532a.registerListener(this.f38534c, ActivityEvent.RESUMED);
                this.f38532a.registerListener(this.f38535d, ActivityEvent.PAUSED);
                this.f38538g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f38532a.f39463b;
    }

    public final void b(Activity activity, Cc cc) {
        if (this.f38536e.a(activity, EnumC2844o.PAUSED)) {
            cc.b(activity);
        }
    }

    public final void a(Activity activity, Cc cc) {
        if (this.f38536e.a(activity, EnumC2844o.RESUMED)) {
            cc.a(activity);
        }
    }
}
