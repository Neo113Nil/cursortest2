package Q1;

import G1.m;
import I.C0174t;
import S1.u;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import s1.C0963a;
import t2.AbstractC1035F;
import t2.C1030A;
import t2.C1038I;
import t2.C1042M;

/* loaded from: classes.dex */
public final class j extends V {

    /* renamed from: b, reason: collision with root package name */
    public final C0174t f3990b;

    /* renamed from: c, reason: collision with root package name */
    public final C1030A f3991c;

    /* renamed from: d, reason: collision with root package name */
    public final C1030A f3992d;

    public j(C0174t c0174t) {
        f2.j.f(c0174t, "container");
        this.f3990b = c0174t;
        H1.c cVar = new H1.c((H1.c) ((m) ((G1.j) ((K1.a) c0174t.f2915f).f3256a.f334d)).observeAll(), 2);
        C0963a j3 = P.j(this);
        C1042M a3 = C1038I.a(5000L, 2);
        u uVar = u.f4320d;
        this.f3991c = AbstractC1035F.m(cVar, j3, a3, uVar);
        this.f3992d = AbstractC1035F.m(new H1.c((H1.c) ((G1.g) ((G1.b) ((K1.b) c0174t.f2911b).f3257a.f334d)).observeAll(), 1), P.j(this), C1038I.a(5000L, 2), uVar);
    }
}
