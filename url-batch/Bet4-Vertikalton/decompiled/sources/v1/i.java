package v1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends r1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4079g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f4077e = i;
        this.f4078f = obj;
        this.f4079g = obj2;
    }

    @Override // r1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f4077e) {
            case 0:
                o oVar = (o) this.f4078f;
                oVar.f4095a.a(oVar, (H.j) ((d1.g) this.f4079g).f2019b);
                return -1L;
            case 1:
                try {
                    ((o) this.f4078f).f4095a.b((w) this.f4079g);
                    return -1L;
                } catch (IOException e2) {
                    w1.n nVar = w1.n.f4190a;
                    w1.n nVar2 = w1.n.f4190a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f4078f).f4097c;
                    nVar2.getClass();
                    w1.n.i(str, 4, e2);
                    try {
                        ((w) this.f4079g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f4078f;
                H.j jVar = (H.j) this.f4079g;
                kVar.getClass();
                d1.g gVar = new d1.g(0);
                o oVar2 = kVar.f4084b;
                synchronized (oVar2.f4114w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f4108q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            gVar.f2019b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f4096b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f4096b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f2019b;
                                d1.d.e(jVar4, "<set-?>");
                                oVar2.f4108q = jVar4;
                                oVar2.f4101j.c(new i(oVar2.f4097c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f2019b;
                            d1.d.e(jVar42, "<set-?>");
                            oVar2.f4108q = jVar42;
                            oVar2.f4101j.c(new i(oVar2.f4097c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f4114w.g((H.j) gVar.f2019b);
                    } catch (IOException e3) {
                        oVar2.g(2, 2, e3);
                    }
                }
                if (wVarArr2 == null) {
                    return -1L;
                }
                int length = wVarArr2.length;
                while (i < length) {
                    w wVar = wVarArr2[i];
                    synchronized (wVar) {
                        wVar.f4144f += c2;
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
