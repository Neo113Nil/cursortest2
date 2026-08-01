package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class lc0 extends de implements w30 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(lc0.class, "cleanedAndPointers$volatile");
    public final long c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public lc0(long j, uc0 uc0Var, int i) {
        super(uc0Var);
        this.c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.de
    public final boolean a() {
        if (d.get(this) != d()) {
            return false;
        }
        Object obj = de.a.get(this);
        return (obj == d50.b ? null : (de) obj) != null;
    }

    public final boolean c() {
        if (d.addAndGet(this, -65536) != d()) {
            return false;
        }
        Object obj = de.a.get(this);
        return (obj == d50.b ? null : (de) obj) != null;
    }

    public abstract int d();

    public abstract void e(int i);

    public final boolean f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == d()) {
                Object obj = de.a.get(this);
                if ((obj == d50.b ? null : (de) obj) != null) {
                    return false;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
