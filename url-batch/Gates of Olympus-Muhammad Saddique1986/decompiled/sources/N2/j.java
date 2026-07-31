package N2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends J2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i3) {
        super(str, true);
        this.f3618e = i3;
        this.f3619f = obj;
        this.f3620g = obj2;
    }

    @Override // J2.a
    public final long a() {
        long a3;
        x[] xVarArr;
        x[] xVarArr2;
        int i3 = 0;
        switch (this.f3618e) {
            case 0:
                p pVar = (p) this.f3619f;
                pVar.f3640d.a(pVar, (C) ((f2.u) this.f3620g).f5832d);
                return -1L;
            case 1:
                try {
                    ((p) this.f3619f).f3640d.b((x) this.f3620g);
                    return -1L;
                } catch (IOException e3) {
                    O2.n nVar = O2.n.f3910a;
                    O2.n nVar2 = O2.n.f3910a;
                    String str = "Http2Connection.Listener failure for " + ((p) this.f3619f).f3642f;
                    nVar2.getClass();
                    O2.n.i(str, 4, e3);
                    try {
                        ((x) this.f3620g).c(2, e3);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            default:
                l lVar = (l) this.f3619f;
                C c2 = (C) this.f3620g;
                lVar.getClass();
                f2.u uVar = new f2.u();
                p pVar2 = (p) lVar.f3627f;
                synchronized (pVar2.f3662z) {
                    synchronized (pVar2) {
                        try {
                            C c3 = pVar2.f3656t;
                            C c4 = new C();
                            c4.b(c3);
                            c4.b(c2);
                            uVar.f5832d = c4;
                            a3 = c4.a() - c3.a();
                            if (a3 != 0 && !pVar2.f3641e.isEmpty()) {
                                xVarArr = (x[]) pVar2.f3641e.values().toArray(new x[0]);
                                xVarArr2 = xVarArr;
                                C c5 = (C) uVar.f5832d;
                                f2.j.f(c5, "<set-?>");
                                pVar2.f3656t = c5;
                                pVar2.f3649m.c(new j(pVar2.f3642f + " onSettings", pVar2, uVar, i3), 0L);
                            }
                            xVarArr = null;
                            xVarArr2 = xVarArr;
                            C c52 = (C) uVar.f5832d;
                            f2.j.f(c52, "<set-?>");
                            pVar2.f3656t = c52;
                            pVar2.f3649m.c(new j(pVar2.f3642f + " onSettings", pVar2, uVar, i3), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        pVar2.f3662z.a((C) uVar.f5832d);
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
                        xVar.f3697f += a3;
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
