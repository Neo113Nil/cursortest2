package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gyd {
    public static final hai a;

    static {
        hai gycVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            gycVar = new gyb();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            gycVar = new gyc();
        }
        a = gycVar;
    }
}
