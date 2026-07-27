package androidx.compose.foundation;

import S.l;
import S.o;
import Z.D;
import Z.K;
import Z.P;
import kotlin.jvm.functions.Function0;
import m.C0848v;
import m.Q;
import m.W;
import p.C0935k;
import s0.C1157n;
import y0.f;

/* loaded from: classes.dex */
public abstract class a {
    public static o a(o oVar, D d4) {
        return oVar.h(new BackgroundElement(0L, d4, 1.0f, K.f4461a, 1));
    }

    public static final o b(o oVar, long j4, P p4) {
        return oVar.h(new BackgroundElement(j4, null, 1.0f, p4, 2));
    }

    public static final o c(o oVar, C0935k c0935k, Q q2, boolean z4, String str, f fVar, Function0 function0) {
        o b4;
        if (q2 instanceof W) {
            b4 = new ClickableElement(c0935k, (W) q2, z4, str, fVar, function0);
        } else if (q2 == null) {
            b4 = new ClickableElement(c0935k, null, z4, str, fVar, function0);
        } else {
            l lVar = l.f3977a;
            if (c0935k != null) {
                b4 = d.a(lVar, c0935k, q2).h(new ClickableElement(c0935k, null, z4, str, fVar, function0));
            } else {
                b4 = S.a.b(lVar, C1157n.f10272m, new b(q2, z4, str, fVar, function0));
            }
        }
        return oVar.h(b4);
    }

    public static /* synthetic */ o d(o oVar, C0935k c0935k, Q q2, boolean z4, f fVar, Function0 function0, int i2) {
        if ((i2 & 16) != 0) {
            fVar = null;
        }
        return c(oVar, c0935k, q2, z4, null, fVar, function0);
    }

    public static o e(o oVar, boolean z4, String str, Function0 function0, int i2) {
        if ((i2 & 1) != 0) {
            z4 = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return S.a.b(oVar, C1157n.f10272m, new C0848v(z4, str, null, function0));
    }
}
