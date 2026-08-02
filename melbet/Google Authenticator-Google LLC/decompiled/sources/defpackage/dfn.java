package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfn {
    public static final boolean a;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
