package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mn implements oi {
    public final uv a;
    public final jy b;
    public final w8 c;
    public final v8 d;
    public int e;
    public final ca f;
    public ym g;

    public mn(uv uvVar, jy jyVar, cy cyVar, ay ayVar) {
        cyVar.getClass();
        ayVar.getClass();
        this.a = uvVar;
        this.b = jyVar;
        this.c = cyVar;
        this.d = ayVar;
        this.f = new ca(cyVar);
    }

    @Override // defpackage.oi
    public final void a(xz xzVar) {
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(xzVar.b);
        sb.append(' ');
        jo joVar = xzVar.a;
        if (joVar.i || type != Proxy.Type.HTTP) {
            String b = joVar.b();
            String d = joVar.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(joVar);
        }
        sb.append(" HTTP/1.1");
        i(xzVar.c, sb.toString());
    }

    @Override // defpackage.oi
    public final f30 b(i00 i00Var) {
        if (!ho.a(i00Var)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(i00.m(i00Var, "Transfer-Encoding"))) {
            jo joVar = i00Var.f.a;
            if (this.e == 4) {
                this.e = 5;
                return new jn(this, joVar);
            }
            t8.l("state: ", this.e);
            return null;
        }
        long h = r70.h(i00Var);
        if (h != -1) {
            return h(h);
        }
        if (this.e != 4) {
            t8.l("state: ", this.e);
            return null;
        }
        this.e = 5;
        this.b.k();
        return new ln(this);
    }

    @Override // defpackage.oi
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.oi
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            r70.c(socket);
        }
    }

    @Override // defpackage.oi
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.oi
    public final long e(i00 i00Var) {
        if (!ho.a(i00Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(i00.m(i00Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return r70.h(i00Var);
    }

    @Override // defpackage.oi
    public final h00 f(boolean z) {
        ca caVar = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            t8.l("state: ", this.e);
            return null;
        }
        try {
            String f = ((w8) caVar.c).f(caVar.b);
            caVar.b -= f.length();
            m4 E = zo.E(f);
            int i2 = E.b;
            h00 h00Var = new h00();
            h00Var.b = (nx) E.c;
            h00Var.c = i2;
            h00Var.d = (String) E.d;
            h00Var.f = caVar.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return h00Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return h00Var;
            }
            this.e = 3;
            return h00Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.oi
    public final jy g() {
        return this.b;
    }

    public final kn h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new kn(this, j);
        }
        t8.l("state: ", this.e);
        return null;
    }

    public final void i(ym ymVar, String str) {
        if (this.e != 0) {
            t8.l("state: ", this.e);
            return;
        }
        v8 v8Var = this.d;
        v8Var.i(str).i("\r\n");
        int size = ymVar.size();
        for (int i = 0; i < size; i++) {
            v8Var.i(ymVar.b(i)).i(": ").i(ymVar.d(i)).i("\r\n");
        }
        v8Var.i("\r\n");
        this.e = 1;
    }
}
