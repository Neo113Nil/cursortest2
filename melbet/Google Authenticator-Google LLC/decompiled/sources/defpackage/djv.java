package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djv {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (a.compareAndSet(false, true)) {
            jkd a2 = jkd.a();
            jkd jkdVar = knl.a;
            a2.getClass();
            knl.a = a2;
        }
    }
}
