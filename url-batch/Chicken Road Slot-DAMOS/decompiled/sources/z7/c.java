package z7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f10922a;

    public /* synthetic */ c(d dVar) {
        this.f10922a = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.f10922a;
        dVar.f10925b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        dVar.a().post(new a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f10922a;
        dVar.f10925b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        dVar.a().post(new b(0, this));
    }
}
