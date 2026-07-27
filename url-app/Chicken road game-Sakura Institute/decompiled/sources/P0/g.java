package P0;

import A.S;
import java.util.ArrayList;
import java.util.List;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;
import z2.C1441y;

/* loaded from: classes.dex */
public final class g implements InterfaceC0945F {

    /* renamed from: b, reason: collision with root package name */
    public static final g f3726b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f3727c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3728a;

    public /* synthetic */ g(int i2) {
        this.f3728a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        Object obj;
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        InterfaceC0946G t6;
        int i2;
        InterfaceC0946G t7;
        switch (this.f3728a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((InterfaceC0944E) list.get(i4)).a(j4));
                }
                int i5 = 1;
                AbstractC0954O abstractC0954O = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i6 = ((AbstractC0954O) obj).f9005d;
                    int d4 = C1441y.d(arrayList);
                    if (1 <= d4) {
                        int i7 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i7);
                            int i8 = ((AbstractC0954O) obj2).f9005d;
                            if (i6 < i8) {
                                obj = obj2;
                                i6 = i8;
                            }
                            if (i7 != d4) {
                                i7++;
                            }
                        }
                    }
                }
                AbstractC0954O abstractC0954O2 = (AbstractC0954O) obj;
                int k4 = abstractC0954O2 != null ? abstractC0954O2.f9005d : M0.a.k(j4);
                if (!arrayList.isEmpty()) {
                    ?? r2 = arrayList.get(0);
                    int i9 = ((AbstractC0954O) r2).f9006e;
                    int d5 = C1441y.d(arrayList);
                    boolean z4 = r2;
                    if (1 <= d5) {
                        while (true) {
                            Object obj3 = arrayList.get(i5);
                            int i10 = ((AbstractC0954O) obj3).f9006e;
                            r2 = z4;
                            if (i9 < i10) {
                                r2 = obj3;
                                i9 = i10;
                            }
                            if (i5 != d5) {
                                i5++;
                                z4 = r2;
                            }
                        }
                    }
                    abstractC0954O = r2;
                }
                AbstractC0954O abstractC0954O3 = abstractC0954O;
                t4 = interfaceC0947H.t(k4, abstractC0954O3 != null ? abstractC0954O3.f9006e : M0.a.j(j4), C1412P.c(), new S(4, arrayList));
                return t4;
            default:
                int size2 = list.size();
                int i11 = 0;
                if (size2 == 0) {
                    t5 = interfaceC0947H.t(0, 0, C1412P.c(), C0262d.f3717l);
                    return t5;
                }
                if (size2 == 1) {
                    AbstractC0954O a4 = ((InterfaceC0944E) list.get(0)).a(j4);
                    t6 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new n(a4, 0));
                    return t6;
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    arrayList2.add(((InterfaceC0944E) list.get(i12)).a(j4));
                }
                int d6 = C1441y.d(arrayList2);
                if (d6 >= 0) {
                    int i13 = 0;
                    i2 = 0;
                    while (true) {
                        AbstractC0954O abstractC0954O4 = (AbstractC0954O) arrayList2.get(i11);
                        i13 = Math.max(i13, abstractC0954O4.f9005d);
                        i2 = Math.max(i2, abstractC0954O4.f9006e);
                        if (i11 != d6) {
                            i11++;
                        } else {
                            i11 = i13;
                        }
                    }
                } else {
                    i2 = 0;
                }
                t7 = interfaceC0947H.t(i11, i2, C1412P.c(), new S(5, arrayList2));
                return t7;
        }
    }
}
