package e2;

import java.util.List;
import java.util.Map;
import y.t;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566h implements InterfaceC0567i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f6189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6190b;

    public C0566h(n nVar, k kVar) {
        this.f6190b = nVar;
        this.f6189a = kVar;
    }

    @Override // e2.InterfaceC0567i
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        n nVar = this.f6190b;
        k kVar = this.f6189a;
        if (equals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                List list = (List) map2.get("w");
                m mVar = kVar.f6198b;
                nVar.getClass();
                if (list.contains("no_index")) {
                    nVar.f6235x.M("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + ("\".indexOn\": \"" + mVar.f6206b.get("i") + '\"') + "' at " + M1.a.M(mVar.f6205a) + " to your security and Firebase Database rules for better performance");
                }
            }
        }
        if (((k) nVar.f6226o.get(kVar.f6198b)) == kVar) {
            boolean equals2 = str.equals("ok");
            t tVar = kVar.f6197a;
            if (equals2) {
                tVar.s(null, null);
            } else {
                nVar.f(kVar.f6198b);
                tVar.s(str, (String) map.get("d"));
            }
        }
    }
}
