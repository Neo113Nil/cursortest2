package Z5;

import b6.C0281b;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0281b f3029a = new C0281b();

    public static final int a(int i2, int i5, int i7) {
        if (i7 > 0) {
            if (i2 < i5) {
                int i8 = i5 % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i5 - i10;
            }
        } else {
            if (i7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i5) {
                int i11 = -i7;
                int i12 = i2 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i5 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i14 + i5;
            }
        }
        return i5;
    }
}
