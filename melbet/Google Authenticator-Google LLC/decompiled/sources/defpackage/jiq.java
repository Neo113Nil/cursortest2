package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiq implements jip {
    public final jgu a;
    public final int b;

    public jiq(jgu jguVar, int i) {
        this.a = jguVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiq)) {
            return false;
        }
        jiq jiqVar = (jiq) obj;
        return ksp.b(this.a, jiqVar.a) && this.b == jiqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailingImage(image=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append((Object) (this.b != 3 ? "LARGE_32" : "MEDIUM_24"));
        sb.append(")");
        return sb.toString();
    }
}
