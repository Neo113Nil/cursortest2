package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class fs extends ea implements es, nw, ds {
    public final int l;
    public final int m;

    public fs(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.l = i;
        this.m = 0;
    }

    @Override // defpackage.es
    public final int b() {
        return this.l;
    }

    @Override // defpackage.ea
    public final nw c() {
        b90.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [nw] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fs) {
            fs fsVar = (fs) obj;
            return this.i.equals(fsVar.i) && this.j.equals(fsVar.j) && this.m == fsVar.m && this.l == fsVar.l && mv.c(this.g, fsVar.g) && d().equals(fsVar.d());
        }
        if (!(obj instanceof fs)) {
            return false;
        }
        ?? r0 = this.f;
        if (r0 == 0) {
            c();
            this.f = this;
        } else {
            this = r0;
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        d();
        return this.j.hashCode() + ((this.i.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        nw nwVar = this.f;
        if (nwVar == null) {
            c();
            this.f = this;
            nwVar = this;
        }
        if (nwVar != this) {
            return nwVar.toString();
        }
        String str = this.i;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : r7.c("function ", str, " (Kotlin reflection is not available)");
    }

    public fs(int i, Class cls, String str, String str2, int i2) {
        this(i, da.f, cls, str, str2, i2, 0);
    }
}
