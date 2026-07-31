package i6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {
    public static int a(int i7, int i8) {
        return i7 < i8 ? i8 : i7;
    }

    public static long b(long j7, long j8) {
        return j7 < j8 ? j8 : j7;
    }

    public static int c(int i7, int i8) {
        return i7 > i8 ? i8 : i7;
    }

    public static long d(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    public static int e(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static a f(int i7, int i8) {
        return a.f17038i.a(i7, i8, -1);
    }

    public static c g(int i7, int i8) {
        return i8 <= Integer.MIN_VALUE ? c.f17046j.a() : new c(i7, i8 - 1);
    }
}
