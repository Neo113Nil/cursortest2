package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ma {
    static {
        List F0 = cb.F0(ml.class, xl.class, l40.class, bm.class, cm.class, dm.class, em.class, fm.class, gm.class, hm.class, nl.class, ol.class, pl.class, ql.class, rl.class, sl.class, tl.class, ul.class, vl.class, wl.class, yl.class, zl.class, am.class);
        ArrayList arrayList = new ArrayList(db.G0(F0));
        int i = 0;
        for (Object obj : F0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new pw((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        pr.F0(arrayList);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ma) && o8.A(this).equals(o8.A((ma) obj));
    }

    public final int hashCode() {
        return o8.A(this).hashCode();
    }

    public final String toString() {
        return c10.class + " (Kotlin reflection is not available)";
    }
}
