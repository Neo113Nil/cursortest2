package p5;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import k4.b;
import k4.c;
import k4.d;
import k4.f;
import m5.j;
import m5.k;
import m5.r;

/* loaded from: classes.dex */
public class d implements k.c {

    /* renamed from: f, reason: collision with root package name */
    private final p5.c f20138f;

    /* renamed from: g, reason: collision with root package name */
    private final k f20139g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f20140h;

    /* renamed from: i, reason: collision with root package name */
    private k4.c f20141i;

    /* renamed from: j, reason: collision with root package name */
    private Activity f20142j;

    class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f20143a;

        a(k.d dVar) {
            this.f20143a = dVar;
        }

        @Override // k4.c.b
        public void a() {
            this.f20143a.a(null);
        }
    }

    class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f20145a;

        b(k.d dVar) {
            this.f20145a = dVar;
        }

        @Override // k4.c.a
        public void a(k4.e eVar) {
            this.f20145a.b(Integer.toString(eVar.a()), eVar.b(), null);
        }
    }

    class c implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f20147a;

        c(k.d dVar) {
            this.f20147a = dVar;
        }

        @Override // k4.f.b
        public void a(k4.b bVar) {
            d.this.f20138f.s(bVar);
            this.f20147a.a(bVar);
        }
    }

    /* renamed from: p5.d$d, reason: collision with other inner class name */
    class C0123d implements f.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f20149a;

        C0123d(k.d dVar) {
            this.f20149a = dVar;
        }

        @Override // k4.f.a
        public void b(k4.e eVar) {
            this.f20149a.b(Integer.toString(eVar.a()), eVar.b(), null);
        }
    }

    class e implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f20151a;

        e(k.d dVar) {
            this.f20151a = dVar;
        }

        @Override // k4.b.a
        public void a(k4.e eVar) {
            if (eVar != null) {
                this.f20151a.b(Integer.toString(eVar.a()), eVar.b(), null);
            } else {
                this.f20151a.a(null);
            }
        }
    }

    public d(m5.c cVar, Context context) {
        p5.c cVar2 = new p5.c();
        this.f20138f = cVar2;
        k kVar = new k(cVar, "plugins.flutter.io/google_mobile_ads/ump", new r(cVar2));
        this.f20139g = kVar;
        kVar.e(this);
        this.f20140h = context;
    }

    private k4.c b() {
        k4.c cVar = this.f20141i;
        if (cVar != null) {
            return cVar;
        }
        k4.c a7 = f.a(this.f20140h);
        this.f20141i = a7;
        return a7;
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        Object valueOf;
        String str = jVar.f19247a;
        str.hashCode();
        switch (str) {
            case "ConsentInformation#reset":
                b().a();
                dVar.a(null);
                return;
            case "ConsentInformation#requestConsentInfoUpdate":
                if (this.f20142j == null) {
                    dVar.b("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    return;
                } else {
                    p5.b bVar = (p5.b) jVar.a("params");
                    b().c(this.f20142j, bVar == null ? new d.a().a() : bVar.a(this.f20142j), new a(dVar), new b(dVar));
                    return;
                }
            case "ConsentForm#show":
                k4.b bVar2 = (k4.b) jVar.a("consentForm");
                if (bVar2 == null) {
                    dVar.b("0", "ConsentForm#show", null);
                    return;
                } else {
                    bVar2.a(this.f20142j, new e(dVar));
                    return;
                }
            case "ConsentForm#dispose":
                k4.b bVar3 = (k4.b) jVar.a("consentForm");
                if (bVar3 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.f20138f.r(bVar3);
                }
                dVar.a(null);
                return;
            case "ConsentInformation#isConsentFormAvailable":
                valueOf = Boolean.valueOf(b().b());
                break;
            case "UserMessagingPlatform#loadConsentForm":
                f.b(this.f20140h, new c(dVar), new C0123d(dVar));
                return;
            case "ConsentInformation#getConsentStatus":
                valueOf = Integer.valueOf(b().d());
                break;
            default:
                dVar.c();
                return;
        }
        dVar.a(valueOf);
    }

    public void c(Activity activity) {
        this.f20142j = activity;
    }
}
