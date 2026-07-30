package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0259z extends Service implements InterfaceC0256w {

    /* renamed from: d, reason: collision with root package name */
    public final D0.j f3928d = new D0.j(this);

    @Override // androidx.lifecycle.InterfaceC0256w
    public final AbstractC0250p getLifecycle() {
        return (C0258y) this.f3928d.f330e;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f3928d.V(EnumC0248n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3928d.V(EnumC0248n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0248n enumC0248n = EnumC0248n.ON_STOP;
        D0.j jVar = this.f3928d;
        jVar.V(enumC0248n);
        jVar.V(EnumC0248n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i2) {
        this.f3928d.V(EnumC0248n.ON_START);
        super.onStart(intent, i2);
    }
}
