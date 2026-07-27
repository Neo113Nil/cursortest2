package A1;

import D.N1;
import G.C0216p;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q.AbstractC1024c;
import q.C1042u;
import z1.AbstractC1365I;
import z1.C1374S;
import z2.C1403G;

/* renamed from: A1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076q implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f650e;

    public /* synthetic */ C0076q(int i2, List list) {
        this.f649d = i2;
        this.f650e = list;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f649d) {
            case 0:
                C1042u PaperCard = (C1042u) obj;
                C0216p c0216p = (C0216p) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(PaperCard, "$this$PaperCard");
                if ((intValue & 17) == 16 && c0216p.z()) {
                    c0216p.N();
                } else {
                    N1.b("Recent training", null, AbstractC1365I.f11807h, 0L, null, F0.k.f2617l, F0.r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 130970);
                    AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(S.l.f3977a, 4));
                    List list = this.f650e;
                    if (list.isEmpty()) {
                        c0216p.S(-813264696);
                        N1.b("No linked sessions.", null, AbstractC1365I.f11806g, 0L, new F0.i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131050);
                        c0216p.q(false);
                    } else {
                        boolean z4 = false;
                        C0216p c0216p2 = c0216p;
                        c0216p2.S(-813125320);
                        for (C1374S c1374s : C1403G.E(list, 6)) {
                            String str = c1374s.f11845c + " · %.1f km · %d:%02d";
                            Double valueOf = Double.valueOf(c1374s.f11846d);
                            int i2 = c1374s.f11847e;
                            String format = String.format(str, Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 3));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            C0216p c0216p3 = c0216p2;
                            N1.b(format, null, AbstractC1365I.f11814o, u3.l.k0(13), null, null, F0.r.f2626d, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p3, 3072, 0, 130994);
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
                    AbstractC0864b.f(null, 0L, O.f.b(-849397881, new C0076q(0, this.f650e), c0216p4), c0216p4, 384, 3);
                }
                break;
        }
        return Unit.f7487a;
    }
}
