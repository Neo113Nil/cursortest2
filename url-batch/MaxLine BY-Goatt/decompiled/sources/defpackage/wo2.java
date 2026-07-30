package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wo2 extends l1 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.l1
    public final boolean a(k1 k1Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(zm3.j);
        return true;
    }

    @Override // defpackage.l1
    public final o30[] b(k1 k1Var) {
        this.a.set(null);
        return l41.a;
    }
}
