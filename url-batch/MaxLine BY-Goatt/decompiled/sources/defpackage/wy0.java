package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wy0 implements yi0 {
    public static final List g = n33.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = n33.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final v62 a;
    public final sa1 b;
    public final vy0 c;
    public volatile cz0 d;
    public final s52 e;
    public volatile boolean f;

    public wy0(fu1 fu1Var, v62 v62Var, sa1 sa1Var, vy0 vy0Var) {
        vy0Var.getClass();
        this.a = v62Var;
        this.b = sa1Var;
        this.c = vy0Var;
        List list = fu1Var.D;
        s52 s52Var = s52.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(s52Var) ? s52Var : s52.HTTP_2;
    }

    @Override // defpackage.yi0
    public final pn2 a(w92 w92Var) {
        cz0 cz0Var = this.d;
        cz0Var.getClass();
        return cz0Var.i;
    }

    @Override // defpackage.yi0
    public final void b() {
        cz0 cz0Var = this.d;
        cz0Var.getClass();
        synchronized (cz0Var) {
            try {
                if (!cz0Var.h && !cz0Var.f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        cz0Var.j.close();
    }

    @Override // defpackage.yi0
    public final void c() {
        this.c.flush();
    }

    @Override // defpackage.yi0
    public final void cancel() {
        this.f = true;
        cz0 cz0Var = this.d;
        if (cz0Var != null) {
            cz0Var.e(9);
        }
    }

    @Override // defpackage.yi0
    public final long d(w92 w92Var) {
        if (ez0.a(w92Var)) {
            return n33.h(w92Var);
        }
        return 0L;
    }

    @Override // defpackage.yi0
    public final void e(fy fyVar) {
        int i;
        cz0 cz0Var;
        fyVar.getClass();
        if (this.d != null) {
            return;
        }
        mx0 mx0Var = (mx0) fyVar.p;
        ArrayList arrayList = new ArrayList(mx0Var.size() + 4);
        arrayList.add(new kx0(kx0.f, (String) fyVar.o));
        dr drVar = kx0.g;
        kz0 kz0Var = (kz0) fyVar.n;
        kz0Var.getClass();
        String b = kz0Var.b();
        String d = kz0Var.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new kx0(drVar, b));
        String a = ((mx0) fyVar.p).a("Host");
        if (a != null) {
            arrayList.add(new kx0(kx0.i, a));
        }
        arrayList.add(new kx0(kx0.h, kz0Var.a));
        int size = mx0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = mx0Var.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && Intrinsics.b(mx0Var.d(i2), "trailers"))) {
                arrayList.add(new kx0(lowerCase, mx0Var.d(i2)));
            }
        }
        vy0 vy0Var = this.c;
        vy0Var.getClass();
        boolean z = !false;
        synchronized (vy0Var.I) {
            synchronized (vy0Var) {
                try {
                    if (vy0Var.q > 1073741823) {
                        vy0Var.n(8);
                    }
                    if (vy0Var.r) {
                        throw new d10();
                    }
                    i = vy0Var.q;
                    vy0Var.q = i + 2;
                    cz0Var = new cz0(i, vy0Var, z, false, null);
                    if (cz0Var.g()) {
                        vy0Var.n.put(Integer.valueOf(i), cz0Var);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            vy0Var.I.o(z, i, arrayList);
        }
        vy0Var.I.flush();
        this.d = cz0Var;
        boolean z2 = this.f;
        cz0 cz0Var2 = this.d;
        if (z2) {
            cz0Var2.getClass();
            cz0Var2.e(9);
            dm0.j("Canceled");
        } else {
            cz0Var2.getClass();
            cz0Var2.k.g(this.b.d);
            cz0 cz0Var3 = this.d;
            cz0Var3.getClass();
            cz0Var3.l.g(this.b.e);
        }
    }

    @Override // defpackage.yi0
    public final v92 f(boolean z) {
        mx0 mx0Var;
        cz0 cz0Var = this.d;
        if (cz0Var == null) {
            dm0.j("stream wasn't created");
            return null;
        }
        synchronized (cz0Var) {
            cz0Var.k.h();
            while (cz0Var.g.isEmpty() && cz0Var.m == 0) {
                try {
                    try {
                        cz0Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    cz0Var.k.k();
                    throw th;
                }
            }
            cz0Var.k.k();
            if (cz0Var.g.isEmpty()) {
                IOException iOException = cz0Var.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = cz0Var.m;
                if (i != 0) {
                    throw new ip2(i);
                }
                throw null;
            }
            Object removeFirst = cz0Var.g.removeFirst();
            removeFirst.getClass();
            mx0Var = (mx0) removeFirst;
        }
        s52 s52Var = this.e;
        s52Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = mx0Var.size();
        yf yfVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b = mx0Var.b(i2);
            String d = mx0Var.d(i2);
            if (Intrinsics.b(b, ":status")) {
                yfVar = ci2.h("HTTP/1.1 " + d);
            } else if (!h.contains(b)) {
                b.getClass();
                d.getClass();
                arrayList.add(b);
                arrayList.add(up2.K(d).toString());
            }
        }
        if (yfVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        v92 v92Var = new v92();
        v92Var.b = s52Var;
        v92Var.c = yfVar.n;
        v92Var.d = (String) yfVar.p;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        lx0 lx0Var = new lx0(0);
        ArrayList arrayList2 = lx0Var.m;
        arrayList2.getClass();
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList2.addAll(asList);
        v92Var.f = lx0Var;
        if (z && v92Var.c == 100) {
            return null;
        }
        return v92Var;
    }

    @Override // defpackage.yi0
    public final v62 g() {
        return this.a;
    }
}
