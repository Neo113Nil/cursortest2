package X;

import a0.C0057c;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0067h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0067h, h0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0047q f952a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f953b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f954c = null;
    public h0.e d = null;

    public Q(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, androidx.lifecycle.O o2) {
        this.f952a = abstractComponentCallbacksC0047q;
        this.f953b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0057c a() {
        Application application;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f952a;
        Context applicationContext = abstractComponentCallbacksC0047q.C().getApplicationContext();
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
        LinkedHashMap linkedHashMap = c0057c.f1179a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1415a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1416b, this);
        Bundle bundle = abstractComponentCallbacksC0047q.f1058f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1417c, bundle);
        }
        return c0057c;
    }

    @Override // h0.f
    public final h0.d b() {
        f();
        return this.d.f2486b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f953b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f954c;
    }

    public final void e(EnumC0071l enumC0071l) {
        this.f954c.d(enumC0071l);
    }

    public final void f() {
        if (this.f954c == null) {
            this.f954c = new androidx.lifecycle.t(this);
            h0.e eVar = new h0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
