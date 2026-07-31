package F;

import I.C0166o0;
import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import q.C0808d;
import q.C0809e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t2.C1051d;
import t2.C1052e;
import t2.C1060m;
import t2.InterfaceC1054g;
import u2.AbstractC1151c;
import u2.C1148F;

/* renamed from: F.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090d0 implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1501d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1502e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1503f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1504g;

    /* JADX WARN: Multi-variable type inference failed */
    public C0090d0(f2.q qVar, InterfaceC1054g interfaceC1054g, InterfaceC0426e interfaceC0426e) {
        this.f1501d = 3;
        this.f1502e = qVar;
        this.f1503f = interfaceC1054g;
        this.f1504g = (X1.i) interfaceC0426e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Type inference failed for: r9v28, types: [X1.i, e2.e] */
    @Override // t2.InterfaceC1054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, V1.d dVar) {
        boolean z3;
        C1051d c1051d;
        int i3;
        C1060m c1060m;
        int i4;
        C0090d0 c0090d0;
        switch (this.f1501d) {
            case 0:
                q.i iVar = (q.i) obj;
                boolean z4 = iVar instanceof q.g;
                ArrayList arrayList = (ArrayList) this.f1502e;
                if (z4) {
                    arrayList.add(iVar);
                } else if (iVar instanceof q.h) {
                    arrayList.remove(((q.h) iVar).f7842a);
                } else if (iVar instanceof C0808d) {
                    arrayList.add(iVar);
                } else if (iVar instanceof C0809e) {
                    arrayList.remove(((C0809e) iVar).f7838a);
                } else if (iVar instanceof q.m) {
                    arrayList.add(iVar);
                } else if (iVar instanceof q.n) {
                    arrayList.remove(((q.n) iVar).f7846a);
                } else if (iVar instanceof q.l) {
                    arrayList.remove(((q.l) iVar).f7844a);
                }
                AbstractC0837y.r((InterfaceC0835w) this.f1503f, null, null, new C0088c0((C0100i0) this.f1504g, (q.i) S1.l.R0(arrayList), null), 3);
                return R1.y.f4171a;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    InterfaceC0426e interfaceC0426e = (InterfaceC0426e) ((InterfaceC0142c0) this.f1504g).getValue();
                    m.l0 l0Var = (m.l0) this.f1503f;
                    z3 = ((Boolean) interfaceC0426e.h(l0Var.f6836a.a(), l0Var.f6839d.getValue())).booleanValue();
                } else {
                    z3 = false;
                }
                ((C0166o0) this.f1502e).setValue(Boolean.valueOf(z3));
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof C1051d) {
                    c1051d = (C1051d) dVar;
                    int i5 = c1051d.f9017i;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c1051d.f9017i = i5 - Integer.MIN_VALUE;
                        Object obj2 = c1051d.f9015g;
                        W1.a aVar = W1.a.f4608d;
                        i3 = c1051d.f9017i;
                        R1.y yVar = R1.y.f4171a;
                        if (i3 != 0) {
                            R1.a.e(obj2);
                            ((C1052e) this.f1502e).getClass();
                            f2.u uVar = (f2.u) this.f1503f;
                            Object obj3 = uVar.f5832d;
                            if (obj3 == AbstractC1151c.f9682b || !f2.j.a(obj3, obj)) {
                                uVar.f5832d = obj;
                                c1051d.f9017i = 1;
                                if (((InterfaceC1054g) this.f1504g).e(obj, c1051d) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj2);
                        }
                        return yVar;
                    }
                }
                c1051d = new C1051d(this, dVar);
                Object obj22 = c1051d.f9015g;
                W1.a aVar2 = W1.a.f4608d;
                i3 = c1051d.f9017i;
                R1.y yVar2 = R1.y.f4171a;
                if (i3 != 0) {
                }
                return yVar2;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof C1060m) {
                    c1060m = (C1060m) dVar;
                    int i6 = c1060m.f9045k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c1060m.f9045k = i6 - Integer.MIN_VALUE;
                        Object obj4 = c1060m.f9043i;
                        W1.a aVar3 = W1.a.f4608d;
                        i4 = c1060m.f9045k;
                        R1.y yVar3 = R1.y.f4171a;
                        if (i4 != 0) {
                            R1.a.e(obj4);
                            if (((f2.q) this.f1502e).f5828d) {
                                c1060m.f9045k = 1;
                                if (((InterfaceC1054g) this.f1503f).e(obj, c1060m) == aVar3) {
                                    return aVar3;
                                }
                                return yVar3;
                            }
                            c1060m.f9041g = this;
                            c1060m.f9042h = obj;
                            c1060m.f9045k = 2;
                            obj4 = ((X1.i) this.f1504g).h(obj, c1060m);
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            c0090d0 = this;
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                            return yVar3;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = c1060m.f9042h;
                                c0090d0 = c1060m.f9041g;
                                R1.a.e(obj4);
                                if (!((Boolean) obj4).booleanValue()) {
                                    ((f2.q) c0090d0.f1502e).f5828d = true;
                                    c1060m.f9041g = null;
                                    c1060m.f9042h = null;
                                    c1060m.f9045k = 3;
                                    if (((InterfaceC1054g) c0090d0.f1503f).e(obj, c1060m) == aVar3) {
                                        return aVar3;
                                    }
                                }
                                return yVar3;
                            }
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        R1.a.e(obj4);
                        return yVar3;
                    }
                }
                c1060m = new C1060m(this, dVar);
                Object obj42 = c1060m.f9043i;
                W1.a aVar32 = W1.a.f4608d;
                i4 = c1060m.f9045k;
                R1.y yVar32 = R1.y.f4171a;
                if (i4 != 0) {
                }
            default:
                Object a3 = AbstractC1151c.a((V1.i) this.f1502e, obj, this.f1503f, (C1148F) this.f1504g, dVar);
                return a3 == W1.a.f4608d ? a3 : R1.y.f4171a;
        }
    }

    public /* synthetic */ C0090d0(Object obj, Object obj2, Object obj3, int i3) {
        this.f1501d = i3;
        this.f1502e = obj;
        this.f1503f = obj2;
        this.f1504g = obj3;
    }

    public C0090d0(InterfaceC1054g interfaceC1054g, V1.i iVar) {
        this.f1501d = 4;
        this.f1502e = iVar;
        this.f1503f = v2.a.m(iVar);
        this.f1504g = new C1148F(interfaceC1054g, null);
    }
}
