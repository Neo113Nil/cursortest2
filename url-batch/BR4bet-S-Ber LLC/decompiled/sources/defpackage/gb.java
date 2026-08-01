package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gb implements fb {
    public static final Map b;
    public final Class a;

    static {
        List i0 = xb.i0(rn.class, co.class, ho.class, io.class, jo.class, ko.class, lo.class, mo.class, no.class, oo.class, sn.class, tn.class, un.class, vn.class, wn.class, xn.class, yn.class, zn.class, ao.class, bo.class, eo.class, fo.class, go.class);
        ArrayList arrayList = new ArrayList(yb.k0(i0));
        int i = 0;
        for (Object obj : i0) {
            int i2 = i + 1;
            if (i < 0) {
                xb.j0();
                throw null;
            }
            arrayList.add(new tz((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = pu.q0(arrayList);
    }

    public gb(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.fb
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gb) && la0.B(this).equals(la0.B((gb) obj));
    }

    public final int hashCode() {
        return la0.B(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
