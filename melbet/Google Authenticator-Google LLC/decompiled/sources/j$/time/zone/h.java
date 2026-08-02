package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class h {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentHashMap c;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(String str) {
        Objects.a(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = c;
        h hVar = (h) concurrentHashMap.get(str);
        if (hVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new f("No time-zone data files registered");
            }
            throw new f("Unknown time-zone ID: ".concat(str));
        }
        if (hVar.a.contains(str)) {
            return new e(TimeZone.getTimeZone(str));
        }
        throw new f("Not a built-in time zone: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(h hVar) {
        Objects.a(hVar, "provider");
        synchronized (h.class) {
            try {
                for (String str : hVar.a) {
                    Objects.a(str, "zoneId");
                    if (((h) c.putIfAbsent(str, hVar)) != null) {
                        throw new f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + String.valueOf(hVar));
                    }
                }
                Collections.unmodifiableSet(new HashSet(c.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        b.add(hVar);
    }
}
