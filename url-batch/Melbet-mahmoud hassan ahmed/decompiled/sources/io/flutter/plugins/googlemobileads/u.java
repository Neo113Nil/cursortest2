package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class u extends e.d {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17575b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17576c;

    /* renamed from: d, reason: collision with root package name */
    private final l f17577d;

    /* renamed from: e, reason: collision with root package name */
    private b3.a f17578e;

    /* renamed from: f, reason: collision with root package name */
    private final h f17579f;

    private static final class a extends b3.b {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<u> f17580a;

        a(u uVar) {
            this.f17580a = new WeakReference<>(uVar);
        }

        @Override // r2.e
        public void c(r2.n nVar) {
            if (this.f17580a.get() != null) {
                this.f17580a.get().g(nVar);
            }
        }

        @Override // r2.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(b3.a aVar) {
            if (this.f17580a.get() != null) {
                this.f17580a.get().h(aVar);
            }
        }
    }

    public u(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, h hVar) {
        super(i7);
        this.f17575b = aVar;
        this.f17576c = str;
        this.f17577d = lVar;
        this.f17579f = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f17578e = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z6) {
        b3.a aVar = this.f17578e;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.d(z6);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f17578e == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.f17575b.f() == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f17578e.c(new s(this.f17575b, this.f17467a));
            this.f17578e.f(this.f17575b.f());
        }
    }

    void f() {
        String str;
        l lVar;
        if (this.f17575b == null || (str = this.f17576c) == null || (lVar = this.f17577d) == null) {
            return;
        }
        this.f17579f.g(str, lVar.b(str), new a(this));
    }

    void g(r2.n nVar) {
        this.f17575b.k(this.f17467a, new e.c(nVar));
    }

    void h(b3.a aVar) {
        this.f17578e = aVar;
        aVar.e(new a0(this.f17575b, this));
        this.f17575b.m(this.f17467a, aVar.a());
    }
}
