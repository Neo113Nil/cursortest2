package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eti {
    public static volatile eth a = null;
    public static volatile boolean b = false;
    public static final AtomicInteger c;
    public static final ggw g;
    private static final Object i = new Object();
    public final String d;
    public volatile int e = -1;
    public volatile Object f;
    public final iyi h;
    private Object j;
    private volatile boolean k;

    static {
        new AtomicReference();
        g = new ggw();
        c = new AtomicInteger();
    }

    public eti(iyi iyiVar, String str, Object obj) {
        if (iyiVar.c == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.h = iyiVar;
        this.d = str;
        this.j = obj;
        this.k = false;
    }

    public static void e() {
        c.incrementAndGet();
    }

    public static void f(Context context) {
        if (a != null || context == null) {
            return;
        }
        Object obj = i;
        synchronized (obj) {
            if (a == null) {
                synchronized (obj) {
                    eth ethVar = a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (ethVar == null || ethVar.a != context) {
                        if (ethVar != null) {
                            Iterator it = est.a.values().iterator();
                            while (it.hasNext()) {
                                est estVar = (est) it.next();
                                synchronized (estVar) {
                                    if (estVar.f) {
                                        estVar.f = false;
                                    } else {
                                        ContentObserver contentObserver = estVar.e;
                                        if (contentObserver != null) {
                                            estVar.c.unregisterContentObserver(contentObserver);
                                            estVar.e = null;
                                        }
                                    }
                                }
                                it.remove();
                            }
                            etk.a();
                            esy.a();
                        }
                        a = new eth(context, hoq.v(new ewf(context, 1)));
                        e();
                    }
                }
            }
        }
    }

    public abstract Object a(Object obj);

    public final Object b() {
        return this.j;
    }

    public final String c() {
        return d((String) this.h.b);
    }

    public final String d(String str) {
        boolean isEmpty = str.isEmpty();
        String str2 = this.d;
        return isEmpty ? str2 : str.concat(str2);
    }
}
