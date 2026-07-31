package J0;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Future f793a;

    /* renamed from: b, reason: collision with root package name */
    private final long f794b = SystemClock.elapsedRealtime();

    public b(Future future) {
        this.f793a = future;
    }

    public Future a() {
        return this.f793a;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f794b <= 300000;
    }
}
