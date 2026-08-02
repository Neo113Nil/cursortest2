package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jia {
    public final List a;
    public final int b;

    public jia(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jia)) {
            return false;
        }
        jia jiaVar = (jia) obj;
        return ksp.b(this.a, jiaVar.a) && this.b == jiaVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CardStack(rows=" + this.a + ", stableId=" + this.b + ")";
    }

    public /* synthetic */ jia(int i) {
        this(kpk.a, i);
    }
}
