package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfx {
    public final jit a;
    public final jhh b;
    public final jhh c;
    public final jhh d = null;

    public jfx(jit jitVar, jhh jhhVar, jhh jhhVar2) {
        this.a = jitVar;
        this.b = jhhVar;
        this.c = jhhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfx)) {
            return false;
        }
        jfx jfxVar = (jfx) obj;
        if (!ksp.b(this.a, jfxVar.a) || !ksp.b(this.b, jfxVar.b) || !ksp.b(this.c, jfxVar.c)) {
            return false;
        }
        jhh jhhVar = jfxVar.d;
        return ksp.b(null, null);
    }

    public final int hashCode() {
        jit jitVar = this.a;
        return (((((jitVar == null ? 0 : jitVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "AccountMenuFooterData(accountIdentifier=" + this.a + ", privacyPolicyTitle=" + this.b + ", tosTitle=" + this.c + ", customButtonTitle=null)";
    }
}
