package V0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends T.d {
    public static List S(Object... objArr) {
        if (objArr.length <= 0) {
            return m.f889a;
        }
        List asList = Arrays.asList(objArr);
        g1.f.d(asList, "asList(...)");
        return asList;
    }
}
