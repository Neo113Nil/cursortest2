package Q;

import G.C0194e;

/* loaded from: classes.dex */
public abstract class E implements D {

    /* renamed from: d, reason: collision with root package name */
    public final C0194e f3808d = new C0194e(0);

    public final boolean b(int i2) {
        return (i2 & this.f3808d.get()) != 0;
    }

    public final void c(int i2) {
        C0194e c0194e;
        int i4;
        do {
            c0194e = this.f3808d;
            i4 = c0194e.get();
            if ((i4 & i2) != 0) {
                return;
            }
        } while (!c0194e.compareAndSet(i4, i4 | i2));
    }
}
