package W0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends A1.d {
    public static int m0(List list) {
        h1.d.e(list, "<this>");
        return list.size() - 1;
    }

    public static List n0(Object... objArr) {
        h1.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return p.f959a;
        }
        List asList = Arrays.asList(objArr);
        h1.d.d(asList, "asList(...)");
        return asList;
    }
}
