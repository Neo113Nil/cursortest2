package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pl2 {
    public static final pl2 c;
    public final zm3 a;
    public final zm3 b;

    static {
        hb0 hb0Var = hb0.o;
        c = new pl2(hb0Var, hb0Var);
    }

    public pl2(zm3 zm3Var, zm3 zm3Var2) {
        this.a = zm3Var;
        this.b = zm3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl2)) {
            return false;
        }
        pl2 pl2Var = (pl2) obj;
        return this.a.equals(pl2Var.a) && this.b.equals(pl2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
