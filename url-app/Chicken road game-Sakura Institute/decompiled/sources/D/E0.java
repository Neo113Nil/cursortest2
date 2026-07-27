package D;

import a.AbstractC0345a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;

/* loaded from: classes.dex */
public final class E0 implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O.a f1226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1227c;

    public E0(Function0 function0, O.a aVar, boolean z4) {
        this.f1225a = function0;
        this.f1226b = aVar;
        this.f1227c = z4;
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        Object obj;
        AbstractC0954O abstractC0954O;
        AbstractC0954O abstractC0954O2;
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        E0 e02 = this;
        float floatValue = ((Number) e02.f1225a.invoke()).floatValue();
        long b4 = M0.a.b(j4, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i2);
            if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E), "icon")) {
                AbstractC0954O a4 = interfaceC0944E.a(b4);
                float f4 = 2;
                int l4 = interfaceC0947H.l(H0.f1310d * f4) + a4.f9005d;
                int a5 = O2.c.a(l4 * floatValue);
                int l5 = interfaceC0947H.l(H0.f1311e * f4) + a4.f9006e;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list.get(i4);
                    int i5 = size2;
                    if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E2), "indicatorRipple")) {
                        float f5 = floatValue;
                        if (!(l4 >= 0 && l5 >= 0)) {
                            AbstractC0345a.I("width(" + l4 + ") and height(" + l5 + ") must be >= 0");
                            throw null;
                        }
                        float f6 = f4;
                        AbstractC0954O a6 = interfaceC0944E2.a(u3.d.t(l4, l4, l5, l5));
                        int size3 = list.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size3) {
                                obj = null;
                                break;
                            }
                            Object obj2 = list.get(i6);
                            int i7 = size3;
                            obj = obj2;
                            if (Intrinsics.a(androidx.compose.ui.layout.a.a((InterfaceC0944E) obj2), "indicator")) {
                                break;
                            }
                            i6++;
                            size3 = i7;
                        }
                        InterfaceC0944E interfaceC0944E3 = (InterfaceC0944E) obj;
                        if (interfaceC0944E3 == null) {
                            abstractC0954O = null;
                        } else {
                            if (a5 < 0 || l5 < 0) {
                                AbstractC0345a.I("width(" + a5 + ") and height(" + l5 + ") must be >= 0");
                                throw null;
                            }
                            abstractC0954O = interfaceC0944E3.a(u3.d.t(a5, a5, l5, l5));
                        }
                        O.a aVar = e02.f1226b;
                        if (aVar != null) {
                            int size4 = list.size();
                            for (int i8 = 0; i8 < size4; i8++) {
                                InterfaceC0944E interfaceC0944E4 = (InterfaceC0944E) list.get(i8);
                                if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E4), "label")) {
                                    abstractC0954O2 = interfaceC0944E4.a(b4);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        abstractC0954O2 = null;
                        if (aVar == null) {
                            int i9 = M0.a.i(j4);
                            int r2 = u3.d.r(j4, interfaceC0947H.l(H0.f1307a));
                            t5 = interfaceC0947H.t(i9, r2, C1412P.c(), new F0(abstractC0954O, a4, (i9 - a4.f9005d) / 2, (r2 - a4.f9006e) / 2, a6, (i9 - a6.f9005d) / 2, (r2 - a6.f9006e) / 2, i9, r2));
                            return t5;
                        }
                        Intrinsics.c(abstractC0954O2);
                        float f7 = a4.f9006e;
                        float f8 = H0.f1311e;
                        float L3 = interfaceC0947H.L(f8) + f7;
                        float f9 = H0.f1309c;
                        float L4 = interfaceC0947H.L(f9) + L3 + abstractC0954O2.f9006e;
                        float a7 = kotlin.ranges.b.a((M0.a.j(j4) - L4) / f6, interfaceC0947H.L(f8));
                        float f10 = (a7 * f6) + L4;
                        boolean z4 = e02.f1227c;
                        float f11 = (1 - f5) * ((z4 ? a7 : (f10 - a4.f9006e) / f6) - a7);
                        float L5 = interfaceC0947H.L(f9) + interfaceC0947H.L(f8) + a4.f9006e + a7;
                        int i10 = M0.a.i(j4);
                        t4 = interfaceC0947H.t(i10, O2.c.a(f10), C1412P.c(), new G0(abstractC0954O, z4, f5, abstractC0954O2, (i10 - abstractC0954O2.f9005d) / 2, L5, f11, a4, (i10 - a4.f9005d) / 2, a7, a6, (i10 - a6.f9005d) / 2, a7 - interfaceC0947H.L(f8), i10, interfaceC0947H));
                        return t4;
                    }
                    i4++;
                    e02 = this;
                    size2 = i5;
                    floatValue = floatValue;
                    f4 = f4;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i2++;
            e02 = this;
            floatValue = floatValue;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
