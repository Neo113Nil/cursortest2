package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jio implements jin {
    public final jip a;
    public final jip b;
    public final int c;
    private final jhb d;

    public jio(jip jipVar, jip jipVar2, int i) {
        jipVar.getClass();
        jipVar2.getClass();
        this.a = jipVar;
        this.b = jipVar2;
        this.c = i;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jio)) {
            return false;
        }
        jio jioVar = (jio) obj;
        if (!ksp.b(this.a, jioVar.a) || !ksp.b(this.b, jioVar.b) || this.c != jioVar.c) {
            return false;
        }
        jhb jhbVar = jioVar.d;
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailingContentPair(first=");
        sb.append(this.a);
        sb.append(", second=");
        sb.append(this.b);
        sb.append(", spacing=");
        sb.append((Object) (this.c != 1 ? "MEDIUM_8" : "SMALL_4"));
        sb.append(", background=null)");
        return sb.toString();
    }
}
