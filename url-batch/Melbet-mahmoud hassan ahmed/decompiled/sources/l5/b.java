package l5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.k;
import m5.r;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final m5.k f18635a;

    /* renamed from: b, reason: collision with root package name */
    private b5.a f18636b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<k.d>> f18637c;

    /* renamed from: d, reason: collision with root package name */
    final k.c f18638d;

    class a implements k.c {
        a() {
        }

        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            int intValue;
            String str;
            String str2;
            if (b.this.f18636b == null) {
                return;
            }
            String str3 = jVar.f19247a;
            Map map = (Map) jVar.b();
            z4.b.e("DeferredComponentChannel", "Received '" + str3 + "' message.");
            intValue = ((Integer) map.get("loadingUnitId")).intValue();
            str = (String) map.get("componentName");
            str3.hashCode();
            switch (str3) {
                case "uninstallDeferredComponent":
                    b.this.f18636b.c(intValue, str);
                    str2 = null;
                    break;
                case "getDeferredComponentInstallState":
                    str2 = b.this.f18636b.a(intValue, str);
                    break;
                case "installDeferredComponent":
                    b.this.f18636b.e(intValue, str);
                    if (!b.this.f18637c.containsKey(str)) {
                        b.this.f18637c.put(str, new ArrayList());
                    }
                    ((List) b.this.f18637c.get(str)).add(dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(str2);
        }
    }

    public b(a5.a aVar) {
        a aVar2 = new a();
        this.f18638d = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/deferredcomponent", r.f19262b);
        this.f18635a = kVar;
        kVar.e(aVar2);
        this.f18636b = z4.a.e().a();
        this.f18637c = new HashMap();
    }

    public void c(b5.a aVar) {
        this.f18636b = aVar;
    }
}
