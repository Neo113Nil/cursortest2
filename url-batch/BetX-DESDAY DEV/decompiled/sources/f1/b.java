package f1;

import X0.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends g1.a implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2420c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: b, reason: collision with root package name */
    public int f2421b;

    public b(Object obj) {
        this._state = obj;
    }

    public final void a(Object obj) {
        int i;
        if (obj == null) {
            obj = g1.a.f2621a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2420c;
            if (f.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f2421b;
            if ((i2 & 1) != 0) {
                this.f2421b = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f2421b = i3;
            while (true) {
                synchronized (this) {
                    i = this.f2421b;
                    if (i == i3) {
                        this.f2421b = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
