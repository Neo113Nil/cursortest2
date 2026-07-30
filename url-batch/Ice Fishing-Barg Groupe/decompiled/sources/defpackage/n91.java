package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n91 {
    public final AtomicReference PxuCJdSBwIXG = new AtomicReference(null);
    public final r91 lS5Rgt96tfkO = new r91();

    public static final void PxuCJdSBwIXG(n91 n91Var, k91 k91Var) {
        AtomicReference atomicReference = n91Var.PxuCJdSBwIXG;
        while (true) {
            k91 k91Var2 = (k91) atomicReference.get();
            if (k91Var2 != null && k91Var.PxuCJdSBwIXG.compareTo(k91Var2.PxuCJdSBwIXG) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(k91Var2, k91Var)) {
                if (atomicReference.get() != k91Var2) {
                    break;
                }
            }
            if (k91Var2 != null) {
                k91Var2.lS5Rgt96tfkO.a92UlCVFR9N8(new k80("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }
}
