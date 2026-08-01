package X0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends z1.l {
    public static List y0(Object... objArr) {
        g1.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return s.f992a;
        }
        List asList = Arrays.asList(objArr);
        g1.d.d(asList, "asList(...)");
        return asList;
    }
}
