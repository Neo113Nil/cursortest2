package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anj {
    public static volatile anj a;
    public static final Object b = new Object();
    final Context e;
    final Set d = new HashSet();
    final Map c = new HashMap();

    public anj(Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(Class cls, Set set) {
        if (yk.g()) {
            try {
                yk.f(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        Map map = this.c;
        if (map.containsKey(cls)) {
            this.c.get(cls);
        } else {
            set.add(cls);
            try {
                anl anlVar = (anl) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> b2 = anlVar.b();
                if (!b2.isEmpty()) {
                    for (Class cls2 : b2) {
                        if (!map.containsKey(cls2)) {
                            a(cls2, set);
                        }
                    }
                }
                Object a2 = anlVar.a(this.e);
                set.remove(cls);
                map.put(cls, a2);
            } catch (Throwable th) {
                throw new anm(th);
            }
        }
    }
}
