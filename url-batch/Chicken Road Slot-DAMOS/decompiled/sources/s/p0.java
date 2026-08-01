package s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f8356a = {-9187201950435737345L, -1};

    static {
        new h0(0);
    }

    public static final int a(int i3) {
        if (i3 == 7) {
            return 6;
        }
        return i3 - (i3 / 8);
    }

    public static final int b(int i3) {
        if (i3 == 0) {
            return 6;
        }
        return (i3 * 2) + 1;
    }

    public static final int c(int i3) {
        if (i3 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i3);
        }
        return 0;
    }

    public static final int d(int i3) {
        if (i3 == 7) {
            return 8;
        }
        return ((i3 - 1) / 7) + i3;
    }
}
