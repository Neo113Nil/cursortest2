package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qn extends d50 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.d50
    public final long a() {
        long f;
        fo[] foVarArr;
        switch (this.e) {
            case 0:
                xn xnVar = (xn) this.f;
                xnVar.f.a(xnVar, (or) ((qz) this.g).g);
                return -1L;
            case 1:
                try {
                    ((xn) this.f).f.b((fo) this.g);
                } catch (IOException e) {
                    ww wwVar = ww.a;
                    ww wwVar2 = ww.a;
                    String str = "Http2Connection.Listener failure for " + ((xn) this.f).h;
                    wwVar2.getClass();
                    ww.i(str, 4, e);
                    try {
                        ((fo) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                sn snVar = (sn) this.f;
                or orVar = (or) this.g;
                int i = 0;
                qz qzVar = new qz(0);
                xn xnVar2 = snVar.g;
                synchronized (xnVar2.B) {
                    synchronized (xnVar2) {
                        try {
                            or orVar2 = xnVar2.v;
                            or orVar3 = new or(5);
                            orVar2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & orVar2.f) != 0) {
                                    orVar3.k(i2, ((int[]) orVar2.g)[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & orVar.f) != 0) {
                                    orVar3.k(i3, ((int[]) orVar.g)[i3]);
                                }
                            }
                            qzVar.g = orVar3;
                            f = orVar3.f() - orVar2.f();
                            if (f != 0 && !xnVar2.g.isEmpty()) {
                                foVarArr = (fo[]) xnVar2.g.values().toArray(new fo[0]);
                                or orVar4 = (or) qzVar.g;
                                orVar4.getClass();
                                xnVar2.v = orVar4;
                                xnVar2.o.c(new qn(xnVar2.h + " onSettings", xnVar2, qzVar, i), 0L);
                            }
                            foVarArr = null;
                            or orVar42 = (or) qzVar.g;
                            orVar42.getClass();
                            xnVar2.v = orVar42;
                            xnVar2.o.c(new qn(xnVar2.h + " onSettings", xnVar2, qzVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        xnVar2.B.m((or) qzVar.g);
                    } catch (IOException e2) {
                        xnVar2.m(2, 2, e2);
                    }
                }
                if (foVarArr != null) {
                    int length = foVarArr.length;
                    while (i < length) {
                        fo foVar = foVarArr[i];
                        synchronized (foVar) {
                            foVar.f += f;
                            if (f > 0) {
                                foVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
