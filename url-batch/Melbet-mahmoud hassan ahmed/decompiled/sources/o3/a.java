package o3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f19840a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<IBinder> f19841b = new LinkedBlockingQueue();

    @RecentlyNonNull
    public IBinder a(long j7, @RecentlyNonNull TimeUnit timeUnit) {
        r3.o.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f19840a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f19840a = true;
        IBinder poll = this.f19841b.poll(j7, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f19841b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
