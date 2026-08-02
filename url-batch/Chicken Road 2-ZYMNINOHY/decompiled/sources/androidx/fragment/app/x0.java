package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.InterfaceC0224c;
import java.util.LinkedHashMap;
import m1.C1307e;
import m1.C1308f;

/* loaded from: classes.dex */
public final class x0 implements InterfaceC0224c, m1.g, androidx.lifecycle.P {

    /* renamed from: a, reason: collision with root package name */
    public final F f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f4992b;

    /* renamed from: c, reason: collision with root package name */
    public final RunnableC0216u f4993c;

    /* renamed from: d, reason: collision with root package name */
    public C0237p f4994d = null;

    /* renamed from: e, reason: collision with root package name */
    public C1308f f4995e = null;

    public x0(F f4, androidx.lifecycle.O o, RunnableC0216u runnableC0216u) {
        this.f4991a = f4;
        this.f4992b = o;
        this.f4993c = runnableC0216u;
    }

    public final void a(EnumC0229h enumC0229h) {
        this.f4994d.e(enumC0229h);
    }

    public final void b() {
        if (this.f4994d == null) {
            this.f4994d = new C0237p(this);
            C1308f c1308f = new C1308f(this);
            this.f4995e = c1308f;
            c1308f.a();
            this.f4993c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0224c
    public final R.b getDefaultViewModelCreationExtras() {
        Application application;
        F f4 = this.f4991a;
        Context applicationContext = f4.requireContext().getApplicationContext();
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
        R.c cVar = new R.c(0);
        LinkedHashMap linkedHashMap = cVar.f2272a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.K.f5032a, application);
        }
        linkedHashMap.put(androidx.lifecycle.E.f5014a, f4);
        linkedHashMap.put(androidx.lifecycle.E.f5015b, this);
        if (f4.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.E.f5016c, f4.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0235n
    public final AbstractC0231j getLifecycle() {
        b();
        return this.f4994d;
    }

    @Override // m1.g
    public final C1307e getSavedStateRegistry() {
        b();
        return this.f4995e.f14495b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O getViewModelStore() {
        b();
        return this.f4992b;
    }
}
