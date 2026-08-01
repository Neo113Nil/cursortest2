package j3;

import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends f3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2432f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i4) {
        super(str, true);
        this.f2431e = i4;
        this.f2432f = obj;
        this.g = obj2;
    }

    @Override // f3.a
    public final long a() {
        long b2;
        int i4;
        x[] xVarArr;
        x[] xVarArr2;
        switch (this.f2431e) {
            case 0:
                p pVar = (p) this.f2432f;
                pVar.f2442f.a(pVar, (f.f) ((b3.d) this.g).g);
                return -1L;
            case 1:
                try {
                    ((p) this.f2432f).f2442f.b((x) this.g);
                } catch (IOException e4) {
                    k3.o oVar = k3.o.f2841a;
                    k3.o oVar2 = k3.o.f2841a;
                    String str = "Http2Connection.Listener failure for " + ((p) this.f2432f).h;
                    oVar2.getClass();
                    k3.o.i(str, 4, e4);
                    try {
                        ((x) this.g).c(2, e4);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f2432f;
                f.f fVar = (f.f) this.g;
                b3.d dVar = new b3.d(1);
                p pVar2 = lVar.g;
                synchronized (pVar2.B) {
                    synchronized (pVar2) {
                        try {
                            f.f fVar2 = pVar2.f2456v;
                            f.f fVar3 = new f.f(3);
                            fVar3.e(fVar2);
                            fVar3.e(fVar);
                            dVar.g = fVar3;
                            b2 = fVar3.b() - fVar2.b();
                            i4 = 0;
                            if (b2 != 0 && !pVar2.g.isEmpty()) {
                                xVarArr = (x[]) pVar2.g.values().toArray(new x[0]);
                                xVarArr2 = xVarArr;
                                f.f fVar4 = (f.f) dVar.g;
                                u2.c.e(fVar4, "<set-?>");
                                pVar2.f2456v = fVar4;
                                pVar2.f2449o.c(new j(pVar2.h + " onSettings", pVar2, dVar, i4), 0L);
                            }
                            xVarArr = null;
                            xVarArr2 = xVarArr;
                            f.f fVar42 = (f.f) dVar.g;
                            u2.c.e(fVar42, "<set-?>");
                            pVar2.f2456v = fVar42;
                            pVar2.f2449o.c(new j(pVar2.h + " onSettings", pVar2, dVar, i4), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        pVar2.B.m((f.f) dVar.g);
                    } catch (IOException e5) {
                        pVar2.m(2, 2, e5);
                    }
                }
                if (xVarArr2 != null) {
                    int length = xVarArr2.length;
                    while (i4 < length) {
                        x xVar = xVarArr2[i4];
                        synchronized (xVar) {
                            xVar.f2483f += b2;
                            if (b2 > 0) {
                                xVar.notifyAll();
                            }
                        }
                        i4++;
                    }
                }
                return -1L;
        }
    }
}
