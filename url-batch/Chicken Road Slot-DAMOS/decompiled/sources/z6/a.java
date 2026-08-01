package z6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import c7.c0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10863a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f10864b = new LinkedBlockingQueue();

    public final IBinder a() {
        c0.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f10863a) {
            i0.l("Cannot call get on this connection more than once");
            return null;
        }
        this.f10863a = true;
        IBinder iBinder = (IBinder) this.f10864b.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10864b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
