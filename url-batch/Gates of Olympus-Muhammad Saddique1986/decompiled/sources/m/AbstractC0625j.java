package m;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0625j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6821a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static int a(int i3, int i4, int i5) {
        return (Integer.hashCode(i3) + i4) * i5;
    }

    public static /* synthetic */ int b(int i3) {
        if (i3 != 0) {
            return i3 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i3) {
        int[] iArr = new int[i3];
        System.arraycopy(f6821a, 0, iArr, 0, i3);
        return iArr;
    }
}
