package t4;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m5.j;
import m5.k;

/* loaded from: classes.dex */
public class g implements k.c {

    /* renamed from: f, reason: collision with root package name */
    private final Context f22320f;

    /* renamed from: g, reason: collision with root package name */
    private final m5.c f22321g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, d> f22322h = new HashMap();

    public g(Context context, m5.c cVar) {
        this.f22320f = context;
        this.f22321g = cVar;
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        HashMap hashMap;
        String str = jVar.f19247a;
        str.hashCode();
        switch (str) {
            case "init":
                String str2 = (String) jVar.a("id");
                if (!this.f22322h.containsKey(str2)) {
                    this.f22322h.put(str2, new d(this.f22320f, this.f22321g, str2, (Map) jVar.a("audioLoadConfiguration"), (List) jVar.a("androidAudioEffects"), (Boolean) jVar.a("androidOffloadSchedulingEnabled")));
                    dVar.a(null);
                    return;
                } else {
                    dVar.b("Platform player " + str2 + " already exists", null, null);
                    return;
                }
            case "disposePlayer":
                String str3 = (String) jVar.a("id");
                d dVar2 = this.f22322h.get(str3);
                if (dVar2 != null) {
                    dVar2.z0();
                    this.f22322h.remove(str3);
                }
                hashMap = new HashMap();
                break;
            case "disposeAllPlayers":
                a();
                hashMap = new HashMap();
                break;
            default:
                dVar.c();
                return;
        }
        dVar.a(hashMap);
    }

    void a() {
        Iterator it = new ArrayList(this.f22322h.values()).iterator();
        while (it.hasNext()) {
            ((d) it.next()).z0();
        }
        this.f22322h.clear();
    }
}
