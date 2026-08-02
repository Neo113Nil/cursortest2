package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhk {
    public final jhh a;
    public final List b;

    public jhk(jhh jhhVar, List list) {
        list.getClass();
        this.a = jhhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhk)) {
            return false;
        }
        jhk jhkVar = (jhk) obj;
        return ksp.b(this.a, jhkVar.a) && ksp.b(this.b, jhkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProductSpaceData(productSpaceTitle=" + this.a + ", cardStacks=" + this.b + ")";
    }
}
