package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ly0 implements yi0 {
    public final fu1 a;
    public final v62 b;
    public final pq c;
    public final oq d;
    public int e;
    public final nx0 f;
    public mx0 g;

    public ly0(fu1 fu1Var, v62 v62Var, p62 p62Var, n62 n62Var) {
        p62Var.getClass();
        n62Var.getClass();
        this.a = fu1Var;
        this.b = v62Var;
        this.c = p62Var;
        this.d = n62Var;
        this.f = new nx0(p62Var);
    }

    @Override // defpackage.yi0
    public final pn2 a(w92 w92Var) {
        if (!ez0.a(w92Var)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(w92.b(w92Var, "Transfer-Encoding"))) {
            kz0 kz0Var = (kz0) w92Var.m.n;
            if (this.e == 4) {
                this.e = 5;
                return new iy0(this, kz0Var);
            }
            b71.g(this.e, "state: ");
            return null;
        }
        long h = n33.h(w92Var);
        if (h != -1) {
            return h(h);
        }
        if (this.e != 4) {
            b71.g(this.e, "state: ");
            return null;
        }
        this.e = 5;
        this.b.k();
        return new ky0(this);
    }

    @Override // defpackage.yi0
    public final void b() {
        this.d.flush();
    }

    @Override // defpackage.yi0
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.yi0
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            n33.c(socket);
        }
    }

    @Override // defpackage.yi0
    public final long d(w92 w92Var) {
        if (!ez0.a(w92Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(w92.b(w92Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return n33.h(w92Var);
    }

    @Override // defpackage.yi0
    public final void e(fy fyVar) {
        fyVar.getClass();
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) fyVar.o);
        sb.append(' ');
        kz0 kz0Var = (kz0) fyVar.n;
        if (kz0Var.i || type != Proxy.Type.HTTP) {
            String b = kz0Var.b();
            String d = kz0Var.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(kz0Var);
        }
        sb.append(" HTTP/1.1");
        i((mx0) fyVar.p, sb.toString());
    }

    @Override // defpackage.yi0
    public final v92 f(boolean z) {
        nx0 nx0Var = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            b71.g(this.e, "state: ");
            return null;
        }
        try {
            String z2 = ((pq) nx0Var.n).z(nx0Var.m);
            nx0Var.m -= z2.length();
            yf h = ci2.h(z2);
            int i2 = h.n;
            v92 v92Var = new v92();
            v92Var.b = (s52) h.o;
            v92Var.c = i2;
            v92Var.d = (String) h.p;
            v92Var.f = nx0Var.a().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return v92Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return v92Var;
            }
            this.e = 3;
            return v92Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.yi0
    public final v62 g() {
        return this.b;
    }

    public final jy0 h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new jy0(this, j);
        }
        b71.g(this.e, "state: ");
        return null;
    }

    public final void i(mx0 mx0Var, String str) {
        if (this.e != 0) {
            b71.g(this.e, "state: ");
            return;
        }
        oq oqVar = this.d;
        oqVar.G(str).G("\r\n");
        int size = mx0Var.size();
        for (int i = 0; i < size; i++) {
            oqVar.G(mx0Var.b(i)).G(": ").G(mx0Var.d(i)).G("\r\n");
        }
        oqVar.G("\r\n");
        this.e = 1;
    }
}
