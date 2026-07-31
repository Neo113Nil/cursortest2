package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* loaded from: classes11.dex */
public class a extends com.applovin.impl.b {
    private final com.applovin.impl.c a;
    private final o b;
    private final String c;
    private InterfaceC0078a d;
    private c3 e;
    private String f;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0078a {
        void b(c3 c3Var);
    }

    a(k kVar) {
        this.b = kVar.O();
        this.a = kVar.e();
        this.c = n7.a(k.o(), "AdActivityObserver", kVar);
    }

    public void a(c3 c3Var, InterfaceC0078a interfaceC0078a) {
        if (o.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.d = interfaceC0078a;
        this.e = c3Var;
        this.a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.c) && this.e.y0()) {
            if (o.a()) {
                this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.d != null) {
                if (o.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
            return;
        }
        if (this.f == null) {
            this.f = activity.getClass().getName();
            if (o.a()) {
                this.b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f);
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f)) {
            if (o.a()) {
                this.b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f);
            }
            if (this.d != null) {
                if (o.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
        }
    }

    public void a() {
        if (o.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.a.b(this);
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
