package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pc {
    public final ia0 a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public pc(ia0 ia0Var) {
        this.a = ia0Var;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.c.get()) {
                return false;
            }
            this.b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.b.decrementAndGet();
            if (this.b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }
}
