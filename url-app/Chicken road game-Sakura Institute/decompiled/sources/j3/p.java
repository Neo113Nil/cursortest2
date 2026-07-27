package j3;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1405I;

/* loaded from: classes.dex */
public final class p implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1335j f7217a;

    public p(Function0 function0) {
        this.f7217a = C1336k.a(function0);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        return e().a(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return e().c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return e().d();
    }

    public final SerialDescriptor e() {
        return (SerialDescriptor) this.f7217a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i2) {
        return e().g(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        return e().h(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        return e().i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        return e().j(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return e().l();
    }
}
