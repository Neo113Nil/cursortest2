package Z;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0077l;
import androidx.lifecycle.InterfaceC0073h;
import c0.C0103c;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0073h, j0.f, androidx.lifecycle.S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0053q f1503a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.Q f1504b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.v f1505c = null;

    /* renamed from: d, reason: collision with root package name */
    public j0.e f1506d = null;

    public Q(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q, androidx.lifecycle.Q q2) {
        this.f1503a = abstractComponentCallbacksC0053q;
        this.f1504b = q2;
    }

    @Override // androidx.lifecycle.InterfaceC0073h
    public final C0103c a() {
        Application application;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1503a;
        Context applicationContext = abstractComponentCallbacksC0053q.C().getApplicationContext();
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
        C0103c c0103c = new C0103c(0);
        LinkedHashMap linkedHashMap = c0103c.f2228a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1912d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1909a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1910b, this);
        Bundle bundle = abstractComponentCallbacksC0053q.f1612f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1911c, bundle);
        }
        return c0103c;
    }

    @Override // j0.f
    public final j0.d b() {
        f();
        return this.f1506d.f3167b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        f();
        return this.f1504b;
    }

    public final void d(EnumC0077l enumC0077l) {
        this.f1505c.d(enumC0077l);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        f();
        return this.f1505c;
    }

    public final void f() {
        if (this.f1505c == null) {
            this.f1505c = new androidx.lifecycle.v(this);
            j0.e eVar = new j0.e(this);
            this.f1506d = eVar;
            eVar.a();
            androidx.lifecycle.J.d(this);
        }
    }
}
