package r0;

import e2.InterfaceC0424c;
import java.util.Map;
import n.z0;

/* renamed from: r0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918o implements InterfaceC0887I, InterfaceC0916m {

    /* renamed from: d, reason: collision with root package name */
    public final O0.k f8169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0916m f8170e;

    public C0918o(InterfaceC0916m interfaceC0916m, O0.k kVar) {
        this.f8169d = kVar;
        this.f8170e = interfaceC0916m;
    }

    @Override // r0.InterfaceC0916m
    public final boolean D() {
        return this.f8170e.D();
    }

    @Override // O0.b
    public final long E(long j3) {
        return this.f8170e.E(j3);
    }

    @Override // O0.b
    public final long G(float f3) {
        return this.f8170e.G(f3);
    }

    @Override // O0.b
    public final long H(long j3) {
        return this.f8170e.H(j3);
    }

    @Override // O0.b
    public final float J(float f3) {
        return this.f8170e.J(f3);
    }

    @Override // O0.b
    public final float K(long j3) {
        return this.f8170e.K(j3);
    }

    @Override // O0.b
    public final long T(float f3) {
        return this.f8170e.T(f3);
    }

    @Override // O0.b
    public final float Y(int i3) {
        return this.f8170e.Y(i3);
    }

    @Override // O0.b
    public final float a() {
        return this.f8170e.a();
    }

    @Override // O0.b
    public final float b0(long j3) {
        return this.f8170e.b0(j3);
    }

    @Override // O0.b
    public final float d0(float f3) {
        return this.f8170e.d0(f3);
    }

    @Override // r0.InterfaceC0916m
    public final O0.k getLayoutDirection() {
        return this.f8169d;
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f8170e.l(f3);
    }

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H q(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new C0917n(i3, i4, map);
        }
        z0.o("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // O0.b
    public final float r() {
        return this.f8170e.r();
    }
}
