package d3;

import a.AbstractC0124a;
import java.util.Collection;
import java.util.List;
import t3.C1443c;

/* loaded from: classes.dex */
public abstract class j extends AbstractC0124a {
    public static C1443c V(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new C1443c(0, collection.size() - 1, 1);
    }

    public static List W(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length > 0 ? g.N(elements) : q.f8333a;
    }

    public static void X() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
