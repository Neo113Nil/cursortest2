package X;

import a0.C0059c;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0067h;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0067h, h0.f, androidx.lifecycle.S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f1004a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.Q f1005b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.v f1006c = null;
    public h0.e d = null;

    public Q(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, androidx.lifecycle.Q q2) {
        this.f1004a = abstractComponentCallbacksC0048q;
        this.f1005b = q2;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0059c a() {
        Application application;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1004a;
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
        C0059c c0059c = new C0059c(0);
        LinkedHashMap linkedHashMap = c0059c.f1243a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1480a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1481b, this);
        Bundle bundle = abstractComponentCallbacksC0048q.f1110f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1482c, bundle);
        }
        return c0059c;
    }

    @Override // h0.f
    public final h0.d b() {
        f();
        return this.d.f2580b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        f();
        return this.f1005b;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        f();
        return this.f1006c;
    }

    public final void e(EnumC0071l enumC0071l) {
        this.f1006c.d(enumC0071l);
    }

    public final void f() {
        if (this.f1006c == null) {
            this.f1006c = new androidx.lifecycle.v(this);
            h0.e eVar = new h0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.J.d(this);
        }
    }
}
