package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qa implements pa {
    public final Class a;

    static {
        List a0 = eb.a0(vl.class, gm.class, u40.class, km.class, lm.class, mm.class, nm.class, om.class, pm.class, qm.class, wl.class, xl.class, yl.class, zl.class, am.class, bm.class, cm.class, dm.class, em.class, fm.class, hm.class, im.class, jm.class);
        ArrayList arrayList = new ArrayList(fb.b0(a0));
        int i = 0;
        for (Object obj : a0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new cx((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        bs.t0(arrayList);
    }

    public qa(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.pa
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qa) && vw.D(this).equals(vw.D((qa) obj));
    }

    public final int hashCode() {
        return vw.D(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
