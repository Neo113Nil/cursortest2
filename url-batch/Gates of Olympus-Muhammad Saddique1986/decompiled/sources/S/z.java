package S;

import I.C0145e;

/* loaded from: classes.dex */
public abstract class z implements y {

    /* renamed from: d, reason: collision with root package name */
    public final C0145e f4285d = new C0145e(0);

    public final boolean e(int i3) {
        return (i3 & this.f4285d.get()) != 0;
    }

    public final void f(int i3) {
        C0145e c0145e;
        int i4;
        do {
            c0145e = this.f4285d;
            i4 = c0145e.get();
            if ((i4 & i3) != 0) {
                return;
            }
        } while (!c0145e.compareAndSet(i4, i4 | i3));
    }
}
