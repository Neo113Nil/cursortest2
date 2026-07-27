package P4;

import b2.AbstractC0279e;
import g4.C0471p;
import java.util.List;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public abstract class C implements N4.e {

    /* renamed from: a, reason: collision with root package name */
    public final N4.e f2321a;

    public C(N4.e eVar) {
        this.f2321a = eVar;
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer P5 = B4.r.P(name);
        if (P5 != null) {
            return P5.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        return N4.j.f2191c;
    }

    @Override // N4.e
    public final int d() {
        return 1;
    }

    @Override // N4.e
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return kotlin.jvm.internal.i.a(this.f2321a, c2.f2321a) && kotlin.jvm.internal.i.a(b(), c2.b());
    }

    @Override // N4.e
    public final List g(int i2) {
        if (i2 >= 0) {
            return C0471p.f5750a;
        }
        StringBuilder i3 = AbstractC0279e.i(i2, "Illegal index ", ", ");
        i3.append(b());
        i3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(i3.toString().toString());
    }

    @Override // N4.e
    public final List getAnnotations() {
        return C0471p.f5750a;
    }

    @Override // N4.e
    public final N4.e h(int i2) {
        if (i2 >= 0) {
            return this.f2321a;
        }
        StringBuilder i3 = AbstractC0279e.i(i2, "Illegal index ", ", ");
        i3.append(b());
        i3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(i3.toString().toString());
    }

    public final int hashCode() {
        return b().hashCode() + (this.f2321a.hashCode() * 31);
    }

    @Override // N4.e
    public final boolean i(int i2) {
        if (i2 >= 0) {
            return false;
        }
        StringBuilder i3 = AbstractC0279e.i(i2, "Illegal index ", ", ");
        i3.append(b());
        i3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(i3.toString().toString());
    }

    @Override // N4.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return b() + '(' + this.f2321a + ')';
    }

    @Override // N4.e
    public final void f() {
    }
}
