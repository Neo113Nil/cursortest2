package C2;

import a.AbstractC0235a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public abstract class E implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f694a;

    public E(SerialDescriptor serialDescriptor) {
        this.f694a = serialDescriptor;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return f2.j.a(this.f694a, e3.f694a) && f2.j.a(d(), e3.d());
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
        StringBuilder k3 = A.k.k(i3, "Illegal index ", ", ");
        k3.append(d());
        k3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k3.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        if (i3 >= 0) {
            return this.f694a;
        }
        StringBuilder k3 = A.k.k(i3, "Illegal index ", ", ");
        k3.append(d());
        k3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k3.toString().toString());
    }

    public final int hashCode() {
        return d().hashCode() + (this.f694a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return A2.k.f258d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        StringBuilder k3 = A.k.k(i3, "Illegal index ", ", ");
        k3.append(d());
        k3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(k3.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 1;
    }

    public final String toString() {
        return d() + '(' + this.f694a + ')';
    }
}
