package T5;

import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public abstract class C implements R5.e {

    /* renamed from: a, reason: collision with root package name */
    public final R5.e f2384a;

    public C(R5.e eVar) {
        this.f2384a = eVar;
    }

    @Override // R5.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer J3 = F5.q.J(name);
        if (J3 != null) {
            return J3.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // R5.e
    public final A3.c c() {
        return R5.i.f2173c;
    }

    @Override // R5.e
    public final int d() {
        return 1;
    }

    @Override // R5.e
    public final String e(int i7) {
        return String.valueOf(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return kotlin.jvm.internal.i.a(this.f2384a, c7.f2384a) && kotlin.jvm.internal.i.a(b(), c7.b());
    }

    @Override // R5.e
    public final List g(int i7) {
        if (i7 >= 0) {
            return C0512p.f5303f;
        }
        throw new IllegalArgumentException(("Illegal index " + i7 + ", " + b() + " expects only non-negative indices").toString());
    }

    @Override // R5.e
    public final List getAnnotations() {
        return C0512p.f5303f;
    }

    @Override // R5.e
    public final R5.e h(int i7) {
        if (i7 >= 0) {
            return this.f2384a;
        }
        throw new IllegalArgumentException(("Illegal index " + i7 + ", " + b() + " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return b().hashCode() + (this.f2384a.hashCode() * 31);
    }

    @Override // R5.e
    public final boolean i(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i7 + ", " + b() + " expects only non-negative indices").toString());
    }

    @Override // R5.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return b() + '(' + this.f2384a + ')';
    }

    @Override // R5.e
    public final void f() {
    }
}
