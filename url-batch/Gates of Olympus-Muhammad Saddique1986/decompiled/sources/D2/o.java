package D2;

import a.AbstractC0235a;
import e2.InterfaceC0422a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class o implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final R1.n f898a;

    public o(InterfaceC0422a interfaceC0422a) {
        this.f898a = R1.a.d(interfaceC0422a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return e().a(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        return e().c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return e().d();
    }

    public final SerialDescriptor e() {
        return (SerialDescriptor) this.f898a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        return e().g(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return e().h(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return e().i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return e().j(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return e().l();
    }
}
