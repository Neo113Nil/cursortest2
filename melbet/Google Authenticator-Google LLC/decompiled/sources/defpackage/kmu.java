package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmu implements kmw {
    private final kbz a;

    public kmu(kbz kbzVar) {
        kbzVar.getClass();
        this.a = kbzVar;
    }

    @Override // defpackage.kmw
    public final kaq a(kan kanVar, kal kalVar) {
        return kanVar.a(this.a, kalVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmu) {
            return this.a.equals(((kmu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
