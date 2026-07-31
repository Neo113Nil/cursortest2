package F;

import e2.InterfaceC0422a;
import h2.AbstractC0508a;
import java.util.List;
import java.util.NoSuchElementException;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class L0 implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f1220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q.a f1221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1222c;

    public L0(InterfaceC0422a interfaceC0422a, Q.a aVar, boolean z3) {
        this.f1220a = interfaceC0422a;
        this.f1221b = aVar;
        this.f1222c = z3;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        Object obj;
        AbstractC0893O abstractC0893O;
        AbstractC0893O abstractC0893O2;
        L0 l02 = this;
        float floatValue = ((Number) l02.f1220a.b()).floatValue();
        long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i3);
            if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F), "icon")) {
                AbstractC0893O b3 = interfaceC0884F.b(a3);
                float f3 = 2;
                int l3 = interfaceC0887I.l(O0.f1306d * f3) + b3.f8126d;
                int Q3 = AbstractC0508a.Q(l3 * floatValue);
                int l4 = interfaceC0887I.l(O0.f1307e * f3) + b3.f8127e;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list.get(i4);
                    int i5 = size2;
                    if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F2), "indicatorRipple")) {
                        float f4 = floatValue;
                        if (!(l3 >= 0 && l4 >= 0)) {
                            AbstractC0508a.X("width(" + l3 + ") and height(" + l4 + ") must be >= 0");
                            throw null;
                        }
                        float f5 = f3;
                        AbstractC0893O b4 = interfaceC0884F2.b(O2.d.H(l3, l3, l4, l4));
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
                            if (f2.j.a(androidx.compose.ui.layout.a.a((InterfaceC0884F) obj2), "indicator")) {
                                break;
                            }
                            i6++;
                            size3 = i7;
                        }
                        InterfaceC0884F interfaceC0884F3 = (InterfaceC0884F) obj;
                        if (interfaceC0884F3 == null) {
                            abstractC0893O = null;
                        } else {
                            if (Q3 < 0 || l4 < 0) {
                                AbstractC0508a.X("width(" + Q3 + ") and height(" + l4 + ") must be >= 0");
                                throw null;
                            }
                            abstractC0893O = interfaceC0884F3.b(O2.d.H(Q3, Q3, l4, l4));
                        }
                        Q.a aVar = l02.f1221b;
                        if (aVar != null) {
                            int size4 = list.size();
                            for (int i8 = 0; i8 < size4; i8++) {
                                InterfaceC0884F interfaceC0884F4 = (InterfaceC0884F) list.get(i8);
                                if (f2.j.a(androidx.compose.ui.layout.a.a(interfaceC0884F4), "label")) {
                                    abstractC0893O2 = interfaceC0884F4.b(a3);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        abstractC0893O2 = null;
                        S1.v vVar = S1.v.f4321d;
                        if (aVar == null) {
                            int h3 = O0.a.h(j3);
                            int C = O2.d.C(j3, interfaceC0887I.l(O0.f1303a));
                            return interfaceC0887I.i0(h3, C, vVar, new M0(abstractC0893O, b3, (h3 - b3.f8126d) / 2, (C - b3.f8127e) / 2, b4, (h3 - b4.f8126d) / 2, (C - b4.f8127e) / 2, h3, C));
                        }
                        f2.j.c(abstractC0893O2);
                        float f6 = b3.f8127e;
                        float f7 = O0.f1307e;
                        float J3 = interfaceC0887I.J(f7) + f6;
                        float f8 = O0.f1305c;
                        float J4 = interfaceC0887I.J(f8) + J3 + abstractC0893O2.f8127e;
                        float u3 = O2.d.u((O0.a.i(j3) - J4) / f5, interfaceC0887I.J(f7));
                        float f9 = (u3 * f5) + J4;
                        boolean z3 = l02.f1222c;
                        float f10 = (1 - f4) * ((z3 ? u3 : (f9 - b3.f8127e) / f5) - u3);
                        float J5 = interfaceC0887I.J(f8) + interfaceC0887I.J(f7) + b3.f8127e + u3;
                        int h4 = O0.a.h(j3);
                        return interfaceC0887I.i0(h4, AbstractC0508a.Q(f9), vVar, new N0(abstractC0893O, z3, f4, abstractC0893O2, (h4 - abstractC0893O2.f8126d) / 2, J5, f10, b3, (h4 - b3.f8126d) / 2, u3, b4, (h4 - b4.f8126d) / 2, u3 - interfaceC0887I.J(f7), h4, interfaceC0887I));
                    }
                    i4++;
                    l02 = this;
                    size2 = i5;
                    floatValue = floatValue;
                    f3 = f3;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i3++;
            l02 = this;
            floatValue = floatValue;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
