package l5;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f6047b = new k();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6048a = new HashMap();

    public static i a(d dVar, j jVar) {
        i iVar;
        k kVar = f6047b;
        kVar.getClass();
        synchronized (dVar) {
            if (!dVar.f6021j) {
                dVar.f6021j = true;
                dVar.c();
            }
        }
        String str = "https://" + jVar.f6044a + "/" + jVar.f6046c;
        synchronized (kVar.f6048a) {
            try {
                if (!kVar.f6048a.containsKey(dVar)) {
                    kVar.f6048a.put(dVar, new HashMap());
                }
                Map map = (Map) kVar.f6048a.get(dVar);
                if (map.containsKey(str)) {
                    throw new IllegalStateException("createLocalRepo() called for existing repo.");
                }
                iVar = new i(dVar, jVar);
                map.put(str, iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
