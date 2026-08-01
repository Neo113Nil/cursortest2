package pd;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b {
    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = a.f7703b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object invoke;
        th.getClass();
        Method method = a.f7704c;
        if (method == null || (invoke = method.invoke(th, null)) == null) {
            return j0.f5574d;
        }
        List asList = Arrays.asList((Throwable[]) invoke);
        asList.getClass();
        return asList;
    }
}
