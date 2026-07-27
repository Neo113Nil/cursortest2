package s;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0964Z;

/* loaded from: classes.dex */
public final class t implements InterfaceC0947H {

    /* renamed from: d, reason: collision with root package name */
    public final C1113q f9963d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0964Z f9964e;

    /* renamed from: i, reason: collision with root package name */
    public final r.h f9965i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f9966j = new HashMap();

    public t(C1113q c1113q, InterfaceC0964Z interfaceC0964Z) {
        this.f9963d = c1113q;
        this.f9964e = interfaceC0964Z;
        this.f9965i = (r.h) c1113q.f9955b.invoke();
    }

    @Override // p0.InterfaceC0977m
    public final boolean A() {
        return this.f9964e.A();
    }

    @Override // M0.b
    public final long E(long j4) {
        return this.f9964e.E(j4);
    }

    @Override // M0.b
    public final long I(float f4) {
        return this.f9964e.I(f4);
    }

    @Override // M0.b
    public final long J(long j4) {
        return this.f9964e.J(j4);
    }

    @Override // M0.b
    public final float L(float f4) {
        return this.f9964e.L(f4);
    }

    @Override // M0.b
    public final float M(long j4) {
        return this.f9964e.M(j4);
    }

    @Override // M0.b
    public final long a0(float f4) {
        return this.f9964e.a0(f4);
    }

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G b0(int i2, int i4, Map map, Function1 function1) {
        return this.f9964e.b0(i2, i4, map, function1);
    }

    @Override // M0.b
    public final float e() {
        return this.f9964e.e();
    }

    @Override // p0.InterfaceC0977m
    public final M0.k getLayoutDirection() {
        return this.f9964e.getLayoutDirection();
    }

    @Override // M0.b
    public final int h0(long j4) {
        return this.f9964e.h0(j4);
    }

    @Override // M0.b
    public final float i0(int i2) {
        return this.f9964e.i0(i2);
    }

    @Override // M0.b
    public final float j0(long j4) {
        return this.f9964e.j0(j4);
    }

    @Override // M0.b
    public final float k0(float f4) {
        return this.f9964e.k0(f4);
    }

    @Override // M0.b
    public final int l(float f4) {
        return this.f9964e.l(f4);
    }

    @Override // M0.b
    public final float q() {
        return this.f9964e.q();
    }

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G t(int i2, int i4, Map map, Function1 function1) {
        return this.f9964e.t(i2, i4, map, function1);
    }
}
