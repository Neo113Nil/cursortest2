package l;

import m.AbstractC0620e;
import m.InterfaceC0640z;
import m.W;
import m.t0;
import m.u0;
import m.v0;
import m.z0;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0574B {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f6428a;

    /* renamed from: b, reason: collision with root package name */
    public static final W f6429b;

    /* renamed from: c, reason: collision with root package name */
    public static final W f6430c;

    /* renamed from: d, reason: collision with root package name */
    public static final W f6431d;

    static {
        q qVar = q.f6523h;
        q qVar2 = q.f6524i;
        u0 u0Var = v0.f6899a;
        f6428a = new u0(qVar, qVar2);
        f6429b = AbstractC0620e.i(400.0f, null, 5);
        Object obj = z0.f6914a;
        f6430c = AbstractC0620e.i(400.0f, new O0.h(l0.c.c(1, 1)), 1);
        f6431d = AbstractC0620e.i(400.0f, new O0.j(O2.d.d(1, 1)), 1);
    }

    public static G a(t0 t0Var, int i3) {
        InterfaceC0640z interfaceC0640z = t0Var;
        if ((i3 & 1) != 0) {
            interfaceC0640z = AbstractC0620e.i(400.0f, null, 5);
        }
        return new G(new P(new I(0.0f, interfaceC0640z), null, null, false, null, 62));
    }

    public static H b(t0 t0Var, int i3) {
        InterfaceC0640z interfaceC0640z = t0Var;
        if ((i3 & 1) != 0) {
            interfaceC0640z = AbstractC0620e.i(400.0f, null, 5);
        }
        return new H(new P(new I(0.0f, interfaceC0640z), null, null, false, null, 62));
    }
}
