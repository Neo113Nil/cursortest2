package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhx implements jgf {
    public final jgn a;

    public jhx(jgn jgnVar) {
        jgnVar.getClass();
        this.a = jgnVar;
    }

    @Override // defpackage.jgf
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhx) && ksp.b(this.a, ((jhx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithoutAccountsState(button=" + this.a + ")";
    }
}
