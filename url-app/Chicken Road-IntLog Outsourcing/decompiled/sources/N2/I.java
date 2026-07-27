package N2;

import D4.AbstractC0024y;
import D4.InterfaceC0022w;
import D4.n0;
import M.C0076e;
import M.P;
import M.U;
import M.V;
import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import n2.AbstractC1341c;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z4.l[] f2065a;

    /* renamed from: b, reason: collision with root package name */
    public static final O.c f2066b;

    static {
        kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o(I.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        kotlin.jvm.internal.t.f10742a.getClass();
        f2065a = new z4.l[]{oVar};
        O.a aVar = O.a.f2194e;
        K4.c cVar = D4.E.f461c;
        n0 c2 = AbstractC0024y.c();
        cVar.getClass();
        f2066b = new O.c(aVar, AbstractC0024y.b(AbstractC1341c.A(cVar, c2)));
    }

    public static final B1.g a(Context context) {
        B1.g gVar;
        kotlin.jvm.internal.i.e(context, "<this>");
        O.c cVar = f2066b;
        z4.l property = f2065a[0];
        cVar.getClass();
        kotlin.jvm.internal.i.e(property, "property");
        B1.g gVar2 = cVar.f2201d;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (cVar.f2200c) {
            try {
                if (cVar.f2201d == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC1441l interfaceC1441l = cVar.f2198a;
                    kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                    List migrations = (List) interfaceC1441l.invoke(applicationContext);
                    InterfaceC0022w interfaceC0022w = cVar.f2199b;
                    O.b bVar = new O.b(applicationContext, 0, cVar);
                    kotlin.jvm.internal.i.e(migrations, "migrations");
                    P p5 = new P(new V(new U(2, bVar)), K1.b.W(new C0076e(migrations, null)), new l1.j(8), interfaceC0022w);
                    cVar.f2201d = new B1.g(26, new B1.g(26, p5));
                }
                gVar = cVar.f2201d;
                kotlin.jvm.internal.i.b(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static final boolean b(String key, Object obj, Set set) {
        kotlin.jvm.internal.i.e(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object c(Object obj, W1.e eVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!B4.r.O(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
            if (!B4.r.O(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
                return obj;
            }
            String substring = str.substring(40);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring));
        }
        if (B4.r.O(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return obj;
        }
        String listString = str.substring(40);
        kotlin.jvm.internal.i.d(listString, "substring(...)");
        eVar.getClass();
        kotlin.jvm.internal.i.e(listString, "listString");
        Object readObject = new K(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
        kotlin.jvm.internal.i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) readObject) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
