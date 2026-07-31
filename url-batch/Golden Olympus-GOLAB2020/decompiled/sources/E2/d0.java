package E2;

import A2.j;
import A2.k;
import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d0 {
    public static final A2.f a(A2.f fVar, F2.b module) {
        A2.f a4;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(fVar.e(), j.a.f97a)) {
            return fVar.isInline() ? a(fVar.i(0), module) : fVar;
        }
        A2.f b4 = A2.b.b(module, fVar);
        return (b4 == null || (a4 = a(b4, module)) == null) ? fVar : a4;
    }

    public static final c0 b(AbstractC0348a abstractC0348a, A2.f desc) {
        Intrinsics.checkNotNullParameter(abstractC0348a, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        A2.j e4 = desc.e();
        if (e4 instanceof A2.d) {
            return c0.POLY_OBJ;
        }
        if (Intrinsics.areEqual(e4, k.b.f100a)) {
            return c0.LIST;
        }
        if (!Intrinsics.areEqual(e4, k.c.f101a)) {
            return c0.OBJ;
        }
        A2.f a4 = a(desc.i(0), abstractC0348a.a());
        A2.j e5 = a4.e();
        if ((e5 instanceof A2.e) || Intrinsics.areEqual(e5, j.b.f98a)) {
            return c0.MAP;
        }
        if (abstractC0348a.d().b()) {
            return c0.LIST;
        }
        throw F.c(a4);
    }
}
