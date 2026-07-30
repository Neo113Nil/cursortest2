package q1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t1.u;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC0832a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7307a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f7308b = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u.e("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f7307a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7307a = true;
        IBinder iBinder = (IBinder) this.f7308b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7308b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
