package n3;

import f3.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends o3.a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2844c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: b, reason: collision with root package name */
    public int f2845b;

    public a(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        Object obj = f2844c.get(this);
        if (obj == o3.a.f2989a) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        int i;
        if (obj == null) {
            obj = o3.a.f2989a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2844c;
            if (d.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i4 = this.f2845b;
            if ((i4 & 1) != 0) {
                this.f2845b = i4 + 2;
                return;
            }
            int i5 = i4 + 1;
            this.f2845b = i5;
            while (true) {
                synchronized (this) {
                    i = this.f2845b;
                    if (i == i5) {
                        this.f2845b = i5 + 1;
                        return;
                    }
                }
                i5 = i;
            }
        }
    }
}
