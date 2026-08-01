package n9;

import b0.t;
import b0.w;
import b0.w0;
import com.appsflyer.R;
import kotlin.Unit;
import n0.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j9.a f7210e;

    public /* synthetic */ e(j9.a aVar, int i3) {
        this.f7209d = i3;
        this.f7210e = aVar;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        float f3;
        float f10;
        float f11;
        i0 i0Var;
        int i3 = this.f7209d;
        t tVar = t.f900b;
        d1.i iVar = d1.i.f3304a;
        float f12 = 0.35f;
        float f13 = 0.142f;
        float f14 = 0.235f;
        j9.a aVar = this.f7210e;
        switch (i3) {
            case 0:
                w wVar = (w) obj;
                i0 i0Var2 = (i0) obj2;
                int intValue = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= i0Var2.f(wVar) ? 4 : 2;
                }
                if (i0Var2.O(intValue & 1, (intValue & 19) != 18)) {
                    float b10 = wVar.b();
                    float a9 = wVar.a();
                    int i10 = aVar.f5114h;
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    int i11 = i10 - 8;
                    int i12 = i10 + 22;
                    if (i11 <= i12) {
                        while (true) {
                            i0Var2.W(-1190542296);
                            if (aVar.j.contains(Integer.valueOf(i11))) {
                                float f15 = ((i11 * 0.142f) + 0.235f + aVar.g) * b10;
                                if (x2.f.a(f15, (-b10) * 0.35f) < 0 || x2.f.a(f15, b10 * 1.35f) > 0) {
                                    i0Var2.p(false);
                                } else {
                                    x.g.b(k7.e.B(R.drawable.stop, i0Var2, 0), b0.i.g(tVar.e(b0.i.c(w0.f(iVar, 0.15f * b10), 1.8f), d1.a.f3282d), f15 - (0.015f * b10), (a9 * 0.55f) - (0.165f * a9)), null, a2.h.f96b, 0.0f, i0Var2, 24632);
                                    i0Var2.p(false);
                                }
                            } else {
                                i0Var2.p(false);
                            }
                            if (i11 != i12) {
                                i11++;
                            }
                        }
                    }
                } else {
                    i0Var2.R();
                }
                break;
            default:
                w wVar2 = (w) obj;
                i0 i0Var3 = (i0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                wVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= i0Var3.f(wVar2) ? 4 : 2;
                }
                if (i0Var3.O(intValue2 & 1, (intValue2 & 19) != 18)) {
                    float b11 = wVar2.b();
                    float a10 = wVar2.a();
                    int i13 = aVar.f5114h;
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    int i14 = i13 - 8;
                    int i15 = i13 + 22;
                    if (i14 <= i15) {
                        while (true) {
                            i0Var3.W(943963392);
                            float f16 = ((i14 * f13) + f14 + aVar.g) * b11;
                            if (x2.f.a(f16, (-b11) * f12) < 0 || x2.f.a(f16, b11 * 1.35f) > 0) {
                                f3 = f12;
                                f10 = f13;
                                f11 = f14;
                                i0Var = i0Var3;
                                i0Var.p(false);
                            } else {
                                float f17 = a10 * 0.55f;
                                f3 = f12;
                                int i16 = aVar.f5114h;
                                f10 = f13;
                                f11 = f14;
                                i0 i0Var4 = i0Var3;
                                x.g.b(k7.e.B((i14 == i16 && aVar.f5112e) ? R.drawable.lul3 : i14 == i16 ? R.drawable.luk2 : R.drawable.luk1, i0Var3, 0), b0.i.g(tVar.e(b0.i.c(w0.f(iVar, 0.12f * b11), 1.35f), d1.a.f3282d), f16, f17), null, a2.h.f96b, 0.0f, i0Var4, 24632);
                                i0Var = i0Var4;
                                i0Var.p(false);
                            }
                            if (i14 != i15) {
                                i14++;
                                i0Var3 = i0Var;
                                f12 = f3;
                                f13 = f10;
                                f14 = f11;
                            }
                        }
                    }
                } else {
                    i0Var3.R();
                }
                break;
        }
        return Unit.f5554a;
    }
}
