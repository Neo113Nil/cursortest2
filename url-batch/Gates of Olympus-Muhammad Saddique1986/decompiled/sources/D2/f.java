package D2;

import C2.C0039b;
import a.AbstractC0235a;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class f implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final f f874b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f875c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0039b f876a;

    public f() {
        n nVar = n.f896a;
        n nVar2 = n.f896a;
        A2.h hVar = n.f897b;
        f2.j.f(hVar, "elementDesc");
        this.f876a = new C0039b(hVar);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        this.f876a.getClass();
        return String.valueOf(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f876a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        return this.f876a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f875c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f876a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        this.f876a.g(i3);
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f876a.h(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        this.f876a.getClass();
        return A2.k.f258d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        this.f876a.j(i3);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        this.f876a.getClass();
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        this.f876a.getClass();
        return 1;
    }
}
