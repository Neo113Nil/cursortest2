package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ib {
    public final ol0 a;
    public final xb b;

    public ib(ol0 ol0Var, xb xbVar) {
        this.a = ol0Var;
        this.b = xbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ib) {
            ib ibVar = (ib) obj;
            if (this.a != ibVar.a) {
                return false;
            }
            Object obj2 = dz0.d;
            if (obj2.equals(obj2) && this.b.equals(ibVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ dz0.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + dz0.d + ", productData=" + this.b + "}";
    }
}
