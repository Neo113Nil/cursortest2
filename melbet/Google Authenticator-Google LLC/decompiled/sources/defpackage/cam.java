package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cam {
    public final hvi a;
    public final hvi b;

    public cam(hvi hviVar, hvi hviVar2) {
        this.a = hviVar;
        this.b = hviVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cam) {
            cam camVar = (cam) obj;
            if (this.a.equals(camVar.a) && this.b.equals(camVar.b)) {
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
        hvi hviVar = this.b;
        return "OtpChangeFutures{localChange=" + this.a.toString() + ", passboxChange=" + hviVar.toString() + "}";
    }

    public cam() {
        throw null;
    }
}
