package y1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f4220e = i;
        this.f4221f = obj;
        this.f4222g = obj2;
    }

    @Override // u1.a
    public final long a() {
        long f2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f4220e) {
            case 0:
                o oVar = (o) this.f4221f;
                oVar.f4238a.a(oVar, (J.i) ((g1.g) this.f4222g).f2365b);
                return -1L;
            case 1:
                try {
                    ((o) this.f4221f).f4238a.b((w) this.f4222g);
                    return -1L;
                } catch (IOException e2) {
                    z1.o oVar2 = z1.o.f4365a;
                    z1.o oVar3 = z1.o.f4365a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f4221f).f4240c;
                    oVar3.getClass();
                    z1.o.i(str, 4, e2);
                    try {
                        ((w) this.f4222g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f4221f;
                J.i iVar = (J.i) this.f4222g;
                kVar.getClass();
                g1.g gVar = new g1.g(0);
                o oVar4 = kVar.f4227b;
                synchronized (oVar4.f4257w) {
                    synchronized (oVar4) {
                        try {
                            J.i iVar2 = oVar4.f4251q;
                            J.i iVar3 = new J.i();
                            iVar3.h(iVar2);
                            iVar3.h(iVar);
                            gVar.f2365b = iVar3;
                            f2 = iVar3.f() - iVar2.f();
                            if (f2 != 0 && !oVar4.f4239b.isEmpty()) {
                                wVarArr = (w[]) oVar4.f4239b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                J.i iVar4 = (J.i) gVar.f2365b;
                                g1.d.e(iVar4, "<set-?>");
                                oVar4.f4251q = iVar4;
                                oVar4.f4244j.c(new i(oVar4.f4240c + " onSettings", oVar4, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            J.i iVar42 = (J.i) gVar.f2365b;
                            g1.d.e(iVar42, "<set-?>");
                            oVar4.f4251q = iVar42;
                            oVar4.f4244j.c(new i(oVar4.f4240c + " onSettings", oVar4, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar4.f4257w.g((J.i) gVar.f2365b);
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
                        wVar.f4287f += f2;
                        if (f2 > 0) {
                            wVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
