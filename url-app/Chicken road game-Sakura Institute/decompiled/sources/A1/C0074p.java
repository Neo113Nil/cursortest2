package A1;

import A.AbstractC0017m;
import D.N1;
import G.C0216p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.C1042u;
import z1.AbstractC1365I;
import z1.C1361E;

/* renamed from: A1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f644e;

    public /* synthetic */ C0074p(int i2, ArrayList arrayList) {
        this.f643d = i2;
        this.f644e = arrayList;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f643d) {
            case 0:
                C1042u PaperCard = (C1042u) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard, "$this$PaperCard");
                if ((intValue & 17) == 16 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b("Village records held", null, AbstractC1365I.f11807h, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 130970);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(S.l.f3977a, 4));
                    ArrayList arrayList = this.f644e;
                    if (arrayList.isEmpty()) {
                        c0216p.S(-813918920);
                        N1.b("No village records under this name.", null, AbstractC1365I.f11806g, 0L, new F0.i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131050);
                        c0216p.q(false);
                    } else {
                        boolean z4 = false;
                        C0216p c0216p2 = c0216p;
                        c0216p2.S(-813769903);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1361E c1361e = (C1361E) it.next();
                            String str = c1361e.f11787b;
                            StringBuilder sb = new StringBuilder("• ");
                            sb.append(str);
                            sb.append(": ");
                            sb.append(c1361e.f11790e);
                            sb.append(" (");
                            C0216p c0216p3 = c0216p2;
                            N1.b(AbstractC0017m.n(sb, c1361e.f11791f, ")"), null, AbstractC1365I.f11814o, u3.l.k0(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 3072, 0, 131058);
                            c0216p2 = c0216p3;
                            z4 = false;
                        }
                        c0216p2.q(z4);
                    }
                }
                break;
            default:
                r.c item = (r.c) obj;
                C0216p c0216p4 = (C0216p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue2 & 17) == 16 && c0216p4.z()) {
                    c0216p4.N();
                } else {
                    AbstractC0864b.f(null, 0L, O.f.b(-1294935192, new C0074p(0, this.f644e), c0216p4), c0216p4, 384, 3);
                }
                break;
        }
        return Unit.f7487a;
    }
}
