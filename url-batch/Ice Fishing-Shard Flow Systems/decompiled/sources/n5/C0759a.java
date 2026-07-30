package n5;

import C4.f;
import K4.e;
import java.io.UncheckedIOException;
import java.util.List;
import k5.C0601a;
import k5.C0602b;
import k5.C0603c;
import k5.g;
import k5.h;
import k5.l;
import k5.m;
import k5.n;
import k5.p;
import k5.q;
import m5.C0691a;
import m5.i;
import m5.k;
import s5.AbstractC0894a;
import s5.AbstractC0896c;
import v5.C0975a;
import z5.InterfaceC1060a;

/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759a implements m, n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0759a f6986a = new C0759a();

    /* renamed from: b, reason: collision with root package name */
    public static final C0759a f6987b = new C0759a();

    @Override // k5.n
    public int a(Object obj, g gVar) {
        int i2;
        int i5;
        int i7;
        int b7;
        int i8;
        int b8;
        InterfaceC1060a interfaceC1060a = (InterfaceC1060a) obj;
        int c7 = h.c(AbstractC0894a.f7779b, interfaceC1060a.j()) + h.c(AbstractC0894a.f7778a, interfaceC1060a.g());
        C0602b c0602b = AbstractC0894a.f7780c;
        int i9 = C0760b.d(interfaceC1060a.e()).f6054a;
        int i10 = 0;
        if (i9 == 0) {
            i5 = 0;
        } else {
            int i11 = c0602b.f6058c;
            if (i9 >= 0) {
                i2 = C0603c.b(i9);
            } else {
                int i12 = C0603c.f6060e;
                i2 = 10;
            }
            i5 = i11 + i2;
        }
        int d7 = q.d(AbstractC0894a.f7781d, interfaceC1060a.f(), gVar) + i5 + c7;
        if (interfaceC1060a.h() != null) {
            d7 += q.a(AbstractC0894a.f7782e, interfaceC1060a.h(), gVar);
        }
        if (interfaceC1060a instanceof A5.a) {
            int f7 = i.f(AbstractC0894a.f7783f, i.c(interfaceC1060a), gVar) + d7;
            int a7 = interfaceC1060a.a() - i.c(interfaceC1060a).size();
            C0602b c0602b2 = AbstractC0894a.f7784g;
            if (a7 == 0) {
                b8 = 0;
            } else {
                b8 = C0603c.b(a7) + c0602b2.f6058c;
            }
            i8 = b8 + f7;
        } else {
            C0602b c0602b3 = AbstractC0894a.f7783f;
            f attributes = interfaceC1060a.getAttributes();
            C0691a c0691a = C0691a.f6545e;
            if (attributes.isEmpty()) {
                i7 = 0;
            } else {
                p pVar = (p) gVar.d(q.f6104b, new G3.a(9));
                pVar.f6099a = 0;
                pVar.f6100b = c0602b3.f6058c;
                pVar.f6101c = c0691a;
                pVar.f6102d = gVar;
                attributes.forEach(pVar);
                i7 = pVar.f6099a;
            }
            int i13 = d7 + i7;
            int a8 = interfaceC1060a.a() - interfaceC1060a.getAttributes().size();
            C0602b c0602b4 = AbstractC0894a.f7784g;
            if (a8 == 0) {
                b7 = 0;
            } else {
                b7 = C0603c.b(a8) + c0602b4.f6058c;
            }
            i8 = i13 + b7;
        }
        K4.h d8 = interfaceC1060a.d();
        C0602b c0602b5 = AbstractC0894a.f7785h;
        H4.a aVar = (H4.a) d8;
        if (((e) aVar.f982c).f1459b != 0) {
            int i14 = c0602b5.f6058c;
            int i15 = C0603c.f6060e;
            i10 = i14 + 4;
        }
        int i16 = i10 + i8;
        String str = aVar.f981b;
        if (!aVar.f980a.equals("00000000000000000000000000000000")) {
            i16 += AbstractC0894a.f7786i.f6058c + h.f6082a;
        }
        if (!str.equals("0000000000000000")) {
            i16 += AbstractC0894a.j.f6058c + h.f6083b;
        }
        return q.d(AbstractC0894a.f7787k, interfaceC1060a.b(), gVar) + i16;
    }

    @Override // k5.m
    public void b(l lVar, Object obj, Object obj2, g gVar) {
        lVar.a(AbstractC0896c.f7791a, (k) gVar.c(k.class));
        lVar.s(AbstractC0896c.f7792b, (List) obj2, f6987b, gVar);
        lVar.E(AbstractC0896c.f7793c, ((C0975a) obj).f8222c, gVar);
    }

    @Override // k5.n
    public void c(l lVar, Object obj, g gVar) {
        int a7;
        int size;
        InterfaceC1060a interfaceC1060a = (InterfaceC1060a) obj;
        C0602b c0602b = AbstractC0894a.f7778a;
        long g7 = interfaceC1060a.g();
        if (g7 != 0) {
            lVar.N(c0602b, g7);
        }
        C0602b c0602b2 = AbstractC0894a.f7779b;
        long j = interfaceC1060a.j();
        if (j != 0) {
            lVar.N(c0602b2, j);
        }
        C0602b c0602b3 = AbstractC0894a.f7780c;
        C0601a d7 = C0760b.d(interfaceC1060a.e());
        if (d7.f6054a != 0) {
            lVar.L(c0602b3, d7);
        }
        lVar.E(AbstractC0894a.f7781d, interfaceC1060a.f(), gVar);
        if (interfaceC1060a.h() != null) {
            lVar.d(AbstractC0894a.f7782e, interfaceC1060a.h(), gVar);
        }
        if (interfaceC1060a instanceof A5.a) {
            i.e(lVar, AbstractC0894a.f7783f, i.c(interfaceC1060a), gVar);
            a7 = interfaceC1060a.a();
            size = i.c(interfaceC1060a).size();
        } else {
            C0602b c0602b4 = AbstractC0894a.f7783f;
            f attributes = interfaceC1060a.getAttributes();
            C0691a c0691a = C0691a.f6545e;
            lVar.T(c0602b4);
            if (!attributes.isEmpty()) {
                k5.k kVar = (k5.k) gVar.d(l.f6094d, new G3.a(7));
                kVar.f6090a = c0602b4;
                kVar.f6091b = lVar;
                kVar.f6092c = c0691a;
                kVar.f6093d = gVar;
                try {
                    attributes.forEach(kVar);
                } catch (UncheckedIOException e7) {
                    throw e7.getCause();
                }
            }
            lVar.J();
            a7 = interfaceC1060a.a();
            size = interfaceC1060a.getAttributes().size();
        }
        int i2 = a7 - size;
        C0602b c0602b5 = AbstractC0894a.f7784g;
        if (i2 != 0) {
            lVar.Z(c0602b5, i2);
        }
        K4.h d8 = interfaceC1060a.d();
        C0602b c0602b6 = AbstractC0894a.f7785h;
        H4.a aVar = (H4.a) d8;
        byte b7 = ((e) aVar.f982c).f1459b;
        if (b7 != 0) {
            lVar.M(c0602b6, b7);
        }
        String str = aVar.f981b;
        String str2 = aVar.f980a;
        if (!str2.equals("00000000000000000000000000000000")) {
            lVar.Y(AbstractC0894a.f7786i, str2, gVar);
        }
        if (!str.equals("0000000000000000")) {
            lVar.R(AbstractC0894a.j, str, gVar);
        }
        lVar.E(AbstractC0894a.f7787k, interfaceC1060a.b(), gVar);
    }

    @Override // k5.m
    public int d(Object obj, Object obj2, g gVar) {
        C0975a c0975a = (C0975a) obj;
        k d7 = k.d(c0975a);
        gVar.a(d7);
        return q.d(AbstractC0896c.f7793c, c0975a.f8222c, gVar) + q.c(AbstractC0896c.f7792b, (List) obj2, f6987b, gVar) + h.d(AbstractC0896c.f7791a, d7);
    }
}
