package L1;

import B.Y;
import B.f0;
import android.content.Context;
import e2.InterfaceC0424c;
import h1.C0486d;
import h1.M;
import h2.AbstractC0508a;
import java.util.List;
import k1.C0565a;
import k1.C0566b;
import l2.InterfaceC0604e;
import q2.AbstractC0837y;
import q2.E;
import q2.InterfaceC0835w;
import q2.n0;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0604e[] f3349a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0566b f3350b;

    static {
        f2.o oVar = new f2.o(B.class, "salonStore", "getSalonStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        f2.v.f5833a.getClass();
        f3349a = new InterfaceC0604e[]{oVar};
        C0565a c0565a = C0565a.f6413e;
        x2.e eVar = E.f7851a;
        x2.d dVar = x2.d.f10346f;
        n0 b3 = AbstractC0837y.b();
        dVar.getClass();
        f3350b = new C0566b(c0565a, AbstractC0837y.a(AbstractC0508a.L(dVar, b3)));
    }

    public static final Y a(Context context) {
        Y y3;
        C0566b c0566b = f3350b;
        InterfaceC0604e interfaceC0604e = f3349a[0];
        c0566b.getClass();
        f2.j.f(interfaceC0604e, "property");
        Y y4 = c0566b.f6417d;
        if (y4 != null) {
            return y4;
        }
        synchronized (c0566b.f6416c) {
            try {
                if (c0566b.f6417d == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC0424c interfaceC0424c = c0566b.f6414a;
                    f2.j.e(applicationContext, "applicationContext");
                    List list = (List) interfaceC0424c.n(applicationContext);
                    InterfaceC0835w interfaceC0835w = c0566b.f6415b;
                    f0 f0Var = new f0(applicationContext, 4, c0566b);
                    f2.j.f(list, "migrations");
                    c0566b.f6417d = new Y(new Y(new M(new j1.f(T2.m.f4427a, new A.h(20, f0Var)), O2.l.l0(new C0486d(list, null)), new A1.i(24, false), interfaceC0835w)));
                }
                y3 = c0566b.f6417d;
                f2.j.c(y3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return y3;
    }
}
