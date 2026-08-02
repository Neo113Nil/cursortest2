package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuf {
    public final frv a;
    public final ful b;
    public final int c;

    public fuf(frv frvVar, ful fulVar, int i) {
        this.a = frvVar;
        if (fulVar == null) {
            throw new NullPointerException("Null info");
        }
        this.b = fulVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fuf) {
            fuf fufVar = (fuf) obj;
            if (this.a.equals(fufVar.a) && this.b.equals(fufVar.b) && this.c == fufVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        int i = this.c - 1;
        return "Account{id=" + this.a.toString() + ", info=" + this.b.toString() + ", state=" + Integer.toString(i) + "}";
    }

    public fuf() {
        throw null;
    }
}
