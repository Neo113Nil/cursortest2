package N1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1800a;

    public /* synthetic */ c(d dVar) {
        this.f1800a = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.f1800a;
        dVar.f1803b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        dVar.a().post(new a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f1800a;
        dVar.f1803b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        dVar.a().post(new b(0, this));
    }
}
