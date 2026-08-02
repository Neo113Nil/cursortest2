package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpo implements Comparable {
    public final gzp a;
    public final gzp b;

    public dpo(gzp gzpVar, gzp gzpVar2) {
        this.a = gzpVar;
        this.b = gzpVar2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dpo dpoVar) {
        return hih.a.a().compare((Comparable) this.a.e(), (Comparable) dpoVar.a.e());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dpo) {
            dpo dpoVar = (dpo) obj;
            if (this.a.equals(dpoVar.a) && this.b.equals(dpoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        gzp gzpVar = this.b;
        return "DecorationContent{badgeContent=" + String.valueOf(this.a) + ", ringContent=" + String.valueOf(gzpVar) + "}";
    }

    public dpo() {
        throw null;
    }
}
