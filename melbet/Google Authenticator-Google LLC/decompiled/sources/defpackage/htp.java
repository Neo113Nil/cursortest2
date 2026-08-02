package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class htp extends hsv {
    public static final htm a;
    private static final hvh b = new hvh(htp.class);
    volatile int remainingField;
    volatile Set seenExceptionsField = null;

    static {
        Throwable th;
        htm htoVar;
        try {
            htoVar = new htn();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            htoVar = new hto();
        }
        Throwable th3 = th;
        a = htoVar;
        if (th3 != null) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }

    public htp(int i) {
        this.remainingField = i;
    }

    public abstract void d(Set set);
}
