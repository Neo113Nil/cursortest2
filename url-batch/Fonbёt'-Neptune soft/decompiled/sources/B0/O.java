package B0;

import I.C0070e;
import I.U;
import I.V;
import Y0.C0125t;
import Y0.InterfaceC0126u;
import Y0.T;
import Y0.f0;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ V0.c[] f128a;

    /* renamed from: b, reason: collision with root package name */
    public static final K.c f129b;

    static {
        Q0.k kVar = new Q0.k(Q0.b.f964e, O.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        Q0.p.f984a.getClass();
        f128a = new V0.c[]{kVar};
        K.a aVar = K.a.f745f;
        H0.i iVar = Y0.B.f1160b;
        f0 f0Var = new f0(null);
        iVar.getClass();
        if (f0Var != H0.j.f503e) {
            iVar = (H0.i) f0Var.m(iVar, H0.b.f498h);
        }
        if (iVar.k(C0125t.f1230f) == null) {
            iVar = iVar.i(new T(null));
        }
        f129b = new K.c(aVar, new d1.e(iVar));
    }

    public static final B.m a(Context context) {
        B.m mVar;
        Q0.h.e(context, "<this>");
        K.c cVar = f129b;
        V0.c cVar2 = f128a[0];
        cVar.getClass();
        Q0.h.e(cVar2, "property");
        B.m mVar2 = cVar.f752d;
        if (mVar2 != null) {
            return mVar2;
        }
        synchronized (cVar.f751c) {
            try {
                if (cVar.f752d == null) {
                    Context applicationContext = context.getApplicationContext();
                    P0.l lVar = cVar.f749a;
                    Q0.h.d(applicationContext, "applicationContext");
                    List list = (List) lVar.i(applicationContext);
                    InterfaceC0126u interfaceC0126u = cVar.f750b;
                    K.b bVar = new K.b(0, applicationContext, cVar);
                    Q0.h.e(list, "migrations");
                    I.P p2 = new I.P(new V(new U(1, bVar)), i1.a.u(new C0070e(list, null)), new C0023a(10), interfaceC0126u);
                    cVar.f752d = new B.m(8, new B.m(8, p2));
                }
                mVar = cVar.f752d;
                Q0.h.b(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        Q0.h.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, C0023a c0023a) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        Q0.h.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            Q0.h.d(substring, "substring(...)");
            return c0023a.d(substring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        Q0.h.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
