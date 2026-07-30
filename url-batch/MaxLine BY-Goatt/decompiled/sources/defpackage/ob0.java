package defpackage;

import com.facebook.appevents.AppEventsConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ob0 implements Closeable, Flushable {
    public static final Regex C = new Regex("[a-z0-9_-]{1,120}");
    public boolean A;
    public final nb0 B;
    public final qz1 m;
    public final long n;
    public final qz1 o;
    public final qz1 p;
    public final qz1 q;
    public final LinkedHashMap r;
    public final m30 s;
    public long t;
    public int u;
    public n62 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ob0(long j, t40 t40Var, gl0 gl0Var, qz1 qz1Var) {
        this.m = qz1Var;
        this.n = j;
        if (j <= 0) {
            lh.e("maxSize <= 0");
            throw null;
        }
        this.o = qz1Var.d("journal");
        this.p = qz1Var.d("journal.tmp");
        this.q = qz1Var.d("journal.bkp");
        this.r = new LinkedHashMap(0, 0.75f, true);
        this.s = j8.b(f.c(gk2.a(), t40Var.Q(1)));
        this.B = new nb0(gl0Var);
    }

    public static void B(String str) {
        if (C.a(str)) {
            return;
        }
        ey.h(str, "keys must match regex [a-z0-9_-]{1,120}: \"");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if ((r9.u >= 2000) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:29:0x0058, B:30:0x0071, B:32:0x007f, B:34:0x0086, B:37:0x005c, B:39:0x006a, B:41:0x00a6, B:43:0x00ad, B:46:0x00b2, B:48:0x00c3, B:51:0x00c8, B:52:0x0103, B:54:0x010e, B:60:0x0117, B:61:0x00e0, B:63:0x00f5, B:65:0x0100, B:68:0x0096, B:70:0x011c, B:71:0x0123), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ob0 ob0Var, w50 w50Var, boolean z) {
        synchronized (ob0Var) {
            lb0 lb0Var = (lb0) w50Var.b;
            if (!Intrinsics.b(lb0Var.g, w50Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || lb0Var.f) {
                for (int i = 0; i < 2; i++) {
                    ob0Var.B.e((qz1) lb0Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) w50Var.c)[i2] && !ob0Var.B.f((qz1) lb0Var.d.get(i2))) {
                        w50Var.b(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    qz1 qz1Var = (qz1) lb0Var.d.get(i3);
                    qz1 qz1Var2 = (qz1) lb0Var.c.get(i3);
                    boolean f = ob0Var.B.f(qz1Var);
                    nb0 nb0Var = ob0Var.B;
                    if (f) {
                        nb0Var.b(qz1Var, qz1Var2);
                    } else {
                        qz1 qz1Var3 = (qz1) lb0Var.c.get(i3);
                        if (!nb0Var.f(qz1Var3)) {
                            l.a(nb0Var.k(qz1Var3));
                        }
                    }
                    long j = lb0Var.b[i3];
                    Long l = ob0Var.B.h(qz1Var2).d;
                    long longValue = l != null ? l.longValue() : 0L;
                    lb0Var.b[i3] = longValue;
                    ob0Var.t = (ob0Var.t - j) + longValue;
                }
            }
            lb0Var.g = null;
            if (lb0Var.f) {
                ob0Var.y(lb0Var);
                return;
            }
            ob0Var.u++;
            n62 n62Var = ob0Var.v;
            n62Var.getClass();
            if (!z && !lb0Var.e) {
                ob0Var.r.remove(lb0Var.a);
                n62Var.G("REMOVE");
                n62Var.writeByte(32);
                n62Var.G(lb0Var.a);
                n62Var.writeByte(10);
                n62Var.flush();
                if (ob0Var.t <= ob0Var.n) {
                }
                ob0Var.o();
            }
            lb0Var.e = true;
            n62Var.G("CLEAN");
            n62Var.writeByte(32);
            n62Var.G(lb0Var.a);
            for (long j2 : lb0Var.b) {
                n62Var.writeByte(32);
                n62Var.f(j2);
            }
            n62Var.writeByte(10);
            n62Var.flush();
            if (ob0Var.t <= ob0Var.n) {
            }
            ob0Var.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        y(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() {
        while (this.t > this.n) {
            for (lb0 lb0Var : this.r.values()) {
                if (!lb0Var.f) {
                    break;
                }
            }
            return;
        }
        this.z = false;
    }

    public final synchronized void C() {
        Throwable th;
        try {
            n62 n62Var = this.v;
            if (n62Var != null) {
                n62Var.close();
            }
            ol2 k = this.B.k(this.p);
            k.getClass();
            n62 n62Var2 = new n62(k);
            try {
                n62Var2.G("libcore.io.DiskLruCache");
                n62Var2.writeByte(10);
                n62Var2.G(AppEventsConstants.EVENT_PARAM_VALUE_YES);
                n62Var2.writeByte(10);
                n62Var2.f(1L);
                n62Var2.writeByte(10);
                n62Var2.f(2L);
                n62Var2.writeByte(10);
                n62Var2.writeByte(10);
                for (lb0 lb0Var : this.r.values()) {
                    if (lb0Var.g != null) {
                        n62Var2.G("DIRTY");
                        n62Var2.writeByte(32);
                        n62Var2.G(lb0Var.a);
                        n62Var2.writeByte(10);
                    } else {
                        n62Var2.G("CLEAN");
                        n62Var2.writeByte(32);
                        n62Var2.G(lb0Var.a);
                        for (long j : lb0Var.b) {
                            n62Var2.writeByte(32);
                            n62Var2.f(j);
                        }
                        n62Var2.writeByte(10);
                    }
                }
                Unit unit = Unit.a;
                try {
                    n62Var2.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    n62Var2.close();
                } catch (Throwable th4) {
                    wi0.a(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean f = this.B.f(this.o);
            nb0 nb0Var = this.B;
            if (f) {
                nb0Var.b(this.o, this.q);
                this.B.b(this.p, this.o);
                this.B.e(this.q);
            } else {
                nb0Var.b(this.p, this.o);
            }
            this.v = p();
            this.u = 0;
            this.w = false;
            this.A = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.x && !this.y) {
                for (lb0 lb0Var : (lb0[]) this.r.values().toArray(new lb0[0])) {
                    w50 w50Var = lb0Var.g;
                    if (w50Var != null) {
                        lb0 lb0Var2 = (lb0) w50Var.b;
                        if (Intrinsics.b(lb0Var2.g, w50Var)) {
                            lb0Var2.f = true;
                        }
                    }
                }
                A();
                j8.m(this.s, null);
                n62 n62Var = this.v;
                n62Var.getClass();
                n62Var.close();
                this.v = null;
                this.y = true;
                return;
            }
            this.y = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized w50 f(String str) {
        if (this.y) {
            throw new IllegalStateException("cache is closed");
        }
        B(str);
        n();
        lb0 lb0Var = (lb0) this.r.get(str);
        if ((lb0Var != null ? lb0Var.g : null) != null) {
            return null;
        }
        if (lb0Var != null && lb0Var.h != 0) {
            return null;
        }
        if (!this.z && !this.A) {
            n62 n62Var = this.v;
            n62Var.getClass();
            n62Var.G("DIRTY");
            n62Var.writeByte(32);
            n62Var.G(str);
            n62Var.writeByte(10);
            n62Var.flush();
            if (this.w) {
                return null;
            }
            if (lb0Var == null) {
                lb0Var = new lb0(this, str);
                this.r.put(str, lb0Var);
            }
            w50 w50Var = new w50(this, lb0Var);
            lb0Var.g = w50Var;
            return w50Var;
        }
        o();
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.x) {
            if (this.y) {
                throw new IllegalStateException("cache is closed");
            }
            A();
            n62 n62Var = this.v;
            n62Var.getClass();
            n62Var.flush();
        }
    }

    public final synchronized mb0 m(String str) {
        mb0 a;
        if (this.y) {
            throw new IllegalStateException("cache is closed");
        }
        B(str);
        n();
        lb0 lb0Var = (lb0) this.r.get(str);
        if (lb0Var != null && (a = lb0Var.a()) != null) {
            boolean z = true;
            this.u++;
            n62 n62Var = this.v;
            n62Var.getClass();
            n62Var.G("READ");
            n62Var.writeByte(32);
            n62Var.G(str);
            n62Var.writeByte(10);
            if (this.u < 2000) {
                z = false;
            }
            if (z) {
                o();
            }
            return a;
        }
        return null;
    }

    public final synchronized void n() {
        try {
            if (this.x) {
                return;
            }
            this.B.e(this.p);
            if (this.B.f(this.q)) {
                boolean f = this.B.f(this.o);
                nb0 nb0Var = this.B;
                qz1 qz1Var = this.q;
                if (f) {
                    nb0Var.e(qz1Var);
                } else {
                    nb0Var.b(qz1Var, this.o);
                }
            }
            if (this.B.f(this.o)) {
                try {
                    s();
                    q();
                    this.x = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        zm3.s(this.B, this.m);
                        this.y = false;
                    } catch (Throwable th) {
                        this.y = false;
                        throw th;
                    }
                }
            }
            C();
            this.x = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void o() {
        z71.H(this.s, null, new f9(1, null, this), 3);
    }

    public final n62 p() {
        nb0 nb0Var = this.B;
        nb0Var.getClass();
        qz1 qz1Var = this.o;
        qz1Var.getClass();
        return new n62(new jk0(nb0Var.b.a(qz1Var), new a0(2, this)));
    }

    public final void q() {
        Iterator it = this.r.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            lb0 lb0Var = (lb0) it.next();
            int i = 0;
            if (lb0Var.g == null) {
                while (i < 2) {
                    j += lb0Var.b[i];
                    i++;
                }
            } else {
                lb0Var.g = null;
                while (i < 2) {
                    qz1 qz1Var = (qz1) lb0Var.c.get(i);
                    nb0 nb0Var = this.B;
                    nb0Var.e(qz1Var);
                    nb0Var.e((qz1) lb0Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.t = j;
    }

    public final void s() {
        pn2 l = this.B.l(this.o);
        l.getClass();
        p62 p62Var = new p62(l);
        try {
            String z = p62Var.z(Long.MAX_VALUE);
            String z2 = p62Var.z(Long.MAX_VALUE);
            String z3 = p62Var.z(Long.MAX_VALUE);
            String z4 = p62Var.z(Long.MAX_VALUE);
            String z5 = p62Var.z(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(z) || !AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(z2) || !Intrinsics.b(String.valueOf(1), z3) || !Intrinsics.b(String.valueOf(2), z4) || z5.length() > 0) {
                throw new IOException("unexpected journal header: [" + z + ", " + z2 + ", " + z3 + ", " + z4 + ", " + z5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    v(p62Var.z(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.u = i - this.r.size();
                    if (p62Var.b()) {
                        this.v = p();
                    } else {
                        C();
                    }
                    Unit unit = Unit.a;
                    try {
                        p62Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                p62Var.close();
            } catch (Throwable th3) {
                wi0.a(th, th3);
            }
        }
    }

    public final void v(String str) {
        String substring;
        int v = up2.v(str, ' ', 0, 6);
        if (v == -1) {
            dm0.j("unexpected journal line: ".concat(str));
            return;
        }
        int i = v + 1;
        int v2 = up2.v(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.r;
        if (v2 == -1) {
            substring = str.substring(i);
            if (v == 6 && tp2.o(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, v2);
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new lb0(this, substring);
            linkedHashMap.put(substring, obj);
        }
        lb0 lb0Var = (lb0) obj;
        if (v2 == -1 || v != 5 || !tp2.o(str, "CLEAN", false)) {
            if (v2 == -1 && v == 5 && tp2.o(str, "DIRTY", false)) {
                lb0Var.g = new w50(this, lb0Var);
                return;
            } else {
                if (v2 == -1 && v == 4 && tp2.o(str, "READ", false)) {
                    return;
                }
                dm0.j("unexpected journal line: ".concat(str));
                return;
            }
        }
        List G = up2.G(str.substring(v2 + 1), new char[]{' '});
        lb0Var.e = true;
        lb0Var.g = null;
        if (G.size() != 2) {
            ch2.j(G, "unexpected journal line: ");
            return;
        }
        try {
            int size = G.size();
            for (int i2 = 0; i2 < size; i2++) {
                lb0Var.b[i2] = Long.parseLong((String) G.get(i2));
            }
        } catch (NumberFormatException unused) {
            ch2.j(G, "unexpected journal line: ");
        }
    }

    public final void y(lb0 lb0Var) {
        n62 n62Var;
        int i = lb0Var.h;
        String str = lb0Var.a;
        if (i > 0 && (n62Var = this.v) != null) {
            n62Var.G("DIRTY");
            n62Var.writeByte(32);
            n62Var.G(str);
            n62Var.writeByte(10);
            n62Var.flush();
        }
        if (lb0Var.h > 0 || lb0Var.g != null) {
            lb0Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.B.e((qz1) lb0Var.c.get(i2));
            long j = this.t;
            long[] jArr = lb0Var.b;
            this.t = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.u++;
        n62 n62Var2 = this.v;
        if (n62Var2 != null) {
            n62Var2.G("REMOVE");
            n62Var2.writeByte(32);
            n62Var2.G(str);
            n62Var2.writeByte(10);
        }
        this.r.remove(str);
        if (this.u >= 2000) {
            o();
        }
    }
}
