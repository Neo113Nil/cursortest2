package w1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends s1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4107g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f4105e = i;
        this.f4106f = obj;
        this.f4107g = obj2;
    }

    @Override // s1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f4105e) {
            case 0:
                o oVar = (o) this.f4106f;
                oVar.f4123a.a(oVar, (H.j) ((e1.g) this.f4107g).f2055b);
                return -1L;
            case 1:
                try {
                    ((o) this.f4106f).f4123a.b((w) this.f4107g);
                    return -1L;
                } catch (IOException e2) {
                    x1.n nVar = x1.n.f4286a;
                    x1.n nVar2 = x1.n.f4286a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f4106f).f4125c;
                    nVar2.getClass();
                    x1.n.i(str, 4, e2);
                    try {
                        ((w) this.f4107g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f4106f;
                H.j jVar = (H.j) this.f4107g;
                kVar.getClass();
                e1.g gVar = new e1.g(0);
                o oVar2 = kVar.f4112b;
                synchronized (oVar2.f4142w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f4136q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            gVar.f2055b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f4124b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f4124b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) gVar.f2055b;
                                e1.d.e(jVar4, "<set-?>");
                                oVar2.f4136q = jVar4;
                                oVar2.f4129j.c(new i(oVar2.f4125c + " onSettings", oVar2, gVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) gVar.f2055b;
                            e1.d.e(jVar42, "<set-?>");
                            oVar2.f4136q = jVar42;
                            oVar2.f4129j.c(new i(oVar2.f4125c + " onSettings", oVar2, gVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f4142w.g((H.j) gVar.f2055b);
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
                        wVar.f4172f += c2;
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
