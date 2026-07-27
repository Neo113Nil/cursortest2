package p0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import n.AbstractC0864b;

/* renamed from: p0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979o implements InterfaceC0947H, InterfaceC0977m {

    /* renamed from: d, reason: collision with root package name */
    public final M0.k f9053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0977m f9054e;

    public C0979o(InterfaceC0977m interfaceC0977m, M0.k kVar) {
        this.f9053d = kVar;
        this.f9054e = interfaceC0977m;
    }

    @Override // p0.InterfaceC0977m
    public final boolean A() {
        return this.f9054e.A();
    }

    @Override // M0.b
    public final long E(long j4) {
        return this.f9054e.E(j4);
    }

    @Override // M0.b
    public final long I(float f4) {
        return this.f9054e.I(f4);
    }

    @Override // M0.b
    public final long J(long j4) {
        return this.f9054e.J(j4);
    }

    @Override // M0.b
    public final float L(float f4) {
        return this.f9054e.L(f4);
    }

    @Override // M0.b
    public final float M(long j4) {
        return this.f9054e.M(j4);
    }

    @Override // M0.b
    public final long a0(float f4) {
        return this.f9054e.a0(f4);
    }

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G b0(int i2, int i4, Map map, Function1 function1) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new C0978n(map, i2, i4);
        }
        AbstractC0864b.D("Size(" + i2 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // M0.b
    public final float e() {
        return this.f9054e.e();
    }

    @Override // p0.InterfaceC0977m
    public final M0.k getLayoutDirection() {
        return this.f9053d;
    }

    @Override // M0.b
    public final int h0(long j4) {
        return this.f9054e.h0(j4);
    }

    @Override // M0.b
    public final float i0(int i2) {
        return this.f9054e.i0(i2);
    }

    @Override // M0.b
    public final float j0(long j4) {
        return this.f9054e.j0(j4);
    }

    @Override // M0.b
    public final float k0(float f4) {
        return this.f9054e.k0(f4);
    }

    @Override // M0.b
    public final int l(float f4) {
        return this.f9054e.l(f4);
    }

    @Override // M0.b
    public final float q() {
        return this.f9054e.q();
    }
}
