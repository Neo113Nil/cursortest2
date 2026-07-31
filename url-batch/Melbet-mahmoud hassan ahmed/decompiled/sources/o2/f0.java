package o2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class f0 implements d {
    protected f0() {
    }

    @Override // o2.d
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o2.d
    public long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // o2.d
    public n c(Looper looper, Handler.Callback callback) {
        return new g0(new Handler(looper, callback));
    }

    @Override // o2.d
    public void d() {
    }
}
