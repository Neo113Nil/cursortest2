package D;

import P0.C0262d;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.AbstractC0967c;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;

/* loaded from: classes.dex */
public final class w1 implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2079c;

    public /* synthetic */ w1(Object obj, int i2, Object obj2) {
        this.f2077a = i2;
        this.f2078b = obj;
        this.f2079c = obj2;
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        AbstractC0954O abstractC0954O;
        AbstractC0954O abstractC0954O2;
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        switch (this.f2077a) {
            case 0:
                if (((O.a) this.f2078b) != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i2);
                        if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E), "text")) {
                            abstractC0954O = interfaceC0944E.a(M0.a.b(j4, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                abstractC0954O = null;
                if (((Function2) this.f2079c) != null) {
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list.get(i4);
                        if (Intrinsics.a(androidx.compose.ui.layout.a.a(interfaceC0944E2), "icon")) {
                            abstractC0954O2 = interfaceC0944E2.a(j4);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                abstractC0954O2 = null;
                int max = Math.max(abstractC0954O != null ? abstractC0954O.f9005d : 0, abstractC0954O2 != null ? abstractC0954O2.f9005d : 0);
                int max2 = Math.max(interfaceC0947H.l((abstractC0954O == null || abstractC0954O2 == null) ? z1.f2126a : z1.f2127b), interfaceC0947H.h0(z1.f2131f) + (abstractC0954O2 != null ? abstractC0954O2.f9006e : 0) + (abstractC0954O != null ? abstractC0954O.f9006e : 0));
                t4 = interfaceC0947H.t(max, max2, C1412P.c(), new v1(abstractC0954O, abstractC0954O2, interfaceC0947H, max, max2, abstractC0954O != null ? Integer.valueOf(abstractC0954O.e0(AbstractC0967c.f9034a)) : null, abstractC0954O != null ? Integer.valueOf(abstractC0954O.e0(AbstractC0967c.f9035b)) : null));
                return t4;
            default:
                ((P0.B) this.f2078b).setParentLayoutDirection((M0.k) this.f2079c);
                t5 = interfaceC0947H.t(0, 0, C1412P.c(), C0262d.f3715j);
                return t5;
        }
    }
}
