package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e40 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(e40.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int a;

    public e40(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        ix ixVar = vw.c;
        Object obj = b.get(this);
        if (obj == ixVar) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = vw.c;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (op.d(atomicReferenceFieldUpdater.get(this), obj)) {
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
