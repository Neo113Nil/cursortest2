package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cq extends h80 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.h80
    public final long a() {
        long a;
        qq[] qqVarArr;
        switch (this.e) {
            case 0:
                jq jqVar = (jq) this.f;
                jqVar.f.a(jqVar, (b50) ((t20) this.g).g);
                return -1L;
            case 1:
                try {
                    ((jq) this.f).f.b((qq) this.g);
                } catch (IOException e) {
                    zz zzVar = zz.a;
                    zz zzVar2 = zz.a;
                    String str = "Http2Connection.Listener failure for " + ((jq) this.f).h;
                    zzVar2.getClass();
                    zz.i(str, 4, e);
                    try {
                        ((qq) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                eq eqVar = (eq) this.f;
                b50 b50Var = (b50) this.g;
                int i = 0;
                t20 t20Var = new t20(0);
                jq jqVar2 = eqVar.g;
                synchronized (jqVar2.B) {
                    synchronized (jqVar2) {
                        try {
                            b50 b50Var2 = jqVar2.v;
                            b50 b50Var3 = new b50();
                            b50Var2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & b50Var2.a) != 0) {
                                    b50Var3.b(i2, b50Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & b50Var.a) != 0) {
                                    b50Var3.b(i3, b50Var.b[i3]);
                                }
                            }
                            t20Var.g = b50Var3;
                            a = b50Var3.a() - b50Var2.a();
                            if (a != 0 && !jqVar2.g.isEmpty()) {
                                qqVarArr = (qq[]) jqVar2.g.values().toArray(new qq[0]);
                                b50 b50Var4 = (b50) t20Var.g;
                                b50Var4.getClass();
                                jqVar2.v = b50Var4;
                                jqVar2.o.c(new cq(jqVar2.h + " onSettings", jqVar2, t20Var, i), 0L);
                            }
                            qqVarArr = null;
                            b50 b50Var42 = (b50) t20Var.g;
                            b50Var42.getClass();
                            jqVar2.v = b50Var42;
                            jqVar2.o.c(new cq(jqVar2.h + " onSettings", jqVar2, t20Var, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        jqVar2.B.f((b50) t20Var.g);
                    } catch (IOException e2) {
                        jqVar2.f(2, 2, e2);
                    }
                }
                if (qqVarArr != null) {
                    int length = qqVarArr.length;
                    while (i < length) {
                        qq qqVar = qqVarArr[i];
                        synchronized (qqVar) {
                            qqVar.f += a;
                            if (a > 0) {
                                qqVar.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
