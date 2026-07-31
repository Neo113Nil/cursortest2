package t1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n.z0;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1019G f8939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8940b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8941c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8942d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f8943e = new LinkedHashMap();

    public v(AbstractC1019G abstractC1019G, String str) {
        this.f8939a = abstractC1019G;
        this.f8940b = str;
    }

    public u a() {
        u b3 = b();
        b3.getClass();
        Iterator it = this.f8941c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            f2.j.f(str, "argumentName");
            f2.j.f(null, "argument");
            throw null;
        }
        Iterator it2 = this.f8942d.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            LinkedHashMap linkedHashMap = b3.f8935h;
            if (!hasNext) {
                Iterator it3 = this.f8943e.entrySet().iterator();
                if (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    ((Number) entry2.getKey()).intValue();
                    if (entry2.getValue() != null) {
                        throw new ClassCastException();
                    }
                    f2.j.f(null, "action");
                    throw null;
                }
                String str2 = this.f8940b;
                if (str2 != null) {
                    if (AbstractC0730j.K(str2)) {
                        throw new IllegalArgumentException("Cannot have an empty route");
                    }
                    int i3 = u.f8930l;
                    String concat = "android-app://androidx.navigation/".concat(str2);
                    f2.j.f(concat, "uriPattern");
                    ArrayList k3 = z0.k(linkedHashMap, new t(new r(concat), 1));
                    if (!k3.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b3 + ". Following required arguments are missing: " + k3).toString());
                    }
                    b3.f8938k = R1.a.d(new t0.D(6, concat));
                    b3.f8936i = concat.hashCode();
                    b3.f8937j = str2;
                }
                return b3;
            }
            r rVar = (r) it2.next();
            f2.j.f(rVar, "navDeepLink");
            ArrayList k4 = z0.k(linkedHashMap, new t(rVar, 0));
            if (!k4.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + rVar.f8911a + " can't be used to open destination " + b3 + ".\nFollowing required arguments are missing: " + k4).toString());
            }
            b3.f8933f.add(rVar);
        }
    }

    public u b() {
        return this.f8939a.a();
    }
}
