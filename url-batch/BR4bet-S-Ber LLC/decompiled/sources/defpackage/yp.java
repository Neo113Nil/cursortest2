package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yp implements vk {
    public final xy a;
    public final l10 b;
    public final j9 c;
    public final i9 d;
    public int e;
    public final ra f;
    public kp g;

    public yp(xy xyVar, l10 l10Var, e10 e10Var, d10 d10Var) {
        e10Var.getClass();
        d10Var.getClass();
        this.a = xyVar;
        this.b = l10Var;
        this.c = e10Var;
        this.d = d10Var;
        this.f = new ra(e10Var);
    }

    @Override // defpackage.vk
    public final void a(b30 b30Var) {
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(b30Var.b);
        sb.append(' ');
        uq uqVar = b30Var.a;
        if (uqVar.i || type != Proxy.Type.HTTP) {
            String b = uqVar.b();
            String d = uqVar.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(uqVar);
        }
        sb.append(" HTTP/1.1");
        i(b30Var.c, sb.toString());
    }

    @Override // defpackage.vk
    public final h60 b(n30 n30Var) {
        if (!sq.a(n30Var)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(n30.f(n30Var, "Transfer-Encoding"))) {
            uq uqVar = n30Var.f.a;
            if (this.e == 4) {
                this.e = 5;
                return new vp(this, uqVar);
            }
            g9.j("state: ", this.e);
            return null;
        }
        long h = cb0.h(n30Var);
        if (h != -1) {
            return h(h);
        }
        if (this.e != 4) {
            g9.j("state: ", this.e);
            return null;
        }
        this.e = 5;
        this.b.k();
        return new xp(this);
    }

    @Override // defpackage.vk
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.vk
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            cb0.c(socket);
        }
    }

    @Override // defpackage.vk
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.vk
    public final long e(n30 n30Var) {
        if (!sq.a(n30Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(n30.f(n30Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return cb0.h(n30Var);
    }

    @Override // defpackage.vk
    public final m30 f(boolean z) {
        ra raVar = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            g9.j("state: ", this.e);
            return null;
        }
        try {
            String i2 = ((j9) raVar.c).i(raVar.b);
            raVar.b -= i2.length();
            w4 H = b9.H(i2);
            int i3 = H.b;
            m30 m30Var = new m30();
            m30Var.b = (q00) H.c;
            m30Var.c = i3;
            m30Var.d = (String) H.d;
            m30Var.f = raVar.f().c();
            if (z && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.e = 3;
                return m30Var;
            }
            if (102 > i3 || i3 >= 200) {
                this.e = 4;
                return m30Var;
            }
            this.e = 3;
            return m30Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.vk
    public final l10 g() {
        return this.b;
    }

    public final wp h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new wp(this, j);
        }
        g9.j("state: ", this.e);
        return null;
    }

    public final void i(kp kpVar, String str) {
        if (this.e != 0) {
            g9.j("state: ", this.e);
            return;
        }
        i9 i9Var = this.d;
        i9Var.m(str).m("\r\n");
        int size = kpVar.size();
        for (int i = 0; i < size; i++) {
            i9Var.m(kpVar.b(i)).m(": ").m(kpVar.d(i)).m("\r\n");
        }
        i9Var.m("\r\n");
        this.e = 1;
    }
}
