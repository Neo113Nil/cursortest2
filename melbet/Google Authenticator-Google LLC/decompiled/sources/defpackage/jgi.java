package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgi {
    public final float a;
    public final jhm b;
    public final jgj c;

    public jgi(float f, jhm jhmVar, jgj jgjVar) {
        this.a = f;
        this.b = jhmVar;
        this.c = jgjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgi)) {
            return false;
        }
        jgi jgiVar = (jgi) obj;
        return Float.compare(this.a, jgiVar.a) == 0 && ksp.b(this.b, jgiVar.b) && ksp.b(this.c, jgiVar.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        jhm jhmVar = this.b;
        int hashCode = (floatToIntBits + (jhmVar == null ? 0 : jhmVar.hashCode())) * 31;
        jgj jgjVar = this.c;
        return hashCode + (jgjVar != null ? jgjVar.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarData(alpha=" + this.a + ", ringData=" + this.b + ", badgeData=" + this.c + ")";
    }

    public jgi() {
        this(1.0f, null, null);
    }
}
