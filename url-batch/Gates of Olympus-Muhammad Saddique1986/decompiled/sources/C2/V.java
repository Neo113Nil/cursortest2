package C2;

import a.AbstractC0235a;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class V implements SerialDescriptor, InterfaceC0047j {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f725a;

    /* renamed from: b, reason: collision with root package name */
    public final String f726b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f727c;

    public V(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "original");
        this.f725a = serialDescriptor;
        this.f726b = serialDescriptor.d() + '?';
        this.f727c = M.b(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return this.f725a.a(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.f725a.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        return this.f725a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f726b;
    }

    @Override // C2.InterfaceC0047j
    public final Set e() {
        return this.f727c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return f2.j.a(this.f725a, ((V) obj).f725a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        return this.f725a.g(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f725a.h(i3);
    }

    public final int hashCode() {
        return this.f725a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return this.f725a.i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f725a.j(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return this.f725a.k();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f725a.l();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f725a);
        sb.append('?');
        return sb.toString();
    }
}
