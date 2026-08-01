package a2;

import c2.w1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends n0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f76e;

    public /* synthetic */ d0(int i3, Object obj) {
        this.f75d = i3;
        this.f76e = obj;
    }

    @Override // a2.n0
    public float b(k kVar) {
        float intBitsToFloat;
        int p4;
        switch (this.f75d) {
            case 0:
                Function2 function2 = kVar.f113a;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                c2.o0 o0Var = (c2.o0) this.f76e;
                if (o0Var.f1635x) {
                    return Float.NaN;
                }
                c2.o0 o0Var2 = o0Var;
                while (true) {
                    w1 w1Var = o0Var2.f1637z;
                    if (!Float.isNaN((w1Var == null || (p4 = kotlin.collections.w.p((k[]) w1Var.f1695b, kVar)) < 0) ? Float.NaN : ((float[]) w1Var.f1696c)[p4])) {
                        o0Var2.c0(o0Var.k0(), kVar);
                        n i02 = o0Var2.i0();
                        n i03 = o0Var.i0();
                        switch (kVar.f114b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (i03.O(i02, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (i02.J() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (i03.O(i02, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (i02.J() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    c2.o0 m02 = o0Var2.m0();
                    if (m02 == null) {
                        o0Var2.c0(o0Var.k0(), kVar);
                        return Float.NaN;
                    }
                    o0Var2 = m02;
                }
                break;
            default:
                return super.b(kVar);
        }
    }

    @Override // a2.n0
    public final x2.l c() {
        switch (this.f75d) {
            case 0:
                return ((c2.o0) this.f76e).getLayoutDirection();
            default:
                return ((d2.v) this.f76e).getLayoutDirection();
        }
    }

    @Override // x2.c
    public final float d() {
        switch (this.f75d) {
            case 0:
                return ((c2.o0) this.f76e).d();
            default:
                return ((d2.v) this.f76e).getDensity().d();
        }
    }

    @Override // a2.n0
    public final int e() {
        switch (this.f75d) {
            case 0:
                return ((c2.o0) this.f76e).X();
            default:
                return ((d2.v) this.f76e).getRoot().T.f1606p.f131d;
        }
    }

    @Override // x2.c
    public final float g() {
        switch (this.f75d) {
            case 0:
                return ((c2.o0) this.f76e).g();
            default:
                return ((d2.v) this.f76e).getDensity().g();
        }
    }
}
