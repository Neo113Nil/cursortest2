package v0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends o.g {
    public static List B(Object... objArr) {
        if (objArr.length <= 0) {
            return l.f3013e;
        }
        List asList = Arrays.asList(objArr);
        F0.i.d(asList, "asList(...)");
        return asList;
    }
}
