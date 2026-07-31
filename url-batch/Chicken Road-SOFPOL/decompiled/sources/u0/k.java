package u0;

import android.os.Looper;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7167a;

    static {
        long j7;
        try {
            j7 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j7 = -1;
        }
        f7167a = j7;
    }
}
