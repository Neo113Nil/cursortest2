package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.C1356w;
import androidx.lifecycle.InterfaceC1343i;
import androidx.lifecycle.N;
import androidx.lifecycle.Q;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import b0.AbstractC1367a;
import h0.C2435d;
import h0.C2436e;
import h0.InterfaceC2437f;

/* loaded from: classes.dex */
class D implements InterfaceC1343i, InterfaceC2437f, c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f12262a;

    /* renamed from: b, reason: collision with root package name */
    private final b0 f12263b;

    /* renamed from: c, reason: collision with root package name */
    private Y.b f12264c;

    /* renamed from: d, reason: collision with root package name */
    private C1356w f12265d = null;

    /* renamed from: e, reason: collision with root package name */
    private C2436e f12266e = null;

    D(Fragment fragment, b0 b0Var) {
        this.f12262a = fragment;
        this.f12263b = b0Var;
    }

    void a(AbstractC1346l.a aVar) {
        this.f12265d.g(aVar);
    }

    void b() {
        if (this.f12265d == null) {
            this.f12265d = new C1356w(this);
            C2436e a4 = C2436e.a(this);
            this.f12266e = a4;
            a4.c();
            N.c(this);
        }
    }

    boolean c() {
        return this.f12265d != null;
    }

    void d(Bundle bundle) {
        this.f12266e.d(bundle);
    }

    void e(Bundle bundle) {
        this.f12266e.e(bundle);
    }

    void f(AbstractC1346l.b bVar) {
        this.f12265d.l(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1343i
    public AbstractC1367a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f12262a.requireContext().getApplicationContext();
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
        b0.b bVar = new b0.b();
        if (application != null) {
            bVar.c(Y.a.f12619h, application);
        }
        bVar.c(N.f12589a, this);
        bVar.c(N.f12590b, this);
        if (this.f12262a.getArguments() != null) {
            bVar.c(N.f12591c, this.f12262a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1343i
    public Y.b getDefaultViewModelProviderFactory() {
        Application application;
        Y.b defaultViewModelProviderFactory = this.f12262a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f12262a.mDefaultFactory)) {
            this.f12264c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f12264c == null) {
            Context applicationContext = this.f12262a.requireContext().getApplicationContext();
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
            this.f12264c = new Q(application, this, this.f12262a.getArguments());
        }
        return this.f12264c;
    }

    @Override // androidx.lifecycle.InterfaceC1354u
    public AbstractC1346l getLifecycle() {
        b();
        return this.f12265d;
    }

    @Override // h0.InterfaceC2437f
    public C2435d getSavedStateRegistry() {
        b();
        return this.f12266e.b();
    }

    @Override // androidx.lifecycle.c0
    public b0 getViewModelStore() {
        b();
        return this.f12263b;
    }
}
