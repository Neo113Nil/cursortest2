package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.c0;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class d0 extends e.d {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17459b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17460c;

    /* renamed from: d, reason: collision with root package name */
    private final h f17461d;

    /* renamed from: e, reason: collision with root package name */
    private final l f17462e;

    /* renamed from: f, reason: collision with root package name */
    private final i f17463f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f17464g;

    /* renamed from: h, reason: collision with root package name */
    j3.a f17465h;

    private static final class a extends j3.b implements i3.a, r2.s {

        /* renamed from: f, reason: collision with root package name */
        private final WeakReference<d0> f17466f;

        a(d0 d0Var) {
            this.f17466f = new WeakReference<>(d0Var);
        }

        @Override // i3.a
        public void a() {
            if (this.f17466f.get() != null) {
                this.f17466f.get().i();
            }
        }

        @Override // r2.s
        public void b(i3.b bVar) {
            if (this.f17466f.get() != null) {
                this.f17466f.get().j(bVar);
            }
        }

        @Override // r2.e
        public void c(r2.n nVar) {
            if (this.f17466f.get() != null) {
                this.f17466f.get().g(nVar);
            }
        }

        @Override // r2.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(j3.a aVar) {
            if (this.f17466f.get() != null) {
                this.f17466f.get().h(aVar);
            }
        }
    }

    public d0(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, e0 e0Var, h hVar) {
        super(i7);
        this.f17459b = aVar;
        this.f17460c = str;
        this.f17463f = iVar;
        this.f17462e = null;
        this.f17464g = e0Var;
        this.f17461d = hVar;
    }

    public d0(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, e0 e0Var, h hVar) {
        super(i7);
        this.f17459b = aVar;
        this.f17460c = str;
        this.f17462e = lVar;
        this.f17463f = null;
        this.f17464g = e0Var;
        this.f17461d = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f17465h = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z6) {
        j3.a aVar = this.f17465h;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.e(z6);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f17465h == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            if (this.f17459b.f() == null) {
                Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
                return;
            }
            this.f17465h.d(new s(this.f17459b, this.f17467a));
            this.f17465h.f(new a(this));
            this.f17465h.i(this.f17459b.f(), new a(this));
        }
    }

    void f() {
        a aVar = new a(this);
        l lVar = this.f17462e;
        if (lVar != null) {
            h hVar = this.f17461d;
            String str = this.f17460c;
            hVar.j(str, lVar.b(str), aVar);
            return;
        }
        i iVar = this.f17463f;
        if (iVar == null) {
            Log.e("FlutterRIAd", "A null or invalid ad request was provided.");
            return;
        }
        h hVar2 = this.f17461d;
        String str2 = this.f17460c;
        hVar2.e(str2, iVar.k(str2), aVar);
    }

    void g(r2.n nVar) {
        this.f17459b.k(this.f17467a, new e.c(nVar));
    }

    void h(j3.a aVar) {
        this.f17465h = aVar;
        e0 e0Var = this.f17464g;
        if (e0Var != null) {
            aVar.h(e0Var.a());
        }
        aVar.g(new a0(this.f17459b, this));
        this.f17459b.m(this.f17467a, aVar.a());
    }

    void i() {
        this.f17459b.n(this.f17467a);
    }

    void j(i3.b bVar) {
        this.f17459b.u(this.f17467a, new c0.b(Integer.valueOf(bVar.a()), bVar.getType()));
    }
}
