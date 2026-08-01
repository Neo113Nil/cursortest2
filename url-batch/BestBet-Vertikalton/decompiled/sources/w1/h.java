package w1;

import j1.InterfaceC0170a;
import s1.AbstractC0335s;

/* loaded from: classes.dex */
public final /* synthetic */ class h extends k1.a implements InterfaceC0170a, p1.a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4503g;

    public h(i iVar) {
        super(iVar, AbstractC0335s.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f4503g = false;
    }

    public final p1.a b() {
        if (!this.f4503g) {
            p1.a aVar = this.f3233a;
            if (aVar != null) {
                return aVar;
            }
            k1.i.f3246a.getClass();
            this.f3233a = this;
        }
        return this;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        return this.f3234b.getClass().getSimpleName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return a().equals(hVar.a()) && this.d.equals(hVar.d) && this.f3236e.equals(hVar.f3236e) && this.f3234b.equals(hVar.f3234b);
        }
        if (obj instanceof h) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3236e.hashCode() + ((this.d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        p1.a b2 = b();
        if (b2 != this) {
            return b2.toString();
        }
        return "property " + this.d + " (Kotlin reflection is not available)";
    }
}
