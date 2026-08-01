package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x extends Service implements u {

    /* renamed from: d, reason: collision with root package name */
    public final a1.n f743d = new a1.n(this);

    @Override // androidx.lifecycle.u
    public final w g() {
        return (w) this.f743d.f41i;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        a1.n nVar = this.f743d;
        nVar.getClass();
        nVar.B(o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        a1.n nVar = this.f743d;
        nVar.getClass();
        nVar.B(o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a1.n nVar = this.f743d;
        nVar.getClass();
        nVar.B(o.ON_STOP);
        nVar.B(o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i3) {
        a1.n nVar = this.f743d;
        nVar.getClass();
        nVar.B(o.ON_START);
        super.onStart(intent, i3);
    }
}
