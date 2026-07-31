package G4;

import D4.i;
import D4.j;
import D4.m;
import D4.n;
import D4.o;
import D4.p;
import D4.r;
import D4.s;
import F4.k;
import a4.C0228a;
import d4.C0323e;
import d4.InterfaceC0326h;
import java.io.UncheckedIOException;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements o, p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f838a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f839b = new a();

    @Override // D4.o
    public void a(n nVar, Object obj, Object obj2, i iVar) {
        nVar.a(L4.c.f1456a, (k) iVar.c(k.class));
        nVar.m(L4.c.f1457b, (List) obj2, f839b, iVar);
        nVar.y(L4.c.f1458c, ((O4.a) obj).f1780c, iVar);
    }

    @Override // D4.p
    public void b(n nVar, Object obj, i iVar) {
        int a7;
        int size;
        S4.a aVar = (S4.a) obj;
        D4.b bVar = L4.a.f1442a;
        long g7 = aVar.g();
        if (g7 != 0) {
            nVar.N(bVar, g7);
        }
        D4.b bVar2 = L4.a.f1443b;
        long j4 = aVar.j();
        if (j4 != 0) {
            nVar.N(bVar2, j4);
        }
        D4.b bVar3 = L4.a.f1444c;
        D4.a d7 = b.d(aVar.e());
        if (d7.f508a != 0) {
            nVar.L(bVar3, d7);
        }
        nVar.y(L4.a.f1445d, aVar.f(), iVar);
        if (aVar.h() != null) {
            nVar.d(L4.a.f1446e, aVar.h(), iVar);
        }
        if (aVar instanceof T4.a) {
            F4.i.e(nVar, L4.a.f1447f, F4.i.c(aVar), iVar);
            a7 = aVar.a();
            size = F4.i.c(aVar).size();
        } else {
            D4.b bVar4 = L4.a.f1447f;
            V3.c attributes = aVar.getAttributes();
            F4.a aVar2 = F4.a.f745e;
            nVar.T(bVar4);
            if (!attributes.isEmpty()) {
                m mVar = (m) iVar.d(n.f556f, new C4.d(5));
                mVar.f552a = bVar4;
                mVar.f553b = nVar;
                mVar.f554c = aVar2;
                mVar.f555d = iVar;
                try {
                    attributes.forEach(mVar);
                } catch (UncheckedIOException e4) {
                    throw e4.getCause();
                }
            }
            nVar.J();
            a7 = aVar.a();
            size = aVar.getAttributes().size();
        }
        int i7 = a7 - size;
        D4.b bVar5 = L4.a.f1448g;
        if (i7 != 0) {
            nVar.Z(bVar5, i7);
        }
        InterfaceC0326h d8 = aVar.d();
        D4.b bVar6 = L4.a.f1449h;
        C0228a c0228a = (C0228a) d8;
        byte b7 = ((C0323e) c0228a.f3131c).f3955b;
        if (b7 != 0) {
            nVar.M(bVar6, b7);
        }
        String str = c0228a.f3130b;
        String str2 = c0228a.f3129a;
        if (!str2.equals("00000000000000000000000000000000")) {
            nVar.Y(L4.a.f1450i, str2, iVar);
        }
        if (!str.equals("0000000000000000")) {
            nVar.R(L4.a.f1451j, str, iVar);
        }
        nVar.y(L4.a.f1452k, aVar.b(), iVar);
    }

    @Override // D4.p
    public int c(Object obj, i iVar) {
        int i7;
        int i8;
        int i9;
        int b7;
        int i10;
        int b8;
        S4.a aVar = (S4.a) obj;
        int c7 = j.c(L4.a.f1443b, aVar.j()) + j.c(L4.a.f1442a, aVar.g());
        D4.b bVar = L4.a.f1444c;
        int i11 = b.d(aVar.e()).f508a;
        int i12 = 0;
        if (i11 == 0) {
            i8 = 0;
        } else {
            int i13 = bVar.f512c;
            if (i11 >= 0) {
                i7 = D4.d.b(i11);
            } else {
                int i14 = D4.d.f518e;
                i7 = 10;
            }
            i8 = i13 + i7;
        }
        int d7 = s.d(L4.a.f1445d, aVar.f(), iVar) + i8 + c7;
        if (aVar.h() != null) {
            d7 += s.a(L4.a.f1446e, aVar.h(), iVar);
        }
        if (aVar instanceof T4.a) {
            int f7 = F4.i.f(L4.a.f1447f, F4.i.c(aVar), iVar) + d7;
            int a7 = aVar.a() - F4.i.c(aVar).size();
            D4.b bVar2 = L4.a.f1448g;
            if (a7 == 0) {
                b8 = 0;
            } else {
                b8 = D4.d.b(a7) + bVar2.f512c;
            }
            i10 = b8 + f7;
        } else {
            D4.b bVar3 = L4.a.f1447f;
            V3.c attributes = aVar.getAttributes();
            F4.a aVar2 = F4.a.f745e;
            if (attributes.isEmpty()) {
                i9 = 0;
            } else {
                r rVar = (r) iVar.d(s.f566b, new C4.d(7));
                rVar.f561a = 0;
                rVar.f562b = bVar3.f512c;
                rVar.f563c = aVar2;
                rVar.f564d = iVar;
                attributes.forEach(rVar);
                i9 = rVar.f561a;
            }
            int i15 = d7 + i9;
            int a8 = aVar.a() - aVar.getAttributes().size();
            D4.b bVar4 = L4.a.f1448g;
            if (a8 == 0) {
                b7 = 0;
            } else {
                b7 = D4.d.b(a8) + bVar4.f512c;
            }
            i10 = i15 + b7;
        }
        InterfaceC0326h d8 = aVar.d();
        D4.b bVar5 = L4.a.f1449h;
        C0228a c0228a = (C0228a) d8;
        if (((C0323e) c0228a.f3131c).f3955b != 0) {
            int i16 = bVar5.f512c;
            int i17 = D4.d.f518e;
            i12 = i16 + 4;
        }
        int i18 = i12 + i10;
        String str = c0228a.f3130b;
        if (!c0228a.f3129a.equals("00000000000000000000000000000000")) {
            i18 += L4.a.f1450i.f512c + j.f544a;
        }
        if (!str.equals("0000000000000000")) {
            i18 += L4.a.f1451j.f512c + j.f545b;
        }
        return s.d(L4.a.f1452k, aVar.b(), iVar) + i18;
    }

    @Override // D4.o
    public int d(Object obj, Object obj2, i iVar) {
        O4.a aVar = (O4.a) obj;
        k d7 = k.d(aVar);
        iVar.a(d7);
        return s.d(L4.c.f1458c, aVar.f1780c, iVar) + s.c(L4.c.f1457b, (List) obj2, f839b, iVar) + j.d(L4.c.f1456a, d7);
    }
}
