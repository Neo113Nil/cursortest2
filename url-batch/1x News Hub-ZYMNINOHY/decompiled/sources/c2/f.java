package c2;

import a.AbstractC0129a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends AbstractC0129a {
    public static List L(Object... objArr) {
        if (objArr.length <= 0) {
            return m.f2637a;
        }
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }

    public static void M() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
