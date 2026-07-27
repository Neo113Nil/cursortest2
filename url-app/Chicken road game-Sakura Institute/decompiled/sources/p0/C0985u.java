package p0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z2.C1405I;

/* renamed from: p0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985u implements InterfaceC0964Z, InterfaceC0947H {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0987w f9063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0941B f9064e;

    public C0985u(C0941B c0941b) {
        this.f9064e = c0941b;
        this.f9063d = c0941b.f8985n;
    }

    @Override // p0.InterfaceC0977m
    public final boolean A() {
        return this.f9063d.A();
    }

    @Override // M0.b
    public final long E(long j4) {
        return this.f9063d.E(j4);
    }

    @Override // M0.b
    public final long I(float f4) {
        return this.f9063d.I(f4);
    }

    @Override // M0.b
    public final long J(long j4) {
        return this.f9063d.J(j4);
    }

    @Override // M0.b
    public final float L(float f4) {
        return this.f9063d.e() * f4;
    }

    @Override // M0.b
    public final float M(long j4) {
        return this.f9063d.M(j4);
    }

    @Override // M0.b
    public final long a0(float f4) {
        return this.f9063d.a0(f4);
    }

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G b0(int i2, int i4, Map map, Function1 function1) {
        return this.f9063d.b0(i2, i4, map, function1);
    }

    @Override // M0.b
    public final float e() {
        return this.f9063d.f9072e;
    }

    @Override // p0.InterfaceC0977m
    public final M0.k getLayoutDirection() {
        return this.f9063d.f9071d;
    }

    @Override // M0.b
    public final int h0(long j4) {
        return this.f9063d.h0(j4);
    }

    @Override // M0.b
    public final float i0(int i2) {
        return this.f9063d.i0(i2);
    }

    @Override // M0.b
    public final float j0(long j4) {
        return this.f9063d.j0(j4);
    }

    @Override // M0.b
    public final float k0(float f4) {
        return f4 / this.f9063d.e();
    }

    @Override // M0.b
    public final int l(float f4) {
        return this.f9063d.l(f4);
    }

    @Override // M0.b
    public final float q() {
        return this.f9063d.f9073i;
    }

    @Override // p0.InterfaceC0947H
    public final InterfaceC0946G t(int i2, int i4, Map map, Function1 function1) {
        return this.f9063d.b0(i2, i4, map, function1);
    }

    @Override // p0.InterfaceC0964Z
    public final List v(Object obj, Function2 function2) {
        C0941B c0941b = this.f9064e;
        r0.E e4 = (r0.E) c0941b.f8984m.get(obj);
        List m4 = e4 != null ? e4.m() : null;
        if (m4 != null) {
            return m4;
        }
        I.d dVar = c0941b.f8990s;
        int i2 = dVar.f3332i;
        int i4 = c0941b.f8982k;
        if (i2 < i4) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i2 == i4) {
            dVar.b(obj);
        } else {
            Object[] objArr = dVar.f3330d;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
        }
        c0941b.f8982k++;
        HashMap hashMap = c0941b.f8987p;
        if (!hashMap.containsKey(obj)) {
            c0941b.f8989r.put(obj, c0941b.g(obj, function2));
            r0.E e5 = c0941b.f8978d;
            if (e5.f9584C.f9676c == 3) {
                e5.Q(true);
            } else {
                r0.E.R(e5, true, 6);
            }
        }
        r0.E e6 = (r0.E) hashMap.get(obj);
        if (e6 == null) {
            return C1405I.f11931d;
        }
        List r02 = e6.f9584C.f9691r.r0();
        I.a aVar = (I.a) r02;
        int i5 = aVar.f3324d.f3332i;
        for (int i6 = 0; i6 < i5; i6++) {
            ((r0.K) aVar.get(i6)).f9658L.f9675b = true;
        }
        return r02;
    }
}
