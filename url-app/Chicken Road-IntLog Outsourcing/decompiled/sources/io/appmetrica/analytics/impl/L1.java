package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes.dex */
public final class L1 implements A1 {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f7056a;

    /* renamed from: b, reason: collision with root package name */
    public final A1 f7057b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7058c;

    public L1(A1 a12) {
        this(C1027ua.k().x().b(), a12);
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i2) {
        this.f7056a.execute(new D1(this, intent, i2));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void b(Intent intent) {
        this.f7056a.execute(new H1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void c(Intent intent) {
        this.f7056a.execute(new G1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f7056a.execute(new B1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final synchronized void onCreate() {
        this.f7058c = true;
        this.f7056a.execute(new C1(this));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void onDestroy() {
        this.f7056a.removeAll();
        synchronized (this) {
            this.f7058c = false;
        }
        this.f7057b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void pauseUserSession(Bundle bundle) {
        this.f7056a.execute(new K1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void reportData(int i2, Bundle bundle) {
        this.f7056a.execute(new I1(this, i2, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void resumeUserSession(Bundle bundle) {
        this.f7056a.execute(new J1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent, int i2, int i3) {
        this.f7056a.execute(new E1(this, intent, i2, i3));
    }

    public L1(IHandlerExecutor iHandlerExecutor, A1 a12) {
        this.f7058c = false;
        this.f7056a = iHandlerExecutor;
        this.f7057b = a12;
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(Intent intent) {
        this.f7056a.execute(new F1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.A1
    public final void a(InterfaceC1146z1 interfaceC1146z1) {
        this.f7057b.a(interfaceC1146z1);
    }
}
