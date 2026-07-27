package l2;

import o2.t;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final g2.e f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final h f7985b;

    public i(g2.e eVar, h hVar) {
        this.f7984a = eVar;
        this.f7985b = hVar;
    }

    public static i a(g2.e eVar) {
        return new i(eVar, h.f7978f);
    }

    public final boolean b() {
        h hVar = this.f7985b;
        return hVar.d() && hVar.f7983e.equals(t.f8953a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f7984a.equals(iVar.f7984a) && this.f7985b.equals(iVar.f7985b);
    }

    public final int hashCode() {
        return this.f7985b.hashCode() + (this.f7984a.hashCode() * 31);
    }

    public final String toString() {
        return this.f7984a + ":" + this.f7985b;
    }
}
