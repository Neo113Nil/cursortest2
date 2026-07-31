package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes3.dex */
public final class I1 implements InterfaceC3079x1 {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f37688a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3079x1 f37689b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37690c;

    public I1(@NonNull InterfaceC3079x1 interfaceC3079x1) {
        this(Ia.j().w().b(), interfaceC3079x1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(Intent intent, int i4) {
        this.f37688a.execute(new A1(this, intent, i4));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void b(Intent intent) {
        this.f37688a.execute(new E1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void c(Intent intent) {
        this.f37688a.execute(new D1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.f37688a.execute(new C3105y1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final synchronized void onCreate() {
        this.f37690c = true;
        this.f37688a.execute(new C3131z1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void onDestroy() {
        this.f37688a.removeAll();
        synchronized (this) {
            this.f37690c = false;
        }
        this.f37689b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.f37688a.execute(new H1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void reportData(int i4, Bundle bundle) {
        this.f37688a.execute(new F1(this, i4, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.f37688a.execute(new G1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(Intent intent, int i4, int i5) {
        this.f37688a.execute(new B1(this, intent, i4, i5));
    }

    public I1(IHandlerExecutor iHandlerExecutor, InterfaceC3079x1 interfaceC3079x1) {
        this.f37690c = false;
        this.f37688a = iHandlerExecutor;
        this.f37689b = interfaceC3079x1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(Intent intent) {
        this.f37688a.execute(new C1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3079x1
    public final void a(@NonNull InterfaceC3053w1 interfaceC3053w1) {
        this.f37689b.a(interfaceC3053w1);
    }
}
