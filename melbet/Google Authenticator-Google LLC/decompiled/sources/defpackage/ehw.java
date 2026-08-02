package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehw implements eia {
    private final jit a;
    private final String b;
    private final dkr c;

    public ehw(jit jitVar, String str) {
        this.a = jitVar;
        this.b = str;
        this.c = dih.j(str);
    }

    @Override // defpackage.eia
    public final dkr a() {
        return this.c;
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
        if (!(obj instanceof ehw)) {
            return false;
        }
        ehw ehwVar = (ehw) obj;
        return ksp.b(this.a, ehwVar.a) && ksp.b(this.b, ehwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GaiaAccount(accountIdentifier=" + this.a + ", accountName=" + this.b + ")";
    }
}
