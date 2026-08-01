package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class go extends k50 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.k50
    public final long a() {
        long b;
        uo[] uoVarArr;
        switch (this.e) {
            case 0:
                no noVar = (no) this.f;
                noVar.f.a(noVar, (v2) ((f00) this.g).g);
                return -1L;
            case 1:
                try {
                    ((no) this.f).f.b((uo) this.g);
                } catch (IOException e) {
                    jx jxVar = jx.a;
                    jx jxVar2 = jx.a;
                    String str = "Http2Connection.Listener failure for " + ((no) this.f).h;
                    jxVar2.getClass();
                    jx.i(str, 4, e);
                    try {
                        ((uo) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                io ioVar = (io) this.f;
                v2 v2Var = (v2) this.g;
                int i = 0;
                f00 f00Var = new f00(0);
                no noVar2 = ioVar.g;
                synchronized (noVar2.B) {
                    synchronized (noVar2) {
                        try {
                            v2 v2Var2 = noVar2.v;
                            v2 v2Var3 = new v2(3);
                            v2Var2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & v2Var2.a) != 0) {
                                    v2Var3.d(i2, ((int[]) v2Var2.b)[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & v2Var.a) != 0) {
                                    v2Var3.d(i3, ((int[]) v2Var.b)[i3]);
                                }
                            }
                            f00Var.g = v2Var3;
                            b = v2Var3.b() - v2Var2.b();
                            if (b != 0 && !noVar2.g.isEmpty()) {
                                uoVarArr = (uo[]) noVar2.g.values().toArray(new uo[0]);
                                v2 v2Var4 = (v2) f00Var.g;
                                v2Var4.getClass();
                                noVar2.v = v2Var4;
                                noVar2.o.c(new go(noVar2.h + " onSettings", noVar2, f00Var, i), 0L);
                            }
                            uoVarArr = null;
                            v2 v2Var42 = (v2) f00Var.g;
                            v2Var42.getClass();
                            noVar2.v = v2Var42;
                            noVar2.o.c(new go(noVar2.h + " onSettings", noVar2, f00Var, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        noVar2.B.m((v2) f00Var.g);
                    } catch (IOException e2) {
                        noVar2.m(2, 2, e2);
                    }
                }
                if (uoVarArr != null) {
                    int length = uoVarArr.length;
                    while (i < length) {
                        uo uoVar = uoVarArr[i];
                        synchronized (uoVar) {
                            uoVar.f += b;
                            if (b > 0) {
                                uoVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
