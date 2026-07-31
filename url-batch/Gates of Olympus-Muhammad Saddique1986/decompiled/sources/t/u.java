package t;

import e2.InterfaceC0424c;
import java.util.HashMap;
import java.util.Map;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0902Y;
import s.C0939h;

/* loaded from: classes.dex */
public final class u implements InterfaceC0887I {

    /* renamed from: d, reason: collision with root package name */
    public final r f8511d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0902Y f8512e;

    /* renamed from: f, reason: collision with root package name */
    public final C0939h f8513f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f8514g = new HashMap();

    public u(r rVar, InterfaceC0902Y interfaceC0902Y) {
        this.f8511d = rVar;
        this.f8512e = interfaceC0902Y;
        this.f8513f = (C0939h) rVar.f8503b.b();
    }

    @Override // r0.InterfaceC0916m
    public final boolean D() {
        return this.f8512e.D();
    }

    @Override // O0.b
    public final long E(long j3) {
        return this.f8512e.E(j3);
    }

    @Override // O0.b
    public final long G(float f3) {
        return this.f8512e.G(f3);
    }

    @Override // O0.b
    public final long H(long j3) {
        return this.f8512e.H(j3);
    }

    @Override // O0.b
    public final float J(float f3) {
        return this.f8512e.J(f3);
    }

    @Override // O0.b
    public final float K(long j3) {
        return this.f8512e.K(j3);
    }

    @Override // O0.b
    public final long T(float f3) {
        return this.f8512e.T(f3);
    }

    @Override // O0.b
    public final float Y(int i3) {
        return this.f8512e.Y(i3);
    }

    @Override // O0.b
    public final float a() {
        return this.f8512e.a();
    }

    @Override // O0.b
    public final float b0(long j3) {
        return this.f8512e.b0(j3);
    }

    @Override // O0.b
    public final float d0(float f3) {
        return this.f8512e.d0(f3);
    }

    @Override // r0.InterfaceC0916m
    public final O0.k getLayoutDirection() {
        return this.f8512e.getLayoutDirection();
    }

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H i0(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        return this.f8512e.i0(i3, i4, map, interfaceC0424c);
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f8512e.l(f3);
    }

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H q(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        return this.f8512e.q(i3, i4, map, interfaceC0424c);
    }

    @Override // O0.b
    public final float r() {
        return this.f8512e.r();
    }
}
