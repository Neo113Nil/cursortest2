package H1;

import G1.h;
import G1.i;
import R1.y;
import S1.n;
import h1.C0485c;
import h1.C0503v;
import h1.N;
import h1.P;
import h1.X;
import h1.Z;
import java.util.ArrayList;
import java.util.List;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class b implements InterfaceC1054g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f2617e;

    public /* synthetic */ b(InterfaceC1054g interfaceC1054g, int i3) {
        this.f2616d = i3;
        this.f2617e = interfaceC1054g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    @Override // t2.InterfaceC1054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, V1.d dVar) {
        a aVar;
        int i3;
        d dVar2;
        int i4;
        f fVar;
        int i5;
        C0503v c0503v;
        int i6;
        switch (this.f2616d) {
            case 0:
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i7 = aVar.f2614h;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        aVar.f2614h = i7 - Integer.MIN_VALUE;
                        Object obj2 = aVar.f2613g;
                        W1.a aVar2 = W1.a.f4608d;
                        i3 = aVar.f2614h;
                        int i8 = 1;
                        if (i3 != 0) {
                            R1.a.e(obj2);
                            List<i> list = (List) obj;
                            ArrayList arrayList = new ArrayList(n.E0(list, 10));
                            for (i iVar : list) {
                                arrayList.add(new J1.b(new J1.a(iVar.f2102a, iVar.f2103b, iVar.f2104c, iVar.f2105d, iVar.f2106e), iVar.f2107f, iVar.f2108g));
                                i8 = 1;
                            }
                            aVar.f2614h = i8;
                            if (this.f2617e.e(arrayList, aVar) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj2);
                        }
                        return y.f4171a;
                    }
                }
                aVar = new a(this, dVar);
                Object obj22 = aVar.f2613g;
                W1.a aVar22 = W1.a.f4608d;
                i3 = aVar.f2614h;
                int i82 = 1;
                if (i3 != 0) {
                }
                return y.f4171a;
            case 1:
                if (dVar instanceof d) {
                    dVar2 = (d) dVar;
                    int i9 = dVar2.f2621h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        dVar2.f2621h = i9 - Integer.MIN_VALUE;
                        Object obj3 = dVar2.f2620g;
                        W1.a aVar3 = W1.a.f4608d;
                        i4 = dVar2.f2621h;
                        if (i4 != 0) {
                            R1.a.e(obj3);
                            List<h> list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(n.E0(list2, 10));
                            for (h hVar : list2) {
                                arrayList2.add(new J1.a(hVar.f2097a, hVar.f2098b, hVar.f2099c, hVar.f2100d, hVar.f2101e));
                            }
                            dVar2.f2621h = 1;
                            if (this.f2617e.e(arrayList2, dVar2) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj3);
                        }
                        return y.f4171a;
                    }
                }
                dVar2 = new d(this, dVar);
                Object obj32 = dVar2.f2620g;
                W1.a aVar32 = W1.a.f4608d;
                i4 = dVar2.f2621h;
                if (i4 != 0) {
                }
                return y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (dVar instanceof f) {
                    fVar = (f) dVar;
                    int i10 = fVar.f2628h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        fVar.f2628h = i10 - Integer.MIN_VALUE;
                        Object obj4 = fVar.f2627g;
                        W1.a aVar4 = W1.a.f4608d;
                        i5 = fVar.f2628h;
                        int i11 = 1;
                        if (i5 != 0) {
                            R1.a.e(obj4);
                            List<G1.n> list3 = (List) obj;
                            ArrayList arrayList3 = new ArrayList(n.E0(list3, 10));
                            for (G1.n nVar : list3) {
                                arrayList3.add(new J1.d(nVar.f2119a, nVar.f2120b, nVar.f2121c, nVar.f2122d, nVar.f2123e, nVar.f2124f, nVar.f2125g));
                                i11 = 1;
                            }
                            fVar.f2628h = i11;
                            if (this.f2617e.e(arrayList3, fVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj4);
                        }
                        return y.f4171a;
                    }
                }
                fVar = new f(this, dVar);
                Object obj42 = fVar.f2627g;
                W1.a aVar42 = W1.a.f4608d;
                i5 = fVar.f2628h;
                int i112 = 1;
                if (i5 != 0) {
                }
                return y.f4171a;
            default:
                if (dVar instanceof C0503v) {
                    c0503v = (C0503v) dVar;
                    int i12 = c0503v.f6199h;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c0503v.f6199h = i12 - Integer.MIN_VALUE;
                        Object obj5 = c0503v.f6198g;
                        W1.a aVar5 = W1.a.f4608d;
                        i6 = c0503v.f6199h;
                        if (i6 != 0) {
                            R1.a.e(obj5);
                            X x3 = (X) obj;
                            if (x3 instanceof P) {
                                throw ((P) x3).f6108b;
                            }
                            if (!(x3 instanceof C0485c)) {
                                if (x3 instanceof N ? true : x3 instanceof Z) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new C1.c();
                            }
                            Object obj6 = ((C0485c) x3).f6137b;
                            c0503v.f6199h = 1;
                            if (this.f2617e.e(obj6, c0503v) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            R1.a.e(obj5);
                        }
                        return y.f4171a;
                    }
                }
                c0503v = new C0503v(this, dVar);
                Object obj52 = c0503v.f6198g;
                W1.a aVar52 = W1.a.f4608d;
                i6 = c0503v.f6199h;
                if (i6 != 0) {
                }
                return y.f4171a;
        }
    }
}
