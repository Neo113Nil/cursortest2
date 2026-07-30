package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f7844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7845b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f7846c = new byte[11][];

    public v(int i8, t1 t1Var) {
        this.f7844a = t1Var;
        this.f7845b = i8;
    }

    public final d a() {
        int read = this.f7844a.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.f7844a;
        if (inputStream instanceof q1) {
            q1 q1Var = (q1) inputStream;
            q1Var.f7829f = false;
            q1Var.c();
        }
        int b8 = i.b(read, this.f7844a);
        boolean z7 = (read & 32) != 0;
        int a8 = i.a(this.f7845b, this.f7844a);
        if (a8 < 0) {
            if (!z7) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            v vVar = new v(this.f7845b, new q1(this.f7845b, this.f7844a));
            if ((read & 64) != 0) {
                return new z(b8, vVar);
            }
            if ((read & 128) != 0) {
                return new i0(true, b8, vVar);
            }
            if (b8 == 4) {
                return new c0(vVar);
            }
            if (b8 == 8) {
                return new o0(vVar);
            }
            if (b8 == 16) {
                return new e0(vVar);
            }
            if (b8 == 17) {
                return new g0(vVar);
            }
            StringBuilder a9 = com.baidu.mapauto.auth.b.a("unknown BER object encountered: 0x");
            a9.append(Integer.toHexString(b8));
            throw new g(a9.toString());
        }
        o1 o1Var = new o1(a8, this.f7844a);
        if ((read & 64) != 0) {
            return new k0(z7, b8, o1Var.c());
        }
        if ((read & 128) != 0) {
            return new i0(z7, b8, new v(u1.a(o1Var), o1Var));
        }
        if (!z7) {
            if (b8 == 4) {
                return new w0(o1Var);
            }
            try {
                return i.a(b8, o1Var, this.f7846c);
            } catch (IllegalArgumentException e8) {
                throw new g("corrupted stream detected", e8);
            }
        }
        if (b8 == 4) {
            return new c0(new v(u1.a(o1Var), o1Var));
        }
        if (b8 == 8) {
            return new o0(new v(u1.a(o1Var), o1Var));
        }
        if (b8 == 16) {
            return new a1(new v(u1.a(o1Var), o1Var));
        }
        if (b8 == 17) {
            return new c1(new v(u1.a(o1Var), o1Var));
        }
        throw new IOException("unknown tag " + b8 + " encountered");
    }

    public final e b() {
        e eVar = new e();
        while (true) {
            d a8 = a();
            if (a8 == null) {
                return eVar;
            }
            eVar.f7778a.addElement(a8 instanceof p1 ? ((p1) a8).a() : a8.c());
        }
    }

    public final w a(boolean z7, int i8) {
        if (!z7) {
            return new e1(false, i8, new v0(((o1) this.f7844a).c()));
        }
        e b8 = b();
        if (this.f7844a instanceof q1) {
            if (b8.f7778a.size() == 1) {
                return new h0(true, i8, b8.a(0));
            }
            d0 d0Var = a0.f7761a;
            if (b8.f7778a.size() >= 1) {
                d0Var = new d0(b8);
            }
            return new h0(false, i8, d0Var);
        }
        if (b8.f7778a.size() == 1) {
            return new e1(true, i8, b8.a(0));
        }
        d dVar = p0.f7820a;
        if (b8.f7778a.size() >= 1) {
            dVar = new l1(b8);
        }
        return new e1(false, i8, dVar);
    }
}
