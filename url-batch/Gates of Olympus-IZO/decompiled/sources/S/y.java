package S;

import I.C0091e;

/* loaded from: classes.dex */
public abstract class y implements x {

    /* renamed from: d, reason: collision with root package name */
    public final C0091e f3271d = new C0091e(0);

    public final boolean e(int i3) {
        return (i3 & this.f3271d.get()) != 0;
    }

    public final void f(int i3) {
        C0091e c0091e;
        int i4;
        do {
            c0091e = this.f3271d;
            i4 = c0091e.get();
            if ((i4 & i3) != 0) {
                return;
            }
        } while (!c0091e.compareAndSet(i4, i4 | i3));
    }
}
