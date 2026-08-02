package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhm {
    public final jhh a;
    public final int b;
    private final jho c;

    public jhm(int i, jhh jhhVar, jho jhoVar) {
        this.b = i;
        this.a = jhhVar;
        this.c = jhoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhm)) {
            return false;
        }
        jhm jhmVar = (jhm) obj;
        return this.b == jhmVar.b && ksp.b(this.a, jhmVar.a) && this.c == jhmVar.c;
    }

    public final int hashCode() {
        jhh jhhVar = this.a;
        int hashCode = jhhVar == null ? 0 : jhhVar.hashCode();
        int i = this.b;
        jho jhoVar = this.c;
        return (((i * 31) + hashCode) * 31) + (jhoVar != null ? jhoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingData(ringType=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? "RING_TYPE_G1_PREMIUM_AURA" : "RING_TYPE_GOOGLE_ONE" : "RING_TYPE_UNDEFINED"));
        sb.append(", accessibilityLabel=");
        sb.append(this.a);
        sb.append(", subscriptionTier=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public jhm() {
        this(1, null, null);
    }
}
