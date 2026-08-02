package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgv implements jgd {
    public final jgu a;

    public jgv(jgu jguVar) {
        this.a = jguVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgv) && ksp.b(this.a, ((jgv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageTitle(image=" + this.a + ")";
    }
}
