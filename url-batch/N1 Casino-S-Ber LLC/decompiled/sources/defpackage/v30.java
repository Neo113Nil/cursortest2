package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(v30.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int a;

    public v30(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        vw vwVar = o8.g;
        Object obj = b.get(this);
        if (obj == vwVar) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = o8.g;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (zo.b(atomicReferenceFieldUpdater.get(this), obj)) {
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
