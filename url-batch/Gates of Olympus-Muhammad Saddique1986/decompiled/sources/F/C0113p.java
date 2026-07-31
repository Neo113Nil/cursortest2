package F;

import I.C0167p;
import I.C0186z;
import I.InterfaceC0142c0;
import R0.C0215d;
import a.AbstractC0235a;
import e2.InterfaceC0426e;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113p extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f1716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0113p(InterfaceC0142c0 interfaceC0142c0, int i3) {
        super(2);
        this.f1715e = i3;
        this.f1716f = interfaceC0142c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    @Override // e2.InterfaceC0426e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2) {
        float min;
        R1.y yVar = R1.y.f4171a;
        InterfaceC0142c0 interfaceC0142c0 = this.f1716f;
        switch (this.f1715e) {
            case 0:
                O0.i iVar = (O0.i) obj;
                O0.i iVar2 = (O0.i) obj2;
                float f3 = B0.f1118a;
                int i3 = iVar2.f3736a;
                float f4 = 1.0f;
                if (i3 < iVar.f3738c) {
                    int i4 = iVar2.f3738c;
                    if (i4 <= iVar.f3736a) {
                        min = 1.0f;
                    } else if (i4 - i3 != 0) {
                        min = (((Math.min(iVar.f3738c, i4) + Math.max(r7, i3)) / 2) - i3) / (i4 - iVar2.f3736a);
                    }
                    if (iVar2.f3737b < iVar.f3739d) {
                        if (iVar2.f3739d > iVar.f3737b) {
                            if (iVar2.a() != 0) {
                                f4 = (((Math.min(r7, r8) + Math.max(r10, r4)) / 2) - r4) / iVar2.a();
                            }
                        }
                        interfaceC0142c0.setValue(new b0.U(b0.M.i(min, f4)));
                        break;
                    }
                    f4 = 0.0f;
                    interfaceC0142c0.setValue(new b0.U(b0.M.i(min, f4)));
                }
                min = 0.0f;
                if (iVar2.f3737b < iVar.f3739d) {
                }
                f4 = 0.0f;
                interfaceC0142c0.setValue(new b0.U(b0.M.i(min, f4)));
            case 1:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p.x()) {
                    ((InterfaceC0426e) interfaceC0142c0.getValue()).h(c0167p, 0);
                    break;
                } else {
                    c0167p.L();
                    break;
                }
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p2.x()) {
                    AbstractC0235a.h(A0.k.a(U.n.f4488a, C0215d.f4069f), Q.f.b(-533674951, new C0113p(interfaceC0142c0, 1), c0167p2), c0167p2, 48);
                    break;
                } else {
                    c0167p2.L();
                    break;
                }
            default:
                C0167p c0167p3 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0167p3.x()) {
                    C0186z c0186z = R0.n.f4107a;
                    ((InterfaceC0426e) interfaceC0142c0.getValue()).h(c0167p3, 0);
                    break;
                } else {
                    c0167p3.L();
                    break;
                }
                break;
        }
        return yVar;
    }
}
