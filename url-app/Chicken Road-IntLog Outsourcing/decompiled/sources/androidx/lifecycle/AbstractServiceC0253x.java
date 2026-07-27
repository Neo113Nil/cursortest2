package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0253x extends Service implements InterfaceC0250u {

    /* renamed from: a, reason: collision with root package name */
    public final B4.i f4599a = new B4.i(this);

    @Override // androidx.lifecycle.InterfaceC0250u
    public final AbstractC0245o getLifecycle() {
        return (C0252w) this.f4599a.f311b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        this.f4599a.O(EnumC0243m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f4599a.O(EnumC0243m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0243m enumC0243m = EnumC0243m.ON_STOP;
        B4.i iVar = this.f4599a;
        iVar.O(enumC0243m);
        iVar.O(EnumC0243m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i2) {
        this.f4599a.O(EnumC0243m.ON_START);
        super.onStart(intent, i2);
    }
}
