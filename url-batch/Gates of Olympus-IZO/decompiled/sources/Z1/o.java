package Z1;

import H2.AbstractC0080b;
import f2.InterfaceC0386a;
import f2.InterfaceC0390e;

/* loaded from: classes.dex */
public abstract class o extends b implements InterfaceC0390e {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3475j;

    public o(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f3475j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return c().equals(oVar.c()) && this.f3463g.equals(oVar.f3463g) && this.f3464h.equals(oVar.f3464h) && i.a(this.f3461e, oVar.f3461e);
        }
        if (obj instanceof InterfaceC0390e) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3464h.hashCode() + AbstractC0080b.e(c().hashCode() * 31, 31, this.f3463g);
    }

    public final InterfaceC0386a i() {
        if (this.f3475j) {
            return this;
        }
        InterfaceC0386a interfaceC0386a = this.f3460d;
        if (interfaceC0386a != null) {
            return interfaceC0386a;
        }
        InterfaceC0386a a3 = a();
        this.f3460d = a3;
        return a3;
    }

    public final String toString() {
        InterfaceC0386a i3 = i();
        if (i3 != this) {
            return i3.toString();
        }
        return "property " + this.f3463g + " (Kotlin reflection is not available)";
    }
}
