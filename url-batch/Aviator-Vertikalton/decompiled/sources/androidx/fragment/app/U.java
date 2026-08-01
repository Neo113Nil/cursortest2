package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.InterfaceC0076i;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class U implements InterfaceC0076i, g0.f, androidx.lifecycle.V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0060q f1284a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.U f1285b;

    /* renamed from: c, reason: collision with root package name */
    public C0088v f1286c = null;

    /* renamed from: d, reason: collision with root package name */
    public g0.e f1287d = null;

    public U(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, androidx.lifecycle.U u2) {
        this.f1284a = abstractComponentCallbacksC0060q;
        this.f1285b = u2;
    }

    public final void a(EnumC0080m enumC0080m) {
        this.f1286c.e(enumC0080m);
    }

    public final void b() {
        if (this.f1286c == null) {
            this.f1286c = new C0088v(this);
            g0.e eVar = new g0.e(this);
            this.f1287d = eVar;
            eVar.a();
            androidx.lifecycle.J.d(this);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0076i
    public final Z.b getDefaultViewModelCreationExtras() {
        Application application;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1284a;
        Context applicationContext = abstractComponentCallbacksC0060q.y().getApplicationContext();
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
        Z.c cVar = new Z.c(0);
        LinkedHashMap linkedHashMap = cVar.f882a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.Q.f1472d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1453a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1454b, this);
        Bundle bundle = abstractComponentCallbacksC0060q.f1399f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1455c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        b();
        return this.f1286c;
    }

    @Override // g0.f
    public final g0.d getSavedStateRegistry() {
        b();
        return this.f1287d.f2615b;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U getViewModelStore() {
        b();
        return this.f1285b;
    }
}
