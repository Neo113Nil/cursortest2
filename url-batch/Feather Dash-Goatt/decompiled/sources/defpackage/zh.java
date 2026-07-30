package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class zh extends yh {
    public static ArrayList c(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k9(objArr, true));
    }

    public static int d(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List e(Object... objArr) {
        if (objArr.length <= 0) {
            return nv.d;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static ArrayList f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k9(objArr, true));
    }

    public static void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
