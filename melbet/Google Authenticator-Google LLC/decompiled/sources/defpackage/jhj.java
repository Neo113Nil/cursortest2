package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhj implements jfy {
    public final jit a;
    private final jiv b = jiv.a;

    public jhj(jit jitVar) {
        this.a = jitVar;
    }

    @Override // defpackage.jfy
    public final jiv a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhj) && ksp.b(this.a, ((jhj) obj).a);
    }

    public final int hashCode() {
        jit jitVar = this.a;
        if (jitVar == null) {
            return 0;
        }
        return jitVar.hashCode();
    }

    public final String toString() {
        return "PrivacyPolicyClick(accountIdentifier=" + this.a + ")";
    }
}
