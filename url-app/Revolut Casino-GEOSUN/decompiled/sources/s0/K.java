package s0;

import D.C0004e;
import D.S;
import D.W;
import D.X;
import M0.C0061t;
import M0.InterfaceC0062u;
import M0.T;
import M0.f0;
import android.content.Context;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ J0.c[] f2875a;

    /* renamed from: b, reason: collision with root package name */
    public static final F.c f2876b;

    static {
        F0.l lVar = new F0.l(F0.b.f305e, K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        F0.q.f325a.getClass();
        f2875a = new J0.c[]{lVar};
        F.a aVar = F.a.f293f;
        w0.i iVar = M0.B.f617b;
        f0 f0Var = new f0(null);
        iVar.getClass();
        if (f0Var != w0.j.f3082e) {
            iVar = (w0.i) f0Var.h(iVar, new w0.b(1));
        }
        if (iVar.f(C0061t.f687f) == null) {
            iVar = iVar.k(new T(null));
        }
        f2876b = new F.c(aVar, new R0.e(iVar));
    }

    public static final A.j a(Context context) {
        A.j jVar;
        F0.i.e(context, "<this>");
        F.c cVar = f2876b;
        J0.c cVar2 = f2875a[0];
        cVar.getClass();
        F0.i.e(cVar2, "property");
        A.j jVar2 = cVar.f300d;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (cVar.f299c) {
            try {
                if (cVar.f300d == null) {
                    Context applicationContext = context.getApplicationContext();
                    E0.l lVar = cVar.f297a;
                    F0.i.d(applicationContext, "applicationContext");
                    List list = (List) lVar.i(applicationContext);
                    InterfaceC0062u interfaceC0062u = cVar.f298b;
                    F.b bVar = new F.b(0, applicationContext, cVar);
                    F0.i.e(list, "migrations");
                    S s2 = new S(new X(new W(1, bVar)), o.g.s(new C0004e(list, null)), new E.a(0), interfaceC0062u);
                    cVar.f300d = new A.j(5, new A.j(5, s2));
                }
                jVar = cVar.f300d;
                F0.i.b(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        F0.i.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, E.a aVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        F0.i.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            F0.i.d(substring, "substring(...)");
            return aVar.c(substring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        F0.i.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
