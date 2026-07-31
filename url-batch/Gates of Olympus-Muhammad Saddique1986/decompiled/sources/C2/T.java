package C2;

import a.AbstractC0235a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class T implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f722a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.e f723b;

    public T(String str, A2.e eVar) {
        f2.j.f(eVar, "kind");
        this.f722a = str;
        this.f723b = eVar;
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
        f2.j.f(str, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        if (f2.j.a(this.f722a, t3.f722a)) {
            if (f2.j.a(this.f723b, t3.f723b)) {
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
        return (this.f723b.hashCode() * 31) + this.f722a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return this.f723b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 0;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f722a + ')';
    }
}
