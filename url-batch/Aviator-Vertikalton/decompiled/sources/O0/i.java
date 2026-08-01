package O0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends q1.d {
    public static List c0(Object... objArr) {
        X0.f.e(objArr, "elements");
        if (objArr.length <= 0) {
            return q.f694a;
        }
        List asList = Arrays.asList(objArr);
        X0.f.d(asList, "asList(...)");
        return asList;
    }
}
