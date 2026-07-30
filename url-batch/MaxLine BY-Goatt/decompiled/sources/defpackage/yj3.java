package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yj3 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ mk3 q;

    public /* synthetic */ yj3(mk3 mk3Var, String str, String str2, String str3, int i) {
        this.m = i;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = mk3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.m;
        String str = this.p;
        String str2 = this.o;
        String str3 = this.n;
        mk3 mk3Var = this.q;
        switch (i) {
            case 0:
                mk3Var.g.B();
                tc3 tc3Var = mk3Var.g.o;
                oq3.U(tc3Var);
                return tc3Var.s0(str3, str2, str);
            case 1:
                mk3Var.g.B();
                tc3 tc3Var2 = mk3Var.g.o;
                oq3.U(tc3Var2);
                return tc3Var2.s0(str3, str2, str);
            case 2:
                mk3Var.g.B();
                tc3 tc3Var3 = mk3Var.g.o;
                oq3.U(tc3Var3);
                return tc3Var3.w0(str3, str2, str);
            default:
                mk3Var.g.B();
                tc3 tc3Var4 = mk3Var.g.o;
                oq3.U(tc3Var4);
                return tc3Var4.w0(str3, str2, str);
        }
    }
}
