package E1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2274a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f2275b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        H1.o.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f2274a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f2274a = true;
        IBinder iBinder = (IBinder) this.f2275b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2275b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
