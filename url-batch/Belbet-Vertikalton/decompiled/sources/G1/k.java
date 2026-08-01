package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends C1.a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f380f = obj;
        this.f381g = obj2;
    }

    @Override // C1.a
    public final long a() {
        long a2;
        y[] yVarArr;
        y[] yVarArr2;
        int i = 0;
        switch (this.e) {
            case 0:
                q qVar = (q) this.f380f;
                qVar.f395a.a(qVar, (D) ((j1.k) this.f381g).f3185b);
                return -1L;
            case 1:
                try {
                    ((q) this.f380f).f395a.b((y) this.f381g);
                    return -1L;
                } catch (IOException e) {
                    H1.n nVar = H1.n.f570a;
                    H1.n nVar2 = H1.n.f570a;
                    String str = "Http2Connection.Listener failure for " + ((q) this.f380f).f397c;
                    nVar2.getClass();
                    H1.n.i(str, 4, e);
                    try {
                        ((y) this.f381g).c(2, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                m mVar = (m) this.f380f;
                D d2 = (D) this.f381g;
                mVar.getClass();
                j1.k kVar = new j1.k();
                q qVar2 = mVar.f386b;
                synchronized (qVar2.f414w) {
                    synchronized (qVar2) {
                        try {
                            D d3 = qVar2.f408q;
                            D d4 = new D();
                            d4.b(d3);
                            d4.b(d2);
                            kVar.f3185b = d4;
                            a2 = d4.a() - d3.a();
                            if (a2 != 0 && !qVar2.f396b.isEmpty()) {
                                yVarArr = (y[]) qVar2.f396b.values().toArray(new y[0]);
                                yVarArr2 = yVarArr;
                                D d5 = (D) kVar.f3185b;
                                j1.h.e(d5, "<set-?>");
                                qVar2.f408q = d5;
                                qVar2.j.c(new k(qVar2.f397c + " onSettings", qVar2, kVar, i), 0L);
                            }
                            yVarArr = null;
                            yVarArr2 = yVarArr;
                            D d52 = (D) kVar.f3185b;
                            j1.h.e(d52, "<set-?>");
                            qVar2.f408q = d52;
                            qVar2.j.c(new k(qVar2.f397c + " onSettings", qVar2, kVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        qVar2.f414w.a((D) kVar.f3185b);
                    } catch (IOException e2) {
                        qVar2.a(2, 2, e2);
                    }
                }
                if (yVarArr2 == null) {
                    return -1L;
                }
                int length = yVarArr2.length;
                while (i < length) {
                    y yVar = yVarArr2[i];
                    synchronized (yVar) {
                        yVar.f447f += a2;
                        if (a2 > 0) {
                            yVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
