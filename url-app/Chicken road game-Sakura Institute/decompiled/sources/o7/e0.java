package o7;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f6872a;

    public e0(SerialDescriptor serialDescriptor) {
        this.f6872a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        Integer w4 = z6.o.w(str);
        if (w4 != null) {
            return w4.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final a8.m c() {
        return m7.h.f6464h;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        return String.valueOf(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return r6.k.a(this.f6872a, e0Var.f6872a) && r6.k.a(b(), e0Var.b());
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
        return b().hashCode() + (this.f6872a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        if (i7 >= 0) {
            return e6.u.f2826f;
        }
        StringBuilder n8 = a0.m.n(i7, "Illegal index ", ", ");
        n8.append(b());
        n8.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n8.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        if (i7 >= 0) {
            return this.f6872a;
        }
        StringBuilder n8 = a0.m.n(i7, "Illegal index ", ", ");
        n8.append(b());
        n8.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n8.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        if (i7 >= 0) {
            return false;
        }
        StringBuilder n8 = a0.m.n(i7, "Illegal index ", ", ");
        n8.append(b());
        n8.append(" expects only non-negative indices");
        throw new IllegalArgumentException(n8.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.f6872a + ')';
    }
}
