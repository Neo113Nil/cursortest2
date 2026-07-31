package r0;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924u implements InterfaceC0902Y, InterfaceC0887I {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0926w f8179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0881C f8180e;

    public C0924u(C0881C c0881c) {
        this.f8180e = c0881c;
        this.f8179d = c0881c.f8107k;
    }

    @Override // r0.InterfaceC0916m
    public final boolean D() {
        return this.f8179d.D();
    }

    @Override // O0.b
    public final long E(long j3) {
        return this.f8179d.E(j3);
    }

    @Override // O0.b
    public final long G(float f3) {
        return this.f8179d.G(f3);
    }

    @Override // O0.b
    public final long H(long j3) {
        return this.f8179d.H(j3);
    }

    @Override // O0.b
    public final float J(float f3) {
        return this.f8179d.a() * f3;
    }

    @Override // O0.b
    public final float K(long j3) {
        return this.f8179d.K(j3);
    }

    @Override // O0.b
    public final long T(float f3) {
        return this.f8179d.T(f3);
    }

    @Override // O0.b
    public final float Y(int i3) {
        return this.f8179d.Y(i3);
    }

    @Override // O0.b
    public final float a() {
        return this.f8179d.f8188e;
    }

    @Override // O0.b
    public final float b0(long j3) {
        return this.f8179d.b0(j3);
    }

    @Override // O0.b
    public final float d0(float f3) {
        return f3 / this.f8179d.a();
    }

    @Override // r0.InterfaceC0916m
    public final O0.k getLayoutDirection() {
        return this.f8179d.f8187d;
    }

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H i0(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        return this.f8179d.q(i3, i4, map, interfaceC0424c);
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f8179d.l(f3);
    }

    @Override // r0.InterfaceC0902Y
    public final List l0(Object obj, InterfaceC0426e interfaceC0426e) {
        C0881C c0881c = this.f8180e;
        t0.E e3 = (t0.E) c0881c.f8106j.get(obj);
        List m3 = e3 != null ? e3.m() : null;
        if (m3 != null) {
            return m3;
        }
        K.d dVar = c0881c.f8112p;
        int i3 = dVar.f3216f;
        int i4 = c0881c.f8104h;
        if (i3 < i4) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i3 == i4) {
            dVar.b(obj);
        } else {
            Object[] objArr = dVar.f3214d;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
        }
        c0881c.f8104h++;
        HashMap hashMap = c0881c.f8109m;
        if (!hashMap.containsKey(obj)) {
            c0881c.f8111o.put(obj, c0881c.g(obj, interfaceC0426e));
            t0.E e4 = c0881c.f8100d;
            if (e4.f8562z.f8627c == 3) {
                e4.Q(true);
            } else {
                t0.E.R(e4, true, 6);
            }
        }
        t0.E e5 = (t0.E) hashMap.get(obj);
        if (e5 == null) {
            return S1.u.f4320d;
        }
        List n02 = e5.f8562z.f8642r.n0();
        K.a aVar = (K.a) n02;
        int i5 = aVar.f3208d.f3216f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((t0.K) aVar.get(i6)).f8604I.f8626b = true;
        }
        return n02;
    }

    @Override // r0.InterfaceC0887I
    public final InterfaceC0886H q(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c) {
        return this.f8179d.q(i3, i4, map, interfaceC0424c);
    }

    @Override // O0.b
    public final float r() {
        return this.f8179d.f8189f;
    }
}
