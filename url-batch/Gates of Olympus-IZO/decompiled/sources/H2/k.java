package H2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class k extends D2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, Object obj, Object obj2, int i3) {
        super(str, true);
        this.f1966e = i3;
        this.f1967f = obj;
        this.f1968g = obj2;
    }

    @Override // D2.a
    public final long a() {
        long a3;
        x[] xVarArr;
        x[] xVarArr2;
        int i3 = 0;
        switch (this.f1966e) {
            case 0:
                p pVar = (p) this.f1967f;
                pVar.f1984d.a(pVar, (C) ((Z1.t) this.f1968g).f3480d);
                return -1L;
            case 1:
                try {
                    ((p) this.f1967f).f1984d.b((x) this.f1968g);
                    return -1L;
                } catch (IOException e3) {
                    I2.n nVar = I2.n.f2519a;
                    I2.n nVar2 = I2.n.f2519a;
                    String str = "Http2Connection.Listener failure for " + ((p) this.f1967f).f1986f;
                    nVar2.getClass();
                    I2.n.i(str, 4, e3);
                    try {
                        ((x) this.f1968g).c(2, e3);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                H1.q qVar = (H1.q) this.f1967f;
                C c3 = (C) this.f1968g;
                qVar.getClass();
                Z1.t tVar = new Z1.t();
                p pVar2 = (p) qVar.f1896f;
                synchronized (pVar2.f2005z) {
                    synchronized (pVar2) {
                        try {
                            C c4 = pVar2.f1999t;
                            C c5 = new C();
                            c5.b(c4);
                            c5.b(c3);
                            tVar.f3480d = c5;
                            a3 = c5.a() - c4.a();
                            if (a3 != 0 && !pVar2.f1985e.isEmpty()) {
                                xVarArr = (x[]) pVar2.f1985e.values().toArray(new x[0]);
                                xVarArr2 = xVarArr;
                                C c6 = (C) tVar.f3480d;
                                Z1.i.f(c6, "<set-?>");
                                pVar2.f1999t = c6;
                                pVar2.f1993m.c(new k(pVar2.f1986f + " onSettings", pVar2, tVar, i3), 0L);
                            }
                            xVarArr = null;
                            xVarArr2 = xVarArr;
                            C c62 = (C) tVar.f3480d;
                            Z1.i.f(c62, "<set-?>");
                            pVar2.f1999t = c62;
                            pVar2.f1993m.c(new k(pVar2.f1986f + " onSettings", pVar2, tVar, i3), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        pVar2.f2005z.a((C) tVar.f3480d);
                    } catch (IOException e4) {
                        pVar2.a(2, 2, e4);
                    }
                }
                if (xVarArr2 == null) {
                    return -1L;
                }
                int length = xVarArr2.length;
                while (i3 < length) {
                    x xVar = xVarArr2[i3];
                    synchronized (xVar) {
                        xVar.f2040f += a3;
                        if (a3 > 0) {
                            xVar.notifyAll();
                        }
                    }
                    i3++;
                }
                return -1L;
        }
    }
}
