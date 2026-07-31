package t5;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import io.flutter.view.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m5.d;
import n2.l;
import n2.t;
import n2.u;
import o2.m0;
import p2.z;
import r0.a2;
import r0.f2;
import r0.r2;
import r0.r3;
import r0.s1;
import r0.t;
import r0.u2;
import r0.v2;
import r0.w3;
import r0.x2;
import t0.e;
import t1.l0;
import t1.x;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private r0.t f22360a;

    /* renamed from: b, reason: collision with root package name */
    private Surface f22361b;

    /* renamed from: c, reason: collision with root package name */
    private final d.c f22362c;

    /* renamed from: d, reason: collision with root package name */
    private o f22363d;

    /* renamed from: e, reason: collision with root package name */
    private final m5.d f22364e;

    /* renamed from: f, reason: collision with root package name */
    boolean f22365f = false;

    /* renamed from: g, reason: collision with root package name */
    private final q f22366g;

    class a implements d.InterfaceC0108d {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f22367f;

        a(o oVar) {
            this.f22367f = oVar;
        }

        @Override // m5.d.InterfaceC0108d
        public void g(Object obj) {
            this.f22367f.f(null);
        }

        @Override // m5.d.InterfaceC0108d
        public void h(Object obj, d.b bVar) {
            this.f22367f.f(bVar);
        }
    }

    class b implements v2.d {

        /* renamed from: f, reason: collision with root package name */
        private boolean f22369f = false;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f22370g;

        b(o oVar) {
            this.f22370g = oVar;
        }

        @Override // r0.v2.d
        public /* synthetic */ void A(boolean z6, int i7) {
            x2.r(this, z6, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void B(w3 w3Var) {
            x2.B(this, w3Var);
        }

        public void C(boolean z6) {
            if (this.f22369f != z6) {
                this.f22369f = z6;
                HashMap hashMap = new HashMap();
                hashMap.put("event", this.f22369f ? "bufferingStart" : "bufferingEnd");
                this.f22370g.a(hashMap);
            }
        }

        @Override // r0.v2.d
        public /* synthetic */ void E(boolean z6) {
            x2.j(this, z6);
        }

        @Override // r0.v2.d
        public /* synthetic */ void F(int i7) {
            x2.s(this, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void G(v2 v2Var, v2.c cVar) {
            x2.g(this, v2Var, cVar);
        }

        @Override // r0.v2.d
        public /* synthetic */ void H(v2.e eVar, v2.e eVar2, int i7) {
            x2.t(this, eVar, eVar2, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void K(boolean z6) {
            x2.h(this, z6);
        }

        @Override // r0.v2.d
        public /* synthetic */ void L() {
            x2.u(this);
        }

        @Override // r0.v2.d
        public /* synthetic */ void M() {
            x2.w(this);
        }

        @Override // r0.v2.d
        public /* synthetic */ void R(float f7) {
            x2.D(this, f7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void T(v2.b bVar) {
            x2.b(this, bVar);
        }

        @Override // r0.v2.d
        public void V(int i7) {
            if (i7 == 2) {
                C(true);
                p.this.h();
            } else if (i7 == 3) {
                p pVar = p.this;
                if (!pVar.f22365f) {
                    pVar.f22365f = true;
                    pVar.i();
                }
            } else if (i7 == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "completed");
                this.f22370g.a(hashMap);
            }
            if (i7 != 2) {
                C(false);
            }
        }

        @Override // r0.v2.d
        public /* synthetic */ void W(boolean z6, int i7) {
            x2.n(this, z6, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void a0(boolean z6) {
            x2.x(this, z6);
        }

        @Override // r0.v2.d
        public /* synthetic */ void b(boolean z6) {
            x2.y(this, z6);
        }

        @Override // r0.v2.d
        public /* synthetic */ void b0(r3 r3Var, int i7) {
            x2.A(this, r3Var, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void c0(int i7, int i8) {
            x2.z(this, i7, i8);
        }

        @Override // r0.v2.d
        public /* synthetic */ void e0(f2 f2Var) {
            x2.l(this, f2Var);
        }

        @Override // r0.v2.d
        public /* synthetic */ void f0(t0.e eVar) {
            x2.a(this, eVar);
        }

        @Override // r0.v2.d
        public /* synthetic */ void i(List list) {
            x2.d(this, list);
        }

        @Override // r0.v2.d
        public void i0(r2 r2Var) {
            C(false);
            o oVar = this.f22370g;
            if (oVar != null) {
                oVar.b("VideoError", "Video player had error " + r2Var, null);
            }
        }

        @Override // r0.v2.d
        public /* synthetic */ void j(u2 u2Var) {
            x2.o(this, u2Var);
        }

        @Override // r0.v2.d
        public /* synthetic */ void j0(r0.p pVar) {
            x2.e(this, pVar);
        }

        @Override // r0.v2.d
        public /* synthetic */ void l0(r2 r2Var) {
            x2.q(this, r2Var);
        }

        @Override // r0.v2.d
        public /* synthetic */ void m0(int i7, boolean z6) {
            x2.f(this, i7, z6);
        }

        @Override // r0.v2.d
        public /* synthetic */ void n0(int i7) {
            x2.v(this, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void o0(a2 a2Var, int i7) {
            x2.k(this, a2Var, i7);
        }

        @Override // r0.v2.d
        public /* synthetic */ void p0(boolean z6) {
            x2.i(this, z6);
        }

        @Override // r0.v2.d
        public /* synthetic */ void r(z zVar) {
            x2.C(this, zVar);
        }

        @Override // r0.v2.d
        public /* synthetic */ void s(c2.e eVar) {
            x2.c(this, eVar);
        }

        @Override // r0.v2.d
        public /* synthetic */ void u(j1.a aVar) {
            x2.m(this, aVar);
        }

        @Override // r0.v2.d
        public /* synthetic */ void z(int i7) {
            x2.p(this, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    p(Context context, m5.d dVar, d.c cVar, String str, String str2, Map<String, String> map, q qVar) {
        t.a aVar;
        this.f22364e = dVar;
        this.f22362c = cVar;
        this.f22366g = qVar;
        r0.t g7 = new t.b(context).g();
        Uri parse = Uri.parse(str);
        if (d(parse)) {
            u.b c7 = new u.b().e("ExoPlayer").c(true);
            aVar = c7;
            if (map != null) {
                aVar = c7;
                if (!map.isEmpty()) {
                    c7.d(map);
                    aVar = c7;
                }
            }
        } else {
            aVar = new t.a(context);
        }
        g7.M(a(parse, aVar, str2, context));
        g7.W();
        m(g7, new o());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private x a(Uri uri, l.a aVar, String str, Context context) {
        char c7;
        int i7 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case 3680:
                    if (str.equals("ss")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 103407:
                    if (str.equals("hls")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3075986:
                    if (str.equals("dash")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    i7 = 1;
                    break;
                case 1:
                    i7 = 2;
                    break;
                case 2:
                    break;
                case 3:
                    i7 = 4;
                    break;
                default:
                    i7 = -1;
                    break;
            }
        } else {
            i7 = m0.n0(uri);
        }
        if (i7 == 0) {
            return new DashMediaSource.Factory(new c.a(aVar), new t.a(context, aVar)).a(a2.d(uri));
        }
        if (i7 == 1) {
            return new SsMediaSource.Factory(new a.C0046a(aVar), new t.a(context, aVar)).a(a2.d(uri));
        }
        if (i7 == 2) {
            return new HlsMediaSource.Factory(aVar).a(a2.d(uri));
        }
        if (i7 == 4) {
            return new l0.b(aVar).b(a2.d(uri));
        }
        throw new IllegalStateException("Unsupported type: " + i7);
    }

    private static boolean d(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("https");
    }

    private static void j(r0.t tVar, boolean z6) {
        tVar.F(new e.C0138e().c(3).a(), !z6);
    }

    private void m(r0.t tVar, o oVar) {
        this.f22360a = tVar;
        this.f22363d = oVar;
        this.f22364e.d(new a(oVar));
        Surface surface = new Surface(this.f22362c.d());
        this.f22361b = surface;
        tVar.j(surface);
        j(tVar, this.f22366g.f22372a);
        tVar.u(new b(oVar));
    }

    void b() {
        if (this.f22365f) {
            this.f22360a.B();
        }
        this.f22362c.a();
        this.f22364e.d(null);
        Surface surface = this.f22361b;
        if (surface != null) {
            surface.release();
        }
        r0.t tVar = this.f22360a;
        if (tVar != null) {
            tVar.a();
        }
    }

    long c() {
        return this.f22360a.N();
    }

    void e() {
        this.f22360a.i(false);
    }

    void f() {
        this.f22360a.i(true);
    }

    void g(int i7) {
        this.f22360a.I0(i7);
    }

    void h() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(this.f22360a.o()))));
        this.f22363d.a(hashMap);
    }

    void i() {
        if (this.f22365f) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.f22360a.H()));
            if (this.f22360a.t() != null) {
                s1 t6 = this.f22360a.t();
                int i7 = t6.f20961v;
                int i8 = t6.f20962w;
                int i9 = t6.f20964y;
                if (i9 == 90 || i9 == 270) {
                    i7 = this.f22360a.t().f20962w;
                    i8 = this.f22360a.t().f20961v;
                }
                hashMap.put("width", Integer.valueOf(i7));
                hashMap.put("height", Integer.valueOf(i8));
                if (i9 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i9));
                }
            }
            this.f22363d.a(hashMap);
        }
    }

    void k(boolean z6) {
        this.f22360a.X(z6 ? 2 : 0);
    }

    void l(double d7) {
        this.f22360a.e(new u2((float) d7));
    }

    void n(double d7) {
        this.f22360a.g((float) Math.max(0.0d, Math.min(1.0d, d7)));
    }
}
