package o7;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f6863a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f6864b;

    public c0(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        r6.k.f(serialDescriptor, "keyDesc");
        r6.k.f(serialDescriptor2, "valueDesc");
        this.f6863a = serialDescriptor;
        this.f6864b = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        Integer w4 = z6.o.w(str);
        if (w4 != null) {
            return w4.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final a8.m c() {
        return m7.h.f6465i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        return String.valueOf(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return r6.k.a(this.f6863a, c0Var.f6863a) && r6.k.a(this.f6864b, c0Var.f6864b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f6864b.hashCode() + ((this.f6863a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        if (i7 >= 0) {
            return e6.u.f2826f;
        }
        throw new IllegalArgumentException(a0.m.g(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.g(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i8 = i7 % 2;
        if (i8 == 0) {
            return this.f6863a;
        }
        if (i8 == 1) {
            return this.f6864b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(a0.m.g(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f6863a + ", " + this.f6864b + ')';
    }
}
