package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bo implements hi {
    public final bw a;
    public final yy b;
    public final r8 c;
    public final q8 d;
    public int e;
    public final aa f;
    public nn g;

    public bo(bw bwVar, yy yyVar, ry ryVar, qy qyVar) {
        ryVar.getClass();
        qyVar.getClass();
        this.a = bwVar;
        this.b = yyVar;
        this.c = ryVar;
        this.d = qyVar;
        this.f = new aa(ryVar);
    }

    @Override // defpackage.hi
    public final q30 a(y00 y00Var) {
        if (!wo.a(y00Var)) {
            return h(0L);
        }
        if ("chunked".equalsIgnoreCase(y00.m(y00Var, "Transfer-Encoding"))) {
            yo yoVar = (yo) y00Var.f.b;
            if (this.e == 4) {
                this.e = 5;
                return new yn(this, yoVar);
            }
            o8.k("state: ", this.e);
            return null;
        }
        long h = y70.h(y00Var);
        if (h != -1) {
            return h(h);
        }
        if (this.e != 4) {
            o8.k("state: ", this.e);
            return null;
        }
        this.e = 5;
        this.b.k();
        return new ao(this);
    }

    @Override // defpackage.hi
    public final void b() {
        this.d.flush();
    }

    @Override // defpackage.hi
    public final void c() {
        this.d.flush();
    }

    @Override // defpackage.hi
    public final void cancel() {
        Socket socket = this.b.c;
        if (socket != null) {
            y70.c(socket);
        }
    }

    @Override // defpackage.hi
    public final long d(y00 y00Var) {
        if (!wo.a(y00Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(y00.m(y00Var, "Transfer-Encoding"))) {
            return -1L;
        }
        return y70.h(y00Var);
    }

    @Override // defpackage.hi
    public final x00 e(boolean z) {
        aa aaVar = this.f;
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            o8.k("state: ", this.e);
            return null;
        }
        try {
            String f = ((r8) aaVar.c).f(aaVar.b);
            aaVar.b -= f.length();
            ob F = l70.F(f);
            int i2 = F.b;
            x00 x00Var = new x00();
            x00Var.b = (dy) F.c;
            x00Var.c = i2;
            x00Var.d = (String) F.d;
            x00Var.f = aaVar.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.e = 3;
                return x00Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.e = 4;
                return x00Var;
            }
            this.e = 3;
            return x00Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.b.a.h.f()), e);
        }
    }

    @Override // defpackage.hi
    public final void f(pp ppVar) {
        Proxy.Type type = this.b.b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) ppVar.c);
        sb.append(' ');
        yo yoVar = (yo) ppVar.b;
        if (yoVar.i || type != Proxy.Type.HTTP) {
            String b = yoVar.b();
            String d = yoVar.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(yoVar);
        }
        sb.append(" HTTP/1.1");
        i((nn) ppVar.d, sb.toString());
    }

    @Override // defpackage.hi
    public final yy g() {
        return this.b;
    }

    public final zn h(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new zn(this, j);
        }
        o8.k("state: ", this.e);
        return null;
    }

    public final void i(nn nnVar, String str) {
        if (this.e != 0) {
            o8.k("state: ", this.e);
            return;
        }
        q8 q8Var = this.d;
        q8Var.i(str).i("\r\n");
        int size = nnVar.size();
        for (int i = 0; i < size; i++) {
            q8Var.i(nnVar.b(i)).i(": ").i(nnVar.d(i)).i("\r\n");
        }
        q8Var.i("\r\n");
        this.e = 1;
    }
}
