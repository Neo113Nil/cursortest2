package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bql extends bqa {
    private final bqz a;

    public bql(bqz bqzVar) {
        if (bqzVar == null) {
            throw new NullPointerException("Null localAccount");
        }
        this.a = bqzVar;
    }

    @Override // defpackage.bqa
    public final bqz a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqa) {
            return this.a.equals(((bqa) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AccountChosenEvent{localAccount=" + this.a.toString() + "}";
    }
}
