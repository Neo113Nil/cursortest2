package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class k extends e.d {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17519b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17520c;

    /* renamed from: d, reason: collision with root package name */
    private final i f17521d;

    /* renamed from: e, reason: collision with root package name */
    private s2.c f17522e;

    /* renamed from: f, reason: collision with root package name */
    private final h f17523f;

    private static final class a extends s2.d implements s2.e {

        /* renamed from: f, reason: collision with root package name */
        private final WeakReference<k> f17524f;

        a(k kVar) {
            this.f17524f = new WeakReference<>(kVar);
        }

        @Override // r2.e
        public void c(r2.n nVar) {
            if (this.f17524f.get() != null) {
                this.f17524f.get().g(nVar);
            }
        }

        @Override // s2.e
        public void d(String str, String str2) {
            if (this.f17524f.get() != null) {
                this.f17524f.get().i(str, str2);
            }
        }

        @Override // r2.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(s2.c cVar) {
            if (this.f17524f.get() != null) {
                this.f17524f.get().h(cVar);
            }
        }
    }

    public k(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, h hVar) {
        super(i7);
        this.f17519b = aVar;
        this.f17520c = str;
        this.f17521d = iVar;
        this.f17523f = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f17522e = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z6) {
        s2.c cVar = this.f17522e;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.d(z6);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f17522e == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else if (this.f17519b.f() == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f17522e.c(new s(this.f17519b, this.f17467a));
            this.f17522e.f(this.f17519b.f());
        }
    }

    void f() {
        h hVar = this.f17523f;
        String str = this.f17520c;
        hVar.b(str, this.f17521d.k(str), new a(this));
    }

    void g(r2.n nVar) {
        this.f17519b.k(this.f17467a, new e.c(nVar));
    }

    void h(s2.c cVar) {
        this.f17522e = cVar;
        cVar.h(new a(this));
        cVar.e(new a0(this.f17519b, this));
        this.f17519b.m(this.f17467a, cVar.a());
    }

    void i(String str, String str2) {
        this.f17519b.q(this.f17467a, str, str2);
    }
}
