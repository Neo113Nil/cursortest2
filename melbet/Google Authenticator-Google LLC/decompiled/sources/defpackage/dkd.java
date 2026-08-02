package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkd {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final hrg c;

    static {
        long currentTimeMillis = System.currentTimeMillis() * 1000;
        b = currentTimeMillis;
        SystemClock.elapsedRealtime();
        jkj k = hrg.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        hrg hrgVar = (hrg) jkpVar;
        hrgVar.b |= 2;
        hrgVar.d = 0;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        hrg hrgVar2 = (hrg) jkpVar2;
        hrgVar2.b |= 4;
        hrgVar2.e = 0;
        if (!jkpVar2.M()) {
            k.t();
        }
        hrg hrgVar3 = (hrg) k.b;
        hrgVar3.b |= 1;
        hrgVar3.c = currentTimeMillis;
        c = (hrg) k.q();
    }

    public static hrf a() {
        jkj k = hrf.a.k();
        long andIncrement = a.getAndIncrement();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        hrf hrfVar = (hrf) jkpVar;
        hrfVar.b |= 2;
        hrfVar.d = andIncrement;
        hrg hrgVar = c;
        if (!jkpVar.M()) {
            k.t();
        }
        hrf hrfVar2 = (hrf) k.b;
        hrgVar.getClass();
        hrfVar2.c = hrgVar;
        hrfVar2.b |= 1;
        return (hrf) k.q();
    }
}
