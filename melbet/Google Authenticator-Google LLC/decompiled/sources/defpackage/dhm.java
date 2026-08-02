package defpackage;

import android.os.Debug;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhm {
    public static final /* synthetic */ int e = 0;
    private static final hac f = hoq.v(new csm(3));
    public final gzp a;
    public final boolean b;
    public final hvm c;
    public final Set d;

    public dhm(gzp gzpVar, gzp gzpVar2, hvm hvmVar, Set set) {
        this.a = gzpVar;
        this.b = ((Boolean) gzpVar2.d(false)).booleanValue();
        this.c = hvmVar;
        this.d = set;
    }

    public static void a(dhn dhnVar, ArrayList arrayList, RuntimeException runtimeException) {
        if (Debug.isDebuggerConnected()) {
            return;
        }
        if (arrayList.size() > 20) {
            for (int i = 0; i < 20; i++) {
                Collections.swap(arrayList, i, ThreadLocalRandom.current().nextInt(arrayList.size() - i) + i);
            }
        }
        for (Thread thread : arrayList.subList(0, Math.min(arrayList.size(), 20))) {
            RuntimeException b = gwd.b(thread);
            runtimeException.addSuppressed(b.getStackTrace().length > 0 ? dgx.a(thread, b) : dgx.a(thread, null));
        }
        int ordinal = dhnVar.ordinal();
        if (ordinal == 0) {
            ((hkf) ((hkf) ((hkf) ((hkh) f.bB()).f()).h(runtimeException)).i("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring", "reportUnhealthyThreadPool", (char) 439, "ThreadMonitoring.java")).s("Unhealthy thread pool detected");
        } else {
            if (ordinal != 1) {
                return;
            }
            fao.e(new ath(runtimeException, 14));
        }
    }

    public static boolean b() {
        return ThreadLocalRandom.current().nextInt(1000) <= 0;
    }
}
