package W1;

import K.C0040d;
import K.S;
import K.T;
import U1.C0080a;
import a.AbstractC0129a;
import android.content.Context;
import java.util.List;
import java.util.Set;
import t2.AbstractC1212w;
import t2.InterfaceC1210u;
import t2.j0;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q2.g[] f1652a;

    /* renamed from: b, reason: collision with root package name */
    public static final M.c f1653b;

    static {
        kotlin.jvm.internal.m mVar = new kotlin.jvm.internal.m(kotlin.jvm.internal.c.NO_RECEIVER, L.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        kotlin.jvm.internal.r.f9693a.getClass();
        f1652a = new q2.g[]{mVar};
        M.a aVar = M.a.f891e;
        A2.d dVar = t2.D.f10378b;
        j0 j0Var = new j0();
        dVar.getClass();
        f1653b = new M.c(aVar, AbstractC1212w.a(android.support.v4.media.session.a.E(dVar, j0Var)));
    }

    public static final C0.e a(Context context) {
        C0.e eVar;
        kotlin.jvm.internal.j.e(context, "<this>");
        M.c cVar = f1653b;
        q2.g property = f1652a[0];
        cVar.getClass();
        kotlin.jvm.internal.j.e(property, "property");
        C0.e eVar2 = cVar.f897d;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (cVar.f896c) {
            try {
                if (cVar.f897d == null) {
                    Context applicationContext = context.getApplicationContext();
                    l2.l lVar = cVar.f894a;
                    kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    InterfaceC1210u interfaceC1210u = cVar.f895b;
                    M.b bVar = new M.b(applicationContext, 0, cVar);
                    kotlin.jvm.internal.j.e(migrations, "migrations");
                    K.N n3 = new K.N(new T(new S(1, bVar)), AbstractC0129a.r(new C0040d(migrations, null)), new K0.j(9), interfaceC1210u);
                    cVar.f897d = new C0.e(9, new C0.e(9, n3));
                }
                eVar = cVar.f897d;
                kotlin.jvm.internal.j.b(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static final boolean b(String key, Object obj, Set set) {
        kotlin.jvm.internal.j.e(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object c(Object obj, C0080a c0080a) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (s2.n.X(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (s2.n.X(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            kotlin.jvm.internal.j.d(substring, "substring(...)");
            return c0080a.c(substring);
        }
        if (!s2.n.X(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        kotlin.jvm.internal.j.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
