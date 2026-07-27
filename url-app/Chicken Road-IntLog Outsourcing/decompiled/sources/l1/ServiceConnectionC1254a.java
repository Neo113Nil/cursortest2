package l1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o1.u;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1254a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10996a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f10997b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        u.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f10996a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f10996a = true;
        IBinder iBinder = (IBinder) this.f10997b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10997b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
