package T0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends u1.d {
    public static List k0(Object... objArr) {
        b1.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return q.f844a;
        }
        List asList = Arrays.asList(objArr);
        b1.d.d(asList, "asList(...)");
        return asList;
    }
}
