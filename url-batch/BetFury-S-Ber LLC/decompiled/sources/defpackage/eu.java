package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eu implements sn {
    public static final List g = zk0.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = zk0.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final q70 a;
    public final s70 b;
    public final du c;
    public volatile ku d;
    public final u60 e;
    public volatile boolean f;

    public eu(o40 o40Var, q70 q70Var, s70 s70Var, du duVar) {
        duVar.getClass();
        this.a = q70Var;
        this.b = s70Var;
        this.c = duVar;
        List list = o40Var.w;
        u60 u60Var = u60.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(u60Var) ? u60Var : u60.HTTP_2;
    }

    @Override // defpackage.sn
    public final void a(j90 j90Var) {
        int i;
        ku kuVar;
        if (this.d != null) {
            return;
        }
        bt btVar = (bt) j90Var.d;
        ArrayList arrayList = new ArrayList(btVar.size() + 4);
        arrayList.add(new xs(xs.f, (String) j90Var.c));
        y9 y9Var = xs.g;
        ou ouVar = (ou) j90Var.b;
        ouVar.getClass();
        String b = ouVar.b();
        String d = ouVar.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new xs(y9Var, b));
        String a = btVar.a("Host");
        if (a != null) {
            arrayList.add(new xs(xs.i, a));
        }
        arrayList.add(new xs(xs.h, ouVar.a));
        int size = btVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = btVar.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && mv.c(btVar.d(i2), "trailers"))) {
                arrayList.add(new xs(lowerCase, btVar.d(i2)));
            }
        }
        du duVar = this.c;
        duVar.getClass();
        boolean z = !false;
        synchronized (duVar.B) {
            synchronized (duVar) {
                try {
                    if (duVar.j > 1073741823) {
                        duVar.D(kn.REFUSED_STREAM);
                    }
                    if (duVar.k) {
                        throw new le();
                    }
                    i = duVar.j;
                    duVar.j = i + 2;
                    kuVar = new ku(i, duVar, z, false, null);
                    if (kuVar.g()) {
                        duVar.g.put(Integer.valueOf(i), kuVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            duVar.B.D(z, i, arrayList);
        }
        duVar.B.flush();
        this.d = kuVar;
        boolean z2 = this.f;
        ku kuVar2 = this.d;
        if (z2) {
            kuVar2.getClass();
            kuVar2.e(kn.CANCEL);
            s9.w("Canceled");
        } else {
            kuVar2.getClass();
            kuVar2.k.g(this.b.g);
            ku kuVar3 = this.d;
            kuVar3.getClass();
            kuVar3.l.g(this.b.h);
        }
    }

    @Override // defpackage.sn
    public final ke0 b(v90 v90Var) {
        ku kuVar = this.d;
        kuVar.getClass();
        return kuVar.i;
    }

    @Override // defpackage.sn
    public final void c() {
        ku kuVar = this.d;
        kuVar.getClass();
        synchronized (kuVar) {
            if (!kuVar.h && !kuVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        kuVar.j.close();
    }

    @Override // defpackage.sn
    public final void cancel() {
        this.f = true;
        ku kuVar = this.d;
        if (kuVar != null) {
            kuVar.e(kn.CANCEL);
        }
    }

    @Override // defpackage.sn
    public final void d() {
        this.c.flush();
    }

    @Override // defpackage.sn
    public final long e(v90 v90Var) {
        if (mu.a(v90Var)) {
            return zk0.h(v90Var);
        }
        return 0L;
    }

    @Override // defpackage.sn
    public final u90 f(boolean z) {
        bt btVar;
        ku kuVar = this.d;
        if (kuVar == null) {
            s9.w("stream wasn't created");
            return null;
        }
        synchronized (kuVar) {
            kuVar.k.h();
            while (kuVar.g.isEmpty() && kuVar.m == null) {
                try {
                    try {
                        kuVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    kuVar.k.k();
                    throw th;
                }
            }
            kuVar.k.k();
            if (kuVar.g.isEmpty()) {
                IOException iOException = kuVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                kn knVar = kuVar.m;
                knVar.getClass();
                throw new lf0(knVar);
            }
            Object removeFirst = kuVar.g.removeFirst();
            removeFirst.getClass();
            btVar = (bt) removeFirst;
        }
        u60 u60Var = this.e;
        u60Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = btVar.size();
        nz nzVar = null;
        for (int i = 0; i < size; i++) {
            String b = btVar.b(i);
            String d = btVar.d(i);
            if (mv.c(b, ":status")) {
                nzVar = zb0.l("HTTP/1.1 " + d);
            } else if (!h.contains(b)) {
                b.getClass();
                d.getClass();
                arrayList.add(b);
                arrayList.add(mf0.E(d).toString());
            }
        }
        if (nzVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        u90 u90Var = new u90();
        u90Var.b = u60Var;
        u90Var.c = nzVar.b;
        u90Var.d = (String) nzVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        o0 o0Var = new o0(27);
        ArrayList arrayList2 = (ArrayList) o0Var.g;
        arrayList2.getClass();
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList2.addAll(asList);
        u90Var.f = o0Var;
        if (z && u90Var.c == 100) {
            return null;
        }
        return u90Var;
    }

    @Override // defpackage.sn
    public final q70 g() {
        return this.a;
    }
}
