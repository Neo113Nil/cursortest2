package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfh {
    public final jgu a;

    public jfh(jgu jguVar) {
        this.a = jguVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfh) && ksp.b(this.a, ((jfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Badge(image=" + this.a + ")";
    }
}
