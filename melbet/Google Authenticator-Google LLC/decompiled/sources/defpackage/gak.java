package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gak {
    public static final hkh a = hkh.l("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter");
    public static final hvw b;
    public final AtomicLong c = new AtomicLong(0);
    public final Object d = new Object();
    public final ConcurrentHashMap e = new ConcurrentHashMap(10, 0.75f, 4);
    public final SparseArray f = new SparseArray();
    public final SparseArray g = new SparseArray();
    public final UUID h = UUID.randomUUID();

    static {
        hvw hvwVar = new hvw();
        b = hvwVar;
        hvwVar.o(new Object());
    }

    public static int a(long j) {
        return (int) (j & 4294967295L);
    }
}
