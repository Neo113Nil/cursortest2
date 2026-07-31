package C2;

import a.AbstractC0235a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class C implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f691a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f692b;

    public C(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        f2.j.f(serialDescriptor, "keyDesc");
        f2.j.f(serialDescriptor2, "valueDesc");
        this.f691a = serialDescriptor;
        this.f692b = serialDescriptor2;
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
        f2.j.f(str, "name");
        Integer A3 = AbstractC0737q.A(str);
        if (A3 != null) {
            return A3.intValue();
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
        C c2 = (C) obj;
        c2.getClass();
        return f2.j.a(this.f691a, c2.f691a) && f2.j.a(this.f692b, c2.f692b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        if (i3 >= 0) {
            return S1.u.f4320d;
        }
        throw new IllegalArgumentException(A.k.g(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.g(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i4 = i3 % 2;
        if (i4 == 0) {
            return this.f691a;
        }
        if (i4 == 1) {
            return this.f692b;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f692b.hashCode() + ((this.f691a.hashCode() + 710441009) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return A2.k.f259e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(A.k.g(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 2;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f691a + ", " + this.f692b + ')';
    }
}
