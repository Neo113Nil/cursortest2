package Y;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0068h;
import b0.C0081c;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0068h, i0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0051q f1025a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f1026b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f1027c = null;
    public i0.e d = null;

    public Q(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, androidx.lifecycle.O o2) {
        this.f1025a = abstractComponentCallbacksC0051q;
        this.f1026b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0068h
    public final C0081c a() {
        Application application;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1025a;
        Context applicationContext = abstractComponentCallbacksC0051q.C().getApplicationContext();
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
        C0081c c0081c = new C0081c(0);
        LinkedHashMap linkedHashMap = c0081c.f1661a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1488a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1489b, this);
        Bundle bundle = abstractComponentCallbacksC0051q.f1131f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1490c, bundle);
        }
        return c0081c;
    }

    @Override // i0.f
    public final i0.d b() {
        f();
        return this.d.f2566b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f1026b;
    }

    public final void d(EnumC0072l enumC0072l) {
        this.f1027c.d(enumC0072l);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        f();
        return this.f1027c;
    }

    public final void f() {
        if (this.f1027c == null) {
            this.f1027c = new androidx.lifecycle.t(this);
            i0.e eVar = new i0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
