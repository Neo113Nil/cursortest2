package Y;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.InterfaceC0067h;
import b0.C0080c;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0067h, i0.f, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0051q f998a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f999b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.t f1000c = null;
    public i0.e d = null;

    public Q(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, androidx.lifecycle.O o2) {
        this.f998a = abstractComponentCallbacksC0051q;
        this.f999b = o2;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0080c a() {
        Application application;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f998a;
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
        C0080c c0080c = new C0080c(0);
        LinkedHashMap linkedHashMap = c0080c.f1632a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1457a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1458b, this);
        Bundle bundle = abstractComponentCallbacksC0051q.f1104f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1459c, bundle);
        }
        return c0080c;
    }

    @Override // i0.f
    public final i0.d b() {
        f();
        return this.d.f2535b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f999b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.f1000c;
    }

    public final void e(EnumC0071l enumC0071l) {
        this.f1000c.d(enumC0071l);
    }

    public final void f() {
        if (this.f1000c == null) {
            this.f1000c = new androidx.lifecycle.t(this);
            i0.e eVar = new i0.e(this);
            this.d = eVar;
            eVar.a();
            androidx.lifecycle.H.d(this);
        }
    }
}
