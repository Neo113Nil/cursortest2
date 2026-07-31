package io.flutter.plugins.googlemobileads;

import android.util.Log;
import f3.d;
import io.flutter.plugins.googlemobileads.g0;
import java.util.Map;

/* loaded from: classes.dex */
class w extends e {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17581b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17582c;

    /* renamed from: d, reason: collision with root package name */
    private final g0.c f17583d;

    /* renamed from: e, reason: collision with root package name */
    private final h f17584e;

    /* renamed from: f, reason: collision with root package name */
    private l f17585f;

    /* renamed from: g, reason: collision with root package name */
    private i f17586g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f17587h;

    /* renamed from: i, reason: collision with root package name */
    private f3.e f17588i;

    /* renamed from: j, reason: collision with root package name */
    private final z f17589j;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private io.flutter.plugins.googlemobileads.a f17590a;

        /* renamed from: b, reason: collision with root package name */
        private String f17591b;

        /* renamed from: c, reason: collision with root package name */
        private g0.c f17592c;

        /* renamed from: d, reason: collision with root package name */
        private l f17593d;

        /* renamed from: e, reason: collision with root package name */
        private i f17594e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, Object> f17595f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f17596g;

        /* renamed from: h, reason: collision with root package name */
        private z f17597h;

        /* renamed from: i, reason: collision with root package name */
        private h f17598i;

        a() {
        }

        w a() {
            if (this.f17590a == null) {
                throw new IllegalStateException("AdInstanceManager cannot not be null.");
            }
            if (this.f17591b == null) {
                throw new IllegalStateException("AdUnitId cannot not be null.");
            }
            if (this.f17592c == null) {
                throw new IllegalStateException("NativeAdFactory cannot not be null.");
            }
            l lVar = this.f17593d;
            if (lVar == null && this.f17594e == null) {
                throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
            }
            return lVar == null ? new w(this.f17596g.intValue(), this.f17590a, this.f17591b, this.f17592c, this.f17594e, this.f17598i, this.f17595f, this.f17597h) : new w(this.f17596g.intValue(), this.f17590a, this.f17591b, this.f17592c, this.f17593d, this.f17598i, this.f17595f, this.f17597h);
        }

        public a b(g0.c cVar) {
            this.f17592c = cVar;
            return this;
        }

        public a c(i iVar) {
            this.f17594e = iVar;
            return this;
        }

        public a d(String str) {
            this.f17591b = str;
            return this;
        }

        public a e(Map<String, Object> map) {
            this.f17595f = map;
            return this;
        }

        public a f(h hVar) {
            this.f17598i = hVar;
            return this;
        }

        public a g(int i7) {
            this.f17596g = Integer.valueOf(i7);
            return this;
        }

        public a h(io.flutter.plugins.googlemobileads.a aVar) {
            this.f17590a = aVar;
            return this;
        }

        public a i(z zVar) {
            this.f17597h = zVar;
            return this;
        }

        public a j(l lVar) {
            this.f17593d = lVar;
            return this;
        }
    }

    protected w(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, g0.c cVar, i iVar, h hVar, Map<String, Object> map, z zVar) {
        super(i7);
        this.f17581b = aVar;
        this.f17582c = str;
        this.f17583d = cVar;
        this.f17586g = iVar;
        this.f17584e = hVar;
        this.f17587h = map;
        this.f17589j = zVar;
    }

    protected w(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, g0.c cVar, l lVar, h hVar, Map<String, Object> map, z zVar) {
        super(i7);
        this.f17581b = aVar;
        this.f17582c = str;
        this.f17583d = cVar;
        this.f17585f = lVar;
        this.f17584e = hVar;
        this.f17587h = map;
        this.f17589j = zVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        f3.e eVar = this.f17588i;
        if (eVar != null) {
            eVar.a();
            this.f17588i = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    public io.flutter.plugin.platform.d c() {
        f3.e eVar = this.f17588i;
        if (eVar == null) {
            return null;
        }
        return new b0(eVar);
    }

    void d() {
        y yVar = new y(this);
        x xVar = new x(this.f17467a, this.f17581b);
        z zVar = this.f17589j;
        f3.d a7 = zVar == null ? new d.a().a() : zVar.a();
        l lVar = this.f17585f;
        if (lVar != null) {
            h hVar = this.f17584e;
            String str = this.f17582c;
            hVar.h(str, yVar, a7, xVar, lVar.b(str));
        } else {
            i iVar = this.f17586g;
            if (iVar != null) {
                this.f17584e.c(this.f17582c, yVar, a7, xVar, iVar.k(this.f17582c));
            } else {
                Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
            }
        }
    }

    void e(f3.c cVar) {
        this.f17588i = this.f17583d.a(cVar, this.f17587h);
        cVar.b(new a0(this.f17581b, this));
        this.f17581b.m(this.f17467a, cVar.a());
    }
}
