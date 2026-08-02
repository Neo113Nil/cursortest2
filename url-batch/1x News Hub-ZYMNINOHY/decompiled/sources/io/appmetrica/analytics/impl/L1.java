package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class L1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f6251a;

    /* renamed from: b, reason: collision with root package name */
    public final A1 f6252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6253c;

    public L1(A1 a12) {
        this(C0876ua.k().x().b(), a12);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3) {
        this.f6251a.execute(new D1(this, intent, i3));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f6251a.execute(new H1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        this.f6251a.execute(new G1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6251a.execute(new B1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final synchronized void onCreate() {
        this.f6253c = true;
        this.f6251a.execute(new C1(this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        this.f6251a.removeAll();
        synchronized (this) {
            this.f6253c = false;
        }
        this.f6252b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        this.f6251a.execute(new K1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i3, Bundle bundle) {
        this.f6251a.execute(new I1(this, i3, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        this.f6251a.execute(new J1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i3, int i4) {
        this.f6251a.execute(new E1(this, intent, i3, i4));
    }

    public L1(IHandlerExecutor iHandlerExecutor, A1 a12) {
        this.f6253c = false;
        this.f6251a = iHandlerExecutor;
        this.f6252b = a12;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        this.f6251a.execute(new F1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(InterfaceC0995z1 interfaceC0995z1) {
        this.f6252b.a(interfaceC0995z1);
    }
}
