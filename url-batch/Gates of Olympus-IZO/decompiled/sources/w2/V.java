package w2;

import e2.AbstractC0381e;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class V implements SerialDescriptor, InterfaceC1031j {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f8638a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8639b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f8640c;

    public V(SerialDescriptor serialDescriptor) {
        Z1.i.f(serialDescriptor, "original");
        this.f8638a = serialDescriptor;
        this.f8639b = serialDescriptor.d() + '?';
        this.f8640c = M.b(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return this.f8638a.a(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.f8638a.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        return this.f8638a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f8639b;
    }

    @Override // w2.InterfaceC1031j
    public final Set e() {
        return this.f8640c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return Z1.i.a(this.f8638a, ((V) obj).f8638a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        return this.f8638a.g(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f8638a.h(i3);
    }

    public final int hashCode() {
        return this.f8638a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        return this.f8638a.i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f8638a.j(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return this.f8638a.k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f8638a.l();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8638a);
        sb.append('?');
        return sb.toString();
    }
}
