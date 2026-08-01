package qd;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b extends pd.b {
    @Override // pd.b
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = a.f8063b;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // pd.b
    public final List b(Throwable th) {
        th.getClass();
        Integer num = a.f8063b;
        if (num != null && num.intValue() < 19) {
            return super.b(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        List asList = Arrays.asList(suppressed);
        asList.getClass();
        return asList;
    }
}
