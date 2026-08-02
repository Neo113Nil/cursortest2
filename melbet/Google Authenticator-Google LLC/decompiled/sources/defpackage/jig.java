package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jig {
    public final jgu a;

    public jig(jgu jguVar) {
        this.a = jguVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jig) && ksp.b(this.a, ((jig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(image=" + this.a + ")";
    }
}
