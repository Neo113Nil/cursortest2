package j1;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2670a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final a f2671b;

    static {
        Integer num = d1.a.f2132a;
        f2671b = (num == null || num.intValue() >= 34) ? new k1.a() : new c();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i2) {
        int b2;
        int i3;
        int i4;
        if (i2 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = a(31 - Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    b2 = b() >>> 1;
                    i3 = b2 % i5;
                } while ((i5 - 1) + (b2 - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int b3 = b();
            if (i <= b3 && b3 < i2) {
                return b3;
            }
        }
    }
}
