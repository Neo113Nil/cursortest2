package l5;

import java.util.ArrayList;
import java.util.List;
import u0.AbstractC0676f;

/* renamed from: l5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0507k extends AbstractC0676f {
    public static ArrayList A(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0503g(objArr, true));
    }

    public static void B() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int y(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List z(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length > 0 ? AbstractC0505i.E(elements) : C0512p.f5303f;
    }
}
