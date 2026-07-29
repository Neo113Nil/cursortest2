package b.a.e;

import b.aa;
import b.ac;
import b.ad;
import b.s;
import b.x;
import b.y;
import c.q;
import c.r;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Http2Codec.java */
/* loaded from: classes.dex */
public final class f implements b.a.c.c {

    /* renamed from: b, reason: collision with root package name */
    private static final c.f f1917b = c.f.a("connection");

    /* renamed from: c, reason: collision with root package name */
    private static final c.f f1918c = c.f.a("host");

    /* renamed from: d, reason: collision with root package name */
    private static final c.f f1919d = c.f.a("keep-alive");
    private static final c.f e = c.f.a("proxy-connection");
    private static final c.f f = c.f.a("transfer-encoding");
    private static final c.f g = c.f.a("te");
    private static final c.f h = c.f.a("encoding");
    private static final c.f i = c.f.a("upgrade");
    private static final List<c.f> j = b.a.c.a(f1917b, f1918c, f1919d, e, g, f, h, i, c.f1901c, c.f1902d, c.e, c.f);
    private static final List<c.f> k = b.a.c.a(f1917b, f1918c, f1919d, e, g, f, h, i);

    /* renamed from: a, reason: collision with root package name */
    final b.a.b.g f1920a;
    private final x l;
    private final g m;
    private i n;

    public f(x xVar, b.a.b.g gVar, g gVar2) {
        this.l = xVar;
        this.f1920a = gVar;
        this.m = gVar2;
    }

    @Override // b.a.c.c
    public q a(aa aaVar, long j2) {
        return this.n.h();
    }

    @Override // b.a.c.c
    public void a(aa aaVar) throws IOException {
        if (this.n != null) {
            return;
        }
        this.n = this.m.a(b(aaVar), aaVar.d() != null);
        this.n.e().a(this.l.b(), TimeUnit.MILLISECONDS);
        this.n.f().a(this.l.c(), TimeUnit.MILLISECONDS);
    }

    @Override // b.a.c.c
    public void a() throws IOException {
        this.m.b();
    }

    @Override // b.a.c.c
    public void b() throws IOException {
        this.n.h().close();
    }

    @Override // b.a.c.c
    public ac.a a(boolean z) throws IOException {
        ac.a a2 = a(this.n.d());
        if (z && b.a.a.f1807a.a(a2) == 100) {
            return null;
        }
        return a2;
    }

    public static List<c> b(aa aaVar) {
        s c2 = aaVar.c();
        ArrayList arrayList = new ArrayList(c2.a() + 4);
        arrayList.add(new c(c.f1901c, aaVar.b()));
        arrayList.add(new c(c.f1902d, b.a.c.i.a(aaVar.a())));
        String a2 = aaVar.a("Host");
        if (a2 != null) {
            arrayList.add(new c(c.f, a2));
        }
        arrayList.add(new c(c.e, aaVar.a().b()));
        int a3 = c2.a();
        for (int i2 = 0; i2 < a3; i2++) {
            c.f a4 = c.f.a(c2.a(i2).toLowerCase(Locale.US));
            if (!j.contains(a4)) {
                arrayList.add(new c(a4, c2.b(i2)));
            }
        }
        return arrayList;
    }

    public static ac.a a(List<c> list) throws IOException {
        s.a aVar = new s.a();
        int size = list.size();
        s.a aVar2 = aVar;
        b.a.c.k kVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = list.get(i2);
            if (cVar == null) {
                if (kVar != null && kVar.f1876b == 100) {
                    aVar2 = new s.a();
                    kVar = null;
                }
            } else {
                c.f fVar = cVar.g;
                String a2 = cVar.h.a();
                if (fVar.equals(c.f1900b)) {
                    kVar = b.a.c.k.a("HTTP/1.1 " + a2);
                } else if (!k.contains(fVar)) {
                    b.a.a.f1807a.a(aVar2, fVar.a(), a2);
                }
            }
        }
        if (kVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        return new ac.a().a(y.HTTP_2).a(kVar.f1876b).a(kVar.f1877c).a(aVar2.a());
    }

    @Override // b.a.c.c
    public ad a(ac acVar) throws IOException {
        return new b.a.c.h(acVar.e(), c.k.a(new a(this.n.g())));
    }

    @Override // b.a.c.c
    public void c() {
        if (this.n != null) {
            this.n.b(b.CANCEL);
        }
    }

    /* compiled from: Http2Codec.java */
    class a extends c.g {
        public a(r rVar) {
            super(rVar);
        }

        @Override // c.g, c.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            f.this.f1920a.a(false, (b.a.c.c) f.this);
            super.close();
        }
    }
}
