package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rt implements sn {
    public final o40 a;
    public final q70 b;
    public final w9 c;
    public final v9 d;
    public int e;
    public final mb f;
    public bt g;

    public rt(o40 o40Var, q70 q70Var, j70 j70Var, i70 i70Var) {
        j70Var.getClass();
        i70Var.getClass();
        this.a = o40Var;
        this.b = q70Var;
        this.c = j70Var;
        this.d = i70Var;
        this.f = new mb(j70Var);
    }

    @Override // defpackage.sn
    public final void a(j90 j90Var) {
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) j90Var.c);
        sb.append(' ');
        ou ouVar = (ou) j90Var.b;
        if (ouVar.i || type != Proxy.Type.HTTP) {
            String b = ouVar.b();
            String d = ouVar.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(ouVar);
        }
        sb.append(" HTTP/1.1");
        i((bt) j90Var.d, sb.toString());
    }

    @Override // defpackage.sn
    public final ke0 b(v90 v90Var) {
        if (!mu.a(v90Var)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(v90.i(v90Var, "Transfer-Encoding"))) {
            ou ouVar = (ou) v90Var.f.b;
            if (this.e == 4) {
                this.e = 5;
                return new ot(this, ouVar);
            }
            s9.l("state: ", this.e);
            return null;
        }
        long h = zk0.h(v90Var);
        if (h != -1) {
            return h(h);
        }
        if (this.e != 4) {
            s9.l("state: ", this.e);
            return null;
        }
        this.e = 5;
        this.b.k();
        return new qt(this);
    }

    @Override // defpackage.sn
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.sn
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            zk0.c(socket);
        }
    }

    @Override // defpackage.sn
    public final void d() {
        this.d.flush();
    }

    @Override // defpackage.sn
    public final long e(v90 v90Var) {
        if (!mu.a(v90Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(v90.i(v90Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return zk0.h(v90Var);
    }

    @Override // defpackage.sn
    public final u90 f(boolean z) {
        mb mbVar = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            s9.l("state: ", this.e);
            return null;
        }
        try {
            String y = ((w9) mbVar.c).y(mbVar.b);
            mbVar.b -= y.length();
            nz l = zb0.l(y);
            int i2 = l.b;
            u90 u90Var = new u90();
            u60 u60Var = (u60) l.c;
            u60Var.getClass();
            u90Var.b = u60Var;
            u90Var.c = i2;
            u90Var.d = (String) l.d;
            u90Var.f = mbVar.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return u90Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return u90Var;
            }
            this.e = 3;
            return u90Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.sn
    public final q70 g() {
        return this.b;
    }

    public final pt h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new pt(this, j);
        }
        s9.l("state: ", this.e);
        return null;
    }

    public final void i(bt btVar, String str) {
        if (this.e != 0) {
            s9.l("state: ", this.e);
            return;
        }
        v9 v9Var = this.d;
        v9Var.I(str).I("\r\n");
        int size = btVar.size();
        for (int i = 0; i < size; i++) {
            v9Var.I(btVar.b(i)).I(": ").I(btVar.d(i)).I("\r\n");
        }
        v9Var.I("\r\n");
        this.e = 1;
    }
}
