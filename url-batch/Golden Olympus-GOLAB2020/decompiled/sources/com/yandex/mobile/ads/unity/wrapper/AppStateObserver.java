package com.yandex.mobile.ads.unity.wrapper;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC1339e;
import androidx.lifecycle.InterfaceC1354u;
import com.yandex.mobile.ads.unity.wrapper.AppStateObserver;

/* loaded from: classes3.dex */
public class AppStateObserver implements InterfaceC1339e {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35978a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AppStateChangedListener f35979b;

    public AppStateObserver(AppStateChangedListener appStateChangedListener) {
        this.f35979b = appStateChangedListener;
    }

    public void attachToProcessLifecycle() {
        this.f35978a.post(new Runnable() { // from class: P1.c
            @Override // java.lang.Runnable
            public final void run() {
                AppStateObserver.this.a();
            }
        });
    }

    public void detachFromProcessLifecycle() {
        this.f35978a.post(new Runnable() { // from class: P1.a
            @Override // java.lang.Runnable
            public final void run() {
                AppStateObserver.this.b();
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC1339e
    public void onCreate(InterfaceC1354u interfaceC1354u) {
    }

    @Override // androidx.lifecycle.InterfaceC1339e
    public void onDestroy(InterfaceC1354u interfaceC1354u) {
    }

    @Override // androidx.lifecycle.InterfaceC1339e
    public void onPause(InterfaceC1354u interfaceC1354u) {
    }

    @Override // androidx.lifecycle.InterfaceC1339e
    public void onResume(InterfaceC1354u interfaceC1354u) {
    }

    @Override // androidx.lifecycle.InterfaceC1339e
    public void onStart(InterfaceC1354u interfaceC1354u) {
        this.f35978a.post(new Runnable() { // from class: P1.b
            @Override // java.lang.Runnable
            public final void run() {
                AppStateObserver.this.c();
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC1339e
    public void onStop(InterfaceC1354u interfaceC1354u) {
        this.f35978a.post(new Runnable() { // from class: P1.d
            @Override // java.lang.Runnable
            public final void run() {
                AppStateObserver.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        F.l().getLifecycle().addObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        F.l().getLifecycle().removeObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f35979b.onAppStateChanged(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f35979b.onAppStateChanged(true);
    }
}
