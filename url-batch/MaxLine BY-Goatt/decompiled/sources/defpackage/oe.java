package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oe {
    public final int a;
    public final t21 b;
    public final tt2 c;
    public final String d;

    public oe(t21 t21Var, tt2 tt2Var, String str) {
        this.b = t21Var;
        this.c = tt2Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{t21Var, tt2Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return ll3.C(this.b, oeVar.b) && ll3.C(this.c, oeVar.c) && ll3.C(this.d, oeVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
