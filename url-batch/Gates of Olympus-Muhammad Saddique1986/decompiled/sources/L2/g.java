package L2;

import C0.q;
import E.F;
import G2.n;
import G2.o;
import G2.u;
import f2.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final K2.g f3412a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3413b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3414c;

    /* renamed from: d, reason: collision with root package name */
    public final F f3415d;

    /* renamed from: e, reason: collision with root package name */
    public final q f3416e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3417f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3418g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3419h;

    /* renamed from: i, reason: collision with root package name */
    public int f3420i;

    public g(K2.g gVar, ArrayList arrayList, int i3, F f3, q qVar, int i4, int i5, int i6) {
        j.f(gVar, "call");
        this.f3412a = gVar;
        this.f3413b = arrayList;
        this.f3414c = i3;
        this.f3415d = f3;
        this.f3416e = qVar;
        this.f3417f = i4;
        this.f3418g = i5;
        this.f3419h = i6;
    }

    public static g a(g gVar, int i3, F f3, q qVar, int i4) {
        if ((i4 & 1) != 0) {
            i3 = gVar.f3414c;
        }
        int i5 = i3;
        if ((i4 & 2) != 0) {
            f3 = gVar.f3415d;
        }
        F f4 = f3;
        if ((i4 & 4) != 0) {
            qVar = gVar.f3416e;
        }
        q qVar2 = qVar;
        int i6 = gVar.f3417f;
        int i7 = gVar.f3418g;
        int i8 = gVar.f3419h;
        gVar.getClass();
        j.f(qVar2, "request");
        return new g(gVar.f3412a, gVar.f3413b, i5, f4, qVar2, i6, i7, i8);
    }

    public final u b(q qVar) {
        j.f(qVar, "request");
        ArrayList arrayList = this.f3413b;
        int size = arrayList.size();
        int i3 = this.f3414c;
        if (i3 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3420i++;
        F f3 = this.f3415d;
        if (f3 != null) {
            if (!((K2.d) f3.f924c).b((n) qVar.f630c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must retain the same host and port").toString());
            }
            if (this.f3420i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i3 + 1;
        g a3 = a(this, i4, null, qVar, 58);
        o oVar = (o) arrayList.get(i3);
        u a4 = oVar.a(a3);
        if (a4 == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (f3 != null && i4 < arrayList.size() && a3.f3420i != 1) {
            throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
        }
        if (a4.f2300j != null) {
            return a4;
        }
        throw new IllegalStateException(("interceptor " + oVar + " returned a response with no body").toString());
    }
}
