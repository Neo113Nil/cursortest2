package i3;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class V implements SerialDescriptor, InterfaceC0689j {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f7047a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7048b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f7049c;

    public V(SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f7047a = original;
        this.f7048b = original.d() + '?';
        this.f7049c = M.b(original);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        return this.f7047a.a(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.f7047a.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f7047a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f7048b;
    }

    @Override // i3.InterfaceC0689j
    public final Set e() {
        return this.f7049c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return Intrinsics.a(this.f7047a, ((V) obj).f7047a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i2) {
        return this.f7047a.g(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        return this.f7047a.h(i2);
    }

    public final int hashCode() {
        return this.f7047a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        return this.f7047a.i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        return this.f7047a.j(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return this.f7047a.k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f7047a.l();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7047a);
        sb.append('?');
        return sb.toString();
    }
}
