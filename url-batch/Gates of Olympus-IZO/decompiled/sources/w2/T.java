package w2;

import e2.AbstractC0381e;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class T implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f8635a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.e f8636b;

    public T(String str, u2.e eVar) {
        Z1.i.f(eVar, "kind");
        this.f8635a = str;
        this.f8636b = eVar;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f8635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        if (Z1.i.a(this.f8635a, t3.f8635a)) {
            if (Z1.i.a(this.f8636b, t3.f8636b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f8636b.hashCode() * 31) + this.f8635a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        return this.f8636b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 0;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f8635a + ')';
    }
}
