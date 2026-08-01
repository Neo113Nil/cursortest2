package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3404e = i;
        this.f3405f = obj;
        this.f3406g = obj2;
    }

    @Override // l1.a
    public final long a() {
        long b2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3404e) {
            case 0:
                o oVar = (o) this.f3405f;
                oVar.f3422a.a(oVar, (H.j) ((X0.h) this.f3406g).f1014b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3405f).f3422a.b((w) this.f3406g);
                    return -1L;
                } catch (IOException e2) {
                    q1.n nVar = q1.n.f3549a;
                    q1.n nVar2 = q1.n.f3549a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3405f).f3424c;
                    nVar2.getClass();
                    q1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3406g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3405f;
                H.j jVar = (H.j) this.f3406g;
                kVar.getClass();
                X0.h hVar = new X0.h(0);
                o oVar2 = kVar.f3411b;
                synchronized (oVar2.f3441w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3435q;
                            H.j jVar3 = new H.j();
                            jVar3.d(jVar2);
                            jVar3.d(jVar);
                            hVar.f1014b = jVar3;
                            b2 = jVar3.b() - jVar2.b();
                            if (b2 != 0 && !oVar2.f3423b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3423b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) hVar.f1014b;
                                X0.e.e(jVar4, "<set-?>");
                                oVar2.f3435q = jVar4;
                                oVar2.f3428j.c(new i(oVar2.f3424c + " onSettings", oVar2, hVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) hVar.f1014b;
                            X0.e.e(jVar42, "<set-?>");
                            oVar2.f3435q = jVar42;
                            oVar2.f3428j.c(new i(oVar2.f3424c + " onSettings", oVar2, hVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3441w.e((H.j) hVar.f1014b);
                    } catch (IOException e3) {
                        oVar2.e(2, 2, e3);
                    }
                }
                if (wVarArr2 == null) {
                    return -1L;
                }
                int length = wVarArr2.length;
                while (i < length) {
                    w wVar = wVarArr2[i];
                    synchronized (wVar) {
                        wVar.f3471f += b2;
                        if (b2 > 0) {
                            wVar.notifyAll();
                        }
                    }
                    i++;
                }
                return -1L;
        }
    }
}
