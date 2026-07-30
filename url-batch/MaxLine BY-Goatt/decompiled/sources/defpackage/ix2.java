package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ix2 {
    public static final long a;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        a = j;
    }
}
