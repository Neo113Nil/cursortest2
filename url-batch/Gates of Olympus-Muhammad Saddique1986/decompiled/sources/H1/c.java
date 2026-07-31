package H1;

import e2.InterfaceC0426e;
import f2.j;
import k1.i;
import t2.C1048a;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;
import u2.y;

/* loaded from: classes.dex */
public final class c implements InterfaceC1053f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2618d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2619e;

    public /* synthetic */ c(c cVar, int i3) {
        this.f2618d = i3;
        this.f2619e = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Type inference failed for: r7v16, types: [X1.i, e2.e] */
    @Override // t2.InterfaceC1053f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        C1048a c1048a;
        int i3;
        Throwable th;
        y yVar;
        switch (this.f2618d) {
            case 0:
                Object d3 = ((c) this.f2619e).d(new b(interfaceC1054g, 0), dVar);
                return d3 == W1.a.f4608d ? d3 : R1.y.f4171a;
            case 1:
                Object d4 = ((c) this.f2619e).d(new b(interfaceC1054g, 1), dVar);
                return d4 == W1.a.f4608d ? d4 : R1.y.f4171a;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                Object d5 = ((c) this.f2619e).d(new b(interfaceC1054g, 2), dVar);
                return d5 == W1.a.f4608d ? d5 : R1.y.f4171a;
            default:
                if (dVar instanceof C1048a) {
                    c1048a = (C1048a) dVar;
                    int i4 = c1048a.f9010j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c1048a.f9010j = i4 - Integer.MIN_VALUE;
                        Object obj = c1048a.f9008h;
                        W1.a aVar = W1.a.f4608d;
                        i3 = c1048a.f9010j;
                        R1.y yVar2 = R1.y.f4171a;
                        if (i3 != 0) {
                            R1.a.e(obj);
                            V1.i iVar = c1048a.f4642e;
                            j.c(iVar);
                            y yVar3 = new y(interfaceC1054g, iVar);
                            try {
                                c1048a.f9007g = yVar3;
                                c1048a.f9010j = 1;
                                Object h3 = ((X1.i) this.f2619e).h(yVar3, c1048a);
                                if (h3 != aVar) {
                                    h3 = yVar2;
                                }
                                if (h3 == aVar) {
                                    return aVar;
                                }
                                yVar = yVar3;
                            } catch (Throwable th2) {
                                th = th2;
                                yVar = yVar3;
                                yVar.r();
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yVar = c1048a.f9007g;
                            try {
                                R1.a.e(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                yVar.r();
                                throw th;
                            }
                        }
                        yVar.r();
                        return yVar2;
                    }
                }
                c1048a = new C1048a(this, dVar);
                Object obj2 = c1048a.f9008h;
                W1.a aVar2 = W1.a.f4608d;
                i3 = c1048a.f9010j;
                R1.y yVar22 = R1.y.f4171a;
                if (i3 != 0) {
                }
                yVar.r();
                return yVar22;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(InterfaceC0426e interfaceC0426e) {
        this.f2618d = 3;
        this.f2619e = (X1.i) interfaceC0426e;
    }
}
