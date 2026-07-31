package L2;

import I2.f;
import M2.b;
import O2.d;
import Z2.e;
import java.util.Hashtable;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    static final Hashtable f899a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    static final Hashtable f900b = new Hashtable();

    static {
        a("B-571", b.f951F);
        a("B-409", b.f949D);
        a("B-283", b.f984n);
        a("B-233", b.f990t);
        a("B-163", b.f982l);
        a("K-571", b.f950E);
        a("K-409", b.f948C);
        a("K-283", b.f983m);
        a("K-233", b.f989s);
        a("K-163", b.f972b);
        a("P-521", b.f947B);
        a("P-384", b.f946A);
        a("P-256", b.f953H);
        a("P-224", b.f996z);
        a("P-192", b.f952G);
    }

    static void a(String str, f fVar) {
        f899a.put(str, fVar);
        f900b.put(fVar, str);
    }

    public static d b(String str) {
        f fVar = (f) f899a.get(e.d(str));
        if (fVar != null) {
            return c(fVar);
        }
        return null;
    }

    public static d c(f fVar) {
        return M2.a.i(fVar);
    }
}
