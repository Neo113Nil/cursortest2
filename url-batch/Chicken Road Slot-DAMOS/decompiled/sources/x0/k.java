package x0;

import android.os.Looper;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10240a;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        f10240a = j;
    }
}
