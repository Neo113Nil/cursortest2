package z6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class A implements x6.e {

    /* renamed from: a, reason: collision with root package name */
    public final x6.e f8730a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.e f8731b;

    public A(x6.e keyDesc, x6.e valueDesc) {
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f8730a = keyDesc;
        this.f8731b = valueDesc;
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(r4.f.c(name, " is not a valid map index"));
    }

    @Override // x6.e
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // x6.e
    public final V6.b c() {
        return x6.i.f8444d;
    }

    @Override // x6.e
    public final int d() {
        return 2;
    }

    @Override // x6.e
    public final String e(int i2) {
        return String.valueOf(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        a7.getClass();
        return Intrinsics.a(this.f8730a, a7.f8730a) && Intrinsics.a(this.f8731b, a7.f8731b);
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
        throw new IllegalArgumentException(C4.p.h(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f8731b.hashCode() + ((this.f8730a.hashCode() + 710441009) * 31);
    }

    @Override // x6.e
    public final x6.e i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.h(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i5 = i2 % 2;
        if (i5 == 0) {
            return this.f8730a;
        }
        if (i5 == 1) {
            return this.f8731b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // x6.e
    public final boolean j(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(C4.p.h(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f8730a + ", " + this.f8731b + ')';
    }

    @Override // x6.e
    public final void g() {
    }
}
