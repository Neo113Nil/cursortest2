package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kat {
    public static final Logger a = Logger.getLogger(kat.class.getName());
    private static kat b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private her e = hix.b;

    public static synchronized kat b() {
        kat katVar;
        synchronized (kat.class) {
            if (b == null) {
                kar.class.getClassLoader();
                List<kar> a2 = ixi.a(kar.class, Collections.singletonList(kgn.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new fsd(6), new kas(0));
                if (a2.isEmpty()) {
                    a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                b = new kat();
                for (kar karVar : a2) {
                    a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(karVar))));
                    b.f(karVar);
                }
                b.g();
            }
            katVar = b;
        }
        return katVar;
    }

    private final synchronized void f(kar karVar) {
        karVar.f();
        this.d.add(karVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r6.d() < r4.d()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void g() {
        HashMap hashMap = new HashMap();
        Iterator it = this.d.iterator();
        String str = "unknown";
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            kar karVar = (kar) it.next();
            String c = karVar.c();
            kar karVar2 = (kar) hashMap.get(c);
            if (karVar2 != null) {
            }
            hashMap.put(c, karVar);
            if (i < karVar.d()) {
                i = karVar.d();
                str = karVar.c();
            }
        }
        this.e = her.i(hashMap);
        this.c = str;
    }

    public final kar a(String str) {
        if (str == null) {
            return null;
        }
        return (kar) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(kar karVar) {
        f(karVar);
        g();
    }
}
