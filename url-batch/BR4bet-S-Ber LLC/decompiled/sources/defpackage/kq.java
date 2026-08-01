package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kq implements vk {
    public static final List g = cb0.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = cb0.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final l10 a;
    public final n10 b;
    public final jq c;
    public volatile qq d;
    public final q00 e;
    public volatile boolean f;

    public kq(xy xyVar, l10 l10Var, n10 n10Var, jq jqVar) {
        jqVar.getClass();
        this.a = l10Var;
        this.b = n10Var;
        this.c = jqVar;
        List list = xyVar.w;
        q00 q00Var = q00.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(q00Var) ? q00Var : q00.HTTP_2;
    }

    @Override // defpackage.vk
    public final void a(b30 b30Var) {
        int i;
        qq qqVar;
        if (this.d != null) {
            return;
        }
        kp kpVar = b30Var.c;
        ArrayList arrayList = new ArrayList(kpVar.size() + 4);
        arrayList.add(new gp(gp.f, b30Var.b));
        l9 l9Var = gp.g;
        uq uqVar = b30Var.a;
        uqVar.getClass();
        String b = uqVar.b();
        String d = uqVar.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new gp(l9Var, b));
        String a = kpVar.a("Host");
        if (a != null) {
            arrayList.add(new gp(gp.i, a));
        }
        arrayList.add(new gp(gp.h, uqVar.a));
        int size = kpVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = kpVar.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && kr.b(kpVar.d(i2), "trailers"))) {
                arrayList.add(new gp(lowerCase, kpVar.d(i2)));
            }
        }
        jq jqVar = this.c;
        jqVar.getClass();
        boolean z = !false;
        synchronized (jqVar.B) {
            synchronized (jqVar) {
                try {
                    if (jqVar.j > 1073741823) {
                        jqVar.k(8);
                    }
                    if (jqVar.k) {
                        throw new bd();
                    }
                    i = jqVar.j;
                    jqVar.j = i + 2;
                    qqVar = new qq(i, jqVar, z, false, null);
                    if (qqVar.g()) {
                        jqVar.g.put(Integer.valueOf(i), qqVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            jqVar.B.q(z, i, arrayList);
        }
        jqVar.B.flush();
        this.d = qqVar;
        boolean z2 = this.f;
        qq qqVar2 = this.d;
        if (z2) {
            qqVar2.getClass();
            qqVar2.e(9);
            g9.w("Canceled");
        } else {
            qqVar2.getClass();
            qqVar2.k.g(this.b.g);
            qq qqVar3 = this.d;
            qqVar3.getClass();
            qqVar3.l.g(this.b.h);
        }
    }

    @Override // defpackage.vk
    public final h60 b(n30 n30Var) {
        qq qqVar = this.d;
        qqVar.getClass();
        return qqVar.i;
    }

    @Override // defpackage.vk
    public final void c() {
        qq qqVar = this.d;
        qqVar.getClass();
        synchronized (qqVar) {
            if (!qqVar.h && !qqVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        qqVar.j.close();
    }

    @Override // defpackage.vk
    public final void cancel() {
        this.f = true;
        qq qqVar = this.d;
        if (qqVar != null) {
            qqVar.e(9);
        }
    }

    @Override // defpackage.vk
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.vk
    public final long e(n30 n30Var) {
        if (sq.a(n30Var)) {
            return cb0.h(n30Var);
        }
        return 0L;
    }

    @Override // defpackage.vk
    public final m30 f(boolean z) {
        kp kpVar;
        qq qqVar = this.d;
        if (qqVar == null) {
            g9.w("stream wasn't created");
            return null;
        }
        synchronized (qqVar) {
            qqVar.k.h();
            while (qqVar.g.isEmpty() && qqVar.m == 0) {
                try {
                    try {
                        qqVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    qqVar.k.k();
                    throw th;
                }
            }
            qqVar.k.k();
            if (qqVar.g.isEmpty()) {
                IOException iOException = qqVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = qqVar.m;
                if (i != 0) {
                    throw new e70(i);
                }
                throw null;
            }
            Object removeFirst = qqVar.g.removeFirst();
            removeFirst.getClass();
            kpVar = (kp) removeFirst;
        }
        q00 q00Var = this.e;
        q00Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = kpVar.size();
        w4 w4Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b = kpVar.b(i2);
            String d = kpVar.d(i2);
            if (kr.b(b, ":status")) {
                w4Var = b9.H("HTTP/1.1 " + d);
            } else if (!h.contains(b)) {
                b.getClass();
                d.getClass();
                arrayList.add(b);
                arrayList.add(f70.g0(d).toString());
            }
        }
        if (w4Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        m30 m30Var = new m30();
        m30Var.b = q00Var;
        m30Var.c = w4Var.b;
        m30Var.d = (String) w4Var.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        rc0 rc0Var = new rc0(25);
        ArrayList arrayList2 = (ArrayList) rc0Var.g;
        arrayList2.getClass();
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList2.addAll(asList);
        m30Var.f = rc0Var;
        if (z && m30Var.c == 100) {
            return null;
        }
        return m30Var;
    }

    @Override // defpackage.vk
    public final l10 g() {
        return this.a;
    }
}
