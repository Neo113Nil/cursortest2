package B0;

import F.C0023e;
import F.U;
import F.V;
import W0.C0079t;
import W0.InterfaceC0080u;
import W0.f0;
import a.AbstractC0086a;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ T0.c[] f57a;

    /* renamed from: b, reason: collision with root package name */
    public static final H.c f58b;

    static {
        P0.k kVar = new P0.k(P0.b.f790e, P.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        P0.p.f808a.getClass();
        f57a = new T0.c[]{kVar};
        G0.i iVar = W0.B.f906b;
        f0 f0Var = new f0();
        iVar.getClass();
        if (f0Var != G0.j.f500e) {
            iVar = (G0.i) f0Var.h(iVar, new G0.b(1));
        }
        if (iVar.m(C0079t.f974f) == null) {
            iVar = iVar.j(new W0.T());
        }
        f58b = new H.c(H.a.f501f, new b1.e(iVar));
    }

    public static final E a(Context context) {
        E e2;
        P0.h.e(context, "<this>");
        H.c cVar = f58b;
        T0.c cVar2 = f57a[0];
        cVar.getClass();
        P0.h.e(cVar2, "property");
        E e3 = cVar.f508d;
        if (e3 != null) {
            return e3;
        }
        synchronized (cVar.f507c) {
            try {
                if (cVar.f508d == null) {
                    Context applicationContext = context.getApplicationContext();
                    O0.l lVar = cVar.f505a;
                    P0.h.d(applicationContext, "applicationContext");
                    List list = (List) lVar.j(applicationContext);
                    InterfaceC0080u interfaceC0080u = cVar.f506b;
                    H.b bVar = new H.b(0, applicationContext, cVar);
                    P0.h.e(list, "migrations");
                    F.P p2 = new F.P(new V(new U(1, bVar)), AbstractC0086a.x(new C0023e(list, null)), new C0000a(4), interfaceC0080u);
                    cVar.f508d = new E(6, new E(6, p2));
                }
                e2 = cVar.f508d;
                P0.h.b(e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return e2;
    }

    public static final boolean b(String str, Object obj, Set set) {
        P0.h.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, C0000a c0000a) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        P0.h.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            P0.h.d(substring, "substring(...)");
            return c0000a.c(substring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        P0.h.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
