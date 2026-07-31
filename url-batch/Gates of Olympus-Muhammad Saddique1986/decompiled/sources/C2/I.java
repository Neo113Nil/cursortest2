package C2;

import a.AbstractC0235a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class I implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public static final I f700a = new I();

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return "kotlin.Nothing";
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (A2.k.f260f.hashCode() * 31) - 1818355776;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return A2.k.f260f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        return "NothingSerialDescriptor";
    }
}
