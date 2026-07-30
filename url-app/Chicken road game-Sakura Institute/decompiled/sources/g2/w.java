package g2;

import a2.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f4065a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4066b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f4067c;

    static {
        androidx.room.c cVar = p0.m.f7013a;
    }

    public w(a2.g gVar, long j8, j0 j0Var) {
        this.f4065a = gVar;
        this.f4066b = r4.a.s(j8, gVar.f373f.length());
        this.f4067c = j0Var != null ? new j0(r4.a.s(j0Var.f408a, gVar.f373f.length())) : null;
    }

    public static w a(w wVar, a2.g gVar, long j8, int i7) {
        if ((i7 & 1) != 0) {
            gVar = wVar.f4065a;
        }
        if ((i7 & 2) != 0) {
            j8 = wVar.f4066b;
        }
        j0 j0Var = (i7 & 4) != 0 ? wVar.f4067c : null;
        wVar.getClass();
        return new w(gVar, j8, j0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return j0.a(this.f4066b, wVar.f4066b) && r6.k.a(this.f4067c, wVar.f4067c) && r6.k.a(this.f4065a, wVar.f4065a);
    }

    public final int hashCode() {
        int hashCode = this.f4065a.hashCode() * 31;
        int i7 = j0.f407c;
        int d8 = a0.m.d(hashCode, 31, this.f4066b);
        j0 j0Var = this.f4067c;
        return d8 + (j0Var != null ? Long.hashCode(j0Var.f408a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f4065a) + "', selection=" + ((Object) j0.g(this.f4066b)) + ", composition=" + this.f4067c + ')';
    }

    public w(int i7, long j8, String str) {
        this(new a2.g((i7 & 1) != 0 ? "" : str, null, 6), (i7 & 2) != 0 ? j0.f406b : j8, (j0) null);
    }
}
