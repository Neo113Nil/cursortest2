package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends C1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f397g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f395e = i;
        this.f396f = obj;
        this.f397g = obj2;
    }

    @Override // C1.a
    public final long a() {
        long a2;
        y[] yVarArr;
        y[] yVarArr2;
        int i = 0;
        switch (this.f395e) {
            case 0:
                q qVar = (q) this.f396f;
                qVar.f413a.a(qVar, (D) ((k1.h) this.f397g).f3245b);
                return -1L;
            case 1:
                try {
                    ((q) this.f396f).f413a.b((y) this.f397g);
                    return -1L;
                } catch (IOException e2) {
                    H1.n nVar = H1.n.f525a;
                    H1.n nVar2 = H1.n.f525a;
                    String str = "Http2Connection.Listener failure for " + ((q) this.f396f).f415c;
                    nVar2.getClass();
                    H1.n.i(str, 4, e2);
                    try {
                        ((y) this.f397g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                m mVar = (m) this.f396f;
                D d = (D) this.f397g;
                mVar.getClass();
                k1.h hVar = new k1.h(0);
                q qVar2 = mVar.f402b;
                synchronized (qVar2.f432w) {
                    synchronized (qVar2) {
                        try {
                            D d2 = qVar2.f426q;
                            D d3 = new D();
                            d3.b(d2);
                            d3.b(d);
                            hVar.f3245b = d3;
                            a2 = d3.a() - d2.a();
                            if (a2 != 0 && !qVar2.f414b.isEmpty()) {
                                yVarArr = (y[]) qVar2.f414b.values().toArray(new y[0]);
                                yVarArr2 = yVarArr;
                                D d4 = (D) hVar.f3245b;
                                k1.e.e(d4, "<set-?>");
                                qVar2.f426q = d4;
                                qVar2.f419j.c(new k(qVar2.f415c + " onSettings", qVar2, hVar, i), 0L);
                            }
                            yVarArr = null;
                            yVarArr2 = yVarArr;
                            D d42 = (D) hVar.f3245b;
                            k1.e.e(d42, "<set-?>");
                            qVar2.f426q = d42;
                            qVar2.f419j.c(new k(qVar2.f415c + " onSettings", qVar2, hVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        qVar2.f432w.a((D) hVar.f3245b);
                    } catch (IOException e3) {
                        qVar2.a(2, 2, e3);
                    }
                }
                if (yVarArr2 == null) {
                    return -1L;
                }
                int length = yVarArr2.length;
                while (i < length) {
                    y yVar = yVarArr2[i];
                    synchronized (yVar) {
                        yVar.f462f += a2;
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
