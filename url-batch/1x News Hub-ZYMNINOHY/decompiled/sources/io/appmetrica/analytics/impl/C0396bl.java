package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396bl {

    /* renamed from: a, reason: collision with root package name */
    public final C0710o f7097a;

    /* renamed from: b, reason: collision with root package name */
    public final C0845t5 f7098b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f7099c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f7100d;

    /* renamed from: e, reason: collision with root package name */
    public final C0762q f7101e;
    public final C0658m f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7102g;

    public C0396bl(C0710o c0710o, C0658m c0658m) {
        this(c0710o, c0658m, new C0845t5(), new C0762q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f7102g) {
                    C0845t5 c0845t5 = this.f7098b;
                    So so = new So(this, activity, 0);
                    c0845t5.getClass();
                    C0585j4.l().f7594c.a().execute(new RunnableC0819s5(c0845t5, so));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f7102g) {
                    C0845t5 c0845t5 = this.f7098b;
                    So so = new So(this, activity, 1);
                    c0845t5.getClass();
                    C0585j4.l().f7594c.a().execute(new RunnableC0819s5(c0845t5, so));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0396bl(C0710o c0710o, C0658m c0658m, C0845t5 c0845t5, C0762q c0762q) {
        this.f7102g = false;
        this.f7097a = c0710o;
        this.f = c0658m;
        this.f7098b = c0845t5;
        this.f7101e = c0762q;
        final int i3 = 0;
        this.f7099c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.To

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0396bl f6730b;

            {
                this.f6730b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i3) {
                    case 0:
                        this.f6730b.a(activity, activityEvent);
                        break;
                    default:
                        this.f6730b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f7100d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.To

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0396bl f6730b;

            {
                this.f6730b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i4) {
                    case 0:
                        this.f6730b.a(activity, activityEvent);
                        break;
                    default:
                        this.f6730b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final synchronized EnumC0684n a() {
        try {
            if (!this.f7102g) {
                this.f7097a.registerListener(this.f7099c, ActivityEvent.RESUMED);
                this.f7097a.registerListener(this.f7100d, ActivityEvent.PAUSED);
                this.f7102g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7097a.f7981b;
    }

    public final void b(Activity activity, C0723oc c0723oc) {
        if (this.f7101e.a(activity, EnumC0736p.PAUSED)) {
            c0723oc.b(activity);
        }
    }

    public final void a(Activity activity, C0723oc c0723oc) {
        if (this.f7101e.a(activity, EnumC0736p.RESUMED)) {
            c0723oc.a(activity);
        }
    }
}
