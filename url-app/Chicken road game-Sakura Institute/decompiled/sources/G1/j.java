package G1;

import A.AbstractC0017m;
import A.V;
import B1.C0097d;
import G.C0231x;
import android.content.Context;
import android.view.MotionEvent;
import c2.C0539c;
import e2.C0560b;
import f1.C0607a;
import g2.C0639b;
import j2.AbstractC0720j;
import j2.C0712b;
import j2.C0719i;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o2.C0924c;
import s0.C1166s;
import w2.C1294c;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3125d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3126e;

    public /* synthetic */ j(int i2, Object obj) {
        this.f3125d = i2;
        this.f3126e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        Socket d4;
        p3.a c4;
        long j4;
        int i2 = 12;
        ?? r9 = 0;
        switch (this.f3125d) {
            case 0:
                ((l) this.f3126e).h();
                return;
            case 1:
                F1.a aVar = ((l) ((C1294c) this.f3126e).f11388d).f3131b;
                aVar.k(aVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 2:
                throw null;
            case 3:
                e2.n nVar = (e2.n) this.f3126e;
                nVar.f6210D = null;
                nVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (!nVar.d() || currentTimeMillis <= nVar.f6211E + 60000) {
                    nVar.b();
                    return;
                } else {
                    nVar.c("connection_idle");
                    return;
                }
            case 4:
                g2.h hVar = (g2.h) this.f3126e;
                g2.i iVar = hVar.f6703a;
                V v4 = new V(iVar.f6716b, iVar.f6715a, iVar.f6717c);
                g2.d dVar = hVar.f6710h;
                y.t c5 = dVar.c();
                y yVar = dVar.f6683a;
                Z1.q qVar = new Z1.q(dVar.f6685c, 1, dVar.a());
                Z1.q qVar2 = new Z1.q(dVar.f6686d, 1, dVar.a());
                C0712b a4 = dVar.a();
                String str = dVar.f6689g;
                V1.f fVar = dVar.f6691i;
                fVar.b();
                C0560b c0560b = new C0560b(yVar, qVar, qVar2, a4, str, fVar.f4167c.f4179b, ((Context) dVar.c().f11494e).getApplicationContext().getDir("sslcache", 0).getAbsolutePath());
                c5.getClass();
                e2.n nVar2 = new e2.n(c0560b, v4, hVar);
                ((V1.f) c5.f11495i).a(new C0539c(nVar2));
                hVar.f6705c = nVar2;
                dVar.f6685c.a((C0712b) dVar.f6687e.f987e, new E1.i(11));
                dVar.f6686d.a((C0712b) dVar.f6687e.f987e, new H1.f(11, false));
                hVar.f6705c.m();
                C0231x c0231x = new C0231x();
                C0607a c0607a = new C0607a(3, (boolean) r9);
                c0607a.f6561e = o2.k.f8939k;
                hVar.f6706d = c0607a;
                hVar.f6707e = new E1.i(12);
                Object obj = null;
                hVar.f6708f = new C0097d(obj, obj, new C0719i(), i2);
                hVar.f6713k = new g2.s(dVar, new C0231x(), new g2.g(hVar, r9));
                hVar.f6714l = new g2.s(dVar, c0231x, new g2.g(hVar, 1));
                List<g2.v> emptyList = Collections.emptyList();
                HashMap C3 = M1.a.C(hVar.f6704b);
                long j5 = Long.MIN_VALUE;
                for (g2.v vVar : emptyList) {
                    y.t tVar = new y.t(22, hVar, vVar, r9);
                    long j6 = vVar.f6760a;
                    if (j5 >= j6) {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                    boolean c6 = vVar.c();
                    g2.e eVar = vVar.f6761b;
                    C0097d c0097d = hVar.f6711i;
                    long j7 = vVar.f6760a;
                    if (c6) {
                        if (c0097d.y()) {
                            c0097d.d(AbstractC0017m.i("Restoring overwrite with id ", j7), null, new Object[0]);
                        }
                        hVar.f6705c.e("p", eVar.e(), vVar.b().t(true), null, tVar);
                        o2.s T3 = M1.a.T(vVar.b(), new y.t(hVar.f6714l, 23, eVar), C3);
                        g2.s sVar = hVar.f6714l;
                        o2.s b4 = vVar.b();
                        sVar.getClass();
                        AbstractC0720j.b("We shouldn't be persisting non-visible writes.", true);
                    } else {
                        if (c0097d.y()) {
                            c0097d.d(AbstractC0017m.i("Restoring merge with id ", j7), null, new Object[0]);
                        }
                        hVar.f6705c.e("m", eVar.e(), vVar.a().D(), null, tVar);
                        C0639b S3 = M1.a.S(vVar.a(), hVar.f6714l, eVar, C3);
                        g2.s sVar2 = hVar.f6714l;
                        C0639b a5 = vVar.a();
                        sVar2.getClass();
                    }
                    j5 = j6;
                }
                C0924c c0924c = g2.c.f6681c;
                Boolean bool = Boolean.FALSE;
                hVar.g(c0924c, bool);
                hVar.g(g2.c.f6682d, bool);
                return;
            case 5:
                ((m1.k) this.f3126e).m();
                throw null;
            case 6:
                p2.e eVar2 = (p2.e) this.f3126e;
                eVar2.getClass();
                try {
                    try {
                        try {
                            d4 = eVar2.d();
                        } catch (p2.f e4) {
                            eVar2.f9094c.r(e4);
                        }
                    } catch (Throwable th) {
                        eVar2.a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.f9094c.r(new p2.f("error while connecting: " + th2.getMessage(), th2));
                }
                synchronized (eVar2) {
                    eVar2.f9093b = d4;
                    if (eVar2.f9092a == 5) {
                        try {
                            eVar2.f9093b.close();
                            eVar2.f9093b = null;
                        } catch (IOException e5) {
                            throw new RuntimeException(e5);
                        }
                    } else {
                        DataInputStream dataInputStream = new DataInputStream(d4.getInputStream());
                        OutputStream outputStream = d4.getOutputStream();
                        outputStream.write(eVar2.f9099h.o());
                        byte[] bArr = new byte[1000];
                        ArrayList arrayList = new ArrayList();
                        boolean z4 = false;
                        int i4 = 0;
                        while (!z4) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                throw new p2.f("Connection closed before handshake was complete");
                            }
                            byte b5 = (byte) read;
                            bArr[i4] = b5;
                            int i5 = i4 + 1;
                            if (b5 == 10 && bArr[i4 - 1] == 13) {
                                String str2 = new String(bArr, p2.e.f9089m);
                                if (str2.trim().equals("")) {
                                    z4 = true;
                                } else {
                                    arrayList.add(str2.trim());
                                    z4 = z4;
                                }
                                bArr = new byte[1000];
                                i4 = 0;
                            } else {
                                if (i5 == 1000) {
                                    throw new p2.f("Unexpected long line in handshake: " + new String(bArr, p2.e.f9089m));
                                }
                                i4 = i5;
                            }
                            z4 = z4;
                        }
                        C0097d c0097d2 = eVar2.f9099h;
                        String str3 = (String) arrayList.get(0);
                        c0097d2.getClass();
                        C0097d.L(str3);
                        arrayList.remove(0);
                        HashMap hashMap = new HashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String[] split = ((String) it.next()).split(": ", 2);
                            String str4 = split[0];
                            Locale locale = Locale.US;
                            hashMap.put(str4.toLowerCase(locale), split[1].toLowerCase(locale));
                        }
                        eVar2.f9099h.getClass();
                        C0097d.K(hashMap);
                        p2.h hVar2 = eVar2.f9098g;
                        hVar2.getClass();
                        hVar2.f9114f = Channels.newChannel(outputStream);
                        eVar2.f9097f.f9103a = dataInputStream;
                        eVar2.f9092a = 3;
                        eVar2.f9098g.f9115g.start();
                        y.t tVar2 = eVar2.f9094c;
                        ((e2.r) tVar2.f11495i).f6254i.execute(new e2.q(tVar2, r9));
                        eVar2.f9097f.c();
                    }
                    eVar2.a();
                    return;
                }
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                p2.h hVar3 = (p2.h) this.f3126e;
                hVar3.getClass();
                while (!hVar3.f9111c && !Thread.interrupted()) {
                    try {
                        hVar3.f9114f.write((ByteBuffer) hVar3.f9109a.take());
                    } catch (IOException e6) {
                        p2.f fVar2 = new p2.f("IO Exception", e6);
                        p2.e eVar3 = hVar3.f9113e;
                        eVar3.f9094c.r(fVar2);
                        if (eVar3.f9092a == 3) {
                            eVar3.a();
                        }
                        eVar3.b();
                        return;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                while (r9 < hVar3.f9109a.size()) {
                    hVar3.f9114f.write((ByteBuffer) hVar3.f9109a.take());
                    r9++;
                }
                return;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                break;
            default:
                C1166s c1166s = (C1166s) this.f3126e;
                c1166s.removeCallbacks(this);
                MotionEvent motionEvent = c1166s.f10371s0;
                if (motionEvent != null) {
                    boolean z5 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z5) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i6 = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    C1166s c1166s2 = (C1166s) this.f3126e;
                    c1166s2.F(motionEvent, i6, c1166s2.t0, false);
                    return;
                }
                return;
        }
        while (true) {
            p3.d dVar2 = (p3.d) this.f3126e;
            synchronized (dVar2) {
                c4 = dVar2.c();
            }
            if (c4 == null) {
                return;
            }
            p3.c cVar = c4.f9118c;
            Intrinsics.c(cVar);
            p3.d dVar3 = (p3.d) this.f3126e;
            boolean isLoggable = p3.d.f9129i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0607a c0607a2 = cVar.f9122a.f9130a;
                j4 = System.nanoTime();
                m3.z.e(c4, cVar, "starting");
            } else {
                j4 = -1;
            }
            try {
                try {
                    p3.d.a(dVar3, c4);
                    Unit unit = Unit.f7487a;
                    if (isLoggable) {
                        C0607a c0607a3 = cVar.f9122a.f9130a;
                        m3.z.e(c4, cVar, "finished run in ".concat(m3.z.l(System.nanoTime() - j4)));
                    }
                } catch (Throwable th3) {
                    C0607a c0607a4 = dVar3.f9130a;
                    Intrinsics.checkNotNullParameter(this, "runnable");
                    ((ThreadPoolExecutor) c0607a4.f6561e).execute(this);
                    throw th3;
                }
            } catch (Throwable th4) {
                if (isLoggable) {
                    C0607a c0607a5 = cVar.f9122a.f9130a;
                    m3.z.e(c4, cVar, "failed a run in ".concat(m3.z.l(System.nanoTime() - j4)));
                }
                throw th4;
            }
        }
    }

    public j(h hVar, y yVar) {
        this.f3125d = 2;
        this.f3126e = yVar;
    }
}
