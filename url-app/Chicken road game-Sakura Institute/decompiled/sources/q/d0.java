package q;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public float f9248a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9249b = true;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1024c f9250c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Float.compare(this.f9248a, d0Var.f9248a) == 0 && this.f9249b == d0Var.f9249b && Intrinsics.a(this.f9250c, d0Var.f9250c) && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        int d4 = AbstractC0017m.d(Float.hashCode(this.f9248a) * 31, 31, this.f9249b);
        AbstractC1024c abstractC1024c = this.f9250c;
        return (d4 + (abstractC1024c == null ? 0 : abstractC1024c.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f9248a + ", fill=" + this.f9249b + ", crossAxisAlignment=" + this.f9250c + ", flowLayoutData=null)";
    }
}
