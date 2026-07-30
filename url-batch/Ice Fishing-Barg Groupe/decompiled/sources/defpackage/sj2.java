package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class sj2 {
    public static final long PxuCJdSBwIXG;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        PxuCJdSBwIXG = j;
    }
}
