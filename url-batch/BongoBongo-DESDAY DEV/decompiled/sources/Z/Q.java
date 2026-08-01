package Z;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.InterfaceC0074h;
import c0.C0092c;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0074h, j0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0050q f1073a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f1074b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f1075c = null;
    public j0.e d = null;

    public Q(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, androidx.lifecycle.O o2) {
        this.f1073a = abstractComponentCallbacksC0050q;
        this.f1074b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0074h
    public final C0092c a() {
        Application application;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1073a;
        Context applicationContext = abstractComponentCallbacksC0050q.C().getApplicationContext();
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
        C0092c c0092c = new C0092c(0);
        LinkedHashMap linkedHashMap = c0092c.f1734a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1549a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1550b, this);
        Bundle bundle = abstractComponentCallbacksC0050q.f1183f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1551c, bundle);
        }
        return c0092c;
    }

    @Override // j0.f
    public final j0.d b() {
        f();
        return this.d.f2666b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f1074b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f1075c;
    }

    public final void e(EnumC0078l enumC0078l) {
        this.f1075c.d(enumC0078l);
    }

    public final void f() {
        if (this.f1075c == null) {
            this.f1075c = new androidx.lifecycle.t(this);
            j0.e eVar = new j0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
