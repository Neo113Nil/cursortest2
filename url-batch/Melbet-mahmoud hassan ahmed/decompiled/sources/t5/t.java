package t5;

import android.content.Context;
import android.os.Build;
import android.util.LongSparseArray;
import e5.a;
import io.flutter.view.d;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import t5.b;

/* loaded from: classes.dex */
public class t implements e5.a, b.InterfaceC0141b {

    /* renamed from: g, reason: collision with root package name */
    private a f22376g;

    /* renamed from: f, reason: collision with root package name */
    private final LongSparseArray<p> f22375f = new LongSparseArray<>();

    /* renamed from: h, reason: collision with root package name */
    private q f22377h = new q();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f22378a;

        /* renamed from: b, reason: collision with root package name */
        private final m5.c f22379b;

        /* renamed from: c, reason: collision with root package name */
        private final c f22380c;

        /* renamed from: d, reason: collision with root package name */
        private final b f22381d;

        /* renamed from: e, reason: collision with root package name */
        private final io.flutter.view.d f22382e;

        a(Context context, m5.c cVar, c cVar2, b bVar, io.flutter.view.d dVar) {
            this.f22378a = context;
            this.f22379b = cVar;
            this.f22380c = cVar2;
            this.f22381d = bVar;
            this.f22382e = dVar;
        }

        void f(t tVar, m5.c cVar) {
            n.x(cVar, tVar);
        }

        void g(m5.c cVar) {
            n.x(cVar, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        String a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface c {
        String a(String str);
    }

    private void n() {
        for (int i7 = 0; i7 < this.f22375f.size(); i7++) {
            this.f22375f.valueAt(i7).b();
        }
        this.f22375f.clear();
    }

    @Override // t5.b.InterfaceC0141b
    public void a() {
        n();
    }

    @Override // t5.b.InterfaceC0141b
    public void b(b.h hVar) {
        this.f22375f.get(hVar.c().longValue()).g(hVar.b().intValue());
    }

    @Override // t5.b.InterfaceC0141b
    public void c(b.i iVar) {
        this.f22375f.get(iVar.b().longValue()).b();
        this.f22375f.remove(iVar.b().longValue());
    }

    @Override // t5.b.InterfaceC0141b
    public void d(b.e eVar) {
        this.f22375f.get(eVar.c().longValue()).k(eVar.b().booleanValue());
    }

    @Override // t5.b.InterfaceC0141b
    public b.h e(b.i iVar) {
        p pVar = this.f22375f.get(iVar.b().longValue());
        b.h a7 = new b.h.a().b(Long.valueOf(pVar.c())).c(iVar.b()).a();
        pVar.h();
        return a7;
    }

    @Override // e5.a
    public void f(a.b bVar) {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(new t5.a());
            } catch (KeyManagementException | NoSuchAlgorithmException e7) {
                z4.b.g("VideoPlayerPlugin", "Failed to enable TLSv1.1 and TLSv1.2 Protocols for API level 19 and below.\nFor more information about Socket Security, please consult the following link:\nhttps://developer.android.com/reference/javax/net/ssl/SSLSocket", e7);
            }
        }
        z4.a e8 = z4.a.e();
        Context a7 = bVar.a();
        m5.c b7 = bVar.b();
        final c5.d c7 = e8.c();
        Objects.requireNonNull(c7);
        c cVar = new c() { // from class: t5.s
            @Override // t5.t.c
            public final String a(String str) {
                return c5.d.this.h(str);
            }
        };
        final c5.d c8 = e8.c();
        Objects.requireNonNull(c8);
        a aVar = new a(a7, b7, cVar, new b() { // from class: t5.r
            @Override // t5.t.b
            public final String a(String str, String str2) {
                return c5.d.this.i(str, str2);
            }
        }, bVar.f());
        this.f22376g = aVar;
        aVar.f(this, bVar.b());
    }

    @Override // t5.b.InterfaceC0141b
    public void g(b.j jVar) {
        this.f22375f.get(jVar.b().longValue()).n(jVar.c().doubleValue());
    }

    @Override // t5.b.InterfaceC0141b
    public void h(b.f fVar) {
        this.f22377h.f22372a = fVar.b().booleanValue();
    }

    @Override // e5.a
    public void i(a.b bVar) {
        if (this.f22376g == null) {
            z4.b.h("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f22376g.g(bVar.b());
        this.f22376g = null;
        a();
    }

    @Override // t5.b.InterfaceC0141b
    public void j(b.g gVar) {
        this.f22375f.get(gVar.c().longValue()).l(gVar.b().doubleValue());
    }

    @Override // t5.b.InterfaceC0141b
    public void k(b.i iVar) {
        this.f22375f.get(iVar.b().longValue()).f();
    }

    @Override // t5.b.InterfaceC0141b
    public b.i l(b.d dVar) {
        p pVar;
        d.c a7 = this.f22376g.f22382e.a();
        m5.d dVar2 = new m5.d(this.f22376g.f22379b, "flutter.io/videoPlayer/videoEvents" + a7.e());
        if (dVar.b() != null) {
            String a8 = dVar.e() != null ? this.f22376g.f22381d.a(dVar.b(), dVar.e()) : this.f22376g.f22380c.a(dVar.b());
            pVar = new p(this.f22376g.f22378a, dVar2, a7, "asset:///" + a8, null, null, this.f22377h);
        } else {
            pVar = new p(this.f22376g.f22378a, dVar2, a7, dVar.f(), dVar.c(), dVar.d(), this.f22377h);
        }
        this.f22375f.put(a7.e(), pVar);
        return new b.i.a().b(Long.valueOf(a7.e())).a();
    }

    @Override // t5.b.InterfaceC0141b
    public void m(b.i iVar) {
        this.f22375f.get(iVar.b().longValue()).e();
    }
}
