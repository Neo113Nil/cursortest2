package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class yt implements rn, vr, Serializable {
    public transient vr f;
    public final zt g;
    public final Class h = xf.class;
    public final String i = "classSimpleName";
    public final String j = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;";
    public final boolean k = true;
    public final boolean l = false;

    public yt(zt ztVar) {
        this.g = ztVar;
    }

    @Override // defpackage.rn
    public final Object a() {
        return this.g.getClass().getSimpleName();
    }

    public final vr c() {
        if (this.l) {
            return this;
        }
        vr vrVar = this.f;
        if (vrVar != null) {
            return vrVar;
        }
        u20.a.getClass();
        this.f = this;
        return this;
    }

    public final fb d() {
        boolean z = this.k;
        Class cls = this.h;
        if (!z) {
            return u20.a(cls);
        }
        u20.a.getClass();
        return new qz(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yt) {
            yt ytVar = (yt) obj;
            return d().equals(ytVar.d()) && this.i.equals(ytVar.i) && this.j.equals(ytVar.j) && this.g.equals(ytVar.g);
        }
        if (obj instanceof yt) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        vr c = c();
        if (c != this) {
            return c.toString();
        }
        return "property " + this.i + " (Kotlin reflection is not available)";
    }
}
