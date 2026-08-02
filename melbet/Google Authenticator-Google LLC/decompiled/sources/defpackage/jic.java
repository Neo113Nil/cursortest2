package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jic implements jib {
    public final jhy a;

    public jic(jhy jhyVar) {
        jhyVar.getClass();
        this.a = jhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jic) && ksp.b(this.a, ((jic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CardStackItemCard(card=" + this.a + ")";
    }
}
