package G0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends i1.a {
    public static List O(Object... objArr) {
        Q0.h.e(objArr, "elements");
        if (objArr.length <= 0) {
            return l.f490e;
        }
        List asList = Arrays.asList(objArr);
        Q0.h.d(asList, "asList(...)");
        return asList;
    }
}
