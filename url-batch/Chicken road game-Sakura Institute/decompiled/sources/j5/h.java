package j5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f5058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5059b;

    public h(n nVar, k kVar) {
        this.f5059b = nVar;
        this.f5058a = kVar;
    }

    @Override // j5.i
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        n nVar = this.f5059b;
        k kVar = this.f5058a;
        if (equals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                List list = (List) map2.get("w");
                m mVar = kVar.f5067b;
                if (list.contains("no_index")) {
                    String str2 = "\".indexOn\": \"" + mVar.f5075b.get("i") + '\"';
                    nVar.f5099x.I("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + str2 + "' at " + a.a.D(mVar.f5074a) + " to your security and Firebase Database rules for better performance");
                }
            }
        }
        HashMap hashMap = nVar.f5090o;
        m mVar2 = kVar.f5067b;
        androidx.room.c cVar = kVar.f5066a;
        if (((k) hashMap.get(mVar2)) == kVar) {
            if (str.equals("ok")) {
                cVar.x(null, null);
            } else {
                nVar.f(kVar.f5067b);
                cVar.x(str, (String) map.get("d"));
            }
        }
    }
}
