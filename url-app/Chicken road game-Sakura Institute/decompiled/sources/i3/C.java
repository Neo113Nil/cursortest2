package i3;

import A.AbstractC0017m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;

/* loaded from: classes.dex */
public final class C implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f7011a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f7012b;

    public C(SerialDescriptor keyDesc, SerialDescriptor valueDesc) {
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f7011a = keyDesc;
        this.f7012b = valueDesc;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        return String.valueOf(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer f4 = kotlin.text.t.f(name);
        if (f4 != null) {
            return f4.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
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
        C c4 = (C) obj;
        c4.getClass();
        return Intrinsics.a(this.f7011a, c4.f7011a) && Intrinsics.a(this.f7012b, c4.f7012b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i2) {
        if (i2 >= 0) {
            return C1405I.f11931d;
        }
        throw new IllegalArgumentException(AbstractC0017m.h(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i4 = i2 % 2;
        if (i4 == 0) {
            return this.f7011a;
        }
        if (i4 == 1) {
            return this.f7012b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f7012b.hashCode() + ((this.f7011a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        return g3.i.f6809j;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0017m.h(i2, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 2;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f7011a + ", " + this.f7012b + ')';
    }
}
