package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yd implements ServiceConnection {
    public boolean PxuCJdSBwIXG = false;
    public final LinkedBlockingQueue lS5Rgt96tfkO = new LinkedBlockingQueue();

    public final IBinder PxuCJdSBwIXG() {
        jh0.dgRBjINgWbAK("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.PxuCJdSBwIXG) {
            u9.rtx2ld2ELZv4("Cannot call get on this connection more than once");
            return null;
        }
        this.PxuCJdSBwIXG = true;
        IBinder iBinder = (IBinder) this.lS5Rgt96tfkO.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.lS5Rgt96tfkO.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
