package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ce1 extends x0 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.x0
    public final boolean a(w0 w0Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(m90.o);
        return true;
    }

    @Override // defpackage.x0
    public final dn[] b(w0 w0Var) {
        this.a.set(null);
        return p4.a;
    }
}
