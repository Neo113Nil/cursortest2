package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hip implements Serializable, gzr {
    public static final hip a = new hip(hct.a, hcr.a);
    private static final long serialVersionUID = 0;
    public final hcu b;
    public final hcu c;

    public hip(hcu hcuVar, hcu hcuVar2) {
        this.b = hcuVar;
        this.c = hcuVar2;
        if (hcuVar == hcr.a || hcuVar2 == hct.a) {
            throw new IllegalArgumentException("Invalid range: ".concat("(-∞..+∞)"));
        }
    }

    @Override // defpackage.gzr
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        ((Comparable) obj).getClass();
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hip) {
            hip hipVar = (hip) obj;
            if (this.b.equals(hipVar.b) && this.c.equals(hipVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.b) * 31) + System.identityHashCode(this.c);
    }

    Object readResolve() {
        hip hipVar = a;
        return equals(hipVar) ? hipVar : this;
    }

    public final String toString() {
        return "(-∞..+∞)";
    }
}
