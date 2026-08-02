package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iga extends jyf {
    private final Map b;
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    private static final hkh a = hkh.l("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry");
    private static final kuq h = new kuq((Object) null, (Object) null, (byte[]) null);
    private static final kuq g = ixg.j("not_found", null, new HashMap());

    public iga(Map map) {
        this.b = map;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jyf
    public final kuq a(String str) {
        int indexOf;
        kuq kuqVar;
        ConcurrentHashMap concurrentHashMap = this.f;
        kuq kuqVar2 = (kuq) concurrentHashMap.get(str);
        if (kuqVar2 == null && (indexOf = str.indexOf(47)) > 0) {
            String substring = str.substring(0, indexOf);
            synchronized (this.c) {
                Map map = this.e;
                kuq kuqVar3 = (kuq) map.get(substring);
                if (kuqVar3 == null) {
                    koe koeVar = (koe) this.b.get(substring);
                    if (koeVar != null) {
                        jwu jwuVar = (jwu) koeVar.b();
                        this.d.put(substring, jwuVar);
                        kuqVar = jwuVar.e();
                    } else {
                        ((hkf) ((hkf) a.g()).i("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry", "initService", 113, "LazyServicesHandlerRegistry.java")).u("No factory available for service %s.", substring);
                        kuqVar = g;
                    }
                    kuqVar3 = kuqVar;
                    map.put(substring, kuqVar3);
                }
                kuq kuqVar4 = kuqVar3 != g ? (kuq) kuqVar3.a.get(str) : null;
                if (kuqVar4 == null) {
                    kuqVar4 = h;
                }
                kuqVar2 = kuqVar4;
                concurrentHashMap.put(str, kuqVar2);
            }
        }
        if (kuqVar2 == h) {
            return null;
        }
        return kuqVar2;
    }
}
