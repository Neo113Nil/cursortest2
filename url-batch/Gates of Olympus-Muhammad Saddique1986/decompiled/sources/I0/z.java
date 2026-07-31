package I0;

import C0.C0031g;
import C0.J;
import z.C1256t;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3098b;

    /* renamed from: c, reason: collision with root package name */
    public final J f3099c;

    static {
        C1256t c1256t = R.o.f4037a;
    }

    public z(C0031g c0031g, long j3, J j4) {
        J j5;
        this.f3097a = c0031g;
        this.f3098b = O2.l.S(j3, c0031g.f596a.length());
        if (j4 != null) {
            j5 = new J(O2.l.S(j4.f569a, c0031g.f596a.length()));
        } else {
            j5 = null;
        }
        this.f3099c = j5;
    }

    public static z a(z zVar, C0031g c0031g, long j3, int i3) {
        if ((i3 & 1) != 0) {
            c0031g = zVar.f3097a;
        }
        if ((i3 & 2) != 0) {
            j3 = zVar.f3098b;
        }
        J j4 = (i3 & 4) != 0 ? zVar.f3099c : null;
        zVar.getClass();
        return new z(c0031g, j3, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return J.a(this.f3098b, zVar.f3098b) && f2.j.a(this.f3099c, zVar.f3099c) && f2.j.a(this.f3097a, zVar.f3097a);
    }

    public final int hashCode() {
        int hashCode = this.f3097a.hashCode() * 31;
        int i3 = J.f568c;
        int c2 = A.k.c(hashCode, 31, this.f3098b);
        J j3 = this.f3099c;
        return c2 + (j3 != null ? Long.hashCode(j3.f569a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f3097a) + "', selection=" + ((Object) J.g(this.f3098b)) + ", composition=" + this.f3099c + ')';
    }

    public z(String str, long j3, int i3) {
        this(new C0031g((i3 & 1) != 0 ? "" : str, null, 6), (i3 & 2) != 0 ? J.f567b : j3, (J) null);
    }
}
