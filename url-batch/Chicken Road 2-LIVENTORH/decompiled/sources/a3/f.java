package a3;

import a.y;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class f extends y {
    public static List W(Object... objArr) {
        if (objArr.length <= 0) {
            return m.f113f;
        }
        List asList = Arrays.asList(objArr);
        f3.d.d(asList, "asList(...)");
        return asList;
    }
}
