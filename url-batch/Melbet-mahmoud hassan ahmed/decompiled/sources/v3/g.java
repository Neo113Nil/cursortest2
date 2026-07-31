package v3;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final g f22819a = new g();

    private g() {
    }

    @RecentlyNonNull
    public static d d() {
        return f22819a;
    }

    @Override // v3.d
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // v3.d
    public final long b() {
        return System.currentTimeMillis();
    }

    @Override // v3.d
    public final long c() {
        return System.nanoTime();
    }
}
