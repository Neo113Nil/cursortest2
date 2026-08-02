package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzs extends gzp {
    private static final long serialVersionUID = 0;
    public final Object a;

    public gzs(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.gzp
    public final gzp a(gzf gzfVar) {
        Object a = gzfVar.a(this.a);
        a.getClass();
        return new gzs(a);
    }

    @Override // defpackage.gzp
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.gzp
    public final Object c(hac hacVar) {
        return this.a;
    }

    @Override // defpackage.gzp
    public final Object d(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.gzp
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.gzp
    public final boolean equals(Object obj) {
        if (obj instanceof gzs) {
            return this.a.equals(((gzs) obj).a);
        }
        return false;
    }

    @Override // defpackage.gzp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.gzp
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
