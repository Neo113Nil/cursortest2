package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ef0 extends d50 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(ef0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int k;

    public ef0(Object obj) {
        this._state$volatile = obj;
    }

    public final Object h0() {
        lm lmVar = n9.n;
        Object obj = l.get(this);
        if (obj == lmVar) {
            return null;
        }
        return obj;
    }

    public final boolean i0(Object obj, Object obj2) {
        int i;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !mv.c(obj3, obj)) {
                return false;
            }
            if (mv.c(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.k;
            if ((i2 & 1) != 0) {
                this.k = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.k = i3;
            while (true) {
                synchronized (this) {
                    i = this.k;
                    if (i == i3) {
                        this.k = i3 + 1;
                        return true;
                    }
                }
                i3 = i;
            }
        }
    }
}
