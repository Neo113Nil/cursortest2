package g2;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f6718b = new j();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6719a = new HashMap();

    public static h a(d dVar, i iVar) {
        h hVar;
        j jVar = f6718b;
        jVar.getClass();
        synchronized (dVar) {
            if (!dVar.f6692j) {
                dVar.f6692j = true;
                dVar.d();
            }
        }
        String str = "https://" + iVar.f6715a + "/" + iVar.f6717c;
        synchronized (jVar.f6719a) {
            try {
                if (!jVar.f6719a.containsKey(dVar)) {
                    jVar.f6719a.put(dVar, new HashMap());
                }
                Map map = (Map) jVar.f6719a.get(dVar);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                hVar = new h(dVar, iVar);
                map.put(str, hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
