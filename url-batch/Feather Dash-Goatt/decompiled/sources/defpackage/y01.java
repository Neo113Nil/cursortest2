package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class y01 {
    public static final x01 d = new x01(null);
    public static final k0 e;

    static {
        Integer num = cb0.b;
        e = (num == null || num.intValue() >= 34) ? new lx0() : new uw();
    }

    public abstract int a(int i);

    public int b() {
        return a(32);
    }

    public int c(int i) {
        int b;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                b = b() >>> 1;
                i2 = b % i;
            } while ((i - 1) + (b - i2) < 0);
            return i2;
        }
        while (true) {
            int b2 = b();
            if (b2 >= 0 && b2 < i) {
                return b2;
            }
        }
    }
}
