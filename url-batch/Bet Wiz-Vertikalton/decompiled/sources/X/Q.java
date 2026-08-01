package X;

import a0.C0057c;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.InterfaceC0065h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0065h, h0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f978a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f979b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f980c = null;
    public h0.e d = null;

    public Q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, androidx.lifecycle.O o2) {
        this.f978a = abstractComponentCallbacksC0048q;
        this.f979b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final C0057c a() {
        Application application;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f978a;
        Context applicationContext = abstractComponentCallbacksC0048q.C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0057c c0057c = new C0057c(0);
        LinkedHashMap linkedHashMap = c0057c.f1209a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1443a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1444b, this);
        Bundle bundle = abstractComponentCallbacksC0048q.f1084f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1445c, bundle);
        }
        return c0057c;
    }

    @Override // h0.f
    public final h0.d b() {
        f();
        return this.d.f2512b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f979b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f980c;
    }

    public final void e(EnumC0069l enumC0069l) {
        this.f980c.d(enumC0069l);
    }

    public final void f() {
        if (this.f980c == null) {
            this.f980c = new androidx.lifecycle.t(this);
            h0.e eVar = new h0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
