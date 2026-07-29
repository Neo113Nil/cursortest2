package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.InterfaceC0064h;
import h0.C0132d;
import h0.C0133e;
import h0.InterfaceC0134f;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0064h, InterfaceC0134f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f861a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f862b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f863c = null;
    public C0133e d = null;

    public Q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, androidx.lifecycle.O o2) {
        this.f861a = abstractComponentCallbacksC0048q;
        this.f862b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0064h
    public final a0.c a() {
        Application application;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f861a;
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
        a0.c cVar = new a0.c(0);
        LinkedHashMap linkedHashMap = cVar.f1102a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1335a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1336b, this);
        Bundle bundle = abstractComponentCallbacksC0048q.f967f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1337c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        f();
        return this.d.f2374b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f862b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f863c;
    }

    public final void e(EnumC0068l enumC0068l) {
        this.f863c.d(enumC0068l);
    }

    public final void f() {
        if (this.f863c == null) {
            this.f863c = new androidx.lifecycle.t(this);
            C0133e c0133e = new C0133e(this);
            this.d = c0133e;
            c0133e.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
