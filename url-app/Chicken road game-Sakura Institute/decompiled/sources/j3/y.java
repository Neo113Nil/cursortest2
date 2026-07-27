package j3;

import M2.I;
import i3.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1405I;

/* loaded from: classes.dex */
public final class y implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final y f7224b = new y();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7225c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i3.C f7226a;

    public y() {
        Intrinsics.checkNotNullParameter(I.f3583a, "<this>");
        a0 a0Var = a0.f7055a;
        o oVar = o.f7215a;
        a0 keySerializer = a0.f7055a;
        o valueSerializer = o.f7215a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        a0 kSerializer = a0.f7055a;
        o vSerializer = o.f7215a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f7226a = new i3.C(a0.f7056b, o.f7216b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        this.f7226a.getClass();
        return String.valueOf(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f7226a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f7226a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return f7225c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        this.f7226a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i2) {
        return this.f7226a.g(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        return this.f7226a.h(i2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        this.f7226a.getClass();
        return g3.i.f6809j;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        this.f7226a.j(i2);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        this.f7226a.getClass();
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        this.f7226a.getClass();
        return 2;
    }
}
