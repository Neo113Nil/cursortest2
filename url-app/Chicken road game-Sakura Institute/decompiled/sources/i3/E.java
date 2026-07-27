package i3;

import A.AbstractC0017m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;

/* loaded from: classes.dex */
public abstract class E implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f7014a;

    public E(SerialDescriptor serialDescriptor) {
        this.f7014a = serialDescriptor;
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
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e4 = (E) obj;
        return Intrinsics.a(this.f7014a, e4.f7014a) && Intrinsics.a(d(), e4.d());
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
        StringBuilder o4 = AbstractC0017m.o(i2, "Illegal index ", ", ");
        o4.append(d());
        o4.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o4.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        if (i2 >= 0) {
            return this.f7014a;
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "Illegal index ", ", ");
        o4.append(d());
        o4.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o4.toString().toString());
    }

    public final int hashCode() {
        return d().hashCode() + (this.f7014a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        return g3.i.f6808i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        if (i2 >= 0) {
            return false;
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "Illegal index ", ", ");
        o4.append(d());
        o4.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o4.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 1;
    }

    public final String toString() {
        return d() + '(' + this.f7014a + ')';
    }
}
