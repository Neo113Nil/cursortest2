package w2;

import H2.AbstractC0080b;
import e2.AbstractC0381e;
import h2.AbstractC0454p;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public abstract class E implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f8607a;

    public E(SerialDescriptor serialDescriptor) {
        this.f8607a = serialDescriptor;
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
        return Z1.i.a(this.f8607a, e3.f8607a) && Z1.i.a(d(), e3.d());
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
        StringBuilder l3 = AbstractC0080b.l("Illegal index ", i3, ", ");
        l3.append(d());
        l3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l3.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        if (i3 >= 0) {
            return this.f8607a;
        }
        StringBuilder l3 = AbstractC0080b.l("Illegal index ", i3, ", ");
        l3.append(d());
        l3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l3.toString().toString());
    }

    public final int hashCode() {
        return d().hashCode() + (this.f8607a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        return u2.h.f8551c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        StringBuilder l3 = AbstractC0080b.l("Illegal index ", i3, ", ");
        l3.append(d());
        l3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l3.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 1;
    }

    public final String toString() {
        return d() + '(' + this.f8607a + ')';
    }
}
