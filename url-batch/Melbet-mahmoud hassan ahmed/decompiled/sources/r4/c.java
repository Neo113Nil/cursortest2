package r4;

import e5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import m5.j;
import m5.k;

/* loaded from: classes.dex */
public class c implements e5.a, k.c {

    /* renamed from: h, reason: collision with root package name */
    private static Map<?, ?> f21364h;

    /* renamed from: i, reason: collision with root package name */
    private static List<c> f21365i = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private k f21366f;

    /* renamed from: g, reason: collision with root package name */
    private b f21367g;

    private void a(String str, Object... objArr) {
        for (c cVar : f21365i) {
            cVar.f21366f.c(str, new ArrayList(Arrays.asList(objArr)));
        }
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        List list = (List) jVar.f19248b;
        String str = jVar.f19247a;
        str.hashCode();
        if (str.equals("setConfiguration")) {
            f21364h = (Map) list.get(0);
            dVar.a(null);
            a("onConfigurationChanged", f21364h);
        } else if (str.equals("getConfiguration")) {
            dVar.a(f21364h);
        } else {
            dVar.c();
        }
    }

    @Override // e5.a
    public void f(a.b bVar) {
        m5.c b7 = bVar.b();
        k kVar = new k(b7, "com.ryanheise.audio_session");
        this.f21366f = kVar;
        kVar.e(this);
        this.f21367g = new b(bVar.a(), b7);
        f21365i.add(this);
    }

    @Override // e5.a
    public void i(a.b bVar) {
        this.f21366f.e(null);
        this.f21366f = null;
        this.f21367g.c();
        this.f21367g = null;
        f21365i.remove(this);
    }
}
