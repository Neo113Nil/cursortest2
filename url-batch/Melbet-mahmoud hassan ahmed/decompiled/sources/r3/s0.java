package r3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class s0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f21326a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f21327b;

    public s0(c cVar, int i7) {
        this.f21327b = cVar;
        this.f21326a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f21327b;
        if (iBinder == null) {
            c.U(cVar, 16);
            return;
        }
        obj = cVar.f21215n;
        synchronized (obj) {
            c cVar2 = this.f21327b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f21216o = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new l0(iBinder) : (l) queryLocalInterface;
        }
        this.f21327b.T(0, null, this.f21326a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f21327b.f21215n;
        synchronized (obj) {
            this.f21327b.f21216o = null;
        }
        Handler handler = this.f21327b.f21213l;
        handler.sendMessage(handler.obtainMessage(6, this.f21326a, 1));
    }
}
