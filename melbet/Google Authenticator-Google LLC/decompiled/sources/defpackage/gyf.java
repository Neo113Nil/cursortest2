package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gyf extends gzp {
    public static final gyf a = new gyf();
    private static final long serialVersionUID = 0;

    private gyf() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.gzp
    public final gzp a(gzf gzfVar) {
        return a;
    }

    @Override // defpackage.gzp
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.gzp
    public final Object c(hac hacVar) {
        Object bB = hacVar.bB();
        bB.getClass();
        return bB;
    }

    @Override // defpackage.gzp
    public final Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.gzp
    public final Object e() {
        return null;
    }

    @Override // defpackage.gzp
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.gzp
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gzp
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
