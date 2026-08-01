package Y;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0067h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0067h, j0.f, androidx.lifecycle.S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0050q f1357a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.Q f1358b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.v f1359c = null;
    public j0.e d = null;

    public Q(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, androidx.lifecycle.Q q2) {
        this.f1357a = abstractComponentCallbacksC0050q;
        this.f1358b = q2;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final b0.c a() {
        Application application;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1357a;
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
        b0.c cVar = new b0.c(0);
        LinkedHashMap linkedHashMap = cVar.f2040a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1861a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1862b, this);
        Bundle bundle = abstractComponentCallbacksC0050q.f1463f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1863c, bundle);
        }
        return cVar;
    }

    @Override // j0.f
    public final j0.d b() {
        f();
        return this.d.f3084b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        f();
        return this.f1358b;
    }

    public final void d(EnumC0071l enumC0071l) {
        this.f1359c.d(enumC0071l);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        f();
        return this.f1359c;
    }

    public final void f() {
        if (this.f1359c == null) {
            this.f1359c = new androidx.lifecycle.v(this);
            j0.e eVar = new j0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.J.d(this);
        }
    }
}
