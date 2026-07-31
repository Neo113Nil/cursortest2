package m;

import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0125v0;
import I.InterfaceC0088c0;
import I.X0;
import java.util.LinkedHashMap;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0598h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0590b0 f5749a = AbstractC0595e.h(0.0f, null, 7);

    static {
        LinkedHashMap linkedHashMap = D0.f5567a;
        I2.d.h(0.5f, 0.5f);
        I2.l.f(0.5f, 0.5f);
    }

    public static final X0 a(Object obj, y0 y0Var, InterfaceC0602l interfaceC0602l, Float f3, String str, Y1.c cVar, C0113p c0113p, int i3, int i4) {
        InterfaceC0602l interfaceC0602l2 = interfaceC0602l;
        Object obj2 = C0105l.f2272a;
        Float f4 = (i4 & 8) != 0 ? null : f3;
        Object G3 = c0113p.G();
        if (G3 == obj2) {
            G3 = C0089d.J(null, I.X.f2228i);
            c0113p.a0(G3);
        }
        InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G3;
        Object G4 = c0113p.G();
        if (G4 == obj2) {
            G4 = new C0593d(obj, y0Var, f4);
            c0113p.a0(G4);
        }
        C0593d c0593d = (C0593d) G4;
        InterfaceC0088c0 M3 = C0089d.M(cVar, c0113p);
        if (f4 != null && (interfaceC0602l2 instanceof C0590b0)) {
            C0590b0 c0590b0 = (C0590b0) interfaceC0602l2;
            if (!Z1.i.a(c0590b0.f5697c, f4)) {
                interfaceC0602l2 = new C0590b0(c0590b0.f5695a, c0590b0.f5696b, f4);
            }
        }
        InterfaceC0088c0 M4 = C0089d.M(interfaceC0602l2, c0113p);
        Object G5 = c0113p.G();
        if (G5 == obj2) {
            G5 = m2.l.a(-1, 6, null);
            c0113p.a0(G5);
        }
        m2.i iVar = (m2.i) G5;
        boolean h3 = c0113p.h(iVar) | ((((i3 & 14) ^ 6) > 4 && c0113p.h(obj)) || (i3 & 6) == 4);
        Object G6 = c0113p.G();
        if (h3 || G6 == obj2) {
            G6 = new C0125v0(iVar, 4, obj);
            c0113p.a0(G6);
        }
        C0089d.g((Y1.a) G6, c0113p);
        boolean h4 = c0113p.h(iVar) | c0113p.h(c0593d) | c0113p.f(M4) | c0113p.f(M3);
        Object G7 = c0113p.G();
        if (h4 || G7 == obj2) {
            G7 = new C0597g(iVar, c0593d, M4, M3, null);
            c0113p.a0(G7);
        }
        C0089d.e(c0113p, (Y1.e) G7, iVar);
        X0 x02 = (X0) interfaceC0088c0.getValue();
        return x02 == null ? c0593d.f5704c : x02;
    }
}
