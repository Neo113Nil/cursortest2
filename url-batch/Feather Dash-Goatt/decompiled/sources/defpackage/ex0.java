package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ex0 {
    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = dx0.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object invoke;
        th.getClass();
        Method method = dx0.c;
        if (method == null || (invoke = method.invoke(th, null)) == null) {
            return nv.d;
        }
        List asList = Arrays.asList((Throwable[]) invoke);
        asList.getClass();
        return asList;
    }
}
