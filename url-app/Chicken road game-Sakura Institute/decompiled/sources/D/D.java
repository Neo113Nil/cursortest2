package D;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1403G;
import z2.C1412P;

/* loaded from: classes.dex */
public final class D implements InterfaceC0945F {

    /* renamed from: b, reason: collision with root package name */
    public static final D f1212b = new D(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1213a;

    public /* synthetic */ D(int i2) {
        this.f1213a = i2;
    }

    public static final void b(ArrayList arrayList, M2.C c4, InterfaceC0947H interfaceC0947H, ArrayList arrayList2, ArrayList arrayList3, M2.C c5, ArrayList arrayList4, M2.C c6, M2.C c7) {
        float f4 = AbstractC0150m.f1891d;
        if (!arrayList.isEmpty()) {
            c4.f3578d = interfaceC0947H.l(f4) + c4.f3578d;
        }
        arrayList.add(0, C1403G.H(arrayList2));
        arrayList3.add(Integer.valueOf(c5.f3578d));
        arrayList4.add(Integer.valueOf(c4.f3578d));
        c4.f3578d += c5.f3578d;
        c6.f3578d = Math.max(c6.f3578d, c7.f3578d);
        arrayList2.clear();
        c7.f3578d = 0;
        c5.f3578d = 0;
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        Object obj;
        Object obj2;
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        AbstractC0954O abstractC0954O;
        int i2;
        M2.C c4;
        M2.C c5;
        ArrayList arrayList;
        M2.C c6;
        M2.C c7;
        int i4;
        ArrayList arrayList2;
        long j5 = j4;
        int i5 = 0;
        switch (this.f1213a) {
            case 0:
                int size = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        obj = list.get(i6);
                        if (!Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj), "leadingIcon")) {
                            i6++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC0944E interfaceC0944E = (InterfaceC0944E) obj;
                AbstractC0954O a4 = interfaceC0944E != null ? interfaceC0944E.a(M0.a.b(j4, 0, 0, 0, 0, 10)) : null;
                int f4 = E.v.f(a4);
                int e4 = E.v.e(a4);
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        obj2 = list.get(i7);
                        if (!Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj2), "trailingIcon")) {
                            i7++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) obj2;
                AbstractC0954O a5 = interfaceC0944E2 != null ? interfaceC0944E2.a(M0.a.b(j4, 0, 0, 0, 0, 10)) : null;
                int f5 = E.v.f(a5);
                int e5 = E.v.e(a5);
                int size3 = list.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    InterfaceC0944E interfaceC0944E3 = (InterfaceC0944E) list.get(i8);
                    if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E3), "label")) {
                        AbstractC0954O a6 = interfaceC0944E3.a(u3.d.R(j4, -(f4 + f5), 0, 2));
                        int i9 = a6.f9005d + f4 + f5;
                        int max = Math.max(e4, Math.max(a6.f9006e, e5));
                        t4 = interfaceC0947H.t(i9, max, C1412P.c(), new C(a4, e4, max, a6, f4, a5, e5));
                        return t4;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                M2.C c8 = new M2.C();
                M2.C c9 = new M2.C();
                ArrayList arrayList6 = new ArrayList();
                M2.C c10 = new M2.C();
                M2.C c11 = new M2.C();
                int size4 = list.size();
                while (i5 < size4) {
                    AbstractC0954O a7 = ((InterfaceC0944E) list.get(i5)).a(j5);
                    boolean isEmpty = arrayList6.isEmpty();
                    float f6 = AbstractC0150m.f1890c;
                    if (isEmpty) {
                        abstractC0954O = a7;
                        i2 = size4;
                        c4 = c11;
                        c5 = c10;
                        arrayList = arrayList6;
                        c6 = c9;
                        c7 = c8;
                        i4 = i5;
                        arrayList2 = arrayList5;
                    } else {
                        i2 = size4;
                        if (interfaceC0947H.l(f6) + c10.f3578d + a7.f9005d <= M0.a.i(j4)) {
                            c4 = c11;
                            arrayList = arrayList6;
                            c6 = c9;
                            c7 = c8;
                            i4 = i5;
                            arrayList2 = arrayList5;
                            abstractC0954O = a7;
                            c5 = c10;
                        } else {
                            float f7 = AbstractC0150m.f1888a;
                            abstractC0954O = a7;
                            c4 = c11;
                            c5 = c10;
                            arrayList = arrayList6;
                            c6 = c9;
                            c7 = c8;
                            i4 = i5;
                            arrayList2 = arrayList5;
                            b(arrayList3, c9, interfaceC0947H, arrayList6, arrayList4, c4, arrayList5, c7, c5);
                        }
                    }
                    M2.C c12 = c5;
                    if (!arrayList.isEmpty()) {
                        c12.f3578d = interfaceC0947H.l(f6) + c12.f3578d;
                    }
                    ArrayList arrayList7 = arrayList;
                    arrayList7.add(abstractC0954O);
                    c12.f3578d += abstractC0954O.f9005d;
                    c4.f3578d = Math.max(c4.f3578d, abstractC0954O.f9006e);
                    i5 = i4 + 1;
                    arrayList6 = arrayList7;
                    c10 = c12;
                    c11 = c4;
                    size4 = i2;
                    c9 = c6;
                    c8 = c7;
                    arrayList5 = arrayList2;
                    j5 = j4;
                }
                M2.C c13 = c11;
                M2.C c14 = c9;
                M2.C c15 = c8;
                ArrayList arrayList8 = arrayList5;
                M2.C c16 = c10;
                ArrayList arrayList9 = arrayList6;
                if (!arrayList9.isEmpty()) {
                    float f8 = AbstractC0150m.f1888a;
                    b(arrayList3, c14, interfaceC0947H, arrayList9, arrayList4, c13, arrayList8, c15, c16);
                }
                int max2 = Math.max(c15.f3578d, M0.a.k(j4));
                int max3 = Math.max(c14.f3578d, M0.a.j(j4));
                float f9 = AbstractC0150m.f1888a;
                t5 = interfaceC0947H.t(max2, max3, C1412P.c(), new C0129f(arrayList3, interfaceC0947H, max2, arrayList8));
                return t5;
        }
    }
}
