package q3;

import i3.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends r3.a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3173c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: b, reason: collision with root package name */
    public int f3174b;

    public b(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        Object obj = f3173c.get(this);
        if (obj == r3.a.f3216a) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = r3.a.f3216a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3173c;
            if (d.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i4 = this.f3174b;
            if ((i4 & 1) != 0) {
                this.f3174b = i4 + 2;
                return;
            }
            int i5 = i4 + 1;
            this.f3174b = i5;
            while (true) {
                synchronized (this) {
                    i = this.f3174b;
                    if (i == i5) {
                        this.f3174b = i5 + 1;
                        return;
                    }
                }
                i5 = i;
            }
        }
    }
}
