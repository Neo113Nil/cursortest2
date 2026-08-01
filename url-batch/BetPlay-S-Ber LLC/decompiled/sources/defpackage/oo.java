package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class oo implements hi {
    public static final List g = y70.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = y70.i("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final yy a;
    public final az b;
    public final no c;
    public volatile uo d;
    public final dy e;
    public volatile boolean f;

    public oo(bw bwVar, yy yyVar, az azVar, no noVar) {
        noVar.getClass();
        this.a = yyVar;
        this.b = azVar;
        this.c = noVar;
        List list = bwVar.w;
        dy dyVar = dy.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(dyVar) ? dyVar : dy.HTTP_2;
    }

    @Override // defpackage.hi
    public final q30 a(y00 y00Var) {
        uo uoVar = this.d;
        uoVar.getClass();
        return uoVar.i;
    }

    @Override // defpackage.hi
    public final void b() {
        uo uoVar = this.d;
        uoVar.getClass();
        synchronized (uoVar) {
            if (!uoVar.h && !uoVar.f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        uoVar.j.close();
    }

    @Override // defpackage.hi
    public final void c() {
        this.c.flush();
    }

    @Override // defpackage.hi
    public final void cancel() {
        this.f = true;
        uo uoVar = this.d;
        if (uoVar != null) {
            uoVar.e(9);
        }
    }

    @Override // defpackage.hi
    public final long d(y00 y00Var) {
        if (wo.a(y00Var)) {
            return y70.h(y00Var);
        }
        return 0L;
    }

    @Override // defpackage.hi
    public final x00 e(boolean z) {
        nn nnVar;
        uo uoVar = this.d;
        if (uoVar == null) {
            o8.x("stream wasn't created");
            return null;
        }
        synchronized (uoVar) {
            uoVar.k.h();
            while (uoVar.g.isEmpty() && uoVar.m == 0) {
                try {
                    try {
                        uoVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    uoVar.k.k();
                    throw th;
                }
            }
            uoVar.k.k();
            if (uoVar.g.isEmpty()) {
                IOException iOException = uoVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = uoVar.m;
                if (i != 0) {
                    throw new k40(i);
                }
                throw null;
            }
            Object removeFirst = uoVar.g.removeFirst();
            removeFirst.getClass();
            nnVar = (nn) removeFirst;
        }
        dy dyVar = this.e;
        dyVar.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = nnVar.size();
        ob obVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String b = nnVar.b(i2);
            String d = nnVar.d(i2);
            if (op.d(b, ":status")) {
                obVar = l70.F("HTTP/1.1 " + d);
            } else if (!h.contains(b)) {
                b.getClass();
                d.getClass();
                arrayList.add(b);
                arrayList.add(l40.q0(d).toString());
            }
        }
        if (obVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        x00 x00Var = new x00();
        x00Var.b = dyVar;
        x00Var.c = obVar.b;
        x00Var.d = (String) obVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        j1 j1Var = new j1(21);
        ArrayList arrayList2 = (ArrayList) j1Var.g;
        arrayList2.getClass();
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList2.addAll(asList);
        x00Var.f = j1Var;
        if (z && x00Var.c == 100) {
            return null;
        }
        return x00Var;
    }

    @Override // defpackage.hi
    public final void f(pp ppVar) {
        int i;
        uo uoVar;
        if (this.d != null) {
            return;
        }
        nn nnVar = (nn) ppVar.d;
        ArrayList arrayList = new ArrayList(nnVar.size() + 4);
        arrayList.add(new mn(mn.f, (String) ppVar.c));
        t8 t8Var = mn.g;
        yo yoVar = (yo) ppVar.b;
        yoVar.getClass();
        String b = yoVar.b();
        String d = yoVar.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new mn(t8Var, b));
        String a = nnVar.a("Host");
        if (a != null) {
            arrayList.add(new mn(mn.i, a));
        }
        arrayList.add(new mn(mn.h, yoVar.a));
        int size = nnVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = nnVar.b(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = b2.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && op.d(nnVar.d(i2), "trailers"))) {
                arrayList.add(new mn(lowerCase, nnVar.d(i2)));
            }
        }
        no noVar = this.c;
        noVar.getClass();
        boolean z = !false;
        synchronized (noVar.B) {
            synchronized (noVar) {
                try {
                    if (noVar.j > 1073741823) {
                        noVar.p(8);
                    }
                    if (noVar.k) {
                        throw new fc();
                    }
                    i = noVar.j;
                    noVar.j = i + 2;
                    uoVar = new uo(i, noVar, z, false, null);
                    if (uoVar.g()) {
                        noVar.g.put(Integer.valueOf(i), uoVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            noVar.B.q(z, i, arrayList);
        }
        noVar.B.flush();
        this.d = uoVar;
        boolean z2 = this.f;
        uo uoVar2 = this.d;
        if (z2) {
            uoVar2.getClass();
            uoVar2.e(9);
            o8.x("Canceled");
        } else {
            uoVar2.getClass();
            uoVar2.k.g(this.b.g);
            uo uoVar3 = this.d;
            uoVar3.getClass();
            uoVar3.l.g(this.b.h);
        }
    }

    @Override // defpackage.hi
    public final yy g() {
        return this.a;
    }
}
