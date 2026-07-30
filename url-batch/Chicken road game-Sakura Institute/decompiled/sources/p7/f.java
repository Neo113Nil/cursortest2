package p7;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7218b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7219c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o7.b f7220a;

    public f() {
        m mVar = m.f7230a;
        m mVar2 = m.f7230a;
        m7.f fVar = m.f7231b;
        r6.k.f(fVar, "elementDesc");
        this.f7220a = new o7.b(fVar);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        return this.f7220a.a(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return f7219c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final a8.m c() {
        this.f7220a.getClass();
        return m7.h.f6464h;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        this.f7220a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        this.f7220a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f7220a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f7220a.getClass();
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        this.f7220a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        this.f7220a.i(i7);
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f7220a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        this.f7220a.k(i7);
        return false;
    }
}
