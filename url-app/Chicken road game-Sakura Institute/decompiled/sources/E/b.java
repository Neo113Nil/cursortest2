package E;

import kotlin.Unit;
import l.AbstractC0798y;
import l.C0778d;
import l.C0795v;
import l.u0;
import p.C0926b;
import p.C0931g;
import p.C0937m;
import p.InterfaceC0933i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f2174a;

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f2175b;

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f2176c;

    static {
        C0795v c0795v = new C0795v(0.4f, 0.0f, 0.6f, 1.0f);
        f2174a = new u0(120, AbstractC0798y.f7865a, 2);
        f2175b = new u0(150, c0795v, 2);
        f2176c = new u0(120, c0795v, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r10 instanceof p.C0928d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if ((r9 instanceof p.C0928d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0778d c0778d, float f4, InterfaceC0933i interfaceC0933i, InterfaceC0933i interfaceC0933i2, E2.c cVar) {
        u0 u0Var;
        u0 u0Var2 = null;
        if (interfaceC0933i2 != null) {
            boolean z4 = interfaceC0933i2 instanceof C0937m;
            u0Var = f2174a;
            if (!z4) {
                if (!(interfaceC0933i2 instanceof C0926b)) {
                    if (!(interfaceC0933i2 instanceof C0931g)) {
                    }
                }
            }
            u0Var2 = u0Var;
        } else if (interfaceC0933i != null) {
            boolean z5 = interfaceC0933i instanceof C0937m;
            u0Var = f2175b;
            if (!z5 && !(interfaceC0933i instanceof C0926b)) {
                if (interfaceC0933i instanceof C0931g) {
                    u0Var2 = f2176c;
                }
            }
            u0Var2 = u0Var;
        }
        u0 u0Var3 = u0Var2;
        if (u0Var3 != null) {
            Object c4 = C0778d.c(c0778d, new M0.e(f4), u0Var3, null, cVar, 12);
            return c4 == D2.a.f2163d ? c4 : Unit.f7487a;
        }
        Object e4 = c0778d.e(cVar, new M0.e(f4));
        return e4 == D2.a.f2163d ? e4 : Unit.f7487a;
    }
}
