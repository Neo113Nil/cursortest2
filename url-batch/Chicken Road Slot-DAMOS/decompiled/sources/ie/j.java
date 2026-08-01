package ie;

import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4751a = new i();

    public static c a(int i3, int i10, a aVar) {
        if ((i10 & 2) != 0) {
            aVar = a.f4712d;
        }
        if (i3 == -2) {
            if (aVar != a.f4712d) {
                return new m(1, aVar);
            }
            g.f4749m.getClass();
            return new c(f.f4748b);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? aVar == a.f4712d ? new c(i3) : new m(i3, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f4712d ? new c(0) : new m(1, aVar);
        }
        if (aVar == a.f4712d) {
            return new m(1, a.f4713e);
        }
        a1.e("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }
}
