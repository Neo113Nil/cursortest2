package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jii implements jif {
    public final jhq a;

    public jii(jhq jhqVar) {
        this.a = jhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jii) && ksp.b(this.a, ((jii) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Paragraph(text=" + this.a + ")";
    }
}
