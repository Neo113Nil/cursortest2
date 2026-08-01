package W0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends x1.l {
    public static List l0(Object... objArr) {
        e1.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return q.f896a;
        }
        List asList = Arrays.asList(objArr);
        e1.d.d(asList, "asList(...)");
        return asList;
    }
}
