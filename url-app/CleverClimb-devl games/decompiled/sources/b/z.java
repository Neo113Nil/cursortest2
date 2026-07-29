package b;

import android.support.v4.app.NotificationCompat;
import b.p;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: RealCall.java */
/* loaded from: classes.dex */
final class z implements e {

    /* renamed from: a, reason: collision with root package name */
    final x f2167a;

    /* renamed from: b, reason: collision with root package name */
    final b.a.c.j f2168b;

    /* renamed from: c, reason: collision with root package name */
    final p f2169c;

    /* renamed from: d, reason: collision with root package name */
    final aa f2170d;
    final boolean e;
    private boolean f;

    z(x xVar, aa aaVar, boolean z) {
        p.a x = xVar.x();
        this.f2167a = xVar;
        this.f2170d = aaVar;
        this.e = z;
        this.f2168b = new b.a.c.j(xVar, z);
        this.f2169c = x.a(this);
    }

    @Override // b.e
    public ac a() throws IOException {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        h();
        try {
            this.f2167a.s().a(this);
            ac g = g();
            if (g != null) {
                return g;
            }
            throw new IOException("Canceled");
        } finally {
            this.f2167a.s().b(this);
        }
    }

    private void h() {
        this.f2168b.a(b.a.g.e.b().a("response.body().close()"));
    }

    @Override // b.e
    public void a(f fVar) {
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f = true;
        }
        h();
        this.f2167a.s().a(new a(fVar));
    }

    @Override // b.e
    public void b() {
        this.f2168b.a();
    }

    @Override // b.e
    public boolean c() {
        return this.f2168b.b();
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z clone() {
        return new z(this.f2167a, this.f2170d, this.e);
    }

    /* compiled from: RealCall.java */
    final class a extends b.a.b {

        /* renamed from: c, reason: collision with root package name */
        private final f f2172c;

        a(f fVar) {
            super("OkHttp %s", z.this.f());
            this.f2172c = fVar;
        }

        String a() {
            return z.this.f2170d.a().f();
        }

        @Override // b.a.b
        protected void b() {
            IOException e;
            boolean z = true;
            try {
                try {
                    ac g = z.this.g();
                    try {
                        if (z.this.f2168b.b()) {
                            this.f2172c.a(z.this, new IOException("Canceled"));
                        } else {
                            this.f2172c.a(z.this, g);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (z) {
                            b.a.g.e.b().a(4, "Callback failure for " + z.this.e(), e);
                        } else {
                            this.f2172c.a(z.this, e);
                        }
                    }
                } finally {
                    z.this.f2167a.s().b(this);
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
            }
        }
    }

    String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(c() ? "canceled " : "");
        sb.append(this.e ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(f());
        return sb.toString();
    }

    String f() {
        return this.f2170d.a().n();
    }

    ac g() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2167a.v());
        arrayList.add(this.f2168b);
        arrayList.add(new b.a.c.a(this.f2167a.f()));
        arrayList.add(new b.a.a.a(this.f2167a.g()));
        arrayList.add(new b.a.b.a(this.f2167a));
        if (!this.e) {
            arrayList.addAll(this.f2167a.w());
        }
        arrayList.add(new b.a.c.b(this.e));
        return new b.a.c.g(arrayList, null, null, null, 0, this.f2170d).a(this.f2170d);
    }
}
