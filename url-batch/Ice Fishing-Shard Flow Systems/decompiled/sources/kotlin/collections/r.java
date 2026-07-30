package kotlin.collections;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class r extends q {
    public static int c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List d(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? o.b(elements) : A.f6115d;
    }

    public static ArrayList e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        Intrinsics.checkNotNullParameter(elements, "<this>");
        return new ArrayList(new C0631j(elements, true));
    }

    public static void f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
