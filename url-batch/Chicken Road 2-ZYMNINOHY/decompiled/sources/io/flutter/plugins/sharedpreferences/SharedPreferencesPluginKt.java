package io.flutter.plugins.sharedpreferences;

import G3.k;
import K.C0055d;
import K.InterfaceC0059h;
import K.M;
import K.Q;
import a.AbstractC0124a;
import android.content.Context;
import f3.C0424b;
import f3.C0426d;
import f3.C0431i;
import f3.InterfaceC0427e;
import f3.InterfaceC0430h;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import o3.InterfaceC1339l;
import q3.InterfaceC1386a;
import t1.h;
import u3.g;
import w3.o;
import x3.AbstractC1528C;
import x3.AbstractC1562w;
import x3.InterfaceC1560u;
import x3.j0;

/* loaded from: classes.dex */
public final class SharedPreferencesPluginKt {
    static final /* synthetic */ g[] $$delegatedProperties;
    public static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    public static final String JSON_LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!";
    public static final String LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    public static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    public static final String TAG = "SharedPreferencesPlugin";
    private static final InterfaceC1386a sharedPreferencesDataStore$delegate;

    static {
        C0424b c0424b;
        l lVar = new l(kotlin.jvm.internal.b.NO_RECEIVER, SharedPreferencesPluginKt.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        q.f14160a.getClass();
        $$delegatedProperties = new g[]{lVar};
        InterfaceC0430h interfaceC0430h = AbstractC1528C.f15990b;
        j0 j0Var = new j0();
        interfaceC0430h.getClass();
        C0431i c0431i = C0431i.f8817a;
        if (j0Var != c0431i) {
            InterfaceC0430h k4 = interfaceC0430h.k(j0Var.getKey());
            if (k4 == c0431i) {
                interfaceC0430h = j0Var;
            } else {
                C0426d c0426d = C0426d.f8816a;
                InterfaceC0427e interfaceC0427e = (InterfaceC0427e) k4.n(c0426d);
                if (interfaceC0427e == null) {
                    c0424b = new C0424b(k4, j0Var);
                } else {
                    InterfaceC0430h k5 = k4.k(c0426d);
                    if (k5 == c0431i) {
                        interfaceC0430h = new C0424b(j0Var, interfaceC0427e);
                    } else {
                        c0424b = new C0424b(new C0424b(k5, j0Var), interfaceC0427e);
                    }
                }
                interfaceC0430h = c0424b;
            }
        }
        sharedPreferencesDataStore$delegate = new M.c(M.a.f1683e, AbstractC1562w.a(interfaceC0430h));
    }

    public static final InterfaceC0059h getSharedPreferencesDataStore(Context context) {
        h hVar;
        i.e(context, "<this>");
        InterfaceC1386a interfaceC1386a = sharedPreferencesDataStore$delegate;
        g property = $$delegatedProperties[0];
        M.c cVar = (M.c) interfaceC1386a;
        cVar.getClass();
        i.e(property, "property");
        h hVar2 = cVar.f1690d;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (cVar.f1689c) {
            try {
                if (cVar.f1690d == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC1339l interfaceC1339l = cVar.f1687a;
                    i.d(applicationContext, "applicationContext");
                    List migrations = (List) interfaceC1339l.invoke(applicationContext);
                    InterfaceC1560u interfaceC1560u = cVar.f1688b;
                    M.b bVar = new M.b(applicationContext, 0, cVar);
                    i.e(migrations, "migrations");
                    M m4 = new M(new Q(new k(4, bVar)), AbstractC0124a.H(new C0055d(migrations, null)), new a2.i(13), interfaceC1560u);
                    cVar.f1690d = new h(16, new h(16, m4));
                }
                hVar = cVar.f1690d;
                i.b(hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static final boolean preferencesFilter(String key, Object obj, Set<String> set) {
        i.e(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object transformPref(Object obj, SharedPreferencesListEncoder listEncoder) {
        i.e(listEncoder, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!o.a0(str, LIST_PREFIX, false)) {
            if (!o.a0(str, DOUBLE_PREFIX, false)) {
                return obj;
            }
            String substring = str.substring(40);
            i.d(substring, "substring(...)");
            return Double.valueOf(Double.parseDouble(substring));
        }
        if (o.a0(str, JSON_LIST_PREFIX, false)) {
            return obj;
        }
        String substring2 = str.substring(40);
        i.d(substring2, "substring(...)");
        List<String> decode = listEncoder.decode(substring2);
        i.b(decode);
        return decode;
    }
}
