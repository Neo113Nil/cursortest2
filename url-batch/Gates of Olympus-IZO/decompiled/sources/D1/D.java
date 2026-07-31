package D1;

import I.C0125v0;
import a.AbstractC0157a;
import android.content.Context;
import e1.C0351N;
import e1.C0355d;
import f2.InterfaceC0390e;
import g1.C0399f;
import h1.C0430a;
import h1.C0431b;
import java.util.List;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import k2.n0;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0390e[] f526a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0431b f527b;

    static {
        Z1.n nVar = new Z1.n(Z1.a.f3459d, D.class, "tenonStore", "getTenonStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        Z1.u.f3481a.getClass();
        f526a = new InterfaceC0390e[]{nVar};
        C0430a c0430a = C0430a.f5050e;
        r2.e eVar = k2.E.f5312a;
        r2.d dVar = r2.d.f7321f;
        n0 b2 = AbstractC0552y.b();
        dVar.getClass();
        f527b = new C0431b(c0430a, AbstractC0552y.a(I2.l.M(dVar, b2)));
    }

    public static final A2.g a(Context context) {
        A2.g gVar;
        C0431b c0431b = f527b;
        InterfaceC0390e interfaceC0390e = f526a[0];
        c0431b.getClass();
        Z1.i.f(interfaceC0390e, "property");
        A2.g gVar2 = c0431b.f5054d;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (c0431b.f5053c) {
            try {
                if (c0431b.f5054d == null) {
                    Context applicationContext = context.getApplicationContext();
                    Y1.c cVar = c0431b.f5051a;
                    Z1.i.e(applicationContext, "applicationContext");
                    List list = (List) cVar.j(applicationContext);
                    InterfaceC0550w interfaceC0550w = c0431b.f5052b;
                    C0125v0 c0125v0 = new C0125v0(applicationContext, 3, c0431b);
                    Z1.i.f(list, "migrations");
                    C0351N c0351n = new C0351N(new C0399f(N2.m.f2947a, new A2.l(20, c0125v0)), AbstractC0157a.M(new C0355d(list, null)), new F0.a(22), interfaceC0550w);
                    c0431b.f5054d = new A2.g(24, new A2.g(24, c0351n));
                }
                gVar = c0431b.f5054d;
                Z1.i.c(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
