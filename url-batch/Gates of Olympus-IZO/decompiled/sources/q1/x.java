package q1;

import f.AbstractC0382a;
import h2.AbstractC0447i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final J f6970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6971b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f6972c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6973d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f6974e = new LinkedHashMap();

    public x(J j3, String str) {
        this.f6970a = j3;
        this.f6971b = str;
    }

    public w a() {
        w b2 = b();
        b2.getClass();
        Iterator it = this.f6972c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            Z1.i.f(str, "argumentName");
            Z1.i.f(null, "argument");
            throw null;
        }
        Iterator it2 = this.f6973d.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            LinkedHashMap linkedHashMap = b2.f6966h;
            if (!hasNext) {
                Iterator it3 = this.f6974e.entrySet().iterator();
                if (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    ((Number) entry2.getKey()).intValue();
                    if (entry2.getValue() != null) {
                        throw new ClassCastException();
                    }
                    Z1.i.f(null, "action");
                    throw null;
                }
                String str2 = this.f6971b;
                if (str2 != null) {
                    if (AbstractC0447i.t0(str2)) {
                        throw new IllegalArgumentException("Cannot have an empty route");
                    }
                    int i3 = w.f6961l;
                    String concat = "android-app://androidx.navigation/".concat(str2);
                    Z1.i.f(concat, "uriPattern");
                    ArrayList t3 = AbstractC0382a.t(linkedHashMap, new v(new t(concat), 1));
                    if (!t3.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b2 + ". Following required arguments are missing: " + t3).toString());
                    }
                    b2.f6969k = I2.d.F(new A2.l(28, concat));
                    b2.f6967i = concat.hashCode();
                    b2.f6968j = str2;
                }
                return b2;
            }
            t tVar = (t) it2.next();
            Z1.i.f(tVar, "navDeepLink");
            ArrayList t4 = AbstractC0382a.t(linkedHashMap, new v(tVar, 0));
            if (!t4.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + tVar.f6942a + " can't be used to open destination " + b2 + ".\nFollowing required arguments are missing: " + t4).toString());
            }
            b2.f6964f.add(tVar);
        }
    }

    public w b() {
        return this.f6970a.a();
    }
}
