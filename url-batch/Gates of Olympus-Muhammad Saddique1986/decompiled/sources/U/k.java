package U;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class k implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q f4484a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4485b;

    public k(q qVar, q qVar2) {
        this.f4484a = qVar;
        this.f4485b = qVar2;
    }

    @Override // U.q
    public final Object a(Object obj, InterfaceC0426e interfaceC0426e) {
        return this.f4485b.a(this.f4484a.a(obj, interfaceC0426e), interfaceC0426e);
    }

    @Override // U.q
    public final boolean d(InterfaceC0424c interfaceC0424c) {
        return this.f4484a.d(interfaceC0424c) && this.f4485b.d(interfaceC0424c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (f2.j.a(this.f4484a, kVar.f4484a) && f2.j.a(this.f4485b, kVar.f4485b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4485b.hashCode() * 31) + this.f4484a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a("", j.f4483e)) + ']';
    }
}
