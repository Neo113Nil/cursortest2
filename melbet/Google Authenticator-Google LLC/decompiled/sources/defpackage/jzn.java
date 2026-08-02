package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzn {
    public static final Logger a = Logger.getLogger(jzn.class.getName());
    private static jzn b;
    private final LinkedHashSet c = new LinkedHashSet();
    private final LinkedHashMap d = new LinkedHashMap();

    public static synchronized jzn b() {
        jzn jznVar;
        synchronized (jzn.class) {
            if (b == null) {
                jzm.class.getClassLoader();
                List<jzm> a2 = ixi.a(jzm.class, Collections.singletonList(kjz.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new fsd(5), new kas(1));
                b = new jzn();
                for (jzm jzmVar : a2) {
                    a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(jzmVar))));
                    b.c(jzmVar);
                }
                b.d();
            }
            jznVar = b;
        }
        return jznVar;
    }

    private final synchronized void c(jzm jzmVar) {
        jzmVar.e();
        this.c.add(jzmVar);
    }

    private final synchronized void d() {
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jzm jzmVar = (jzm) it.next();
            String c = jzmVar.c();
            if (((jzm) linkedHashMap.get(c)) != null) {
                jzmVar.d();
            } else {
                linkedHashMap.put(c, jzmVar);
            }
        }
    }

    public final synchronized jzm a(String str) {
        return (jzm) this.d.get(str);
    }
}
