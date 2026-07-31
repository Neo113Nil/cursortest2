package N;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1677a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};

    public static /* synthetic */ boolean a(int i7, int i8) {
        if (i7 != 0) {
            return i7 == i8;
        }
        throw null;
    }

    public static String b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ int c(int i7) {
        if (i7 != 0) {
            return i7 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i7) {
        int[] iArr = new int[i7];
        System.arraycopy(f1677a, 0, iArr, 0, i7);
        return iArr;
    }
}
