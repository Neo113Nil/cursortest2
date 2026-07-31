package l;

import F.C0047j0;
import I.C0105l;
import I.C0113p;
import I.X0;
import b0.C0288u;
import c0.AbstractC0300c;
import m.AbstractC0595e;
import m.AbstractC0598h;
import m.C0590b0;
import m.InterfaceC0615z;
import m.y0;
import m.z0;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final C0590b0 f5444a = AbstractC0595e.h(0.0f, null, 7);

    public static final X0 a(long j3, InterfaceC0615z interfaceC0615z, String str, C0113p c0113p, int i3, int i4) {
        if ((i4 & 2) != 0) {
            interfaceC0615z = f5444a;
        }
        InterfaceC0615z interfaceC0615z2 = interfaceC0615z;
        if ((i4 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean f3 = c0113p.f(C0288u.f(j3));
        Object G3 = c0113p.G();
        if (f3 || G3 == C0105l.f2272a) {
            AbstractC0300c f4 = C0288u.f(j3);
            v vVar = v.f5505f;
            C0047j0 c0047j0 = new C0047j0(18, f4);
            y0 y0Var = z0.f5885a;
            y0 y0Var2 = new y0(vVar, c0047j0);
            c0113p.a0(y0Var2);
            G3 = y0Var2;
        }
        return AbstractC0598h.a(new C0288u(j3), (y0) G3, interfaceC0615z2, null, str2, null, c0113p, ((i3 << 3) & 896) | ((i3 << 6) & 57344), 8);
    }
}
