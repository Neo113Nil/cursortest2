package D2;

import C2.C;
import C2.a0;
import a.AbstractC0235a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class x implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final x f905b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final String f906c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f907a;

    public x() {
        a0 a0Var = a0.f733a;
        n nVar = n.f896a;
        a0 a0Var2 = a0.f733a;
        n nVar2 = n.f896a;
        this.f907a = new C(a0.f734b, n.f897b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        this.f907a.getClass();
        return String.valueOf(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f907a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        return this.f907a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f906c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f907a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        this.f907a.g(i3);
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f907a.h(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        this.f907a.getClass();
        return A2.k.f259e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        this.f907a.j(i3);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        this.f907a.getClass();
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        this.f907a.getClass();
        return 2;
    }
}
