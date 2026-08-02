package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgq implements jfy {
    public final boolean a;
    private final jiv b = jiv.b;

    public jgq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.jfy
    public final jiv a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgq) && this.a == ((jgq) obj).a;
    }

    public final int hashCode() {
        return a.m(this.a);
    }

    public final String toString() {
        return "ExpandOrCollapseAccountManagement(isExpanded=" + this.a + ")";
    }
}
