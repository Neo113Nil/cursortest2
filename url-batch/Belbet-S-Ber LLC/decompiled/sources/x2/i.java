package x2;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class i extends s.a {
    public static int A(List list) {
        i3.d.e(list, "<this>");
        return list.size() - 1;
    }

    public static List B(Object... objArr) {
        i3.d.e(objArr, "elements");
        if (objArr.length <= 0) {
            return q.f3887f;
        }
        List asList = Arrays.asList(objArr);
        i3.d.d(asList, "asList(...)");
        return asList;
    }
}
