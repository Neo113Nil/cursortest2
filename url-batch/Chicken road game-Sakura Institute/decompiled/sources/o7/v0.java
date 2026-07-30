package o7;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 implements SerialDescriptor, j {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f6953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6954b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f6955c;

    public v0(SerialDescriptor serialDescriptor) {
        r6.k.f(serialDescriptor, "original");
        this.f6953a = serialDescriptor;
        this.f6954b = serialDescriptor.b() + '?';
        this.f6955c = n0.b(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        return this.f6953a.a(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return this.f6954b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final a8.m c() {
        return this.f6953a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f6953a.d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        return this.f6953a.e(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return r6.k.a(this.f6953a, ((v0) obj).f6953a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return this.f6953a.f();
    }

    @Override // o7.j
    public final Set g() {
        return this.f6955c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f6953a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.f6953a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f6953a.i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f6953a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f6953a.k(i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6953a);
        sb.append('?');
        return sb.toString();
    }
}
