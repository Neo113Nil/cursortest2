package V0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends z1.d {
    public static int v0(List list) {
        g1.d.e(list, "<this>");
        return list.size() - 1;
    }

    public static List w0(Object... objArr) {
        g1.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return p.f917a;
        }
        List asList = Arrays.asList(objArr);
        g1.d.d(asList, "asList(...)");
        return asList;
    }
}
