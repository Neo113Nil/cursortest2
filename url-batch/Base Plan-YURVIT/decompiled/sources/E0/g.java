package E0;

import a.AbstractC0086a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0086a {
    public static List O(Object... objArr) {
        if (objArr.length <= 0) {
            return o.f219e;
        }
        List asList = Arrays.asList(objArr);
        P0.h.d(asList, "asList(...)");
        return asList;
    }
}
