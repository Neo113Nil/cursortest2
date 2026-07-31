package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0256x extends Service implements InterfaceC0253u {

    /* renamed from: f, reason: collision with root package name */
    public final B0.c f3534f = new B0.c(this);

    @Override // androidx.lifecycle.InterfaceC0253u
    public final AbstractC0248o getLifecycle() {
        return (C0255w) this.f3534f.f72h;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        this.f3534f.u(EnumC0246m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3534f.u(EnumC0246m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0246m enumC0246m = EnumC0246m.ON_STOP;
        B0.c cVar = this.f3534f;
        cVar.u(enumC0246m);
        cVar.u(EnumC0246m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        this.f3534f.u(EnumC0246m.ON_START);
        super.onStart(intent, i7);
    }
}
