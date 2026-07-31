package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes3.dex */
public final class Xk {

    /* renamed from: a, reason: collision with root package name */
    public final C0390o f1119a;
    public final C0371n5 b;
    public final ActivityLifecycleListener c;
    public final ActivityLifecycleListener d;
    public final C0440q e;
    public final C0340m f;
    public boolean g;

    public Xk(C0390o c0390o, C0340m c0340m) {
        this(c0390o, c0340m, new C0371n5(), new C0440q());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0371n5 c0371n5 = this.b;
            InterfaceC0072be interfaceC0072be = new InterfaceC0072be() { // from class: io.appmetrica.analytics.impl.Xk$$ExternalSyntheticLambda3
                @Override // io.appmetrica.analytics.impl.InterfaceC0072be
                public final void consume(Object obj) {
                    Xk.this.a(activity, (C0251ic) obj);
                }
            };
            c0371n5.getClass();
            C0088c4.l().c.a().execute(new RunnableC0346m5(c0371n5, interfaceC0072be));
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0371n5 c0371n5 = this.b;
            InterfaceC0072be interfaceC0072be = new InterfaceC0072be() { // from class: io.appmetrica.analytics.impl.Xk$$ExternalSyntheticLambda0
                @Override // io.appmetrica.analytics.impl.InterfaceC0072be
                public final void consume(Object obj) {
                    Xk.this.b(activity, (C0251ic) obj);
                }
            };
            c0371n5.getClass();
            C0088c4.l().c.a().execute(new RunnableC0346m5(c0371n5, interfaceC0072be));
        }
    }

    public Xk(C0390o c0390o, C0340m c0340m, C0371n5 c0371n5, C0440q c0440q) {
        this.g = false;
        this.f1119a = c0390o;
        this.f = c0340m;
        this.b = c0371n5;
        this.e = c0440q;
        this.c = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.Xk$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                Xk.this.a(activity, activityEvent);
            }
        };
        this.d = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.Xk$$ExternalSyntheticLambda2
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                Xk.this.b(activity, activityEvent);
            }
        };
    }

    public final void b(Activity activity, C0251ic c0251ic) {
        if (this.g && this.e.a(activity, EnumC0415p.PAUSED)) {
            c0251ic.b(activity);
        }
    }

    public final void a(Activity activity, C0251ic c0251ic) {
        if (this.g && this.e.a(activity, EnumC0415p.RESUMED)) {
            c0251ic.a(activity);
        }
    }

    public final synchronized EnumC0365n a() {
        if (!this.g) {
            this.f1119a.registerListener(this.c, ActivityEvent.RESUMED);
            this.f1119a.registerListener(this.d, ActivityEvent.PAUSED);
            this.g = true;
        }
        return this.f1119a.b;
    }
}
