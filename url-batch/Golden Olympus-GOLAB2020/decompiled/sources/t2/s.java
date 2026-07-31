package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46252a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public s(boolean z4) {
        this._cur$volatile = new t(8, z4);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46252a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            int a4 = tVar.a(obj);
            if (a4 == 0) {
                return true;
            }
            if (a4 == 1) {
                androidx.concurrent.futures.b.a(f46252a, this, tVar, tVar.l());
            } else if (a4 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46252a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f46252a, this, tVar, tVar.l());
            }
        }
    }

    public final int c() {
        return ((t) f46252a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46252a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            Object m4 = tVar.m();
            if (m4 != t.f46256h) {
                return m4;
            }
            androidx.concurrent.futures.b.a(f46252a, this, tVar, tVar.l());
        }
    }
}
