package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyl {
    public static final jyl a;
    public final ConcurrentNavigableMap b = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap e = new ConcurrentHashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();

    static {
        Logger.getLogger(jyl.class.getName());
        a = new jyl();
    }

    public static long a(jyv jyvVar) {
        return jyvVar.c().a;
    }

    public static void b(Map map, jyo jyoVar) {
    }

    public static void c(Map map, jyo jyoVar) {
    }
}
