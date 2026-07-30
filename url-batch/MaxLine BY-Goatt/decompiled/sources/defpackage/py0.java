package defpackage;

import java.io.IOException;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class py0 extends it2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py0(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.it2
    public final long a() {
        int i;
        long a;
        cz0[] cz0VarArr;
        switch (this.e) {
            case 0:
                vy0 vy0Var = (vy0) this.f;
                vy0Var.m.a(vy0Var, (tj2) ((c82) this.g).m);
                return -1L;
            case 1:
                try {
                    ((vy0) this.f).m.b((cz0) this.g);
                } catch (IOException e) {
                    r12 r12Var = r12.a;
                    r12 r12Var2 = r12.a;
                    String str = "Http2Connection.Listener failure for " + ((vy0) this.f).o;
                    r12Var2.getClass();
                    r12.i(str, 4, e);
                    try {
                        ((cz0) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                sk skVar = (sk) this.f;
                tj2 tj2Var = (tj2) this.g;
                c82 c82Var = new c82();
                vy0 vy0Var2 = (vy0) skVar.o;
                synchronized (vy0Var2.I) {
                    synchronized (vy0Var2) {
                        try {
                            tj2 tj2Var2 = vy0Var2.C;
                            tj2 tj2Var3 = new tj2();
                            tj2Var2.getClass();
                            i = 0;
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & tj2Var2.a) != 0) {
                                    tj2Var3.b(i2, tj2Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & tj2Var.a) != 0) {
                                    tj2Var3.b(i3, tj2Var.b[i3]);
                                }
                            }
                            c82Var.m = tj2Var3;
                            a = tj2Var3.a() - tj2Var2.a();
                            if (a != 0 && !vy0Var2.n.isEmpty()) {
                                cz0VarArr = (cz0[]) vy0Var2.n.values().toArray(new cz0[0]);
                                tj2 tj2Var4 = (tj2) c82Var.m;
                                tj2Var4.getClass();
                                vy0Var2.C = tj2Var4;
                                vy0Var2.v.c(new py0(vy0Var2.o + " onSettings", vy0Var2, c82Var, i), 0L);
                                Unit unit = Unit.a;
                            }
                            cz0VarArr = null;
                            tj2 tj2Var42 = (tj2) c82Var.m;
                            tj2Var42.getClass();
                            vy0Var2.C = tj2Var42;
                            vy0Var2.v.c(new py0(vy0Var2.o + " onSettings", vy0Var2, c82Var, i), 0L);
                            Unit unit2 = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        vy0Var2.I.b((tj2) c82Var.m);
                    } catch (IOException e2) {
                        vy0Var2.b(2, 2, e2);
                    }
                    Unit unit3 = Unit.a;
                }
                if (cz0VarArr != null) {
                    int length = cz0VarArr.length;
                    while (i < length) {
                        cz0 cz0Var = cz0VarArr[i];
                        synchronized (cz0Var) {
                            cz0Var.f += a;
                            if (a > 0) {
                                cz0Var.notifyAll();
                            }
                            Unit unit4 = Unit.a;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
