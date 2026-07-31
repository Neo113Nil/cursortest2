package w2;

import H2.AbstractC0080b;
import e2.AbstractC0381e;
import h2.AbstractC0454p;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class C implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f8604a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f8605b;

    public C(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        Z1.i.f(serialDescriptor, "keyDesc");
        Z1.i.f(serialDescriptor2, "valueDesc");
        this.f8604a = serialDescriptor;
        this.f8605b = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return String.valueOf(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        Integer j02 = AbstractC0454p.j0(str);
        if (j02 != null) {
            return j02.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        c3.getClass();
        return Z1.i.a(this.f8604a, c3.f8604a) && Z1.i.a(this.f8605b, c3.f8605b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        if (i3 >= 0) {
            return M1.u.f2803d;
        }
        throw new IllegalArgumentException(AbstractC0080b.i("Illegal index ", i3, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.i("Illegal index ", i3, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i4 = i3 % 2;
        if (i4 == 0) {
            return this.f8604a;
        }
        if (i4 == 1) {
            return this.f8605b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f8605b.hashCode() + ((this.f8604a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        return u2.h.f8552d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0080b.i("Illegal index ", i3, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 2;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f8604a + ", " + this.f8605b + ')';
    }
}
