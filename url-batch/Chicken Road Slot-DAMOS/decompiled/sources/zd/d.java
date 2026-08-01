package zd;

import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public static final c f10964d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    public static final a f10965e;

    static {
        Integer num = rd.a.f8228b;
        f10965e = (num == null || num.intValue() >= 34) ? new ae.a() : new b();
    }

    public abstract int a(int i3);

    public int b() {
        return a(32);
    }

    public int c(int i3) {
        int b10;
        int i10;
        if (i3 <= 0) {
            a1.f("Random range is empty: [", 0, ", ", Integer.valueOf(i3), ").");
            return 0;
        }
        if (i3 > 0 || i3 == Integer.MIN_VALUE) {
            if (((-i3) & i3) == i3) {
                return a(31 - Integer.numberOfLeadingZeros(i3));
            }
            do {
                b10 = b() >>> 1;
                i10 = b10 % i3;
            } while ((i3 - 1) + (b10 - i10) < 0);
            return i10;
        }
        while (true) {
            int b11 = b();
            if (b11 >= 0 && b11 < i3) {
                return b11;
            }
        }
    }
}
