package p7;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o7.a1;
import o7.c0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final w f7238b = new w();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7239c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7240a;

    public w() {
        a1 a1Var = a1.f6856a;
        m mVar = m.f7230a;
        a1 a1Var2 = a1.f6856a;
        m mVar2 = m.f7230a;
        this.f7240a = new c0(a1.f6857b, m.f7231b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        return this.f7240a.a(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return f7239c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final a8.m c() {
        this.f7240a.getClass();
        return m7.h.f6465i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        this.f7240a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        this.f7240a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f7240a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f7240a.getClass();
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        this.f7240a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        this.f7240a.i(i7);
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f7240a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        this.f7240a.k(i7);
        return false;
    }
}
