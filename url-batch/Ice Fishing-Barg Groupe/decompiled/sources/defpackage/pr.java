package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pr implements x32 {
    public final AtomicReference PxuCJdSBwIXG;

    public pr(x32 x32Var) {
        this.PxuCJdSBwIXG = new AtomicReference(x32Var);
    }

    @Override // defpackage.x32
    public final Iterator iterator() {
        x32 x32Var = (x32) this.PxuCJdSBwIXG.getAndSet(null);
        if (x32Var != null) {
            return x32Var.iterator();
        }
        u9.rtx2ld2ELZv4("This sequence can be consumed only once.");
        return null;
    }
}
