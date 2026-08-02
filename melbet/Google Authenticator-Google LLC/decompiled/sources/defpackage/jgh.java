package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgh implements jfy {
    public final jgg a;
    private final jiv b = jiv.b;

    public jgh(jgg jggVar) {
        this.a = jggVar;
    }

    @Override // defpackage.jfy
    public final jiv a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgh) && ksp.b(this.a, ((jgh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AvailableAccountParticleClick(availableAccountData=" + this.a + ")";
    }
}
