package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class y extends x {
    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new q(objArr));
    }

    public static int e(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List f(Object... objArr) {
        if (objArr.length <= 0) {
            return j0.f5574d;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static ArrayList g(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new q(objArr));
    }

    public static final List h(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : x.c(list.get(0)) : j0.f5574d;
    }

    public static void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
