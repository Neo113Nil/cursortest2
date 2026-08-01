package mf;

import ce.b;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f6630a = new ConcurrentHashMap();

    public static final String a(b bVar) {
        bVar.getClass();
        ConcurrentHashMap concurrentHashMap = f6630a;
        String str = (String) concurrentHashMap.get(bVar);
        if (str != null) {
            return str;
        }
        String name = a.a.D(bVar).getName();
        concurrentHashMap.put(bVar, name);
        return name;
    }
}
