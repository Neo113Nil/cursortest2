package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyu extends kyv {
    public final Throwable a;

    public kyu(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kyu) && ksp.b(this.a, ((kyu) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.kyv
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
