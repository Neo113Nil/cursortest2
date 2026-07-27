package G2;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final I2.a f3169a = new I2.a();

    public static final int a(int i2, int i4, int i5) {
        if (i5 > 0) {
            if (i2 >= i4) {
                return i4;
            }
            int i6 = i4 % i5;
            if (i6 < 0) {
                i6 += i5;
            }
            int i7 = i2 % i5;
            if (i7 < 0) {
                i7 += i5;
            }
            int i8 = (i6 - i7) % i5;
            if (i8 < 0) {
                i8 += i5;
            }
            return i4 - i8;
        }
        if (i5 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i4) {
            return i4;
        }
        int i9 = -i5;
        int i10 = i2 % i9;
        if (i10 < 0) {
            i10 += i9;
        }
        int i11 = i4 % i9;
        if (i11 < 0) {
            i11 += i9;
        }
        int i12 = (i10 - i11) % i9;
        if (i12 < 0) {
            i12 += i9;
        }
        return i4 + i12;
    }
}
