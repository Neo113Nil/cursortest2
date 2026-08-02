package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final C0832o f11194a;

    /* renamed from: b, reason: collision with root package name */
    public final C0786m5 f11195b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f11196c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f11197d;

    /* renamed from: e, reason: collision with root package name */
    public final C0884q f11198e;

    /* renamed from: f, reason: collision with root package name */
    public final C0780m f11199f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11200g;

    public Wk(C0832o c0832o, C0780m c0780m) {
        this(c0832o, c0780m, new C0786m5(), new C0884q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0786m5 c0786m5 = this.f11195b;
            Uo uo = new Uo(this, activity, 0);
            c0786m5.getClass();
            C0501b4.l().f11457c.a().execute(new RunnableC0760l5(c0786m5, uo));
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0786m5 c0786m5 = this.f11195b;
            Uo uo = new Uo(this, activity, 1);
            c0786m5.getClass();
            C0501b4.l().f11457c.a().execute(new RunnableC0760l5(c0786m5, uo));
        }
    }

    public Wk(C0832o c0832o, C0780m c0780m, C0786m5 c0786m5, C0884q c0884q) {
        this.f11200g = false;
        this.f11194a = c0832o;
        this.f11199f = c0780m;
        this.f11195b = c0786m5;
        this.f11198e = c0884q;
        final int i4 = 0;
        this.f11196c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.To

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wk f11016b;

            {
                this.f11016b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i4) {
                    case 0:
                        this.f11016b.a(activity, activityEvent);
                        break;
                    default:
                        this.f11016b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i5 = 1;
        this.f11197d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.To

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wk f11016b;

            {
                this.f11016b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i5) {
                    case 0:
                        this.f11016b.a(activity, activityEvent);
                        break;
                    default:
                        this.f11016b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final void a(Activity activity, C0664hc c0664hc) {
        if (this.f11200g && this.f11198e.a(activity, EnumC0858p.RESUMED)) {
            c0664hc.a(activity);
        }
    }

    public final void b(Activity activity, C0664hc c0664hc) {
        if (this.f11200g && this.f11198e.a(activity, EnumC0858p.PAUSED)) {
            c0664hc.b(activity);
        }
    }

    public final synchronized EnumC0806n a() {
        try {
            if (!this.f11200g) {
                this.f11194a.registerListener(this.f11196c, ActivityEvent.RESUMED);
                this.f11194a.registerListener(this.f11197d, ActivityEvent.PAUSED);
                this.f11200g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11194a.f12478b;
    }
}
