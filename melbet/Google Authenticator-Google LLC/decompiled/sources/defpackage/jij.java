package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jij implements jif {
    public final jik a;

    public jij(jik jikVar) {
        this.a = jikVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jij) && ksp.b(this.a, ((jij) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Progress(progressContent=" + this.a + ")";
    }
}
