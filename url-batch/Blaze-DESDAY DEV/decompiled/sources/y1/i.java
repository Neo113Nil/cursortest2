package y1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends u1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f4249e = i;
        this.f4250f = obj;
        this.f4251g = obj2;
    }

    @Override // u1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f4249e) {
            case 0:
                o oVar = (o) this.f4250f;
                oVar.f4267a.a(oVar, (H.j) ((g1.g) this.f4251g).f2551b);
                return -1L;
            case 1:
                try {
                    ((o) this.f4250f).f4267a.b((w) this.f4251g);
                    return -1L;
                } catch (IOException e2) {
                    z1.n nVar = z1.n.f4366a;
                    z1.n nVar2 = z1.n.f4366a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f4250f).f4269c;
                    nVar2.getClass();
                    z1.n.i(str, 4, e2);
                    try {
                        ((w) this.f4251g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f4250f;
                H.j jVar = (H.j) this.f4251g;
                kVar.getClass();
                g1.g gVar = new g1.g(0);
                o oVar2 = kVar.f4256b;
                synchronized (oVar2.f4286w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f4280q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            gVar.f2551b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f4268b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f4268b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f2551b;
                                g1.d.e(jVar4, "<set-?>");
                                oVar2.f4280q = jVar4;
                                oVar2.f4273j.c(new i(oVar2.f4269c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f2551b;
                            g1.d.e(jVar42, "<set-?>");
                            oVar2.f4280q = jVar42;
                            oVar2.f4273j.c(new i(oVar2.f4269c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f4286w.g((H.j) gVar.f2551b);
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
                        wVar.f4316f += c2;
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
