package X;

import a0.C0058c;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.InterfaceC0068h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0068h, h0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f938a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f939b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f940c = null;
    public h0.e d = null;

    public Q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, androidx.lifecycle.O o2) {
        this.f938a = abstractComponentCallbacksC0048q;
        this.f939b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0068h
    public final C0058c a() {
        Application application;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f938a;
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
        C0058c c0058c = new C0058c(0);
        LinkedHashMap linkedHashMap = c0058c.f1165a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1398a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1399b, this);
        Bundle bundle = abstractComponentCallbacksC0048q.f1044f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1400c, bundle);
        }
        return c0058c;
    }

    @Override // h0.f
    public final h0.d b() {
        f();
        return this.d.f2447b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f939b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f940c;
    }

    public final void e(EnumC0072l enumC0072l) {
        this.f940c.d(enumC0072l);
    }

    public final void f() {
        if (this.f940c == null) {
            this.f940c = new androidx.lifecycle.t(this);
            h0.e eVar = new h0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
