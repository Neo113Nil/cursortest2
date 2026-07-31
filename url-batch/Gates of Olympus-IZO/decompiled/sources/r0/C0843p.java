package r0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843p implements Q, C {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f7157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f7158e;

    public C0843p(w wVar) {
        this.f7158e = wVar;
        this.f7157d = wVar.f7185k;
    }

    @Override // r0.C
    public final boolean B() {
        return this.f7157d.B();
    }

    @Override // M0.b
    public final long C(long j3) {
        return this.f7157d.C(j3);
    }

    @Override // M0.b
    public final long D(float f3) {
        return this.f7157d.D(f3);
    }

    @Override // M0.b
    public final float F(float f3) {
        return this.f7157d.a() * f3;
    }

    @Override // M0.b
    public final float G(long j3) {
        return this.f7157d.G(j3);
    }

    @Override // r0.C
    public final B I(int i3, int i4, Map map, Y1.c cVar) {
        return this.f7157d.I(i3, i4, map, cVar);
    }

    @Override // M0.b
    public final long R(float f3) {
        return this.f7157d.R(f3);
    }

    @Override // r0.Q
    public final List X(Object obj, Y1.e eVar) {
        w wVar = this.f7158e;
        t0.D d3 = (t0.D) wVar.f7184j.get(obj);
        List W2 = d3 != null ? d3.f7736y.f7813r.W() : null;
        if (W2 != null) {
            return W2;
        }
        K.d dVar = wVar.p;
        int i3 = dVar.f2642f;
        int i4 = wVar.f7182h;
        if (i3 < i4) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i3 == i4) {
            dVar.b(obj);
        } else {
            Object[] objArr = dVar.f2640d;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
        }
        wVar.f7182h++;
        HashMap hashMap = wVar.f7187m;
        if (!hashMap.containsKey(obj)) {
            wVar.f7189o.put(obj, wVar.g(obj, eVar));
            t0.D d4 = wVar.f7178d;
            if (d4.f7736y.f7799c == 3) {
                d4.O(true);
            } else {
                t0.D.P(d4, true, 6);
            }
        }
        t0.D d5 = (t0.D) hashMap.get(obj);
        if (d5 == null) {
            return M1.u.f2803d;
        }
        List W3 = d5.f7736y.f7813r.W();
        K.a aVar = (K.a) W3;
        int i5 = aVar.f2634d.f2642f;
        for (int i6 = 0; i6 < i5; i6++) {
            ((t0.J) aVar.get(i6)).f7777I.f7798b = true;
        }
        return W3;
    }

    @Override // r0.C
    public final B Y(int i3, int i4, Map map, Y1.c cVar) {
        return this.f7157d.I(i3, i4, map, cVar);
    }

    @Override // M0.b
    public final float Z(int i3) {
        return this.f7157d.Z(i3);
    }

    @Override // M0.b
    public final float a() {
        return this.f7157d.f7166e;
    }

    @Override // M0.b
    public final float a0(long j3) {
        return this.f7157d.a0(j3);
    }

    @Override // M0.b
    public final float c0(float f3) {
        return f3 / this.f7157d.a();
    }

    @Override // r0.C
    public final M0.j getLayoutDirection() {
        return this.f7157d.f7165d;
    }

    @Override // M0.b
    public final int k(float f3) {
        return this.f7157d.k(f3);
    }

    @Override // M0.b
    public final float p() {
        return this.f7157d.f7167f;
    }
}
