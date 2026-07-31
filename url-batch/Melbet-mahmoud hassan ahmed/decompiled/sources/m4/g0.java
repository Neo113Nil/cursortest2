package m4;

/* loaded from: classes.dex */
public final class g0 {
    static Object a(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i7);
        throw new NullPointerException(sb.toString());
    }

    static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static Object[] c(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            a(objArr[i8], i8);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i7) {
        return (T[]) i0.b(tArr, i7);
    }
}
