package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhe implements jhc {
    public final int a;
    public final List b;

    public jhe(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhe)) {
            return false;
        }
        jhe jheVar = (jhe) obj;
        return this.a == jheVar.a && ksp.b(this.b, jheVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ResourceIdContent(resId=" + this.a + ", args=" + this.b + ")";
    }
}
