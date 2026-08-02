package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzb extends jzi {
    private final jze a;

    public jzb(jze jzeVar) {
        jzeVar.getClass();
        this.a = jzeVar;
    }

    @Override // defpackage.jzi
    public final jze a(jzf jzfVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jzb) {
            return this.a.equals(((jzb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
