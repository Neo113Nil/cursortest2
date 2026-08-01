package R0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends s1.l {
    public static int k0(List list) {
        Z0.d.e(list, "<this>");
        return list.size() - 1;
    }

    public static List l0(Object... objArr) {
        Z0.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return q.f712a;
        }
        List asList = Arrays.asList(objArr);
        Z0.d.d(asList, "asList(...)");
        return asList;
    }
}
