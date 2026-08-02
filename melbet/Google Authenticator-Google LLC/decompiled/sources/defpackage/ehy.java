package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehy implements eia {
    private final jit a;
    private final dkr b = dih.k();

    public ehy(jit jitVar) {
        this.a = jitVar;
    }

    @Override // defpackage.eia
    public final dkr a() {
        return this.b;
    }

    @Override // defpackage.eia
    public final jit b() {
        return this.a;
    }

    @Override // defpackage.eia
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehy) && ksp.b(this.a, ((ehy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NonGaiaAccount(accountIdentifier=" + this.a + ")";
    }
}
