package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kol implements Serializable {
    public final Object a;
    public final Object b;

    public kol(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kol)) {
            return false;
        }
        kol kolVar = (kol) obj;
        return ksp.b(this.a, kolVar.a) && ksp.b(this.b, kolVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}
