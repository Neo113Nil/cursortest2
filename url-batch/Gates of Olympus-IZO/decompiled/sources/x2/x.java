package x2;

import e2.AbstractC0381e;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import w2.C;
import w2.a0;

/* loaded from: classes.dex */
public final class x implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final x f8765b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final String f8766c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f8767a;

    public x() {
        a0 a0Var = a0.f8646a;
        n nVar = n.f8756a;
        a0 a0Var2 = a0.f8646a;
        n nVar2 = n.f8756a;
        this.f8767a = new C(a0.f8647b, n.f8757b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        this.f8767a.getClass();
        return String.valueOf(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f8767a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        return this.f8767a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f8766c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f8767a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        this.f8767a.g(i3);
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f8767a.h(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        this.f8767a.getClass();
        return u2.h.f8552d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        this.f8767a.j(i3);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        this.f8767a.getClass();
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        this.f8767a.getClass();
        return 2;
    }
}
