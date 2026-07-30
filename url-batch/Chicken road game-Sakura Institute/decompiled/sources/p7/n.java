package p7;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final d6.o f7232a;

    public n(q6.a aVar) {
        this.f7232a = d6.a.d(aVar);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        return g().a(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return g().b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final a8.m c() {
        return g().c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return g().d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        return g().e(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    public final SerialDescriptor g() {
        return (SerialDescriptor) this.f7232a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return g().i(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return g().j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return g().k(i7);
    }
}
