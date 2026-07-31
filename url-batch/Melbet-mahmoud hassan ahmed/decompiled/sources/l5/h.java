package l5;

import m5.k;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final m5.k f18653a;

    /* renamed from: b, reason: collision with root package name */
    private final k.c f18654b;

    class a implements k.c {
        a() {
        }

        @Override // m5.k.c
        public void C(m5.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public h(a5.a aVar) {
        a aVar2 = new a();
        this.f18654b = aVar2;
        m5.k kVar = new m5.k(aVar, "flutter/navigation", m5.g.f19246a);
        this.f18653a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        z4.b.e("NavigationChannel", "Sending message to pop route.");
        this.f18653a.c("popRoute", null);
    }

    public void b(String str) {
        z4.b.e("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f18653a.c("pushRoute", str);
    }

    public void c(String str) {
        z4.b.e("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f18653a.c("setInitialRoute", str);
    }
}
