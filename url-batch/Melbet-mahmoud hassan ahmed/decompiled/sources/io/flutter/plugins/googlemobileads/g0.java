package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import c4.w0;
import e5.a;
import io.flutter.plugins.googlemobileads.e;
import io.flutter.plugins.googlemobileads.m;
import io.flutter.plugins.googlemobileads.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.k;
import r2.u;

/* loaded from: classes.dex */
public class g0 implements e5.a, f5.a, k.c {

    /* renamed from: f, reason: collision with root package name */
    private a.b f17491f;

    /* renamed from: g, reason: collision with root package name */
    private io.flutter.plugins.googlemobileads.a f17492g;

    /* renamed from: h, reason: collision with root package name */
    private io.flutter.plugins.googlemobileads.b f17493h;

    /* renamed from: i, reason: collision with root package name */
    private AppStateNotifier f17494i;

    /* renamed from: j, reason: collision with root package name */
    private p5.d f17495j;

    /* renamed from: l, reason: collision with root package name */
    private i0 f17497l;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, c> f17496k = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final v f17498m = new v();

    class a implements r2.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f17499a;

        a(k.d dVar) {
            this.f17499a = dVar;
        }

        @Override // r2.q
        public void a(r2.c cVar) {
            if (cVar == null) {
                this.f17499a.a(null);
            } else {
                this.f17499a.b(Integer.toString(cVar.a()), cVar.c(), cVar.b());
            }
        }
    }

    private static final class b implements x2.c {

        /* renamed from: a, reason: collision with root package name */
        private final k.d f17501a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f17502b;

        private b(k.d dVar) {
            this.f17501a = dVar;
            this.f17502b = false;
        }

        /* synthetic */ b(k.d dVar, a aVar) {
            this(dVar);
        }

        @Override // x2.c
        public void a(x2.b bVar) {
            if (this.f17502b) {
                return;
            }
            this.f17501a.a(new t(bVar));
            this.f17502b = true;
        }
    }

    public interface c {
        f3.e a(f3.c cVar, Map<String, Object> map);
    }

    private static <T> T g(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // m5.k.c
    public void C(m5.j jVar, k.d dVar) {
        c0 c0Var;
        Object b7;
        String format;
        String str;
        d0 d0Var;
        io.flutter.plugins.googlemobileads.a aVar = this.f17492g;
        if (aVar == null || this.f17491f == null) {
            Log.e("GoogleMobileAdsPlugin", "method call received before instanceManager initialized: " + jVar.f19247a);
            return;
        }
        Context f7 = aVar.f() != null ? this.f17492g.f() : this.f17491f.a();
        String str2 = jVar.f19247a;
        str2.hashCode();
        char c7 = 65535;
        switch (str2.hashCode()) {
            case -1959534605:
                if (str2.equals("MobileAds#openDebugMenu")) {
                    c7 = 0;
                    break;
                }
                break;
            case -1941808395:
                if (str2.equals("loadInterstitialAd")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1826439721:
                if (str2.equals("MobileAds#setAppMuted")) {
                    c7 = 2;
                    break;
                }
                break;
            case -1771320504:
                if (str2.equals("loadAppOpenAd")) {
                    c7 = 3;
                    break;
                }
                break;
            case -1548893609:
                if (str2.equals("loadRewardedAd")) {
                    c7 = 4;
                    break;
                }
                break;
            case -1395015128:
                if (str2.equals("MobileAds#getRequestConfiguration")) {
                    c7 = 5;
                    break;
                }
                break;
            case -1273455673:
                if (str2.equals("loadFluidAd")) {
                    c7 = 6;
                    break;
                }
                break;
            case -965504608:
                if (str2.equals("loadNativeAd")) {
                    c7 = 7;
                    break;
                }
                break;
            case -768079951:
                if (str2.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    c7 = '\b';
                    break;
                }
                break;
            case -676596397:
                if (str2.equals("loadAdManagerInterstitialAd")) {
                    c7 = '\t';
                    break;
                }
                break;
            case -572043403:
                if (str2.equals("loadBannerAd")) {
                    c7 = '\n';
                    break;
                }
                break;
            case -533157842:
                if (str2.equals("MobileAds#setAppVolume")) {
                    c7 = 11;
                    break;
                }
                break;
            case -436783448:
                if (str2.equals("MobileAds#getVersionString")) {
                    c7 = '\f';
                    break;
                }
                break;
            case -172783533:
                if (str2.equals("loadAdManagerBannerAd")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 90971631:
                if (str2.equals("_init")) {
                    c7 = 14;
                    break;
                }
                break;
            case 250880674:
                if (str2.equals("disposeAd")) {
                    c7 = 15;
                    break;
                }
                break;
            case 273004986:
                if (str2.equals("getAdSize")) {
                    c7 = 16;
                    break;
                }
                break;
            case 288452133:
                if (str2.equals("MobileAds#updateRequestConfiguration")) {
                    c7 = 17;
                    break;
                }
                break;
            case 316173893:
                if (str2.equals("MobileAds#disableMediationInitialization")) {
                    c7 = 18;
                    break;
                }
                break;
            case 1064076149:
                if (str2.equals("MobileAds#openAdInspector")) {
                    c7 = 19;
                    break;
                }
                break;
            case 1355848557:
                if (str2.equals("showAdWithoutView")) {
                    c7 = 20;
                    break;
                }
                break;
            case 1403601573:
                if (str2.equals("MobileAds#initialize")) {
                    c7 = 21;
                    break;
                }
                break;
            case 1661969852:
                if (str2.equals("setImmersiveMode")) {
                    c7 = 22;
                    break;
                }
                break;
            case 1882741923:
                if (str2.equals("loadRewardedInterstitialAd")) {
                    c7 = 23;
                    break;
                }
                break;
        }
        a aVar2 = null;
        switch (c7) {
            case 0:
                this.f17498m.f(f7, (String) jVar.a("adUnitId"));
                dVar.a(null);
                break;
            case 1:
                u uVar = new u(((Integer) jVar.a("adId")).intValue(), this.f17492g, (String) jVar.a("adUnitId"), (l) jVar.a("request"), new h(f7));
                this.f17492g.x(uVar, ((Integer) jVar.a("adId")).intValue());
                uVar.f();
                dVar.a(null);
                break;
            case 2:
                this.f17498m.g(((Boolean) jVar.a("muted")).booleanValue());
                dVar.a(null);
                break;
            case 3:
                p pVar = new p(((Integer) jVar.a("adId")).intValue(), ((Integer) jVar.a("orientation")).intValue(), (io.flutter.plugins.googlemobileads.a) g(this.f17492g), (String) g((String) jVar.a("adUnitId")), (l) jVar.a("request"), (i) jVar.a("adManagerRequest"), new h(f7));
                this.f17492g.x(pVar, ((Integer) jVar.a("adId")).intValue());
                pVar.i();
                dVar.a(null);
                break;
            case 4:
                String str3 = (String) g((String) jVar.a("adUnitId"));
                l lVar = (l) jVar.a("request");
                i iVar = (i) jVar.a("adManagerRequest");
                e0 e0Var = (e0) jVar.a("serverSideVerificationOptions");
                if (lVar == null) {
                    if (iVar != null) {
                        c0Var = new c0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) g(this.f17492g), str3, iVar, e0Var, new h(f7));
                    }
                    dVar.b("InvalidRequest", "A null or invalid ad request was provided.", null);
                    break;
                } else {
                    c0Var = new c0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) g(this.f17492g), str3, lVar, e0Var, new h(f7));
                }
                this.f17492g.x(c0Var, ((Integer) g((Integer) jVar.a("adId"))).intValue());
                c0Var.f();
                dVar.a(null);
                break;
            case 5:
                b7 = this.f17498m.b();
                dVar.a(b7);
                break;
            case 6:
                d dVar2 = new d(((Integer) jVar.a("adId")).intValue(), this.f17492g, (String) jVar.a("adUnitId"), (i) jVar.a("request"), d(f7));
                this.f17492g.x(dVar2, ((Integer) jVar.a("adId")).intValue());
                dVar2.e();
                dVar.a(null);
                break;
            case w0.f2149o /* 7 */:
                String str4 = (String) jVar.a("factoryId");
                c cVar = this.f17496k.get(str4);
                if (cVar != null) {
                    w a7 = new w.a().h(this.f17492g).d((String) jVar.a("adUnitId")).b(cVar).j((l) jVar.a("request")).c((i) jVar.a("adManagerRequest")).e((Map) jVar.a("customOptions")).g(((Integer) jVar.a("adId")).intValue()).i((z) jVar.a("nativeAdOptions")).f(new h(f7)).a();
                    this.f17492g.x(a7, ((Integer) jVar.a("adId")).intValue());
                    a7.d();
                    dVar.a(null);
                    break;
                } else {
                    format = String.format("Can't find NativeAdFactory with id: %s", str4);
                    str = "NativeAdError";
                    dVar.b(str, format, null);
                    break;
                }
            case w0.f2150p /* 8 */:
                m.b bVar = new m.b(f7, new m.a(), (String) jVar.a("orientation"), ((Integer) jVar.a("width")).intValue());
                if (!r2.h.f21150q.equals(bVar.f17541a)) {
                    b7 = Integer.valueOf(bVar.f17543c);
                    dVar.a(b7);
                    break;
                }
                dVar.a(null);
                break;
            case '\t':
                k kVar = new k(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) g(this.f17492g), (String) g((String) jVar.a("adUnitId")), (i) jVar.a("request"), new h(f7));
                this.f17492g.x(kVar, ((Integer) g((Integer) jVar.a("adId"))).intValue());
                kVar.f();
                dVar.a(null);
                break;
            case '\n':
                q qVar = new q(((Integer) jVar.a("adId")).intValue(), this.f17492g, (String) jVar.a("adUnitId"), (l) jVar.a("request"), (m) jVar.a("size"), d(f7));
                this.f17492g.x(qVar, ((Integer) jVar.a("adId")).intValue());
                qVar.e();
                dVar.a(null);
                break;
            case 11:
                this.f17498m.h(((Double) jVar.a("volume")).doubleValue());
                dVar.a(null);
                break;
            case '\f':
                b7 = this.f17498m.c();
                dVar.a(b7);
                break;
            case '\r':
                j jVar2 = new j(((Integer) jVar.a("adId")).intValue(), this.f17492g, (String) jVar.a("adUnitId"), (List) jVar.a("sizes"), (i) jVar.a("request"), d(f7));
                this.f17492g.x(jVar2, ((Integer) jVar.a("adId")).intValue());
                jVar2.e();
                dVar.a(null);
                break;
            case 14:
                this.f17492g.e();
                dVar.a(null);
                break;
            case 15:
                this.f17492g.d(((Integer) jVar.a("adId")).intValue());
                dVar.a(null);
                break;
            case 16:
                e b8 = this.f17492g.b(((Integer) jVar.a("adId")).intValue());
                if (b8 != null) {
                    if (!(b8 instanceof q)) {
                        if (!(b8 instanceof j)) {
                            format = "Unexpected ad type for getAdSize: " + b8;
                            str = "unexpected_ad_type";
                            dVar.b(str, format, null);
                            break;
                        } else {
                            b7 = ((j) b8).d();
                        }
                    } else {
                        b7 = ((q) b8).d();
                    }
                    dVar.a(b7);
                    break;
                }
                dVar.a(null);
                break;
            case 17:
                u.a e7 = r2.p.b().e();
                String str5 = (String) jVar.a("maxAdContentRating");
                Integer num = (Integer) jVar.a("tagForChildDirectedTreatment");
                Integer num2 = (Integer) jVar.a("tagForUnderAgeOfConsent");
                List<String> list = (List) jVar.a("testDeviceIds");
                if (str5 != null) {
                    e7.b(str5);
                }
                if (num != null) {
                    e7.c(num.intValue());
                }
                if (num2 != null) {
                    e7.d(num2.intValue());
                }
                if (list != null) {
                    e7.e(list);
                }
                r2.p.i(e7.a());
                dVar.a(null);
                break;
            case 18:
                this.f17498m.a(f7);
                dVar.a(null);
                break;
            case 19:
                this.f17498m.e(f7, new a(dVar));
                break;
            case 20:
                if (!this.f17492g.w(((Integer) jVar.a("adId")).intValue())) {
                    dVar.b("AdShowError", "Ad failed to show.", null);
                    break;
                }
                dVar.a(null);
                break;
            case 21:
                this.f17498m.d(f7, new b(dVar, aVar2));
                break;
            case 22:
                ((e.d) this.f17492g.b(((Integer) jVar.a("adId")).intValue())).d(((Boolean) jVar.a("immersiveModeEnabled")).booleanValue());
                dVar.a(null);
                break;
            case 23:
                String str6 = (String) g((String) jVar.a("adUnitId"));
                l lVar2 = (l) jVar.a("request");
                i iVar2 = (i) jVar.a("adManagerRequest");
                e0 e0Var2 = (e0) jVar.a("serverSideVerificationOptions");
                if (lVar2 == null) {
                    if (iVar2 != null) {
                        d0Var = new d0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) g(this.f17492g), str6, iVar2, e0Var2, new h(f7));
                    }
                    dVar.b("InvalidRequest", "A null or invalid ad request was provided.", null);
                    break;
                } else {
                    d0Var = new d0(((Integer) jVar.a("adId")).intValue(), (io.flutter.plugins.googlemobileads.a) g(this.f17492g), str6, lVar2, e0Var2, new h(f7));
                }
                this.f17492g.x(d0Var, ((Integer) g((Integer) jVar.a("adId"))).intValue());
                d0Var.f();
                dVar.a(null);
                break;
            default:
                dVar.c();
                break;
        }
    }

    @Override // f5.a
    public void a(f5.c cVar) {
        io.flutter.plugins.googlemobileads.a aVar = this.f17492g;
        if (aVar != null) {
            aVar.v(cVar.d());
        }
        io.flutter.plugins.googlemobileads.b bVar = this.f17493h;
        if (bVar != null) {
            bVar.r(cVar.d());
        }
        p5.d dVar = this.f17495j;
        if (dVar != null) {
            dVar.c(cVar.d());
        }
    }

    @Override // f5.a
    public void b(f5.c cVar) {
        io.flutter.plugins.googlemobileads.a aVar = this.f17492g;
        if (aVar != null) {
            aVar.v(cVar.d());
        }
        io.flutter.plugins.googlemobileads.b bVar = this.f17493h;
        if (bVar != null) {
            bVar.r(cVar.d());
        }
        p5.d dVar = this.f17495j;
        if (dVar != null) {
            dVar.c(cVar.d());
        }
    }

    @Override // f5.a
    public void c() {
        a.b bVar;
        io.flutter.plugins.googlemobileads.b bVar2 = this.f17493h;
        if (bVar2 != null && (bVar = this.f17491f) != null) {
            bVar2.r(bVar.a());
        }
        io.flutter.plugins.googlemobileads.a aVar = this.f17492g;
        if (aVar != null) {
            aVar.v(null);
        }
        p5.d dVar = this.f17495j;
        if (dVar != null) {
            dVar.c(null);
        }
    }

    io.flutter.plugins.googlemobileads.c d(Context context) {
        return new io.flutter.plugins.googlemobileads.c(context);
    }

    @Override // f5.a
    public void e() {
        a.b bVar;
        io.flutter.plugins.googlemobileads.b bVar2 = this.f17493h;
        if (bVar2 != null && (bVar = this.f17491f) != null) {
            bVar2.r(bVar.a());
        }
        io.flutter.plugins.googlemobileads.a aVar = this.f17492g;
        if (aVar != null) {
            aVar.v(null);
        }
        p5.d dVar = this.f17495j;
        if (dVar != null) {
            dVar.c(null);
        }
    }

    @Override // e5.a
    public void f(a.b bVar) {
        this.f17491f = bVar;
        io.flutter.plugins.googlemobileads.b bVar2 = new io.flutter.plugins.googlemobileads.b(bVar.a());
        this.f17493h = bVar2;
        i0 i0Var = this.f17497l;
        if (i0Var != null) {
            bVar2.s(i0Var);
        }
        m5.k kVar = new m5.k(bVar.b(), "plugins.flutter.io/google_mobile_ads", new m5.r(this.f17493h));
        kVar.e(this);
        this.f17492g = new io.flutter.plugins.googlemobileads.a(kVar);
        bVar.e().a("plugins.flutter.io/google_mobile_ads/ad_widget", new h0(this.f17492g));
        this.f17494i = new AppStateNotifier(bVar.b());
        this.f17495j = new p5.d(bVar.b(), bVar.a());
    }

    @Override // e5.a
    public void i(a.b bVar) {
        AppStateNotifier appStateNotifier = this.f17494i;
        if (appStateNotifier != null) {
            appStateNotifier.k();
            this.f17494i = null;
        }
    }
}
