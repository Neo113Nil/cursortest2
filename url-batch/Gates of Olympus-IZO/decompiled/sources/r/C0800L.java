package r;

import H2.AbstractC0080b;

/* renamed from: r.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800L {

    /* renamed from: a, reason: collision with root package name */
    public float f7011a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7012b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0800L)) {
            return false;
        }
        C0800L c0800l = (C0800L) obj;
        return Float.compare(this.f7011a, c0800l.f7011a) == 0 && this.f7012b == c0800l.f7012b && Z1.i.a(null, null) && Z1.i.a(null, null);
    }

    public final int hashCode() {
        return AbstractC0080b.f(Float.hashCode(this.f7011a) * 31, 961, this.f7012b);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f7011a + ", fill=" + this.f7012b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
