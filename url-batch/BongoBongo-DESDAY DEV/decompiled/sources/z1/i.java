package z1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends v1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f4446e = i;
        this.f4447f = obj;
        this.f4448g = obj2;
    }

    @Override // v1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f4446e) {
            case 0:
                o oVar = (o) this.f4447f;
                oVar.f4466a.a(oVar, (I.i) ((h1.g) this.f4448g).f2650b);
                return -1L;
            case 1:
                try {
                    ((o) this.f4447f).f4466a.b((w) this.f4448g);
                    return -1L;
                } catch (IOException e2) {
                    A1.o oVar2 = A1.o.f39a;
                    A1.o oVar3 = A1.o.f39a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f4447f).f4468c;
                    oVar3.getClass();
                    A1.o.i(str, 4, e2);
                    try {
                        ((w) this.f4448g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f4447f;
                I.i iVar = (I.i) this.f4448g;
                kVar.getClass();
                h1.g gVar = new h1.g(0);
                o oVar4 = kVar.f4454b;
                synchronized (oVar4.f4486w) {
                    synchronized (oVar4) {
                        try {
                            I.i iVar2 = oVar4.f4480q;
                            I.i iVar3 = new I.i();
                            iVar3.e(iVar2);
                            iVar3.e(iVar);
                            gVar.f2650b = iVar3;
                            c2 = iVar3.c() - iVar2.c();
                            if (c2 != 0 && !oVar4.f4467b.isEmpty()) {
                                wVarArr = (w[]) oVar4.f4467b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                I.i iVar4 = (I.i) gVar.f2650b;
                                h1.d.e(iVar4, "<set-?>");
                                oVar4.f4480q = iVar4;
                                oVar4.f4473j.c(new i(oVar4.f4468c + " onSettings", oVar4, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            I.i iVar42 = (I.i) gVar.f2650b;
                            h1.d.e(iVar42, "<set-?>");
                            oVar4.f4480q = iVar42;
                            oVar4.f4473j.c(new i(oVar4.f4468c + " onSettings", oVar4, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar4.f4486w.g((I.i) gVar.f2650b);
                    } catch (IOException e3) {
                        oVar4.g(2, 2, e3);
                    }
                }
                if (wVarArr2 == null) {
                    return -1L;
                }
                int length = wVarArr2.length;
                while (i < length) {
                    w wVar = wVarArr2[i];
                    synchronized (wVar) {
                        wVar.f4517f += c2;
                        if (c2 > 0) {
                            wVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
