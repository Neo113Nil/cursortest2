package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class po extends pi {
    public final WeakReference a;

    public po(pq pqVar) {
        this.a = new WeakReference(pqVar);
    }

    @Override // defpackage.pi
    public final void i(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((pq) weakReference.get()).i || !((pq) weakReference.get()).h) {
            return;
        }
        ((pq) weakReference.get()).h(new pw(i, charSequence));
    }

    @Override // defpackage.pi
    public final void j() {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((pq) weakReference.get()).h) {
            return;
        }
        ((pq) weakReference.get()).i(true);
    }

    @Override // defpackage.pi
    public final void q(bsh bshVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((pq) weakReference.get()).h) {
            return;
        }
        int i = -1;
        if (bshVar.a == -1) {
            Object obj = bshVar.b;
            int i2 = ((pq) weakReference.get()).n;
            if (pj.d(i2) && !pj.c(i2)) {
                i = 2;
            }
            bshVar = new bsh(obj, i);
        }
        ((pq) weakReference.get()).r(bshVar);
    }
}
