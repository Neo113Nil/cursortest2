package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgw implements jfy {
    public final jit a;
    private final jiv b = jiv.a;

    public jgw(jit jitVar) {
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
        return (obj instanceof jgw) && ksp.b(this.a, ((jgw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ManageYourGoogleAccountClick(accountIdentifier=" + this.a + ")";
    }
}
