package io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
class j extends e implements g {

    /* renamed from: b, reason: collision with root package name */
    protected final io.flutter.plugins.googlemobileads.a f17512b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17513c;

    /* renamed from: d, reason: collision with root package name */
    private final List<m> f17514d;

    /* renamed from: e, reason: collision with root package name */
    private final i f17515e;

    /* renamed from: f, reason: collision with root package name */
    private final c f17516f;

    /* renamed from: g, reason: collision with root package name */
    protected s2.b f17517g;

    class a implements s2.e {
        a() {
        }

        @Override // s2.e
        public void d(String str, String str2) {
            j jVar = j.this;
            jVar.f17512b.q(jVar.f17467a, str, str2);
        }
    }

    public j(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, List<m> list, i iVar, c cVar) {
        super(i7);
        u5.c.a(aVar);
        u5.c.a(str);
        u5.c.a(list);
        u5.c.a(iVar);
        this.f17512b = aVar;
        this.f17513c = str;
        this.f17514d = list;
        this.f17515e = iVar;
        this.f17516f = cVar;
    }

    public void a() {
        s2.b bVar = this.f17517g;
        if (bVar != null) {
            this.f17512b.m(this.f17467a, bVar.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        s2.b bVar = this.f17517g;
        if (bVar != null) {
            bVar.a();
            this.f17517g = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    io.flutter.plugin.platform.d c() {
        s2.b bVar = this.f17517g;
        if (bVar == null) {
            return null;
        }
        return new b0(bVar);
    }

    m d() {
        s2.b bVar = this.f17517g;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new m(this.f17517g.getAdSize());
    }

    void e() {
        s2.b a7 = this.f17516f.a();
        this.f17517g = a7;
        if (this instanceof d) {
            a7.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f17517g.setAdUnitId(this.f17513c);
        this.f17517g.setAppEventListener(new a());
        r2.h[] hVarArr = new r2.h[this.f17514d.size()];
        for (int i7 = 0; i7 < this.f17514d.size(); i7++) {
            hVarArr[i7] = this.f17514d.get(i7).a();
        }
        this.f17517g.setAdSizes(hVarArr);
        this.f17517g.setAdListener(new r(this.f17467a, this.f17512b, this));
        this.f17517g.e(this.f17515e.k(this.f17513c));
    }
}
