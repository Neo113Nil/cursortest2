package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;
import t2.a;

/* loaded from: classes.dex */
class p extends e.d {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17557b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17558c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17559d;

    /* renamed from: e, reason: collision with root package name */
    private final l f17560e;

    /* renamed from: f, reason: collision with root package name */
    private final i f17561f;

    /* renamed from: g, reason: collision with root package name */
    private t2.a f17562g;

    /* renamed from: h, reason: collision with root package name */
    private final h f17563h;

    private static final class a extends a.AbstractC0140a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<p> f17564a;

        a(p pVar) {
            this.f17564a = new WeakReference<>(pVar);
        }

        @Override // r2.e
        public void c(r2.n nVar) {
            if (this.f17564a.get() != null) {
                this.f17564a.get().j(nVar);
            }
        }

        @Override // r2.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(t2.a aVar) {
            if (this.f17564a.get() != null) {
                this.f17564a.get().k(aVar);
            }
        }
    }

    p(int i7, int i8, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, i iVar, h hVar) {
        super(i7);
        u5.c.b((lVar == null && iVar == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.f17557b = aVar;
        this.f17559d = i8;
        this.f17558c = str;
        this.f17560e = lVar;
        this.f17561f = iVar;
        this.f17563h = hVar;
    }

    private int h() {
        int i7 = this.f17559d;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        Log.e("FlutterAppOpenAd", "Passed unknown app open orientation: " + this.f17559d);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(r2.n nVar) {
        this.f17557b.k(this.f17467a, new e.c(nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(t2.a aVar) {
        this.f17562g = aVar;
        aVar.f(new a0(this.f17557b, this));
        this.f17557b.m(this.f17467a, aVar.a());
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f17562g = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    void d(boolean z6) {
        t2.a aVar = this.f17562g;
        if (aVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.e(z6);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    void e() {
        if (this.f17562g == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
        } else if (this.f17557b.f() == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f17562g.d(new s(this.f17557b, this.f17467a));
            this.f17562g.g(this.f17557b.f());
        }
    }

    void i() {
        l lVar = this.f17560e;
        if (lVar != null) {
            h hVar = this.f17563h;
            String str = this.f17558c;
            hVar.f(str, lVar.b(str), h(), new a(this));
        } else {
            i iVar = this.f17561f;
            if (iVar != null) {
                h hVar2 = this.f17563h;
                String str2 = this.f17558c;
                hVar2.a(str2, iVar.k(str2), h(), new a(this));
            }
        }
    }
}
