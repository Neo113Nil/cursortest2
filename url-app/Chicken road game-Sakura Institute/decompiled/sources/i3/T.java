package i3;

import A.AbstractC0017m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;

/* loaded from: classes.dex */
public final class T implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f7044a;

    /* renamed from: b, reason: collision with root package name */
    public final g3.e f7045b;

    public T(String serialName, g3.e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f7044a = serialName;
        this.f7045b = kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f7044a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t4 = (T) obj;
        if (Intrinsics.a(this.f7044a, t4.f7044a)) {
            if (Intrinsics.a(this.f7045b, t4.f7045b)) {
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
    public final List g(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f7045b.hashCode() * 31) + this.f7044a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        return this.f7045b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return 0;
    }

    public final String toString() {
        return AbstractC0017m.m(new StringBuilder("PrimitiveDescriptor("), this.f7044a, ')');
    }
}
