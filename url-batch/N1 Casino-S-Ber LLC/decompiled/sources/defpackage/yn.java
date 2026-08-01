package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class yn implements oi {
    public static final List g = r70.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = r70.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final jy a;
    public final ly b;
    public final xn c;
    public volatile fo d;
    public final nx e;
    public volatile boolean f;

    public yn(uv uvVar, jy jyVar, ly lyVar, xn xnVar) {
        xnVar.getClass();
        this.a = jyVar;
        this.b = lyVar;
        this.c = xnVar;
        List list = uvVar.w;
        nx nxVar = nx.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(nxVar) ? nxVar : nx.HTTP_2;
    }

    @Override // defpackage.oi
    public final void a(xz xzVar) {
        int i;
        fo foVar;
        if (this.d != null) {
            return;
        }
        ym ymVar = xzVar.c;
        ArrayList arrayList = new ArrayList(ymVar.size() + 4);
        arrayList.add(new um(um.f, xzVar.b));
        y8 y8Var = um.g;
        jo joVar = xzVar.a;
        joVar.getClass();
        String b = joVar.b();
        String d = joVar.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new um(y8Var, b));
        String a = ymVar.a("Host");
        if (a != null) {
            arrayList.add(new um(um.i, a));
        }
        arrayList.add(new um(um.h, joVar.a));
        int size = ymVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = ymVar.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && zo.b(ymVar.d(i2), "trailers"))) {
                arrayList.add(new um(lowerCase, ymVar.d(i2)));
            }
        }
        xn xnVar = this.c;
        xnVar.getClass();
        boolean z = !false;
        synchronized (xnVar.B) {
            synchronized (xnVar) {
                try {
                    if (xnVar.j > 1073741823) {
                        xnVar.p(8);
                    }
                    if (xnVar.k) {
                        throw new bc();
                    }
                    i = xnVar.j;
                    xnVar.j = i + 2;
                    foVar = new fo(i, xnVar, z, false, null);
                    if (foVar.g()) {
                        xnVar.g.put(Integer.valueOf(i), foVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xnVar.B.q(z, i, arrayList);
        }
        xnVar.B.flush();
        this.d = foVar;
        boolean z2 = this.f;
        fo foVar2 = this.d;
        if (z2) {
            foVar2.getClass();
            foVar2.e(9);
            t8.y("Canceled");
        } else {
            foVar2.getClass();
            foVar2.k.g(this.b.g);
            fo foVar3 = this.d;
            foVar3.getClass();
            foVar3.l.g(this.b.h);
        }
    }

    @Override // defpackage.oi
    public final f30 b(i00 i00Var) {
        fo foVar = this.d;
        foVar.getClass();
        return foVar.i;
    }

    @Override // defpackage.oi
    public final void c() {
        fo foVar = this.d;
        foVar.getClass();
        synchronized (foVar) {
            if (!foVar.h && !foVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        foVar.j.close();
    }

    @Override // defpackage.oi
    public final void cancel() {
        this.f = true;
        fo foVar = this.d;
        if (foVar != null) {
            foVar.e(9);
        }
    }

    @Override // defpackage.oi
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.oi
    public final long e(i00 i00Var) {
        if (ho.a(i00Var)) {
            return r70.h(i00Var);
        }
        return 0L;
    }

    @Override // defpackage.oi
    public final h00 f(boolean z) {
        ym ymVar;
        fo foVar = this.d;
        if (foVar == null) {
            t8.y("stream wasn't created");
            return null;
        }
        synchronized (foVar) {
            foVar.k.h();
            while (foVar.g.isEmpty() && foVar.m == 0) {
                try {
                    try {
                        foVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    foVar.k.k();
                    throw th;
                }
            }
            foVar.k.k();
            if (foVar.g.isEmpty()) {
                IOException iOException = foVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = foVar.m;
                if (i != 0) {
                    throw new b40(i);
                }
                throw null;
            }
            Object removeFirst = foVar.g.removeFirst();
            removeFirst.getClass();
            ymVar = (ym) removeFirst;
        }
        nx nxVar = this.e;
        nxVar.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = ymVar.size();
        m4 m4Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b = ymVar.b(i2);
            String d = ymVar.d(i2);
            if (zo.b(b, ":status")) {
                m4Var = zo.E("HTTP/1.1 " + d);
            } else if (!h.contains(b)) {
                b.getClass();
                d.getClass();
                arrayList.add(b);
                arrayList.add(c40.y0(d).toString());
            }
        }
        if (m4Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        h00 h00Var = new h00();
        h00Var.b = nxVar;
        h00Var.c = m4Var.b;
        h00Var.d = (String) m4Var.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        k0 k0Var = new k0(25);
        ArrayList arrayList2 = (ArrayList) k0Var.g;
        arrayList2.getClass();
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList2.addAll(asList);
        h00Var.f = k0Var;
        if (z && h00Var.c == 100) {
            return null;
        }
        return h00Var;
    }

    @Override // defpackage.oi
    public final jy g() {
        return this.a;
    }
}
