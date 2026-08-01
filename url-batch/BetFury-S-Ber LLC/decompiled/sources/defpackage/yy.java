package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class yy extends ea implements ir, qw {
    public final boolean l;

    public yy(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.l = false;
    }

    @Override // defpackage.ir
    public final Object a() {
        return this.g.getClass().getSimpleName();
    }

    @Override // defpackage.ea
    public final nw c() {
        b90.a.getClass();
        return this;
    }

    public final nw e() {
        if (this.l) {
            return this;
        }
        nw nwVar = this.f;
        if (nwVar != null) {
            return nwVar;
        }
        c();
        this.f = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy) {
            yy yyVar = (yy) obj;
            return d().equals(yyVar.d()) && this.i.equals(yyVar.i) && this.j.equals(yyVar.j) && mv.c(this.g, yyVar.g);
        }
        if (obj instanceof qw) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        nw e = e();
        return e != this ? e.toString() : r7.d(new StringBuilder("property "), this.i, " (Kotlin reflection is not available)");
    }
}
