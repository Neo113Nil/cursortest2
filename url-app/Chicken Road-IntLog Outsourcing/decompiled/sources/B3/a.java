package B3;

import A3.j;
import A3.l;
import java.io.UncheckedIOException;
import java.util.List;
import y3.C1567a;
import y3.C1568b;
import y3.C1569c;
import y3.g;
import y3.h;
import y3.m;
import y3.n;
import y3.o;
import y3.q;
import y3.r;

/* loaded from: classes.dex */
public final class a implements n, o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f259a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f260b = new a();

    @Override // y3.o
    public int a(Object obj, g gVar) {
        int i2;
        int i3;
        int i6;
        int b6;
        int i7;
        int b7;
        N3.a aVar = (N3.a) obj;
        int c2 = h.c(G3.a.f1003b, aVar.k()) + h.c(G3.a.f1002a, aVar.h());
        C1568b c1568b = G3.a.f1004c;
        int i8 = b.d(aVar.f()).f12380a;
        int i9 = 0;
        if (i8 == 0) {
            i3 = 0;
        } else {
            int i10 = c1568b.f12384c;
            if (i8 >= 0) {
                i2 = C1569c.b(i8);
            } else {
                int i11 = C1569c.f12386e;
                i2 = 10;
            }
            i3 = i10 + i2;
        }
        int d6 = r.d(G3.a.f1005d, aVar.g(), gVar) + i3 + c2;
        if (aVar.i() != null) {
            d6 += r.a(G3.a.f1006e, aVar.i(), gVar);
        }
        if (aVar instanceof O3.a) {
            int f3 = j.f(G3.a.f1007f, j.c(aVar), gVar) + d6;
            int b8 = aVar.b() - j.c(aVar).size();
            C1568b c1568b2 = G3.a.f1008g;
            if (b8 == 0) {
                b7 = 0;
            } else {
                b7 = C1569c.b(b8) + c1568b2.f12384c;
            }
            i7 = b7 + f3;
        } else {
            C1568b c1568b3 = G3.a.f1007f;
            Q2.c a6 = aVar.a();
            A3.a aVar2 = A3.a.f42e;
            if (a6.isEmpty()) {
                i6 = 0;
            } else {
                q qVar = (q) gVar.d(r.f12432b, new D3.h(11));
                qVar.f12427a = 0;
                qVar.f12428b = c1568b3.f12384c;
                qVar.f12429c = aVar2;
                qVar.f12430d = gVar;
                a6.forEach(qVar);
                i6 = qVar.f12427a;
            }
            int i12 = d6 + i6;
            int b9 = aVar.b() - aVar.a().size();
            C1568b c1568b4 = G3.a.f1008g;
            if (b9 == 0) {
                b6 = 0;
            } else {
                b6 = C1569c.b(b9) + c1568b4.f12384c;
            }
            i7 = i12 + b6;
        }
        Y2.h e3 = aVar.e();
        C1568b c1568b5 = G3.a.f1009h;
        V2.a aVar3 = (V2.a) e3;
        if (aVar3.f3228c.f3692b != 0) {
            int i13 = c1568b5.f12384c;
            int i14 = C1569c.f12386e;
            i9 = i13 + 4;
        }
        int i15 = i9 + i7;
        if (!aVar3.f3226a.equals("00000000000000000000000000000000")) {
            i15 += G3.a.f1010i.f12384c + h.f12409a;
        }
        if (!aVar3.f3227b.equals("0000000000000000")) {
            i15 += G3.a.f1011j.f12384c + h.f12410b;
        }
        return r.d(G3.a.f1012k, aVar.c(), gVar) + i15;
    }

    @Override // y3.n
    public void b(m mVar, Object obj, Object obj2, g gVar) {
        mVar.a(G3.c.f1016a, (l) gVar.c(l.class));
        mVar.p(G3.c.f1017b, (List) obj2, f260b, gVar);
        mVar.A(G3.c.f1018c, ((J3.a) obj).f1354c, gVar);
    }

    @Override // y3.o
    public void c(m mVar, Object obj, g gVar) {
        int b6;
        int size;
        N3.a aVar = (N3.a) obj;
        C1568b c1568b = G3.a.f1002a;
        long h3 = aVar.h();
        if (h3 == 0) {
            mVar.getClass();
        } else {
            mVar.K(c1568b, h3);
        }
        C1568b c1568b2 = G3.a.f1003b;
        long k3 = aVar.k();
        if (k3 != 0) {
            mVar.K(c1568b2, k3);
        }
        C1568b c1568b3 = G3.a.f1004c;
        C1567a d6 = b.d(aVar.f());
        if (d6.f12380a != 0) {
            mVar.I(c1568b3, d6);
        }
        mVar.A(G3.a.f1005d, aVar.g(), gVar);
        if (aVar.i() != null) {
            mVar.b(G3.a.f1006e, aVar.i(), gVar);
        }
        if (aVar instanceof O3.a) {
            j.e(mVar, G3.a.f1007f, j.c(aVar), gVar);
            b6 = aVar.b();
            size = j.c(aVar).size();
        } else {
            C1568b c1568b4 = G3.a.f1007f;
            Q2.c a6 = aVar.a();
            A3.a aVar2 = A3.a.f42e;
            mVar.Q(c1568b4);
            if (!a6.isEmpty()) {
                y3.l lVar = (y3.l) gVar.d(m.f12422a, new D3.h(9));
                lVar.f12418a = c1568b4;
                lVar.f12419b = mVar;
                lVar.f12420c = aVar2;
                lVar.f12421d = gVar;
                try {
                    a6.forEach(lVar);
                } catch (UncheckedIOException e3) {
                    throw e3.getCause();
                }
            }
            mVar.G();
            b6 = aVar.b();
            size = aVar.a().size();
        }
        int i2 = b6 - size;
        C1568b c1568b5 = G3.a.f1008g;
        if (i2 != 0) {
            mVar.W(c1568b5, i2);
        }
        Y2.h e6 = aVar.e();
        C1568b c1568b6 = G3.a.f1009h;
        V2.a aVar3 = (V2.a) e6;
        byte b7 = aVar3.f3228c.f3692b;
        if (b7 != 0) {
            mVar.J(c1568b6, b7);
        }
        String str = aVar3.f3226a;
        if (!str.equals("00000000000000000000000000000000")) {
            mVar.V(G3.a.f1010i, str, gVar);
        }
        String str2 = aVar3.f3227b;
        if (!str2.equals("0000000000000000")) {
            mVar.O(G3.a.f1011j, str2, gVar);
        }
        mVar.A(G3.a.f1012k, aVar.c(), gVar);
    }

    @Override // y3.n
    public int d(Object obj, Object obj2, g gVar) {
        J3.a aVar = (J3.a) obj;
        l d6 = l.d(aVar);
        gVar.a(d6);
        return r.d(G3.c.f1018c, aVar.f1354c, gVar) + r.c(G3.c.f1017b, (List) obj2, f260b, gVar) + h.d(G3.c.f1016a, d6);
    }
}
