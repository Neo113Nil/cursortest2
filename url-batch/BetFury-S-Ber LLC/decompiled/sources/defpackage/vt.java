package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vt extends gh0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.gh0
    public final long a() {
        int i;
        long a;
        ku[] kuVarArr;
        switch (this.e) {
            case 0:
                du duVar = (du) this.f;
                duVar.f.a(duVar, (cd0) ((a90) this.g).f);
                return -1L;
            case 1:
                try {
                    ((du) this.f).f.b((ku) this.g);
                } catch (IOException e) {
                    q50 q50Var = q50.a;
                    q50 q50Var2 = q50.a;
                    String str = "Http2Connection.Listener failure for " + ((du) this.f).h;
                    q50Var2.getClass();
                    q50.i(str, 4, e);
                    try {
                        ((ku) this.g).c(kn.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                xt xtVar = (xt) this.f;
                cd0 cd0Var = (cd0) this.g;
                a90 a90Var = new a90();
                du duVar2 = xtVar.g;
                synchronized (duVar2.B) {
                    synchronized (duVar2) {
                        try {
                            cd0 cd0Var2 = duVar2.v;
                            cd0 cd0Var3 = new cd0();
                            cd0Var2.getClass();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & cd0Var2.a) != 0) {
                                    cd0Var3.b(i2, cd0Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & cd0Var.a) != 0) {
                                    cd0Var3.b(i3, cd0Var.b[i3]);
                                }
                            }
                            a90Var.f = cd0Var3;
                            a = cd0Var3.a() - cd0Var2.a();
                            if (a != 0 && !duVar2.g.isEmpty()) {
                                kuVarArr = (ku[]) duVar2.g.values().toArray(new ku[0]);
                                cd0 cd0Var4 = (cd0) a90Var.f;
                                cd0Var4.getClass();
                                duVar2.v = cd0Var4;
                                duVar2.o.c(new vt(duVar2.h + " onSettings", duVar2, a90Var, i), 0L);
                            }
                            kuVarArr = null;
                            cd0 cd0Var42 = (cd0) a90Var.f;
                            cd0Var42.getClass();
                            duVar2.v = cd0Var42;
                            duVar2.o.c(new vt(duVar2.h + " onSettings", duVar2, a90Var, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        duVar2.B.i((cd0) a90Var.f);
                    } catch (IOException e2) {
                        duVar2.n(e2);
                    }
                }
                if (kuVarArr != null) {
                    int length = kuVarArr.length;
                    while (i < length) {
                        ku kuVar = kuVarArr[i];
                        synchronized (kuVar) {
                            kuVar.f += a;
                            if (a > 0) {
                                kuVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
