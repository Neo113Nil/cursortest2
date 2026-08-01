package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class y60 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(y60.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int a;

    public y60(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        xj xjVar = xf.j;
        Object obj = b.get(this);
        if (obj == xjVar) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = xf.j;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (kr.b(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.a;
            if ((i2 & 1) != 0) {
                this.a = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.a = i3;
            while (true) {
                synchronized (this) {
                    i = this.a;
                    if (i == i3) {
                        this.a = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
