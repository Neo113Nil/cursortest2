package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class c0 extends e.d {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.plugins.googlemobileads.a f17446b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17447c;

    /* renamed from: d, reason: collision with root package name */
    private final h f17448d;

    /* renamed from: e, reason: collision with root package name */
    private final l f17449e;

    /* renamed from: f, reason: collision with root package name */
    private final i f17450f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f17451g;

    /* renamed from: h, reason: collision with root package name */
    i3.c f17452h;

    private static final class a extends i3.d implements i3.a, r2.s {

        /* renamed from: f, reason: collision with root package name */
        private final WeakReference<c0> f17453f;

        a(c0 c0Var) {
            this.f17453f = new WeakReference<>(c0Var);
        }

        @Override // i3.a
        public void a() {
            if (this.f17453f.get() != null) {
                this.f17453f.get().i();
            }
        }

        @Override // r2.s
        public void b(i3.b bVar) {
            if (this.f17453f.get() != null) {
                this.f17453f.get().j(bVar);
            }
        }

        @Override // r2.e
        public void c(r2.n nVar) {
            if (this.f17453f.get() != null) {
                this.f17453f.get().g(nVar);
            }
        }

        @Override // r2.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(i3.c cVar) {
            if (this.f17453f.get() != null) {
                this.f17453f.get().h(cVar);
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final Integer f17454a;

        /* renamed from: b, reason: collision with root package name */
        final String f17455b;

        b(Integer num, String str) {
            this.f17454a = num;
            this.f17455b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f17454a.equals(bVar.f17454a)) {
                return this.f17455b.equals(bVar.f17455b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f17454a.hashCode() * 31) + this.f17455b.hashCode();
        }
    }

    public c0(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, e0 e0Var, h hVar) {
        super(i7);
        this.f17446b = aVar;
        this.f17447c = str;
        this.f17450f = iVar;
        this.f17449e = null;
        this.f17451g = e0Var;
        this.f17448d = hVar;
    }

    public c0(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, l lVar, e0 e0Var, h hVar) {
        super(i7);
        this.f17446b = aVar;
        this.f17447c = str;
        this.f17449e = lVar;
        this.f17450f = null;
        this.f17451g = e0Var;
        this.f17448d = hVar;
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        this.f17452h = null;
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void d(boolean z6) {
        i3.c cVar = this.f17452h;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.e(z6);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e.d
    public void e() {
        if (this.f17452h == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else {
            if (this.f17446b.f() == null) {
                Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
                return;
            }
            this.f17452h.d(new s(this.f17446b, this.f17467a));
            this.f17452h.f(new a(this));
            this.f17452h.i(this.f17446b.f(), new a(this));
        }
    }

    void f() {
        a aVar = new a(this);
        l lVar = this.f17449e;
        if (lVar != null) {
            h hVar = this.f17448d;
            String str = this.f17447c;
            hVar.i(str, lVar.b(str), aVar);
            return;
        }
        i iVar = this.f17450f;
        if (iVar == null) {
            Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
            return;
        }
        h hVar2 = this.f17448d;
        String str2 = this.f17447c;
        hVar2.d(str2, iVar.k(str2), aVar);
    }

    void g(r2.n nVar) {
        this.f17446b.k(this.f17467a, new e.c(nVar));
    }

    void h(i3.c cVar) {
        this.f17452h = cVar;
        e0 e0Var = this.f17451g;
        if (e0Var != null) {
            cVar.h(e0Var.a());
        }
        cVar.g(new a0(this.f17446b, this));
        this.f17446b.m(this.f17467a, cVar.a());
    }

    void i() {
        this.f17446b.n(this.f17467a);
    }

    void j(i3.b bVar) {
        this.f17446b.u(this.f17467a, new b(Integer.valueOf(bVar.a()), bVar.getType()));
    }
}
