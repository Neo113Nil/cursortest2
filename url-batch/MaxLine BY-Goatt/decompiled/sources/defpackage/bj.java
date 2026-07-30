package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bj extends cj {
    public final xy1 a;
    public final mq2 b;

    public bj(xy1 xy1Var, mq2 mq2Var) {
        this.a = xy1Var;
        this.b = mq2Var;
    }

    @Override // defpackage.cj
    public final xy1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.a.equals(bjVar.a) && this.b.equals(bjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
