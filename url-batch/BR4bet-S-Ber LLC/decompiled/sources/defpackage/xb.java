package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class xb extends kr {
    public static List i0(Object... objArr) {
        if (objArr.length <= 0) {
            return ik.f;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void j0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
