package f2;

import l2.InterfaceC0600a;
import l2.InterfaceC0604e;

/* loaded from: classes.dex */
public abstract class p extends b implements InterfaceC0604e {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5827j;

    public p(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f5827j = false;
    }

    public final InterfaceC0600a e() {
        if (this.f5827j) {
            return this;
        }
        InterfaceC0600a interfaceC0600a = this.f5812d;
        if (interfaceC0600a != null) {
            return interfaceC0600a;
        }
        InterfaceC0600a a3 = a();
        this.f5812d = a3;
        return a3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return c().equals(pVar.c()) && this.f5815g.equals(pVar.f5815g) && this.f5816h.equals(pVar.f5816h) && j.a(this.f5813e, pVar.f5813e);
        }
        if (obj instanceof InterfaceC0604e) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.f5816h.hashCode() + A.k.d(c().hashCode() * 31, 31, this.f5815g);
    }

    public final String toString() {
        InterfaceC0600a e3 = e();
        if (e3 != this) {
            return e3.toString();
        }
        return "property " + this.f5815g + " (Kotlin reflection is not available)";
    }
}
