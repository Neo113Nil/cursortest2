package j3;

import i3.C0681b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;

/* loaded from: classes.dex */
public final class f implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7176b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7177c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0681b f7178a;

    public f() {
        o elementSerializer = o.f7215a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        o element = o.f7215a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        g3.f elementDesc = o.f7216b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f7178a = new C0681b(elementDesc);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        this.f7178a.getClass();
        return String.valueOf(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f7178a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f7178a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f7177c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f7178a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i2) {
        return this.f7178a.g(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        return this.f7178a.h(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        this.f7178a.getClass();
        return g3.i.f6808i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        this.f7178a.j(i2);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        this.f7178a.getClass();
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        this.f7178a.getClass();
        return 1;
    }
}
