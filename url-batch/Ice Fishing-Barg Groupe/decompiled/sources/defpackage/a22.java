package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class a22 extends jq implements be1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a92UlCVFR9N8 = AtomicIntegerFieldUpdater.newUpdater(a22.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e9gEMXR7LXtO;

    public a22(long j, a22 a22Var, int i) {
        super(a22Var);
        this.e9gEMXR7LXtO = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean QrzZRwfaDlRX() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = a92UlCVFR9N8;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == x50lh2ztY7Y5() && Y1f8riQaR6yg() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // defpackage.jq
    public final boolean RAsUl2FVSrh6() {
        return a92UlCVFR9N8.get(this) == x50lh2ztY7Y5() && Y1f8riQaR6yg() != null;
    }

    public abstract void cpQdD2nAriOS(int i, hu huVar);

    public final boolean dgRBjINgWbAK() {
        return a92UlCVFR9N8.addAndGet(this, -65536) == x50lh2ztY7Y5() && Y1f8riQaR6yg() != null;
    }

    public final void r3s1LDPKFs1S() {
        if (a92UlCVFR9N8.incrementAndGet(this) == x50lh2ztY7Y5()) {
            OPXfSBeufaJ8();
        }
    }

    public abstract int x50lh2ztY7Y5();
}
