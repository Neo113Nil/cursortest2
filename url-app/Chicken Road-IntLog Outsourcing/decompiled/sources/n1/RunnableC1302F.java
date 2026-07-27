package n1;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Set;
import m1.InterfaceC1276c;
import o1.AbstractBinderC1363a;
import o1.C1362G;
import o1.InterfaceC1369g;
import p1.AbstractC1380a;

/* renamed from: n1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1302F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11310c;

    public /* synthetic */ RunnableC1302F(Object obj, AbstractC1380a abstractC1380a, int i2) {
        this.f11308a = i2;
        this.f11310c = obj;
        this.f11309b = abstractC1380a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1369g interfaceC1369g;
        Set set;
        InterfaceC1369g interfaceC1369g2 = null;
        switch (this.f11308a) {
            case 0:
                C1303G c1303g = (C1303G) this.f11310c;
                C1300D c1300d = (C1300D) c1303g.f11316f.f11380j.get(c1303g.f11312b);
                if (c1300d == null) {
                    return;
                }
                l1.b bVar = (l1.b) this.f11309b;
                if (!bVar.b()) {
                    c1300d.l(bVar, null);
                    return;
                }
                c1303g.f11315e = true;
                InterfaceC1276c interfaceC1276c = c1303g.f11311a;
                if (interfaceC1276c.n()) {
                    if (!c1303g.f11315e || (interfaceC1369g = c1303g.f11313c) == null) {
                        return;
                    }
                    interfaceC1276c.o(interfaceC1369g, c1303g.f11314d);
                    return;
                }
                try {
                    interfaceC1276c.o(null, interfaceC1276c.b());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    interfaceC1276c.c("Failed to get service from broker.");
                    c1300d.l(new l1.b(10), null);
                    return;
                }
            case 1:
                C1322i c1322i = (C1322i) this.f11309b;
                B1.g gVar = (B1.g) this.f11310c;
                Object obj = c1322i.f11388b;
                if (obj == null) {
                    gVar.getClass();
                    return;
                }
                try {
                    gVar.getClass();
                    ((E1.b) obj).onLocationChanged((Location) gVar.f215b);
                    return;
                } catch (RuntimeException e6) {
                    gVar.getClass();
                    throw e6;
                }
            default:
                G1.g gVar2 = (G1.g) this.f11309b;
                l1.b bVar2 = gVar2.f925b;
                boolean b6 = bVar2.b();
                BinderC1312P binderC1312P = (BinderC1312P) this.f11310c;
                if (b6) {
                    o1.q qVar = gVar2.f926c;
                    o1.u.g(qVar);
                    l1.b bVar3 = qVar.f11591c;
                    if (!bVar3.b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        binderC1312P.f11339j.b(bVar3);
                        binderC1312P.f11338i.l();
                        return;
                    }
                    C1303G c1303g2 = binderC1312P.f11339j;
                    IBinder iBinder = qVar.f11590b;
                    if (iBinder != null) {
                        int i2 = AbstractBinderC1363a.f11525e;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC1369g2 = queryLocalInterface instanceof InterfaceC1369g ? (InterfaceC1369g) queryLocalInterface : new C1362G(iBinder);
                    }
                    c1303g2.getClass();
                    if (interfaceC1369g2 == null || (set = binderC1312P.f11336g) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c1303g2.b(new l1.b(4));
                    } else {
                        c1303g2.f11313c = interfaceC1369g2;
                        c1303g2.f11314d = set;
                        if (c1303g2.f11315e) {
                            c1303g2.f11311a.o(interfaceC1369g2, set);
                        }
                    }
                } else {
                    binderC1312P.f11339j.b(bVar2);
                }
                binderC1312P.f11338i.l();
                return;
        }
    }

    public /* synthetic */ RunnableC1302F(C1322i c1322i, B1.g gVar) {
        this.f11308a = 1;
        this.f11309b = c1322i;
        this.f11310c = gVar;
    }
}
