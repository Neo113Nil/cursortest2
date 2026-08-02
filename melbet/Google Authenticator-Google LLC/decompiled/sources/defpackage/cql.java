package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cql implements ServiceConnection {
    private final ServiceConnection a;

    public cql(ServiceConnection serviceConnection) {
        this.a = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }
}
