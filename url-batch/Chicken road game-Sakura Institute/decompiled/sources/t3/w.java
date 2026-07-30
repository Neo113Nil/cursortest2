package t3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import r1.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f8865a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8866b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8867c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8868d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8869e = new LinkedHashMap();

    public w(g0 g0Var, String str) {
        this.f8865a = g0Var;
        this.f8866b = str;
    }

    public v a() {
        v b9 = b();
        b9.getClass();
        LinkedHashMap linkedHashMap = b9.f8861j;
        Iterator it = this.f8867c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            r6.k.f(str, "argumentName");
            r6.k.f(null, "argument");
            throw null;
        }
        ArrayList arrayList = this.f8868d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s sVar = (s) obj;
            r6.k.f(sVar, "navDeepLink");
            ArrayList i02 = j1.c.i0(linkedHashMap, new u(sVar, 0));
            if (!i02.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + sVar.f8837a + " can't be used to open destination " + b9 + ".\nFollowing required arguments are missing: " + i02).toString());
            }
            b9.f8859h.add(sVar);
        }
        Iterator it2 = this.f8869e.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            r6.k.f(null, "action");
            throw null;
        }
        String str2 = this.f8866b;
        if (str2 != null) {
            if (z6.h.G(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            r6.k.f(concat, "uriPattern");
            ArrayList i03 = j1.c.i0(linkedHashMap, new u(new s(concat), 1));
            if (!i03.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b9 + ". Following required arguments are missing: " + i03).toString());
            }
            b9.f8864m = d6.a.d(new z0(7, concat));
            b9.f8862k = concat.hashCode();
            b9.f8863l = str2;
        }
        return b9;
    }

    public v b() {
        return this.f8865a.a();
    }
}
