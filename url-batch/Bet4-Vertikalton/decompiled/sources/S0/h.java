package S0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends w1.d {
    public static int x0(List list) {
        d1.d.e(list, "<this>");
        return list.size() - 1;
    }

    public static List y0(Object... objArr) {
        d1.d.e(objArr, "elements");
        return objArr.length > 0 ? f.b0(objArr) : p.f795a;
    }
}
