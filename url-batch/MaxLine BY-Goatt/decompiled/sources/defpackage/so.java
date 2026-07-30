package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class so implements ServiceConnection {
    public boolean m = false;
    public final LinkedBlockingQueue n = new LinkedBlockingQueue();

    public final IBinder a() {
        ll3.u("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.m) {
            lh.g("Cannot call get on this connection more than once");
            return null;
        }
        this.m = true;
        IBinder iBinder = (IBinder) this.n.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.n.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
