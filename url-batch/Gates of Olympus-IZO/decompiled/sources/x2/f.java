package x2;

import e2.AbstractC0381e;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import w2.C1023b;

/* loaded from: classes.dex */
public final class f implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final f f8735b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f8736c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1023b f8737a;

    public f() {
        n nVar = n.f8756a;
        n nVar2 = n.f8756a;
        u2.f fVar = n.f8757b;
        Z1.i.f(fVar, "elementDesc");
        this.f8737a = new C1023b(fVar);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        this.f8737a.getClass();
        return String.valueOf(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f8737a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        return this.f8737a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f8736c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f8737a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        this.f8737a.g(i3);
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f8737a.h(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        this.f8737a.getClass();
        return u2.h.f8551c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        this.f8737a.j(i3);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        this.f8737a.getClass();
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        this.f8737a.getClass();
        return 1;
    }
}
