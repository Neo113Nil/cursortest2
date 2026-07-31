package Z1;

import H2.AbstractC0080b;
import f2.InterfaceC0386a;

/* loaded from: classes.dex */
public abstract class g extends b implements f, InterfaceC0386a, L1.e {

    /* renamed from: j, reason: collision with root package name */
    public final int f3470j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3471k;

    public g(int i3, Class cls, String str, String str2, int i4) {
        this(i3, i4, cls, a.f3459d, str, str2);
    }

    @Override // Z1.b
    public final InterfaceC0386a a() {
        u.f3481a.getClass();
        return this;
    }

    @Override // Z1.f
    public final int d() {
        return this.f3470j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f3463g.equals(gVar.f3463g) && this.f3464h.equals(gVar.f3464h) && this.f3471k == gVar.f3471k && this.f3470j == gVar.f3470j && i.a(this.f3461e, gVar.f3461e) && c().equals(gVar.c());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        InterfaceC0386a interfaceC0386a = this.f3460d;
        if (interfaceC0386a == null) {
            a();
            this.f3460d = this;
            interfaceC0386a = this;
        }
        return obj.equals(interfaceC0386a);
    }

    public final int hashCode() {
        c();
        return this.f3464h.hashCode() + AbstractC0080b.e(c().hashCode() * 31, 31, this.f3463g);
    }

    public final String toString() {
        InterfaceC0386a interfaceC0386a = this.f3460d;
        if (interfaceC0386a == null) {
            a();
            this.f3460d = this;
            interfaceC0386a = this;
        }
        if (interfaceC0386a != this) {
            return interfaceC0386a.toString();
        }
        String str = this.f3463g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i3, int i4, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f3470j = i3;
        this.f3471k = 0;
    }
}
