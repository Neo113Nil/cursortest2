package a2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import d2.s;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0161a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4261a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f4262b = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s.b("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f4261a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f4261a = true;
        IBinder iBinder = (IBinder) this.f4262b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4262b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
