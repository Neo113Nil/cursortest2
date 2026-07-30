package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class bb0 extends ex0 {
    @Override // defpackage.ex0
    public final void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Integer num = ab0.b;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }

    @Override // defpackage.ex0
    public final List b(Throwable th) {
        th.getClass();
        Integer num = ab0.b;
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
