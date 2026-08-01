package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends l1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3798g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f3796e = i;
        this.f3797f = obj;
        this.f3798g = obj2;
    }

    @Override // l1.a
    public final long a() {
        long c2;
        w[] wVarArr;
        w[] wVarArr2;
        int i = 0;
        switch (this.f3796e) {
            case 0:
                o oVar = (o) this.f3797f;
                oVar.f3814a.a(oVar, (H.j) ((X0.i) this.f3798g).f874b);
                return -1L;
            case 1:
                try {
                    ((o) this.f3797f).f3814a.b((w) this.f3798g);
                    return -1L;
                } catch (IOException e2) {
                    q1.n nVar = q1.n.f3960a;
                    q1.n nVar2 = q1.n.f3960a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f3797f).f3816c;
                    nVar2.getClass();
                    q1.n.i(str, 4, e2);
                    try {
                        ((w) this.f3798g).c(2, e2);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                k kVar = (k) this.f3797f;
                H.j jVar = (H.j) this.f3798g;
                kVar.getClass();
                X0.i iVar = new X0.i(0);
                o oVar2 = kVar.f3803b;
                synchronized (oVar2.f3834w) {
                    synchronized (oVar2) {
                        try {
                            H.j jVar2 = oVar2.f3828q;
                            H.j jVar3 = new H.j();
                            jVar3.e(jVar2);
                            jVar3.e(jVar);
                            iVar.f874b = jVar3;
                            c2 = jVar3.c() - jVar2.c();
                            if (c2 != 0 && !oVar2.f3815b.isEmpty()) {
                                wVarArr = (w[]) oVar2.f3815b.values().toArray(new w[0]);
                                wVarArr2 = wVarArr;
                                H.j jVar4 = (H.j) iVar.f874b;
                                X0.f.e(jVar4, "<set-?>");
                                oVar2.f3828q = jVar4;
                                oVar2.f3821j.c(new i(oVar2.f3816c + " onSettings", oVar2, iVar, i), 0L);
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            H.j jVar42 = (H.j) iVar.f874b;
                            X0.f.e(jVar42, "<set-?>");
                            oVar2.f3828q = jVar42;
                            oVar2.f3821j.c(new i(oVar2.f3816c + " onSettings", oVar2, iVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f3834w.g((H.j) iVar.f874b);
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
                        wVar.f3870f += c2;
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
