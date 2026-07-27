package l;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0784j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7768a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static /* synthetic */ int a(int i2, int i4) {
        if (i2 == 0 || i4 == 0) {
            throw null;
        }
        return i2 - i4;
    }

    public static /* synthetic */ boolean b(int i2, int i4) {
        if (i2 != 0) {
            return i2 == i4;
        }
        throw null;
    }

    public static int c(int i2, int i4, int i5) {
        return (Integer.hashCode(i2) + i4) * i5;
    }

    public static /* synthetic */ int d(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] e(int i2) {
        int[] iArr = new int[i2];
        System.arraycopy(f7768a, 0, iArr, 0, i2);
        return iArr;
    }
}
