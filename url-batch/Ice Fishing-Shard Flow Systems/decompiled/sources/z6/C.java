package z6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class C implements x6.e {

    /* renamed from: a, reason: collision with root package name */
    public final x6.e f8733a;

    public C(x6.e eVar) {
        this.f8733a = eVar;
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(r4.f.c(name, " is not a valid list index"));
    }

    @Override // x6.e
    public final V6.b c() {
        return x6.i.f8443c;
    }

    @Override // x6.e
    public final int d() {
        return 1;
    }

    @Override // x6.e
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
        C c7 = (C) obj;
        return Intrinsics.a(this.f8733a, c7.f8733a) && Intrinsics.a(b(), c7.b());
    }

    @Override // x6.e
    public final boolean f() {
        return false;
    }

    @Override // x6.e
    public final List getAnnotations() {
        return kotlin.collections.A.f6115d;
    }

    @Override // x6.e
    public final List h(int i2) {
        if (i2 >= 0) {
            return kotlin.collections.A.f6115d;
        }
        StringBuilder k7 = C4.p.k(i2, "Illegal index ", ", ");
        k7.append(b());
        k7.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k7.toString().toString());
    }

    public final int hashCode() {
        return b().hashCode() + (this.f8733a.hashCode() * 31);
    }

    @Override // x6.e
    public final x6.e i(int i2) {
        if (i2 >= 0) {
            return this.f8733a;
        }
        StringBuilder k7 = C4.p.k(i2, "Illegal index ", ", ");
        k7.append(b());
        k7.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k7.toString().toString());
    }

    @Override // x6.e
    public final boolean j(int i2) {
        if (i2 >= 0) {
            return false;
        }
        StringBuilder k7 = C4.p.k(i2, "Illegal index ", ", ");
        k7.append(b());
        k7.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k7.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.f8733a + ')';
    }

    @Override // x6.e
    public final void g() {
    }
}
